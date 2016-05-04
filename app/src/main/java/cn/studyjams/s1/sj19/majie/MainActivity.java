package cn.studyjams.s1.sj19.majie;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MyDatabaseHelper dbHelper;
    private ImageButton playMusic;
    private Button chooseDiscipline;
    private Button timePlanning;
    private Button bookRecommend;
    private Button chooseTarget;
    private Button lifeTips;
    private Button encouragement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        dbHelper = new MyDatabaseHelper(this, "Study.db", null, 1);
        dbHelper.getWritableDatabase();
        playMusic = (ImageButton) findViewById(R.id.encourageMusic);
        chooseDiscipline = (Button) findViewById(R.id.chooseDiscipline_button);
        timePlanning = (Button) findViewById(R.id.timePlanning_button);
        bookRecommend = (Button) findViewById(R.id.bookRecommend_button);
        chooseTarget = (Button) findViewById(R.id.chooseTarget_button);
        lifeTips = (Button) findViewById(R.id.lifeTips_buton);
        encouragement = (Button) findViewById(R.id.encouragement_button);
        playMusic.setOnClickListener(this);
        chooseDiscipline.setOnClickListener(this);
        timePlanning.setOnClickListener(this);
        bookRecommend.setOnClickListener(this);
        chooseTarget.setOnClickListener(this);
        lifeTips.setOnClickListener(this);
        encouragement.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.encourageMusic:
                Intent intent_music = new Intent(MainActivity.this,EncouageMusic.class);
                startActivity(intent_music);
                break;
            case R.id.chooseDiscipline_button:
                Intent intent_chooseDiscipline = new Intent(MainActivity.this, DisciplineActivity.class);
                startActivity(intent_chooseDiscipline);
                break;
            case R.id.timePlanning_button:
                String message_timePlanning;
                message_timePlanning = "        进行时间安排时，要结合自身习惯，不要盲目跟从身边或网上的经验帖。对自己每一个阶段都要有清晰的安排，让备考不成为负担。";
                TextView textView_timePlanning = (TextView) findViewById(R.id.explain_textview);
                textView_timePlanning.setText(message_timePlanning);
                break;
            case R.id.bookRecommend_button:
                Intent intent_bookRecommend = new Intent(Intent.ACTION_VIEW);
                intent_bookRecommend.setData(Uri.parse("http://bbs.kaoyan.com/t6141020p1"));
                startActivity(intent_bookRecommend);
                break;
            case R.id.chooseTarget_button:
                Intent intent_chooseTarget = new Intent(MainActivity.this, DefineTarget.class);
                startActivity(intent_chooseTarget);
                break;
            case R.id.lifeTips_buton:
                String message_lifeTips;
                message_lifeTips = "        根据自己的身体情况安排好自己的饮食、运动、娱乐。可以进行每周更换制，动态的调整自己的作息，让身体适应考研状态，让生活为考研加分。";
                TextView textView_lifeTips = (TextView) findViewById(R.id.explain_textview);
                textView_lifeTips.setText(message_lifeTips);
                break;
            case R.id.encouragement_button:
                Intent intent_encouragement = new Intent(Intent.ACTION_VIEW);
                intent_encouragement.setData(Uri.parse("https://www.zhihu.com/question/30642940/answer/48907444"));
                startActivity(intent_encouragement);
                break;

        }
    }
}
