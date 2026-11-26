package b20;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public final class d implements x20.n {
    public static final a10.w[] f = {kotlin.jvm.internal.a0.a.h(new kotlin.jvm.internal.s(d.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};
    public final oj.q b;
    public final p c;
    public final u d;
    public final d30.i e;

    public d(oj.q qVar, p10.y yVar, p pVar) {
        this.b = qVar;
        this.c = pVar;
        this.d = new u(qVar, yVar, pVar);
        d30.o oVar = ((a20.b) qVar.B).a;
        a30.l lVar = new a30.l(this, 4);
        d30.l lVar2 = (d30.l) oVar;
        lVar2.getClass();
        this.e = new d30.i(lVar2, lVar);
    }

    @Override
    public final Collection a(x20.f kindFilter, u00.k kVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        x20.n[] nVarArrH = h();
        Collection collectionA = this.d.a(kindFilter, kVar);
        for (x20.n nVar : nVarArrH) {
            collectionA = w50.c.r(collectionA, nVar.a(kindFilter, kVar));
        }
        return collectionA == null ? h00.z.A : collectionA;
    }

    @Override
    public final Set b() {
        x20.n[] nVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (x20.n nVar : nVarArrH) {
            h00.v.u0(nVar.b(), linkedHashSet);
        }
        linkedHashSet.addAll(this.d.b());
        return linkedHashSet;
    }

    @Override
    public final Set c() {
        HashSet hashSetM = f50.k.m(h00.n.j0(h()));
        if (hashSetM == null) {
            return null;
        }
        hashSetM.addAll(this.d.c());
        return hashSetM;
    }

    @Override
    public final Collection d(n20.e name, r10.a aVar) {
        kotlin.jvm.internal.m.e(name, "name");
        i(name, aVar);
        x20.n[] nVarArrH = h();
        Collection collectionD = this.d.d(name, aVar);
        for (x20.n nVar : nVarArrH) {
            collectionD = w50.c.r(collectionD, nVar.d(name, aVar));
        }
        return collectionD == null ? h00.z.A : collectionD;
    }

    @Override
    public final Collection e(n20.e name, r10.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        i(name, cVar);
        x20.n[] nVarArrH = h();
        this.d.getClass();
        Collection collectionR = h00.x.A;
        for (x20.n nVar : nVarArrH) {
            collectionR = w50.c.r(collectionR, nVar.e(name, cVar));
        }
        return collectionR == null ? h00.z.A : collectionR;
    }

    @Override
    public final Set f() {
        x20.n[] nVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (x20.n nVar : nVarArrH) {
            h00.v.u0(nVar.f(), linkedHashSet);
        }
        linkedHashSet.addAll(this.d.f());
        return linkedHashSet;
    }

    @Override
    public final j10.h g(n20.e name, r10.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        i(name, location);
        u uVar = this.d;
        uVar.getClass();
        j10.h hVar = null;
        j10.e eVarV = uVar.v(name, null);
        if (eVarV != null) {
            return eVarV;
        }
        for (x20.n nVar : h()) {
            j10.h hVarG = nVar.g(name, location);
            if (hVarG != null) {
                if (!(hVarG instanceof j10.i) || !((j10.x) hVarG).E()) {
                    return hVarG;
                }
                if (hVar == null) {
                    hVar = hVarG;
                }
            }
        }
        return hVar;
    }

    public final x20.n[] h() {
        return (x20.n[]) ze.d.A(this.e, f[0]);
    }

    public final void i(n20.e name, r10.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        kh.n.X(((a20.b) this.b.B).n, location, this.c, name);
    }

    public final String toString() {
        return "scope for " + this.c;
    }
}
