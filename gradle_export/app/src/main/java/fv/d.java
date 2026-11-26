package fv;

import b2.r;
import b3.h;
import b3.i;
import com.google.android.gms.internal.measurement.z3;
import g1.z6;
import h0.o;
import i2.t;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import m3.r0;
import q3.u;
import x3.k;
import x3.l;
import z0.g;
import z2.w0;

public final class d implements z0.c {
    public final g a;

    public void a(v1.c cVar, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(893390621);
        int i2 = (g0Var.g(this) ? 32 : 16) | i;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            w0 w0VarD = o.d(b2.b.D, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(b2.o.A, g0Var);
            i.c.getClass();
            b3.g gVar = h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, h.f);
            q.I(m1VarM, g0Var, h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, h.g);
            q.E(g0Var, h.h);
            q.I(rVarC, g0Var, h.d);
            if (this.a.d().C.length() == 0) {
                g0Var.c0(-913813150);
                z6.b(z3.U(g0Var, 2131887198), (r) null, t.b(0.5f, dl.a.i), kh.o.z(16), (u) null, (q3.i) null, 0L, (l) null, (k) null, kh.o.z(22), 0, false, 1, 0, (u00.k) null, (r0) null, g0Var, 24576, 24624, 243690);
                g0Var = g0Var;
                g0Var.r(false);
            } else {
                g0Var.c0(-913466229);
                g0Var.r(false);
            }
            cVar.invoke(g0Var, 6);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new al.i((z0.c) this, cVar, i, 13);
        }
    }
}
