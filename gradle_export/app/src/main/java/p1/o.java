package p1;

import java.util.ArrayList;
import l1.r1;

public final class o extends k20.d {

    public static final o f12285d = new o(0, 1, 1);

    public final void d(androidx.media3.common.k kVar, l1.a aVar, o1.k kVar2, v1.i iVar, k0 k0Var) {
        m1.e eVar;
        r1 r1Var = (r1) kVar.d(0);
        u.i0 i0Var = iVar.f15343i;
        if (i0Var == null || ((v1.f) i0Var.g(r1Var)) == null) {
            return;
        }
        ArrayList arrayList = iVar.f15344j;
        if (arrayList != null && (eVar = (m1.e) arrayList.remove(arrayList.size() - 1)) != null) {
            iVar.f15339e = eVar;
        }
        i0Var.k(r1Var);
    }
}
