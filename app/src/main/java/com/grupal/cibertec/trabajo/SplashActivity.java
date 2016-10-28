package com.grupal.cibertec.trabajo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread myThread = new Thread(){
            @Override
            public void run(){
                try{
                    sleep(1000);
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
