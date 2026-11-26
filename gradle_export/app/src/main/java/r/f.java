package r;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class f implements Iterable {
    public c A;
    public c B;
    public final WeakHashMap C = new WeakHashMap();
    public int D = 0;

    public c a(Object obj) {
        c cVar = this.A;
        while (cVar != null && !cVar.A.equals(obj)) {
            cVar = cVar.C;
        }
        return cVar;
    }

    public Object b(Object obj) {
        c cVarA = a(obj);
        if (cVarA == null) {
            return null;
        }
        this.D--;
        WeakHashMap weakHashMap = this.C;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(cVarA);
            }
        }
        c cVar = cVarA.D;
        if (cVar != null) {
            cVar.C = cVarA.C;
        } else {
            this.A = cVarA.C;
        }
        c cVar2 = cVarA.C;
        if (cVar2 != null) {
            cVar2.D = cVar;
        } else {
            this.B = cVar;
        }
        cVarA.C = null;
        cVarA.D = null;
        return cVarA.B;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.D != fVar.D) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (bVar.hasNext() || ((b) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override
    public final Iterator iterator() {
        b bVar = new b(this.A, this.B, 0);
        this.C.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb2.append(", ");
            }
        }
    }
}
