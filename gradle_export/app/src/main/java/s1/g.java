package s1;

import java.util.Iterator;
import java.util.Map;

public final class g extends h00.j {
    public final int A;
    public final e B;

    public g(int i10, e eVar) {
        this.A = i10;
        this.B = eVar;
    }

    public final int a() {
        switch (this.A) {
            case 0:
                break;
        }
        return this.B.e();
    }

    public final boolean add(Object obj) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        switch (this.A) {
            case 0:
                this.B.clear();
                break;
            default:
                this.B.clear();
                break;
        }
    }

    public final boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                e eVar = this.B;
                Object obj2 = eVar.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && eVar.containsKey(entry.getKey());
            default:
                return this.B.containsKey(obj);
        }
    }

    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return new n30.g(this.B);
            default:
                l[] lVarArr = new l[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    lVarArr[i10] = new m(1);
                }
                return new h(this.B, lVarArr);
        }
    }

    public final boolean remove(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.B.remove(entry.getKey(), entry.getValue());
            default:
                e eVar = this.B;
                if (!eVar.containsKey(obj)) {
                    return false;
                }
                eVar.remove(obj);
                return true;
        }
    }
}
