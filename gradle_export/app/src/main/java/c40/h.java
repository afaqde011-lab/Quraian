package c40;

import a40.c0;
import a40.e2;
import g00.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.d0;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import qd.s0;
import ri.t1;

public class h implements l {
    public static final AtomicLongFieldUpdater B = AtomicLongFieldUpdater.newUpdater(h.class, "sendersAndCloseStatus$volatile");
    public static final AtomicLongFieldUpdater C = AtomicLongFieldUpdater.newUpdater(h.class, "receivers$volatile");
    public static final AtomicLongFieldUpdater D = AtomicLongFieldUpdater.newUpdater(h.class, "bufferEnd$volatile");
    public static final AtomicLongFieldUpdater E = AtomicLongFieldUpdater.newUpdater(h.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final AtomicReferenceFieldUpdater F = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "sendSegment$volatile");
    public static final AtomicReferenceFieldUpdater G = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "receiveSegment$volatile");
    public static final AtomicReferenceFieldUpdater H = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "bufferEndSegment$volatile");
    public static final AtomicReferenceFieldUpdater I = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_closeCause$volatile");
    public static final AtomicReferenceFieldUpdater J = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "closeHandler$volatile");
    public final int A;
    private volatile Object _closeCause$volatile;
    private volatile long bufferEnd$volatile;
    private volatile Object bufferEndSegment$volatile;
    private volatile Object closeHandler$volatile;
    private volatile long completedExpandBuffersAndPauseFlag$volatile;
    private volatile Object receiveSegment$volatile;
    private volatile long receivers$volatile;
    private volatile Object sendSegment$volatile;
    private volatile long sendersAndCloseStatus$volatile;

    public h(int i) {
        this.A = i;
        if (i < 0) {
            throw new IllegalArgumentException(g4.c.i("Invalid channel capacity: ", i, ", should be >=0").toString());
        }
        p pVar = j.a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = D.get(this);
        p pVar2 = new p(0L, null, this, 3);
        this.sendSegment$volatile = pVar2;
        this.receiveSegment$volatile = pVar2;
        if (A()) {
            pVar2 = j.a;
            kotlin.jvm.internal.m.c(pVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = pVar2;
        this._closeCause$volatile = j.s;
    }

    public static Object D(h hVar, m00.c cVar) {
        f fVar;
        p pVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i = fVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.C = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(hVar, cVar);
            }
        } else {
            fVar = new f(hVar, cVar);
        }
        f fVar2 = fVar;
        Object obj = fVar2.A;
        l00.a aVar = l00.a.A;
        int i2 = fVar2.C;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            return ((o) obj).a;
        }
        t1.O(obj);
        p pVar2 = (p) G.get(hVar);
        while (!hVar.x()) {
            long andIncrement = C.getAndIncrement(hVar);
            long j = j.b;
            long j2 = andIncrement / j;
            int i3 = (int) (andIncrement % j);
            if (pVar2.C != j2) {
                p pVarQ = hVar.q(j2, pVar2);
                if (pVarQ == null) {
                    continue;
                } else {
                    pVar = pVarQ;
                }
            } else {
                pVar = pVar2;
            }
            h hVar2 = hVar;
            Object objI = hVar2.I(pVar, i3, andIncrement, null);
            if (objI == j.m) {
                throw new IllegalStateException("unexpected");
            }
            if (objI != j.o) {
                if (objI != j.n) {
                    pVar.b();
                    return objI;
                }
                fVar2.C = 1;
                Object objE = hVar2.E(pVar, i3, andIncrement, fVar2);
                return objE == aVar ? aVar : objE;
            }
            if (andIncrement < hVar2.u()) {
                pVar.b();
            }
            hVar = hVar2;
            pVar2 = pVar;
        }
        return new m(hVar.r());
    }

    public static final p a(h hVar, long j, p pVar) {
        Object objB;
        h hVar2;
        p pVar2 = j.a;
        i iVar = i.A;
        loop0: while (true) {
            objB = f40.a.b(pVar, j, iVar);
            if (!f40.a.e(objB)) {
                f40.q qVarC = f40.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F;
                    f40.q qVar = (f40.q) atomicReferenceFieldUpdater.get(hVar);
                    if (qVar.C >= qVarC.C) {
                        break loop0;
                    }
                    if (!qVarC.j()) {
                        break;
                    }
                    if (atomicReferenceFieldUpdater.compareAndSet(hVar, qVar, qVarC)) {
                        if (!qVar.f()) {
                            break loop0;
                        }
                        qVar.e();
                        break loop0;
                    }
                    if (qVarC.f()) {
                        qVarC.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zE = f40.a.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = C;
        if (zE) {
            hVar.y();
            if (pVar.C * ((long) j.b) < atomicLongFieldUpdater.get(hVar)) {
                pVar.b();
                return null;
            }
        } else {
            p pVar3 = (p) f40.a.c(objB);
            long j2 = pVar3.C;
            if (j2 <= j) {
                return pVar3;
            }
            long j3 = ((long) j.b) * j2;
            while (true) {
                long j4 = B.get(hVar);
                long j5 = 1152921504606846975L & j4;
                if (j5 >= j3) {
                    hVar2 = hVar;
                    break;
                }
                hVar2 = hVar;
                if (B.compareAndSet(hVar2, j4, (((long) ((int) (j4 >> 60))) << 60) + j5)) {
                    break;
                }
                hVar = hVar2;
            }
            if (j2 * ((long) j.b) < atomicLongFieldUpdater.get(hVar2)) {
                pVar3.b();
            }
        }
        return null;
    }

    public static final void e(h hVar, Object obj, a40.k kVar) {
        kVar.resumeWith(t1.s(hVar.t()));
    }

    public static final int g(h hVar, p pVar, int i, Object obj, long j, Object obj2, boolean z) {
        pVar.n(i, obj);
        if (z) {
            return hVar.J(pVar, i, obj, j, obj2, z);
        }
        Object objL = pVar.l(i);
        if (objL == null) {
            if (hVar.h(j)) {
                if (pVar.k(i, null, j.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (pVar.k(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof e2) {
            pVar.n(i, null);
            if (hVar.G(objL, obj)) {
                pVar.o(i, j.i);
                return 0;
            }
            eh.l lVar = j.k;
            if (pVar.F.getAndSet((i * 2) + 1, lVar) == lVar) {
                return 5;
            }
            pVar.m(i, true);
            return 5;
        }
        return hVar.J(pVar, i, obj, j, obj2, z);
    }

    public static void v(h hVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = E;
        if ((atomicLongFieldUpdater.addAndGet(hVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(hVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final boolean A() {
        long j = D.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    public final void B(long j, p pVar) {
        p pVar2;
        p pVar3;
        while (pVar.C < j && (pVar3 = (p) pVar.c()) != null) {
            pVar = pVar3;
        }
        while (true) {
            if (!pVar.d() || (pVar2 = (p) pVar.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = H;
                    f40.q qVar = (f40.q) atomicReferenceFieldUpdater.get(this);
                    if (qVar.C >= pVar.C) {
                        return;
                    }
                    if (!pVar.j()) {
                        break;
                    }
                    if (atomicReferenceFieldUpdater.compareAndSet(this, qVar, pVar)) {
                        if (qVar.f()) {
                            qVar.e();
                            return;
                        }
                        return;
                    } else if (pVar.f()) {
                        pVar.e();
                    }
                }
            } else {
                pVar = pVar2;
            }
        }
    }

    public final Object C(Object obj, k00.c cVar) {
        a40.k kVar = new a40.k(1, s0.j0(cVar));
        kVar.r();
        kVar.resumeWith(t1.s(t()));
        Object objQ = kVar.q();
        return objQ == l00.a.A ? objQ : b0.a;
    }

    public final Object E(p pVar, int i, long j, m00.c cVar) {
        g gVar;
        o oVar;
        p pVar2;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i2 = gVar.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.C = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objQ = gVar.A;
        l00.a aVar = l00.a.A;
        int i3 = gVar.C;
        if (i3 == 0) {
            t1.O(objQ);
            gVar.C = 1;
            a40.k kVarS = c0.s(s0.j0(gVar));
            try {
                u uVar = new u(kVarS);
                Object objI = I(pVar, i, j, uVar);
                if (objI != j.m) {
                    if (objI == j.o) {
                        if (j < u()) {
                            pVar.b();
                        }
                        p pVar3 = (p) G.get(this);
                        while (true) {
                            if (x()) {
                                kVarS.resumeWith(new o(new m(r())));
                                break;
                            }
                            long andIncrement = C.getAndIncrement(this);
                            long j2 = j.b;
                            long j3 = andIncrement / j2;
                            int i4 = (int) (andIncrement % j2);
                            if (pVar3.C != j3) {
                                p pVarQ = q(j3, pVar3);
                                if (pVarQ != null) {
                                    pVar2 = pVarQ;
                                }
                            } else {
                                pVar2 = pVar3;
                            }
                            Object objI2 = I(pVar2, i4, andIncrement, uVar);
                            p pVar4 = pVar2;
                            if (objI2 == j.m) {
                                uVar.b(pVar4, i4);
                                break;
                            }
                            if (objI2 == j.o) {
                                if (andIncrement < u()) {
                                    pVar4.b();
                                }
                                pVar3 = pVar4;
                            } else {
                                if (objI2 == j.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                pVar4.b();
                                oVar = new o(objI2);
                            }
                        }
                    } else {
                        pVar.b();
                        oVar = new o(objI);
                    }
                    kVarS.e(oVar, null);
                    break;
                }
                uVar.b(pVar, i);
                objQ = kVarS.q();
                l00.a aVar2 = l00.a.A;
                if (objQ == aVar) {
                    return aVar;
                }
            } catch (Throwable th) {
                kVarS.B();
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objQ);
        }
        return ((o) objQ).a;
    }

    public final void F(e2 e2Var, boolean z) {
        if (e2Var instanceof a40.j) {
            ((k00.c) e2Var).resumeWith(t1.s(z ? s() : t()));
            return;
        }
        if (e2Var instanceof u) {
            ((u) e2Var).A.resumeWith(new o(new m(r())));
            return;
        }
        if (!(e2Var instanceof c)) {
            if (e2Var instanceof i40.f) {
                ((i40.e) ((i40.f) e2Var)).g(this, j.l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + e2Var).toString());
            }
        }
        c cVar = (c) e2Var;
        a40.k kVar = cVar.B;
        kotlin.jvm.internal.m.b(kVar);
        cVar.B = null;
        cVar.A = j.l;
        Throwable thR = cVar.C.r();
        if (thR == null) {
            kVar.resumeWith(Boolean.FALSE);
        } else {
            kVar.resumeWith(t1.s(thR));
        }
    }

    public final boolean G(Object obj, Object obj2) {
        if (obj instanceof i40.f) {
            return ((i40.e) ((i40.f) obj)).g(this, obj2) == 0;
        }
        if (obj instanceof u) {
            return j.a(((u) obj).A, new o(obj2), null);
        }
        if (!(obj instanceof c)) {
            if (obj instanceof a40.j) {
                return j.a((a40.j) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        c cVar = (c) obj;
        a40.k kVar = cVar.B;
        kotlin.jvm.internal.m.b(kVar);
        cVar.B = null;
        cVar.A = obj2;
        Boolean bool = Boolean.TRUE;
        cVar.C.getClass();
        return j.a(kVar, bool, null);
    }

    public final boolean H(Object obj, p pVar, int i) {
        i40.i iVar;
        boolean z = obj instanceof a40.j;
        b0 b0Var = b0.a;
        if (z) {
            return j.a((a40.j) obj, b0Var, null);
        }
        if (!(obj instanceof i40.f)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        int iG = ((i40.e) obj).g(this, b0Var);
        if (iG == 0) {
            iVar = i40.i.A;
        } else if (iG == 1) {
            iVar = i40.i.B;
        } else if (iG == 2) {
            iVar = i40.i.C;
        } else {
            if (iG != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iG).toString());
            }
            iVar = i40.i.D;
        }
        if (iVar == i40.i.B) {
            pVar.n(i, null);
        }
        return iVar == i40.i.A;
    }

    public final Object I(p pVar, int i, long j, Object obj) {
        Object objL = pVar.l(i);
        AtomicReferenceArray atomicReferenceArray = pVar.F;
        AtomicLongFieldUpdater atomicLongFieldUpdater = B;
        if (objL == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return j.n;
                }
                if (pVar.k(i, objL, obj)) {
                    p();
                    return j.m;
                }
            }
        } else if (objL == j.d && pVar.k(i, objL, j.i)) {
            p();
            Object obj2 = atomicReferenceArray.get(i * 2);
            pVar.n(i, null);
            return obj2;
        }
        while (true) {
            Object objL2 = pVar.l(i);
            if (objL2 == null || objL2 == j.e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (pVar.k(i, objL2, j.h)) {
                        p();
                        return j.o;
                    }
                } else {
                    if (obj == null) {
                        return j.n;
                    }
                    if (pVar.k(i, objL2, obj)) {
                        p();
                        return j.m;
                    }
                }
            } else {
                if (objL2 != j.d) {
                    eh.l lVar = j.j;
                    if (objL2 != lVar && objL2 != j.h) {
                        if (objL2 == j.l) {
                            p();
                            return j.o;
                        }
                        if (objL2 != j.g && pVar.k(i, objL2, j.f)) {
                            boolean z = objL2 instanceof x;
                            if (z) {
                                objL2 = ((x) objL2).a;
                            }
                            if (H(objL2, pVar, i)) {
                                pVar.o(i, j.i);
                                p();
                                Object obj3 = atomicReferenceArray.get(i * 2);
                                pVar.n(i, null);
                                return obj3;
                            }
                            pVar.o(i, lVar);
                            pVar.i();
                            if (z) {
                                p();
                            }
                            return j.o;
                        }
                    }
                    return j.o;
                }
                if (pVar.k(i, objL2, j.i)) {
                    p();
                    Object obj4 = atomicReferenceArray.get(i * 2);
                    pVar.n(i, null);
                    return obj4;
                }
            }
        }
    }

    public final int J(p pVar, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objL = pVar.l(i);
            if (objL == null) {
                if (!h(j) || z) {
                    if (z) {
                        if (pVar.k(i, null, j.j)) {
                            pVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (pVar.k(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (pVar.k(i, null, j.d)) {
                    break;
                }
            } else {
                if (objL != j.e) {
                    eh.l lVar = j.k;
                    if (objL == lVar) {
                        pVar.n(i, null);
                        return 5;
                    }
                    if (objL == j.h) {
                        pVar.n(i, null);
                        return 5;
                    }
                    if (objL == j.l) {
                        pVar.n(i, null);
                        y();
                        return 4;
                    }
                    pVar.n(i, null);
                    if (objL instanceof x) {
                        objL = ((x) objL).a;
                    }
                    if (G(objL, obj)) {
                        pVar.o(i, j.i);
                        return 0;
                    }
                    if (pVar.F.getAndSet((i * 2) + 1, lVar) != lVar) {
                        pVar.m(i, true);
                    }
                    return 5;
                }
                if (pVar.k(i, objL, j.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void K(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        h hVar = this;
        if (hVar.A()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = D;
            if (atomicLongFieldUpdater.get(hVar) > j) {
                break;
            } else {
                hVar = this;
            }
        }
        int i = j.c;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = E;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(hVar);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(hVar)) && j2 == atomicLongFieldUpdater.get(hVar)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(hVar);
                    if (atomicLongFieldUpdater2.compareAndSet(hVar, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        hVar = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(hVar);
                    long j5 = atomicLongFieldUpdater2.get(hVar);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(hVar)) {
                        break;
                    }
                    if (z) {
                        hVar = this;
                    } else {
                        hVar = this;
                        atomicLongFieldUpdater2.compareAndSet(hVar, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(hVar);
                    if (atomicLongFieldUpdater2.compareAndSet(hVar, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        hVar = this;
                    }
                }
            }
        }
    }

    @Override
    public final h7.b b() {
        d0.d(3, d.A);
        d0.d(3, e.A);
        d dVar = d.A;
        e eVar = e.A;
        h7.b bVar = new h7.b();
        bVar.A = this;
        bVar.B = null;
        return bVar;
    }

    @Override
    public final Object c() {
        p pVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = C;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = B.get(this);
        if (w(true, j2)) {
            return new m(r());
        }
        long j3 = j2 & 1152921504606846975L;
        n nVar = o.b;
        if (j >= j3) {
            return nVar;
        }
        e2 e2Var = j.k;
        p pVar2 = (p) G.get(this);
        while (!this.x()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = j.b;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (pVar2.C != j5) {
                p pVarQ = this.q(j5, pVar2);
                if (pVarQ == null) {
                    continue;
                } else {
                    pVar = pVarQ;
                }
            } else {
                pVar = pVar2;
            }
            h hVar = this;
            Object objI = hVar.I(pVar, i, andIncrement, e2Var);
            pVar2 = pVar;
            if (objI == j.m) {
                e2 e2Var2 = e2Var instanceof e2 ? e2Var : null;
                if (e2Var2 != null) {
                    e2Var2.b(pVar2, i);
                }
                hVar.K(andIncrement);
                pVar2.i();
                return nVar;
            }
            if (objI != j.o) {
                if (objI == j.n) {
                    throw new IllegalStateException("unexpected");
                }
                pVar2.b();
                return objI;
            }
            if (andIncrement < hVar.u()) {
                pVar2.b();
            }
            this = hVar;
        }
        return new m(this.r());
    }

    @Override
    public final Object d(e40.k kVar) {
        return D(this, kVar);
    }

    @Override
    public final boolean f(Throwable th) {
        return l(th, false);
    }

    public final boolean h(long j) {
        return j < D.get(this) || j < C.get(this) + ((long) this.A);
    }

    @Override
    public final void i(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        l(cancellationException, true);
    }

    @Override
    public final c iterator() {
        return new c(this);
    }

    @Override
    public Object j(Object obj) {
        int iG;
        b0 b0Var;
        e2 e2Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = B;
        long j = atomicLongFieldUpdater.get(this);
        boolean z = false;
        long j2 = 1152921504606846975L;
        boolean z2 = w(false, j) ? false : !h(j & 1152921504606846975L);
        n nVar = o.b;
        if (z2) {
            return nVar;
        }
        e2 e2Var2 = j.j;
        p pVar = (p) F.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean zW = w(z, andIncrement);
            int i = j.b;
            long j4 = i;
            long j5 = j3 / j4;
            int i2 = (int) (j3 % j4);
            if (pVar.C == j5) {
                iG = g(this, pVar, i2, obj, j3, e2Var2, zW);
                b0Var = b0.a;
                if (iG != 0) {
                    pVar.b();
                    return b0Var;
                }
                if (iG != 1) {
                    return b0Var;
                }
                if (iG != 2) {
                    if (zW) {
                        pVar.i();
                        return new m(t());
                    }
                    if (e2Var2 instanceof e2) {
                        e2Var = e2Var2;
                    } else {
                        e2Var = null;
                    }
                    if (e2Var != null) {
                        e2Var.b(pVar, i2 + i);
                    }
                    pVar.i();
                    return nVar;
                }
                if (iG != 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iG != 4) {
                    if (j3 < C.get(this)) {
                        pVar.b();
                    }
                    return new m(t());
                }
                if (iG == 5) {
                    pVar.b();
                }
                z = false;
            } else {
                p pVarA = a(this, j5, pVar);
                if (pVarA != null) {
                    pVar = pVarA;
                    iG = g(this, pVar, i2, obj, j3, e2Var2, zW);
                    b0Var = b0.a;
                    if (iG != 0) {
                        pVar.b();
                        return b0Var;
                    }
                    if (iG != 1) {
                        return b0Var;
                    }
                    if (iG != 2) {
                        if (zW) {
                            pVar.i();
                            return new m(t());
                        }
                        if (e2Var2 instanceof e2) {
                            e2Var = e2Var2;
                        } else {
                            e2Var = null;
                        }
                        if (e2Var != null) {
                            e2Var.b(pVar, i2 + i);
                        }
                        pVar.i();
                        return nVar;
                    }
                    if (iG != 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iG != 4) {
                        if (j3 < C.get(this)) {
                            pVar.b();
                        }
                        return new m(t());
                    }
                    if (iG == 5) {
                        pVar.b();
                    }
                    z = false;
                } else {
                    if (zW) {
                        return new m(t());
                    }
                    z = false;
                }
            }
            j2 = 1152921504606846975L;
        }
    }

    @Override
    public final Object k(k00.c cVar) throws Throwable {
        p pVar;
        Throwable th;
        p pVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = G;
        p pVar3 = (p) atomicReferenceFieldUpdater.get(this);
        while (!this.x()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = C;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = j.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (pVar3.C != j2) {
                p pVarQ = this.q(j2, pVar3);
                if (pVarQ == null) {
                    continue;
                } else {
                    pVar = pVarQ;
                }
            } else {
                pVar = pVar3;
            }
            h hVar = this;
            Object objI = hVar.I(pVar, i, andIncrement, null);
            eh.l lVar = j.m;
            if (objI == lVar) {
                throw new IllegalStateException("unexpected");
            }
            eh.l lVar2 = j.o;
            if (objI == lVar2) {
                if (andIncrement < hVar.u()) {
                    pVar.b();
                }
                this = hVar;
                pVar3 = pVar;
            } else {
                if (objI != j.n) {
                    pVar.b();
                    return objI;
                }
                a40.k kVarS = c0.s(s0.j0(cVar));
                try {
                    Object objI2 = hVar.I(pVar, i, andIncrement, kVarS);
                    if (objI2 != lVar) {
                        if (objI2 == lVar2) {
                            if (andIncrement < hVar.u()) {
                                pVar.b();
                            }
                            p pVar4 = (p) atomicReferenceFieldUpdater.get(hVar);
                            while (true) {
                                if (hVar.x()) {
                                    kVarS.resumeWith(t1.s(hVar.s()));
                                    break;
                                }
                                a40.k kVar = kVarS;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(hVar);
                                    long j3 = j.b;
                                    long j4 = andIncrement2 / j3;
                                    int i2 = (int) (andIncrement2 % j3);
                                    if (pVar4.C != j4) {
                                        try {
                                            p pVarQ2 = hVar.q(j4, pVar4);
                                            if (pVarQ2 == null) {
                                                kVarS = kVar;
                                            } else {
                                                pVar2 = pVarQ2;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            kVarS = kVar;
                                            kVarS.B();
                                            throw th;
                                        }
                                    } else {
                                        pVar2 = pVar4;
                                    }
                                    h hVar2 = hVar;
                                    objI2 = hVar2.I(pVar2, i2, andIncrement2, kVar);
                                    hVar = hVar2;
                                    p pVar5 = pVar2;
                                    kVarS = kVar;
                                    if (objI2 == j.m) {
                                        kVarS.b(pVar5, i2);
                                        break;
                                    }
                                    if (objI2 == j.o) {
                                        if (andIncrement2 < hVar.u()) {
                                            pVar5.b();
                                        }
                                        pVar4 = pVar5;
                                    } else {
                                        if (objI2 == j.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        pVar5.b();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    kVarS = kVar;
                                    th = th;
                                    kVarS.B();
                                    throw th;
                                }
                            }
                        } else {
                            pVar.b();
                        }
                        kVarS.e(objI2, null);
                        break;
                    }
                    kVarS.b(pVar, i);
                    Object objQ = kVarS.q();
                    l00.a aVar = l00.a.A;
                    return objQ;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thS = this.s();
        int i3 = f40.r.a;
        throw thS;
    }

    public final boolean l(Throwable th, boolean z) {
        h hVar;
        long j;
        long j2;
        long j3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = B;
        if (!z) {
            hVar = this;
            break;
        }
        while (true) {
            long j5 = atomicLongFieldUpdater.get(this);
            if (((int) (j5 >> 60)) != 0) {
                hVar = this;
                break;
            }
            p pVar = j.a;
            hVar = this;
            if (atomicLongFieldUpdater.compareAndSet(hVar, j5, (j5 & 1152921504606846975L) + (((long) 1) << 60))) {
                break;
            }
            this = hVar;
        }
        boolean zCompareAndSet = I.compareAndSet(hVar, j.s, th);
        if (z) {
            do {
                j4 = atomicLongFieldUpdater.get(hVar);
            } while (!atomicLongFieldUpdater.compareAndSet(hVar, j4, (j4 & 1152921504606846975L) + (((long) 3) << 60)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(hVar);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = j & 1152921504606846975L;
                    j3 = 2;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = j & 1152921504606846975L;
                    j3 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(hVar, j, (j3 << 60) + j2));
        }
        hVar.y();
        if (zCompareAndSet) {
            do {
                atomicReferenceFieldUpdater = J;
                obj = atomicReferenceFieldUpdater.get(hVar);
            } while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj == null ? j.q : j.r));
            if (obj != null) {
                d0.d(1, obj);
                ((u00.k) obj).invoke(hVar.r());
            }
        }
        return zCompareAndSet;
    }

    @Override
    public Object m(Object obj, k00.c cVar) {
        b0 b0Var;
        Object objQ;
        l00.a aVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = B;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zW = w(false, andIncrement);
            int i = j.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            long j4 = pVar.C;
            b0Var = b0.a;
            if (j4 != j3) {
                p pVarA = a(this, j3, pVar);
                if (pVarA != null) {
                    pVar = pVarA;
                } else if (zW) {
                    Object objC = C(obj, cVar);
                    if (objC == l00.a.A) {
                        return objC;
                    }
                }
            }
            int iG = g(this, pVar, i2, obj, j, null, zW);
            if (iG == 0) {
                pVar.b();
                return b0Var;
            }
            if (iG != 1) {
                if (iG == 2) {
                    if (!zW) {
                        break;
                    }
                    pVar.i();
                    Object objC2 = C(obj, cVar);
                    if (objC2 == l00.a.A) {
                        return objC2;
                    }
                } else {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = C;
                    if (iG == 3) {
                        a40.k kVarS = c0.s(s0.j0(cVar));
                        try {
                            int iG2 = g(this, pVar, i2, obj, j, kVarS, false);
                            if (iG2 != 0) {
                                if (iG2 != 1) {
                                    if (iG2 != 2) {
                                        if (iG2 != 4) {
                                            String str = "unexpected";
                                            if (iG2 != 5) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            pVar.b();
                                            p pVar2 = (p) atomicReferenceFieldUpdater.get(this);
                                            while (true) {
                                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                                long j5 = andIncrement2 & 1152921504606846975L;
                                                boolean zW2 = w(false, andIncrement2);
                                                int i3 = j.b;
                                                str = str;
                                                long j6 = i3;
                                                atomicLongFieldUpdater2 = atomicLongFieldUpdater2;
                                                long j7 = j5 / j6;
                                                int i4 = (int) (j5 % j6);
                                                if (pVar2.C != j7) {
                                                    p pVarA2 = a(this, j7, pVar2);
                                                    if (pVarA2 != null) {
                                                        pVar2 = pVarA2;
                                                    } else if (zW2) {
                                                    }
                                                }
                                                int iG3 = g(this, pVar2, i4, obj, j5, kVarS, zW2);
                                                if (iG3 == 0) {
                                                    pVar2.b();
                                                } else if (iG3 != 1) {
                                                    if (iG3 == 2) {
                                                        if (!zW2) {
                                                            kVarS.b(pVar2, i4 + i3);
                                                            break;
                                                        }
                                                        pVar2.i();
                                                    } else {
                                                        if (iG3 == 3) {
                                                            throw new IllegalStateException(str);
                                                        }
                                                        if (iG3 != 4) {
                                                            if (iG3 == 5) {
                                                                pVar2.b();
                                                            }
                                                        } else if (j5 < atomicLongFieldUpdater2.get(this)) {
                                                            pVar2.b();
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (j < atomicLongFieldUpdater2.get(this)) {
                                            pVar.b();
                                        }
                                        e(this, obj, kVarS);
                                        break;
                                    } else {
                                        kVarS.b(pVar, i2 + i);
                                    }
                                }
                                objQ = kVarS.q();
                                aVar = l00.a.A;
                                if (objQ != aVar) {
                                    objQ = b0Var;
                                }
                                if (objQ == aVar) {
                                    return objQ;
                                }
                            } else {
                                pVar.b();
                            }
                            kVarS.resumeWith(b0Var);
                            objQ = kVarS.q();
                            aVar = l00.a.A;
                            if (objQ != aVar) {
                                objQ = b0Var;
                            }
                            if (objQ == aVar) {
                                return objQ;
                            }
                        } catch (Throwable th) {
                            kVarS.B();
                            throw th;
                        }
                    } else if (iG == 4) {
                        if (j < atomicLongFieldUpdater2.get(this)) {
                            pVar.b();
                        }
                        Object objC3 = C(obj, cVar);
                        if (objC3 == l00.a.A) {
                            return objC3;
                        }
                    } else if (iG == 5) {
                        pVar.b();
                    }
                }
            } else {
                break;
            }
        }
        return b0Var;
    }

    public final p n(long j) {
        Object objF;
        long j2;
        Object obj = H.get(this);
        p pVar = (p) F.get(this);
        if (pVar.C > ((p) obj).C) {
            obj = pVar;
        }
        p pVar2 = (p) G.get(this);
        if (pVar2.C > ((p) obj).C) {
            obj = pVar2;
        }
        f40.b bVar = (f40.b) obj;
        while (true) {
            bVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40.b.A;
            Object obj2 = atomicReferenceFieldUpdater.get(bVar);
            eh.l lVar = f40.a.a;
            objF = null;
            if (obj2 == lVar) {
                break;
            }
            f40.b bVar2 = (f40.b) obj2;
            if (bVar2 == null) {
                if (atomicReferenceFieldUpdater.compareAndSet(bVar, null, lVar)) {
                    break;
                }
            } else {
                bVar = bVar2;
            }
        }
        p pVar3 = (p) bVar;
        if (z()) {
            p pVar4 = pVar3;
            loop1: while (true) {
                int i = j.b - 1;
                while (true) {
                    if (-1 < i) {
                        j2 = (pVar4.C * ((long) j.b)) + ((long) i);
                        if (j2 >= C.get(this)) {
                            while (true) {
                                Object objL = pVar4.l(i);
                                if (objL != null && objL != j.e) {
                                    if (objL != j.d) {
                                        break;
                                    }
                                    break loop1;
                                }
                                if (pVar4.k(i, objL, j.l)) {
                                    pVar4.i();
                                    break;
                                }
                            }
                            i--;
                        }
                    } else {
                        pVar4 = (p) ((f40.b) f40.b.B.get(pVar4));
                        if (pVar4 == null) {
                        }
                    }
                    j2 = -1;
                    break;
                }
            }
            if (j2 != -1) {
                o(j2);
            }
        }
        loop4: for (p pVar5 = pVar3; pVar5 != null; pVar5 = (p) ((f40.b) f40.b.B.get(pVar5))) {
            for (int i2 = j.b - 1; -1 < i2; i2--) {
                if ((pVar5.C * ((long) j.b)) + ((long) i2) < j) {
                    break loop4;
                }
                while (true) {
                    Object objL2 = pVar5.l(i2);
                    if (objL2 != null && objL2 != j.e) {
                        if (!(objL2 instanceof x)) {
                            if (!(objL2 instanceof e2)) {
                                break;
                            }
                            if (pVar5.k(i2, objL2, j.l)) {
                                objF = f40.a.f(objF, objL2);
                                pVar5.m(i2, true);
                                break;
                            }
                        } else {
                            if (pVar5.k(i2, objL2, j.l)) {
                                objF = f40.a.f(objF, ((x) objL2).a);
                                pVar5.m(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (pVar5.k(i2, objL2, j.l)) {
                            pVar5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (objF != null) {
            if (!(objF instanceof ArrayList)) {
                F((e2) objF, true);
                return pVar3;
            }
            ArrayList arrayList = (ArrayList) objF;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                F((e2) arrayList.get(size), true);
            }
        }
        return pVar3;
    }

    public final void o(long j) {
        p pVar = (p) G.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = C;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.A) + j2, D.get(this))) {
                return;
            }
            this = this;
            if (atomicLongFieldUpdater.compareAndSet(this, j2, 1 + j2)) {
                long j3 = j.b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (pVar.C != j4) {
                    p pVarQ = this.q(j4, pVar);
                    if (pVarQ != null) {
                        pVar = pVarQ;
                    }
                }
                p pVar2 = pVar;
                if (this.I(pVar2, i, j2, null) != j.o || j2 < this.u()) {
                    pVar2.b();
                }
                pVar = pVar2;
            }
        }
    }

    public final void p() {
        Object objB;
        if (A()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = H;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = D.getAndIncrement(this);
            long j = andIncrement / ((long) j.b);
            if (u() <= andIncrement) {
                if (pVar.C < j && pVar.c() != null) {
                    B(j, pVar);
                }
                v(this);
                return;
            }
            if (pVar.C != j) {
                i iVar = i.A;
                while (true) {
                    objB = f40.a.b(pVar, j, iVar);
                    if (!f40.a.e(objB)) {
                        f40.q qVarC = f40.a.c(objB);
                        while (true) {
                            f40.q qVar = (f40.q) atomicReferenceFieldUpdater.get(this);
                            if (qVar.C >= qVarC.C) {
                                break;
                            }
                            if (!qVarC.j()) {
                                break;
                            }
                            if (atomicReferenceFieldUpdater.compareAndSet(this, qVar, qVarC)) {
                                if (!qVar.f()) {
                                    break;
                                }
                                qVar.e();
                                break;
                            } else if (qVarC.f()) {
                                qVarC.e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                p pVar2 = null;
                if (f40.a.e(objB)) {
                    y();
                    B(j, pVar);
                    v(this);
                } else {
                    p pVar3 = (p) f40.a.c(objB);
                    long j2 = pVar3.C;
                    if (j2 > j) {
                        long j3 = j2 * ((long) j.b);
                        if (D.compareAndSet(this, 1 + andIncrement, j3)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = E;
                            if ((atomicLongFieldUpdater.addAndGet(this, j3 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            v(this);
                        }
                    } else {
                        pVar2 = pVar3;
                    }
                }
                if (pVar2 == null) {
                    continue;
                } else {
                    pVar = pVar2;
                }
            }
            int i = (int) (andIncrement % ((long) j.b));
            Object objL = pVar.l(i);
            boolean z = objL instanceof e2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = C;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !pVar.k(i, objL, j.g)) {
                while (true) {
                    Object objL2 = pVar.l(i);
                    if (objL2 instanceof e2) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (pVar.k(i, objL2, new x((e2) objL2))) {
                                v(this);
                                return;
                            }
                        } else if (pVar.k(i, objL2, j.g)) {
                            if (!H(objL2, pVar, i)) {
                                pVar.o(i, j.j);
                                pVar.i();
                                break;
                            } else {
                                pVar.o(i, j.d);
                                v(this);
                                return;
                            }
                        }
                    } else {
                        if (objL2 == j.j) {
                            break;
                        }
                        if (objL2 == null) {
                            if (pVar.k(i, objL2, j.e)) {
                                v(this);
                                return;
                            }
                        } else if (objL2 == j.d || objL2 == j.h || objL2 == j.i || objL2 == j.k || objL2 == j.l) {
                            v(this);
                            return;
                        } else if (objL2 != j.f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objL2).toString());
                        }
                    }
                }
                v(this);
            } else if (H(objL, pVar, i)) {
                pVar.o(i, j.d);
                v(this);
                return;
            } else {
                pVar.o(i, j.j);
                pVar.i();
                v(this);
            }
        }
    }

    public final p q(long j, p pVar) {
        Object objB;
        h hVar;
        p pVar2 = j.a;
        i iVar = i.A;
        loop0: while (true) {
            objB = f40.a.b(pVar, j, iVar);
            if (!f40.a.e(objB)) {
                f40.q qVarC = f40.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = G;
                    f40.q qVar = (f40.q) atomicReferenceFieldUpdater.get(this);
                    if (qVar.C >= qVarC.C) {
                        break loop0;
                    }
                    if (!qVarC.j()) {
                        break;
                    }
                    if (atomicReferenceFieldUpdater.compareAndSet(this, qVar, qVarC)) {
                        if (!qVar.f()) {
                            break loop0;
                        }
                        qVar.e();
                        break loop0;
                    }
                    if (qVarC.f()) {
                        qVarC.e();
                    }
                }
            } else {
                break;
            }
        }
        if (f40.a.e(objB)) {
            y();
            if (pVar.C * ((long) j.b) < u()) {
                pVar.b();
                return null;
            }
        } else {
            p pVar3 = (p) f40.a.c(objB);
            long j2 = pVar3.C;
            if (!A() && j <= D.get(this) / ((long) j.b)) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = H;
                    f40.q qVar2 = (f40.q) atomicReferenceFieldUpdater2.get(this);
                    if (qVar2.C >= j2 || !pVar3.j()) {
                        break;
                    }
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, qVar2, pVar3)) {
                        if (!qVar2.f()) {
                            break;
                        }
                        qVar2.e();
                        break;
                    }
                    if (pVar3.f()) {
                        pVar3.e();
                    }
                }
            }
            if (j2 <= j) {
                return pVar3;
            }
            long j3 = j2 * ((long) j.b);
            while (true) {
                long j4 = C.get(this);
                if (j4 >= j3) {
                    hVar = this;
                    break;
                }
                hVar = this;
                if (C.compareAndSet(hVar, j4, j3)) {
                    break;
                }
                this = hVar;
            }
            if (j2 * ((long) j.b) < hVar.u()) {
                pVar3.b();
            }
        }
        return null;
    }

    public final Throwable r() {
        return (Throwable) I.get(this);
    }

    public final Throwable s() {
        Throwable thR = r();
        return thR == null ? new ClosedReceiveChannelException("Channel was closed") : thR;
    }

    public final Throwable t() {
        Throwable thR = r();
        return thR == null ? new ClosedSendChannelException("Channel was closed") : thR;
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i = (int) (B.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.A + ',');
        sb.append("data=[");
        int i2 = 0;
        List listS = va.a.S(new p[]{G.get(this), F.get(this), H.get(this)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listS) {
            if (((p) obj) != j.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((p) next).C;
            do {
                Object next2 = it.next();
                long j2 = ((p) next2).C;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        p pVar = (p) next;
        long j3 = C.get(this);
        long jU = u();
        loop2: while (true) {
            int i3 = j.b;
            for (int i4 = i2; i4 < i3; i4++) {
                long j4 = (pVar.C * ((long) j.b)) + ((long) i4);
                if (j4 >= jU && j4 >= j3) {
                    break loop2;
                }
                Object objL = pVar.l(i4);
                Object obj2 = pVar.F.get(i4 * 2);
                if (objL instanceof a40.j) {
                    string = (j4 >= j3 || j4 < jU) ? (j4 >= jU || j4 < j3) ? "cont" : "send" : "receive";
                } else if (objL instanceof i40.f) {
                    string = (j4 >= j3 || j4 < jU) ? (j4 >= jU || j4 < j3) ? "select" : "onSend" : "onReceive";
                } else if (objL instanceof u) {
                    string = "receiveCatching";
                } else if (objL instanceof x) {
                    string = "EB(" + objL + ')';
                } else if (kotlin.jvm.internal.m.a(objL, j.f) || kotlin.jvm.internal.m.a(objL, j.g)) {
                    string = "resuming_sender";
                } else {
                    if (objL != null && !objL.equals(j.e) && !objL.equals(j.i) && !objL.equals(j.h) && !objL.equals(j.k) && !objL.equals(j.j) && !objL.equals(j.l)) {
                        string = objL.toString();
                    }
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            pVar = (p) pVar.c();
            if (pVar == null) {
                break;
            }
            i2 = 0;
        }
        if (r30.k.M0(sb) == ',') {
            kotlin.jvm.internal.m.d(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final long u() {
        return B.get(this) & 1152921504606846975L;
    }

    public final boolean w(boolean z, long j) {
        int i = (int) (j >> 60);
        if (i != 0 && i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = C;
            if (i == 2) {
                n(1152921504606846975L & j);
                if (z) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = G;
                        p pVarQ = (p) atomicReferenceFieldUpdater.get(this);
                        long j2 = atomicLongFieldUpdater.get(this);
                        if (u() <= j2) {
                            break;
                        }
                        long j3 = j.b;
                        long j4 = j2 / j3;
                        if (pVarQ.C != j4 && (pVarQ = q(j4, pVarQ)) == null) {
                            if (((p) atomicReferenceFieldUpdater.get(this)).C < j4) {
                                break;
                            }
                        } else {
                            pVarQ.b();
                            int i2 = (int) (j2 % j3);
                            while (true) {
                                Object objL = pVarQ.l(i2);
                                if (objL != null && objL != j.e) {
                                    if (objL != j.d && (objL == j.j || objL == j.l || objL == j.i || objL == j.h || (objL != j.g && (objL == j.f || j2 != atomicLongFieldUpdater.get(this))))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (pVarQ.k(i2, objL, j.h)) {
                                    p();
                                    break;
                                }
                            }
                            C.compareAndSet(this, j2, j2 + 1);
                        }
                    }
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException(g4.c.f(i, "unexpected close status: ").toString());
                }
                p pVarN = n(1152921504606846975L & j);
                Object objF = null;
                loop0: do {
                    for (int i3 = j.b - 1; -1 < i3; i3--) {
                        long j5 = (pVarN.C * ((long) j.b)) + ((long) i3);
                        while (true) {
                            Object objL2 = pVarN.l(i3);
                            if (objL2 == j.i) {
                                break loop0;
                            }
                            if (objL2 != j.d) {
                                if (objL2 != j.e && objL2 != null) {
                                    if (!(objL2 instanceof e2) && !(objL2 instanceof x)) {
                                        eh.l lVar = j.g;
                                        if (objL2 == lVar || objL2 == j.f) {
                                            break loop0;
                                        }
                                        if (objL2 != lVar) {
                                            break;
                                        }
                                    } else {
                                        if (j5 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        e2 e2Var = objL2 instanceof x ? ((x) objL2).a : (e2) objL2;
                                        if (pVarN.k(i3, objL2, j.l)) {
                                            objF = f40.a.f(objF, e2Var);
                                            pVarN.n(i3, null);
                                            pVarN.i();
                                            break;
                                        }
                                    }
                                } else {
                                    if (pVarN.k(i3, objL2, j.l)) {
                                        pVarN.i();
                                        break;
                                    }
                                }
                            } else {
                                if (j5 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (pVarN.k(i3, objL2, j.l)) {
                                    pVarN.n(i3, null);
                                    pVarN.i();
                                    break;
                                }
                            }
                        }
                    }
                    pVarN = (p) ((f40.b) f40.b.B.get(pVarN));
                } while (pVarN != null);
                if (objF != null) {
                    if (objF instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objF;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            F((e2) arrayList.get(size), false);
                        }
                    } else {
                        F((e2) objF, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean x() {
        return w(true, B.get(this));
    }

    public final boolean y() {
        return w(false, B.get(this));
    }

    public boolean z() {
        return false;
    }
}
