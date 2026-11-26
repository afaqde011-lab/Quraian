package e1;

import java.util.ArrayList;
import java.util.List;
import z2.k1;
import z2.l1;

public final class k0 implements u00.k {
    public final int A;
    public final ArrayList B;

    public k0(int i10, ArrayList arrayList) {
        this.A = i10;
        this.B = arrayList;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                k1 k1Var = (k1) obj;
                ArrayList arrayList = this.B;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    k1Var.h((l1) arrayList.get(i10), 0, 0, 0.0f);
                }
                break;
            case 1:
                k1 k1Var2 = (k1) obj;
                ArrayList arrayList2 = this.B;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    m0.f fVar = (m0.f) arrayList2.get(i11);
                    List list = fVar.f10322b;
                    boolean z10 = fVar.f10327g;
                    if (fVar.f10331k == Integer.MIN_VALUE) {
                        g0.a.a("position() should be called first");
                    }
                    int size3 = list.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        l1 l1Var = (l1) list.get(i12);
                        int[] iArr = fVar.f10329i;
                        int i13 = i12 * 2;
                        int i14 = i11;
                        long jD = y3.j.d((((long) iArr[i13]) << 32) | (((long) iArr[i13 + 1]) & 4294967295L), fVar.f10323c);
                        if (z10) {
                            k1.u(k1Var2, l1Var, jD, null, 6);
                        } else {
                            k1.p(k1Var2, l1Var, jD);
                        }
                        i12++;
                        i11 = i14;
                    }
                    i11++;
                }
                break;
            default:
                k1 k1Var3 = (k1) obj;
                ArrayList arrayList3 = this.B;
                int size4 = arrayList3.size();
                for (int i15 = 0; i15 < size4; i15++) {
                    k1.k(k1Var3, (l1) arrayList3.get(i15), 0, 0);
                }
                break;
        }
        return g00.b0.a;
    }
}
