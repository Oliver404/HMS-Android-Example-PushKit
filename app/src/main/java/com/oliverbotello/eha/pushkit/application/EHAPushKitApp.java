package com.oliverbotello.eha.pushkit.application;

import android.app.Application;

import com.huawei.hms.push.HmsMessaging;

public class EHAPushKitApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // setAutoInitEnabled(true);
    }

    /**
     * @param isEnable
     */
    private void setAutoInitEnabled(final boolean isEnable) {
        HmsMessaging.getInstance(this).setAutoInitEnabled(isEnable);
    }
}
