package c30;

import j10.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;

public abstract class q extends x20.o {
    public static final a10.w[] f;
    public final a30.k b;
    public final p c;
    public final d30.i d;
    public final d30.h e;

    static {
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s(q.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0);
        b0 b0Var = a0.a;
        f = new a10.w[]{b0Var.h(sVar), a1.b.h(q.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0, b0Var)};
    }

    public q(a30.k c, List functionList, List propertyList, List typeAliasList, u00.a aVar) {
        kotlin.jvm.internal.m.e(c, "c");
        kotlin.jvm.internal.m.e(functionList, "functionList");
        kotlin.jvm.internal.m.e(propertyList, "propertyList");
        kotlin.jvm.internal.m.e(typeAliasList, "typeAliasList");
        this.b = c;
        a30.i iVar = (a30.i) c.a;
        iVar.c.getClass();
        this.c = new p(this, functionList, propertyList, typeAliasList);
        d30.l lVar = iVar.a;
        m mVar = new m(0, aVar);
        lVar.getClass();
        this.d = new d30.i(lVar, mVar);
        a30.l lVar2 = new a30.l(this, 6);
        lVar.getClass();
        this.e = new d30.h(lVar, lVar2);
    }

    @Override
    public final Set b() {
        return (Set) ze.d.A(this.c.g, p.j[0]);
    }

    @Override
    public final Set c() {
        a10.w p = f[1];
        d30.h hVar = this.e;
        kotlin.jvm.internal.m.e(hVar, "<this>");
        kotlin.jvm.internal.m.e(p, "p");
        return (Set) hVar.invoke();
    }

    @Override
    public Collection d(n20.e name, r10.a aVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return this.c.a(name, aVar);
    }

    @Override
    public Collection e(n20.e name, r10.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return this.c.b(name, cVar);
    }

    @Override
    public final Set f() {
        return (Set) ze.d.A(this.c.h, p.j[1]);
    }

    @Override
    public j10.h g(n20.e name, r10.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        if (q(name)) {
            return ((a30.i) this.b.a).b(l(name));
        }
        p pVar = this.c;
        if (!pVar.c.keySet().contains(name)) {
            return null;
        }
        pVar.getClass();
        return (q0) pVar.f.invoke(name);
    }

    public abstract void h(ArrayList arrayList, u00.k kVar);

    public final List i(x20.f kindFilter, u00.k kVar) {
        r10.c cVar = r10.c.D;
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        ArrayList arrayList = new ArrayList(0);
        if (kindFilter.a(x20.f.f)) {
            h(arrayList, kVar);
        }
        p pVar = this.c;
        pVar.getClass();
        boolean zA = kindFilter.a(x20.f.j);
        q20.g gVar = q20.g.B;
        if (zA) {
            Set<n20.e> set = (Set) ze.d.A(pVar.h, p.j[1]);
            ArrayList arrayList2 = new ArrayList();
            for (n20.e eVar : set) {
                if (((Boolean) kVar.invoke(eVar)).booleanValue()) {
                    arrayList2.addAll(pVar.b(eVar, cVar));
                }
            }
            h00.u.t0(arrayList2, gVar);
            arrayList.addAll(arrayList2);
        }
        if (kindFilter.a(x20.f.i)) {
            Set<n20.e> set2 = (Set) ze.d.A(pVar.g, p.j[0]);
            ArrayList arrayList3 = new ArrayList();
            for (n20.e eVar2 : set2) {
                if (((Boolean) kVar.invoke(eVar2)).booleanValue()) {
                    arrayList3.addAll(pVar.a(eVar2, cVar));
                }
            }
            h00.u.t0(arrayList3, gVar);
            arrayList.addAll(arrayList3);
        }
        if (kindFilter.a(x20.f.l)) {
            for (n20.e eVar3 : m()) {
                if (((Boolean) kVar.invoke(eVar3)).booleanValue()) {
                    n30.l.a(arrayList, ((a30.i) this.b.a).b(l(eVar3)));
                }
            }
        }
        if (kindFilter.a(x20.f.g)) {
            for (Object name : pVar.c.keySet()) {
                if (((Boolean) kVar.invoke(name)).booleanValue()) {
                    pVar.getClass();
                    kotlin.jvm.internal.m.e(name, "name");
                    n30.l.a(arrayList, (q0) pVar.f.invoke(name));
                }
            }
        }
        return n30.l.d(arrayList);
    }

    public void j(ArrayList arrayList, n20.e name) {
        kotlin.jvm.internal.m.e(name, "name");
    }

    public void k(ArrayList arrayList, n20.e name) {
        kotlin.jvm.internal.m.e(name, "name");
    }

    public abstract n20.b l(n20.e eVar);

    public final Set m() {
        return (Set) ze.d.A(this.d, f[0]);
    }

    public abstract Set n();

    public abstract Set o();

    public abstract Set p();

    public boolean q(n20.e name) {
        kotlin.jvm.internal.m.e(name, "name");
        return m().contains(name);
    }

    public boolean r(t tVar) {
        return true;
    }
}
