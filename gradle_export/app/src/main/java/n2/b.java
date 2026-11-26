package n2;

import ab.a0;
import b3.o0;
import h1.l;
import i2.b0;
import i2.m;
import i2.t0;
import u.i0;
import y3.g;

public final class b extends m2.b {
    public final t0 E;
    public final d F;
    public final l G;
    public float H = 1.0f;
    public m I;

    public b(t0 t0Var, d dVar, l lVar) {
        this.E = t0Var;
        this.F = dVar;
        this.G = lVar;
        y3.m mVar = y3.m.A;
    }

    @Override
    public final void a(float f3) {
        this.H = f3;
    }

    @Override
    public final void e(m mVar) {
        this.I = mVar;
    }

    @Override
    public final long h() {
        return 9205357640488583168L;
    }

    @Override
    public final void i(o0 o0Var) {
        c cVar;
        l lVar = this.G;
        t0 t0Var = this.E;
        long jB = o0Var.A.b();
        y3.m layoutDirection = o0Var.getLayoutDirection();
        d dVar = this.F;
        synchronized (lVar) {
            a aVar = (a) lVar.B;
            if (aVar == null) {
                a aVar2 = new a(b0.f7111b, 0L, y3.m.A, 1.0f, null);
                lVar.B = aVar2;
                aVar = aVar2;
            }
            aVar.f11001a = t0Var;
            aVar.f11002b = jB;
            aVar.f11003c = layoutDirection;
            aVar.f11004d = o0Var.A.c();
            aVar.f11005e = new d(dVar.f11017a, dVar.f11018b, dVar.f11020d, dVar.f11019c);
            i0 i0Var = (i0) lVar.A;
            if (i0Var == null) {
                i0Var = new i0();
                lVar.A = i0Var;
            }
            cVar = (c) i0Var.g(aVar);
            if (cVar == null) {
                cVar = new c(dVar, t0Var.a(jB, layoutDirection, o0Var));
                i0 i0Var2 = (i0) lVar.A;
                if (i0Var2 == null) {
                    i0Var2 = new i0();
                    lVar.A = i0Var2;
                }
                i0Var2.m(new a(aVar.f11001a, aVar.f11002b, aVar.f11003c, aVar.f11004d, aVar.f11005e), cVar);
            }
        }
        this.F.getClass();
        float fA0 = o0Var.A0(g.a(0L));
        this.F.getClass();
        float fA1 = o0Var.A0(g.b(0L));
        ((hf.c) o0Var.A.B.B).I(fA0, fA1);
        try {
            m mVar = this.I;
            long jB2 = o0Var.A.b();
            d dVar2 = cVar.f11014i;
            long j9 = dVar2.f11019c;
            float fX = a0.x(this.H * dVar2.f11020d, 0.0f, 1.0f);
            cVar.f11014i.getClass();
            cVar.a(o0Var, mVar, jB2, j9, fX);
        } finally {
            ((hf.c) o0Var.A.B.B).I(-fA0, -fA1);
        }
    }
}
