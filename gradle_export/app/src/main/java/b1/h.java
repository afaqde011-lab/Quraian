package b1;

import a1.s2;
import a1.w2;
import a40.u1;
import b3.j2;
import b3.o0;
import b3.p1;
import c3.o1;
import java.util.concurrent.CancellationException;
import l1.i1;
import l1.q2;
import z.a1;
import z.l1;
import z.z0;

public final class h extends b3.l implements b3.j, b3.o, j2, b2.p {
    public w2 Q;
    public e0 R;
    public s2 S;
    public boolean T;
    public final i1 U;
    public final x.b V;
    public final z0 W;
    public u1 X;

    public h(w2 w2Var, e0 e0Var, s2 s2Var, boolean z10) {
        this.Q = w2Var;
        this.R = e0Var;
        this.S = s2Var;
        this.T = z10;
        i1 i1VarZ = l1.q.z(new y3.l(0L));
        this.U = i1VarZ;
        this.V = new x.b(new h2.b(kh.n.y(this.Q, this.R, this.S, ((y3.l) i1VarZ.getValue()).f16596a)), e1.h0.f4966b, new h2.b(e1.h0.f4967c), 8);
        final int i10 = 0;
        u00.k kVar = new u00.k(this) {
            public final h B;

            {
                this.B = this;
            }

            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        return (h2.b) this.B.V.d();
                    default:
                        y3.h hVar = (y3.h) obj;
                        q2 q2Var = o1.f2734h;
                        h hVar2 = this.B;
                        y3.c cVar = (y3.c) b3.m.h(hVar2, q2Var);
                        hVar2.U.setValue(new y3.l((((long) cVar.R0(y3.h.b(hVar.f16589a))) << 32) | (((long) cVar.R0(y3.h.a(hVar.f16589a))) & 4294967295L)));
                        return g00.b0.a;
                }
            }
        };
        final int i11 = 1;
        u00.k kVar2 = new u00.k(this) {
            public final h B;

            {
                this.B = this;
            }

            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        return (h2.b) this.B.V.d();
                    default:
                        y3.h hVar = (y3.h) obj;
                        q2 q2Var = o1.f2734h;
                        h hVar2 = this.B;
                        y3.c cVar = (y3.c) b3.m.h(hVar2, q2Var);
                        hVar2.U.setValue(new y3.l((((long) cVar.R0(y3.h.b(hVar.f16589a))) << 32) | (((long) cVar.R0(y3.h.a(hVar.f16589a))) & 4294967295L)));
                        return g00.b0.a;
                }
            }
        };
        j3.z zVar = a1.f16893a;
        z0 z0Var = new z0(kVar, kVar2, l1.f16945a);
        B1(z0Var);
        this.W = z0Var;
    }

    public final void E1() {
        u1 u1Var = this.X;
        if (u1Var != null) {
            u1Var.i((CancellationException) null);
        }
        this.X = null;
        j3.z zVar = a1.f16893a;
        this.X = a40.c0.y(p1(), (k00.i) null, (a40.a0) null, new a1.d(this, null, 11), 3);
    }

    public final void W(p1 p1Var) {
        this.W.W(p1Var);
    }

    @Override
    public final void i(o0 o0Var) {
        o0Var.a();
        this.W.i(o0Var);
    }

    @Override
    public final void m1(j3.a0 a0Var) {
        this.W.m1(a0Var);
    }

    @Override
    public final void t1() {
        E1();
    }
}
