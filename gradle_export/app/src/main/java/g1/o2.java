package g1;

import java.util.ArrayList;

public final class o2 implements u00.n {
    public final int A;
    public final u00.k B;
    public final b2.r C;

    public o2(int i10, b2.r rVar, u00.k kVar) {
        this.A = i10;
        this.B = kVar;
        this.C = rVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        l1.j jVar = (l1.j) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.g0 g0Var = (l1.g0) jVar;
        if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
            int i10 = this.A;
            l1.c cVar = l1.i.f9868a;
            u00.k kVar = this.B;
            if (i10 == 0) {
                g0Var.c0(-101264927);
                o2.f fVarB = h1.f.f6505d;
                if (fVarB == null) {
                    o2.e eVar = new o2.e("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                    int i11 = o2.g0.f11581a;
                    i2.v0 v0Var = new i2.v0(i2.t.f7162b);
                    db.g gVar = new db.g(4, (byte) 0);
                    ArrayList arrayList = gVar.B;
                    gVar.p(3.0f, 17.25f);
                    arrayList.add(new o2.a0(21.0f));
                    gVar.m(3.75f);
                    gVar.n(17.81f, 9.94f);
                    gVar.o(-3.75f, -3.75f);
                    gVar.n(3.0f, 17.25f);
                    gVar.k();
                    gVar.p(20.71f, 7.04f);
                    gVar.l(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                    gVar.o(-2.34f, -2.34f);
                    gVar.l(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                    gVar.o(-1.83f, 1.83f);
                    gVar.o(3.75f, 3.75f);
                    gVar.o(1.83f, -1.83f);
                    gVar.k();
                    o2.e.a(eVar, arrayList, v0Var);
                    fVarB = eVar.b();
                    h1.f.f6505d = fVarB;
                }
                String strL = h1.f.l(jVar, 2131886671);
                boolean zG = g0Var.g(kVar);
                Object objN = g0Var.N();
                if (zG || objN == cVar) {
                    objN = new fy.r(3, kVar);
                    g0Var.n0(objN);
                }
                a3.h((u00.a) objN, fVarB, strL, this.C, false, jVar, 0, 16);
                g0Var.r(false);
            } else {
                g0Var.c0(-100967048);
                o2.f fVarB2 = h1.f.f6506e;
                if (fVarB2 == null) {
                    o2.e eVar2 = new o2.e("Filled.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                    int i12 = o2.g0.f11581a;
                    i2.v0 v0Var2 = new i2.v0(i2.t.f7162b);
                    db.g gVar2 = new db.g(4, (byte) 0);
                    gVar2.p(9.0f, 11.0f);
                    gVar2.n(7.0f, 11.0f);
                    gVar2.r(2.0f);
                    gVar2.m(2.0f);
                    gVar2.r(-2.0f);
                    gVar2.k();
                    gVar2.p(13.0f, 11.0f);
                    gVar2.m(-2.0f);
                    gVar2.r(2.0f);
                    gVar2.m(2.0f);
                    gVar2.r(-2.0f);
                    gVar2.k();
                    gVar2.p(17.0f, 11.0f);
                    gVar2.m(-2.0f);
                    gVar2.r(2.0f);
                    gVar2.m(2.0f);
                    gVar2.r(-2.0f);
                    gVar2.k();
                    gVar2.p(19.0f, 4.0f);
                    gVar2.m(-1.0f);
                    gVar2.n(18.0f, 2.0f);
                    gVar2.m(-2.0f);
                    gVar2.r(2.0f);
                    gVar2.n(8.0f, 4.0f);
                    gVar2.n(8.0f, 2.0f);
                    gVar2.n(6.0f, 2.0f);
                    gVar2.r(2.0f);
                    gVar2.n(5.0f, 4.0f);
                    gVar2.l(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                    gVar2.n(3.0f, 20.0f);
                    gVar2.l(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                    gVar2.m(14.0f);
                    gVar2.l(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                    gVar2.n(21.0f, 6.0f);
                    gVar2.l(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    gVar2.k();
                    gVar2.p(19.0f, 20.0f);
                    gVar2.n(5.0f, 20.0f);
                    gVar2.n(5.0f, 9.0f);
                    gVar2.m(14.0f);
                    gVar2.r(11.0f);
                    gVar2.k();
                    o2.e.a(eVar2, gVar2.B, v0Var2);
                    fVarB2 = eVar2.b();
                    h1.f.f6506e = fVarB2;
                }
                String strL2 = h1.f.l(jVar, 2131886669);
                boolean zG2 = g0Var.g(kVar);
                Object objN2 = g0Var.N();
                if (zG2 || objN2 == cVar) {
                    objN2 = new fy.r(4, kVar);
                    g0Var.n0(objN2);
                }
                a3.h((u00.a) objN2, fVarB2, strL2, this.C, false, jVar, 0, 16);
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        return g00.b0.a;
    }
}
