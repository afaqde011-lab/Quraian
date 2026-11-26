package cy;

import h00.d0;
import h00.r;
import h00.x;
import java.util.LinkedHashMap;
import java.util.List;

public final class i {
    public static final i g;
    public final Object a;
    public final Object b;
    public final Object c;
    public final LinkedHashMap d;
    public final boolean e;
    public final int f;

    static {
        x xVar = x.A;
        g = new i(xVar, xVar, xVar);
    }

    public i(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        int iP = d0.P(r.q0(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP < 16 ? 16 : iP);
        for (Object obj : list2) {
            linkedHashMap.put(Integer.valueOf(((l) obj).b.a), obj);
        }
        this.d = linkedHashMap;
        this.e = this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty();
        this.f = this.c.size() + this.b.size() + this.a.size();
    }
}
