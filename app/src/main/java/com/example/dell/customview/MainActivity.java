package com.example.dell.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout root=(LinearLayout)findViewById(R.id.root);
        final DrawView draw=new DrawView(this);
        root.addView(draw);
    }
}
