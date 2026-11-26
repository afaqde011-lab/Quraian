package g1;

import java.util.ArrayList;

public final class z2 implements u00.o {
    public final v1.c A;
    public final boolean B;

    public z2(v1.c cVar, boolean z10) {
        this.A = cVar;
        this.B = z10;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strL;
        l1.j jVar = (l1.j) obj2;
        int iIntValue = ((Number) obj3).intValue();
        l1.g0 g0Var = (l1.g0) jVar;
        if (g0Var.S(iIntValue & 1, (iIntValue & 17) != 16)) {
            this.A.invoke(jVar, 0);
            float f3 = s.f5958e;
            b2.r rVarR = b2.o.A;
            h0.c.h(h0.z1.m(rVarR, f3), jVar);
            o2.f fVarB = h1.f.f6507f;
            if (fVarB == null) {
                o2.e eVar = new o2.e("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                int i10 = o2.g0.f11581a;
                i2.v0 v0Var = new i2.v0(i2.t.f7162b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new o2.n(7.0f, 10.0f));
                arrayList.add(new o2.u(5.0f, 5.0f));
                arrayList.add(new o2.u(5.0f, -5.0f));
                arrayList.add(o2.j.f11607c);
                o2.e.a(eVar, arrayList, v0Var);
                fVarB = eVar.b();
                h1.f.f6507f = fVarB;
            }
            o2.f fVar = fVarB;
            boolean z10 = this.B;
            if (z10) {
                g0Var.c0(1509384391);
                strL = h1.f.l(jVar, 2131886670);
                g0Var.r(false);
            } else {
                g0Var.c0(1509478662);
                strL = h1.f.l(jVar, 2131886674);
                g0Var.r(false);
            }
            String str = strL;
            float f10 = z10 ? 180.0f : 0.0f;
            if (f10 != 0.0f) {
                rVarR = i2.b0.r(rVarR, 0.0f, 0.0f, 0.0f, f10, null, null, 524031);
            }
            o3.b(fVar, str, rVarR, 0L, jVar, 0, 8);
        } else {
            g0Var.V();
        }
        return g00.b0.a;
    }
}
