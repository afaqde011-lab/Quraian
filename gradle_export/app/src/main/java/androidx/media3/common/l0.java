package androidx.media3.common;

import android.net.Uri;
import java.util.List;
import java.util.Objects;

public final class l0 {

    public static final String f1322i;

    public static final String f1323j;

    public static final String f1324k;
    public static final String l;
    public static final String m;

    public static final String f1325n;

    public static final String f1326o;

    public static final String f1327p;

    public final Uri f1328a;

    public final String f1329b;

    public final i0 f1330c;

    public final c0 f1331d;

    public final List f1332e;

    public final String f1333f;

    public final fh.t0 f1334g;

    public final long f1335h;

    static {
        String str = e7.i0.f5136a;
        f1322i = Integer.toString(0, 36);
        f1323j = Integer.toString(1, 36);
        f1324k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        f1325n = Integer.toString(5, 36);
        f1326o = Integer.toString(6, 36);
        f1327p = Integer.toString(7, 36);
    }

    public l0(Uri uri, String str, i0 i0Var, c0 c0Var, List list, String str2, fh.t0 t0Var, long j9) {
        this.f1328a = uri;
        this.f1329b = x0.n(str);
        this.f1330c = i0Var;
        this.f1331d = c0Var;
        this.f1332e = list;
        this.f1333f = str2;
        this.f1334g = t0Var;
        fh.q0 q0VarM = fh.t0.m();
        for (int i10 = 0; i10 < t0Var.size(); i10++) {
            p0 p0Var = (p0) t0Var.get(i10);
            o0 o0Var = new o0();
            o0Var.f1361d = p0Var.f1377a;
            o0Var.f1358a = p0Var.f1378b;
            o0Var.f1362e = p0Var.f1379c;
            o0Var.f1359b = p0Var.f1380d;
            o0Var.f1360c = p0Var.f1381e;
            o0Var.f1363f = p0Var.f1382f;
            o0Var.f1364g = p0Var.f1383g;
            q0VarM.c(new n0(o0Var));
        }
        q0VarM.g();
        this.f1335h = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f1328a.equals(l0Var.f1328a) && Objects.equals(this.f1329b, l0Var.f1329b) && Objects.equals(this.f1330c, l0Var.f1330c) && Objects.equals(this.f1331d, l0Var.f1331d) && this.f1332e.equals(l0Var.f1332e) && Objects.equals(this.f1333f, l0Var.f1333f) && this.f1334g.equals(l0Var.f1334g) && this.f1335h == l0Var.f1335h;
    }

    public final int hashCode() {
        int iHashCode = this.f1328a.hashCode() * 31;
        String str = this.f1329b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        i0 i0Var = this.f1330c;
        int iHashCode3 = (iHashCode2 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        c0 c0Var = this.f1331d;
        int iHashCode4 = (this.f1332e.hashCode() + ((iHashCode3 + (c0Var == null ? 0 : c0Var.hashCode())) * 31)) * 31;
        String str2 = this.f1333f;
        return (int) ((((long) ((this.f1334g.hashCode() + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31) + this.f1335h);
    }
}
