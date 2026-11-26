package x20;

import a10.w;
import h00.x;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.a0;
import m10.l0;

public abstract class h extends o {
    public static final w[] d = {a0.a.h(new kotlin.jvm.internal.s(h.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};
    public final m10.b b;
    public final d30.i c;

    public h(d30.l storageManager, m10.b bVar) {
        kotlin.jvm.internal.m.e(storageManager, "storageManager");
        this.b = bVar;
        this.c = new d30.i(storageManager, new eo.p(this, 21));
    }

    @Override
    public final Collection a(f kindFilter, u00.k kVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        if (!kindFilter.a(f.n.b)) {
            return x.A;
        }
        return (List) ze.d.A(this.c, d[0]);
    }

    @Override
    public final Collection d(n20.e name, r10.a aVar) {
        kotlin.jvm.internal.m.e(name, "name");
        List list = (List) ze.d.A(this.c, d[0]);
        if (list.isEmpty()) {
            return x.A;
        }
        n30.f fVar = new n30.f();
        for (Object obj : list) {
            if ((obj instanceof l0) && kotlin.jvm.internal.m.a(((l0) obj).getName(), name)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    @Override
    public final Collection e(n20.e name, r10.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        List list = (List) ze.d.A(this.c, d[0]);
        if (list.isEmpty()) {
            return x.A;
        }
        n30.f fVar = new n30.f();
        for (Object obj : list) {
            if ((obj instanceof j10.l0) && kotlin.jvm.internal.m.a(((j10.l0) obj).getName(), name)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    public abstract List h();
}
