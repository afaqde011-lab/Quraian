package k10;

import h00.q;
import h00.w;
import j10.f0;
import java.util.Iterator;
import java.util.List;
import q30.o;
import ri.t1;

public final class i implements h {
    public final int A;
    public final Object B;

    public i(int i, List list) {
        this.A = i;
        this.B = list;
    }

    public i(n20.c fqNameToMatch) {
        this.A = 2;
        kotlin.jvm.internal.m.e(fqNameToMatch, "fqNameToMatch");
        this.B = fqNameToMatch;
    }

    public i(h[] hVarArr) {
        this.A = 1;
        this.B = h00.n.V0(hVarArr);
    }

    @Override
    public final boolean d(n20.c fqName) {
        switch (this.A) {
            case 0:
                return t1.B(this, fqName);
            case 1:
                kotlin.jvm.internal.m.e(fqName, "fqName");
                Iterator it = ((Iterable) q.D0((List) this.B).b).iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).d(fqName)) {
                        return true;
                    }
                }
                return false;
            default:
                return t1.B(this, fqName);
        }
    }

    @Override
    public final b f(n20.c fqName) {
        switch (this.A) {
            case 0:
                return t1.y(this, fqName);
            case 1:
                kotlin.jvm.internal.m.e(fqName, "fqName");
                q30.e eVar = new q30.e(q30.l.s0(q.D0((List) this.B), new f0(fqName, 1)));
                return (b) (!eVar.hasNext() ? null : eVar.next());
            default:
                kotlin.jvm.internal.m.e(fqName, "fqName");
                if (fqName.equals((n20.c) this.B)) {
                    return f20.c.a;
                }
                return null;
        }
    }

    @Override
    public final boolean isEmpty() {
        switch (this.A) {
            case 0:
                return ((List) this.B).isEmpty();
            case 1:
                List list = (List) this.B;
                if (list != null && list.isEmpty()) {
                    return true;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((h) it.next()).isEmpty()) {
                        return false;
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return ((List) this.B).iterator();
            case 1:
                return new q30.e(new q30.g(q.D0((List) this.B), k.A, o.A));
            default:
                return w.A;
        }
    }

    public String toString() {
        switch (this.A) {
            case 0:
                return ((List) this.B).toString();
            default:
                return super.toString();
        }
    }
}
