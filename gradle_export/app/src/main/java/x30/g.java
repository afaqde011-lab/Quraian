package x30;

import h00.k;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.m;

public final class g extends k implements u30.c {
    public final int A;
    public final c B;

    public g(c cVar, int i) {
        this.A = i;
        this.B = cVar;
    }

    @Override
    public final int a() {
        switch (this.A) {
            case 0:
                break;
        }
        return this.B.e();
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                c map = this.B;
                m.e(map, "map");
                Object obj2 = map.get(entry.getKey());
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && map.containsKey(entry.getKey());
            default:
                return this.B.C.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return new h(this.B, 0);
            default:
                return new h(this.B, 1);
        }
    }
}
