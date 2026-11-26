package s7;

import android.net.Uri;
import androidx.media3.common.h2;
import androidx.media3.common.j2;
import androidx.media3.common.k2;
import fh.d2;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class e1 extends k2 {

    public static final Object f13664f = new Object();

    public final long f13665a;

    public final long f13666b;

    public final boolean f13667c;

    public final androidx.media3.common.q0 f13668d;

    public final androidx.media3.common.k0 f13669e;

    static {
        androidx.media3.common.e0 e0Var = new androidx.media3.common.e0();
        androidx.media3.common.h0 h0Var = new androidx.media3.common.h0();
        List list = Collections.EMPTY_LIST;
        d2 d2Var = d2.E;
        androidx.media3.common.j0 j0Var = new androidx.media3.common.j0();
        androidx.media3.common.m0 m0Var = androidx.media3.common.m0.f1344d;
        Uri uri = Uri.EMPTY;
        ta.c0.A(((Uri) h0Var.f1223e) == null || ((UUID) h0Var.f1222d) != null);
        if (uri != null) {
            new androidx.media3.common.l0(uri, null, ((UUID) h0Var.f1222d) != null ? new androidx.media3.common.i0(h0Var) : null, null, list, null, d2Var, -9223372036854775807L);
        }
        new androidx.media3.common.g0(e0Var);
        new androidx.media3.common.k0(j0Var);
        androidx.media3.common.t0 t0Var = androidx.media3.common.t0.K;
    }

    public e1(long j9, boolean z10, boolean z11, androidx.media3.common.q0 q0Var) {
        androidx.media3.common.k0 k0Var = z11 ? q0Var.f1415c : null;
        this.f13665a = j9;
        this.f13666b = j9;
        this.f13667c = z10;
        q0Var.getClass();
        this.f13668d = q0Var;
        this.f13669e = k0Var;
    }

    @Override
    public final int getIndexOfPeriod(Object obj) {
        return f13664f.equals(obj) ? 0 : -1;
    }

    @Override
    public final h2 getPeriod(int i10, h2 h2Var, boolean z10) {
        ta.c0.u(i10, 1);
        h2Var.i(null, z10 ? f13664f : null, 0, this.f13665a, 0L);
        return h2Var;
    }

    @Override
    public final int getPeriodCount() {
        return 1;
    }

    @Override
    public final Object getUidOfPeriod(int i10) {
        ta.c0.u(i10, 1);
        return f13664f;
    }

    @Override
    public final j2 getWindow(int i10, j2 j2Var, long j9) {
        ta.c0.u(i10, 1);
        j2Var.b(j2.f1273q, this.f13668d, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f13667c, false, this.f13669e, 0L, this.f13666b, 0, 0, 0L);
        return j2Var;
    }

    @Override
    public final int getWindowCount() {
        return 1;
    }
}
