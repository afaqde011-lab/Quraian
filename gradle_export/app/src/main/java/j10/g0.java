package j10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class g0 implements h0 {
    public final ArrayList a;

    public g0(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override
    public final boolean a(n20.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.m.a(((m10.c0) ((e0) it.next())).F, fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void b(n20.c fqName, ArrayList arrayList) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        for (Object obj : this.a) {
            if (kotlin.jvm.internal.m.a(((m10.c0) ((e0) obj)).F, fqName)) {
                arrayList.add(obj);
            }
        }
    }

    @Override
    public final Collection h(n20.c fqName, u00.k kVar) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        return q30.l.u0(new q30.f(q30.l.r0(h00.q.D0(this.a), r.C), true, new f0(fqName, 0)));
    }
}
