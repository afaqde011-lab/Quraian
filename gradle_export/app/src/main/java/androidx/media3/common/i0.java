package androidx.media3.common;

import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public final class i0 {

    public static final String f1250i;

    public static final String f1251j;

    public static final String f1252k;
    public static final String l;
    public static final String m;

    public static final String f1253n;

    public static final String f1254o;

    public static final String f1255p;

    public final UUID f1256a;

    public final Uri f1257b;

    public final fh.w0 f1258c;

    public final boolean f1259d;

    public final boolean f1260e;

    public final boolean f1261f;

    public final fh.t0 f1262g;

    public final byte[] f1263h;

    static {
        String str = e7.i0.f5136a;
        f1250i = Integer.toString(0, 36);
        f1251j = Integer.toString(1, 36);
        f1252k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        f1253n = Integer.toString(5, 36);
        f1254o = Integer.toString(6, 36);
        f1255p = Integer.toString(7, 36);
    }

    public i0(h0 h0Var) {
        ta.c0.A((h0Var.f1221c && ((Uri) h0Var.f1223e) == null) ? false : true);
        UUID uuid = (UUID) h0Var.f1222d;
        uuid.getClass();
        this.f1256a = uuid;
        this.f1257b = (Uri) h0Var.f1223e;
        this.f1258c = (fh.w0) h0Var.f1224f;
        this.f1259d = h0Var.f1219a;
        this.f1261f = h0Var.f1221c;
        this.f1260e = h0Var.f1220b;
        this.f1262g = (fh.t0) h0Var.f1225g;
        byte[] bArr = (byte[]) h0Var.f1226h;
        this.f1263h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final h0 a() {
        h0 h0Var = new h0();
        h0Var.f1222d = this.f1256a;
        h0Var.f1223e = this.f1257b;
        h0Var.f1224f = this.f1258c;
        h0Var.f1219a = this.f1259d;
        h0Var.f1220b = this.f1260e;
        h0Var.f1221c = this.f1261f;
        h0Var.f1225g = this.f1262g;
        h0Var.f1226h = this.f1263h;
        return h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f1256a.equals(i0Var.f1256a) && Objects.equals(this.f1257b, i0Var.f1257b) && Objects.equals(this.f1258c, i0Var.f1258c) && this.f1259d == i0Var.f1259d && this.f1261f == i0Var.f1261f && this.f1260e == i0Var.f1260e && this.f1262g.equals(i0Var.f1262g) && Arrays.equals(this.f1263h, i0Var.f1263h);
    }

    public final int hashCode() {
        int iHashCode = this.f1256a.hashCode() * 31;
        Uri uri = this.f1257b;
        return Arrays.hashCode(this.f1263h) + ((this.f1262g.hashCode() + ((((((((this.f1258c.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f1259d ? 1 : 0)) * 31) + (this.f1261f ? 1 : 0)) * 31) + (this.f1260e ? 1 : 0)) * 31)) * 31);
    }
}
