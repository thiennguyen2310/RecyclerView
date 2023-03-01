package com.example.recyclerview;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView textView, detail;
    ImageView imageView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.tv_context);
        detail = itemView.findViewById(R.id.item_detail);
        imageView = itemView.findViewById(R.id.iv_image);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int position = getAbsoluteAdapterPosition();
        Context context = v.getContext();
        Intent intent = new Intent(context, SecondActivity.class);
        if (position == 0) {
            intent.putExtra("key", "This is Eren Yeager. Main character in AoT");
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        } else {
            intent.putExtra("key", "This is support character in AoT");
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        }
    }
}
