package androidx.media3.common;

import android.net.Uri;
import com.google.protobuf.RuntimeVersion;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class d0 {

    public String f1156a;

    public Uri f1157b;

    public String f1158c;

    public t0 f1164i;

    public final e0 f1159d = new e0();

    public h0 f1160e = new h0();

    public final List f1161f = Collections.EMPTY_LIST;

    public final fh.t0 f1162g = fh.d2.E;

    public final j0 f1165j = new j0();

    public final m0 f1166k = m0.f1344d;

    public final long f1163h = -9223372036854775807L;

    public final q0 a() {
        l0 l0Var;
        h0 h0Var = this.f1160e;
        ta.c0.A(((Uri) h0Var.f1223e) == null || ((UUID) h0Var.f1222d) != null);
        Uri uri = this.f1157b;
        if (uri != null) {
            String str = this.f1158c;
            h0 h0Var2 = this.f1160e;
            l0Var = new l0(uri, str, ((UUID) h0Var2.f1222d) != null ? new i0(h0Var2) : null, null, this.f1161f, null, this.f1162g, this.f1163h);
        } else {
            l0Var = null;
        }
        String str2 = this.f1156a;
        if (str2 == null) {
            str2 = RuntimeVersion.SUFFIX;
        }
        String str3 = str2;
        e0 e0Var = this.f1159d;
        e0Var.getClass();
        g0 g0Var = new g0(e0Var);
        j0 j0Var = this.f1165j;
        j0Var.getClass();
        k0 k0Var = new k0(j0Var);
        t0 t0Var = this.f1164i;
        if (t0Var == null) {
            t0Var = t0.K;
        }
        return new q0(str3, g0Var, l0Var, k0Var, t0Var, this.f1166k);
    }
}
