package com.example.customelistview;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.sql.Array;

public class MainActivity extends AppCompatActivity {
    ListView lv;

            @Override
    protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    lv=findViewById(R.id.lv);


    String [] data={"Facebook","whatsapp","Youtube"};
    Integer[]imgid={R.drawable.fb,R.drawable.wp,R.drawable.yt}

            Customadapter customadapter=new Customadapter(getApplicationContext(),data,imgid);
            lv.setAdapter();


        }
public class customadapter extends ArrayAdapter<String>{
                private final Context context;
                private final String[] data;
                private  final Integer[]imgid

                public customadapter(@NonNull Contex contex,int resource){
                super(context,R.layout.customelist,data);


                this.context=contex;
                this.data=data;
                this.imgid=imgid;

}
public View getView(int i, View convertview, ViewGroup viewGroup){
        View v1=getLayoutInflater().inflate(R.layout.customelist,viewGroup,true);

    ImageView img=v1.findViewById(R.id.img);
    TextView name=v1.findViewById(R.id.name);

    img.setImageResource(imgid[i]);
    name.setText(data[i]);


        return v1
        }
    }
}