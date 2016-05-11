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
 *
 */
public class PostgraduateFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] data = {"《历年考研英语真题解析及复习思路》 \n豆瓣评分：8.5", "《李永乐.李正元·考研数学：数学复习全书习题全解》 \n豆瓣评分：8.5", "《李永乐·王式安唯一考研数学系列》 \n豆瓣评分：8.4", "《肖秀荣2017考研政治命题人知识点精讲精练》 \n当当好评：5星", "《2017徐之明考研政治理论超级红宝书》 \n当当好评：5星", "《历年考研英语真题解析及复习思路》 \n豆瓣评分：8.5", "《李永乐.李正元·考研数学：数学复习全书习题全解》 \n豆瓣评分：8.5", "《李永乐·王式安唯一考研数学系列 \n豆瓣评分：8.4", "肖秀荣2017考研政治命题人知识点精讲精练》 \n当当好评：5星", "《2017徐之明考研政治理论超级红宝书》 \n当当好评：5星", "《历年考研英语真题解析及复习思路》 \n豆瓣评分：8.5", "《李永乐.李正元·考研数学：数学复习全书习题全解》 \n豆瓣评分：8.5", "《李永乐·王式安唯一考研数学系列》 \n豆瓣评分：8.4", "《肖秀荣2017考研政治命题人知识点精讲精练》 \n当当好评：5星", "《2017徐之明考研政治理论超级红宝书》 \n当当好评：5星"};
        View view = inflater.inflate(R.layout.fragment_postgraduate, container, false);
        ListView listView = (ListView) view.findViewById(R.id.Postgraduate_listview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent_0 = new Intent(Intent.ACTION_VIEW);
                        intent_0.setData(Uri.parse("https://book.douban.com/subject/3708008/"));
                        startActivity(intent_0);
                        break;
                    case 1:
                        Intent intent_1 = new Intent(Intent.ACTION_VIEW);
                        intent_1.setData(Uri.parse("https://book.douban.com/subject/4583669/"));
                        startActivity(intent_1);
                        break;
                    case 2:
                        Intent intent_2 = new Intent(Intent.ACTION_VIEW);
                        intent_2.setData(Uri.parse("https://book.douban.com/subject/4328920/"));
                        startActivity(intent_2);
                        break;
                    case 3:
                        Intent intent_3 = new Intent(Intent.ACTION_VIEW);
                        intent_3.setData(Uri.parse("https://book.douban.com/subject/4328920/"));
                        startActivity(intent_3);
                        break;
                    case 4:
                    Intent intent_4 = new Intent(Intent.ACTION_VIEW);
                        intent_4.setData(Uri.parse("https://book.douban.com/subject/10761615/"));
                        startActivity(intent_4);
                        break;
                    case 5:
                        Intent intent_5 = new Intent(Intent.ACTION_VIEW);
                        intent_5.setData(Uri.parse("https://book.douban.com/subject/3708008/"));
                        startActivity(intent_5);
                        break;
                    case 6:
                        Intent intent_6 = new Intent(Intent.ACTION_VIEW);
                        intent_6.setData(Uri.parse("https://book.douban.com/subject/3708008/"));
                        startActivity(intent_6);
                        break;
                    case 7:
                        Intent intent_7 = new Intent(Intent.ACTION_VIEW);
                        intent_7.setData(Uri.parse("https://book.douban.com/subject/3708008/"));
                        startActivity(intent_7);
                        break;
                    case 8:
                        Intent intent_8 = new Intent(Intent.ACTION_VIEW);
                        intent_8.setData(Uri.parse("https://book.douban.com/subject/3708008/"));
                        startActivity(intent_8);
                        break;
                    default:
                        Intent intent_9 = new Intent(Intent.ACTION_VIEW);
                        intent_9.setData(Uri.parse("https://book.douban.com/subject/3708008/"));
                        startActivity(intent_9);
                        break;
                }
            }
        });
        return view;
    }


}
