package jk;

import l1.i1;
import l1.q;
import m3.r0;
import q0.u1;
import y3.m;

public final class l {

    public m f8319a;

    public long f8320b;

    public Object f8321c;

    public Object f8322d;

    public Object f8323e;

    public Object f8324f;

    public final Object f8325g;

    public l(u00.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "shapeBlock");
        this.f8321c = aVar;
        this.f8320b = 9205357640488583168L;
        this.f8325g = new k(this, 0);
    }

    public l(m mVar, y3.c cVar, q3.h hVar, r0 r0Var, Object obj) {
        this.f8319a = mVar;
        this.f8321c = cVar;
        this.f8322d = hVar;
        this.f8323e = r0Var;
        this.f8324f = obj;
        this.f8325g = q.z(Boolean.TRUE);
        this.f8320b = u1.a((r0) this.f8323e, (y3.c) this.f8321c, (q3.h) this.f8322d, u1.f12702a, 1);
    }

    public static void a(l lVar, m mVar, y3.c cVar, r0 r0Var, int i10) {
        if ((i10 & 1) != 0) {
            mVar = lVar.f8319a;
        }
        if ((i10 & 2) != 0) {
            cVar = (y3.c) lVar.f8321c;
        }
        q3.h hVar = (q3.h) lVar.f8322d;
        if ((i10 & 8) != 0) {
            r0Var = (r0) lVar.f8323e;
        }
        Object obj = lVar.f8324f;
        m mVar2 = lVar.f8319a;
        i1 i1Var = (i1) lVar.f8325g;
        if (mVar == mVar2 && kotlin.jvm.internal.m.a(cVar, (y3.c) lVar.f8321c) && kotlin.jvm.internal.m.a(hVar, (q3.h) lVar.f8322d) && kotlin.jvm.internal.m.a(r0Var, (r0) lVar.f8323e)) {
            if (kotlin.jvm.internal.m.a(obj, lVar.f8324f)) {
                return;
            }
            lVar.f8324f = obj;
            i1Var.setValue(Boolean.TRUE);
            return;
        }
        lVar.f8319a = mVar;
        lVar.f8321c = cVar;
        lVar.f8322d = hVar;
        lVar.f8323e = r0Var;
        i1Var.setValue(Boolean.TRUE);
    }
}
