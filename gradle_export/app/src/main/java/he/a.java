package he;

import android.util.SparseArray;
import g4.c;
import java.util.HashMap;
import ud.d;

public abstract class a {

    public static final SparseArray f7042a = new SparseArray();

    public static final HashMap f7043b;

    static {
        HashMap map = new HashMap();
        f7043b = map;
        map.put(d.A, 0);
        map.put(d.B, 1);
        map.put(d.C, 2);
        for (d dVar : map.keySet()) {
            f7042a.append(((Integer) f7043b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f7043b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) f7042a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(c.f(i10, "Unknown Priority for value "));
    }
}
