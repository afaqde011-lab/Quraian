package c3;

import android.content.Context;

public final class t extends kotlin.jvm.internal.n implements u00.k {
    public static final t B;
    public static final t C;
    public static final t D;
    public static final t E;
    public static final t F;
    public final int A;

    static {
        int i10 = 1;
        B = new t(i10, 0);
        C = new t(i10, 1);
        D = new t(i10, 2);
        E = new t(i10, 3);
        F = new t(i10, 4);
    }

    public t(int i10, int i11) {
        super(i10);
        this.A = i11;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                return Boolean.TRUE;
            case 1:
                j3.o oVarK = ((j3.s) obj).k();
                return Boolean.valueOf(oVarK.A.c(j3.w.B));
            case 2:
                l1.t tVar = o0.f2721a;
                l1.m1 m1Var = (l1.m1) obj;
                m1Var.getClass();
                l1.q.D(m1Var, tVar);
                return ((Context) l1.q.D(m1Var, o0.f2722b)).getResources();
            case 3:
                return Boolean.valueOf(m0.h(obj));
            default:
                return g00.b0.a;
        }
    }
}
