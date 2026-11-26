package tf;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.protobuf.RuntimeVersion;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

public final class e3 extends t3 {
    public final HashMap E;
    public final i7.m1 F;
    public final i7.m1 G;
    public final i7.m1 H;
    public final i7.m1 I;
    public final i7.m1 J;
    public final i7.m1 K;

    public e3(y3 y3Var) {
        super(y3Var);
        this.E = new HashMap();
        w0 w0Var = ((h1) this.B).E;
        h1.e(w0Var);
        this.F = new i7.m1(w0Var, "last_delete_stale", 0L);
        w0 w0Var2 = ((h1) this.B).E;
        h1.e(w0Var2);
        this.G = new i7.m1(w0Var2, "last_delete_stale_batch", 0L);
        w0 w0Var3 = ((h1) this.B).E;
        h1.e(w0Var3);
        this.H = new i7.m1(w0Var3, "backoff", 0L);
        w0 w0Var4 = ((h1) this.B).E;
        h1.e(w0Var4);
        this.I = new i7.m1(w0Var4, "last_upload", 0L);
        w0 w0Var5 = ((h1) this.B).E;
        h1.e(w0Var5);
        this.J = new i7.m1(w0Var5, "last_upload_attempt", 0L);
        w0 w0Var6 = ((h1) this.B).E;
        h1.e(w0Var6);
        this.K = new i7.m1(w0Var6, "midnight_offset", 0L);
    }

    @Override
    public final void Y0() {
    }

    public final Pair Z0(String str) {
        d3 d3Var;
        ie.a aVarA;
        V0();
        h1 h1Var = (h1) this.B;
        ve.b bVar = h1Var.K;
        g gVar = h1Var.D;
        bVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.E;
        d3 d3Var2 = (d3) map.get(str);
        if (d3Var2 != null && jElapsedRealtime < d3Var2.f14615c) {
            return new Pair(d3Var2.f14613a, Boolean.valueOf(d3Var2.f14614b));
        }
        long jC1 = gVar.c1(str, b0.f14548b) + jElapsedRealtime;
        try {
            try {
                aVarA = ie.b.a(h1Var.A);
            } catch (PackageManager.NameNotFoundException unused) {
                if (d3Var2 != null && jElapsedRealtime < d3Var2.f14615c + gVar.c1(str, b0.f14551c)) {
                    return new Pair(d3Var2.f14613a, Boolean.valueOf(d3Var2.f14614b));
                }
                aVarA = null;
            }
            if (aVarA == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String str2 = aVarA.f7617a;
            d3Var = str2 != null ? new d3(jC1, str2, aVarA.f7618b) : new d3(jC1, RuntimeVersion.SUFFIX, aVarA.f7618b);
            map.put(str, d3Var);
            return new Pair(d3Var.f14613a, Boolean.valueOf(d3Var.f14614b));
        } catch (Exception e3) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.N.c(e3, "Unable to get advertising id");
            d3Var = new d3(jC1, RuntimeVersion.SUFFIX, false);
        }
    }

    public final String a1(String str, boolean z10) {
        V0();
        String str2 = z10 ? (String) Z0(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestM1 = e4.m1();
        if (messageDigestM1 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestM1.digest(str2.getBytes())));
    }
}
