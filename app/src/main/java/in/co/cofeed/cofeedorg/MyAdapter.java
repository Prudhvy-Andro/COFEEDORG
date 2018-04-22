package in.co.cofeed.cofeedorg;

import android.content.Context;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import in.co.cofeed.cofeedorg.R;

/**
 * Created by DELL on 21-04-2018.
 */

public class MyAdapter extends BaseAdapter {
    Integer[] im={R.drawable.an,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.d};
    String[] cn={"GITAM UNIVERSITY","ST JOSEPH ENGINEERING COLLEGE","VIOLET COLLEGE","MAHENDRA ENGINEERING COLLEGE","BIT'S PILANI"};
    String[] desc={"It's Your Time to Prove!","Innovation Is Our Tradition","A Great Place to Start","Personal Education","The Management has decided to conducted classes on AI for all the 3rd years .For making the students to advance in technologies and to cope up with the present trend"};
    Context context;
    LayoutInflater layoutinflator;
    public MyAdapter(Context context){
        this.context=context;
        layoutinflator=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
    @Override
    public int getCount() {
        return im.length;
    }

    @Override
    public Object getItem(int position) {
        return im[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view=layoutinflator.inflate(R.layout.post,null);
        ImageView img=(ImageView)view.findViewById(R.id.img1);
        TextView tv=(TextView)view.findViewById(R.id.cn);
        TextView des=(TextView)view.findViewById(R.id.desc);
        img.setImageResource(im[position]);
        tv.setText(cn[position]);
        des.setText(desc[position]);

        return view;
    }
}
