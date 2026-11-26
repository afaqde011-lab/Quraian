package a40;

import bt.j2;
import bv.e3;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;

public final class g1 extends kotlin.jvm.internal.j implements u00.k {
    public final int A;

    public g1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.A = i3;
    }

    @Override
    public final Object invoke(Object obj) {
        long j;
        rs.a aVar;
        rs.a aVar2;
        rs.b bVar;
        rs.c cVar;
        switch (this.A) {
            case 0:
                ((h1) this.receiver).k((Throwable) obj);
                return g00.b0.a;
            case 1:
                as.u p0 = (as.u) obj;
                kotlin.jvm.internal.m.e(p0, "p0");
                ((as.b1) this.receiver).l(p0);
                return g00.b0.a;
            case 2:
                as.u p1 = (as.u) obj;
                kotlin.jvm.internal.m.e(p1, "p0");
                ((as.b1) this.receiver).l(p1);
                return g00.b0.a;
            case 3:
                bv.g1 p2 = (bv.g1) obj;
                kotlin.jvm.internal.m.e(p2, "p0");
                ((e3) this.receiver).o(p2);
                return g00.b0.a;
            case 4:
                bv.g1 p3 = (bv.g1) obj;
                kotlin.jvm.internal.m.e(p3, "p0");
                ((e3) this.receiver).o(p3);
                return g00.b0.a;
            case 5:
                bv.g1 p4 = (bv.g1) obj;
                kotlin.jvm.internal.m.e(p4, "p0");
                ((e3) this.receiver).o(p4);
                return g00.b0.a;
            case 6:
                ev.j p5 = (ev.j) obj;
                kotlin.jvm.internal.m.e(p5, "p0");
                ((ev.c0) this.receiver).j(p5);
                return g00.b0.a;
            case 7:
                c00.f p6 = (c00.f) obj;
                kotlin.jvm.internal.m.e(p6, "p0");
                ((c00.x) this.receiver).k(p6);
                return g00.b0.a;
            case 8:
                qt.f p7 = (qt.f) obj;
                kotlin.jvm.internal.m.e(p7, "p0");
                ((qt.k) this.receiver).k(p7);
                return g00.b0.a;
            case 9:
                az.f p8 = (az.f) obj;
                kotlin.jvm.internal.m.e(p8, "p0");
                ((az.r) this.receiver).j(p8);
                return g00.b0.a;
            case 10:
                az.f p9 = (az.f) obj;
                kotlin.jvm.internal.m.e(p9, "p0");
                ((az.r) this.receiver).j(p9);
                return g00.b0.a;
            case 11:
                n20.e p11 = (n20.e) obj;
                kotlin.jvm.internal.m.e(p11, "p0");
                return ((b20.n) this.receiver).N(p11);
            case 12:
                n20.e p12 = (n20.e) obj;
                kotlin.jvm.internal.m.e(p12, "p0");
                return ((b20.n) this.receiver).O(p12);
            case 13:
                String p13 = (String) obj;
                kotlin.jvm.internal.m.e(p13, "p0");
                ((b30.d) this.receiver).getClass();
                return b30.d.a(p13);
            case 14:
                bt.w p14 = (bt.w) obj;
                kotlin.jvm.internal.m.e(p14, "p0");
                ((j2) this.receiver).n(p14);
                return g00.b0.a;
            case 15:
                bt.w p15 = (bt.w) obj;
                kotlin.jvm.internal.m.e(p15, "p0");
                ((j2) this.receiver).n(p15);
                return g00.b0.a;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                ss.v p16 = (ss.v) obj;
                kotlin.jvm.internal.m.e(p16, "p0");
                ((xs.c) this.receiver).getClass();
                List list = p16.h;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    long j2 = 1000;
                    if (!it.hasNext()) {
                        if (arrayList.isEmpty()) {
                            List list2 = p16.i;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Object obj2 : list2) {
                                ss.w wVar = (ss.w) obj2;
                                g00.k kVar = new g00.k(wVar.a, Integer.valueOf(wVar.b));
                                Object arrayList2 = linkedHashMap.get(kVar);
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                    linkedHashMap.put(kVar, arrayList2);
                                }
                                ((List) arrayList2).add(obj2);
                            }
                            arrayList = new ArrayList();
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                g00.k kVar2 = (g00.k) entry.getKey();
                                List list3 = (List) entry.getValue();
                                Object obj3 = kVar2.A;
                                Object obj4 = kVar2.B;
                                Long lA = xs.c.a((String) obj3);
                                if (lA != null) {
                                    long jLongValue = lA.longValue();
                                    String str = kVar2.A + "|" + obj4;
                                    int iIntValue = ((Number) obj4).intValue();
                                    Iterator it2 = list3.iterator();
                                    long j3 = 0;
                                    while (it2.hasNext()) {
                                        j3 += ((ss.w) it2.next()).d;
                                        j2 = j2;
                                    }
                                    j = j2;
                                    aVar = new rs.a(str, jLongValue, iIntValue, (int) (j3 / j), jLongValue);
                                } else {
                                    j = j2;
                                    aVar = null;
                                }
                                if (aVar != null) {
                                    arrayList.add(aVar);
                                }
                                j2 = j;
                            }
                        }
                        return arrayList;
                    }
                    ss.s sVar = (ss.s) it.next();
                    Long lA2 = xs.c.a(sVar.a);
                    if (lA2 != null) {
                        long jLongValue2 = lA2.longValue();
                        aVar2 = new rs.a(sVar.a + "|" + sVar.b, jLongValue2, sVar.b, (int) (sVar.c / 1000), jLongValue2);
                    } else {
                        aVar2 = null;
                    }
                    if (aVar2 != null) {
                        arrayList.add(aVar2);
                    }
                }
                break;
            case 17:
                ss.v p17 = (ss.v) obj;
                kotlin.jvm.internal.m.e(p17, "p0");
                ((xs.c) this.receiver).getClass();
                List<ss.w> list4 = p17.i;
                ArrayList arrayList3 = new ArrayList();
                for (ss.w wVar2 : list4) {
                    Long lA3 = xs.c.a(wVar2.a);
                    if (lA3 != null) {
                        long jLongValue3 = lA3.longValue();
                        bVar = new rs.b(wVar2.a + "|" + wVar2.b + "|" + wVar2.c, jLongValue3, wVar2.c, wVar2.b, (int) (wVar2.d / 1000), jLongValue3);
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        arrayList3.add(bVar);
                    }
                }
                return arrayList3;
            case 18:
                ss.v p18 = (ss.v) obj;
                kotlin.jvm.internal.m.e(p18, "p0");
                ((xs.c) this.receiver).getClass();
                List<ss.i> list5 = p18.g;
                ArrayList arrayList4 = new ArrayList();
                for (ss.i iVar : list5) {
                    Long lA4 = xs.c.a(iVar.a);
                    if (lA4 != null) {
                        long jLongValue4 = lA4.longValue();
                        cVar = new rs.c(iVar.a + "|" + iVar.b, jLongValue4, iVar.b, (int) (iVar.c / 1000), jLongValue4);
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        arrayList4.add(cVar);
                    }
                }
                return arrayList4;
            case 19:
                n20.e p19 = (n20.e) obj;
                kotlin.jvm.internal.m.e(p19, "p0");
                return ((c30.i) this.receiver).k0(p19);
            case 20:
                f30.f p21 = (f30.f) obj;
                kotlin.jvm.internal.m.e(p21, "p0");
                return new c30.h((c30.i) this.receiver, p21);
            case 21:
                kotlin.jvm.internal.m.e((Set) obj, "p0");
                ca.g gVar = (ca.g) this.receiver;
                ReentrantLock reentrantLock = gVar.d;
                reentrantLock.lock();
                try {
                    List listN1 = h00.q.n1(gVar.c.values());
                    reentrantLock.unlock();
                    Iterator it3 = listN1.iterator();
                    if (!it3.hasNext()) {
                        return g00.b0.a;
                    }
                    ((ca.m) it3.next()).getClass();
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 22:
                ds.g p22 = (ds.g) obj;
                kotlin.jvm.internal.m.e(p22, "p0");
                ((ds.n) this.receiver).j(p22);
                return g00.b0.a;
            case 23:
                dz.g p23 = (dz.g) obj;
                kotlin.jvm.internal.m.e(p23, "p0");
                ((dz.s) this.receiver).j(p23);
                return g00.b0.a;
            case 24:
                ez.h p24 = (ez.h) obj;
                kotlin.jvm.internal.m.e(p24, "p0");
                ez.u uVar = (ez.u) this.receiver;
                pm.b bVar2 = uVar.c;
                if (p24 instanceof ez.f) {
                    uVar.j(((ez.f) p24).a);
                } else if (p24 instanceof ez.g) {
                    ez.t tVar = (ez.t) bVar2.d.getValue();
                    ep.f fVar = tVar.e;
                    LocalDate localDate = tVar.f;
                    if (!r30.k.L0(tVar.a) && tVar.b == null && fVar != null && localDate != null && !tVar.g) {
                        ta.c0.M(androidx.lifecycle.u0.i(uVar), (k00.i) null, new a1.c0(uVar, (k00.c) null, 17), new a1.r1(uVar, (k00.c) null, 5), new a1.g(uVar, tVar, fVar, localDate, (k00.c) null, 25), 19);
                    }
                } else if (p24 instanceof ez.b) {
                    ab.a0.A0(uVar, ez.j.a);
                } else if (p24 instanceof ez.d) {
                    uVar.i(ez.t.a((ez.t) bVar2.d.getValue(), null, null, null, 0, null, null, false, true, 255));
                } else if (p24 instanceof ez.e) {
                    ((ez.t) bVar2.d.getValue()).getClass();
                    uVar.i(ez.t.a((ez.t) bVar2.d.getValue(), null, null, null, 0, null, null, false, false, 255));
                } else {
                    if (!(p24 instanceof ez.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    uVar.i(ez.t.a((ez.t) bVar2.d.getValue(), null, null, null, 0, null, null, false, false, 255));
                    ab.a0.A0(uVar, ez.k.a);
                }
                return g00.b0.a;
            case 25:
                h30.g p25 = (h30.g) obj;
                kotlin.jvm.internal.m.e(p25, "p0");
                return ((f30.e) this.receiver).a(p25);
            case 26:
                fy.k p26 = (fy.k) obj;
                kotlin.jvm.internal.m.e(p26, "p0");
                fy.c0 c0Var = (fy.c0) this.receiver;
                c0Var.getClass();
                k00.c cVar2 = null;
                if (p26 instanceof fy.i) {
                    String str2 = ((fy.i) p26).a;
                    c0Var.p = str2;
                    if (r30.k.L0(str2)) {
                        u1 u1Var = c0Var.n;
                        if (u1Var != null) {
                            u1Var.i(null);
                        }
                        c0Var.i(fy.u.a((fy.u) c0Var.c.d.getValue(), str2, ze.d.E(h00.x.A), null, null, false, false, null, null, null, 508));
                    } else {
                        c0Var.p(50L, str2);
                    }
                } else if (p26.equals(fy.a.a)) {
                    ta.c0.M(androidx.lifecycle.u0.i(c0Var), (k00.i) null, (u00.n) null, (u00.k) null, new fy.v(c0Var, cVar2, 0), 31);
                } else if (p26 instanceof fy.h) {
                    ta.c0.M(androidx.lifecycle.u0.i(c0Var), (k00.i) null, (u00.n) null, (u00.k) null, new fy.x(c0Var, ((fy.h) p26).a, cVar2, 1), 31);
                } else if (p26 instanceof fy.d) {
                    ta.c0.M(androidx.lifecycle.u0.i(c0Var), (k00.i) null, (u00.n) null, (u00.k) null, new fy.x(c0Var, ((fy.d) p26).a, cVar2, 0), 31);
                } else if (p26 instanceof fy.j) {
                    fy.j jVar = (fy.j) p26;
                    ta.c0.M(androidx.lifecycle.u0.i(c0Var), (k00.i) null, (u00.n) null, (u00.k) null, new ev.x(c0Var, jVar.a, jVar.b, (k00.c) null), 31);
                } else if (p26 instanceof fy.f) {
                    ta.c0.M(androidx.lifecycle.u0.i(c0Var), (k00.i) null, (u00.n) null, (u00.k) null, new fy.x(c0Var, ((fy.f) p26).a, cVar2, 1), 31);
                } else if (p26 instanceof fy.e) {
                    ta.c0.M(androidx.lifecycle.u0.i(c0Var), (k00.i) null, (u00.n) null, (u00.k) null, new fy.x(c0Var, ((fy.e) p26).a, cVar2, 0), 31);
                } else if (p26 instanceof fy.g) {
                    fy.g gVar2 = (fy.g) p26;
                    ta.c0.M(androidx.lifecycle.u0.i(c0Var), (k00.i) null, (u00.n) null, (u00.k) null, new ev.x(c0Var, gVar2.a, gVar2.b, (k00.c) null), 31);
                } else if (p26 instanceof fy.b) {
                    ab.a0.A0(c0Var, fy.p.a);
                } else {
                    if (!(p26 instanceof fy.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ab.a0.A0(c0Var, fy.o.a);
                }
                return g00.b0.a;
            case 27:
                c00.f p27 = (c00.f) obj;
                kotlin.jvm.internal.m.e(p27, "p0");
                ((c00.x) this.receiver).k(p27);
                return g00.b0.a;
            case 28:
                ev.j p28 = (ev.j) obj;
                kotlin.jvm.internal.m.e(p28, "p0");
                ((ev.c0) this.receiver).j(p28);
                return g00.b0.a;
            default:
                qt.f p29 = (qt.f) obj;
                kotlin.jvm.internal.m.e(p29, "p0");
                ((qt.k) this.receiver).k(p29);
                return g00.b0.a;
        }
    }
}
