package com.example.chwtlk.quizappandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread splash_Screen = new Thread(){

            public void run(){

                try{

                    sleep(1000);

                }catch(Exception e){

                    e.printStackTrace();

                }finally{

                    startActivity(new Intent(getApplicationContext(),GameLoginActivity.class));
                    finish();
                }
            }
        };
    }
}
