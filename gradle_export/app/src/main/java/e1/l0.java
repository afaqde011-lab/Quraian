package e1;

import java.util.ArrayList;
import java.util.List;
import z2.l1;

public final class l0 implements z2.w0 {

    public static final l0 f4971a = new l0();

    @Override
    public final z2.x0 j(z2.y0 y0Var, List list, long j9) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            l1 l1VarO = ((z2.v0) list.get(i10)).O(j9);
            iMax = Math.max(iMax, l1VarO.A);
            iMax2 = Math.max(iMax2, l1VarO.B);
            arrayList.add(l1VarO);
        }
        return y0Var.o0(iMax, iMax2, h00.y.A, new k0(0, arrayList));
    }
}
