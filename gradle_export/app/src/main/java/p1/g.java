package p1;

import java.util.List;

public final class g extends k20.d {

    public static final g f12267d = new g(0, 2, 1);

    public final void d(androidx.media3.common.k kVar, l1.a aVar, o1.k kVar2, v1.i iVar, k0 k0Var) {
        int i10 = ((v1.e) kVar.d(0)).f15334a;
        List list = (List) kVar.d(1);
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            int i12 = i10 + i11;
            aVar.d(i12, obj);
            aVar.n(i12, obj);
        }
    }
}
