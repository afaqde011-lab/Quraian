package a1;

public final class s2 {

    public final o2 f116a;

    public final o2 f117b;

    public final l1.i1 f118c;

    public final l1.i1 f119d;

    public final l1.i1 f120e;

    public final l1.i1 f121f;

    public final n0.c f122g;

    public s2() {
        o2 o2Var = new o2();
        this.f116a = o2Var;
        this.f117b = o2Var;
        l1.c cVar = l1.c.D;
        this.f118c = new l1.i1(null, cVar);
        this.f119d = new l1.i1(null, cVar);
        this.f120e = new l1.i1(null, cVar);
        this.f121f = l1.q.z(new y3.f(0));
        this.f122g = new n0.c();
    }

    public final long a(long j9) {
        h2.c cVarF;
        z2.a0 a0VarE = e();
        h2.c cVar = h2.c.f6545e;
        if (a0VarE != null) {
            if (a0VarE.A()) {
                z2.a0 a0VarB = b();
                cVarF = a0VarB != null ? a0VarB.F(a0VarE, true) : null;
            } else {
                cVarF = cVar;
            }
            if (cVarF != null) {
                cVar = cVarF;
            }
        }
        return x0.j(j9, cVar);
    }

    public final z2.a0 b() {
        return (z2.a0) this.f120e.getValue();
    }

    public final m3.n0 c() {
        return (m3.n0) this.f117b.getValue();
    }

    public final int d(boolean z10, long j9) {
        m3.n0 n0VarC = c();
        if (n0VarC == null) {
            return -1;
        }
        if (z10) {
            j9 = a(j9);
        }
        return n0VarC.f10497b.g(x0.o(this, j9));
    }

    public final z2.a0 e() {
        return (z2.a0) this.f118c.getValue();
    }

    public final boolean f(long j9) {
        m3.n0 n0VarC = c();
        if (n0VarC == null) {
            return false;
        }
        long jO = x0.o(this, a(j9));
        int iE = n0VarC.f10497b.e(Float.intBitsToFloat((int) (4294967295L & jO)));
        int i10 = (int) (jO >> 32);
        return Float.intBitsToFloat(i10) >= n0VarC.f(iE) && Float.intBitsToFloat(i10) <= n0VarC.g(iE);
    }
}
