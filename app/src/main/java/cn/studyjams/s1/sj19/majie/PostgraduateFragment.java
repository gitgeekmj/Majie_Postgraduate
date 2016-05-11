package cn.studyjams.s1.sj19.majie;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 *
 */
public class PostgraduateFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] data = {"《历年考研英语真题解析及复习思路》 \n豆瓣评分：8.5", "《李永乐.李正元·考研数学：数学复习全书习题全解》 \n豆瓣评分：8.5", "《李永乐·王式安唯一考研数学系列》 \n豆瓣评分：8.4", "《肖秀荣2017考研政治命题人知识点精讲精练》 \n当当好评：5星","《2017徐之明考研政治理论超级红宝书》 \n当当好评：5星","《历年考研英语真题解析及复习思路》 \n豆瓣评分：8.5", "《李永乐.李正元·考研数学：数学复习全书习题全解》 \n豆瓣评分：8.5", "《李永乐·王式安唯一考研数学系列 \n豆瓣评分：8.4", "肖秀荣2017考研政治命题人知识点精讲精练》 \n当当好评：5星","《2017徐之明考研政治理论超级红宝书》 \n当当好评：5星","《历年考研英语真题解析及复习思路》 \n豆瓣评分：8.5", "《李永乐.李正元·考研数学：数学复习全书习题全解》 \n豆瓣评分：8.5", "《李永乐·王式安唯一考研数学系列》 \n豆瓣评分：8.4", "《肖秀荣2017考研政治命题人知识点精讲精练》 \n当当好评：5星","《2017徐之明考研政治理论超级红宝书》 \n当当好评：5星"};
        View view = inflater.inflate(R.layout.fragment_postgraduate, container, false);
        ListView listView = (ListView) view.findViewById(R.id.Postgraduate_listview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
        listView.setAdapter(arrayAdapter);
        return view;
    }


}
