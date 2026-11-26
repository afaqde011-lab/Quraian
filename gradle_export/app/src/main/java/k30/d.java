package k30;

import e30.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class d implements Iterable, v00.a {
    public a A;

    public static String a(a aVar, int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Race condition happened, the size of ArrayMap is " + i + " but it isn't an `" + str + '`');
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("Type: ");
        sb2.append(aVar.getClass());
        sb.append(sb2.toString());
        sb.append('\n');
        StringBuilder sb3 = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) h0.B.B;
        sb3.append("[\n");
        ArrayList arrayList = new ArrayList(h00.r.q0(aVar, 10));
        int i2 = 0;
        for (Object obj : aVar) {
            int i3 = i2 + 1;
            Object obj2 = null;
            if (i2 < 0) {
                va.a.k0();
                throw null;
            }
            for (Object obj3 : concurrentHashMap.entrySet()) {
                if (((Number) ((Map.Entry) obj3).getValue()).intValue() == i2) {
                    obj2 = obj3;
                    break;
                }
            }
            sb3.append("  " + ((Map.Entry) obj2) + '[' + i2 + "]: " + obj);
            sb3.append('\n');
            arrayList.add(sb3);
            i2 = i3;
        }
        sb.append("Content: " + g4.c.k(sb3, "]", '\n'));
        sb.append('\n');
        return sb.toString();
    }

    public final boolean isEmpty() {
        return this.A.a() == 0;
    }

    @Override
    public final Iterator iterator() {
        return this.A.iterator();
    }
}
