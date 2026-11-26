package com.android.billingclient.api;

import a8.a;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.internal.play_billing.h4;
import com.google.android.gms.internal.play_billing.i4;
import com.google.android.gms.internal.play_billing.q;
import com.google.android.gms.internal.play_billing.s3;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import e4.f;
import q3.e0;
import qd.h;
import qd.m0;
import qd.r0;

public class ProxyBillingActivity extends Activity {
    public ResultReceiver A;
    public boolean B;
    public boolean C;
    public int D;
    public long E;
    public boolean F;
    public r0 G;
    public e0 H;

    public static int a(Intent intent, int i10) {
        if (intent != null) {
            if (intent.getExtras() == null) {
                return 22;
            }
            return i10 == 5 ? 139 : 1;
        }
        if (i10 == -1) {
            return 113;
        }
        if (i10 == 0) {
            return 114;
        }
        if (i10 != 3) {
            return i10 != 4 ? 117 : 116;
        }
        return 115;
    }

    public final Intent b(int i10, long j9, boolean z10) {
        h hVar;
        Intent intentC = c();
        s3 s3Var = s3.BROADCAST_ACTION_UNSPECIFIED;
        if (z10) {
            r0 r0Var = this.G;
            if (r0Var != null && (hVar = r0Var.f12960a) != null) {
                intentC.putExtra("RESPONSE_CODE", hVar.f12892a);
                intentC.putExtra("DEBUG_MESSAGE", hVar.f12894c);
            } else if (r0Var == null || r0Var.f12961b) {
                intentC.putExtra("RESPONSE_CODE", 6);
                intentC.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                a aVarA = h.a();
                aVarA.f194b = 6;
                aVarA.f193a = "An internal error occurred.";
                intentC.putExtra("FAILURE_LOGGING_PAYLOAD", m0.b(i10, 2, aVarA.a(), null, s3Var).b());
            } else {
                intentC.putExtra("RESPONSE_CODE", 3);
                intentC.putExtra("DEBUG_MESSAGE", "Play Store is blocked.");
                a aVarA2 = h.a();
                aVarA2.f194b = 3;
                aVarA2.f193a = "Play Store is blocked.";
                intentC.putExtra("FAILURE_LOGGING_PAYLOAD", m0.b(142, 2, aVarA2.a(), null, s3Var).b());
            }
        } else {
            intentC.putExtra("RESPONSE_CODE", 6);
            intentC.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
            a aVarA3 = h.a();
            aVarA3.f194b = 6;
            aVarA3.f193a = "An internal error occurred.";
            intentC.putExtra("FAILURE_LOGGING_PAYLOAD", m0.b(i10, 2, aVarA3.a(), null, s3Var).b());
        }
        intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentC.putExtra("billingClientTransactionId", j9);
        intentC.putExtra("wasServiceAutoReconnected", this.F);
        return intentC;
    }

