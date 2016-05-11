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
public class EncourageFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] data = {"《玛丽莎的心愿清单》", "《牧羊少年奇幻之旅》", "《月亮和六便士》", "《我就是我的颜色》","《你的降落伞是什么颜色》","少有人走的路 : 心智成熟的旅程","把时间当作朋友 : 运用心智获得解放","高效能人士的七个习惯（精华版）","拆掉思维里的墙 : 原来我还可以这样活","异类 : 不一样的成功启示录","追寻生命的意义","世界因你不同 : 李开复自传"};
        View view = inflater.inflate(R.layout.fragment_encourage, container, false);
        ListView listView = (ListView) view.findViewById(R.id.Encourage_listview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
        listView.setAdapter(arrayAdapter);
        return view;
    }

}
