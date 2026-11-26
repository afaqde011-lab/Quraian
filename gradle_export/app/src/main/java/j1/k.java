package j1;

import g1.l0;
import g1.x5;
import h0.s;
import h0.z1;
import h1.g0;
import h1.w0;
import l1.m1;
import l1.p2;
import l1.r1;

public abstract class k {

    public static final float f7845a = (float) 2.5d;

    public static final float f7846b = (float) 5.5d;

    public static final float f7847c = 16;

    public static final float f7848d = 40;

    public static final float f7849e = 10;

    public static final float f7850f = 5;

    public static final void a(g0 g0Var, long j9, l1.j jVar, int i10) {
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(-1353562852);
        int i11 = (g0Var2.g(g0Var) ? 4 : 2) | i10 | (g0Var2.f(j9) ? 32 : 16);
        if (g0Var2.S(i11 & 1, (i11 & 19) != 18)) {
            Object objN = g0Var2.N();
            l1.c cVar = l1.i.f9868a;
            Object obj = objN;
            if (objN == cVar) {
                i2.g gVarA = i2.j.a();
                gVarA.j(1);
                g0Var2.n0(gVarA);
                obj = gVarA;
            }
            i2.g gVar = (i2.g) obj;
            Object objN2 = g0Var2.N();
            if (objN2 == cVar) {
                objN2 = l1.q.r(new l0(g0Var, 12));
                g0Var2.n0(objN2);
            }
            p2 p2VarB = x.d.b(((Number) ((p2) objN2).getValue()).floatValue(), x5.p(k1.q.C, g0Var2), null, g0Var2, 0, 28);
            int i12 = i11 & 14;
            boolean z10 = i12 == 4;
            Object objN3 = g0Var2.N();
            if (z10 || objN3 == cVar) {
                objN3 = new h00.a(g0Var, 7);
                g0Var2.n0(objN3);
            }
            b2.r rVarM = z1.m(j3.q.b(b2.o.A, (u00.k) objN3), f7847c);
            boolean zG = ((i11 & 112) == 32) | (i12 == 4) | g0Var2.g(p2VarB) | g0Var2.i(gVar);
            Object objN4 = g0Var2.N();
            if (zG || objN4 == cVar) {
                e00.q qVar = new e00.q(g0Var, p2VarB, j9, gVar, 1);
                g0Var2.n0(qVar);
                objN4 = qVar;
            }
            z.n.b(0, rVarM, g0Var2, (u00.k) objN4);
        } else {
            g0Var2.V();
        }
        r1 r1VarT = g0Var2.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new w0(g0Var, j9, i10);
        }
    }

    public static final void b(boolean z10, u00.a aVar, b2.r rVar, r rVar2, b2.d dVar, u00.o oVar, v1.c cVar, l1.j jVar, int i10) {
        u00.o oVar2;
        v1.c cVar2;
        b2.d dVar2;
        b2.d dVar3;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-532332839);
        int i11 = i10 | (g0Var.h(z10) ? 4 : 2) | (g0Var.i(aVar) ? 32 : 16) | (g0Var.g(rVar2) ? 2048 : 1024) | 24576;
        if (g0Var.S(i11 & 1, (599187 & i11) != 599186)) {
            g0Var.X();
            if ((i10 & 1) == 0 || g0Var.A()) {
                dVar3 = b2.b.A;
            } else {
                g0Var.V();
                dVar3 = dVar;
            }
            g0Var.s();
            b2.r rVarV = rVar.V(new i(z10, aVar, rVar2, h.f7842c));
            z2.w0 w0VarD = h0.o.d(dVar3, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarV, g0Var);
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
            s sVar = s.f6456a;
            cVar2 = cVar;
            cVar2.invoke(sVar, g0Var, 54);
            oVar2 = oVar;
            oVar2.invoke(sVar, g0Var, 54);
            g0Var.r(true);
            dVar2 = dVar3;
        } else {
            oVar2 = oVar;
            cVar2 = cVar;
            g0Var.V();
            dVar2 = dVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new j(z10, aVar, rVar, rVar2, dVar2, oVar2, cVar2, i10);
        }
    }

    public static final void c(k2.d dVar, i2.g gVar, h2.c cVar, long j9, float f3, gg.e eVar) {
        gVar.h();
        gVar.f(0.0f, 0.0f);
        float f10 = f7849e;
        float fA0 = dVar.A0(f10);
        float f11 = eVar.B;
        gVar.e((fA0 * f11) / 2, dVar.A0(f7850f) * f11);
        gVar.e(dVar.A0(f10) * f11, 0.0f);
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (cVar.c() >> 32)) + (Math.min(cVar.f6548c - cVar.f6546a, cVar.f6549d - cVar.f6547b) / 2.0f)) - ((dVar.A0(f10) * f11) / 2.0f);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cVar.c() & 4294967295L));
        float f12 = f7845a;
        gVar.k((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2 - dVar.A0(f12))) & 4294967295L));
        float fA1 = eVar.A - dVar.A0(f12);
        long jY0 = dVar.Y0();
        a1.i iVarG0 = dVar.G0();
        long jQ = iVarG0.q();
        iVarG0.n().i();
        try {
            ((hf.c) iVarG0.B).F(fA1, jY0);
            k2.d.X0(dVar, gVar, j9, f3, new k2.h(dVar.A0(f12), 0.0f, 0, 0, null, 30), 48);
        } finally {
            w.c.t(iVarG0, jQ);
        }
    }

    public static final r d(l1.j jVar) {
        Object[] objArr = new Object[0];
        l1.g0 g0Var = (l1.g0) jVar;
        Object objN = g0Var.N();
        if (objN == l1.i.f9868a) {
            objN = new h.e(2);
            g0Var.n0(objN);
        }
        return (r) y1.k.f(objArr, r.f7851b, (u00.a) objN, jVar, 384);
    }
}
