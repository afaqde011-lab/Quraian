package qd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.play_billing.d4;
import com.google.android.gms.internal.play_billing.e4;
import com.google.android.gms.internal.play_billing.s3;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.u3;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.protobuf.RuntimeVersion;
import java.util.Objects;

public final class r0 extends BroadcastReceiver {

    public h f12960a;

    public boolean f12961b = false;

    public final n0 f12962c;

    public r0(q3.e0 e0Var) {
        this.f12962c = e0Var;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        w3 w3Var;
        if (intent == null) {
            com.google.android.gms.internal.play_billing.q.h("ProxyBillingReceiver", "Null intent!");
            return;
        }
        com.google.android.gms.internal.play_billing.q.g("ProxyBillingReceiver", "Received intent action: ".concat(String.valueOf(intent.getAction())));
        boolean zEquals = Objects.equals(intent.getAction(), "com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION");
        n0 n0Var = this.f12962c;
        if (zEquals) {
            if (!intent.hasExtra("RESPONSE_CODE")) {
                com.google.android.gms.internal.play_billing.q.h("ProxyBillingReceiver", "Missing RESPONSE_CODE in intent.");
                if (n0Var != null) {
                    ((q3.e0) n0Var).C(null, intent.getLongExtra("billingClientTransactionId", 0L));
                    return;
                }
                return;
            }
            a8.a aVarA = h.a();
            aVarA.f194b = intent.getIntExtra("RESPONSE_CODE", 0);
            String stringExtra = intent.getStringExtra("DEBUG_MESSAGE");
            if (stringExtra == null) {
                stringExtra = RuntimeVersion.SUFFIX;
            }
            aVarA.f193a = stringExtra;
            h hVarA = aVarA.a();
            this.f12960a = hVarA;
            if (n0Var != null) {
                ((q3.e0) n0Var).C(hVarA, intent.getLongExtra("billingClientTransactionId", 0L));
                return;
            }
            return;
        }
        if (!Objects.equals(intent.getAction(), "com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION")) {
            com.google.android.gms.internal.play_billing.q.h("ProxyBillingReceiver", "Unexpected broadcast action: ".concat(String.valueOf(intent.getAction())));
            return;
        }
        this.f12961b = true;
        if (n0Var != null) {
            long longExtra = intent.getLongExtra("billingClientTransactionId", 0L);
            q3.e0 e0Var = (q3.e0) n0Var;
            try {
                t3 t3VarR = u3.r();
                t3VarR.c();
                u3.w((u3) t3VarR.B, 4);
                s3 s3Var = s3.PLAY_BILLING_ACTIVITY_CREATED_ACTION;
                t3VarR.c();
                u3.s((u3) t3VarR.B, s3Var);
                u3 u3Var = (u3) t3VarR.a();
                d4 d4VarT = e4.t();
                if (longExtra == 0) {
                    w3Var = (w3) e0Var.B;
                } else {
                    v3 v3Var = (v3) ((w3) e0Var.B).l();
                    v3Var.g(longExtra);
                    w3Var = (w3) v3Var.a();
                }
                d4VarT.e(w3Var);
                d4VarT.c();
                e4.x((e4) d4VarT.B, u3Var);
                ((androidx.media3.common.q) e0Var.C).t((e4) d4VarT.a());
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to log.", th2);
            }
        }
    }
}
