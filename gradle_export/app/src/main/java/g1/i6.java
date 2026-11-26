package g1;

public final class i6 implements u2.a {
    public final m6 A;
    public final u00.k B;

    public i6(m6 m6Var, u00.k kVar) {
        d0.q1 q1Var = d0.q1.A;
        this.A = m6Var;
        this.B = kVar;
    }

    @Override
    public final Object D(long j9, k00.c cVar) {
        d0.q1 q1Var = d0.q1.A;
        float fC = y3.q.c(j9);
        m6 m6Var = this.A;
        float fK = m6Var.f5887d.k();
        float fC2 = m6Var.f5887d.g().c();
        if (fC >= 0.0f || fK <= fC2) {
            j9 = 0;
        } else {
            this.B.invoke(new Float(fC));
        }
        return new y3.q(j9);
    }

    @Override
    public final long N0(int i10, long j9, long j10) {
        if (i10 != 1) {
            return 0L;
        }
        fc.n nVar = this.A.f5887d;
        d0.q1 q1Var = d0.q1.A;
        float fJ = nVar.j(Float.intBitsToFloat((int) (4294967295L & j10)));
        l1.e1 e1Var = (l1.e1) nVar.f5635j;
        float fH = Float.isNaN(e1Var.h()) ? 0.0f : e1Var.h();
        e1Var.i(fJ);
        return a(fJ - fH);
    }

    public final long a(float f3) {
        d0.q1 q1Var = d0.q1.A;
        d0.q1 q1Var2 = d0.q1.A;
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    @Override
    public final Object a0(long j9, long j10, k00.c cVar) {
        d0.q1 q1Var = d0.q1.A;
        this.B.invoke(new Float(y3.q.c(j10)));
        return new y3.q(j10);
    }

    @Override
    public final long c0(int i10, long j9) {
        d0.q1 q1Var = d0.q1.A;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i10 != 1) {
            return 0L;
        }
        fc.n nVar = this.A.f5887d;
        float fJ = nVar.j(fIntBitsToFloat);
        l1.e1 e1Var = (l1.e1) nVar.f5635j;
        float fH = Float.isNaN(e1Var.h()) ? 0.0f : e1Var.h();
        e1Var.i(fJ);
        return a(fJ - fH);
    }
}
