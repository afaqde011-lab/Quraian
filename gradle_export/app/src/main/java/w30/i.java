package w30;

import java.util.Iterator;
import java.util.Map;

public final class i extends h00.k implements u30.c {
    public final int A;
    public final c B;

    public i(c cVar, int i) {
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
                kotlin.jvm.internal.m.e(map, "map");
                Object obj2 = map.get(entry.getKey());
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && map.containsKey(entry.getKey());
            default:
                return this.B.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                k node = this.B.A;
                kotlin.jvm.internal.m.e(node, "node");
                s1.l[] lVarArr = new s1.l[8];
                for (int i = 0; i < 8; i++) {
                    lVarArr[i] = new l(0);
                }
                return new j(node, lVarArr);
            default:
                k node2 = this.B.A;
                kotlin.jvm.internal.m.e(node2, "node");
                s1.l[] lVarArr2 = new s1.l[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    lVarArr2[i2] = new l(1);
                }
                return new j(node2, lVarArr2);
        }
    }
}