    public final Intent c() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    @Override
    public final void onActivityResult(int i10, int i11, Intent intent) {
        boolean z10;
        int i12;
        int i13;
        String string;
        Intent intentC;
        boolean z11;
        int i14;
        ResultReceiver resultReceiver;
        Bundle extras;
        super.onActivityResult(i10, i11, intent);
        if (i10 == 100) {
            if (intent == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            i12 = q.e("ProxyBillingActivity", intent).f12892a;
            i13 = -1;
            if (i11 != -1) {
                q.h("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + i12);
                i13 = i11;
            } else if (i12 != 0) {
                i11 = -1;
                q.h("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + i12);
                i13 = i11;
            }
            if (true != z10) {
                q.h("ProxyBillingActivity", "Got null data with resultCode " + i13 + "!");
            } else if (intent.getExtras() == null) {
                q.h("ProxyBillingActivity", "Got null bundle!");
            }
            if (f.a(a(intent, i13), 1)) {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent2 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent2.setPackage(getApplicationContext().getPackageName());
                    intent2.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent2.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentC = intent2;
                } else {
                    intentC = c();
                    intentC.putExtras(intent.getExtras());
                    intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentC.putExtra("billingClientTransactionId", this.E);
                intentC.putExtra("wasServiceAutoReconnected", this.F);
            } else {
                int iA = a(intent, i13);
                long j9 = this.E;
                if (intent == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                intentC = b(iA, j9, z11);
            }
            if (i10 == 110) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentC);
        } else if (i10 == 110) {
            if (intent == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            i12 = q.e("ProxyBillingActivity", intent).f12892a;
            i13 = -1;
            if (i11 != -1) {
                q.h("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + i12);
                i13 = i11;
            } else if (i12 != 0) {
                i11 = -1;
                q.h("ProxyBillingActivity", "Activity finished with resultCode " + i11 + " and billing's responseCode: " + i12);
                i13 = i11;
            }
            if (true != z10) {
                q.h("ProxyBillingActivity", "Got null data with resultCode " + i13 + "!");
            } else if (intent.getExtras() == null) {
                q.h("ProxyBillingActivity", "Got null bundle!");
            }
            if (f.a(a(intent, i13), 1)) {
                int iA2 = a(intent, i13);
                long j10 = this.E;
                if (intent == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                intentC = b(iA2, j10, z11);
            } else {
                string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string != null) {
                    Intent intent3 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                    intent3.setPackage(getApplicationContext().getPackageName());
                    intent3.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                    intent3.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                    intentC = intent3;
                } else {
                    intentC = c();
                    intentC.putExtras(intent.getExtras());
                    intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                }
                intentC.putExtra("billingClientTransactionId", this.E);
                intentC.putExtra("wasServiceAutoReconnected", this.F);
            }
            if (i10 == 110) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            sendBroadcast(intentC);
        } else if (i10 == 101) {
            int i15 = q.f4028a;
            if (intent == null) {
                q.h("ProxyBillingActivity", "Got null intent!");
                intent = null;
            } else {
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    q.h("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i14 = extras2.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                }
                resultReceiver = this.A;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i14, extras);
                }
            }
            i14 = 0;
            resultReceiver = this.A;
            if (resultReceiver != null) {
                if (intent == null) {
                    extras = null;
                } else {
                    extras = intent.getExtras();
                }
                resultReceiver.send(i14, extras);
            }
        } else {
            q.h("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i10 + "; skipping...");
        }
        this.B = false;
        r0 r0Var = this.G;
        if (r0Var != null) {
            r0Var.f12960a = null;
        }
        finish();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean zContainsKey;
        int i10;
        PendingIntent pendingIntent;
        Bundle bundle2;
        Bundle bundle3;
        super.onCreate(bundle);
        if (bundle == null) {
            zContainsKey = getIntent() == null ? false : getIntent().hasExtra("IN_APP_MESSAGE_INTENT");
        } else {
            zContainsKey = bundle.containsKey("in_app_message_result_receiver");
        }
        if (!zContainsKey) {
            try {
                i10 = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e3) {
                q.i("ProxyBillingActivity", "Failed to get package info for current package.", e3);
                i10 = -1;
            }
            if (this.H == null) {
                Context applicationContext = getApplicationContext();
                v3 v3VarB = w3.B();
                v3VarB.j(getPackageName());
                v3VarB.k();
                v3VarB.f(i10);
                v3VarB.e(Build.VERSION.SDK_INT);
                v3VarB.h();
                this.H = new e0(applicationContext, (w3) v3VarB.a());
            }
            synchronized (this) {
                try {
                    this.G = new r0(this.H);
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION");
                    intentFilter.addAction("com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION");
                    registerReceiver(this.G, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, 2);
                } catch (NoSuchMethodError | RuntimeException e10) {
                    this.G = null;
                    if (e10 instanceof NoSuchMethodError) {
                        e0 e0Var = this.H;
                        h4 h4VarR = i4.r();
                        h4VarR.c();
                        i4.s((i4) h4VarR.B, 2);
                        e0Var.D((i4) h4VarR.a());
                    } else {
                        e0 e0Var2 = this.H;
                        h4 h4VarR2 = i4.r();
                        h4VarR2.c();
                        i4.s((i4) h4VarR2.B, 1);
                        e0Var2.D((i4) h4VarR2.a());
                    }
                    q.i("ProxyBillingActivity", "Failed to register receiver.", e10);
                }
            }
        }
        if (bundle != null) {
            q.g("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.B = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.A = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.C = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.D = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.E = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.F = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        q.g("ProxyBillingActivity", "Launching Play Store billing flow");
        this.D = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.C = true;
                this.D = MediaError.DetailedErrorCode.SOURCE_BUFFER_FAILURE;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.A = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.D = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.E = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.F = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.B = true;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 36) {
                if (i11 >= 34) {
                    bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
                } else {
                    bundle2 = null;
                }
                startIntentSenderForResult(pendingIntent.getIntentSender(), this.D, new Intent(), 0, 0, 0, bundle2);
            }
            bundle3 = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(3).toBundle();
            bundle2 = bundle3;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.D, new Intent(), 0, 0, 0, bundle2);
        } catch (IntentSender.SendIntentException e11) {
            q.i("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e11);
            ResultReceiver resultReceiver = this.A;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentB = b(137, this.E, false);
                if (this.C) {
                    intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentB);
            }
            this.B = false;
            finish();
        }
    }

    @Override
    public final void onDestroy() {
        h hVar;
        super.onDestroy();
        r0 r0Var = this.G;
        if (r0Var != null) {
            hVar = r0Var.f12960a;
            try {
                unregisterReceiver(r0Var);
            } catch (RuntimeException e3) {
                q.i("ProxyBillingActivity", "Failed to unregister receiver.", e3);
            }
        } else {
            hVar = null;
        }
        if (isFinishing() && this.B) {
            Intent intentC = c();
            if (hVar != null) {
                intentC.putExtra("RESPONSE_CODE", hVar.f12892a);
                intentC.putExtra("DEBUG_MESSAGE", hVar.f12894c);
            } else {
                intentC.putExtra("RESPONSE_CODE", 1);
                intentC.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            }
            if (this.C) {
                intentC.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i10 = this.D;
            if (i10 == 110 || i10 == 100) {
                intentC.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentC.putExtra("billingClientTransactionId", this.E);
            }
            sendBroadcast(intentC);
        }
    }

    @Override
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.A;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.B);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.C);
        bundle.putInt("activity_code", this.D);
        bundle.putLong("billingClientTransactionId", this.E);
        bundle.putBoolean("wasServiceAutoReconnected", this.F);
    }
}
