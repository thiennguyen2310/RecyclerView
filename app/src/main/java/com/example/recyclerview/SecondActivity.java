package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView, tv_detail;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();

        textView = findViewById(R.id.tv_name);
        tv_detail = findViewById(R.id.tv_detail);
        imageView = findViewById(R.id.iv_char);

        String name = bundle.getString("name");
        String detail = bundle.getString("detail");
        int image = bundle.getInt("image");

        textView.setText(name);
        tv_detail.setText(detail);
        imageView.setImageResource(image);
    }
}