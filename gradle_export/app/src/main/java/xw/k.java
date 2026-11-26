package xw;

import a40.c0;
import a40.m0;
import a40.w1;
import android.app.LocaleManager;
import androidx.datastore.core.DataStore;
import bt.f2;
import bt.y1;
import d40.o;
import d40.u0;
import d40.z0;
import h00.d0;
import h00.r;
import h00.x;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import ri.t1;
import u00.n;

public final class k {
    public final uw.c a;
    public final uw.e b;
    public final zw.a c;
    public final DataStore d;
    public final e e;
    public final LocaleManager f;
    public final er.j g;
    public final zt.a h;
    public final au.a i;
    public final y1 j;

    public k(uw.c cVar, uw.e eVar, uw.h hVar, zw.a aVar, DataStore dataStore, e eVar2, LocaleManager localeManager, er.j jVar, zt.a aVar2, au.a aVar3) {
        w1 w1VarE = c0.e();
        h40.e eVar3 = m0.a;
        f40.c cVarC = c0.c(rd.a.P(w1VarE, h40.d.C));
        this.a = cVar;
        this.b = eVar;
        this.c = aVar;
        this.d = dataStore;
        this.e = eVar2;
        this.f = localeManager;
        this.g = jVar;
        this.h = aVar2;
        this.i = aVar3;
        this.j = new y1(dataStore.getData(), hVar, 27);
        ta.c0.M(cVarC, (k00.i) null, (n) null, (u00.k) null, new l6.d(this, (k00.c) null, 22), 31);
    }

    public static List a(List list, Set set) {
        if (set.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!set.contains(Integer.valueOf(((bx.c) obj).a))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final java.lang.Object b(m00.c r43) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: xw.k.b(m00.c):java.lang.Object");
    }

    public final Object c(m00.c cVar) {
        g gVar;
        k kVar;
        List list;
        k kVar2;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i = gVar.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.E = i - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objU = gVar.C;
        l00.a aVar = l00.a.A;
        int i2 = gVar.E;
        if (i2 == 0) {
            t1.O(objU);
            gVar.A = this;
            gVar.E = 1;
            objU = o.u(this.j, gVar);
            if (objU != aVar) {
                kVar = this;
            }
            return aVar;
        }
        if (i2 == 1) {
            kVar = gVar.A;
            t1.O(objU);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = gVar.B;
            kVar2 = gVar.A;
            t1.O(objU);
        }
        kVar2.getClass();
        return a(list, (Set) objU);
        List list2 = (List) objU;
        if (list2 == null) {
            list2 = x.A;
        }
        z0 z0Var = new z0(this.e.g);
        gVar.A = kVar;
        gVar.B = list2;
        gVar.E = 2;
        Object objS = o.s(z0Var, gVar);
        if (objS != aVar) {
            List list3 = list2;
            objU = objS;
            list = list3;
            kVar2 = kVar;
            kVar2.getClass();
            return a(list, (Set) objU);
        }
        return aVar;
    }

    public final Object d(int i, m00.c cVar) {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i2 = hVar.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.D = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objU = hVar.B;
        l00.a aVar = l00.a.A;
        int i3 = hVar.D;
        if (i3 == 0) {
            t1.O(objU);
            hVar.A = i;
            hVar.D = 1;
            objU = o.u(this.j, hVar);
            if (objU == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = hVar.A;
            t1.O(objU);
        }
        Iterable iterable = (List) objU;
        if (iterable == null) {
            iterable = x.A;
        }
        for (Object obj : iterable) {
            if (((bx.c) obj).a == i) {
                return obj;
            }
        }
        return null;
    }

    public final Serializable e(List list, m00.c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i = iVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                iVar.D = i - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objU = iVar.B;
        l00.a aVar = l00.a.A;
        int i2 = iVar.D;
        x xVar = x.A;
        if (i2 == 0) {
            t1.O(objU);
            if (list.isEmpty()) {
                return xVar;
            }
            iVar.A = list;
            iVar.D = 1;
            objU = o.u(this.j, iVar);
            if (objU == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = iVar.A;
            t1.O(objU);
        }
        List list2 = (List) objU;
        List list3 = xVar;
        if (list2 != null) {
            list3 = list2;
        }
        int iP = d0.P(r.q0(list3, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
        for (Object obj : list3) {
            linkedHashMap.put(new Integer(((bx.c) obj).a), obj);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bx.c cVar2 = (bx.c) linkedHashMap.get(new Integer(((Number) it.next()).intValue()));
            if (cVar2 != null) {
                arrayList.add(cVar2);
            }
        }
        return arrayList;
    }

    public final u0 f() {
        return new u0(this.j, new z0(this.e.g), new f2(this, null, 5));
    }
}
