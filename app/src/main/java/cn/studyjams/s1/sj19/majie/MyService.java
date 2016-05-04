package cn.studyjams.s1.sj19.majie;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.Environment;
import android.os.IBinder;
import android.util.Log;

import java.io.File;

public class MyService extends Service {
    private MediaPlayer mediaPlayer = new MediaPlayer();
    private PlayMusicBinder musicBinder = new PlayMusicBinder();

    class PlayMusicBinder extends Binder {
        public void initMediaPlayer() {
            try {
                File file = new File(Environment.getExternalStorageDirectory(), "music.mp3");
                mediaPlayer.setDataSource(file.getPath());
                Log.e("bind","this2");
                mediaPlayer.prepare();
                Log.e("bind","this3");
            } catch (Exception e) {
                Log.e("bind","this5");
                e.printStackTrace();
            }
        }

        public void pauseMusic() {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.pause();
            }
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return musicBinder;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("bind","this1");
        musicBinder.initMediaPlayer();
        if (!mediaPlayer.isPlaying()) {
            Log.e("bind","this4");
            mediaPlayer.start();
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (!mediaPlayer.isPlaying()) {
            mediaPlayer.start();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }
}
