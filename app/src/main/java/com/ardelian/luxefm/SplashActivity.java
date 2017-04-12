package com.ardelian.luxefm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity implements Constants{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intentMain = new Intent(this, MainActivity.class);
        Intent intentNoInternet = new Intent(this, NoInternetActivity.class);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (new ConnectivityStatus(getApplicationContext()).connectionAccess()) {
            startActivity(intentMain);
        }else{
            startActivity(intentNoInternet);
        }
        finish();
    }
}