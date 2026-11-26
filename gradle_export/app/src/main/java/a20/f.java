package a20;

import b20.p;
import d30.l;
import h00.x;
import j10.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m;
import oj.q;
import p10.y;
import u00.k;

public final class f implements h0 {
    public final q a;
    public final d30.e b;

    public f(b bVar) {
        this.a = new q(bVar, c.B, new g00.f());
        l lVar = (l) bVar.a;
        lVar.getClass();
        this.b = new d30.e(lVar, new ConcurrentHashMap(3, 1.0f, 2), new d30.f(), 0);
    }

    @Override
    public final boolean a(n20.c fqName) {
        m.e(fqName, "fqName");
        ((b) this.a.B).b.getClass();
        return false;
    }

    @Override
    public final void b(n20.c fqName, ArrayList arrayList) {
        m.e(fqName, "fqName");
        arrayList.add(c(fqName));
    }

    public final p c(n20.c fqName) {
        ((b) this.a.B).b.getClass();
        m.e(fqName, "fqName");
        a aVar = new a(this, new y(fqName), 2);
        d30.e eVar = this.b;
        eVar.getClass();
        Object objInvoke = eVar.invoke(new d30.g(fqName, aVar));
        if (objInvoke != null) {
            return (p) objInvoke;
        }
        d30.e.a(3);
        throw null;
    }

    @Override
    public final Collection h(n20.c fqName, k kVar) {
        m.e(fqName, "fqName");
        List list = (List) c(fqName).L.invoke();
        return list == null ? x.A : list;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((b) this.a.B).o;
    }
}
