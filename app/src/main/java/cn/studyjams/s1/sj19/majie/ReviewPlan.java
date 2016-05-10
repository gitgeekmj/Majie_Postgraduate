package cn.studyjams.s1.sj19.majie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class ReviewPlan extends AppCompatActivity {
    //定义控件
    public static String Plan;
    TextView list_work01;
    TextView list_work02;
    TextView list_work03;
    TextView list_work04;
    TextView list_work05;
    TextView list_work06;
    TextView list_work07;
    TextView reivew_01;
    TextView reivew_02;
    TextView reivew_03;
    TextView reivew_04;
    TextView reivew_05;
    TextView reivew_06;
    TextView reivew_07;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_plan);
        list_work01 = (TextView) findViewById(R.id.list_work01);
        list_work02 = (TextView) findViewById(R.id.list_work02);
        list_work03 = (TextView) findViewById(R.id.list_work03);
        list_work04 = (TextView) findViewById(R.id.list_work04);
        list_work05 = (TextView) findViewById(R.id.list_work05);
        list_work06 = (TextView) findViewById(R.id.list_work06);
        list_work07 = (TextView) findViewById(R.id.list_work07);
        reivew_01 = (TextView) findViewById(R.id.reivew_01);
        reivew_02 = (TextView) findViewById(R.id.reivew_02);
        reivew_03 = (TextView) findViewById(R.id.reivew_03);
        reivew_04 = (TextView) findViewById(R.id.reivew_04);
        reivew_05 = (TextView) findViewById(R.id.reivew_05);
        reivew_06 = (TextView) findViewById(R.id.reivew_06);
        reivew_07 = (TextView) findViewById(R.id.reivew_07);
        Intent intent = getIntent();
        Plan = intent.getStringExtra("Plan");
        Log.e("Plan",Plan);
        switch (Plan){
            case "one":
                reivew_01.setText(R.string.textView_reviewTime8);
                reivew_02.setText(R.string.textView_reviewTime10);
                reivew_03.setText(R.string.textView_reviewTime12);
                reivew_04.setText(R.string.textView_reviewTime14);
                reivew_05.setText(R.string.textView_reviewTime16);
                reivew_06.setText(R.string.textView_reviewTime20);
                reivew_07.setText(R.string.textView_reviewTime21);
                list_work01.setText(R.string.textView_plan01work01);
                list_work02.setText(R.string.textView_plan01work02);
                list_work03.setText(R.string.textView_plan01work03);
                list_work04.setText(R.string.textView_plan01work04);
                list_work05.setText(R.string.textView_plan01work05);
                list_work06.setText(R.string.textView_plan01work06);
                list_work07.setText(R.string.textView_plan01work07);
                break;
            case "two":
                reivew_01.setText(R.string.textView_reviewTime8);
                reivew_02.setText(R.string.textView_reviewTime10);
                reivew_03.setText(R.string.textView_reviewTime12);
                reivew_04.setText(R.string.textView_reviewTime14);
                reivew_05.setText(R.string.textView_reviewTime16);
                reivew_06.setText(R.string.textView_reviewTime19);
                reivew_07.setText(R.string.textView_reviewTime22);
                list_work01.setText(R.string.textView_plan02work01);
                list_work02.setText(R.string.textView_plan02work02);
                list_work03.setText(R.string.textView_plan02work03);
                list_work04.setText(R.string.textView_plan02work04);
                list_work05.setText(R.string.textView_plan02work05);
                list_work06.setText(R.string.textView_plan02work06);
                list_work07.setText(R.string.textView_plan02work07);
                break;
            case "three":
                reivew_01.setText(R.string.textView_reviewTime8);
                reivew_02.setText(R.string.textView_reviewTime9);
                reivew_03.setText(R.string.textView_reviewTime12);
                reivew_04.setText(R.string.textView_reviewTime14);
                reivew_05.setText(R.string.textView_reviewTime18);
                reivew_06.setText(R.string.textView_reviewTime20);
                reivew_07.setText(R.string.textView_reviewTime22);
                list_work01.setText(R.string.textView_plan03work01);
                list_work02.setText(R.string.textView_plan03work02);
                list_work03.setText(R.string.textView_plan03work03);
                list_work04.setText(R.string.textView_plan03work04);
                list_work05.setText(R.string.textView_plan03work05);
                list_work06.setText(R.string.textView_plan03work06);
                list_work07.setText(R.string.textView_plan03work07);
                break;
            case "four":
                reivew_01.setText(R.string.textView_reviewTime9);
                reivew_02.setText(R.string.textView_reviewTime12);
                reivew_03.setText(R.string.textView_reviewTime13);
                reivew_04.setText(R.string.textView_reviewTime15);
                reivew_05.setText(R.string.textView_reviewTime18);
                reivew_06.setText(R.string.textView_reviewTime20);
                reivew_07.setText(R.string.textView_reviewTime23);
                list_work01.setText(R.string.textView_plan04work01);
                list_work02.setText(R.string.textView_plan04work02);
                list_work03.setText(R.string.textView_plan04work03);
                list_work04.setText(R.string.textView_plan04work04);
                list_work05.setText(R.string.textView_plan04work05);
                list_work06.setText(R.string.textView_plan04work06);
                list_work07.setText(R.string.textView_plan04work07);
                break;
            case "five":
                reivew_01.setText(R.string.textView_reviewTime9);
                reivew_02.setText(R.string.textView_reviewTime10);
                reivew_03.setText(R.string.textView_reviewTime12);
                reivew_04.setText(R.string.textView_reviewTime13);
                reivew_05.setText(R.string.textView_reviewTime15);
                reivew_06.setText(R.string.textView_reviewTime18);
                reivew_07.setText(R.string.textView_reviewTime22);
                list_work01.setText(R.string.textView_plan05work01);
                list_work02.setText(R.string.textView_plan05work02);
                list_work03.setText(R.string.textView_plan05work03);
                list_work04.setText(R.string.textView_plan05work04);
                list_work05.setText(R.string.textView_plan05work05);
                list_work06.setText(R.string.textView_plan05work06);
                list_work07.setText(R.string.textView_plan05work07);
                break;
            case "six":
                reivew_01.setText(R.string.textView_reviewTime9);
                reivew_02.setText(R.string.textView_reviewTime10);
                reivew_03.setText(R.string.textView_reviewTime12);
                reivew_04.setText(R.string.textView_reviewTime13);
                reivew_05.setText(R.string.textView_reviewTime15);
                reivew_06.setText(R.string.textView_reviewTime17);
                reivew_07.setText(R.string.textView_reviewTime20);
                list_work01.setText(R.string.textView_plan06work01);
                list_work02.setText(R.string.textView_plan06work02);
                list_work03.setText(R.string.textView_plan06work03);
                list_work04.setText(R.string.textView_plan06work04);
                list_work05.setText(R.string.textView_plan06work05);
                list_work06.setText(R.string.textView_plan06work06);
                list_work07.setText(R.string.textView_plan06work07);
                break;
            case "seven":
                reivew_01.setText(R.string.textView_reviewTime7);
                reivew_02.setText(R.string.textView_reviewTime9);
                reivew_03.setText(R.string.textView_reviewTime10);
                reivew_04.setText(R.string.textView_reviewTime12);
                reivew_05.setText(R.string.textView_reviewTime13);
                reivew_06.setText(R.string.textView_reviewTime18);
                reivew_07.setText(R.string.textView_reviewTime23);
                list_work01.setText(R.string.textView_plan07work01);
                list_work02.setText(R.string.textView_plan07work02);
                list_work03.setText(R.string.textView_plan07work03);
                list_work04.setText(R.string.textView_plan07work04);
                list_work05.setText(R.string.textView_plan07work05);
                list_work06.setText(R.string.textView_plan07work06);
                list_work07.setText(R.string.textView_plan07work07);
                break;
            case "eight":
                reivew_01.setText(R.string.textView_reviewTime7);
                reivew_02.setText(R.string.textView_reviewTime9);
                reivew_03.setText(R.string.textView_reviewTime10);
                reivew_04.setText(R.string.textView_reviewTime12);
                reivew_05.setText(R.string.textView_reviewTime16);
                reivew_06.setText(R.string.textView_reviewTime20);
                reivew_07.setText(R.string.textView_reviewTime23);
                list_work01.setText(R.string.textView_plan08work01);
                list_work02.setText(R.string.textView_plan08work02);
                list_work03.setText(R.string.textView_plan08work03);
                list_work04.setText(R.string.textView_plan08work04);
                list_work05.setText(R.string.textView_plan08work05);
                list_work06.setText(R.string.textView_plan08work06);
                list_work07.setText(R.string.textView_plan08work07);
                break;
            case "nine":
                reivew_01.setText(R.string.textView_reviewTime7);
                reivew_02.setText(R.string.textView_reviewTime9);
                reivew_03.setText(R.string.textView_reviewTime13);
                reivew_04.setText(R.string.textView_reviewTime15);
                reivew_05.setText(R.string.textView_reviewTime18);
                reivew_06.setText(R.string.textView_reviewTime20);
                reivew_07.setText(R.string.textView_reviewTime23);
                list_work01.setText(R.string.textView_plan09work01);
                list_work02.setText(R.string.textView_plan09work02);
                list_work03.setText(R.string.textView_plan09work03);
                list_work04.setText(R.string.textView_plan09work04);
                list_work05.setText(R.string.textView_plan09work05);
                list_work06.setText(R.string.textView_plan09work06);
                list_work07.setText(R.string.textView_plan09work07);
                break;
        }
    }
}
