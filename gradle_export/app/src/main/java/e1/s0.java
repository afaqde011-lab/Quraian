package e1;

import q0.e2;
import q0.j1;
import q0.r1;

public final class s0 implements r1 {

    public final v0 f4995a;

    public final boolean f4996b;

    public s0(v0 v0Var, boolean z10) {
        this.f4995a = v0Var;
        this.f4996b = z10;
    }

    @Override
    public final void a() {
        v0 v0Var = this.f4995a;
        v0Var.f5030r.setValue(null);
        v0Var.f5031s.setValue(null);
        v0Var.t(true);
    }

    @Override
    public final void b() {
        v0 v0Var = this.f4995a;
        v0Var.f5030r.setValue(null);
        v0Var.f5031s.setValue(null);
        v0Var.t(true);
    }

    @Override
    public final void c() {
        e2 e2VarD;
        boolean z10 = this.f4996b;
        q0.y0 y0Var = z10 ? q0.y0.B : q0.y0.C;
        v0 v0Var = this.f4995a;
        v0Var.f5030r.setValue(y0Var);
        long jA = g0.a(v0Var.l(z10));
        j1 j1Var = v0Var.f5018d;
        if (j1Var == null || (e2VarD = j1Var.d()) == null) {
            return;
        }
        long jE = e2VarD.e(jA);
        v0Var.f5027o = jE;
        v0Var.f5031s.setValue(new h2.b(jE));
        v0Var.f5029q = 0L;
        v0Var.f5032t = -1;
        j1 j1Var2 = v0Var.f5018d;
        if (j1Var2 != null) {
            j1Var2.f12652q.setValue(Boolean.TRUE);
        }
        v0Var.t(false);
    }

    @Override
    public final void d(long j9, du.w wVar) {
    }

    @Override
    public final void e(long j9) {
        v0 v0Var = this.f4995a;
        long jF = h2.b.f(v0Var.f5029q, j9);
        v0Var.f5029q = jF;
        v0Var.f5031s.setValue(new h2.b(h2.b.f(v0Var.f5027o, jF)));
        r3.w wVarN = v0Var.n();
        h2.b bVarI = v0Var.i();
        kotlin.jvm.internal.m.b(bVarI);
        v0.c(v0Var, wVarN, bVarI.f6544a, false, this.f4996b, v.f5013h, true, new q2.b(9));
        v0Var.t(false);
    }

    @Override
    public final void onCancel() {
    }
}
