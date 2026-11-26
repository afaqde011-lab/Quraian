package d00;

import a40.u1;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import b3.o2;
import b3.p1;
import b3.v1;
import c3.o1;
import d0.i2;

public final class w0 extends b2.q implements b3.j, b3.p, b3.x, b3.o, o2, v1 {
    public final c O;
    public x0 P;
    public z2.a0 Q;
    public u1 R;

    public w0(x0 x0Var) {
        c cVar = new c();
        this.O = cVar;
        cVar.c.i(0.0f);
        this.P = x0Var;
    }

    public final u1 B1() {
        return a40.c0.y(p1(), null, null, new a1.a0(this, (k00.c) null, 10), 3);
    }

    public final void C1(z2.a0 a0Var) {
        if (((b2.q) this).N) {
            this.Q = a0Var;
            long jE = h0.e(a0Var, (u0) this.P.b.getValue());
            c cVar = this.O;
            cVar.c(jE);
            cVar.b.setValue(new h2.e(kh.n.m0(a0Var.p())));
            cVar.d = ((View) b3.m.h(this, c3.o0.f)).getWindowId();
        }
    }

    public final void J0() {
        b3.m.t(this, new a1.z(this, 16));
    }

    public final void W(p1 p1Var) {
        C1(p1Var);
    }

    public final void c1(z2.a0 coordinates) {
        kotlin.jvm.internal.m.e(coordinates, "coordinates");
        z1.f fVarF = z1.q.f();
        u00.k kVarE = fVarF != null ? fVarF.e() : null;
        z1.f fVarK = z1.q.k(fVarF);
        try {
            if ((this.O.b() & 9223372034707292159L) == 9205357640488583168L) {
                C1(coordinates);
            }
        } finally {
            z1.q.n(fVarF, fVarK, kVarE);
        }
    }

    public final void i(b3.o0 o0Var) {
        c cVar = this.O;
        try {
            cVar.g = true;
            if (((b2.q) this).N) {
                if (w00.a.F(h2.e.d(o0Var.A.b())) >= 1) {
                    i2.y yVar = (i2.y) b3.m.h(this, o1.g);
                    l2.b bVarA = cVar.a();
                    if (bVarA == null) {
                        bVarA = yVar.c();
                        cVar.f.setValue(bVarA);
                    } else {
                        if (bVarA.s) {
                            bVarA = null;
                        }
                        if (bVarA == null) {
                            bVarA = yVar.c();
                            cVar.f.setValue(bVarA);
                        }
                    }
                    k2.d.Z(o0Var, bVarA, new k0(o0Var, bVarA));
                    rd.a.x(o0Var, bVarA);
                } else {
                    h0.b(o0Var);
                }
            }
        } finally {
            cVar.g = false;
            B1();
        }
    }

    public final Object o() {
        return y0.B;
    }

    public final boolean q1() {
        return false;
    }

    public final void t1() {
        d.n nVar;
        x0 x0Var = this.P;
        x0Var.getClass();
        c area = this.O;
        kotlin.jvm.internal.m.e(area, "area");
        x0Var.c.add(area);
        Context baseContext = (Context) b3.m.h(this, c3.o0.b);
        while (true) {
            if (!(baseContext instanceof d.n)) {
                if (!(baseContext instanceof ContextWrapper)) {
                    nVar = null;
                    break;
                } else {
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    kotlin.jvm.internal.m.d(baseContext, "getBaseContext(...)");
                }
            } else {
                nVar = (d.n) baseContext;
                break;
            }
        }
        if (nVar != null) {
            a40.c0.y(p1(), null, null, new i2(nVar, this, (k00.c) null, 2), 3);
        }
        J0();
    }

    public final void u1() {
        c cVar = this.O;
        kotlin.jvm.internal.m.e(cVar, "<this>");
        cVar.c(9205357640488583168L);
        cVar.b.setValue(new h2.e(9205357640488583168L));
        cVar.g = false;
        l2.b bVarA = cVar.a();
        if (bVarA != null) {
            ((i2.y) b3.m.h(this, o1.g)).a(bVarA);
        }
        cVar.f.setValue((Object) null);
        x0 x0Var = this.P;
        x0Var.getClass();
        x0Var.c.remove(cVar);
    }

    public final void v1() {
        c cVar = this.O;
        kotlin.jvm.internal.m.e(cVar, "<this>");
        cVar.c(9205357640488583168L);
        cVar.b.setValue(new h2.e(9205357640488583168L));
        cVar.g = false;
    }
}
