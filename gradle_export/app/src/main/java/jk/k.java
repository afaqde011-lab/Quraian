package jk;

import i2.i0;
import i2.l0;
import i2.t0;
import y3.m;

public final class k implements t0 {

    public final int f8317a;

    public final Object f8318b;

    public k(Object obj, int i10) {
        this.f8317a = i10;
        this.f8318b = obj;
    }

    @Override
    public final l0 a(long j9, m mVar, y3.c cVar) {
        switch (this.f8317a) {
            case 0:
                kotlin.jvm.internal.m.e(mVar, "layoutDirection");
                kotlin.jvm.internal.m.e(cVar, "density");
                l lVar = (l) this.f8318b;
                t0 t0Var = (t0) ((u00.a) lVar.f8321c).invoke();
                if (!kotlin.jvm.internal.m.a((t0) lVar.f8322d, t0Var)) {
                    lVar.f8322d = t0Var;
                    lVar.f8323e = null;
                }
                if (((l0) lVar.f8323e) != null && h2.e.a(lVar.f8320b, j9) && lVar.f8319a == mVar) {
                    Float f3 = (Float) lVar.f8324f;
                    float fC = cVar.c();
                    if (f3 == null || f3.floatValue() != fC) {
                        lVar.f8320b = j9;
                        lVar.f8319a = mVar;
                        lVar.f8324f = Float.valueOf(cVar.c());
                        lVar.f8323e = t0Var.a(j9, mVar, cVar);
                    }
                } else {
                    lVar.f8320b = j9;
                    lVar.f8319a = mVar;
                    lVar.f8324f = Float.valueOf(cVar.c());
                    lVar.f8323e = t0Var.a(j9, mVar, cVar);
                }
                l0 l0Var = (l0) lVar.f8323e;
                kotlin.jvm.internal.m.b(l0Var);
                return l0Var;
            default:
                return new i0((i2.g) this.f8318b);
        }
    }
}
