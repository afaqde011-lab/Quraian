package androidx.media3.common;

public final class o2 {

    public static final o2 f1365d = new o2(new n2());

    public static final String f1366e;

    public static final String f1367f;

    public static final String f1368g;

    public final int f1369a;

    public final boolean f1370b;

    public final boolean f1371c;

    static {
        String str = e7.i0.f5136a;
        f1366e = Integer.toString(1, 36);
        f1367f = Integer.toString(2, 36);
        f1368g = Integer.toString(3, 36);
    }

    public o2(n2 n2Var) {
        this.f1369a = n2Var.f1355a;
        this.f1370b = n2Var.f1356b;
        this.f1371c = n2Var.f1357c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o2.class == obj.getClass()) {
            o2 o2Var = (o2) obj;
            if (this.f1369a == o2Var.f1369a && this.f1370b == o2Var.f1370b && this.f1371c == o2Var.f1371c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f1369a + 31) * 31) + (this.f1370b ? 1 : 0)) * 31) + (this.f1371c ? 1 : 0);
    }
}
