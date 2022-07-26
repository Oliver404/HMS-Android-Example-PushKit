package com.oliverbotello.eha.pushkit.services;

import android.util.Log;

import com.huawei.hms.push.HmsMessageService;

public class MyHmsMessageService extends HmsMessageService {
    @Override
    public void onNewToken(String token) {
        super.onNewToken(token);
        Log.e("Oliver 404", token);
    }
}
