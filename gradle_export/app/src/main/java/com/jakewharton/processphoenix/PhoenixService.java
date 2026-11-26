package com.jakewharton.processphoenix;

import android.app.IntentService;
import android.content.Intent;
import android.os.Process;
import android.os.StrictMode;

public final class PhoenixService extends IntentService {
    public PhoenixService() {
        super("PhoenixService");
    }

    @Override
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        Process.killProcess(intent.getIntExtra("phoenix_main_process_pid", -1));
        Intent intent2 = (Intent) intent.getParcelableExtra("phoenix_restart_intent", Intent.class);
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).permitUnsafeIntentLaunch().build());
        startForegroundService(intent2);
        Runtime.getRuntime().exit(0);
    }
}
