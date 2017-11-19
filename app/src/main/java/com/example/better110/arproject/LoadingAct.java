package com.example.better110.arproject;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.tsengvn.typekit.TypekitContextWrapper;

public class LoadingAct extends AppCompatActivity {

    @Override
    protected void attachBaseContext(Context context) { //폰트적용
        super.attachBaseContext(TypekitContextWrapper.wrap(context));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_loading);

        Handler handler = new Handler(); //3초 후 로딩화면에서 로그인화면으로 넘어감
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getBaseContext(), LoginAct.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}
