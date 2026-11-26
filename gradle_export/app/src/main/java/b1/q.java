package b1;

import a1.o1;
import a1.s2;
import a1.w2;
import m3.n0;
import m3.q0;

public final class q implements e1.m {
    public boolean A;
    public long B;
    public int C;
    public Object D;
    public Object E;

    @Override
    public boolean a(long j9) {
        return true;
    }

    @Override
    public boolean b(long j9, du.w wVar) {
        e0 e0Var = (e0) this.E;
        s2 s2Var = e0Var.f1941b;
        w2 w2Var = e0Var.f1940a;
        n0 n0VarC = s2Var.c();
        if (!e0Var.f1949j || n0VarC == null || w2Var.d().C.length() == 0) {
            return false;
        }
        if (q0.c(w2Var.d().D, c(j9, wVar, n0VarC, false))) {
            return true;
        }
        this.A = false;
        return true;
    }

    public long c(long j9, du.w wVar, n0 n0Var, boolean z10) {
        e0 e0Var = (e0) this.E;
        int length = n0Var.f10496a.f10483a.B.length();
        int iD = this.C;
        if (iD < 0 || iD > length) {
            iD = e0Var.f1941b.d(false, this.B);
        }
        int i10 = iD;
        long jB = e0Var.B(e0Var.f1940a.d(), i10, e0Var.f1941b.d(false, j9), false, wVar, false, z10, null);
        if (this.C == -1 && !q0.d(jB)) {
            this.C = (int) (jB >> 32);
        }
        if (q0.h(jB)) {
            jB = m3.h0.b((int) (4294967295L & jB), (int) (jB >> 32));
        }
        e0Var.f1940a.j(jB);
        e0Var.x(k0.C);
        return jB;
    }

    @Override
    public void d() {
        e0 e0Var = (e0) this.E;
        e0Var.f1955r.setValue(p.A);
        if (this.A) {
            e0Var.r();
        }
    }

    @Override
    public boolean e(long j9, du.w wVar, int i10) {
        e0 e0Var = (e0) this.E;
        n0 n0VarC = e0Var.f1941b.c();
        if (!e0Var.f1949j || n0VarC == null || e0Var.f1940a.d().C.length() == 0) {
            return false;
        }
        this.A = i10 >= 2;
        e0Var.f1955r.setValue(p.C);
        ((o1) this.D).invoke();
        e0Var.f1960w = -1;
        this.C = -1;
        this.B = j9;
        this.C = (int) (c(j9, wVar, n0VarC, true) >> 32);
        return true;
    }

    @Override
    public boolean f(long j9) {
        e0 e0Var = (e0) this.E;
        n0 n0VarC = e0Var.f1941b.c();
        if (!e0Var.f1949j || n0VarC == null || e0Var.f1940a.d().C.length() == 0) {
            return false;
        }
        this.A = false;
        ((o1) this.D).invoke();
        c(j9, e1.v.f5009d, n0VarC, false);
        return true;
    }
}
