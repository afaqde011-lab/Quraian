package a40;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.DispatchException;

public class k extends k0 implements j, m00.d, e2 {
    public static final AtomicIntegerFieldUpdater F = AtomicIntegerFieldUpdater.newUpdater(k.class, "_decisionAndIndex$volatile");
    public static final AtomicReferenceFieldUpdater G = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_state$volatile");
    public static final AtomicReferenceFieldUpdater H = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_parentHandle$volatile");
    public final k00.c D;
    public final k00.i E;
    private volatile int _decisionAndIndex$volatile;
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;

    public k(int i, k00.c cVar) {
        super(i);
        this.D = cVar;
        this.E = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.A;
    }

    public static Object E(s1 s1Var, Object obj, int i, u00.o oVar) {
        if (obj instanceof s) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (oVar != null || (s1Var instanceof i)) {
            return new r(obj, s1Var instanceof i ? (i) s1Var : null, oVar, (Throwable) null, 16);
        }
        return obj;
    }

    public static void z(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        eh.l lVar;
        k00.c cVar = this.D;
        Throwable th = null;
        f40.e eVar = cVar instanceof f40.e ? (f40.e) cVar : null;
        if (eVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40.e.H;
            do {
                Object obj = atomicReferenceFieldUpdater.get(eVar);
                lVar = f40.a.c;
                if (obj != lVar) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    if (!atomicReferenceFieldUpdater.compareAndSet(eVar, obj, null)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    th = (Throwable) obj;
                    break;
                }
            } while (!atomicReferenceFieldUpdater.compareAndSet(eVar, lVar, this));
            if (th == null) {
                return;
            }
            n();
            h(th);
        }
    }

