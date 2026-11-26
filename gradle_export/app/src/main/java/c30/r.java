package c30;

import h00.z;
import i20.a1;
import i20.f0;
import i20.h1;
import j10.e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ta.c0;

public final class r extends q {
    public final e0 g;
    public final f0 h;
    public final String i;
    public final n20.c j;

    public r(e0 e0Var, f0 proto, k20.g nameResolver, k20.a metadataVersion, g20.g gVar, a30.i components, String debugName, u00.a aVar) {
        kotlin.jvm.internal.m.e(proto, "proto");
        kotlin.jvm.internal.m.e(nameResolver, "nameResolver");
        kotlin.jvm.internal.m.e(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.m.e(components, "components");
        kotlin.jvm.internal.m.e(debugName, "debugName");
        a1 a1Var = proto.G;
        kotlin.jvm.internal.m.d(a1Var, "getTypeTable(...)");
        h9.f fVar = new h9.f(a1Var);
        k20.j jVar = k20.j.b;
        h1 h1Var = proto.H;
        kotlin.jvm.internal.m.d(h1Var, "getVersionRequirementTable(...)");
        a30.k kVarA = components.a(e0Var, nameResolver, fVar, c0.D(h1Var), metadataVersion, gVar);
        List list = proto.D;
        kotlin.jvm.internal.m.d(list, "getFunctionList(...)");
        List list2 = proto.E;
        kotlin.jvm.internal.m.d(list2, "getPropertyList(...)");
        List list3 = proto.F;
        kotlin.jvm.internal.m.d(list3, "getTypeAliasList(...)");
        super(kVarA, list, list2, list3, aVar);
        this.g = e0Var;
        this.h = proto;
        this.i = debugName;
        this.j = ((m10.c0) e0Var).F;
    }

    @Override
    public final Collection a(x20.f kindFilter, u00.k kVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        r10.c cVar = r10.c.A;
        List listI = i(kindFilter, kVar);
        Iterable iterable = ((a30.i) this.b.a).k;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            h00.v.u0(((l10.c) it.next()).b(this.j), arrayList);
        }
        return h00.q.Y0(arrayList, listI);
    }

    @Override
    public final j10.h g(n20.e name, r10.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        kh.n.X(((a30.i) this.b.a).i, location, this.g, name);
        return super.g(name, location);
    }

    @Override
    public final void h(ArrayList arrayList, u00.k kVar) {
    }

    @Override
    public final n20.b l(n20.e name) {
        kotlin.jvm.internal.m.e(name, "name");
        return new n20.b(this.j, name);
    }

    @Override
    public final Set n() {
        return z.A;
    }

    @Override
    public final Set o() {
        return z.A;
    }

    @Override
    public final Set p() {
        return z.A;
    }

    @Override
    public final boolean q(n20.e name) {
        kotlin.jvm.internal.m.e(name, "name");
        if (super.q(name)) {
            return true;
        }
        Iterable iterable = ((a30.i) this.b.a).k;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((l10.c) it.next()).a(this.j, name)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.i;
    }
}
