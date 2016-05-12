package cn.studyjams.s1.sj19.majie;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SchoolBasicInfo extends AppCompatActivity {

    public static String schoolName = "";
    public static String schoolBasic = "";
    public static String schoolMean = "";
    public static String schoolPraise = "";
    private MyDatabaseHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_basic_info);
        dbHelper = new MyDatabaseHelper(this, "Study.db", null, 1);
        TextView schoolName_textview = (TextView) findViewById(R.id.school_name_textview);
        TextView school_details_textview = (TextView) findViewById(R.id.school_details);
        TextView school_mean_textview = (TextView) findViewById(R.id.mean_textview);
        TextView school_publicPraise_textview = (TextView) findViewById(R.id.publicPraise_textview);
        Intent intent = getIntent();
        schoolName = intent.getStringExtra("school");
        schoolName_textview.setText(schoolName);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        //查询School表中所有数据
        Cursor cursor = db.query("SchoolDetails", null, "school = ?", new String[]{schoolName}, null, null, null);
        if (cursor.moveToFirst()) {
            do {
                //遍历Cursor对象，取出数据并打印
                schoolBasic = cursor.getString(cursor.getColumnIndex("basicInfor"));
                schoolMean = cursor.getString(cursor.getColumnIndex("mean"));
                schoolPraise = cursor.getString(cursor.getColumnIndex("praise"));
             } while (cursor.moveToNext());
        }
        cursor.close();
        school_details_textview.setText(schoolBasic);
        school_mean_textview.setText(schoolMean);
        school_publicPraise_textview.setText(schoolPraise);

    }
}
