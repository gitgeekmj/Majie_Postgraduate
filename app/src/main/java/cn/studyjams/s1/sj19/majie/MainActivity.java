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
        values.put("direction", "计算理论");
        values.put("major1", "神经网络算法");
        values.put("major2", "计算复杂性理论");
        values.put("major3", "自动机理论");
        //开始插入第一条数据
        db.insert("Research", null, values);
        values.clear();
        //开始组装第二条数据
        values.put("direction", "计算机系统结构");
        values.put("major1", "云计算与大数据");
        values.put("major2", "互联网与移动计算");
        values.put("major3", "微处理器设计技术");
        //开始插入第二条数据
        db.insert("Research", null, values);
        values.clear();
        //开始组装第三条数据
        values.put("direction", "量子电子学");
        values.put("major1", "计算机网络及应用");
        values.put("major2", "数据库技术及应用");
        values.put("major3", "网络攻防技术");
        //开始插入第三条数据
        db.insert("Research", null, values);
        values.clear();
        values.put("major", "神经网络算法");
        values.put("trait", "神经网络算法是指逻辑性的思维是指根据逻辑规则进行推理的过程。神经网络的研究内容相当广泛，反映了多学科交叉技术领域的特点。主要的研究工作集中在生物原型研究、建立理论模型、网络模型与算法研究、人工神经网络应用系统等方面。");
        db.insert("Major", null, values);
        values.clear();
        values.put("major", "计算复杂性理论");
        values.put("trait", "计算复杂性理论是理论计算机科学的分支学科，使用数学方法对计算中所需的各种资源的耗费作定量的分析，并研究各类问题之间在计算复杂程度上的相互关系和基本性质，是算法分析的理论基础。");
        db.insert("Major", null, values);
        values.clear();
        values.put("major", "自动机理论");
        values.put("trait", "将离散数学系统的构造，作用和关系作为研究对象的数学理论。");
        db.insert("Major", null, values);
        values.clear();
        values.put("major", "云计算与大数据");
        values.put("trait", "是一种基于互联网的计算方式，通过这种方式，共享的软硬件资源和信息可以按需求提供给计算机和其他设备。");
        db.insert("Major", null, values);
        values.clear();
        values.put("major", "互联网与移动计算");
        values.put("trait", "随着移动通信、互联网、数据库、分布式计算等技术的发展而兴起的新技术。移动计算技术将使计算机或其它信息智能终端设备在无线环境下实现数据传输及资源共享。");
        db.insert("Major", null, values);
        values.clear();
        values.put("major", "微处理器设计技术");
        values.put("trait", "从设计规划到工艺制造的全部设计流程。");
        db.insert("Major", null, values);
        values.clear();
        values.put("major", "计算机网络及应用");
        values.put("trait", "是指将地理位置不同的具有独立功能的多台计算机及其外部设备，通过通信线路连接起来，在网络操作系统，网络管理软件及网络通信协议的管理和协调下，实现资源共享和信息传递的计算机系统。");
        db.insert("Major", null, values);
        values.clear();
        values.put("major", "数据库技术及应用");
        values.put("trait", "数据库技术是信息系统的一个核心技术，通过研究数据库的结构、存储、设计、管理以及应用的基本理论和实现方法，并利用这些理论来实现对数据库中的数据进行处理、分析和理解。");
        db.insert("Major", null, values);
        values.clear();
        values.put("major", "网络攻防技术");
        values.put("trait", "从网络安全所面临的不同威胁入手，详细介绍了信息收集、口令攻击、缓冲区溢出、恶意代码、Web应用程序攻击、嗅探、假消息、拒绝服务攻击等多种攻击技术，并给出一定的实例分析，然后，从网络安全、访问控制机制、防火墙技术、入侵检测、蜜罐技术等方面系统介绍网络安全防御技术，进而分析了内网安全管理的技术和手段。");
        db.insert("Major", null, values);
        values.clear();
        //开始组装Work表数据
        values.put("direction", "计算机应用");
        values.put("major1", "计算复杂性理论");
        values.put("major2", "数据库技术及应用");
        values.put("major3", "微处理器设计技术");
        //开始插入第二条数据
        db.insert("Work", null, values);
        values.clear();
        values.put("direction", "智能科学与技术");
        values.put("major1", "计算机网络及应用");
        values.put("major2", "云计算与大数据");
        values.put("major3", "互联网与移动计算");
        db.insert("Work", null, values);
        values.clear();
        values.put("direction", "通信与信息处理");
        values.put("major1", "自动机理论");
        values.put("major2", "神经网络算法");
        values.put("major3", "网络攻防技术");
        db.insert("Work", null, values);
        values.clear();
        values.put("major", "神经网络算法");
        values.put("school1", "清华大学");
        values.put("school2", "北京大学");
        values.put("school3", "东北大学");
        db.insert("School", null, values);
        values.clear();
        values.put("major", "网络攻防技术");
        values.put("school1", "人民大学");
        values.put("school2", "山东大学");
        values.put("school3", "电子科技大学");
        db.insert("School", null, values);
        values.clear();
        values.put("major", "神经网络算法");
        values.put("school1", "北京大学");
        values.put("school2", "清华大学");
        values.put("school3", "吉林大学");
        db.insert("School", null, values);
        values.clear();
        values.put("major", "自动机理论");
        values.put("school1", "哈尔滨工业大学");
        values.put("school2", "大连理工大学");
        values.put("school3", "上海交通大学");
        db.insert("School", null, values);
        values.clear();
        values.put("major", "互联网与移动计算");
        values.put("school1", "北京理工大学");
        values.put("school2", "北京航空航天大学");
        values.put("school3", "厦门大学");
        db.insert("School", null, values);
        values.clear();
        values.put("major", "云计算与大数据");
        values.put("school1", "清华大学");
        values.put("school2", "南京大学");
        values.put("school3", "东南大学");
        db.insert("School", null, values);
        values.clear();
        values.put("major", "微处理器设计技术");
        values.put("school1", "北京大学");
        values.put("school2", "西北工业大学");
        values.put("school3", "西安电子科技大学");
        db.insert("School", null, values);
        values.clear();
        values.put("major", "数据库技术及应用");
        values.put("school1", "清华大学");
        values.put("school2", "上海大学");
        values.put("school3", "南京理工大学");
        db.insert("School", null, values);
        values.clear();
        values.put("major", "计算复杂性理论");
        values.put("school1", "北京邮电大学");
        values.put("school2", "国防科技大学");
        values.put("school3", "复旦大学");
        db.insert("School", null, values);
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
                Intent intent_timePlanning = new Intent(MainActivity.this, TimePlan.class);
                startActivity(intent_timePlanning);
                break;
            case R.id.bookRecommend_button:
                Intent intent_bookRecommend = new Intent(MainActivity.this, BookComend.class);
                startActivity(intent_bookRecommend);
                break;
            case R.id.chooseTarget_button:
                Intent intent_chooseTarget = new Intent(MainActivity.this, DefineTarget.class);
                intent_chooseTarget.putExtra("already","noready");
                startActivity(intent_chooseTarget);
                break;
            case R.id.lifeTips_buton:
                Intent intent_lifeTips = new Intent(MainActivity.this,LifeTips.class);
                startActivity(intent_lifeTips);
                break;
            case R.id.encouragement_button:
                Intent intent_encouragement = new Intent(Intent.ACTION_VIEW);
                intent_encouragement.setData(Uri.parse("https://www.zhihu.com/question/30642940/answer/48907444"));
                startActivity(intent_encouragement);
                break;

        }
    }
}
