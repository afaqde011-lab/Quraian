package m10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class m0 extends x20.o {
    public final j10.z b;
    public final n20.c c;

    public m0(j10.z moduleDescriptor, n20.c fqName) {
        kotlin.jvm.internal.m.e(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.m.e(fqName, "fqName");
        this.b = moduleDescriptor;
        this.c = fqName;
    }

    @Override
    public final Collection a(x20.f kindFilter, u00.k kVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        if (kindFilter.a(x20.f.h)) {
            n20.c cVar = this.c;
            if (!cVar.a.c() || !kindFilter.a.contains(x20.c.a)) {
                j10.z zVar = this.b;
                Collection collectionH = zVar.h(cVar, kVar);
                ArrayList arrayList = new ArrayList(collectionH.size());
                Iterator it = collectionH.iterator();
                while (it.hasNext()) {
                    n20.e eVarG = ((n20.c) it.next()).a.g();
                    if (((Boolean) kVar.invoke(eVarG)).booleanValue()) {
                        w wVar = null;
                        if (!eVarG.B) {
                            w wVar2 = (w) zVar.f0(cVar.a(eVarG));
                            if (!((Boolean) ze.d.A(wVar2.G, w.I[1])).booleanValue()) {
                                wVar = wVar2;
                            }
                        }
                        n30.l.a(arrayList, wVar);
                    }
                }
                return arrayList;
            }
        }
        return h00.x.A;
    }

    @Override
    public final Set c() {
        return h00.z.A;
    }

    public final String toString() {
        return "subpackages of " + this.c + " from " + this.b;
    }
}
