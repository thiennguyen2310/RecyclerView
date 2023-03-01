package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Item> list = new ArrayList<Item>();
        list.add(new Item("Eren Yeager", R.drawable.eren, "Main charactor of AoT"));
        list.add(new Item("Mikasa Ackerman", R.drawable.mikasa, "Sub charactor of AoT"));
        list.add(new Item("Levi Ackerman", R.drawable.levi, "Sub charactor of AoT"));
        list.add(new Item("Armin Alert", R.drawable.armin, "Sub charactor of AoT"));
        list.add(new Item("Mikasa Ackerman", R.drawable.mikasa, "Sub charactor of AoT"));
        list.add(new Item("Levi Ackerman", R.drawable.levi,"Sub charactor of AoT"));
        list.add(new Item("Reiner Braun", R.drawable.reiner, "Sub charactor of AoT"));


        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), list));
    }
}