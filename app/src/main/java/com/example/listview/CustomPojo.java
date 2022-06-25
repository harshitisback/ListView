package com.example.listview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class CustomPojo {
    int images;
    String langName;

    public CustomPojo(int images, String langName) {
        this.images = images;
        this.langName = langName;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }


}
