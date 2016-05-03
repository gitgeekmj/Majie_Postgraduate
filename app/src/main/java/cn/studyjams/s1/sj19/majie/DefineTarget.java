package cn.studyjams.s1.sj19.majie;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DefineTarget extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_define_target);
    }
    public void toFindDiscipline(View view){
        Intent intent = new Intent(DefineTarget.this,DisciplineActivity.class);
        startActivity(intent);
    }
}
