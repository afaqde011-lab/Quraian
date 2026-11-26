package c3;

import java.util.List;

public final class s2 {

    public final j3.o f2760a;

    public final u.x f2761b;

    public s2(j3.s sVar, u.l lVar) {
        this.f2760a = sVar.f7968d;
        List listJ = j3.s.j(4, sVar);
        this.f2761b = new u.x(listJ.size());
        int size = listJ.size();
        for (int i10 = 0; i10 < size; i10++) {
            j3.s sVar2 = (j3.s) listJ.get(i10);
            if (lVar.a(sVar2.f7970f)) {
                this.f2761b.a(sVar2.f7970f);
            }
        }
    }
}
