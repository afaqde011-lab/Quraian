package g1;

import java.util.ArrayList;

public final class u2 implements u00.n {
    public final u00.a A;
    public final boolean B;
    public final u00.a C;
    public final boolean D;

    public u2(u00.a aVar, boolean z10, u00.a aVar2, boolean z11) {
        this.A = aVar;
        this.B = z10;
        this.C = aVar2;
        this.D = z11;
    }

    public final Object invoke(Object obj, Object obj2) {
        l1.j jVar = (l1.j) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.g0 g0Var = (l1.g0) jVar;
        if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
            h0.v1 v1VarA = h0.t1.a(h0.i.f6406a, b2.b.J, jVar, 0);
            int iT = l1.q.t(jVar);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(b2.o.A, jVar);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, jVar, b3.h.f2039f);
            l1.q.I(m1VarM, jVar, b3.h.f2038e);
            b3.f fVar = b3.h.f2040g;
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iT))) {
                com.google.android.gms.internal.measurement.x5.v(iT, g0Var, iT, fVar);
            }
            l1.q.I(rVarC, jVar, b3.h.f2037d);
            o2.f fVarB = h1.f.f6503b;
            if (fVarB == null) {
                o2.e eVar = new o2.e("AutoMirrored.Filled.KeyboardArrowLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                int i10 = o2.g0.f11581a;
                i2.v0 v0Var = new i2.v0(i2.t.f7162b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new o2.n(15.41f, 16.59f));
                arrayList.add(new o2.m(10.83f, 12.0f));
                arrayList.add(new o2.u(4.58f, -4.59f));
                arrayList.add(new o2.m(14.0f, 6.0f));
                arrayList.add(new o2.u(-6.0f, 6.0f));
                arrayList.add(new o2.u(6.0f, 6.0f));
                arrayList.add(new o2.u(1.41f, -1.41f));
                arrayList.add(o2.j.f11607c);
                o2.e.a(eVar, arrayList, v0Var);
                fVarB = eVar.b();
                h1.f.f6503b = fVarB;
            }
            a3.h(this.A, fVarB, h1.f.l(jVar, 2131886673), null, this.B, jVar, 0, 8);
            o2.f fVarB2 = h1.f.f6504c;
            if (fVarB2 == null) {
                o2.e eVar2 = new o2.e("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                int i11 = o2.g0.f11581a;
                i2.v0 v0Var2 = new i2.v0(i2.t.f7162b);
                ArrayList arrayList2 = new ArrayList(32);
                arrayList2.add(new o2.n(8.59f, 16.59f));
                arrayList2.add(new o2.m(13.17f, 12.0f));
                arrayList2.add(new o2.m(8.59f, 7.41f));
                arrayList2.add(new o2.m(10.0f, 6.0f));
                arrayList2.add(new o2.u(6.0f, 6.0f));
                arrayList2.add(new o2.u(-6.0f, 6.0f));
                arrayList2.add(new o2.u(-1.41f, -1.41f));
                arrayList2.add(o2.j.f11607c);
                o2.e.a(eVar2, arrayList2, v0Var2);
                fVarB2 = eVar2.b();
                h1.f.f6504c = fVarB2;
            }
            a3.h(this.C, fVarB2, h1.f.l(jVar, 2131886672), null, this.D, jVar, 0, 8);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        return g00.b0.a;
    }
}
