package s1;

import java.util.Iterator;
import java.util.Map;

public final class i extends h00.k implements q1.b {
    public final int A;
    public final c B;

    public i(c cVar, int i10) {
        this.A = i10;
        this.B = cVar;
    }

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
                Object key = entry.getKey();
                c cVar = this.B;
                Object obj2 = cVar.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.B.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                k kVar = this.B.A;
                l[] lVarArr = new l[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    lVarArr[i10] = new m(0);
                }
                return new j(kVar, lVarArr);
            default:
                k kVar2 = this.B.A;
                l[] lVarArr2 = new l[8];
                for (int i11 = 0; i11 < 8; i11++) {
                    lVarArr2[i11] = new m(1);
                }
                return new j(kVar2, lVarArr2);
        }
    }
}
