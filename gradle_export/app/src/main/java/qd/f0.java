package qd;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.play_billing.v1;
import com.google.protobuf.RuntimeVersion;
import java.util.Arrays;
import java.util.Objects;

public final class f0 extends bh.a {

    public final d0 f12880f;

    public final Boolean f12881g;

    public final int f12882h;

    public final b f12883i;

    public f0(b bVar, d0 d0Var, Boolean bool, int i10) {
        super("com.android.vending.billing.IInAppBillingInitializeCallback", 1);
        Objects.requireNonNull(bVar);
        this.f12883i = bVar;
        this.f12880f = d0Var;
        this.f12881g = bool;
        this.f12882h = i10;
    }

    @Override
    public final boolean f(int i10, Parcel parcel, Parcel parcel2) {
        com.google.android.gms.internal.play_billing.t c0Var;
        if (i10 != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) com.google.android.gms.internal.play_billing.d.a(parcel);
        bh.a.g2(parcel);
        if (bundle == null) {
            com.google.android.gms.internal.play_billing.q.h("BillingClient", "Response bundle is null.");
            k2(this.f12880f, o0.f12932h, 122, this.f12881g.booleanValue(), null, this.f12882h);
            return true;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            com.google.android.gms.internal.play_billing.q.h("BillingClient", "Response bundle doesn't contain a response code");
            k2(this.f12880f, o0.f12932h, 129, this.f12881g.booleanValue(), null, this.f12882h);
            return true;
        }
        if (bundle.getInt("RESPONSE_CODE") != 0) {
            k2(this.f12880f, o0.a(bundle.getInt("RESPONSE_CODE"), bundle.getString("DEBUG_MESSAGE", RuntimeVersion.SUFFIX)), 130, this.f12881g.booleanValue(), g4.c.f(bundle.getInt("RESPONSE_CODE"), "Response code from Phonesky: "), this.f12882h);
            return true;
        }
        if (!bundle.containsKey("BILLING_API_VERSION_KEY")) {
            com.google.android.gms.internal.play_billing.q.h("BillingClient", "Billing API version not found in response bundle.");
            k2(this.f12880f, o0.f12932h, Cast.MAX_NAMESPACE_LENGTH, this.f12881g.booleanValue(), null, this.f12882h);
            return true;
        }
        int i11 = bundle.getInt("BILLING_API_VERSION_KEY");
        b bVar = this.f12883i;
        b.s(bVar, i11);
        bVar.l = i11 >= 5;
        bVar.f12849k = i11 >= 3;
        Bundle bundle2 = bundle.getBundle("EXPERIMENT_VALUES_KEY");
        if (bundle2 != null) {
            try {
                y3.f3921c = bundle2.getBoolean("DELEGATION_API_ENABLED_KEY");
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.q.i("BillingClient", "Error reading EnableDelegationApi experiment flag: ".concat(bundle2.toString()), th2);
            }
            try {
                bundle2.getLong("AUTO_SERVICE_RECONNECTION_SYNCHRONOUS_TIMEOUT_MS_KEY");
            } catch (Throwable th3) {
                com.google.android.gms.internal.play_billing.q.i("BillingClient", "Error reading AutoServiceReconnectionSynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th3);
            }
            try {
                y3.f3922d = bundle2.getLong("AUTO_SERVICE_RECONNECTION_ASYNCHRONOUS_TIMEOUT_MS_KEY");
            } catch (Throwable th4) {
                com.google.android.gms.internal.play_billing.q.i("BillingClient", "Error reading AutoServiceReconnectionAsynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th4);
            }
            try {
                y3.f3923e = bundle2.getInt("AUTO_SERVICE_RECONNECTION_MAX_NUM_RETRIES_KEY");
            } catch (Throwable th5) {
                com.google.android.gms.internal.play_billing.q.i("BillingClient", "Error reading AutoServiceReconnectionMaxNumRetries experiment flag: ".concat(bundle2.toString()), th5);
            }
            try {
                y3.f3924f = bundle2.getBoolean("ENABLE_DEDUPLICATE_SERVICE_DISCONNECTED_CALLBACK");
            } catch (Throwable th6) {
                com.google.android.gms.internal.play_billing.q.i("BillingClient", "Error reading EnableDeduplicateServiceDisconnectedCallback experiment flag: ".concat(bundle2.toString()), th6);
            }
        }
        Bundle bundle3 = bundle.getBundle("ENABLED_SUBSCRIPTION_CLIENT_ACTIONS_KEY");
        if (bundle3 != null) {
            Object[] objArrCopyOf = new Object[4];
            int i12 = 0;
            for (t0 t0Var : t0.values()) {
                if (bundle3.getBoolean(t0Var.name(), false)) {
                    int length = objArrCopyOf.length;
                    int i13 = i12 + 1;
                    int iB = v1.b(length, i13);
                    if (iB > length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                    }
                    objArrCopyOf[i12] = t0Var;
                    i12 = i13;
                }
            }
            b bVar2 = this.f12883i;
            if (i12 == 0) {
                c0Var = com.google.android.gms.internal.play_billing.b0.J;
            } else if (i12 != 1) {
                c0Var = com.google.android.gms.internal.play_billing.t.m(i12, objArrCopyOf);
                c0Var.size();
            } else {
                Object obj = objArrCopyOf[0];
                Objects.requireNonNull(obj);
                c0Var = new com.google.android.gms.internal.play_billing.c0(obj);
            }
            bVar2.E = c0Var;
            if (bVar2.f12844f != null) {
                bVar2.f12844f.f9192g = bVar2.E;
            }
        }
        b bVar3 = this.f12883i;
        if (bVar3.m < 3) {
            com.google.android.gms.internal.play_billing.q.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
            k2(this.f12880f, o0.f12926b, 36, this.f12881g.booleanValue(), null, this.f12882h);
        } else {
            d0 d0Var = this.f12880f;
            Boolean bool = this.f12881g;
            int i14 = this.f12882h;
            boolean zBooleanValue = bool.booleanValue();
            b.t(bVar3, 0);
            synchronized (bVar3.f12839a) {
                try {
                    if (bVar3.f12840b != 3) {
                        d0Var.c(zBooleanValue, i14);
                        d0Var.d(o0.f12933i);
                    }
                } catch (Throwable th7) {
                    throw th7;
                }
            }
        }
        return true;
    }

    public final void k2(d0 d0Var, h hVar, int i10, boolean z10, String str, int i11) {
        this.f12883i.I(0);
        d0Var.b(hVar, i10, str, z10, i11);
        d0Var.d(hVar);
    }
}
