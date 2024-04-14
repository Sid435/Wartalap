package com.diester.wartalap;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sh = getSharedPreferences("isLoggedIn", MODE_PRIVATE);
                boolean a = sh.getBoolean("log", false);

                if(a){
                    startActivity(new Intent(SplashScreen.this, MainActivity.class));
                }else{
                    startActivity(new Intent(SplashScreen.this, LoginUsernameActivity.class));
                }
                finish();
            }
        }, 4000);
    }
}