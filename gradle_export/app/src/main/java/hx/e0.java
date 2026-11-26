package hx;

import a1.p1;
import a1.r1;
import androidx.lifecycle.u0;
import com.mchutov.quranify.reciters.presentation.screen.collection.main.ReciterCollectionEffect$OpenReciterScreen;
import com.mchutov.quranify.reciters.presentation.screen.collection.topreciters.TopRecitersLauncher;
import com.mchutov.quranify.reciters.presentation.screen.detail.main.ReciterLauncher;
import com.mchutov.quranify.reciters.presentation.screen.search.SearchReciterLauncher;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ri.t1;

public final class e0 extends vm.a {
    public final xw.k d;
    public final xw.d e;
    public final au.a f;
    public final zt.a g;
    public final tq.k h;
    public final pm.c i;
    public List j;

    public e0(xw.k kVar, xw.d dVar, au.a aVar, zt.a aVar2, tq.k kVar2, pm.c cVar) {
        h00.x xVar = h00.x.A;
        super(new x(false, true, false, false, ze.d.E(xVar), ze.d.E(xVar), false, false, "", ze.d.E(xVar), ze.d.E(xVar), true, ze.d.E(xVar), ze.d.E(xVar)));
        this.d = kVar;
        this.e = dVar;
        this.f = aVar;
        this.g = aVar2;
        this.h = kVar2;
        this.i = cVar;
        this.j = xVar;
        k00.c cVar2 = null;
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y(this, cVar2, 1), 31);
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y(this, cVar2, 3), 31);
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y(this, cVar2, 4), 31);
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y(this, cVar2, 5), 31);
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y(this, cVar2, 2), 31);
    }

    public static final Object j(e0 e0Var, boolean z, m00.c cVar) throws Throwable {
        z zVar;
        Throwable th;
        boolean zIsEmpty;
        boolean z2 = z;
        pm.b bVar = e0Var.c;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i = zVar.F;
            if ((i & Integer.MIN_VALUE) != 0) {
                zVar.F = i - Integer.MIN_VALUE;
            } else {
                zVar = new z(e0Var, cVar);
            }
        } else {
            zVar = new z(e0Var, cVar);
        }
        Object objL = zVar.D;
        Object obj = l00.a.A;
        boolean z3 = zVar.F;
        try {
            if (z3 != 0) {
                if (z3 == 1) {
                    boolean z4 = zVar.B;
                    boolean z5 = zVar.A;
                    try {
                        t1.O(objL);
                        zIsEmpty = z4;
                        z2 = z5;
                    } catch (Exception unused) {
                        zIsEmpty = z4;
                        z2 = z5;
                        if (!((x) bVar.d.getValue()).c) {
                            e0Var.i(x.a((x) bVar.d.getValue(), false, false, true, null, false, false, null, null, null, false, null, null, 16375));
                        }
                        if (zIsEmpty) {
                            zVar.A = z2;
                            zVar.B = zIsEmpty;
                            zVar.F = 3;
                            objL = e0Var.l(zVar);
                            if (objL == obj) {
                                return obj;
                            }
                            if (!((Boolean) objL).booleanValue()) {
                                e0Var.i(x.a((x) bVar.d.getValue(), false, false, false, null, false, false, null, null, null, false, null, null, 16381));
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z3 = z4;
                        z2 = z5;
                        if (z3 == 0) {
                            throw th;
                        }
                        zVar.C = th;
                        zVar.A = z2;
                        zVar.B = z3;
                        zVar.F = 4;
                        Object objL2 = e0Var.l(zVar);
                        if (objL2 == obj) {
                            return obj;
                        }
                        th = th;
                        objL = objL2;
                        if (!((Boolean) objL).booleanValue()) {
                            e0Var.i(x.a((x) bVar.d.getValue(), false, false, false, null, false, false, null, null, null, false, null, null, 16381));
                        }
                        throw th;
                    }
                } else {
                    if (z3 != 2) {
                        if (z3 == 3) {
                            t1.O(objL);
                            if (!((Boolean) objL).booleanValue()) {
                                e0Var.i(x.a((x) bVar.d.getValue(), false, false, false, null, false, false, null, null, null, false, null, null, 16381));
                            }
                            return g00.b0.a;
                        }
                        if (z3 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = zVar.C;
                        t1.O(objL);
                        if (!((Boolean) objL).booleanValue()) {
                            e0Var.i(x.a((x) bVar.d.getValue(), false, false, false, null, false, false, null, null, null, false, null, null, 16381));
                        }
                        throw th;
                    }
                    t1.O(objL);
                }
                if (!((Boolean) objL).booleanValue()) {
                    e0Var.i(x.a((x) bVar.d.getValue(), false, false, false, null, false, false, null, null, null, false, null, null, 16381));
                }
                return g00.b0.a;
            }
            t1.O(objL);
            zIsEmpty = ((h00.b) ((x) bVar.d.getValue()).e).isEmpty();
            if (zIsEmpty) {
                e0Var.i(x.a((x) bVar.d.getValue(), false, true, false, null, false, false, null, null, null, false, null, null, 16373));
            }
            try {
                xw.d dVar = e0Var.e;
                zVar.A = z2;
                zVar.B = zIsEmpty;
                zVar.F = 1;
                if (dVar.b(z2, zVar) == obj) {
                    return obj;
                }
            } catch (Exception unused2) {
                if (!((x) bVar.d.getValue()).c) {
                    e0Var.i(x.a((x) bVar.d.getValue(), false, false, true, null, false, false, null, null, null, false, null, null, 16375));
                }
                if (zIsEmpty) {
                    zVar.A = z2;
                    zVar.B = zIsEmpty;
                    zVar.F = 3;
                    objL = e0Var.l(zVar);
                    if (objL == obj) {
                        return obj;
                    }
                    if (!((Boolean) objL).booleanValue()) {
                        e0Var.i(x.a((x) bVar.d.getValue(), false, false, false, null, false, false, null, null, null, false, null, null, 16381));
                    }
                }
            }
            e0Var.i(x.a((x) bVar.d.getValue(), false, false, false, null, false, false, null, null, null, false, null, null, 16371));
            if (zIsEmpty) {
                zVar.A = z2;
                zVar.B = zIsEmpty;
                zVar.F = 2;
                objL = e0Var.l(zVar);
                if (objL == obj) {
                    return obj;
                }
                if (!((Boolean) objL).booleanValue()) {
                    e0Var.i(x.a((x) bVar.d.getValue(), false, false, false, null, false, false, null, null, null, false, null, null, 16381));
                }
            }
            return g00.b0.a;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void k(l action) {
        kotlin.jvm.internal.m.e(action, "action");
        k00.c cVar = null;
        if (action instanceof h) {
            ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y(this, cVar, 7), 31);
            return;
        }
        if (action instanceof g) {
            ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, new r1(this, (k00.c) null, 7), new y(this, cVar, 6), 23);
            return;
        }
        boolean z = action instanceof i;
        pm.b bVar = this.c;
        if (z) {
            i(x.a((x) bVar.d.getValue(), false, false, false, null, false, true, null, null, null, false, null, null, 16255));
            return;
        }
        boolean z2 = action instanceof a;
        ?? arrayList = h00.x.A;
        if (z2) {
            i(x.a((x) bVar.d.getValue(), false, false, false, null, false, false, "", ze.d.E((List) arrayList), null, false, null, null, 15487));
            return;
        }
        if (action instanceof j) {
            String str = ((j) action).a;
            x xVar = (x) bVar.d.getValue();
            if (!r30.k.L0(str)) {
                String string = r30.k.j1(str).toString();
                if (r30.k.L0(string)) {
                    arrayList = this.j;
                } else {
                    List list = this.j;
                    arrayList = new ArrayList();
                    for (Object obj : list) {
                        bx.c cVar2 = (bx.c) obj;
                        if (!r30.k.A0(cVar2.b, str, true) && !r30.k.A0(cVar2.i, str, true)) {
                            r30.r.q0(cVar2.h, str);
                        }
                        if (cVar2.b(string)) {
                            arrayList.add(obj);
                        }
                    }
                }
            }
            i(x.a(xVar, false, false, false, null, false, false, str, ze.d.E((List) arrayList), null, false, null, null, 15615));
            return;
        }
        if (action instanceof b) {
            ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y(this, cVar, 0), 31);
            return;
        }
        if (action instanceof k) {
            int i = ((k) action).a;
            ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new p1(this, i, (k00.c) null, 5), 31);
            ab.a0.A0(this, new ReciterCollectionEffect$OpenReciterScreen(new ReciterLauncher(i, (Integer) null, 2, (kotlin.jvm.internal.f) null)));
            return;
        }
        if (action instanceof f) {
            ab.a0.A0(this, new ReciterCollectionEffect$OpenReciterScreen(new ReciterLauncher(((f) action).a, (Integer) null, 2, (kotlin.jvm.internal.f) null)));
            return;
        }
        if (action instanceof c) {
            m(((c) action).a);
            return;
        }
        if (action instanceof e) {
            m(((e) action).a);
            return;
        }
        if (!action.equals(d.a)) {
            throw new NoWhenBranchMatchedException();
        }
        u30.b bVar2 = ((x) bVar.d.getValue()).n;
        ArrayList arrayList2 = new ArrayList(h00.r.q0(bVar2, 10));
        Iterator it = bVar2.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((bx.c) it.next()).a));
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        ab.a0.A0(this, new m(new SearchReciterLauncher(this.i.a(2131887146, new Object[0]), arrayList2, (String) null, 4, (kotlin.jvm.internal.f) null)));
    }

    public final Object l(m00.c cVar) {
        a0 a0Var;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i = a0Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                a0Var.C = i - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(this, cVar);
            }
        } else {
            a0Var = new a0(this, cVar);
        }
        Object objS = a0Var.A;
        l00.a aVar = l00.a.A;
        int i2 = a0Var.C;
        if (i2 == 0) {
            t1.O(objS);
            if (((h00.b) ((x) this.c.d.getValue()).e).isEmpty()) {
                d40.p1 p1Var = this.e.g;
                a0Var.C = 1;
                objS = d40.o.s(p1Var, a0Var);
                if (objS == aVar) {
                    return aVar;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t1.O(objS);
        boolean z = ((Collection) objS).isEmpty() ? false : true;
        return Boolean.valueOf(z);
    }

    public final void m(int i) {
        Object next;
        Iterator<E> it = ((x) this.c.d.getValue()).e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((fx.a) next).a != i);
        fx.a aVar = (fx.a) next;
        if (aVar == null) {
            return;
        }
        u30.b<fx.b> bVar = aVar.b;
        String str = aVar.d;
        int i2 = aVar.a;
        if (i2 != 4) {
            ArrayList arrayList = new ArrayList(h00.r.q0(bVar, 10));
            Iterator<E> it2 = bVar.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((fx.b) it2.next()).a));
            }
            ab.a0.A0(this, new m(new SearchReciterLauncher(str, arrayList, aVar.c)));
            return;
        }
        ArrayList arrayList2 = new ArrayList(h00.r.q0(bVar, 10));
        for (fx.b bVar2 : bVar) {
            arrayList2.add(new jx.p(bVar2.a, bVar2.b));
        }
        ab.a0.A0(this, new n(new TopRecitersLauncher(str, arrayList2, i2)));
    }
}
