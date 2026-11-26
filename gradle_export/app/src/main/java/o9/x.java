package o9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class x extends b0 {

    public final ArrayList f11891w;

    public final u.e f11892x;

    public x(a0 a0Var, String str, String str2) {
        super(a0Var, str, str2, false);
        this.f11891w = new ArrayList();
        this.f11892x = new u.e(0);
    }

    public final boolean n() {
        c0.b();
        return c0.c().e().contains(this);
    }

    public final boolean o(b0 b0Var) {
        o oVar = (o) this.f11892x.get(b0Var.f11739c);
        return oVar != null && oVar.f11840d;
    }

    public final void p(Collection collection) {
        b0 b0Var;
        this.f11756v.clear();
        ArrayList arrayList = this.f11891w;
        arrayList.clear();
        u.e eVar = this.f11892x;
        eVar.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            String strD = oVar.f11837a.d();
            Iterator it2 = this.f11737a.f11730b.iterator();
            do {
                if (!it2.hasNext()) {
                    b0Var = null;
                    break;
                }
                b0Var = (b0) it2.next();
            } while (!b0Var.f11738b.equals(strD));
            if (b0Var != null) {
                arrayList.add(b0Var);
                eVar.put(b0Var.f11739c, oVar);
                int i10 = oVar.f11838b;
                if (i10 == 2 || i10 == 3) {
                    this.f11756v.add(b0Var);
                }
            }
        }
        c0.c().f11778a.b(259, this);
    }
}
