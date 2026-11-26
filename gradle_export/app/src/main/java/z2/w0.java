package z2;

import java.util.ArrayList;
import java.util.List;

public interface w0 {
    default int b(w wVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new b3.r1((v0) list.get(i11), x.A, y.B, 1));
        }
        return j(new z(wVar, wVar.getLayoutDirection()), arrayList, y3.b.b(0, i10, 0, 0, 13)).c();
    }

    default int d(w wVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new b3.r1((v0) list.get(i11), x.A, y.A, 1));
        }
        return j(new z(wVar, wVar.getLayoutDirection()), arrayList, y3.b.b(0, 0, 0, i10, 7)).d();
    }

    default int g(w wVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new b3.r1((v0) list.get(i11), x.B, y.B, 1));
        }
        return j(new z(wVar, wVar.getLayoutDirection()), arrayList, y3.b.b(0, i10, 0, 0, 13)).c();
    }

    default int i(w wVar, List list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new b3.r1((v0) list.get(i11), x.B, y.A, 1));
        }
        return j(new z(wVar, wVar.getLayoutDirection()), arrayList, y3.b.b(0, 0, 0, i10, 7)).d();
    }

    x0 j(y0 y0Var, List list, long j9);
}
