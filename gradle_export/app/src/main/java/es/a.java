package es;

import b2.o;
import b2.r;
import b3.g;
import b3.i;
import com.google.android.gms.internal.measurement.y3;
import ct.a0;
import f2.h;
import g1.o3;
import h0.z1;
import i2.b0;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import z.n;
import z2.w0;

public abstract class a {
    public static final float a = 192;

    public static final void a(float f, int i, r rVar, j jVar) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1196407367);
        int i2 = i | 54;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            rVar = o.A;
            f = a;
            r rVarF = n.f(h.c(z1.m(rVar, f), p0.f.a), dl.a.D, b0.b);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarF, g0Var);
            i.c.getClass();
            g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC, g0Var, b3.h.d);
            o3.a(y3.R(2131231094, g0Var, 0), (String) null, z1.m(rVar, 0.4f * f), dl.a.i, g0Var, 56, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new a0(rVar, f, i, 1);
        }
    }
}
