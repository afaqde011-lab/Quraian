package f2;

import b2.r;
import i2.b0;
import i2.d0;
import i2.o0;
import i2.t0;

public abstract class h {
    public static final r a(r rVar, float f3) {
        return f3 == 1.0f ? rVar : b0.r(rVar, 0.0f, 0.0f, f3, 0.0f, null, null, 520187);
    }

    public static final r b(r rVar, float f3, o0 o0Var) {
        boolean z10;
        int i10;
        if (o0Var != null) {
            i10 = 0;
            z10 = true;
        } else {
            z10 = false;
            i10 = 3;
        }
        float f10 = 0;
        return ((y3.f.a(f3, f10) <= 0 || y3.f.a(f3, f10) <= 0) && !z10) ? rVar : b0.p(rVar, new a(f3, f3, i10, o0Var, z10));
    }

    public static final r c(r rVar, t0 t0Var) {
        return b0.r(rVar, 0.0f, 0.0f, 0.0f, 0.0f, t0Var, null, 518143);
    }

    public static final r d(r rVar) {
        return b0.r(rVar, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 520191);
    }

    public static final r e(r rVar, u00.k kVar) {
        return rVar.V(new f(kVar));
    }

    public static final r f(r rVar, u00.k kVar) {
        return rVar.V(new i(kVar));
    }

    public static final r g(r rVar, u00.k kVar) {
        return rVar.V(new j(kVar));
    }

    public static r h(r rVar, m2.b bVar, b2.d dVar, z2.p pVar, float f3, i2.m mVar, int i10) {
        if ((i10 & 4) != 0) {
            dVar = b2.b.E;
        }
        b2.d dVar2 = dVar;
        if ((i10 & 16) != 0) {
            f3 = 1.0f;
        }
        return rVar.V(new m(bVar, dVar2, pVar, f3, mVar));
    }

    public static final r i(r rVar, float f3, float f10) {
        return (f3 == 1.0f && f10 == 1.0f) ? rVar : b0.r(rVar, f3, f10, 0.0f, 0.0f, null, null, 524284);
    }

    public static r j(r rVar, float f3, t0 t0Var, long j9, long j10, int i10) {
        boolean z10 = y3.f.a(f3, (float) 0) > 0;
        return (y3.f.a(f3, (float) 0) > 0 || z10) ? rVar.V(new o(f3, t0Var, z10, (i10 & 8) != 0 ? d0.f7118a : j9, (i10 & 16) != 0 ? d0.f7118a : j10)) : rVar;
    }
}
