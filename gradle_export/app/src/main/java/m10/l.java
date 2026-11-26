package m10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class l implements j10.h0 {
    public final List a;
    public final String b;

    public l(List list, String debugName) {
        kotlin.jvm.internal.m.e(debugName, "debugName");
        this.a = list;
        this.b = debugName;
        list.size();
        h00.q.r1(list).size();
    }

    @Override
    public final boolean a(n20.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        List list = this.a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!j10.w.h((j10.h0) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void b(n20.c fqName, ArrayList arrayList) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            j10.w.b((j10.h0) it.next(), fqName, arrayList);
        }
    }

    @Override
    public final Collection h(n20.c fqName, u00.k kVar) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        HashSet hashSet = new HashSet();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((j10.h0) it.next()).h(fqName, kVar));
        }
        return hashSet;
    }

    public final String toString() {
        return this.b;
    }
}
