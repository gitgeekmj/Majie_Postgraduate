package cn.studyjams.s1.sj19.majie;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MajorFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] data = {"《Java 2核心技术》", "《Java编程语言》", "《Effective Java》", "《Java解惑》","《Java编程思想》","《C程序设计语言》","《C和指针》","《C陷阱与缺陷》","《C专家编程》","《你必须知道的495个C语言问题》","《C++ Primer》","《C++程序设计语言》","《Effective C++》","《More Effective C++》","《C++编程思想》","《算法导论》","《C算法(第一卷):基础、数据结构、排序和搜索》","《C算法(第二卷)：图算法》","《数据结构与算法分析—C语言描述》","《代码之美》","《疯狂的程序员》","《程序员修炼之道》","《现代操作系统》"};
        View view = inflater.inflate(R.layout.fragment_major, container, false);
        ListView listView = (ListView) view.findViewById(R.id.Major_listview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent_0 = new Intent(Intent.ACTION_VIEW);
                        intent_0.setData(Uri.parse("https://book.douban.com/subject/1137263/"));
                        startActivity(intent_0);
                        break;
                    case 1:
                        Intent intent_1 = new Intent(Intent.ACTION_VIEW);
                        intent_1.setData(Uri.parse("https://book.douban.com/subject/1230098/"));
                        startActivity(intent_1);
                        break;
                    case 2:
                        Intent intent_2 = new Intent(Intent.ACTION_VIEW);
                        intent_2.setData(Uri.parse("https://book.douban.com/subject/3360807/"));
                        startActivity(intent_2);
                        break;
                    case 3:
                        Intent intent_3 = new Intent(Intent.ACTION_VIEW);
                        intent_3.setData(Uri.parse("https://book.douban.com/subject/1473329/"));
                        startActivity(intent_3);
                        break;
                    case 4:
                        Intent intent_4 = new Intent(Intent.ACTION_VIEW);
                        intent_4.setData(Uri.parse("https://book.douban.com/subject/1313042/"));
                        startActivity(intent_4);
                        break;
                    case 5:
                        Intent intent_5 = new Intent(Intent.ACTION_VIEW);
                        intent_5.setData(Uri.parse("https://book.douban.com/subject/1139336/"));
                        startActivity(intent_5);
                        break;
                    case 6:
                        Intent intent_6 = new Intent(Intent.ACTION_VIEW);
                        intent_6.setData(Uri.parse("https://book.douban.com/subject/3012360/"));
                        startActivity(intent_6);
                        break;
                    case 7:
                        Intent intent_7 = new Intent(Intent.ACTION_VIEW);
                        intent_7.setData(Uri.parse("https://book.douban.com/subject/2778632/"));
                        startActivity(intent_7);
                        break;
                    case 8:
                        Intent intent_8 = new Intent(Intent.ACTION_VIEW);
                        intent_8.setData(Uri.parse("https://book.douban.com/subject/2377310/"));
                        startActivity(intent_8);
                        break;
                    default:
                        Intent intent_9 = new Intent(Intent.ACTION_VIEW);
                        intent_9.setData(Uri.parse("https://book.douban.com/subject/1767741/"));
                        startActivity(intent_9);
                        break;
                }
            }
        });
        return view;
    }

}
