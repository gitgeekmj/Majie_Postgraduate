package cn.studyjams.s1.sj19.majie;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class DefineTarget extends AppCompatActivity {
    private MyDatabaseHelper dbHelper;
    public static String clickFrom = "";
    public static String major = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_define_target);
        dbHelper = new MyDatabaseHelper(this, "Study.db", null, 1);
        Intent intent = getIntent();
        major = intent.getStringExtra("major");
        clickFrom = intent.getStringExtra("already");
        switch (clickFrom) {
            case "ready":
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                String[] schoolList = new String[3];
                //查询School表中所有数据
                Cursor cursor = db.query("School", null, "major = ?", new String[]{major}, null, null, null);
                if (cursor.moveToFirst()) {
                    do {
                        //遍历Cursor对象，取出数据并打印
                        schoolList[0] = cursor.getString(cursor.getColumnIndex("school1"));
                        schoolList[1] = cursor.getString(cursor.getColumnIndex("school2"));
                        schoolList[2] = cursor.getString(cursor.getColumnIndex("school3"));
                        Log.e("tag", schoolList[0]);
                        Log.e("tag", schoolList[1]);
                        Log.e("tag", schoolList[2]);
                    } while (cursor.moveToNext());
                }
                cursor.close();
                ListView listView = (ListView) findViewById(R.id.school_listview);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(DefineTarget.this, android.R.layout.simple_list_item_1, schoolList);
                listView.setAdapter(adapter);
                break;
            case "noready":
                Toast.makeText(DefineTarget.this, "点击右上角去挑选专业！", Toast.LENGTH_LONG).show();
                break;
            default:
                break;

        }
        Button findDiscipline = (Button) findViewById(R.id.toFindDiscipline);
        findDiscipline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (clickFrom) {
                    case "ready":
                        Toast.makeText(DefineTarget.this, "已经选过专业啦", Toast.LENGTH_LONG).show();
                        break;
                    case "noready":
                        Intent intent = new Intent(DefineTarget.this, DisciplineActivity.class);
                        startActivity(intent);
                        break;
                    default:
                        break;
                }
            }
        });
        ListView listView = (ListView) findViewById(R.id.school_listview);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String str = parent.getItemAtPosition(position).toString();
                Intent intent = new Intent(DefineTarget.this,SchoolBasicInfo.class);
                intent.putExtra("school",str);
                startActivity(intent);
            }
        });
    }
}
