package androidx.media3.common;

import android.os.Bundle;
import java.util.Objects;

public final class e1 {

    public static final String f1177j;

    public static final String f1178k;
    public static final String l;
    public static final String m;

    public static final String f1179n;

    public static final String f1180o;

    public static final String f1181p;

    public final Object f1182a;

    public final int f1183b;

    public final q0 f1184c;

    public final Object f1185d;

    public final int f1186e;

    public final long f1187f;

    public final long f1188g;

    public final int f1189h;

    public final int f1190i;

    static {
        String str = e7.i0.f5136a;
        f1177j = Integer.toString(0, 36);
        f1178k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        f1179n = Integer.toString(4, 36);
        f1180o = Integer.toString(5, 36);
        f1181p = Integer.toString(6, 36);
    }

    public e1(Object obj, int i10, q0 q0Var, Object obj2, int i11, long j9, long j10, int i12, int i13) {
        ta.c0.s(i10 >= 0);
        ta.c0.s(i11 >= 0);
        this.f1182a = obj;
        this.f1183b = i10;
        this.f1184c = q0Var;
        this.f1185d = obj2;
        this.f1186e = i11;
        this.f1187f = j9;
        this.f1188g = j10;
        this.f1189h = i12;
        this.f1190i = i13;
    }

    public static e1 c(Bundle bundle) {
        int iMax = Math.max(0, bundle.getInt(f1177j, 0));
        Bundle bundle2 = bundle.getBundle(f1178k);
        return new e1(null, iMax, bundle2 == null ? null : q0.a(bundle2), null, Math.max(0, bundle.getInt(l, 0)), bundle.getLong(m, 0L), bundle.getLong(f1179n, 0L), bundle.getInt(f1180o, -1), bundle.getInt(f1181p, -1));
    }

    public final boolean a(e1 e1Var) {
        return this.f1183b == e1Var.f1183b && this.f1186e == e1Var.f1186e && this.f1187f == e1Var.f1187f && this.f1188g == e1Var.f1188g && this.f1189h == e1Var.f1189h && this.f1190i == e1Var.f1190i && Objects.equals(this.f1184c, e1Var.f1184c);
    }

    public final e1 b(boolean z10, boolean z11) {
        if (z10 && z11) {
            return this;
        }
        return new e1(this.f1182a, z11 ? this.f1183b : 0, z10 ? this.f1184c : null, this.f1185d, z11 ? this.f1186e : 0, z10 ? this.f1187f : 0L, z10 ? this.f1188g : 0L, z10 ? this.f1189h : -1, z10 ? this.f1190i : -1);
    }

    public final Bundle d(int i10) {
        Bundle bundle = new Bundle();
        int i11 = this.f1183b;
        if (i10 < 3 || i11 != 0) {
            bundle.putInt(f1177j, i11);
        }
        q0 q0Var = this.f1184c;
        if (q0Var != null) {
            bundle.putBundle(f1178k, q0Var.c(false));
        }
        int i12 = this.f1186e;
        if (i10 < 3 || i12 != 0) {
            bundle.putInt(l, i12);
        }
        long j9 = this.f1187f;
        if (i10 < 3 || j9 != 0) {
            bundle.putLong(m, j9);
        }
        long j10 = this.f1188g;
        if (i10 < 3 || j10 != 0) {
            bundle.putLong(f1179n, j10);
        }
        int i13 = this.f1189h;
        if (i13 != -1) {
            bundle.putInt(f1180o, i13);
        }
        int i14 = this.f1190i;
        if (i14 != -1) {
            bundle.putInt(f1181p, i14);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (a(e1Var) && Objects.equals(this.f1182a, e1Var.f1182a) && Objects.equals(this.f1185d, e1Var.f1185d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1182a, Integer.valueOf(this.f1183b), this.f1184c, this.f1185d, Integer.valueOf(this.f1186e), Long.valueOf(this.f1187f), Long.valueOf(this.f1188g), Integer.valueOf(this.f1189h), Integer.valueOf(this.f1190i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f1183b + ", period=" + this.f1186e + ", pos=" + this.f1187f;
        int i10 = this.f1189h;
        if (i10 == -1) {
            return str;
        }
        return str + ", contentPos=" + this.f1188g + ", adGroup=" + i10 + ", ad=" + this.f1190i;
    }
}
