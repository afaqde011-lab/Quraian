package androidx.media3.common;

import android.os.Bundle;

public final class k0 {

    public static final k0 f1302f = new k0(new j0());

    public static final String f1303g;

    public static final String f1304h;

    public static final String f1305i;

    public static final String f1306j;

    public static final String f1307k;

    public final long f1308a;

    public final long f1309b;

    public final long f1310c;

    public final float f1311d;

    public final float f1312e;

    static {
        String str = e7.i0.f5136a;
        f1303g = Integer.toString(0, 36);
        f1304h = Integer.toString(1, 36);
        f1305i = Integer.toString(2, 36);
        f1306j = Integer.toString(3, 36);
        f1307k = Integer.toString(4, 36);
    }

    public k0(j0 j0Var) {
        long j9 = j0Var.f1268a;
        long j10 = j0Var.f1269b;
        long j11 = j0Var.f1270c;
        float f3 = j0Var.f1271d;
        float f10 = j0Var.f1272e;
        this.f1308a = j9;
        this.f1309b = j10;
        this.f1310c = j11;
        this.f1311d = f3;
        this.f1312e = f10;
    }

    public static k0 b(Bundle bundle) {
        j0 j0Var = new j0();
        k0 k0Var = f1302f;
        j0Var.f1268a = bundle.getLong(f1303g, k0Var.f1308a);
        j0Var.f1269b = bundle.getLong(f1304h, k0Var.f1309b);
        j0Var.f1270c = bundle.getLong(f1305i, k0Var.f1310c);
        j0Var.f1271d = bundle.getFloat(f1306j, k0Var.f1311d);
        j0Var.f1272e = bundle.getFloat(f1307k, k0Var.f1312e);
        return new k0(j0Var);
    }

    public final j0 a() {
        j0 j0Var = new j0();
        j0Var.f1268a = this.f1308a;
        j0Var.f1269b = this.f1309b;
        j0Var.f1270c = this.f1310c;
        j0Var.f1271d = this.f1311d;
        j0Var.f1272e = this.f1312e;
        return j0Var;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        k0 k0Var = f1302f;
        long j9 = k0Var.f1308a;
        long j10 = this.f1308a;
        if (j10 != j9) {
            bundle.putLong(f1303g, j10);
        }
        long j11 = k0Var.f1309b;
        long j12 = this.f1309b;
        if (j12 != j11) {
            bundle.putLong(f1304h, j12);
        }
        long j13 = k0Var.f1310c;
        long j14 = this.f1310c;
        if (j14 != j13) {
            bundle.putLong(f1305i, j14);
        }
        float f3 = k0Var.f1311d;
        float f10 = this.f1311d;
        if (f10 != f3) {
            bundle.putFloat(f1306j, f10);
        }
        float f11 = k0Var.f1312e;
        float f12 = this.f1312e;
        if (f12 != f11) {
            bundle.putFloat(f1307k, f12);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f1308a == k0Var.f1308a && this.f1309b == k0Var.f1309b && this.f1310c == k0Var.f1310c && this.f1311d == k0Var.f1311d && this.f1312e == k0Var.f1312e;
    }

    public final int hashCode() {
        long j9 = this.f1308a;
        long j10 = this.f1309b;
        int i10 = ((((int) (j9 ^ (j9 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f1310c;
        int i11 = (i10 + ((int) ((j11 >>> 32) ^ j11))) * 31;
        float f3 = this.f1311d;
        int iFloatToIntBits = (i11 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
        float f10 = this.f1312e;
        return iFloatToIntBits + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
    }
}
