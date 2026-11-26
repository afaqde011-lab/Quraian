package rc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import ri.t1;

public final class a0 extends h1.l {
    public final c40.h C;
    public final AtomicLong D;
    public final AtomicBoolean E;
    public long F;
    public long G;

    public a0() {
        super(2);
        this.C = t1.b(Integer.MAX_VALUE, 6, null);
        this.D = new AtomicLong(-1L);
        this.E = new AtomicBoolean(false);
    }

    public static final Object c1(a0 a0Var, m mVar, m00.c cVar) {
        x xVar;
        a0Var.getClass();
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i10 = xVar.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xVar.D = i10 - Integer.MIN_VALUE;
            } else {
                xVar = new x(a0Var, cVar);
            }
        } else {
            xVar = new x(a0Var, cVar);
        }
        Object objJ1 = xVar.B;
        l00.a aVar = l00.a.A;
        int i11 = xVar.D;
        g00.b0 b0Var = g00.b0.a;
        if (i11 == 0) {
            t1.O(objJ1);
            if (mVar instanceof j) {
                long j9 = ((j) mVar).f13195a;
                xVar.A = a0Var;
                xVar.D = 1;
                objJ1 = a0Var.j1(j9, xVar);
                if (objJ1 != aVar) {
                }
            } else {
                if (!(mVar instanceof k)) {
                    if (mVar instanceof l) {
                        a0Var.E.set(false);
                        long j10 = ((l) mVar).f13197a;
                        xVar.D = 4;
                        if (a0Var.g1(j10, xVar) == aVar) {
                        }
                    }
                    return b0Var;
                }
                gd.a aVar2 = ((k) mVar).f13196a;
                xVar.D = 3;
                if (a0Var.f1(aVar2, xVar) != aVar) {
                    return b0Var;
                }
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                t1.O(objJ1);
                return b0Var;
            }
            if (i11 == 3) {
                t1.O(objJ1);
                return b0Var;
            }
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objJ1);
            return b0Var;
        }
        a0Var = xVar.A;
        t1.O(objJ1);
        a0Var.E.set(true);
        xVar.A = null;
        xVar.D = 2;
        if (a0Var.e1((List) objJ1, xVar) == aVar) {
            return aVar;
        }
        return b0Var;
    }

    public static final long d1(a0 a0Var, fd.d dVar, fd.c cVar, long j9) {
        Long lZ0;
        a0Var.getClass();
        String strE = dVar.e(cVar);
        return (strE == null || (lZ0 = r30.r.z0(strE)) == null) ? j9 : lZ0.longValue();
    }

    public final Object e1(List list, m00.c cVar) {
        boolean zIsEmpty = list.isEmpty();
        g00.b0 b0Var = g00.b0.a;
        if (!zIsEmpty) {
            long j9 = this.F;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                gd.a aVar = (gd.a) it.next();
                Long l = aVar.f6293e;
                if (l == null) {
                    l = new Long(this.D.get());
                }
                aVar.f6293e = l;
                Long l10 = aVar.f6292d;
                if (l10 == null) {
                    long j10 = this.F + 1;
                    this.F = j10;
                    l10 = new Long(j10);
                }
                aVar.f6292d = l10;
                P0();
                K0(hd.b.C, K0(hd.b.B, K0(hd.b.A, aVar)));
            }
            if (this.F > j9) {
                P0().g().f(fd.c.LAST_EVENT_ID, String.valueOf(this.F));
                l00.a aVar2 = l00.a.A;
            }
        }
        return b0Var;
    }

    public final java.lang.Object f1(gd.a r12, m00.c r13) {
        throw new UnsupportedOperationException("Method not decompiled: rc.a0.f1(gd.a, m00.c):java.lang.Object");
    }

    public final Object g1(long j9, m00.c cVar) {
        long j10 = this.D.get();
        g00.b0 b0Var = g00.b0.a;
        if (j10 > -1) {
            this.G = j9;
            P0().g().f(fd.c.LAST_EVENT_TIME, String.valueOf(this.G));
            l00.a aVar = l00.a.A;
        }
        return b0Var;
    }

    public final Object h1(long j9, m00.c cVar) {
        AtomicLong atomicLong = this.D;
        atomicLong.set(j9);
        P0().g().f(fd.c.PREVIOUS_SESSION_ID, String.valueOf(atomicLong.get()));
        l00.a aVar = l00.a.A;
        return g00.b0.a;
    }

    public final Object i1(long j9, m00.c cVar) {
        y yVar;
        boolean zContains;
        List list;
        a0 a0Var;
        List list2;
        boolean z10;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i10 = yVar.G;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                yVar.G = i10 - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, cVar);
            }
        } else {
            yVar = new y(this, cVar);
        }
        Object obj = yVar.E;
        l00.a aVar = l00.a.A;
        int i11 = yVar.G;
        if (i11 == 0) {
            t1.O(obj);
            ArrayList arrayList = new ArrayList();
            zContains = P0().f13151a.f13189t.contains(e.C);
            if (zContains) {
                AtomicLong atomicLong = this.D;
                if (atomicLong.get() > -1) {
                    gd.a aVar2 = new gd.a();
                    aVar2.M = "session_end";
                    Long l = new Long(this.G);
                    if (this.G <= 0) {
                        l = null;
                    }
                    aVar2.f6291c = l;
                    aVar2.f6293e = new Long(atomicLong.get());
                    arrayList.add(aVar2);
                }
            }
            yVar.A = this;
            yVar.B = arrayList;
            yVar.C = j9;
            yVar.D = zContains;
            yVar.G = 1;
            list = arrayList;
            if (h1(j9, yVar) != aVar) {
            }
            return aVar;
        }
        if (i11 == 1) {
            boolean z11 = yVar.D;
            j9 = yVar.C;
            List list3 = yVar.B;
            a0 a0Var2 = yVar.A;
            t1.O(obj);
            list = list3;
            zContains = z11;
            this = a0Var2;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = yVar.D;
            j9 = yVar.C;
            List list4 = yVar.B;
            a0Var = yVar.A;
            t1.O(obj);
            list2 = list4;
        }
        if (z10) {
            gd.a aVar3 = new gd.a();
            aVar3.M = "session_start";
            aVar3.f6291c = new Long(j9);
            aVar3.f6293e = new Long(a0Var.D.get());
            list2.add(aVar3);
        }
        return list2;
        yVar.A = this;
        yVar.B = list;
        yVar.C = j9;
        yVar.D = zContains;
        yVar.G = 2;
        if (this.g1(j9, yVar) != aVar) {
            a0Var = this;
            list2 = list;
            z10 = zContains;
            if (z10) {
                gd.a aVar4 = new gd.a();
                aVar4.M = "session_start";
                aVar4.f6291c = new Long(j9);
                aVar4.f6293e = new Long(a0Var.D.get());
                list2.add(aVar4);
            }
            return list2;
        }
        return aVar;
    }

    public final java.lang.Object j1(long r10, m00.c r12) {
        throw new UnsupportedOperationException("Method not decompiled: rc.a0.j1(long, m00.c):java.lang.Object");
    }
}
