package z2;

public abstract class k1 implements y3.c {
    public boolean A;

    public static final void a(k1 k1Var, l1 l1Var) {
        k1Var.getClass();
        if (l1Var instanceof b3.f1) {
            ((b3.f1) l1Var).X(k1Var.A);
        }
    }

    public static void j(k1 k1Var, l1 l1Var, long j9) {
        k1Var.getClass();
        a(k1Var, l1Var);
        l1Var.r0(y3.j.d(j9, l1Var.E), 0.0f, null);
    }

    public static void k(k1 k1Var, l1 l1Var, int i10, int i11) {
        long j9 = (((long) i10) << 32) | (((long) i11) & 4294967295L);
        if (k1Var.f() == y3.m.A || k1Var.g() == 0) {
            a(k1Var, l1Var);
            l1Var.r0(y3.j.d(j9, l1Var.E), 0.0f, null);
        } else {
            int iG = (k1Var.g() - l1Var.A) - ((int) (j9 >> 32));
            a(k1Var, l1Var);
            l1Var.r0(y3.j.d((((long) iG) << 32) | (((long) ((int) (j9 & 4294967295L))) & 4294967295L), l1Var.E), 0.0f, null);
        }
    }

    public static void o(k1 k1Var, l1 l1Var, int i10, int i11) {
        int i12 = n1.f17144b;
        m1 m1Var = m1.B;
        long j9 = (((long) i10) << 32) | (((long) i11) & 4294967295L);
        if (k1Var.f() == y3.m.A || k1Var.g() == 0) {
            a(k1Var, l1Var);
            l1Var.r0(y3.j.d(j9, l1Var.E), 0.0f, m1Var);
        } else {
            int iG = (k1Var.g() - l1Var.A) - ((int) (j9 >> 32));
            a(k1Var, l1Var);
            l1Var.r0(y3.j.d((((long) iG) << 32) | (((long) ((int) (j9 & 4294967295L))) & 4294967295L), l1Var.E), 0.0f, m1Var);
        }
    }

    public static void p(k1 k1Var, l1 l1Var, long j9) {
        int i10 = n1.f17144b;
        m1 m1Var = m1.B;
        if (k1Var.f() == y3.m.A || k1Var.g() == 0) {
            a(k1Var, l1Var);
            l1Var.r0(y3.j.d(j9, l1Var.E), 0.0f, m1Var);
        } else {
            int iG = (k1Var.g() - l1Var.A) - ((int) (j9 >> 32));
            a(k1Var, l1Var);
            l1Var.r0(y3.j.d((((long) ((int) (j9 & 4294967295L))) & 4294967295L) | (((long) iG) << 32), l1Var.E), 0.0f, m1Var);
        }
    }

    public static void s(k1 k1Var, l1 l1Var, int i10, int i11, u00.k kVar, int i12) {
        if ((i12 & 8) != 0) {
            int i13 = n1.f17144b;
            kVar = m1.B;
        }
        k1Var.getClass();
        a(k1Var, l1Var);
        l1Var.r0(y3.j.d((((long) i11) & 4294967295L) | (((long) i10) << 32), l1Var.E), 0.0f, kVar);
    }

    public static void u(k1 k1Var, l1 l1Var, long j9, jk.e eVar, int i10) {
        u00.k kVar = eVar;
        if ((i10 & 4) != 0) {
            int i11 = n1.f17144b;
            kVar = m1.B;
        }
        k1Var.getClass();
        a(k1Var, l1Var);
        l1Var.r0(y3.j.d(j9, l1Var.E), 0.0f, kVar);
    }

    public float d(t tVar) {
        return Float.NaN;
    }

    public abstract a0 e();

    public abstract y3.m f();

    public abstract int g();

    public final void h(l1 l1Var, int i10, int i11, float f3) {
        a(this, l1Var);
        l1Var.r0(y3.j.d((((long) i11) & 4294967295L) | (((long) i10) << 32), l1Var.E), f3, null);
    }
}
