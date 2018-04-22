package in.co.cofeed.cofeedorg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {
    ListView ls;

    @Override

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
            ls=findViewById(R.id.ls);
            MyAdapter myadapter=new MyAdapter(this);
            ls.setAdapter(myadapter);

        }
    }

