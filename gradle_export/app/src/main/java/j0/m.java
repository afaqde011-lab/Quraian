package j0;

import g00.b0;
import java.util.ArrayList;
import java.util.List;
import l1.z0;
import z2.k1;

public final class m implements u00.k {
    public final int A;
    public final z0 B;
    public final ArrayList C;
    public final Object D;
    public final boolean E;

    public m(z0 z0Var, ArrayList arrayList, List list, boolean z10, int i10) {
        this.A = i10;
        this.B = z0Var;
        this.C = arrayList;
        this.D = list;
        this.E = z10;
    }

    public final Object invoke(Object obj) {
        k1 k1Var = (k1) obj;
        switch (this.A) {
            case 0:
                k1Var.A = true;
                ArrayList arrayList = this.C;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    boolean z10 = this.E;
                    if (i10 >= size) {
                        ?? r4 = this.D;
                        int size2 = r4.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            ((o) r4.get(i11)).m(k1Var, z10);
                        }
                        k1Var.A = false;
                        this.B.getValue();
                    } else {
                        ((o) arrayList.get(i10)).m(k1Var, z10);
                        i10++;
                    }
                    break;
                }
                break;
            default:
                k1Var.A = true;
                ArrayList arrayList2 = this.C;
                int size3 = arrayList2.size();
                int i12 = 0;
                while (true) {
                    boolean z11 = this.E;
                    if (i12 >= size3) {
                        ?? r7 = this.D;
                        int size4 = r7.size();
                        for (int i13 = 0; i13 < size4; i13++) {
                            ((k0.q) r7.get(i13)).l(k1Var, z11);
                        }
                        k1Var.A = false;
                        this.B.getValue();
                    } else {
                        ((k0.q) arrayList2.get(i12)).l(k1Var, z11);
                        i12++;
                    }
                    break;
                }
                break;
        }
        return b0.a;
    }
}