    public final void C(Object obj, int i, u00.o oVar) throws DispatchException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2;
        do {
            atomicReferenceFieldUpdater = G;
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof s1)) {
                if (obj2 instanceof l) {
                    l lVar = (l) obj2;
                    if (l.c.compareAndSet(lVar, 0, 1)) {
                        if (oVar != null) {
                            l(oVar, lVar.a, obj);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
        } while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E((s1) obj2, obj, i, oVar)));
        if (!y()) {
            n();
        }
        o(i);
    }

    public final void D(v vVar, Object obj) throws DispatchException {
        k00.c cVar = this.D;
        f40.e eVar = cVar instanceof f40.e ? (f40.e) cVar : null;
        C(obj, (eVar != null ? eVar.D : null) == vVar ? 4 : this.C, null);
    }

    public final eh.l F(Object obj, u00.o oVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2;
        eh.l lVar = c0.a;
        do {
            atomicReferenceFieldUpdater = G;
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof s1)) {
                return null;
            }
        } while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, E((s1) obj2, obj, this.C, oVar)));
        if (!y()) {
            n();
        }
        return lVar;
    }

    @Override
    public final void a(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = G;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof s1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof s) {
                return;
            }
            if (obj instanceof r) {
                r rVar = (r) obj;
                if (rVar.e != null) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, r.a(rVar, null, cancellationException, 15))) {
                    i iVar = rVar.b;
                    if (iVar != null) {
                        k(iVar, cancellationException);
                    }
                    u00.o oVar = rVar.c;
                    if (oVar != null) {
                        l(oVar, cancellationException, rVar.a);
                        return;
                    }
                    return;
                }
                cancellationException2 = cancellationException;
            } else {
                cancellationException2 = cancellationException;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, new r(obj, (i) null, (u00.o) null, cancellationException2, 14))) {
                    return;
                }
            }
            cancellationException = cancellationException2;
        }
    }

    @Override
    public final void b(f40.q qVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = F;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        v(qVar);
    }

    @Override
    public final k00.c c() {
        return this.D;
    }

    @Override
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override
    public final void e(Object obj, u00.o oVar) throws DispatchException {
        C(obj, this.C, oVar);
    }

    @Override
    public final Object f(Object obj) {
        return obj instanceof r ? ((r) obj).a : obj;
    }

    @Override
    public final eh.l g(Object obj, u00.o oVar) {
        return F(obj, oVar);
    }

    @Override
    public final m00.d getCallerFrame() {
        k00.c cVar = this.D;
        if (cVar instanceof m00.d) {
            return (m00.d) cVar;
        }
        return null;
    }

    @Override
    public final k00.i getContext() {
        return this.E;
    }

    @Override
    public final boolean h(Throwable th) throws DispatchException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        boolean z;
        Throwable cancellationException;
        do {
            atomicReferenceFieldUpdater = G;
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof s1)) {
                return false;
            }
            z = (obj instanceof i) || (obj instanceof f40.q);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
        } while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, new l(cancellationException, z)));
        s1 s1Var = (s1) obj;
        if (s1Var instanceof i) {
            k((i) obj, th);
        } else if (s1Var instanceof f40.q) {
            m((f40.q) obj, th);
        }
        if (!y()) {
            n();
        }
        o(this.C);
        return true;
    }

    @Override
    public final Object j() {
        return G.get(this);
    }

    public final void k(i iVar, Throwable th) {
        try {
            iVar.a(th);
        } catch (Throwable th2) {
            c0.t(new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2), this.E);
        }
    }

    public final void l(u00.o oVar, Throwable th, Object obj) {
        k00.i iVar = this.E;
        try {
            oVar.invoke(th, obj, iVar);
        } catch (Throwable th2) {
            c0.t(new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2), iVar);
        }
    }

    public final void m(f40.q qVar, Throwable th) {
        k00.i iVar = this.E;
        int i = F.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            qVar.h(i, iVar);
        } catch (Throwable th2) {
            c0.t(new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2), iVar);
        }
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = H;
        o0 o0Var = (o0) atomicReferenceFieldUpdater.get(this);
        if (o0Var == null) {
            return;
        }
        o0Var.dispose();
        atomicReferenceFieldUpdater.set(this, r1.A);
    }

    public final void o(int i) throws DispatchException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = F;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i == 4;
                k00.c cVar = this.D;
                if (!z && (cVar instanceof f40.e)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.C;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        f40.e eVar = (f40.e) cVar;
                        v vVar = eVar.D;
                        k00.i context = eVar.E.getContext();
                        if (f40.a.j(vVar, context)) {
                            f40.a.i(vVar, context, this);
                            return;
                        }
                        w0 w0VarA = x1.a();
                        if (w0VarA.C >= 4294967296L) {
                            w0VarA.s0(this);
                            return;
                        }
                        w0VarA.u0(true);
                        try {
                            c0.B(this, cVar, true);
                            do {
                            } while (w0VarA.w0());
                        } catch (Throwable th) {
                            try {
                                i(th);
                            } finally {
                                w0VarA.r0(true);
                            }
                        }
                        return;
                    }
                }
                c0.B(this, cVar, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable p(m1 m1Var) {
        return m1Var.x();
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        e1 e1Var;
        boolean zY = y();
        do {
            atomicIntegerFieldUpdater = F;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zY) {
                    B();
                }
                Object obj = G.get(this);
                if (obj instanceof s) {
                    throw ((s) obj).a;
                }
                int i3 = this.C;
                if ((i3 != 1 && i3 != 2) || (e1Var = (e1) this.E.get(w.B)) == null || e1Var.a()) {
                    return f(obj);
                }
                CancellationException cancellationExceptionX = e1Var.x();
                a(cancellationExceptionX);
                throw cancellationExceptionX;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((o0) H.get(this)) == null) {
            t();
        }
        if (zY) {
            B();
        }
        return l00.a.A;
    }

    public final void r() {
        o0 o0VarT = t();
        if (o0VarT != null && x()) {
            o0VarT.dispose();
            H.set(this, r1.A);
        }
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable thA = g00.n.a(obj);
        if (thA != null) {
            obj = new s(thA, false);
        }
        C(obj, this.C, null);
    }

    @Override
    public final void s(Object obj) throws DispatchException {
        o(this.C);
    }

    public final o0 t() {
        e1 e1Var = (e1) this.E.get(w.B);
        if (e1Var == null) {
            return null;
        }
        o0 o0VarU = c0.u(e1Var, true, new m(this, 0));
        H.compareAndSet(this, null, o0VarU);
        return o0VarU;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(c0.F(this.D));
        sb.append("){");
        Object obj = G.get(this);
        if (obj instanceof s1) {
            str = "Active";
        } else {
            str = obj instanceof l ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(c0.q(this));
        return sb.toString();
    }

    public final void u(u00.k kVar) {
        v(new h(kVar, 1));
    }

    public final void v(s1 s1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = G;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, s1Var)) {
                    return;
                }
            } else {
                if ((obj instanceof i) || (obj instanceof f40.q)) {
                    z(s1Var, obj);
                    throw null;
                }
                if (obj instanceof s) {
                    s sVar = (s) obj;
                    if (!s.b.compareAndSet(sVar, 0, 1)) {
                        z(s1Var, obj);
                        throw null;
                    }
                    if (obj instanceof l) {
                        Throwable th = sVar.a;
                        if (s1Var instanceof i) {
                            k((i) s1Var, th);
                            return;
                        } else {
                            kotlin.jvm.internal.m.c(s1Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            m((f40.q) s1Var, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj instanceof r) {
                    r rVar = (r) obj;
                    if (rVar.b != null) {
                        z(s1Var, obj);
                        throw null;
                    }
                    if (s1Var instanceof f40.q) {
                        return;
                    }
                    kotlin.jvm.internal.m.c(s1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    i iVar = (i) s1Var;
                    Throwable th2 = rVar.e;
                    if (th2 != null) {
                        k(iVar, th2);
                        return;
                    } else if (atomicReferenceFieldUpdater.compareAndSet(this, obj, r.a(rVar, iVar, null, 29))) {
                        return;
                    }
                } else {
                    if (s1Var instanceof f40.q) {
                        return;
                    }
                    kotlin.jvm.internal.m.c(s1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, new r(obj, (i) s1Var, (u00.o) null, (Throwable) null, 28))) {
                        return;
                    }
                }
            }
        }
    }

    public final boolean w() {
        return G.get(this) instanceof s1;
    }

    public final boolean x() {
        return !(G.get(this) instanceof s1);
    }

    public final boolean y() {
        if (this.C != 2) {
            return false;
        }
        k00.c cVar = this.D;
        kotlin.jvm.internal.m.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return f40.e.H.get((f40.e) cVar) != null;
    }
}
