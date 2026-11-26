package z2;

import java.util.ArrayList;
import java.util.List;

public final class o1 extends b3.g0 {

    public static final o1 f17151b = new o1("Undefined intrinsics block and it is required");

    @Override
    public final x0 j(y0 y0Var, List list, long j9) {
        int size = list.size();
        h00.y yVar = h00.y.A;
        if (size == 0) {
            return y0Var.o0(y3.a.j(j9), y3.a.i(j9), yVar, m1.C);
        }
        if (size == 1) {
            l1 l1VarO = ((v0) list.get(0)).O(j9);
            return y0Var.o0(y3.b.g(l1VarO.A, j9), y3.b.f(l1VarO.B, j9), yVar, new c3.m(l1VarO, 5));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size2; i10++) {
            l1 l1VarO2 = ((v0) list.get(i10)).O(j9);
            iMax = Math.max(l1VarO2.A, iMax);
            iMax2 = Math.max(l1VarO2.B, iMax2);
            arrayList.add(l1VarO2);
        }
        return y0Var.o0(y3.b.g(iMax, j9), y3.b.f(iMax2, j9), yVar, new c4.d(2, arrayList));
    }
}
