package i40;

import a40.e2;
import a40.j;
import eh.l;
import f40.q;
import g00.b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.DispatchException;
import qd.s0;
import ri.t1;
import u00.k;
import u00.n;
import u00.o;

public final class e implements a40.i, f, e2 {
    public static final AtomicReferenceFieldUpdater F = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "state$volatile");
    public final k00.i A;
    public Object C;
    private volatile Object state$volatile = h.a;
    public ArrayList B = new ArrayList(2);
    public int D = -1;
    public Object E = h.d;

    public e(k00.i iVar) {
        this.A = iVar;
    }

    @Override
    public final void a(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        do {
            atomicReferenceFieldUpdater = F;
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == h.b) {
                return;
            }
        } while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, h.c));
        ArrayList arrayList = this.B;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a();
        }
        this.E = h.d;
        this.B = null;
    }

    @Override
    public final void b(q qVar, int i) {
        this.C = qVar;
        this.D = i;
    }

    public final Object c(m00.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F;
        Object obj = atomicReferenceFieldUpdater.get(this);
        m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        c cVar2 = (c) obj;
        Object obj2 = this.E;
        ArrayList<c> arrayList = this.B;
        if (arrayList != null) {
            for (c cVar3 : arrayList) {
                if (cVar3 != cVar2) {
                    cVar3.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, h.b);
            this.E = h.d;
            this.B = null;
        }
        Object objInvoke = cVar2.c.invoke(cVar2.a, cVar2.d, obj2);
        m00.d dVar = cVar2.e;
        return cVar2.d == h.e ? ((k) dVar).invoke(cVar) : ((n) dVar).invoke(objInvoke, cVar);
    }

    public final Object d(m00.c cVar) throws DispatchException {
        d dVar;
        Object obj;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i = dVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.D = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object obj2 = dVar.B;
        l00.a aVar = l00.a.A;
        int i2 = dVar.D;
        if (i2 == 0) {
            t1.O(obj2);
            dVar.A = this;
            dVar.D = 1;
            a40.k kVar = new a40.k(1, s0.j0(dVar));
            kVar.r();
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F;
                Object obj3 = atomicReferenceFieldUpdater.get(this);
                obj = b0.a;
                l lVar = h.a;
                if (obj3 == lVar) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, kVar)) {
                        kVar.v(this);
                        break;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        if (!(obj3 instanceof c)) {
                            throw new IllegalStateException(("unexpected state: " + obj3).toString());
                        }
                        c cVar2 = (c) obj3;
                        Object obj4 = this.E;
                        o oVar = cVar2.f;
                        kVar.e(obj, oVar != null ? (o) oVar.invoke(this, cVar2.d, obj4) : null);
                        break;
                    }
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, lVar)) {
                        Iterator it = ((Iterable) obj3).iterator();
                        while (it.hasNext()) {
                            c cVarE = e(it.next());
                            m.b(cVarE);
                            cVarE.g = null;
                            cVarE.h = -1;
                            f(cVarE, true);
                        }
                    }
                }
            }
            Object objQ = kVar.q();
            if (objQ == l00.a.A) {
                obj = objQ;
            }
            if (obj != aVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj2);
            return obj2;
        }
        this = dVar.A;
        t1.O(obj2);
        dVar.A = null;
        dVar.D = 2;
        Object objC = this.c(dVar);
        return objC == aVar ? aVar : objC;
    }

    public final c e(Object obj) {
        ArrayList arrayList = this.B;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        for (Object obj3 : arrayList) {
            if (((c) obj3).a == obj) {
                obj2 = obj3;
                break;
            }
        }
        c cVar = (c) obj2;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void f(c cVar, boolean z) {
        Object obj = cVar.a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F;
        if (atomicReferenceFieldUpdater.get(this) instanceof c) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.B;
            m.b(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((c) it.next()).a == obj) {
                        throw new IllegalStateException(g4.c.h(obj, "Cannot use select clauses on the same object: ").toString());
                    }
                }
            }
        }
        cVar.b.invoke(obj, this, cVar.d);
        if (this.E != h.d) {
            atomicReferenceFieldUpdater.set(this, cVar);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.B;
            m.b(arrayList2);
            arrayList2.add(cVar);
        }
        cVar.g = this.C;
        cVar.h = this.D;
        this.C = null;
        this.D = -1;
    }

    public final int g(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof j) {
                c cVarE = e(obj);
                if (cVarE != null) {
                    o oVar = cVarE.f;
                    o oVar2 = oVar != null ? (o) oVar.invoke(this, cVarE.d, obj2) : null;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, cVarE)) {
                        j jVar = (j) obj3;
                        this.E = obj2;
                        l lVarG = jVar.g(b0.a, oVar2);
                        if (lVarG == null) {
                            this.E = h.d;
                            return 2;
                        }
                        jVar.s(lVarG);
                        return 0;
                    }
                } else {
                    continue;
                }
            } else {
                if (m.a(obj3, h.b) || (obj3 instanceof c)) {
                    return 3;
                }
                if (m.a(obj3, h.c)) {
                    return 2;
                }
                if (m.a(obj3, h.a)) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, va.a.R(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, h00.q.Z0(obj, (Collection) obj3))) {
                        return 1;
                    }
                }
            }
        }
    }
}
