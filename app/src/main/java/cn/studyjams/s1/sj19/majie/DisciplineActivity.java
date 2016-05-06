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
    public static String Direction = "";
    public static String Major = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discipline);
        dbHelper = new MyDatabaseHelper(this, "Study.db", null, 1);
    }

    /**
     * 下方为科研spinner控件与数据库交互
     */
    public void chooseResearch(View view) {
        //将“选择方向”更改为研究方向
        TextView textView = (TextView) findViewById(R.id.interests);
        textView.setText(R.string.text_researchInterests);
        //spinner控件 研究方向
        Spinner spinner_researchDirection = (Spinner) findViewById(R.id.employ_spinner);
        //定义数据库对象
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        //返回数据库行数
        String dataName = "Research";
        //定义数据源变量
        String[] researchDirection = new String[queryCount(dataName)];
        //查询表中的数据并建立数据源
        Cursor cursor_direction = db.query("Research", null, null, null, null, null, null);
        if (cursor_direction.moveToFirst()) {
            int index = 0;
            do {

                researchDirection[index] = cursor_direction.getString(cursor_direction.getColumnIndex("direction"));
                Log.e("tag1", researchDirection[index]);
                index++;
            } while (cursor_direction.moveToNext());
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

                String str1 = parent.getItemAtPosition(pos).toString();
                Direction = str1;
                //spinner控件 研究方向对应专业
                Spinner spinner_major = (Spinner) findViewById(R.id.discipline_spinner);
                //定义数据源变量
                String[] researchMajor = new String[3];
                //查询表中的数据并建立数据源
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                Cursor cursor_major = db.query("Research", null, "direction = ?", new String[]{Direction}, null, null, null);
                if (cursor_major.moveToFirst()) {
                    do {
                        researchMajor[0] = cursor_major.getString(cursor_major.getColumnIndex("major1"));
                        researchMajor[1] = cursor_major.getString(cursor_major.getColumnIndex("major2"));
                        researchMajor[2] = cursor_major.getString(cursor_major.getColumnIndex("major3"));
                    } while (cursor_major.moveToNext());
                }
                // 建立Adapter并且绑定数据源
                ArrayAdapter<String> adapter_two = new ArrayAdapter<String>(DisciplineActivity.this, android.R.layout.simple_spinner_item, researchMajor);
                adapter_two.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                //绑定 Adapter到控件
                spinner_major.setAdapter(adapter_two);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });
        Spinner spinner_major = (Spinner) findViewById(R.id.discipline_spinner);
        spinner_major.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {
                String str2 = parent.getItemAtPosition(pos).toString();
                Major = str2;
                String[] trait1 = new String[1];
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                Cursor cursor_major = db.query("Major", null, "major = ?", new String[]{Major}, null, null, null);
                if (cursor_major.moveToFirst()) {
                    do {
                        trait1[0] = cursor_major.getString(cursor_major.getColumnIndex("trait"));
                    } while (cursor_major.moveToNext());
                }
                String message;
                message = trait1[0];
                TextView textView_details = (TextView) findViewById(R.id.text_details);
                textView_details.setText(message);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });
    }

    /**
     * 下方为就业spinner控件与数据库交互
     *
     * @param view
     */
    public void chooseEmploy(View view) {
        //将“选择方向”更改为就业方向
        TextView textView = (TextView) findViewById(R.id.interests);
        textView.setText(R.string.text_workInterests);
        //spinner控件 就业方向
        Spinner spinner_workDirection = (Spinner) findViewById(R.id.employ_spinner);
        //定义数据库对象
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        //返回数据库行数
        String dataName = "Work";
        //定义数据源变量
        String[] workDirection = new String[queryCount(dataName)];
        //查询表中的数据并建立数据源
        Cursor cursor_direction = db.query("Work", null, null, null, null, null, null);
        if (cursor_direction.moveToFirst()) {
            int index = 0;
            do {

                workDirection[index] = cursor_direction.getString(cursor_direction.getColumnIndex("direction"));
                Log.e("tag1", workDirection[index]);
                index++;
            } while (cursor_direction.moveToNext());
        }
        // 建立Adapter并且绑定数据源
        ArrayAdapter<String> adapter_one = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, workDirection);
        adapter_one.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //绑定 Adapter到控件
        spinner_workDirection.setAdapter(adapter_one);
        spinner_workDirection.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {

                String str1 = parent.getItemAtPosition(pos).toString();
                Direction = str1;
                Spinner spinner_major = (Spinner) findViewById(R.id.discipline_spinner);
                //定义数据源变量
                String[] workMajor = new String[3];
                //查询表中的数据并建立数据源
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                Cursor cursor_major = db.query("Work", null, "direction = ?", new String[]{Direction}, null, null, null);
                if (cursor_major.moveToFirst()) {
                    do {
                        workMajor[0] = cursor_major.getString(cursor_major.getColumnIndex("major1"));
                        workMajor[1] = cursor_major.getString(cursor_major.getColumnIndex("major2"));
                        workMajor[2] = cursor_major.getString(cursor_major.getColumnIndex("major3"));
                    } while (cursor_major.moveToNext());
                }
                // 建立Adapter并且绑定数据源
                ArrayAdapter<String> adapter_two = new ArrayAdapter<String>(DisciplineActivity.this, android.R.layout.simple_spinner_item, workMajor);
                adapter_two.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                //绑定 Adapter到控件
                spinner_major.setAdapter(adapter_two);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });
        Spinner spinner_two = (Spinner) findViewById(R.id.discipline_spinner);
        spinner_two.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {
                String str2 = parent.getItemAtPosition(pos).toString();
                Major = str2;
                String[] trait1 = new String[1];
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                Cursor cursor_major = db.query("Major", null, "major = ?", new String[]{Major}, null, null, null);
                if (cursor_major.moveToFirst()) {
                    do {
                        trait1[0] = cursor_major.getString(cursor_major.getColumnIndex("trait"));
                    } while (cursor_major.moveToNext());
                }
                String message;
                message = trait1[0];
                TextView textView_details = (TextView) findViewById(R.id.text_details);
                textView_details.setText(message);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });
    }

    public void notThinkClearly(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.zhihu.com/question/29023850"));
        startActivity(intent);
    }

    public void majorSchool(View view) {
        Intent intent = new Intent(DisciplineActivity.this, DefineTarget.class);
        intent.putExtra("major", Major);
        intent.putExtra("already","ready");
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
