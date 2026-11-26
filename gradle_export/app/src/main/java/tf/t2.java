package tf;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.cast.MediaError;
import com.google.protobuf.RuntimeVersion;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public final class t2 extends d0 {
    public volatile q2 D;
    public volatile q2 E;
    public q2 F;
    public final ConcurrentHashMap G;
    public com.google.android.gms.internal.measurement.u0 H;
    public volatile boolean I;
    public volatile q2 J;
    public q2 K;
    public boolean L;
    public final Object M;

    public t2(h1 h1Var) {
        super(h1Var);
        this.M = new Object();
        this.G = new ConcurrentHashMap();
    }

    @Override
    public final boolean Y0() {
        return false;
    }

    public final void Z0(q2 q2Var, boolean z10, long j9) {
        h1 h1Var = (h1) this.B;
        v vVar = h1Var.N;
        h1.d(vVar);
        h1Var.K.getClass();
        vVar.Y0(SystemClock.elapsedRealtime());
        boolean z11 = q2Var != null && q2Var.f14697d;
        j3 j3Var = h1Var.H;
        h1.f(j3Var);
        if (!j3Var.G.h(j9, z11, z10) || q2Var == null) {
            return;
        }
        q2Var.f14697d = false;
    }

    public final q2 a1(com.google.android.gms.internal.measurement.u0 u0Var) {
        com.google.android.gms.common.internal.d0.h(u0Var);
        Integer numValueOf = Integer.valueOf(u0Var.A);
        ConcurrentHashMap concurrentHashMap = this.G;
        q2 q2Var = (q2) concurrentHashMap.get(numValueOf);
        if (q2Var == null) {
            String strC1 = c1(u0Var.B);
            e4 e4Var = ((h1) this.B).I;
            h1.e(e4Var);
            q2 q2Var2 = new q2(null, e4Var.R1(), strC1);
            concurrentHashMap.put(numValueOf, q2Var2);
            q2Var = q2Var2;
        }
        return this.J != null ? this.J : q2Var;
    }

    public final q2 b1(boolean z10) {
        W0();
        V0();
        if (!z10) {
            return this.F;
        }
        q2 q2Var = this.F;
        return q2Var != null ? q2Var : this.K;
    }

    public final String c1(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : RuntimeVersion.SUFFIX;
        h1 h1Var = (h1) this.B;
        int length2 = str2.length();
        h1Var.D.getClass();
        if (length2 <= 500) {
            return str2;
        }
        h1Var.D.getClass();
        return str2.substring(0, MediaError.DetailedErrorCode.SEGMENT_UNKNOWN);
    }

    public final void d1(com.google.android.gms.internal.measurement.u0 u0Var, Bundle bundle) {
        Bundle bundle2;
        if (!((h1) this.B).D.j1() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.G.put(Integer.valueOf(u0Var.A), new q2(bundle2.getString("name"), bundle2.getLong("id"), bundle2.getString("referrer_name")));
    }

    public final void e1(String str, q2 q2Var, boolean z10) {
        q2 q2Var2;
        q2 q2Var3 = this.D == null ? this.E : this.D;
        if (q2Var.f14695b == null) {
            q2Var2 = new q2(q2Var.f14694a, str != null ? c1(str) : null, q2Var.f14696c, q2Var.f14698e, q2Var.f14699f);
        } else {
            q2Var2 = q2Var;
        }
        this.E = this.D;
        this.D = q2Var2;
        h1 h1Var = (h1) this.B;
        h1Var.K.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        e1 e1Var = h1Var.G;
        h1.g(e1Var);
        e1Var.e1(new r2(this, q2Var2, q2Var3, jElapsedRealtime, z10));
    }

    public final void f1(q2 q2Var, q2 q2Var2, long j9, boolean z10, Bundle bundle) {
        boolean z11;
        boolean z12 = q2Var.f14698e;
        h1 h1Var = (h1) this.B;
        V0();
        boolean z13 = false;
        if (q2Var2 != null) {
            if (q2Var2.f14696c == q2Var.f14696c && Objects.equals(q2Var2.f14695b, q2Var.f14695b) && Objects.equals(q2Var2.f14694a, q2Var.f14694a)) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = true;
        }
        if (z10 && this.F != null) {
            z13 = true;
        }
        if (z11) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            e4.M1(q2Var, bundle2, true);
            if (q2Var2 != null) {
                String str = q2Var2.f14694a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = q2Var2.f14695b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", q2Var2.f14696c);
            }
            if (z13) {
                j3 j3Var = h1Var.H;
                h1.f(j3Var);
                s7.w0 w0Var = j3Var.G;
                long j10 = j9 - w0Var.B;
                w0Var.B = j9;
                if (j10 > 0) {
                    e4 e4Var = h1Var.I;
                    h1.e(e4Var);
                    e4Var.C1(bundle2, j10);
                }
            }
            if (!h1Var.D.j1()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != z12 ? "auto" : "app";
            h1Var.K.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z12) {
                long j11 = q2Var.f14699f;
                if (j11 != 0) {
                    jCurrentTimeMillis = j11;
                }
            }
            i2 i2Var = h1Var.M;
            h1.f(i2Var);
            i2Var.d1(jCurrentTimeMillis, bundle2, str3, "_vs");
        }
        if (z13) {
            Z0(this.F, true, j9);
        }
        this.F = q2Var;
        if (z12) {
            this.K = q2Var;
        }
        c3 c3VarJ = h1Var.j();
        c3VarJ.V0();
        c3VarJ.W0();
        c3VarJ.j1(new kh.r(c3VarJ, q2Var));
    }
}
