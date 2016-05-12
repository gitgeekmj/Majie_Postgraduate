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
        values.clear();
        values.put("school", "北京大学");
        values.put("basicInfor", "北京大学（Peking University）创办于1898年，初名京师大学堂，以最高学府身份创立，最初也是国家最高教育行政机关，行使教育部职能。北大是中国近代第一所国立综合性大学，是中国著名的高等学府，亚洲和世界最重要的大学之一。");
        values.put("mean", "405");
        values.put("praise", "学期氛围浓厚 有深厚扎实的专业基础 教学水平较高，拥有硕士，博士学位的老师也不在少数，师资力量这么强，教学水平当然会很好，经过这三个多月的上课体验，我也感觉到了超强的教学水平，心里很是高兴哦，当初的选择一点也没错。");
        db.insert("SchoolDetails", null, values);
        values.clear();
        values.put("school", "东北大学");
        values.put("basicInfor", "东北大学（Northeastern University）创校于1923年，位于中国辽宁省沈阳市，是首批列于“211工程”和“985工程”重点建设的著名工科大学，国家“111计划”和“卓越计划”重点建设的名牌大学。著名爱国将领张学良将军曾任校长。");
        values.put("mean", "395");
        values.put("praise", "学校师资力量和同等水平学校相当，教学质量也相当，学习氛围还行，学校食堂挺便宜的，最好吃的是九舍，一舍，二舍，生活环境一般，学习环境一般，设施还可以，计算机和自动化专业最热门，机械专业和机电一体化最好就业，学费可以，同类学校中算持平");
        db.insert("SchoolDetails", null, values);
        values.clear();
        values.put("school", "清华大学");
        values.put("basicInfor", "清华大学，简称清华，诞生于1911年，依托美国退还的部分“庚子赔款”建立，因坐落于北京西北郊的清华园而得名。初称“清华学堂”，是清政府设立的留美预备学校；翌年更名为“清华学校”。");
        values.put("mean", "420");
        values.put("praise", "我们学校是全中国教育实力和科研水平最好的学校之一，而北大齐名，是全国最好的高校之一。学习氛围浓厚，设施完善，师资雄厚，经管学院最好，状元去的最多。工科是清华的强项。食堂非常好吃");
        db.insert("SchoolDetails", null, values);
        values.clear();
        values.put("school", "复旦大学");
        values.put("basicInfor", "复旦大学是中国人自主创办的第一所高等学校，是国家 “六五”、“七五”、“八五”重点建设、全国首批7所211工程、9所985工程重中之重建设的名牌大学，也是被纳入国家首批“珠峰计划”、“111计划”和中国顶尖学府“常青藤联盟”（C9联盟）的成员大学，始建于1905年。");
        values.put("mean", "400");
        values.put("praise", "学校的师资力量和教学水平都很好，而且将做很多，获取资源的方式很多，学习氛围整体不错，但也存在期末刷分的状况，总之大家都挺好的。");
        db.insert("SchoolDetails", null, values);
        values.clear();
        values.put("school", "上海交通大学");
        values.put("basicInfor", "上海交通大学（Shanghai Jiao Tong University）位于中国的经济、金融中心上海，是由教育部直属的一所具有理工特色，涵盖理、工、医、经、管、文、法等9大学科门类的综合性全国重点大学，中国首批七所“211工程”、首批九所“985工程重点建设”院校之一。");
        values.put("mean", "399");
        values.put("praise", "优点：学校名气大，理工科背景强，科研实力强，人多，设施齐全。缺点：优势学科不突出");
        db.insert("SchoolDetails", null, values);
        values.clear();
        values.put("school", "国防科技大学");
        values.put("basicInfor", "中国人民解放军国防科学技术大学（National University of Defense Technology） 简称国防科技大学，是一所直属中央军委培养国防科学技术人才副大军区级的综合类最高学府，涵盖理学、工学、军事学、管理学、经济学、哲学、文学、教育学、法学、历史学等10个学科门类的综合大学，并列入了国家“985工程”和“211工程”的重点建设。");
        values.put("mean", "395");
        values.put("praise", "c");
        db.insert("SchoolDetails", null, values);
        values.clear();
        values.put("school", "南京理工大学");
        values.put("basicInfor", "南京理工大学，是一所隶属于工业和信息化部的全国重点大学，素有“兵器技术人才摇篮”的美誉。学校坐落于六朝古都南京，1953年，学校由中国人民解放军军事工程学院（简称“哈军工”）分建而成，先后经历炮兵工程学院、华东工程学院、华东工学院几个发展阶段，1993年更为现名。");
        values.put("mean", "350");
        values.put("praise", "优点：全国211平台，理工科强势，资源多，各方面设施到位。图书馆，体育馆，宿舍都很好。");
        db.insert("SchoolDetails", null, values);
        values.clear();
        values.put("school", "西安电子科技大学");
        values.put("basicInfor", "西安电子科技大学坐落于举世闻名的世界四大古都之一的十三朝古都西安，是中央部属高校，直属教育部，工信部共建。学校前身是1931年诞生于江西瑞金的中央军委无线电学校，1959年首批20所全国重点大学，国家首批211工程、985工程平台重点建设高校，111计划即高等学校学科创新引智计划高校，全国56所设立研究生院的重点大学，中国最早的2所国防工业重点军校（哈军工、西军电并称），中国电子信息领域科学研究和人才培养的核心基地。");
        values.put("mean", "360");
        values.put("praise", "所在学校是一所通信以及电子信息非常强的高校，师资力量比较强大，对于机械方面更重视机械总体设计以及装配，与一般高校重视制造以及材料加工不同");
        db.insert("SchoolDetails", null, values);
        values.clear();
        values.put("school", "西北工业大学");
        values.put("basicInfor", "西北工业简称西工大（英文缩写NPU），大学坐落于古都西安，是我国唯一一所以同时发展航空、航天、航海工程教育和科学研究为特色，以工理为主，管、文、经、法协调发展的研究型、多科性和开放式的科学技术大学，隶属工业和信息化部。");
        values.put("mean", "396");
        values.put("praise", "优点：课多，狠抓学习，不好好学习真的会挂科，竞赛什么的很多学校很看重 缺点：校园文化氛围不足，新校区离市区远，适合培养勤勤恳恳的员工，不适合培养有野心的领导者");
        db.insert("SchoolDetails", null, values);
        values.clear();
        values.put("school", "东南大学");
        values.put("basicInfor", "东南大学（英文名：Southeast University），成立于1902年，位于中国南京，是中国最早建立的高等学府之一，素有“学府圣地”和“东南学府第一流”之美誉。");
        values.put("mean", "402");
        values.put("praise", "校风学风严谨，注重学生的综合素质培养，配套设施齐全，住宿条件好，四牌楼校区古朴庄严，九龙湖校区绿意盎然");
        db.insert("SchoolDetails", null, values);
        values.clear();
        values.put("school", "南京大学");
        values.put("basicInfor", "南京大学（英文：Nanjing University），创办于1902年，是一所源远流长的高等学府。前身是三江师范学堂，历经多次变迁，1949年，“国立中央大学”易名“国立南京大学”，翌年径称“南京大学”。");
        values.put("mean", "405");
        values.put("praise", "优点，学校本身不错，985,211，教学计划会经常变更，当然是好的变更 缺点，南京的软件产业发展还不够好");
        db.insert("SchoolDetails", null, values);
        values.clear();
        values.put("school", "厦门大学");
        values.put("basicInfor", "厦门大学（英文名：Xiamen University)，简称“厦大”，国家副部级建制的重点大学，中国教育部直属的综合性重点大学。由著名爱国华侨领袖陈嘉庚先生于1921年创建的，是中国近代教育史上第一所华侨创办的大学，也是我国唯一地处经济特区的国家“211工程”和“985工程”重点建设的高水平大学。");
        values.put("mean", "385");
        values.put("praise", "厦大各方面条件不错，总体非常有大学的氛围，相对也自由一些。 但是国内大学的通病还是有，会感觉官僚体制化的东西还是有的。另外，厦门本身工作和实习机会没有北上广深多，需要自己好好把握");
        db.insert("SchoolDetails", null, values);
        values.clear();
        values.put("school", "北京航空航天大学");
        values.put("basicInfor", "北京航空航天大学（简称“北航”，原名北京航空学院，1988年更名）创办于1952年10月25日，由当时包括清华大学、北洋大学等8所著名大学的航空院系合并而成。学校地处北京中关村高科技园区，毗邻国家奥林匹克体育中心，是新中国首所航空工程大学。");
        values.put("mean", "400");
        values.put("praise", "师资力量强，教学水平高。学习氛围很浓厚。食堂合一吃的比较多。基本上计算机专业最好就业，当然航空航天的特色就不多说了。");
        db.insert("SchoolDetails", null, values);
        values.clear();
        values.put("school", "北京理工大学");
        values.put("basicInfor", "北京理工大学（Beijing Institute of Technology）是中华人民共和国工业和信息化部直属的一所以理工科为主干，工、理、管、文协调发展的全国重点大学，是国家“211工程”、“985工程”首批重点建设高校，是“中俄工科大学联盟”成员。");
        values.put("mean", "400");
        values.put("praise", "很不错的学校，环境也非常不错。适合学习。很不错的学校，环境也非常不错。适合学习。很不错的学校，环境也非常不错。适合学习。");
        db.insert("SchoolDetails", null, values);
        values.clear();
        values.put("school", "哈尔滨工业大学");
        values.put("basicInfor", "哈尔滨工业大学（威海）英文名Harbin Institute of Technology at Weihai，始建于1985年，隶属于中国工业和信息化部，是哈尔滨工业大学三个跨省校区之一。坐落于胶东半岛美丽的滨海城市威海，连年被评为大学生创业示范院校。");
        values.put("mean", "380");
        values.put("praise", "中国一流大学，以‘’规格严格，功夫到家‘’为校训。学校学术氛围浓厚，到处能看到刻苦钻研的身影。");
        db.insert("SchoolDetails", null, values);
        values.clear();
        values.put("school", "大连理工大学");
        values.put("basicInfor", "大连理工大学（Dalian University of Technology），简称大工，坐落于滨城大连，是中央直管、教育部直属的副部级全国重点大学，中国著名的“四大工学院”之一，国家“211工程”、“985工程”、“卓越工程师教育培养计划”、“国家大学生创新性实验计划”和“111计划”重点建设的大学，“卓越大学联盟”、“中俄工科大学联盟”、“中欧工程教育平台”主要成员。");
        values.put("mean", "397");
        values.put("praise", "师资水平不错，氛围很好，食堂价位还算合理，学费价位正常，配套设施相当完善，学校重点专业比较多");
        db.insert("SchoolDetails", null, values);
        values.clear();
        values.put("school", "吉林大学");
        values.put("basicInfor", "吉林大学坐落在吉林省省会长春市，是教育部直属的一所中国重点综合性大学，1995年首批通过国家教委“211工程”审批，2001年被列入“985工程”国家重点建设的大学之一。");
        values.put("mean", "384");
        values.put("praise", "科研实力雄厚，教学质量高，实验设施齐全，业余活动充分，校区环境优美，四季分明，冬季银装素裹，夏季鸟语花香，同学们积极向上，活泼开朗");
        db.insert("SchoolDetails", null, values);
        values.clear();
        values.put("school", "山东大学");
        values.put("basicInfor", "山东大学（Shandong University），简称山大，是中华人民共和国教育部直属的综合性全国重点大学，是国家“211工程”、“985工程”重点建设院校，入选“111计划”、“珠峰计划”、“卓越工程师教育培养计划”、“卓越医生教育培养计划”、“卓越法律人才教育培养计划”，是中央直接管理的副部级大学。");
        values.put("mean", "376");
        values.put("praise", "学校古色古香，环境优美，学习氛围浓厚，住宿环境良好，具有一流的师资力量！山东省内一流学校！");
        db.insert("SchoolDetails", null, values);
        values.clear();
        values.put("school", "人民大学");
        values.put("basicInfor", "中国人民大学（Renmin University of China）位于北京市海淀区中关村大街59号，该校是一所以人文社科为主的综合性研究型全国重点大学，是国家首批“985工程”和“211工程”和“2011计划（协同高校）”重点建设的高校，被誉为“我国人文社会科学的最高学府”，直属于教育部，由教育部与北京市共建。");
        values.put("mean", "402");
        values.put("praise", "优点：学习氛围浓厚、思想开放自由、学生活动丰富多样，生活学习环境很好：各区都有食堂，北区最好吃，但比清华北大略贵。学校在多条地跌公交附近，位于三环，交通方便。但是地价贵，学校附近吃的不多。师资力量管理、经济金融、人文社科较强，别的较一般。缺点：人文社科类、管理学类专业中国人民大学非常厉害；理学类、工学类这两大块学科人大总的来说偏弱。");
        db.insert("SchoolDetails", null, values);
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
