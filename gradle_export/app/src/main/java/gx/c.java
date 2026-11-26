package gx;

import bt.y1;
import com.mchutov.quranify.reciters.presentation.screen.collection.topreciters.TopRecitersLauncher;
import com.mchutov.quranify.reciters.presentation.screen.search.SearchReciterLauncher;
import d40.p1;
import g00.b0;
import h00.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jx.p;
import ri.t1;

public final class c implements bm.a {
    public final cq.a a;
    public final xw.d b;
    public final tq.k c;

    public c(cq.a aVar, xw.d dVar, tq.k kVar) {
        this.a = aVar;
        this.b = dVar;
        this.c = kVar;
    }

    @Override
    public final Object a(vl.k kVar, k00.c cVar) {
        a aVar;
        int i;
        cq.f fVar;
        cq.a aVar2;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i2 = aVar.F;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.F = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, (m00.c) cVar);
            }
        } else {
            aVar = new a(this, (m00.c) cVar);
        }
        Object objS = aVar.D;
        Object obj = l00.a.A;
        int i3 = aVar.F;
        b0 b0Var = b0.a;
        Object obj2 = null;
        if (i3 != 0) {
            if (i3 == 1) {
                i = aVar.C;
                t1.O(objS);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fVar = aVar.B;
                aVar2 = aVar.A;
                t1.O(objS);
            }
            aVar2.c(fVar, (p9.g) objS);
            return b0Var;
        }
        t1.O(objS);
        vl.h hVar = kVar instanceof vl.h ? (vl.h) kVar : null;
        if (hVar != null) {
            i = hVar.a;
            p1 p1Var = this.b.g;
            aVar.C = i;
            aVar.F = 1;
            objS = d40.o.s(p1Var, aVar);
            if (objS != obj) {
            }
            return obj;
        }
        return b0Var;
        for (Object obj3 : (Iterable) objS) {
            if (((bx.d) obj3).a == i) {
                obj2 = obj3;
                break;
            }
        }
        bx.d dVar = (bx.d) obj2;
        if (dVar != null) {
            cq.f fVar2 = cq.f.b;
            cq.a aVar3 = this.a;
            aVar.A = aVar3;
            aVar.B = fVar2;
            aVar.C = i;
            aVar.F = 2;
            Object objC = c(dVar, aVar);
            if (objC != obj) {
                objS = objC;
                fVar = fVar2;
                aVar2 = aVar3;
                aVar2.c(fVar, (p9.g) objS);
            }
            return obj;
        }
        return b0Var;
    }

    @Override
    public final boolean b(vl.k link) {
        kotlin.jvm.internal.m.e(link, "link");
        return link instanceof vl.h;
    }

    public final Object c(bx.d dVar, m00.c cVar) {
        b bVar;
        String str;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i = bVar.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.E = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objS = bVar.C;
        l00.a aVar = l00.a.A;
        int i2 = bVar.E;
        if (i2 == 0) {
            t1.O(objS);
            int i3 = dVar.a;
            String str2 = dVar.c;
            u30.b<bx.a> bVar2 = dVar.b;
            String str3 = dVar.d;
            if (i3 == 4) {
                ArrayList arrayList = new ArrayList(r.q0(bVar2, 10));
                for (bx.a aVar2 : bVar2) {
                    arrayList.add(new p(aVar2.a, aVar2.b));
                }
                return new n(new TopRecitersLauncher(str3, arrayList, dVar.a));
            }
            if (!str2.equalsIgnoreCase("my-favourites")) {
                ArrayList arrayList2 = new ArrayList(r.q0(bVar2, 10));
                Iterator<E> it = bVar2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new Integer(((bx.a) it.next()).a));
                }
                return new k(new SearchReciterLauncher(str3, arrayList2, str2));
            }
            y1 y1Var = this.c.c;
            bVar.A = dVar;
            bVar.B = str3;
            bVar.E = 1;
            objS = d40.o.s(y1Var, bVar);
            if (objS == aVar) {
                return aVar;
            }
            str = str3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = bVar.B;
            dVar = bVar.A;
            t1.O(objS);
        }
        return new k(new SearchReciterLauncher(str, (List) objS, dVar.c));
    }
}
