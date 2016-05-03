package cn.studyjams.s1.sj19.majie;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by 杰 on 2016/5/3.
 * 建立五张表
 */
public class MyDatabaseHelper extends SQLiteOpenHelper {
    //科研方向专业对照表 主键 科研方向名称
    public static final String CREATE_RESEARCH = "create table Research ("
            + "direction text primary key, "
            + "major1 text, "
            + "major2 text, "
            + "major3 text)";
    //就业方向专业对照表 主键 就业方向名称
    public static final String CREATE_WORK = "create table Work ("
            + "direction text primary key, "
            + "major1 text, "
            + "major2 text, "
            + "major3 text)";
    //专业介绍表 主键 专业
    public static final String CREATE_MAJOR = "create table Major ("
            + "major text primary key, "
            + "trait text)";
    //学校专业对照表 主键 专业
    public static final String CREATE_SCHOOL = "create table School ("
            + "major text primary key, "
            + "school1 text, "
            + "school2 text, "
            + "school3 text)";
    //学校细节介绍表 主键 学校
    public static final String CREATE_SCHOOLDETAILS = "create table SchoolDetails ("
            + "school text primary key, "
            + "basicInfor text, "
            + "mean text, "
            + "praise text)";
    private Context mContext;

    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_RESEARCH);
        db.execSQL(CREATE_WORK);
        db.execSQL(CREATE_MAJOR);
        db.execSQL(CREATE_SCHOOL);
        db.execSQL(CREATE_SCHOOLDETAILS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){

    }
}
