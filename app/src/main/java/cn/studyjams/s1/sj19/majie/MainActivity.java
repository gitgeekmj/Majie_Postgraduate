package cn.studyjams.s1.sj19.majie;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
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
        //建立数据库对象 版本1
        dbHelper = new MyDatabaseHelper(this, "Study.db", null, 1);
        //创建数据库
        dbHelper.getWritableDatabase();
        //数据库添加数据
        addDatabase();
        //播放背景音乐按钮
        playMusic = (ImageButton) findViewById(R.id.encourageMusic);
        //专业挑选按钮
        chooseDiscipline = (Button) findViewById(R.id.chooseDiscipline_button);
        //时间规划按钮
        timePlanning = (Button) findViewById(R.id.timePlanning_button);
        //书籍推荐按钮
        bookRecommend = (Button) findViewById(R.id.bookRecommend_button);
        //目标选择按钮
        chooseTarget = (Button) findViewById(R.id.chooseTarget_button);
        //生活贴士按钮
        lifeTips = (Button) findViewById(R.id.lifeTips_buton);
        //备考技巧按钮
        encouragement = (Button) findViewById(R.id.encouragement_button);
        //以上按钮的监听器
        chooseDiscipline.setOnClickListener(this);
        timePlanning.setOnClickListener(this);
        bookRecommend.setOnClickListener(this);
        chooseTarget.setOnClickListener(this);
        lifeTips.setOnClickListener(this);
        encouragement.setOnClickListener(this);
        //跳转音乐播放界面  使用 intent
        playMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_music = new Intent(MainActivity.this, EncouageMusic.class);
                startActivity(intent_music);
            }
        });
    }

    public void addDatabase() {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        //开始组装第一条数据
        values.put("direction", "b");
        values.put("major1", "1");
        values.put("major2", "2");
        values.put("major3", "3");
        //开始插入第一条数据
        db.insert("Research", null, values);
        values.clear();
        //开始组装第二条数据
        values.put("direction", "c");
        values.put("major1", "4");
        values.put("major2", "5");
        values.put("major3", "6");
        //开始插入第二条数据
        db.insert("Research", null, values);
        values.clear();
        //开始组装第三条数据
        values.put("direction", "d");
        values.put("major1", "7");
        values.put("major2", "8");
        values.put("major3", "9");
        //开始插入第三条数据
        db.insert("Research", null, values);
        values.clear();
        values.put("major", "1");
        values.put("trait", "a");
        db.insert("Major", null, values);
        values.clear();
        values.put("major", "2");
        values.put("trait", "b");
        db.insert("Major", null, values);
        values.clear();
        values.put("major", "3");
        values.put("trait", "c");
        db.insert("Major", null, values);
        values.clear();
        values.put("major", "4");
        values.put("trait", "e");
        db.insert("Major", null, values);
        values.clear();
        values.put("major", "5");
        values.put("trait", "f");
        db.insert("Major", null, values);
        values.clear();
        values.put("major", "6");
        values.put("trait", "g");
        db.insert("Major", null, values);
        values.clear();
        values.put("major", "7");
        values.put("trait", "h");
        db.insert("Major", null, values);
        values.clear();
        values.put("major", "8");
        values.put("trait", "i");
        db.insert("Major", null, values);
        values.clear();
        values.put("major", "9");
        values.put("trait", "j");
        db.insert("Major", null, values);
        values.clear();
        //开始组装Work表数据
        values.put("direction", "e");
        values.put("major1", "1");
        values.put("major2", "2");
        values.put("major3", "3");
        //开始插入第二条数据
        db.insert("Work", null, values);
        values.clear();
        values.put("direction", "f");
        values.put("major1", "4");
        values.put("major2", "5");
        values.put("major3", "6");
        db.insert("Work", null, values);
        values.clear();
        values.put("direction", "g");
        values.put("major1", "7");
        values.put("major2", "8");
        values.put("major3", "9");
        db.insert("Work", null, values);
    }

    /**
     * @param view 各个按钮的点击事件
     */
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
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
