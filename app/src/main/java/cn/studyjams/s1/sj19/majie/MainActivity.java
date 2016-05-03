package cn.studyjams.s1.sj19.majie;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private MyDatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        dbHelper = new MyDatabaseHelper(this, "Study.db", null, 1);
        dbHelper.getWritableDatabase();
    }

    public void chooseDiscipline(View view) {
        //String message;
        //message = "          选择专业时，应从自己的未来打算开始，是准备就业，还是准备从事研究工作。然后根据不同的方向，结合自己的兴趣选择。";
        //TextView textView = (TextView)findViewById(R.id.explain_textview);
        //textView.setText(message);
        Intent intent = new Intent(MainActivity.this, DisciplineActivity.class);
        startActivity(intent);
    }

    public void timePlanning(View view) {
        String message;
        message = "        进行时间安排时，要结合自身习惯，不要盲目跟从身边或网上的经验帖。对自己每一个阶段都要有清晰的安排，让备考不成为负担。";
        TextView textView = (TextView) findViewById(R.id.explain_textview);
        textView.setText(message);
    }

    public void bookRecommend(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://bbs.kaoyan.com/t6141020p1"));
        startActivity(intent);
    }

    public void chooseTarget(View view) {
        Intent intent = new Intent(MainActivity.this, DefineTarget.class);
        startActivity(intent);
    }

    public void lifeTips(View view) {
        String message;
        message = "        根据自己的身体情况安排好自己的饮食、运动、娱乐。可以进行每周更换制，动态的调整自己的作息，让身体适应考研状态，让生活为考研加分。";
        TextView textView = (TextView) findViewById(R.id.explain_textview);
        textView.setText(message);
    }

    public void encouragement(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.zhihu.com/question/30642940/answer/48907444"));
        startActivity(intent);
    }
}
