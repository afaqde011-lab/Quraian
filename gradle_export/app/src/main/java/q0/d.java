package q0;

import java.util.ArrayList;
import java.util.List;

public final class d implements z2.w0 {

    public static final d f12579b = new d(0);

    public static final d f12580c = new d(1);

    public static final xn.a f12581d = new xn.a(29);

    public final int f12582a;

    public d(int i10) {
        this.f12582a = i10;
    }

    @Override
    public final z2.x0 j(z2.y0 y0Var, List list, long j9) {
        switch (this.f12582a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(((z2.v0) list.get(i10)).O(j9));
                }
                return y0Var.o0(y3.a.h(j9), y3.a.g(j9), h00.y.A, new e1.k0(2, arrayList));
            default:
                return y0Var.o0(y3.a.h(j9), y3.a.g(j9), h00.y.A, f12581d);
        }
    }
}
