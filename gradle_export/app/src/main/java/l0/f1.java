package l0;

import b3.j2;

public final class f1 extends b2.q implements j2 {
    public u00.a O;
    public b1 P;
    public d0.q1 Q;
    public boolean R;
    public j3.l S;
    public final d1 T = new d1(this, 0);
    public d1 U;

    public f1(u00.a aVar, b1 b1Var, d0.q1 q1Var, boolean z10) {
        this.O = aVar;
        this.P = b1Var;
        this.Q = q1Var;
        this.R = z10;
        B1();
    }

    public final void B1() {
        this.S = new j3.l(new e1(this, 0), new e1(this, 1));
        this.U = this.R ? new d1(this, 1) : null;
    }

    @Override
    public final void m1(j3.a0 a0Var) {
        j3.y.o(a0Var);
        a0Var.a(j3.w.P, this.T);
        if (this.Q == d0.q1.A) {
            j3.l lVar = this.S;
            if (lVar == null) {
                kotlin.jvm.internal.m.k("scrollAxisRange");
                throw null;
            }
            j3.z zVar = j3.w.f7998w;
            a10.w wVar = j3.y.f8004a[13];
            a0Var.a(zVar, lVar);
        } else {
            j3.l lVar2 = this.S;
            if (lVar2 == null) {
                kotlin.jvm.internal.m.k("scrollAxisRange");
                throw null;
            }
            j3.z zVar2 = j3.w.f7997v;
            a10.w wVar2 = j3.y.f8004a[12];
            a0Var.a(zVar2, lVar2);
        }
        d1 d1Var = this.U;
        if (d1Var != null) {
            a0Var.a(j3.n.f7945f, new j3.a(null, d1Var));
        }
        a0Var.a(j3.n.C, new j3.a(null, new b3.a(new e1(this, 2), 20)));
        j3.d dVarF = this.P.f();
        j3.z zVar3 = j3.w.f7983f;
        a10.w wVar3 = j3.y.f8004a[24];
        a0Var.a(zVar3, dVarF);
    }

    @Override
    public final boolean q1() {
        return false;
    }
}
