package k00;

import java.io.Serializable;
import kotlin.jvm.internal.m;
import u00.n;

public final class b implements i, Serializable {
    public final i A;
    public final g B;

    public b(g element, i left) {
        m.e(left, "left");
        m.e(element, "element");
        this.A = left;
        this.B = element;
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int i = 2;
            b bVar2 = bVar;
            int i2 = 2;
            while (true) {
                i iVar = bVar2.A;
                bVar2 = iVar instanceof b ? (b) iVar : null;
                if (bVar2 == null) {
                    break;
                }
                i2++;
            }
            b bVar3 = this;
            while (true) {
                i iVar2 = bVar3.A;
                bVar3 = iVar2 instanceof b ? (b) iVar2 : null;
                if (bVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    g gVar = this.B;
                    if (!m.a(bVar.get(gVar.getKey()), gVar)) {
                        zA = false;
                        break;
                    }
                    i iVar3 = this.A;
                    if (!(iVar3 instanceof b)) {
                        m.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        g gVar2 = (g) iVar3;
                        zA = m.a(bVar.get(gVar2.getKey()), gVar2);
                        break;
                    }
                    this = (b) iVar3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final Object fold(Object obj, n nVar) {
        return nVar.invoke(this.A.fold(obj, nVar), this.B);
    }

    @Override
    public final g get(h key) {
        m.e(key, "key");
        while (true) {
            g gVar = this.B.get(key);
            if (gVar != null) {
                return gVar;
            }
            i iVar = this.A;
            if (!(iVar instanceof b)) {
                return iVar.get(key);
            }
            this = (b) iVar;
        }
    }

    public final int hashCode() {
        return this.B.hashCode() + this.A.hashCode();
    }

    @Override
    public final i minusKey(h key) {
        m.e(key, "key");
        g gVar = this.B;
        g gVar2 = gVar.get(key);
        i iVar = this.A;
        if (gVar2 != null) {
            return iVar;
        }
        i iVarMinusKey = iVar.minusKey(key);
        if (iVarMinusKey == iVar) {
            return this;
        }
        return iVarMinusKey == j.A ? gVar : new b(gVar, iVarMinusKey);
    }

    @Override
    public final i plus(i context) {
        m.e(context, "context");
        return context == j.A ? this : (i) context.fold(this, new jk.c(7));
    }

    public final String toString() {
        return g4.c.k(new StringBuilder("["), (String) fold("", new jk.c(6)), ']');
    }
}
