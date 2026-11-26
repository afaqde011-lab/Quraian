package tf;

import android.os.Bundle;
import com.google.android.gms.cast.MediaError;
import java.util.TreeSet;

public final class d2 implements Runnable {
    public final int A;
    public final i2 B;
    public final Bundle C;

    public d2(i2 i2Var, Bundle bundle, int i10) {
        this.A = i10;
        this.C = bundle;
        this.B = i2Var;
    }

    @Override
    public final void run() {
        Bundle bundle;
        switch (this.A) {
            case 0:
                i2 i2Var = this.B;
                i2Var.V0();
                i2Var.W0();
                Bundle bundle2 = this.C;
                String string = bundle2.getString("name");
                String string2 = bundle2.getString("origin");
                com.google.android.gms.common.internal.d0.e(string);
                com.google.android.gms.common.internal.d0.e(string2);
                com.google.android.gms.common.internal.d0.h(bundle2.get("value"));
                h1 h1Var = (h1) i2Var.B;
                if (!h1Var.a()) {
                    q0 q0Var = h1Var.F;
                    h1.g(q0Var);
                    q0Var.O.b("Conditional property not set since app measurement is disabled");
                } else {
                    b4 b4Var = new b4(bundle2.getLong("triggered_timestamp"), bundle2.get("value"), string, string2);
                    try {
                        e4 e4Var = h1Var.I;
                        h1.e(e4Var);
                        bundle2.getString("app_id");
                        s sVarX1 = e4Var.x1(bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0L, true);
                        h1.e(e4Var);
                        bundle2.getString("app_id");
                        s sVarX2 = e4Var.x1(bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0L, true);
                        bundle2.getString("app_id");
                        h1Var.j().o1(new e(bundle2.getString("app_id"), string2, b4Var, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), sVarX2, bundle2.getLong("trigger_timeout"), sVarX1, bundle2.getLong("time_to_live"), e4Var.x1(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0L, true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            default:
                i2 i2Var2 = this.B;
                o9.q qVar = i2Var2.X;
                h1 h1Var2 = (h1) i2Var2.B;
                Bundle bundle3 = this.C;
                if (bundle3.isEmpty()) {
                    bundle = bundle3;
                } else {
                    w0 w0Var = h1Var2.E;
                    e4 e4Var2 = h1Var2.I;
                    g gVar = h1Var2.D;
                    q0 q0Var2 = h1Var2.F;
                    h1.e(w0Var);
                    bundle = new Bundle(w0Var.Z.F());
                    for (String str : bundle3.keySet()) {
                        Object obj = bundle3.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            h1.e(e4Var2);
                            if (e4.d2(obj)) {
                                e4.l1(qVar, null, 27, null, null, 0);
                            }
                            h1.g(q0Var2);
                            q0Var2.L.d("Invalid default event parameter type. Name, value", str, obj);
                        } else if (e4.t1(str)) {
                            h1.g(q0Var2);
                            q0Var2.L.c(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle.remove(str);
                        } else {
                            h1.e(e4Var2);
                            gVar.getClass();
                            if (e4Var2.e2("param", str, MediaError.DetailedErrorCode.SEGMENT_UNKNOWN, obj)) {
                                e4Var2.k1(bundle, str, obj);
                            }
                        }
                    }
                    h1.e(e4Var2);
                    e4 e4Var3 = ((h1) gVar.B).I;
                    h1.e(e4Var3);
                    int i10 = e4Var3.A1(201500000) ? 100 : 25;
                    if (bundle.size() > i10) {
                        int i11 = 0;
                        for (String str2 : new TreeSet(bundle.keySet())) {
                            i11++;
                            if (i11 > i10) {
                                bundle.remove(str2);
                            }
                        }
                        h1.e(e4Var2);
                        e4.l1(qVar, null, 26, null, null, 0);
                        h1.g(q0Var2);
                        q0Var2.L.b("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                }
                w0 w0Var2 = h1Var2.E;
                h1.e(w0Var2);
                w0Var2.Z.G(bundle);
                if (!bundle3.isEmpty() || h1Var2.D.f1(null, b0.W0)) {
                    h1Var2.j().a1(bundle);
                }
                break;
        }
    }
}
