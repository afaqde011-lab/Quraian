package androidx.media3.common;

public class f0 {

    public static final f0 f1191i = new f0(new e0());

    public static final String f1192j = Integer.toString(0, 36);

    public static final String f1193k = Integer.toString(1, 36);
    public static final String l = Integer.toString(2, 36);
    public static final String m = Integer.toString(3, 36);

    public static final String f1194n = Integer.toString(4, 36);

    public static final String f1195o = Integer.toString(5, 36);

    public static final String f1196p = Integer.toString(6, 36);

    public static final String f1197q = Integer.toString(7, 36);

    public final long f1198a;

    public final long f1199b;

    public final long f1200c;

    public final long f1201d;

    public final boolean f1202e;

    public final boolean f1203f;

    public final boolean f1204g;

    public final boolean f1205h;

    public f0(e0 e0Var) {
        this.f1198a = e7.i0.W(e0Var.f1171a);
        this.f1200c = e7.i0.W(e0Var.f1172b);
        this.f1199b = e0Var.f1171a;
        this.f1201d = e0Var.f1172b;
        this.f1202e = e0Var.f1173c;
        this.f1203f = e0Var.f1174d;
        this.f1204g = e0Var.f1175e;
        this.f1205h = e0Var.f1176f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f1199b == f0Var.f1199b && this.f1201d == f0Var.f1201d && this.f1202e == f0Var.f1202e && this.f1203f == f0Var.f1203f && this.f1204g == f0Var.f1204g && this.f1205h == f0Var.f1205h;
    }

    public final int hashCode() {
        long j9 = this.f1199b;
        int i10 = ((int) (j9 ^ (j9 >>> 32))) * 31;
        long j10 = this.f1201d;
        return ((((((((i10 + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.f1202e ? 1 : 0)) * 31) + (this.f1203f ? 1 : 0)) * 31) + (this.f1204g ? 1 : 0)) * 31) + (this.f1205h ? 1 : 0);
    }
}
