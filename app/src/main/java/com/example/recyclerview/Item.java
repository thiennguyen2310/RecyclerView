package com.example.recyclerview;

public class Item {

    String context;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    int image;
    String detail;

    public Item(String context, int image, String detail) {
        this.context = context;
        this.image = image;
        this.detail = detail;
    }



}
