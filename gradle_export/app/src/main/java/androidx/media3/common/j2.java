package androidx.media3.common;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public final class j2 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;

    public static final Object f1273q = new Object();

    public static final Object f1274r = new Object();

    public static final q0 f1275s;

    public static final String f1276t;

    public static final String f1277u;

    public static final String f1278v;

    public static final String f1279w;

    public static final String f1280x;

    public static final String f1281y;

    public static final String f1282z;

    public Object f1284b;

    public Object f1286d;

    public long f1287e;

    public long f1288f;

    public long f1289g;

    public boolean f1290h;

    public boolean f1291i;

    public k0 f1292j;

    public boolean f1293k;
    public long l;
    public long m;

    public int f1294n;

    public int f1295o;

    public long f1296p;

    public Object f1283a = f1273q;

    public q0 f1285c = f1275s;

    static {
        l0 l0Var;
        e0 e0Var = new e0();
        h0 h0Var = new h0();
        List list = Collections.EMPTY_LIST;
        fh.d2 d2Var = fh.d2.E;
        j0 j0Var = new j0();
        m0 m0Var = m0.f1344d;
        Uri uri = Uri.EMPTY;
        ta.c0.A(((Uri) h0Var.f1223e) == null || ((UUID) h0Var.f1222d) != null);
        i0 i0Var = null;
        if (uri != null) {
            if (((UUID) h0Var.f1222d) != null) {
                i0Var = new i0(h0Var);
            }
            l0Var = new l0(uri, null, i0Var, null, list, null, d2Var, -9223372036854775807L);
        } else {
            l0Var = null;
        }
        f1275s = new q0("androidx.media3.common.Timeline", new g0(e0Var), l0Var, new k0(j0Var), t0.K, m0Var);
        f1276t = Integer.toString(1, 36);
        f1277u = Integer.toString(2, 36);
        f1278v = Integer.toString(3, 36);
        f1279w = Integer.toString(4, 36);
        f1280x = Integer.toString(5, 36);
        f1281y = Integer.toString(6, 36);
        f1282z = Integer.toString(7, 36);
        A = Integer.toString(8, 36);
        B = Integer.toString(9, 36);
        C = Integer.toString(10, 36);
        D = Integer.toString(11, 36);
        E = Integer.toString(12, 36);
        F = Integer.toString(13, 36);
    }

    public final boolean a() {
        return this.f1292j != null;
    }

    public final void b(Object obj, q0 q0Var, Object obj2, long j9, long j10, long j11, boolean z10, boolean z11, k0 k0Var, long j12, long j13, int i10, int i11, long j14) {
        this.f1283a = obj;
        this.f1285c = q0Var != null ? q0Var : f1275s;
        if (q0Var != null) {
            l0 l0Var = q0Var.f1414b;
        }
        this.f1284b = null;
        this.f1286d = obj2;
        this.f1287e = j9;
        this.f1288f = j10;
        this.f1289g = j11;
        this.f1290h = z10;
        this.f1291i = z11;
        this.f1292j = k0Var;
        this.l = j12;
        this.m = j13;
        this.f1294n = i10;
        this.f1295o = i11;
        this.f1296p = j14;
        this.f1293k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j2.class.equals(obj.getClass())) {
            j2 j2Var = (j2) obj;
            if (Objects.equals(this.f1283a, j2Var.f1283a) && Objects.equals(this.f1285c, j2Var.f1285c) && Objects.equals(this.f1286d, j2Var.f1286d) && Objects.equals(this.f1292j, j2Var.f1292j) && this.f1287e == j2Var.f1287e && this.f1288f == j2Var.f1288f && this.f1289g == j2Var.f1289g && this.f1290h == j2Var.f1290h && this.f1291i == j2Var.f1291i && this.f1293k == j2Var.f1293k && this.l == j2Var.l && this.m == j2Var.m && this.f1294n == j2Var.f1294n && this.f1295o == j2Var.f1295o && this.f1296p == j2Var.f1296p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f1285c.hashCode() + ((this.f1283a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f1286d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        k0 k0Var = this.f1292j;
        int iHashCode3 = (iHashCode2 + (k0Var != null ? k0Var.hashCode() : 0)) * 31;
        long j9 = this.f1287e;
        int i10 = (iHashCode3 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        long j10 = this.f1288f;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f1289g;
        int i12 = (((((((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f1290h ? 1 : 0)) * 31) + (this.f1291i ? 1 : 0)) * 31) + (this.f1293k ? 1 : 0)) * 31;
        long j12 = this.l;
        int i13 = (i12 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.m;
        int i14 = (((((i13 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f1294n) * 31) + this.f1295o) * 31;
        long j14 = this.f1296p;
        return i14 + ((int) (j14 ^ (j14 >>> 32)));
    }
}
