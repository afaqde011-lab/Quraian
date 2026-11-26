package k10;

import e30.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class l implements h {
    public final h A;
    public final u B;

    public l(h hVar, u uVar) {
        this.A = hVar;
        this.B = uVar;
    }

    @Override
    public final boolean d(n20.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        if (((Boolean) this.B.invoke(fqName)).booleanValue()) {
            return this.A.d(fqName);
        }
        return false;
    }

    @Override
    public final b f(n20.c fqName) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        if (((Boolean) this.B.invoke(fqName)).booleanValue()) {
            return this.A.f(fqName);
        }
        return null;
    }

    @Override
    public final boolean isEmpty() {
        h hVar = this.A;
        if ((hVar instanceof Collection) && ((Collection) hVar).isEmpty()) {
            return false;
        }
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            n20.c cVarA = ((b) it.next()).a();
            if (cVarA != null && ((Boolean) this.B.invoke(cVarA)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.A) {
            n20.c cVarA = ((b) obj).a();
            if (cVarA != null && ((Boolean) this.B.invoke(cVarA)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }
}
