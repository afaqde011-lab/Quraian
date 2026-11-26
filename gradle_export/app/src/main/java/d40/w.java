package d40;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ri.t1;

public final class w implements j {
    public final int A = 0;
    public final kotlin.jvm.internal.z B;
    public final j C;

    public w(j jVar, kotlin.jvm.internal.z zVar) {
        this.C = jVar;
        this.B = zVar;
    }

    public w(kotlin.jvm.internal.z zVar, j jVar) {
        this.B = zVar;
        this.C = jVar;
    }

    public Object b(List list, k00.c cVar) {
        vn.k kVar;
        Iterator it;
        j jVar;
        int i;
        ho.e eVar;
        Object next;
        if (cVar instanceof vn.k) {
            kVar = (vn.k) cVar;
            int i2 = kVar.F;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.F = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new vn.k(this, cVar);
            }
        } else {
            kVar = new vn.k(this, cVar);
        }
        Object obj = kVar.D;
        l00.a aVar = l00.a.A;
        int i3 = kVar.F;
        if (i3 == 0) {
            t1.O(obj);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                za.h0 h0Var = (za.h0) obj2;
                if (h0Var.b == za.g0.D && !h0Var.c.contains("audio_story_silent")) {
                    arrayList.add(obj2);
                }
            }
            kotlin.jvm.internal.z zVar = this.B;
            Set set = (Set) zVar.A;
            ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((za.h0) it2.next()).a.toString());
            }
            zVar.A = h00.q.r1(arrayList2);
            if (set != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (!set.contains(((za.h0) obj3).a.toString())) {
                        arrayList3.add(obj3);
                    }
                }
                it = arrayList3.iterator();
                jVar = this.C;
                i = 0;
            }
            return g00.b0.a;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = kVar.C;
        it = kVar.B;
        jVar = kVar.A;
        t1.O(obj);
        while (it.hasNext()) {
            String strC = ((za.h0) it.next()).d.c("error");
            if (strC != null) {
                n00.b bVar = ho.e.G;
                bVar.getClass();
                g00.s sVar = new g00.s(bVar, 4);
                do {
                    if (!sVar.hasNext()) {
                        next = null;
                        break;
                    }
                    next = sVar.next();
                } while (!kotlin.jvm.internal.m.a(((ho.e) next).name(), strC));
                eVar = (ho.e) next;
                if (eVar == null) {
                    eVar = ho.e.E;
                }
            } else {
                eVar = ho.e.E;
            }
            kVar.A = jVar;
            kVar.B = it;
            kVar.C = i;
            kVar.F = 1;
            if (jVar.emit(eVar, kVar) == aVar) {
                return aVar;
            }
        }
        return g00.b0.a;
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        v vVar;
        switch (this.A) {
            case 0:
                if (cVar instanceof v) {
                    vVar = (v) cVar;
                    int i = vVar.D;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        vVar.D = i - Integer.MIN_VALUE;
                    } else {
                        vVar = new v(this, cVar);
                    }
                } else {
                    vVar = new v(this, cVar);
                }
                Object obj2 = vVar.B;
                l00.a aVar = l00.a.A;
                int i2 = vVar.D;
                try {
                    if (i2 == 0) {
                        t1.O(obj2);
                        j jVar = this.C;
                        vVar.A = this;
                        vVar.D = 1;
                        Object objEmit = jVar.emit(obj, vVar);
                        this = objEmit;
                        if (objEmit == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        w wVar = vVar.A;
                        t1.O(obj2);
                        this = wVar;
                    }
                    return g00.b0.a;
                } catch (Throwable th) {
                    this.B.A = th;
                    throw th;
                }
            default:
                return b((List) obj, cVar);
        }
    }
}
