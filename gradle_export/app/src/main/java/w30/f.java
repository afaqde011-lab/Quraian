package w30;

import java.util.Iterator;
import java.util.Map;

public final class f extends h00.j {
    public final int A;
    public final h00.i B;

    public f(h00.i iVar, int i) {
        this.A = i;
        this.B = iVar;
    }

    @Override
    public final int a() {
        switch (this.A) {
            case 0:
                return ((d) this.B).e();
            default:
                return ((x30.d) this.B).e();
        }
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.A) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                kotlin.jvm.internal.m.e(element, "element");
                throw new UnsupportedOperationException();
            default:
                Map.Entry element2 = (Map.Entry) obj;
                kotlin.jvm.internal.m.e(element2, "element");
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final void clear() {
        switch (this.A) {
            case 0:
                ((d) this.B).clear();
                break;
            default:
                ((x30.d) this.B).clear();
                break;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry element = (Map.Entry) obj;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(element, "element");
                d map = (d) this.B;
                kotlin.jvm.internal.m.e(map, "map");
                V v = map.get(element.getKey());
                if (v != 0) {
                    return v.equals(element.getValue());
                }
                if (element.getValue() == null && map.containsKey(element.getKey())) {
                    return true;
                }
                return false;
            default:
                kotlin.jvm.internal.m.e(element, "element");
                x30.d map2 = (x30.d) this.B;
                kotlin.jvm.internal.m.e(map2, "map");
                V v2 = map2.get(element.getKey());
                if (v2 != 0) {
                    return v2.equals(element.getValue());
                }
                if (element.getValue() == null && map2.containsKey(element.getKey())) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return new n30.g((d) this.B);
            default:
                return new x30.e((x30.d) this.B, 0);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry element = (Map.Entry) obj;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(element, "element");
                return ((d) this.B).remove(element.getKey(), element.getValue());
            default:
                kotlin.jvm.internal.m.e(element, "element");
                return ((x30.d) this.B).remove(element.getKey(), element.getValue());
        }
    }
}
