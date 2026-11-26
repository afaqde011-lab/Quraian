package b6;

import a30.x;
import d6.x1;
import java.util.ArrayList;
import java.util.List;

public final class b extends x {
    public b(x1 x1Var) {
        super(x1Var);
        int i10 = x1Var.f2177a;
    }

    public final void d(int i10, Object obj) {
    }

    public final void g(int i10, int i11, int i12) {
        ArrayList arrayListU = u();
        int i13 = i10 > i11 ? i11 : i11 - i12;
        if (i12 != 1) {
            List listSubList = arrayListU.subList(i10, i12 + i10);
            ArrayList arrayListO1 = h00.q.o1(listSubList);
            listSubList.clear();
            arrayListU.addAll(i13, arrayListO1);
            return;
        }
        if (i10 == i11 + 1 || i10 == i11 - 1) {
            arrayListU.set(i10, arrayListU.set(i11, arrayListU.get(i10)));
        } else {
            arrayListU.add(i13, arrayListU.remove(i10));
        }
    }

    public final void h(int i10, int i11) {
        ArrayList arrayListU = u();
        if (i11 == 1) {
            arrayListU.remove(i10);
        } else {
            arrayListU.subList(i10, i11 + i10).clear();
        }
    }

    public final void n(int i10, Object obj) {
        h hVar = (h) obj;
        Object obj2 = ((x) this).D;
        kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        int i11 = ((j) obj2).f2177a;
        if (i11 > 0) {
            if (hVar instanceof j) {
                ((j) hVar).f2177a = i11 - 1;
            }
            u().add(i10, hVar);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Too many embedded views for the current surface. The maximum depth is: ");
        Object obj3 = ((x) this).B;
        kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        sb2.append(((j) obj3).f2177a);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public final void r() {
        Object obj = ((x) this).B;
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        ((j) obj).f2178b.clear();
    }

    public final ArrayList u() {
        h hVar = (h) ((x) this).D;
        if (hVar instanceof j) {
            return ((j) hVar).f2178b;
        }
        throw new IllegalStateException("Current node cannot accept children");
    }
}
