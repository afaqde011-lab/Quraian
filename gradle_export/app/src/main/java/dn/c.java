package dn;

import a10.h0;
import a40.c0;
import android.app.Application;
import ev.p;
import h00.n;
import ri.t1;

public final class c {
    public final Application a;
    public final lb.f b;

    public c(Application application, lb.f fVar) {
        this.a = application;
        this.b = fVar;
    }

    public final Object a(String str, float f, zb.c cVar, m00.c cVar2) {
        b bVar;
        if (cVar2 instanceof b) {
            bVar = (b) cVar2;
            int i = bVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.C = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar2);
            }
        } else {
            bVar = new b(this, cVar2);
        }
        Object objK = bVar.A;
        l00.a aVar = l00.a.A;
        int i2 = bVar.C;
        k00.c cVar3 = null;
        if (i2 == 0) {
            t1.O(objK);
            if (str != null && !r30.k.L0(str)) {
                Application application = this.a;
                int iF = w00.a.F(f * application.getResources().getDisplayMetrics().density);
                if (iF > 256) {
                    iF = 256;
                }
                wb.h hVar = new wb.h(application);
                hVar.c = str;
                hVar.c(iF);
                hVar.h = h0.P(n.V0(new zb.c[]{cVar}));
                hVar.m = Boolean.FALSE;
                hVar.o = wb.b.C;
                wb.i iVarA = hVar.a();
                bVar.C = 1;
                objK = c0.k(new p(iVarA, this.b, cVar3, 23), bVar);
                if (objK == aVar) {
                    return aVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t1.O(objK);
        wb.p pVar = objK instanceof wb.p ? (wb.p) objK : null;
        if (pVar != null) {
            return f50.c.b0(pVar.a, 7);
        }
        return null;
    }
}
