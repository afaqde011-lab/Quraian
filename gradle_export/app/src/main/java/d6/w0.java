package d6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class w0 extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final Set C;

    public w0(Set set, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = set;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                w0 w0Var = new w0(this.C, cVar, 0);
                w0Var.B = obj;
                return w0Var;
            default:
                w0 w0Var2 = new w0(this.C, cVar, 1);
                w0Var2.B = obj;
                return w0Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        t5.b bVar = (t5.b) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return create(bVar, cVar).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i10 = this.A;
        Set set = this.C;
        switch (i10) {
            case 0:
                l00.a aVar = l00.a.A;
                ri.t1.O(obj);
                t5.b bVar = (t5.b) this.B;
                Set set2 = (Set) bVar.c(a1.f4617g);
                if (set2 == null) {
                    return bVar;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : set2) {
                    if (!set.contains((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return bVar;
                }
                t5.b bVarG = bVar.g();
                bVarG.e(a1.f4617g, h00.j0.p0(set2, arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bVarG.d(t0.a(a1.f4614d, (String) it.next()));
                }
                return bVarG.h();
            default:
                l00.a aVar2 = l00.a.A;
                ri.t1.O(obj);
                Set setKeySet = ((t5.b) this.B).a().keySet();
                ArrayList arrayList2 = new ArrayList(h00.r.q0(setKeySet, 10));
                Iterator it2 = setKeySet.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((t5.d) it2.next()).f14357a);
                }
                boolean z10 = true;
                if (set != s5.i.f13636a) {
                    Set set3 = set;
                    if ((set3 instanceof Collection) && set3.isEmpty()) {
                        z10 = false;
                    } else {
                        Iterator it3 = set3.iterator();
                        while (it3.hasNext()) {
                            if (!arrayList2.contains((String) it3.next())) {
                            }
                        }
                        z10 = false;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }
}
