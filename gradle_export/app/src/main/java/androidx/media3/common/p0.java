package androidx.media3.common;

import android.net.Uri;
import java.util.Objects;

public class p0 {

    public static final String f1372h;

    public static final String f1373i;

    public static final String f1374j;

    public static final String f1375k;
    public static final String l;
    public static final String m;

    public static final String f1376n;

    public final Uri f1377a;

    public final String f1378b;

    public final String f1379c;

    public final int f1380d;

    public final int f1381e;

    public final String f1382f;

    public final String f1383g;

    static {
        String str = e7.i0.f5136a;
        f1372h = Integer.toString(0, 36);
        f1373i = Integer.toString(1, 36);
        f1374j = Integer.toString(2, 36);
        f1375k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
        f1376n = Integer.toString(6, 36);
    }

    public p0(o0 o0Var) {
        this.f1377a = (Uri) o0Var.f1361d;
        this.f1378b = o0Var.f1358a;
        this.f1379c = (String) o0Var.f1362e;
        this.f1380d = o0Var.f1359b;
        this.f1381e = o0Var.f1360c;
        this.f1382f = (String) o0Var.f1363f;
        this.f1383g = (String) o0Var.f1364g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f1377a.equals(p0Var.f1377a) && Objects.equals(this.f1378b, p0Var.f1378b) && Objects.equals(this.f1379c, p0Var.f1379c) && this.f1380d == p0Var.f1380d && this.f1381e == p0Var.f1381e && Objects.equals(this.f1382f, p0Var.f1382f) && Objects.equals(this.f1383g, p0Var.f1383g);
    }

    public final int hashCode() {
        int iHashCode = this.f1377a.hashCode() * 31;
        String str = this.f1378b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1379c;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f1380d) * 31) + this.f1381e) * 31;
        String str3 = this.f1382f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f1383g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
