package cn.studyjams.s1.sj19.majie;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class DisciplineActivity extends AppCompatActivity {
    private MyDatabaseHelper dbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discipline);
        dbHelper = new MyDatabaseHelper(this, "Study.db", null, 1);
    }

    public void chooseResearch(View view) {
        //将“选择方向”更改为研究方向
        TextView textView = (TextView) findViewById(R.id.interests);
        textView.setText(R.string.text_researchInterests);
        /**
         * 下方为spinner控件与数据库交互
         */
        //spinner控件
        Spinner spinner_researchDirection = (Spinner) findViewById(R.id.employ_spinner);

        SQLiteDatabase db = dbHelper.getWritableDatabase();
        //返回数据库行数
        String dataName = "Research";
        //定义数据源变量
        String[] researchDirection = new String[queryCount(dataName)];
        //查询表中的数据并建立数据源
        Cursor cursor = db.query("Research", null, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            int index = 0;
            do {

                researchDirection[index] = cursor.getString(cursor.getColumnIndex("direction"));
                Log.e("tag1", researchDirection[index]);
                index++;
            } while (cursor.moveToNext());
        }
        // 建立Adapter并且绑定数据源
        ArrayAdapter<String> adapter_one = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, researchDirection);
        adapter_one.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //绑定 Adapter到控件
        spinner_researchDirection.setAdapter(adapter_one);
        spinner_researchDirection.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {

                String[] languages = getResources().getStringArray(R.array.reserachInterest);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });
        Spinner spinner_two = (Spinner) findViewById(R.id.discipline_spinner);
        // 建立数据源
        String[] mItems_two = getResources().getStringArray(R.array.disciplineInterestTwo);
        // 建立Adapter并且绑定数据源
        ArrayAdapter<String> adapter_two = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, mItems_two);
        adapter_two.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //绑定 Adapter到控件
        spinner_two.setAdapter(adapter_two);
        spinner_two.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {

                String[] languages = getResources().getStringArray(R.array.disciplineInterestTwo);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

        String message;
        message = "        选择专业时，应从自己的未来打算开始，是准备就业，还是准备从事研究工作。然后根据不同的方向，结合自己的兴趣选择。";
        TextView textView_details = (TextView) findViewById(R.id.text_details);
        textView_details.setText(message);
    }

    public void chooseEmploy(View view) {
        TextView textView = (TextView) findViewById(R.id.interests);
        textView.setText(R.string.text_employInterests);
        Spinner spinner_one = (Spinner) findViewById(R.id.employ_spinner);
        // 建立数据源
        String[] mItems_one = getResources().getStringArray(R.array.employInterest);
        // 建立Adapter并且绑定数据源
        ArrayAdapter<String> adapter_one = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, mItems_one);
        adapter_one.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //绑定 Adapter到控件
        spinner_one.setAdapter(adapter_one);
        spinner_one.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {

                String[] languages = getResources().getStringArray(R.array.employInterest);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });
        Spinner spinner_two = (Spinner) findViewById(R.id.discipline_spinner);
        // 建立数据源
        String[] mItems_two = getResources().getStringArray(R.array.disciplineInterestOne);
        // 建立Adapter并且绑定数据源
        ArrayAdapter<String> adapter_two = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, mItems_two);
        adapter_two.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //绑定 Adapter到控件
        spinner_two.setAdapter(adapter_two);
        spinner_two.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {

                String[] languages = getResources().getStringArray(R.array.disciplineInterestOne);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

        String message;
        message = "        选择专业时，应从自己的未来打算开始，是准备就业，还是准备从事研究工作。然后根据不同的方向，结合自己的兴趣选择。";
        TextView textView_details = (TextView) findViewById(R.id.text_details);
        textView_details.setText(message);
    }

    public void notThinkClearly(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.zhihu.com/question/29023850"));
        startActivity(intent);
    }

    public int queryCount(String databaseName) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        String sqlCount = "SELECT COUNT(*) FROM " + databaseName;
        SQLiteStatement sqLiteStatement = db.compileStatement(sqlCount);
        int count = (int) sqLiteStatement.simpleQueryForLong();
        return count;
    }
}
