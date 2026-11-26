package o2;

import b3.o0;
import l1.i1;

public final class i0 extends m2.b {
    public final i1 E = l1.q.z(new h2.e(0));
    public final i1 F = l1.q.z(Boolean.FALSE);
    public final e0 G;
    public final i1 H;
    public float I;
    public i2.m J;

    public i0(c cVar) {
        e0 e0Var = new e0(cVar);
        e0Var.f11564f = new b3.j0(this, 21);
        this.G = e0Var;
        this.H = new i1(g00.b0.a, l1.c.D);
        this.I = 1.0f;
    }

    @Override
    public final void a(float f3) {
        this.I = f3;
    }

    @Override
    public final void e(i2.m mVar) {
        this.J = mVar;
    }

    @Override
    public final long h() {
        return ((h2.e) this.E.getValue()).f6558a;
    }

    @Override
    public final void i(o0 o0Var) {
        k2.b bVar = o0Var.A;
        i2.m mVar = this.J;
        e0 e0Var = this.G;
        if (mVar == null) {
            mVar = (i2.m) e0Var.f11565g.getValue();
        }
        if (((Boolean) this.F.getValue()).booleanValue() && o0Var.getLayoutDirection() == y3.m.B) {
            long jY0 = bVar.Y0();
            a1.i iVar = bVar.B;
            long jQ = iVar.q();
            iVar.n().i();
            try {
                ((hf.c) iVar.B).H(-1.0f, 1.0f, jY0);
                e0Var.e(o0Var, this.I, mVar);
                w.c.t(iVar, jQ);
            } catch (Throwable th2) {
                w.c.t(iVar, jQ);
                throw th2;
            }
        } else {
            e0Var.e(o0Var, this.I, mVar);
        }
        this.H.getValue();
    }
}
