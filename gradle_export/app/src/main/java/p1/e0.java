package p1;

import java.util.ArrayList;
import l1.r1;

public final class e0 extends k20.d {

    public static final e0 f12264d = new e0(0, 1, 1);

    public final void d(androidx.media3.common.k kVar, l1.a aVar, o1.k kVar2, v1.i iVar, k0 k0Var) {
        r1 r1Var = (r1) kVar.d(0);
        u.i0 i0Var = iVar.f15343i;
        v1.f fVar = i0Var != null ? (v1.f) i0Var.g(r1Var) : null;
        if (fVar != null) {
            ArrayList arrayList = iVar.f15344j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                iVar.f15344j = arrayList;
            }
            arrayList.add(iVar.f15339e);
            iVar.f15339e = fVar.B;
        }
    }
}
