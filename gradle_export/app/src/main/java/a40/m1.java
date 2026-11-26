package a40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

public class m1 implements e1, t1 {
    public static final AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(m1.class, Object.class, "_state$volatile");
    public static final AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(m1.class, Object.class, "_parentHandle$volatile");
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;

    public m1(boolean z) {
        this._state$volatile = z ? c0.j : c0.i;
    }

    public static o V(f40.i iVar) {
        while (iVar.h()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40.i.B;
            f40.i iVarE = iVar.e();
            if (iVarE == null) {
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                while (true) {
                    iVar = (f40.i) obj;
                    if (!iVar.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVar);
                }
            } else {
                iVar = iVarE;
            }
        }
        while (true) {
            iVar = iVar.g();
            if (!iVar.h()) {
                if (iVar instanceof o) {
                    return (o) iVar;
                }
                if (iVar instanceof p1) {
                    return null;
                }
            }
        }
    }

    public static String d0(Object obj) {
        if (!(obj instanceof k1)) {
            if (obj instanceof b1) {
                return ((b1) obj).a() ? "Active" : "New";
            }
            return obj instanceof s ? "Cancelled" : "Completed";
        }
        k1 k1Var = (k1) obj;
        if (k1Var.e()) {
            return "Cancelling";
        }
        return k1.B.get(k1Var) == 1 ? "Completing" : "Active";
    }

    public final Throwable B(Object obj) {
        Throwable thD;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        m1 m1Var = (m1) ((t1) obj);
        Object obj2 = A.get(m1Var);
        if (obj2 instanceof k1) {
            thD = ((k1) obj2).d();
        } else if (obj2 instanceof s) {
            thD = ((s) obj2).a;
        } else {
            if (obj2 instanceof b1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            thD = null;
        }
        CancellationException cancellationException = thD instanceof CancellationException ? (CancellationException) thD : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(d0(obj2)), thD, m1Var) : cancellationException;
    }

    public final Object C(k1 k1Var, Object obj) {
        Throwable thE;
        s sVar = obj instanceof s ? (s) obj : null;
        Throwable th = sVar != null ? sVar.a : null;
        synchronized (k1Var) {
            k1Var.e();
            ArrayList<Throwable> arrayListF = k1Var.f(th);
            thE = E(k1Var, arrayListF);
            if (thE != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                for (Throwable th2 : arrayListF) {
                    if (th2 != thE && th2 != thE && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        qd.s0.V(thE, th2);
                    }
                }
            }
        }
        if (thE != null && thE != th) {
            obj = new s(thE, false);
        }
        if (thE != null && (u(thE) || L(thE))) {
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            s.b.compareAndSet((s) obj, 0, 1);
        }
        X(obj);
        A.compareAndSet(this, k1Var, obj instanceof b1 ? new c1((b1) obj) : obj);
        z(k1Var, obj);
        return obj;
    }

    public final Object D() throws Throwable {
        Object obj = A.get(this);
        if (obj instanceof b1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof s) {
            throw ((s) obj).a;
        }
        return c0.H(obj);
    }

