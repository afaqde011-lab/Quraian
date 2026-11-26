package a30;

import a1.u0;
import j10.h0;
import java.util.List;
import java.util.Set;

public final class i {
    public final d30.l a;
    public final j10.z b;
    public final j c;
    public final e d;
    public final a e;
    public final h0 f;
    public final j g;
    public final n h;
    public final r10.b i;
    public final o j;
    public final Iterable k;
    public final oj.q l;
    public final j m;
    public final l10.b n;
    public final l10.d o;
    public final o20.h p;
    public final f30.k q;
    public final List r;
    public final m s;
    public final g t;

    public i(d30.l lVar, j10.z moduleDescriptor, e eVar, a aVar, h0 h0Var, n nVar, o oVar, Iterable iterable, oj.q qVar, l10.b bVar, l10.d dVar, o20.h extensionRegistryLite, f30.k kotlinTypeChecker, tf.w wVar, List list, m enumEntriesDeserializationSupport) {
        j jVar = j.c;
        j jVar2 = j.g;
        kotlin.jvm.internal.m.e(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.m.e(extensionRegistryLite, "extensionRegistryLite");
        kotlin.jvm.internal.m.e(kotlinTypeChecker, "kotlinTypeChecker");
        kotlin.jvm.internal.m.e(enumEntriesDeserializationSupport, "enumEntriesDeserializationSupport");
        this.a = lVar;
        this.b = moduleDescriptor;
        this.c = jVar;
        this.d = eVar;
        this.e = aVar;
        this.f = h0Var;
        this.g = jVar2;
        this.h = nVar;
        this.i = r10.b.a;
        this.j = oVar;
        this.k = iterable;
        this.l = qVar;
        this.m = h.a;
        this.n = bVar;
        this.o = dVar;
        this.p = extensionRegistryLite;
        this.q = kotlinTypeChecker;
        this.r = list;
        this.s = enumEntriesDeserializationSupport;
        this.t = new g(this);
    }

    public i(d30.l lVar, j10.z zVar, qj.c cVar, u0 u0Var, h0 h0Var, Iterable iterable, oj.q qVar, l10.b bVar, l10.d dVar, o20.h hVar, f30.k kVar, tf.w wVar, int i) {
        f30.k kVar2;
        j jVar = j.e;
        j jVar2 = j.f;
        if ((i & 65536) != 0) {
            f30.k.b.getClass();
            kVar2 = f30.j.b;
        } else {
            kVar2 = kVar;
        }
        this(lVar, zVar, cVar, u0Var, h0Var, n.a, jVar, iterable, qVar, bVar, dVar, hVar, kVar2, wVar, va.a.R(e30.k.a), (i & 524288) != 0 ? j.d : jVar2);
    }

    public final k a(j10.e0 e0Var, k20.g nameResolver, h9.f fVar, k20.j jVar, k20.a metadataVersion, c30.k kVar) {
        kotlin.jvm.internal.m.e(nameResolver, "nameResolver");
        kotlin.jvm.internal.m.e(metadataVersion, "metadataVersion");
        return new k(this, nameResolver, e0Var, fVar, jVar, metadataVersion, kVar, null, h00.x.A);
    }

    public final j10.e b(n20.b classId) {
        kotlin.jvm.internal.m.e(classId, "classId");
        Set set = g.c;
        return this.t.a(classId, null);
    }
}
