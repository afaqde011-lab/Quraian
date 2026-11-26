package mb;

import com.google.android.gms.internal.measurement.x5;
import l1.g0;

public abstract class c0 {

    public static final long f10803a = y3.b.h(0, 0, 0, 0);

    public static final xb.e f10804b = new xb.e(xb.g.f16512c);

    public static final wb.i a(wb.i iVar, z2.p pVar, l1.j jVar) {
        xb.h hVar;
        g0 g0Var = (g0) jVar;
        g0Var.d0(1677680258);
        if (iVar.A.f15905a != null) {
            g0Var.r(false);
            return iVar;
        }
        g0Var.d0(-679565543);
        boolean zA = kotlin.jvm.internal.m.a(pVar, z2.o.f17149e);
        l1.c cVar = l1.i.f9868a;
        if (zA) {
            hVar = f10804b;
        } else {
            g0Var.d0(-679565452);
            Object objN = g0Var.N();
            if (objN == cVar) {
                objN = new q();
                g0Var.n0(objN);
            }
            hVar = (q) objN;
            g0Var.r(false);
        }
        g0Var.r(false);
        g0Var.d0(-679565365);
        g0Var.d0(-679565358);
        boolean zG = g0Var.g(iVar) | g0Var.g(hVar);
        Object objN2 = g0Var.N();
        if (zG || objN2 == cVar) {
            wb.h hVarA = wb.i.a(iVar);
            hVarA.f15930q = hVar;
            hVarA.f15932s = null;
            hVarA.f15933t = null;
            hVarA.f15934u = null;
            objN2 = hVarA.a();
            g0Var.n0(objN2);
        }
        wb.i iVar2 = (wb.i) objN2;
        x5.z(g0Var, false, false, false);
        return iVar2;
    }
}
