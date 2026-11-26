package c4;

import java.util.ArrayList;
import z2.k1;
import z2.l1;

public final class d extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final ArrayList B;

    public d(int i10, ArrayList arrayList) {
        super(1);
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
                    k1.k(k1Var, (l1) arrayList.get(i10), 0, 0);
                }
                break;
            case 1:
                k1 k1Var2 = (k1) obj;
                ArrayList arrayList2 = this.B;
                int iM = va.a.M(arrayList2);
                if (iM >= 0) {
                    int i11 = 0;
                    while (true) {
                        k1.k(k1Var2, (l1) arrayList2.get(i11), 0, 0);
                        if (i11 != iM) {
                            i11++;
                        }
                    }
                }
                break;
            default:
                k1 k1Var3 = (k1) obj;
                ArrayList arrayList3 = this.B;
                int size2 = arrayList3.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    k1.o(k1Var3, (l1) arrayList3.get(i12), 0, 0);
                }
                break;
        }
        return g00.b0.a;
    }
}
