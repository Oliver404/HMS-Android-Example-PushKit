package com.oliverbotello.eha.pushkit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.common.ApiException;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getToken();
    }

    private void getToken() {
        new Thread() { // Create Thread
            @Override
            public void run() {
                try {
                    String appId = "<APP_ID>"; // APP ID
                    String tokenScope = "HCM"; // Type of Token
                    String token = HmsInstanceId.getInstance(getApplicationContext())
                            .getToken(appId, tokenScope); // Get Token

                    Log.e("Oliver 404", "get token: " + token); // Print token on console
                } catch (ApiException e) {
                    // Print error on console
                    Log.e("Oliver 404", "get token failed, " + e);
                }
            }
        }.start(); // Start thread
    }
}