    public final Throwable E(k1 k1Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (k1Var.e()) {
                return new JobCancellationException(w(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    @Override
    public final Object F(m00.c cVar) {
        Object obj;
        g00.b0 b0Var;
        do {
            obj = A.get(this);
            boolean z = obj instanceof b1;
            b0Var = g00.b0.a;
            if (!z) {
                c0.m(cVar.getContext());
                return b0Var;
            }
        } while (c0(obj) < 0);
        k kVar = new k(1, qd.s0.j0(cVar));
        kVar.r();
        kVar.v(new h(c0.u(this, true, new m(kVar, 1)), 2));
        Object objQ = kVar.q();
        l00.a aVar = l00.a.A;
        if (objQ != aVar) {
            objQ = b0Var;
        }
        return objQ == aVar ? objQ : b0Var;
    }

    public boolean H() {
        return true;
    }

    public boolean J() {
        return this instanceof q;
    }

    public final p1 K(b1 b1Var) {
        p1 p1VarC = b1Var.c();
        if (p1VarC != null) {
            return p1VarC;
        }
        if (b1Var instanceof q0) {
            return new p1();
        }
        if (b1Var instanceof h1) {
            a0((h1) b1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + b1Var).toString());
    }

    public boolean L(Throwable th) {
        return false;
    }

    public void M(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public final void N(e1 e1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
        r1 r1Var = r1.A;
        if (e1Var == null) {
            atomicReferenceFieldUpdater.set(this, r1Var);
            return;
        }
        e1Var.start();
        n nVarR = e1Var.r(this);
        atomicReferenceFieldUpdater.set(this, nVarR);
        if (Q()) {
            nVarR.dispose();
            atomicReferenceFieldUpdater.set(this, r1Var);
        }
    }

    @Override
    public final o0 O(boolean z, boolean z2, g1 g1Var) {
        return P(z2, z ? new d1(g1Var) : new p0(g1Var, 1));
    }

    public final o0 P(boolean z, h1 h1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z2;
        boolean zD;
        h1Var.D = this;
        while (true) {
            atomicReferenceFieldUpdater = A;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof q0;
            r1 r1Var = r1.A;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof b1)) {
                    z2 = false;
                    break;
                }
                b1 b1Var = (b1) obj;
                p1 p1VarC = b1Var.c();
                if (p1VarC == null) {
                    a0((h1) obj);
                } else {
                    if (h1Var.j()) {
                        k1 k1Var = b1Var instanceof k1 ? (k1) b1Var : null;
                        Throwable thD = k1Var != null ? k1Var.d() : null;
                        if (thD == null) {
                            zD = p1VarC.d(h1Var, 5);
                        } else if (z) {
                            h1Var.k(thD);
                            return r1Var;
                        }
                    } else {
                        zD = p1VarC.d(h1Var, 1);
                    }
                    if (zD) {
                        break;
                    }
                }
            } else {
                q0 q0Var = (q0) obj;
                boolean z4 = q0Var.A;
                if (!z4) {
                    p1 p1Var = new p1();
                    Object a1Var = p1Var;
                    if (!z4) {
                        a1Var = new a1(p1Var);
                    }
                    atomicReferenceFieldUpdater.compareAndSet(this, q0Var, a1Var);
                } else if (atomicReferenceFieldUpdater.compareAndSet(this, obj, h1Var)) {
                    break;
                }
            }
            return r1Var;
        }
        if (z2) {
            return h1Var;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            s sVar = obj2 instanceof s ? (s) obj2 : null;
            h1Var.k(sVar != null ? sVar.a : null);
        }
        return r1Var;
    }

    public final boolean Q() {
        return !(A.get(this) instanceof b1);
    }

    public boolean R() {
        return this instanceof f;
    }

    public final boolean S(Object obj) {
        Object objE0;
        do {
            objE0 = e0(A.get(this), obj);
            if (objE0 == c0.d) {
                return false;
            }
            if (objE0 == c0.e) {
                return true;
            }
        } while (objE0 == c0.f);
        n(objE0);
        return true;
    }

    public final Object T(Object obj) {
        Object objE0;
        do {
            objE0 = e0(A.get(this), obj);
            if (objE0 == c0.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                s sVar = obj instanceof s ? (s) obj : null;
                throw new IllegalStateException(str, sVar != null ? sVar.a : null);
            }
        } while (objE0 == c0.f);
        return objE0;
    }

    public String U() {
        return getClass().getSimpleName();
    }

    public final void W(p1 p1Var, Throwable th) {
        p1Var.d(new f40.g(4), 4);
        Object obj = f40.i.A.get(p1Var);
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (f40.i iVarG = (f40.i) obj; !iVarG.equals(p1Var); iVarG = iVarG.g()) {
            if ((iVarG instanceof h1) && ((h1) iVarG).j()) {
                try {
                    ((h1) iVarG).k(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        qd.s0.V(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + iVarG + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            M(completionHandlerException);
        }
        u(th);
    }

    public void X(Object obj) {
    }

    public void Y() {
    }

    @Override
    public boolean a() {
        Object obj = A.get(this);
        return (obj instanceof b1) && ((b1) obj).a();
    }

    public final void a0(h1 h1Var) {
        p1 p1Var = new p1();
        h1Var.getClass();
        f40.i.B.set(p1Var, h1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40.i.A;
        atomicReferenceFieldUpdater.set(p1Var, h1Var);
        while (atomicReferenceFieldUpdater.get(h1Var) == h1Var) {
            if (atomicReferenceFieldUpdater.compareAndSet(h1Var, h1Var, p1Var)) {
                p1Var.f(h1Var);
                break;
            }
        }
        A.compareAndSet(this, h1Var, h1Var.g());
    }

    public final int c0(Object obj) {
        boolean z = obj instanceof q0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
        if (z) {
            if (((q0) obj).A) {
                return 0;
            }
            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0.j)) {
                return -1;
            }
            Y();
            return 1;
        }
        if (!(obj instanceof a1)) {
            return 0;
        }
        if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ((a1) obj).A)) {
            return -1;
        }
        Y();
        return 1;
    }

    public final Object e0(Object obj, Object obj2) {
        if (!(obj instanceof b1)) {
            return c0.d;
        }
        if (((obj instanceof q0) || (obj instanceof h1)) && !(obj instanceof o) && !(obj2 instanceof s)) {
            b1 b1Var = (b1) obj;
            if (!A.compareAndSet(this, b1Var, obj2 instanceof b1 ? new c1((b1) obj2) : obj2)) {
                return c0.f;
            }
            X(obj2);
            z(b1Var, obj2);
            return obj2;
        }
        b1 b1Var2 = (b1) obj;
        p1 p1VarK = K(b1Var2);
        if (p1VarK == null) {
            return c0.f;
        }
        k1 k1Var = b1Var2 instanceof k1 ? (k1) b1Var2 : null;
        if (k1Var == null) {
            k1Var = new k1(p1VarK, null);
        }
        synchronized (k1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k1.B;
            if (atomicIntegerFieldUpdater.get(k1Var) == 1) {
                return c0.d;
            }
            atomicIntegerFieldUpdater.set(k1Var, 1);
            if (k1Var != b1Var2 && !A.compareAndSet(this, b1Var2, k1Var)) {
                return c0.f;
            }
            boolean zE = k1Var.e();
            s sVar = obj2 instanceof s ? (s) obj2 : null;
            if (sVar != null) {
                k1Var.b(sVar.a);
            }
            Throwable thD = zE ? null : k1Var.d();
            if (thD != null) {
                W(p1VarK, thD);
            }
            o oVarV = V(p1VarK);
            if (oVarV != null && g0(k1Var, oVarV, obj2)) {
                return c0.e;
            }
            p1VarK.d(new f40.g(2), 2);
            o oVarV2 = V(p1VarK);
            return (oVarV2 == null || !g0(k1Var, oVarV2, obj2)) ? C(k1Var, obj2) : c0.e;
        }
    }

    @Override
    public final o0 f0(u00.k kVar) {
        return P(true, new p0(kVar, 1));
    }

    @Override
    public final Object fold(Object obj, u00.n nVar) {
        return nVar.invoke(obj, this);
    }

    public final boolean g0(k1 k1Var, o oVar, Object obj) {
        while (c0.u(oVar.E, false, new j1(this, k1Var, oVar, obj)) == r1.A) {
            oVar = V(oVar);
            if (oVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final k00.g get(k00.h hVar) {
        return rd.a.C(this, hVar);
    }

    @Override
    public final k00.h getKey() {
        return w.B;
    }

    @Override
    public void i(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(w(), null, this);
        }
        t(cancellationException);
    }

    @Override
    public final boolean isCancelled() {
        Object obj = A.get(this);
        if (obj instanceof s) {
            return true;
        }
        return (obj instanceof k1) && ((k1) obj).e();
    }

    public Object l() {
        return D();
    }

    @Override
    public final k00.i minusKey(k00.h hVar) {
        return rd.a.K(this, hVar);
    }

    public void n(Object obj) {
    }

    public void o(Object obj) {
        n(obj);
    }

    public final Object p(k00.c cVar) throws Throwable {
        Object obj;
        do {
            obj = A.get(this);
            if (!(obj instanceof b1)) {
                if (obj instanceof s) {
                    throw ((s) obj).a;
                }
                return c0.H(obj);
            }
        } while (c0(obj) < 0);
        i1 i1Var = new i1(qd.s0.j0(cVar), this);
        i1Var.r();
        int i = 2;
        i1Var.v(new h(c0.u(this, true, new p0(i1Var, i)), i));
        Object objQ = i1Var.q();
        l00.a aVar = l00.a.A;
        return objQ;
    }

    @Override
    public final k00.i plus(k00.i iVar) {
        return rd.a.P(this, iVar);
    }

    public final boolean q(Object obj) {
        Throwable thB;
        Object obj2;
        boolean z;
        Throwable thD;
        eh.l lVar;
        b1 b1Var;
        p1 p1VarK;
        Object objE0;
        Object objE1 = c0.d;
        if (J()) {
            do {
                Object obj3 = A.get(this);
                if (obj3 instanceof b1) {
                    if (obj3 instanceof k1) {
                        if (k1.B.get((k1) obj3) == 1) {
                        }
                    }
                    objE1 = e0(obj3, new s(B(obj), false));
                }
                objE1 = c0.d;
                break;
            } while (objE1 == c0.f);
            if (objE1 != c0.e) {
                if (objE1 == c0.d) {
                    thB = null;
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof k1) {
                            synchronized (obj2) {
                                if (k1.D.get((k1) obj2) == c0.h) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    lVar = c0.g;
                                } else {
                                    boolean zE = ((k1) obj2).e();
                                    if (thB == null) {
                                        thB = B(obj);
                                    }
                                    ((k1) obj2).b(thB);
                                    thD = zE ? null : ((k1) obj2).d();
                                    if (thD != null) {
                                        W(((k1) obj2).A, thD);
                                    }
                                    lVar = c0.d;
                                }
                            }
                        } else if (obj2 instanceof b1) {
                            if (thB == null) {
                                thB = B(obj);
                            }
                            b1Var = (b1) obj2;
                            if (b1Var.a()) {
                                p1VarK = K(b1Var);
                                if (p1VarK == null && atomicReferenceFieldUpdater.compareAndSet(this, b1Var, new k1(p1VarK, thB))) {
                                    W(p1VarK, thB);
                                    lVar = c0.d;
                                }
                            } else {
                                objE0 = e0(obj2, new s(thB, false));
                                if (objE0 != c0.d) {
                                    throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                                }
                                if (objE0 != c0.f) {
                                    objE1 = objE0;
                                    break;
                                }
                            }
                        } else {
                            lVar = c0.g;
                        }
                        objE1 = lVar;
                        break;
                    }
                }
                if (objE1 != c0.d && objE1 != c0.e) {
                    if (objE1 == c0.g) {
                        return false;
                    }
                    n(objE1);
                    return true;
                }
            }
        } else {
            if (objE1 == c0.d) {
                thB = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A;
                    obj2 = atomicReferenceFieldUpdater2.get(this);
                    if (obj2 instanceof k1) {
                        synchronized (obj2) {
                            if (k1.D.get((k1) obj2) == c0.h) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                lVar = c0.g;
                            } else {
                                boolean zE2 = ((k1) obj2).e();
                                if (thB == null) {
                                    thB = B(obj);
                                }
                                ((k1) obj2).b(thB);
                                if (zE2) {
                                }
                                if (thD != null) {
                                    W(((k1) obj2).A, thD);
                                }
                                lVar = c0.d;
                            }
                        }
                    } else if (obj2 instanceof b1) {
                        if (thB == null) {
                            thB = B(obj);
                        }
                        b1Var = (b1) obj2;
                        if (b1Var.a()) {
                            p1VarK = K(b1Var);
                            if (p1VarK == null) {
                                continue;
                            } else {
                                W(p1VarK, thB);
                                lVar = c0.d;
                            }
                        } else {
                            objE0 = e0(obj2, new s(thB, false));
                            if (objE0 != c0.d) {
                                throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                            }
                            if (objE0 != c0.f) {
                                objE1 = objE0;
                                break;
                            }
                        }
                    } else {
                        lVar = c0.g;
                    }
                    objE1 = lVar;
                    break;
                }
            }
            if (objE1 != c0.d) {
                if (objE1 == c0.g) {
                    return false;
                }
                n(objE1);
                return true;
            }
        }
        return true;
    }

