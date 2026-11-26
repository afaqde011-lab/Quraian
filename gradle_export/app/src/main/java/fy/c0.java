package fy;

import a40.m0;
import a40.u1;
import androidx.lifecycle.u0;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import ri.t1;

public final class c0 extends vm.a {
    public final xw.k d;
    public final xv.c e;
    public final xx.c f;
    public final au.a g;
    public final zt.a h;
    public final vp.x i;
    public final tq.k j;
    public final uu.a k;
    public final aq.a l;
    public final pm.c m;
    public u1 n;
    public u1 o;
    public volatile String p;
    public volatile List q;
    public volatile List r;
    public final ArrayList s;
    public volatile cy.i t;
    public volatile cy.i u;
    public volatile Set v;

    public c0(xw.k kVar, xv.c cVar, xx.c cVar2, zx.b bVar, au.a aVar, zt.a aVar2, vp.x xVar, tq.k kVar2, uu.a aVar3, aq.a aVar4, pm.c cVar3) {
        h00.x xVar2 = h00.x.A;
        super(new u("", ze.d.E(xVar2), ze.d.E(xVar2), ze.d.E(xVar2), true, false, ze.d.E(xVar2), ze.d.E(xVar2), ze.d.E(xVar2)));
        this.d = kVar;
        this.e = cVar;
        this.f = cVar2;
        this.g = aVar;
        this.h = aVar2;
        this.i = xVar;
        this.j = kVar2;
        this.k = aVar3;
        this.l = aVar4;
        this.m = cVar3;
        this.p = "";
        this.q = xVar2;
        this.r = xVar2;
        ArrayList arrayList = bVar.d;
        if (arrayList == null) {
            Map mapA = bVar.a(false);
            Map mapA2 = bVar.a(true);
            z00.e eVar = new z00.e(1, 114, 1);
            ArrayList arrayList2 = new ArrayList(h00.r.q0(eVar, 10));
            Iterator it = eVar.iterator();
            while (true) {
                z00.d dVar = (z00.d) it;
                if (!dVar.C) {
                    break;
                }
                int iNextInt = dVar.nextInt();
                String strW = z3.W(iNextInt);
                strW = strW == null ? "" : strW;
                String str = (String) mapA.get(Integer.valueOf(iNextInt));
                str = str == null ? "" : str;
                String str2 = (String) mapA2.get(Integer.valueOf(iNextInt));
                str2 = str2 == null ? "" : str2;
                Integer numH0 = h00.n.H0(cy.n.a, iNextInt - 1);
                arrayList2.add(new cy.m(iNextInt, numH0 != null ? numH0.intValue() : 0, strW, str, str2));
            }
            bVar.d = arrayList2;
            arrayList = arrayList2;
        }
        this.s = arrayList;
        cy.i iVar = cy.i.g;
        this.t = iVar;
        this.u = iVar;
        this.v = h00.z.A;
        k00.c cVar4 = null;
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new v(this, cVar4, 1), 31);
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new v(this, cVar4, 3), 31);
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new v(this, cVar4, 2), 31);
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new v(this, cVar4, 5), 31);
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new v(this, cVar4, 4), 31);
    }

    public static final void j(c0 c0Var) {
        u uVar = (u) c0Var.c.d.getValue();
        cy.i iVar = c0Var.t;
        Set setR1 = h00.q.r1(uVar.g);
        Set setR2 = h00.q.r1(uVar.h);
        iVar.getClass();
        ?? r4 = iVar.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : r4) {
            if (setR1.contains(Integer.valueOf(((cy.k) obj).b.a))) {
                arrayList.add(obj);
            }
        }
        ?? r2 = iVar.b;
        ?? r1 = iVar.c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : r1) {
            cy.j jVar = (cy.j) obj2;
            if (!jVar.b.c() && setR2.contains(Integer.valueOf(jVar.b.a))) {
                arrayList2.add(obj2);
            }
        }
        c0Var.u = new cy.i(arrayList, r2, arrayList2);
        c0Var.v = h00.q.r1(uVar.i);
        c0Var.n();
    }

    public static final Object k(c0 c0Var, m00.c cVar) {
        y yVar;
        Object next;
        Object next2;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i = yVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                yVar.C = i - Integer.MIN_VALUE;
            } else {
                yVar = new y(c0Var, cVar);
            }
        } else {
            yVar = new y(c0Var, cVar);
        }
        Object objB = yVar.A;
        l00.a aVar = l00.a.A;
        int i2 = yVar.C;
        if (i2 == 0) {
            t1.O(objB);
            tq.k kVar = c0Var.j;
            yVar.C = 1;
            objB = kVar.b(yVar);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objB);
        }
        Iterator it = ((Iterable) objB).iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int iIntValue = ((Number) next).intValue();
            List list = c0Var.q;
            if (list == null || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((bx.c) it2.next()).a == iIntValue) {
                        break loop0;
                    }
                }
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            return new Integer(num.intValue());
        }
        Iterator it3 = c0Var.q.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (((bx.c) next2).a != 254);
        bx.c cVar2 = (bx.c) next2;
        if (cVar2 != null) {
            return new Integer(cVar2.a);
        }
        bx.c cVar3 = (bx.c) h00.q.N0(c0Var.q);
        if (cVar3 != null) {
            return new Integer(cVar3.a);
        }
        return null;
    }

    public static final Object l(c0 c0Var, cy.d dVar, m00.c cVar) {
        a0 a0Var;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i = a0Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                a0Var.C = i - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(c0Var, cVar);
            }
        } else {
            a0Var = new a0(c0Var, cVar);
        }
        Object obj = a0Var.A;
        Object obj2 = l00.a.A;
        int i2 = a0Var.C;
        Object obj3 = g00.b0.a;
        if (i2 == 0) {
            t1.O(obj);
            xx.c cVar2 = c0Var.f;
            a0Var.C = 1;
            cVar2.getClass();
            h40.e eVar = m0.a;
            Object objJ = a40.c0.J(new rm.c(cVar2, dVar, null, 27), h40.d.C, a0Var);
            if (objJ != obj2) {
                objJ = obj3;
            }
            if (objJ != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            return obj3;
        }
        t1.O(obj);
        a0Var.C = 2;
        return c0Var.m(a0Var) == obj2 ? obj2 : obj3;
    }

    public final Object m(m00.c cVar) {
        z zVar;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i = zVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                zVar.C = i - Integer.MIN_VALUE;
            } else {
                zVar = new z(this, cVar);
            }
        } else {
            zVar = new z(this, cVar);
        }
        Object objJ = zVar.A;
        l00.a aVar = l00.a.A;
        int i2 = zVar.C;
        if (i2 == 0) {
            t1.O(objJ);
            zVar.C = 1;
            xx.c cVar2 = this.f;
            cVar2.getClass();
            h40.e eVar = m0.a;
            objJ = a40.c0.J(new lu.w(cVar2, null, 23), h40.d.C, zVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objJ);
        }
        List list = (List) objJ;
        i(u.a((u) this.c.d.getValue(), null, null, g4.d0(list), g4.d0(o(list)), false, false, null, null, null, 499));
        return g00.b0.a;
    }

    public final void n() {
        String str = this.p;
        if (r30.k.L0(str)) {
            str = ((u) this.c.d.getValue()).a;
        }
        if (r30.k.L0(str)) {
            return;
        }
        p(0L, str);
    }

    public final ArrayList o(List list) {
        Object next;
        Object eVar;
        Object next2;
        Object next3;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cy.d dVar = (cy.d) it.next();
            Object objA = null;
            if (dVar instanceof cy.b) {
                Iterator it2 = this.q.iterator();
                do {
                    if (!it2.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it2.next();
                } while (((bx.c) next3).a != ((cy.b) dVar).a);
                bx.c cVar = (bx.c) next3;
                if (cVar != null) {
                    eVar = new cy.e(((cy.b) dVar).b, cy.f.A, 0, cVar, null, null, null, null, null, null, cVar.i, 1008);
                    objA = eVar;
                }
            } else if (dVar instanceof cy.a) {
                Iterator it3 = this.r.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (((dw.a) next2).a != ((cy.a) dVar).a);
                dw.a aVar = (dw.a) next2;
                if (aVar != null) {
                    String str = ((cy.a) dVar).b;
                    cy.f fVar = cy.f.C;
                    String str2 = aVar.d;
                    eVar = new cy.e(str, fVar, 0, null, null, null, null, null, null, aVar, !r30.k.L0(str2) ? str2 : null, 504);
                    objA = eVar;
                }
            } else {
                if (!(dVar instanceof cy.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                Iterator it4 = this.s.iterator();
                do {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                } while (((cy.m) next).a != ((cy.c) dVar).a);
                cy.m mVar = (cy.m) next;
                if (mVar != null) {
                    cy.c cVar2 = (cy.c) dVar;
                    String str3 = cVar2.c;
                    cy.f fVar2 = cy.f.B;
                    Integer numValueOf = Integer.valueOf(mVar.a);
                    String str4 = mVar.b;
                    String str5 = mVar.c;
                    String str6 = mVar.d;
                    Integer num = cVar2.b;
                    if (num != null) {
                        objA = this.m.a(2131886538, Integer.valueOf(num.intValue()));
                    }
                    eVar = new cy.e(str3, fVar2, 0, null, numValueOf, str4, str5, str6, num, null, objA, 520);
                    objA = eVar;
                }
            }
            if (objA != null) {
                arrayList.add(objA);
            }
        }
        return arrayList;
    }

    public final void p(long j, String str) {
        u1 u1Var = this.n;
        if (u1Var != null) {
            u1Var.i(null);
        }
        this.n = ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new br.h(j, this, str, (k00.c) null), 31);
    }
}
