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
public class EncourageFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] data = {"《玛丽莎的心愿清单》", "《牧羊少年奇幻之旅》", "《月亮和六便士》", "《我就是我的颜色》","《你的降落伞是什么颜色》","《少有人走的路 : 心智成熟的旅程》","《把时间当作朋友 : 运用心智获得解放》","《高效能人士的七个习惯（精华版）》","《拆掉思维里的墙 : 原来我还可以这样活》","《异类 : 不一样的成功启示录》","《追寻生命的意义》","《世界因你不同 : 李开复自传》"};
        View view = inflater.inflate(R.layout.fragment_encourage, container, false);
        ListView listView = (ListView) view.findViewById(R.id.Encourage_listview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent_0 = new Intent(Intent.ACTION_VIEW);
                        intent_0.setData(Uri.parse("https://book.douban.com/subject/3270647/"));
                        startActivity(intent_0);
                        break;
                    case 1:
                        Intent intent_1 = new Intent(Intent.ACTION_VIEW);
                        intent_1.setData(Uri.parse("https://book.douban.com/subject/3608208/"));
                        startActivity(intent_1);
                        break;
                    case 2:
                        Intent intent_2 = new Intent(Intent.ACTION_VIEW);
                        intent_2.setData(Uri.parse("https://book.douban.com/subject/1858513/"));
                        startActivity(intent_2);
                        break;
                    case 3:
                        Intent intent_3 = new Intent(Intent.ACTION_VIEW);
                        intent_3.setData(Uri.parse("https://book.douban.com/subject/3195233/"));
                        startActivity(intent_3);
                        break;
                    case 4:
                        Intent intent_4 = new Intent(Intent.ACTION_VIEW);
                        intent_4.setData(Uri.parse("https://book.douban.com/subject/4881831/"));
                        startActivity(intent_4);
                        break;
                    case 5:
                        Intent intent_5 = new Intent(Intent.ACTION_VIEW);
                        intent_5.setData(Uri.parse("https://book.douban.com/subject/1775691/"));
                        startActivity(intent_5);
                        break;
                    case 6:
                        Intent intent_6 = new Intent(Intent.ACTION_VIEW);
                        intent_6.setData(Uri.parse("https://book.douban.com/subject/3609132/"));
                        startActivity(intent_6);
                        break;
                    case 7:
                        Intent intent_7 = new Intent(Intent.ACTION_VIEW);
                        intent_7.setData(Uri.parse("https://book.douban.com/subject/1048007/"));
                        startActivity(intent_7);
                        break;
                    case 8:
                        Intent intent_8 = new Intent(Intent.ACTION_VIEW);
                        intent_8.setData(Uri.parse("https://book.douban.com/subject/4953695/"));
                        startActivity(intent_8);
                        break;
                    default:
                        Intent intent_9 = new Intent(Intent.ACTION_VIEW);
                        intent_9.setData(Uri.parse("https://book.douban.com/subject/3688489/"));
                        startActivity(intent_9);
                        break;
                }
            }
        });
        return view;
    }

}
