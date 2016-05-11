package cn.studyjams.s1.sj19.majie;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LifeTips extends AppCompatActivity {

    String Eat[] = {"早餐推荐\n豆浆+苹果+玉米","早餐推荐\n牛奶+苹果+玉米","午餐推荐\n米饭+少油蔬菜+淡汤","午餐推荐\n面条+蔬菜+香蕉","早餐推荐\n全麦面包+果酱+牛奶","晚餐推荐\n玉米+酸奶+蔬菜","晚餐推荐\n牛肉+水果+蔬菜","早餐推荐\n牛奶+苹果+玉米","早餐推荐\n牛奶+苹果+玉米","早餐推荐\n牛奶+苹果+玉米","早餐推荐\n牛奶+苹果+玉米","早餐\n推荐牛奶+苹果+玉米",""};
    String Dream[] = {"考研结束，你有什么想说的？","考研该怎样准备？","考研有什么好处，在目前情况下，对人生的改变大吗？","关于考研，请问学长学姐有什么对后来考研人的建议？或者说是忠告？","理论上每天有 8.5 - 11.5 小时的学习时间，但为什么最多只有 4 小时是有效的？如何改善？"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_tips);
        ListView eatListView = (ListView) findViewById(R.id.lifeTips01_listView);
        ListView dreamListView = (ListView) findViewById(R.id.lifeTips02_listView);
        ArrayAdapter<String> adapterOne = new ArrayAdapter<String>(LifeTips.this,android.R.layout.simple_list_item_1,Eat);
        ArrayAdapter<String> adapterTwo = new ArrayAdapter<String>(LifeTips.this,android.R.layout.simple_list_item_1,Dream);
        eatListView.setAdapter(adapterOne);
        dreamListView.setAdapter(adapterTwo);
        dreamListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent_0 = new Intent(Intent.ACTION_VIEW);
                        intent_0.setData(Uri.parse("https://www.zhihu.com/question/27293185"));
                        startActivity(intent_0);
                        break;
                    case 1:
                        Intent intent_1 = new Intent(Intent.ACTION_VIEW);
                        intent_1.setData(Uri.parse("https://www.zhihu.com/question/20462634"));
                        startActivity(intent_1);
                        break;
                    case 2:
                        Intent intent_2 = new Intent(Intent.ACTION_VIEW);
                        intent_2.setData(Uri.parse("https://www.zhihu.com/question/26908425"));
                        startActivity(intent_2);
                        break;
                    case 3:
                        Intent intent_3 = new Intent(Intent.ACTION_VIEW);
                        intent_3.setData(Uri.parse("https://www.zhihu.com/question/29023850"));
                        startActivity(intent_3);
                        break;
                    case 4:
                        Intent intent_5 = new Intent(Intent.ACTION_VIEW);
                        intent_5.setData(Uri.parse("https://www.zhihu.com/question/21781921"));
                        startActivity(intent_5);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
