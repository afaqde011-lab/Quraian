package h10;

import h00.q;
import j10.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m10.a0;
import m10.w;
import r30.r;

public final class a implements l10.c {
    public final d30.l a;
    public final z b;

    public a(d30.l lVar, a0 module) {
        kotlin.jvm.internal.m.e(module, "module");
        this.a = lVar;
        this.b = module;
    }

    @Override
    public final boolean a(n20.c packageFqName, n20.e name) {
        kotlin.jvm.internal.m.e(packageFqName, "packageFqName");
        kotlin.jvm.internal.m.e(name, "name");
        String strB = name.b();
        kotlin.jvm.internal.m.d(strB, "asString(...)");
        return (r.x0(strB, "Function", false) || r.x0(strB, "KFunction", false) || r.x0(strB, "SuspendFunction", false) || r.x0(strB, "KSuspendFunction", false)) && m.c.a(strB, packageFqName) != null;
    }

    @Override
    public final Collection b(n20.c packageFqName) {
        kotlin.jvm.internal.m.e(packageFqName, "packageFqName");
        return h00.z.A;
    }

    @Override
    public final j10.e c(n20.b classId) {
        n20.c cVar;
        l lVarA;
        kotlin.jvm.internal.m.e(classId, "classId");
        if (classId.c || classId.g()) {
            return null;
        }
        String str = classId.b.a.a;
        if (!r30.k.A0(str, "Function", false) || (lVarA = m.c.a(str, (cVar = classId.a))) == null) {
            return null;
        }
        k kVar = lVarA.a;
        int i = lVarA.b;
        List list = (List) ze.d.A(((w) this.b.f0(cVar)).F, w.I[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof b30.c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (q.N0(arrayList2) == null) {
            return new c(this.a, (b30.c) q.L0(arrayList), kVar, i);
        }
        throw new ClassCastException();
    }
}
