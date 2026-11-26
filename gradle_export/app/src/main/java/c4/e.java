package c4;

import java.util.ArrayList;
import java.util.List;
import z2.l1;
import z2.v0;
import z2.w0;
import z2.x0;
import z2.y0;

public final class e implements w0 {

    public static final e f2832b = new e(0);

    public static final e f2833c = new e(1);

    public final int f2834a;

    public e(int i10) {
        this.f2834a = i10;
    }

    @Override
    public final x0 j(y0 y0Var, List list, long j9) {
        switch (this.f2834a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iJ = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    l1 l1VarO = ((v0) list.get(i11)).O(j9);
                    iJ = Math.max(iJ, l1VarO.A);
                    i10 = Math.max(i10, l1VarO.B);
                    arrayList.add(l1VarO);
                }
                if (list.isEmpty()) {
                    iJ = y3.a.j(j9);
                    i10 = y3.a.i(j9);
                }
                return y0Var.o0(iJ, i10, h00.y.A, new d(0, arrayList));
            default:
                int size2 = list.size();
                h00.y yVar = h00.y.A;
                if (size2 == 0) {
                    return y0Var.o0(0, 0, yVar, b.F);
                }
                if (size2 == 1) {
                    l1 l1VarO2 = ((v0) list.get(0)).O(j9);
                    return y0Var.o0(l1VarO2.A, l1VarO2.B, yVar, new c3.m(l1VarO2, 1));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i12 = 0; i12 < size3; i12++) {
                    l1 l1VarO3 = ((v0) list.get(i12)).O(j9);
                    iMax = Math.max(iMax, l1VarO3.A);
                    iMax2 = Math.max(iMax2, l1VarO3.B);
                    arrayList2.add(l1VarO3);
                }
                return y0Var.o0(iMax, iMax2, yVar, new d(1, arrayList2));
        }
    }
}
