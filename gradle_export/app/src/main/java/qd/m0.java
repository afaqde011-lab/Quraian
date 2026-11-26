package qd;

import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.n3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.q3;
import com.google.android.gms.internal.play_billing.s3;
import com.google.protobuf.RuntimeVersion;

public abstract class m0 {

    public static final int f12911a = 0;

    static {
        int i10 = n0.f12918q;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = RuntimeVersion.SUFFIX;
            }
            String str = simpleName + ":" + message;
            int i10 = com.google.android.gms.internal.play_billing.q.f4028a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to get truncated exception info", th2);
            return null;
        }
    }

    public static m3 b(int i10, int i11, h hVar, String str, s3 s3Var) {
        try {
            p3 p3VarS = q3.s();
            p3VarS.f(hVar.f12892a);
            String str2 = hVar.f12894c;
            p3VarS.c();
            q3.u((q3) p3VarS.B, str2);
            int i12 = hVar.f12893b;
            if (i12 != 0) {
                p3VarS.c();
                q3.w((q3) p3VarS.B, i12);
            }
            if (i10 != 0) {
                p3VarS.e(i10);
            }
            if (str != null) {
                p3VarS.c();
                q3.t((q3) p3VarS.B, str);
            }
            l3 l3VarU = m3.u();
            l3VarU.e(p3VarS);
            l3VarU.g(i11);
            if (!s3Var.equals(s3.BROADCAST_ACTION_UNSPECIFIED)) {
                l3VarU.c();
                m3.x((m3) l3VarU.B, s3Var);
            }
            return (m3) l3VarU.a();
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to create logging payload", th2);
            return null;
        }
    }

    public static o3 c(int i10, s3 s3Var) {
        try {
            n3 n3VarS = o3.s();
            n3VarS.c();
            o3.r((o3) n3VarS.B, i10);
            if (!s3Var.equals(s3.BROADCAST_ACTION_UNSPECIFIED)) {
                n3VarS.c();
                o3.u((o3) n3VarS.B, s3Var);
            }
            return (o3) n3VarS.a();
        } catch (Exception e3) {
            com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to create logging payload", e3);
            return null;
        }
    }
}
