package e1;

import q0.e2;
import q0.j1;
import q0.r1;

public final class r0 implements r1 {

    public final v0 f4994a;

    public r0(v0 v0Var) {
        this.f4994a = v0Var;
    }

    @Override
    public final void a() {
        v0 v0Var = this.f4994a;
        v0Var.f5030r.setValue(null);
        v0Var.f5031s.setValue(null);
    }

    @Override
    public final void b() {
        v0 v0Var = this.f4994a;
        v0Var.f5030r.setValue(null);
        v0Var.f5031s.setValue(null);
    }

    @Override
    public final void c() {
    }

    @Override
    public final void d(long j9, du.w wVar) {
        e2 e2VarD;
        v0 v0Var = this.f4994a;
        long jA = g0.a(v0Var.l(true));
        j1 j1Var = v0Var.f5018d;
        if (j1Var == null || (e2VarD = j1Var.d()) == null) {
            return;
        }
        long jE = e2VarD.e(jA);
        v0Var.f5027o = jE;
        v0Var.f5031s.setValue(new h2.b(jE));
        v0Var.f5029q = 0L;
        v0Var.f5030r.setValue(q0.y0.A);
        v0Var.t(false);
    }

    @Override
    public final void e(long j9) {
        e2 e2VarD;
        q2.a aVar;
        v0 v0Var = this.f4994a;
        v0Var.f5029q = h2.b.f(v0Var.f5029q, j9);
        j1 j1Var = v0Var.f5018d;
        if (j1Var == null || (e2VarD = j1Var.d()) == null) {
            return;
        }
        v0Var.f5031s.setValue(new h2.b(h2.b.f(v0Var.f5027o, v0Var.f5029q)));
        r3.p pVar = v0Var.f5016b;
        h2.b bVarI = v0Var.i();
        kotlin.jvm.internal.m.b(bVarI);
        int iK = pVar.k(e2VarD.b(true, bVarI.f6544a));
        long jB = m3.h0.b(iK, iK);
        if (m3.q0.c(jB, v0Var.n().f13100b)) {
            return;
        }
        j1 j1Var2 = v0Var.f5018d;
        if ((j1Var2 == null || ((Boolean) j1Var2.f12652q.getValue()).booleanValue()) && (aVar = v0Var.f5025k) != null) {
            ((q2.c) aVar).a(9);
        }
        v0Var.f5017c.invoke(v0.e(v0Var.n().f13099a, jB));
        v0Var.f5035w = new m3.q0(jB);
    }

    @Override
    public final void onCancel() {
    }
}
