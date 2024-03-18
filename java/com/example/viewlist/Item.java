package com.example.viewlist;

public class Item {
    String name,nim;
    int image;

    public Item(String name, String nim, int image) {
        this.name = name;
        this.nim = nim;
        this.image = image;
    }

    public String getName() {
        return name;
    }
    public String getNim() {
        return nim;
    }
    public int getImage() {
        return image;
    }
}
