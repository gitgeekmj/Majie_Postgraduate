package cn.studyjams.s1.sj19.majie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TimePlan extends AppCompatActivity {

    public static int count_habit = 0;
    public static int count_sport = 0;
    public static boolean habitOne = false;
    public static boolean habitTwo = false;
    public static boolean habitThree = false;
    public static boolean sportOne = false;
    public static boolean sportTwo = false;
    public static boolean sportThree = false;
    Button createReview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_plan);
        createReview = (Button) findViewById(R.id.createReview_button);
        createReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum = count_habit * count_sport;
                switch (sum){
                    case 5:
                        Intent intent_R_One = new Intent(TimePlan.this,ReviewPlan.class);
                        intent_R_One.putExtra("Plan","one");
                        startActivity(intent_R_One);
                        break;
                    case 6:
                        Intent intent_R_Two = new Intent(TimePlan.this,ReviewPlan.class);
                        intent_R_Two.putExtra("Plan","two");
                        startActivity(intent_R_Two);
                        break;
                    case 7:
                        Intent intent_R_Three = new Intent(TimePlan.this,ReviewPlan.class);
                        intent_R_Three.putExtra("Plan","three");
                        startActivity(intent_R_Three);
                        break;
                    case 10:
                        Intent intent_R_Four = new Intent(TimePlan.this,ReviewPlan.class);
                        intent_R_Four.putExtra("Plan","four");
                        startActivity(intent_R_Four);
                        break;
                    case 12:
                        Intent intent_R_Five = new Intent(TimePlan.this,ReviewPlan.class);
                        intent_R_Five.putExtra("Plan","five");
                        startActivity(intent_R_Five);
                        break;
                    case 14:
                        Intent intent_R_Six = new Intent(TimePlan.this,ReviewPlan.class);
                        intent_R_Six.putExtra("Plan","six");
                        startActivity(intent_R_Six);
                        break;
                    case 15:
                        Intent intent_R_Seven = new Intent(TimePlan.this,ReviewPlan.class);
                        intent_R_Seven.putExtra("Plan","seven");
                        startActivity(intent_R_Seven);
                        break;
                    case 18:
                        Intent intent_R_Eight = new Intent(TimePlan.this,ReviewPlan.class);
                        intent_R_Eight.putExtra("Plan","eight");
                        startActivity(intent_R_Eight);
                        break;
                    case 21:
                        Intent intent_R_Nine = new Intent(TimePlan.this,ReviewPlan.class);
                        intent_R_Nine.putExtra("Plan","nine");
                        startActivity(intent_R_Nine);
                        break;
                    default:
                        Toast.makeText(TimePlan.this, "选择不完整，请选择两种习惯", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void chooseHabitOne(View view) {
        count_habit = 1;
        habitOne = true;
    }

    public void chooseHabitTwo(View view) {
        count_habit = 2;
        habitTwo = true;
    }

    public void chooseHabitThree(View view) {
        count_habit = 3;
        habitThree = true;
    }

    public void chooseSportOne(View view) {
        count_sport = 5;
        sportOne = true;
    }

    public void chooseSportTwo(View view) {
        count_sport = 6;
        sportTwo = true;
    }

    public void chooseSportThree(View view) {
        count_sport = 7;
        sportThree = true;
    }
}
