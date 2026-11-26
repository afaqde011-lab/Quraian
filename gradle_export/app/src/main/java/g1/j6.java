package g1;

import com.google.android.gms.cast.MediaError;

public abstract class j6 {

    public static final float f5846a = 22;

    public static final x.q1 f5847b = x.c.w(MediaError.DetailedErrorCode.NETWORK_UNKNOWN, 0, x.x.f16384a, 2);

    public static final void a(v1.c cVar, l1.j jVar, int i10) {
        v1.c cVar2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1033612924);
        if (g0Var.S(i10 & 1, (i10 & 19) != 18)) {
            String strL = h1.f.l(g0Var, 2131886652);
            h0.m0 m0Var = new h0.m0(b2.b.N);
            z2.w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(m0Var, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            b3.f fVar = b3.h.f2040g;
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode))) {
                com.google.android.gms.internal.measurement.x5.v(iHashCode, g0Var, iHashCode, fVar);
            }
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            cVar2 = cVar;
            h8.b(e8.a(g0Var), v1.d.d(2059851063, new s2(strL, 1), g0Var), h8.c(g0Var), null, false, cVar2, g0Var, 100663344);
            g0Var.r(true);
        } else {
            cVar2 = cVar;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new al.j(cVar2, i10, 1);
        }
    }
}
