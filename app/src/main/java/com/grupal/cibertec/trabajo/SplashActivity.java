package com.grupal.cibertec.trabajo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread myThread = new Thread(){
            @Override
            public void run(){
                try{
                    sleep(4000);
                    Intent startMainScreen = new Intent( getApplicationContext(), MainActivity.class);
                    startActivity(startMainScreen);
                    finish();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        myThread.start();

    }

}
