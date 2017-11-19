package com.example.better110.arproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.tsengvn.typekit.TypekitContextWrapper;

public class LoginAct extends AppCompatActivity {

    EditText id, pw;
    String ids, pws;
    Intent intent;

    @Override
    protected void attachBaseContext(Context context) { //폰트적용
        super.attachBaseContext(TypekitContextWrapper.wrap(context));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void onClickButton(View v) {

        id = (EditText) findViewById(R.id.id); //아이디 값 받아오기
        pw = (EditText) findViewById(R.id.password); //비밀번호 값 받아오기
        ids = id.getText().toString();
        pws = pw.getText().toString();

        switch (v.getId() ) {
            case R.id.login :

                intent = new Intent(LoginAct.this, MainActivity.class);
                startActivity(intent);
                finish();

                /*--------------------------------------------------------------------------------*/
                /*파이어베이스  파연동해서 로그인 정보 확인 후 메인으로 들어가는 코드*/

//                if( (ids == ) && (pws == ) ) {
//                    intent = new Intent(LoginAct.this, MainActivity.class);
//                    startActivity(intent);
//                    finish();
//                }
//                else{
//                    Toast.makeText(this, "입력된 정보가 올바르지 않습니다.", Toast.LENGTH_SHORT).show();
//                    id.setText("");
//                    pw.setText("");
//                }
               /*---------------------------------------------------------------------------------*/

                break;
            case R.id.join :
                //회원가입 창 만들어 주세욧!!!!!!!!
                break;
        }

    }

}
