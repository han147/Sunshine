package com.example.android.sunshine.app.gcm;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * Created by hanjeong on 2017. 1. 20..
 */

public class MyInstanceIDListnerService extends InstanceIDListenerService{
    private static final String TAG ="MyInstanceIdLS";

    @Override
    public void onTokenRefresh() {

        Intent intent = new Intent(this, RegistrationIntentService.class);
        startService(intent);
    }
}
