package cn.studyjams.s1.sj19.majie;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        return view;
    }

}
