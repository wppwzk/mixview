package com.ybc.mixview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int[]images=new int[]{
            R.drawable.shipin,R.drawable.speech_balloon,R.drawable.weather
    };
    int currentimg=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //使用代码方式来生成界面
       /* LinearLayout linearLayout=new LinearLayout(this);
        super.setContentView(linearLayout);
        linearLayout.setOrientation(linearLayout.VERTICAL);
        final TextView show=new TextView(this);
        Button bn=new Button(this);
        bn.setText("hhh");
        bn.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout.addView(show);
        linearLayout.addView(bn);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText("haha"+new java.util.Date());
            }
        });*/
       setContentView(R.layout.activity_main);
        LinearLayout main=(LinearLayout)findViewById(R.id.root);
        final ImageView image=new ImageView(this);
        final DrawView draw=new DrawView(this);
        draw.setMinimumHeight(500);
        draw.setMinimumWidth(300);

        main.addView(image);
        main.addView(draw);
        image.setImageResource(images[0]);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(images[++currentimg%images.length]);
            }
        });

    }
}
