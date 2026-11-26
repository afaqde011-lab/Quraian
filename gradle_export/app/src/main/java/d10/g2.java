package d10;

import java.util.List;
import java.util.Map;

public final class g2 {
    public static final g2 d = new g2(h00.x.A, h00.y.A, null);
    public final Object a;
    public final Object b;
    public final g2 c;

    public g2(List list, Map map, g2 g2Var) {
        this.a = list;
        this.b = map;
        this.c = g2Var;
    }

    public final r1 a(int i) {
        r1 r1Var = (r1) this.b.get(Integer.valueOf(i));
        if (r1Var != null) {
            return r1Var;
        }
        g2 g2Var = this.c;
        if (g2Var != null) {
            return g2Var.a(i);
        }
        return null;
    }
}