    @Override
    public final n r(m1 m1Var) {
        o oVar = new o(m1Var);
        oVar.D = this;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof q0) {
                q0 q0Var = (q0) obj;
                boolean z = q0Var.A;
                if (!z) {
                    p1 p1Var = new p1();
                    Object a1Var = p1Var;
                    if (!z) {
                        a1Var = new a1(p1Var);
                    }
                    atomicReferenceFieldUpdater.compareAndSet(this, q0Var, a1Var);
                } else if (atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                    break;
                }
            } else {
                boolean z2 = obj instanceof b1;
                r1 r1Var = r1.A;
                Throwable thD = null;
                if (!z2) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    s sVar = obj2 instanceof s ? (s) obj2 : null;
                    oVar.k(sVar != null ? sVar.a : null);
                    return r1Var;
                }
                p1 p1VarC = ((b1) obj).c();
                if (p1VarC != null) {
                    if (p1VarC.d(oVar, 7)) {
                        break;
                    }
                    boolean zD = p1VarC.d(oVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof k1) {
                        thD = ((k1) obj3).d();
                    } else {
                        s sVar2 = obj3 instanceof s ? (s) obj3 : null;
                        if (sVar2 != null) {
                            thD = sVar2.a;
                        }
                    }
                    oVar.k(thD);
                    if (zD) {
                        break;
                    }
                    return r1Var;
                }
                a0((h1) obj);
            }
        }
        return oVar;
    }

    @Override
    public final boolean start() {
        int iC0;
        do {
            iC0 = c0(A.get(this));
            if (iC0 == 0) {
                return false;
            }
        } while (iC0 != 1);
        return true;
    }

    public void t(CancellationException cancellationException) {
        q(cancellationException);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(U() + '{' + d0(A.get(this)) + '}');
        sb.append('@');
        sb.append(c0.q(this));
        return sb.toString();
    }

    public final boolean u(Throwable th) {
        if (R()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        n nVar = (n) B.get(this);
        if (nVar == null || nVar == r1.A) {
            return z;
        }
        return nVar.b(th) || z;
    }

    public String w() {
        return "Job was cancelled";
    }

    @Override
    public final CancellationException x() {
        CancellationException cancellationException;
        Object obj = A.get(this);
        if (!(obj instanceof k1)) {
            if (obj instanceof b1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof s)) {
                return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((s) obj).a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new JobCancellationException(w(), th, this) : cancellationException;
        }
        Throwable thD = ((k1) obj).d();
        if (thD == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thD instanceof CancellationException ? (CancellationException) thD : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = w();
        }
        return new JobCancellationException(strConcat, thD, this);
    }

    public boolean y(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return q(th) && H();
    }

    public final void z(b1 b1Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
        n nVar = (n) atomicReferenceFieldUpdater.get(this);
        if (nVar != null) {
            nVar.dispose();
            atomicReferenceFieldUpdater.set(this, r1.A);
        }
        CompletionHandlerException completionHandlerException = null;
        s sVar = obj instanceof s ? (s) obj : null;
        Throwable th = sVar != null ? sVar.a : null;
        if (b1Var instanceof h1) {
            try {
                ((h1) b1Var).k(th);
                return;
            } catch (Throwable th2) {
                M(new CompletionHandlerException("Exception in completion handler " + b1Var + " for " + this, th2));
                return;
            }
        }
        p1 p1VarC = b1Var.c();
        if (p1VarC != null) {
            p1VarC.d(new f40.g(1), 1);
            Object obj2 = f40.i.A.get(p1VarC);
            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (f40.i iVarG = (f40.i) obj2; !iVarG.equals(p1VarC); iVarG = iVarG.g()) {
                if (iVarG instanceof h1) {
                    try {
                        ((h1) iVarG).k(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            qd.s0.V(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + iVarG + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                M(completionHandlerException);
            }
        }
    }
}
