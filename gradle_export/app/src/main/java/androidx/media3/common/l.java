package androidx.media3.common;

import java.util.Objects;

public final class l {

    public static final l f1313e = new k(0).b();

    public static final String f1314f;

    public static final String f1315g;

    public static final String f1316h;

    public static final String f1317i;

    public final int f1318a;

    public final int f1319b;

    public final int f1320c;

    public final String f1321d;

    static {
        String str = e7.i0.f5136a;
        f1314f = Integer.toString(0, 36);
        f1315g = Integer.toString(1, 36);
        f1316h = Integer.toString(2, 36);
        f1317i = Integer.toString(3, 36);
    }

    public l(k kVar) {
        this.f1318a = kVar.f1298b;
        this.f1319b = kVar.f1299c;
        this.f1320c = kVar.f1300d;
        this.f1321d = (String) kVar.f1301e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f1318a == lVar.f1318a && this.f1319b == lVar.f1319b && this.f1320c == lVar.f1320c && Objects.equals(this.f1321d, lVar.f1321d);
    }

    public final int hashCode() {
        int i10 = (((((527 + this.f1318a) * 31) + this.f1319b) * 31) + this.f1320c) * 31;
        String str = this.f1321d;
        return i10 + (str == null ? 0 : str.hashCode());
    }
}
