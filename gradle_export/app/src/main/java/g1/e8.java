package g1;

import com.google.android.gms.cast.MediaError;

public abstract class e8 {

    public static final float f5784a;

    static {
        f50.c.b(16, 8);
        f5784a = MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN;
    }

    public static i8 a(l1.j jVar) {
        l1.g0 g0Var = (l1.g0) jVar;
        int iR0 = ((y3.c) g0Var.k(c3.o1.f2734h)).R0(h8.f5837a);
        boolean zE = g0Var.e(iR0);
        Object objN = g0Var.N();
        if (zE || objN == l1.i.f9868a) {
            objN = new i8(iR0);
            g0Var.n0(objN);
        }
        return (i8) objN;
    }
}
