package b3;

public final class j1 implements k1 {
    public static final int g(int i10, long j9) {
        int i11 = m2.f2083b;
        return ((int) (j9 >> (i10 * 15))) & 32767;
    }

    public static long h(int i10, int i11, int i12, int i13) {
        return (((long) (i11 & 32767)) << 15) | ((long) (i10 & 32767)) | (((long) (i12 & 32767)) << 30) | (((long) (i13 & 32767)) << 45) | Long.MIN_VALUE;
    }

    @Override
    public int a() {
        return 8;
    }

    @Override
    public boolean b(s sVar, l0 l0Var) {
        return false;
    }

    @Override
    public boolean c(b2.q qVar) {
        return false;
    }

    @Override
    public boolean d(b2.q qVar) {
        return j3.v.h(j3.v.a(m.y(qVar), false));
    }

    @Override
    public void e(l0 l0Var, long j9, s sVar, int i10, boolean z10) {
        a1.n nVar = l0Var.f2059g0;
        p1 p1Var = (p1) nVar.E;
        i2.q0 q0Var = p1.f2089p0;
        ((p1) nVar.E).E1(p1.f2093t0, p1Var.w1(true, j9), sVar, 1, z10);
    }

    @Override
    public boolean f(l0 l0Var) {
        j3.o oVarZ = l0Var.z();
        boolean z10 = false;
        if (oVarZ != null && oVarZ.D) {
            z10 = true;
        }
        return !z10;
    }
}
