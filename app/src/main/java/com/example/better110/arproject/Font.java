package com.example.better110.arproject;

import android.app.Application;

import com.tsengvn.typekit.Typekit;

/**
 * Created by better110 on 2017-11-19.
 */

public class Font extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Typekit.getInstance()
                .addNormal(Typekit.createFromAsset(this,"SDMiSaeng.ttf"))
                .addBold(Typekit.createFromAsset(this, "SDMiSaeng.ttf"));

    }
}
