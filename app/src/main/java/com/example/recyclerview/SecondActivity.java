package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView, detail;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();
        String str = bundle.getString("key");
        textView = findViewById(R.id.tv_name);
        detail = findViewById(R.id.tv_detail);
        imageView = findViewById(R.id.iv_char);

        textView.setText(str);
        detail.setText();
        imageView.setImageResource();
    }
}