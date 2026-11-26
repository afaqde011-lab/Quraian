package a40;

import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;

public abstract class c0 {
    public static final eh.l a = new eh.l("RESUME_TOKEN", 2);
    public static final eh.l b = new eh.l("REMOVED_TASK", 2);
    public static final eh.l c = new eh.l("CLOSED_EMPTY", 2);
    public static final eh.l d = new eh.l("COMPLETING_ALREADY", 2);
    public static final eh.l e = new eh.l("COMPLETING_WAITING_CHILDREN", 2);
    public static final eh.l f = new eh.l("COMPLETING_RETRY", 2);
    public static final eh.l g = new eh.l("TOO_LATE_TO_CANCEL", 2);
    public static final eh.l h = new eh.l("SEALED", 2);
    public static final q0 i = new q0(false);
    public static final q0 j = new q0(true);

    public static final Object A(Object obj) {
        return obj instanceof s ? ri.t1.s(((s) obj).a) : obj;
    }

    public static final void B(k kVar, k00.c cVar, boolean z) {
        Object obj = k.G.get(kVar);
        Throwable thD = kVar.d(obj);
        Object objS = thD != null ? ri.t1.s(thD) : kVar.f(obj);
        if (!z) {
            cVar.resumeWith(objS);
            return;
        }
        kotlin.jvm.internal.m.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        f40.e eVar = (f40.e) cVar;
        m00.c cVar2 = eVar.E;
        Object obj2 = eVar.G;
        k00.i context = cVar2.getContext();
        Object objN = f40.a.n(context, obj2);
        c2 c2VarI = objN != f40.a.d ? I(cVar2, context, objN) : null;
        try {
            cVar2.resumeWith(objS);
        } finally {
            if (c2VarI == null || c2VarI.l0()) {
                f40.a.g(context, objN);
            }
        }
    }

    public static final Object C(k00.i iVar, u00.n nVar) throws Throwable {
        w0 w0VarA;
        k00.i iVarN;
        Thread threadCurrentThread = Thread.currentThread();
        k00.h hVar = k00.d.A;
        k00.e eVar = (k00.e) iVar.get(hVar);
        k00.j jVar = k00.j.A;
        if (eVar == null) {
            w0VarA = x1.a();
            iVarN = n(jVar, iVar.plus(w0VarA), true);
            h40.e eVar2 = m0.a;
            if (iVarN != eVar2 && iVarN.get(hVar) == null) {
                iVarN = iVarN.plus(eVar2);
            }
        } else {
            if (eVar instanceof w0) {
            }
            w0VarA = (w0) x1.a.get();
            iVarN = n(jVar, iVar, true);
            h40.e eVar3 = m0.a;
            if (iVarN != eVar3 && iVarN.get(hVar) == null) {
                iVarN = iVarN.plus(eVar3);
            }
        }
        f fVar = new f(iVarN, threadCurrentThread, w0VarA);
        fVar.j0(a0.A, fVar, nVar);
        w0 w0Var = fVar.E;
        if (w0Var != null) {
            int i2 = w0.F;
            w0Var.u0(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jV0 = w0Var != null ? w0Var.v0() : Long.MAX_VALUE;
                if (fVar.Q()) {
                    if (w0Var != null) {
                        int i3 = w0.F;
                        w0Var.r0(false);
                    }
                    Object objH = H(m1.A.get(fVar));
                    s sVar = objH instanceof s ? (s) objH : null;
                    if (sVar == null) {
                        return objH;
                    }
                    throw sVar.a;
                }
                LockSupport.parkNanos(fVar, jV0);
            } catch (Throwable th) {
                if (w0Var != null) {
                    int i4 = w0.F;
                    w0Var.r0(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        fVar.q(interruptedException);
        throw interruptedException;
    }

    public static final Object E(z1 z1Var, u00.n nVar) throws Throwable {
        Object sVar;
        Object objT;
        u(z1Var, true, new p0(p(z1Var.D.getContext()).S(z1Var.E, z1Var, z1Var.C), 0));
        try {
            if (nVar instanceof m00.a) {
                kotlin.jvm.internal.d0.d(2, nVar);
                sVar = nVar.invoke(z1Var, z1Var);
            } else {
                sVar = qd.s0.u0(nVar, z1Var, z1Var);
            }
        } catch (Throwable th) {
            sVar = new s(th, false);
        }
        l00.a aVar = l00.a.A;
        if (sVar == aVar || (objT = z1Var.T(sVar)) == e) {
            return aVar;
        }
        if (objT instanceof s) {
            Throwable th2 = ((s) objT).a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).A != z1Var) {
                throw th2;
            }
            if (sVar instanceof s) {
                throw ((s) sVar).a;
            }
        } else {
            sVar = H(objT);
        }
        return sVar;
    }

    public static final String F(k00.c cVar) {
        Object objS;
        if (cVar instanceof f40.e) {
            return ((f40.e) cVar).toString();
        }
        try {
            objS = cVar + '@' + q(cVar);
        } catch (Throwable th) {
            objS = ri.t1.s(th);
        }
        if (g00.n.a(objS) != null) {
            objS = cVar.getClass().getName() + '@' + q(cVar);
        }
        return (String) objS;
    }

    public static final long G(long j2) {
        s30.a aVar = s30.b.B;
        boolean z = j2 > 0;
        if (z) {
            return s30.b.e(s30.b.h(j2, g4.c0(999999L, s30.d.NANOSECONDS)));
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }

    public static final Object H(Object obj) {
        b1 b1Var;
        c1 c1Var = obj instanceof c1 ? (c1) obj : null;
        return (c1Var == null || (b1Var = c1Var.a) == null) ? obj : b1Var;
    }

    public static final c2 I(k00.c cVar, k00.i iVar, Object obj) {
        c2 c2Var = null;
        if ((cVar instanceof m00.d) && iVar.get(d2.A) != null) {
            m00.d callerFrame = (m00.d) cVar;
            while (!(callerFrame instanceof j0) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof c2) {
                    c2Var = (c2) callerFrame;
                    break;
                }
            }
            if (c2Var != null) {
                c2Var.n0(iVar, obj);
            }
        }
        return c2Var;
    }

    public static final Object J(u00.n nVar, k00.i iVar, k00.c cVar) {
        Object objH;
        k00.i context = cVar.getContext();
        byte b2 = 0;
        k00.i iVarPlus = !((Boolean) iVar.fold(Boolean.FALSE, new t(b2, b2))).booleanValue() ? context.plus(iVar) : n(context, iVar, false);
        m(iVarPlus);
        if (iVarPlus == context) {
            f40.p pVar = new f40.p(cVar, iVarPlus);
            objH = z3.S(pVar, pVar, nVar);
        } else {
            k00.d dVar = k00.d.A;
            if (kotlin.jvm.internal.m.a(iVarPlus.get(dVar), context.get(dVar))) {
                c2 c2Var = new c2(cVar, iVarPlus);
                k00.i iVar2 = c2Var.C;
                Object objN = f40.a.n(iVar2, null);
                try {
                    objH = z3.S(c2Var, c2Var, nVar);
                    f40.a.g(iVar2, objN);
                } catch (Throwable th) {
                    f40.a.g(iVar2, objN);
                    throw th;
                }
            } else {
                j0 j0Var = new j0(cVar, iVarPlus);
                try {
                    f40.a.h(g00.b0.a, qd.s0.j0(qd.s0.Z(j0Var, j0Var, nVar)));
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j0.E;
                    do {
                        int i2 = atomicIntegerFieldUpdater.get(j0Var);
                        if (i2 != 0) {
                            if (i2 != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            objH = H(m1.A.get(j0Var));
                            if (objH instanceof s) {
                                throw ((s) objH).a;
                            }
                        }
                    } while (!atomicIntegerFieldUpdater.compareAndSet(j0Var, 0, 1));
                    objH = l00.a.A;
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof DispatchException) {
                        th = ((DispatchException) th).A;
                    }
                    j0Var.resumeWith(ri.t1.s(th));
                    throw th;
                }
            }
        }
        l00.a aVar = l00.a.A;
        return objH;
    }

    public static final Object K(long j2, u00.n nVar, m00.c cVar) throws Throwable {
        if (j2 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately", null);
        }
        Object objE = E(new z1(j2, cVar), nVar);
        l00.a aVar = l00.a.A;
        return objE;
    }

    public static final Object L(long j2, u00.n nVar, k00.c cVar) throws Throwable {
        a2 a2Var;
        kotlin.jvm.internal.z zVar;
        if (cVar instanceof a2) {
            a2Var = (a2) cVar;
            int i2 = a2Var.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a2Var.C = i2 - Integer.MIN_VALUE;
            } else {
                a2Var = new a2(cVar);
            }
        } else {
            a2Var = new a2(cVar);
        }
        Object obj = a2Var.B;
        l00.a aVar = l00.a.A;
        int i3 = a2Var.C;
        if (i3 == 0) {
            ri.t1.O(obj);
            if (j2 <= 0) {
                return null;
            }
            kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
            try {
                a2Var.A = zVar2;
                a2Var.C = 1;
                z1 z1Var = new z1(j2, a2Var);
                zVar2.A = z1Var;
                Object objE = E(z1Var, nVar);
                return objE == aVar ? aVar : objE;
            } catch (TimeoutCancellationException e2) {
                e = e2;
                zVar = zVar2;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = a2Var.A;
            try {
                ri.t1.O(obj);
                return obj;
            } catch (TimeoutCancellationException e3) {
                e = e3;
            }
        }
        if (e.A == zVar.A) {
            return null;
        }
        throw e;
    }

    public static final Object M(m00.c cVar) {
        Object obj;
        k00.i context = cVar.getContext();
        m(context);
        k00.c cVarJ0 = qd.s0.j0(cVar);
        f40.e eVar = cVarJ0 instanceof f40.e ? (f40.e) cVarJ0 : null;
        g00.b0 b0Var = g00.b0.a;
        if (eVar == null) {
            obj = b0Var;
        } else {
            v vVar = eVar.D;
            if (f40.a.j(vVar, context)) {
                eVar.F = b0Var;
                eVar.C = 1;
                vVar.o0(context, eVar);
            } else {
                f2 f2Var = new f2(f2.C);
                k00.i iVarPlus = context.plus(f2Var);
                eVar.F = b0Var;
                eVar.C = 1;
                vVar.o0(iVarPlus, eVar);
                if (f2Var.B) {
                    w0 w0VarA = x1.a();
                    h00.m mVar = w0VarA.E;
                    if (mVar != null ? mVar.isEmpty() : true) {
                        obj = b0Var;
                    } else {
                        if (w0VarA.C >= 4294967296L) {
                            eVar.F = b0Var;
                            eVar.C = 1;
                            w0VarA.s0(eVar);
                            obj = l00.a.A;
                        } else {
                            w0VarA.u0(true);
                            try {
                                eVar.run();
                                do {
                                } while (w0VarA.w0());
                            } catch (Throwable th) {
                                try {
                                    eVar.i(th);
                                } catch (Throwable th2) {
                                    w0VarA.r0(true);
                                    throw th2;
                                }
                            }
                            w0VarA.r0(true);
                            obj = b0Var;
                        }
                    }
                }
            }
            obj = l00.a.A;
        }
        return obj == l00.a.A ? obj : b0Var;
    }

    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static q b() {
        q qVar = new q(true);
        qVar.N(null);
        return qVar;
    }

    public static final f40.c c(k00.i iVar) {
        if (iVar.get(w.B) == null) {
            iVar = iVar.plus(d());
        }
        return new f40.c(iVar);
    }

    public static f1 d() {
        return new f1(null);
    }

    public static w1 e() {
        return new w1(null);
    }

    public static final g0 f(z zVar, k00.i iVar, a0 a0Var, u00.n nVar) {
        k00.i iVarZ = z(zVar, iVar);
        a0Var.getClass();
        g0 n1Var = a0Var == a0.B ? new n1(iVarZ, nVar) : new g0(iVarZ, true);
        n1Var.j0(a0Var, n1Var, nVar);
        return n1Var;
    }

    public static g0 g(z zVar, b40.c cVar, u00.n nVar, int i2) {
        k00.i iVar = cVar;
        if ((i2 & 1) != 0) {
            iVar = k00.j.A;
        }
        return f(zVar, iVar, a0.A, nVar);
    }

    public static final void h(m00.c cVar) {
        i0 i0Var;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i2 = i0Var.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i0Var.B = i2 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(cVar);
            }
        } else {
            i0Var = new i0(cVar);
        }
        Object obj = i0Var.A;
        l00.a aVar = l00.a.A;
        int i3 = i0Var.B;
        if (i3 == 0) {
            ri.t1.O(obj);
            i0Var.B = 1;
            k kVar = new k(1, qd.s0.j0(i0Var));
            kVar.r();
            if (kVar.q() == aVar) {
                return;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
        }
        throw new KotlinNothingValueException();
    }

    public static final void i(z zVar, CancellationException cancellationException) {
        e1 e1Var = (e1) zVar.A().get(w.B);
        if (e1Var != null) {
            e1Var.i(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + zVar).toString());
        }
    }

    public static final void j(k00.i iVar, CancellationException cancellationException) {
        e1 e1Var = (e1) iVar.get(w.B);
        if (e1Var != null) {
            e1Var.i(cancellationException);
        }
    }

    public static final Object k(u00.n nVar, k00.c cVar) {
        f40.p pVar = new f40.p(cVar, cVar.getContext());
        Object objS = z3.S(pVar, pVar, nVar);
        l00.a aVar = l00.a.A;
        return objS;
    }

    public static final Object l(long j2, k00.c cVar) {
        if (j2 > 0) {
            k kVar = new k(1, qd.s0.j0(cVar));
            kVar.r();
            if (j2 < Long.MAX_VALUE) {
                p(kVar.E).A(j2, kVar);
            }
            Object objQ = kVar.q();
            if (objQ == l00.a.A) {
                return objQ;
            }
        }
        return g00.b0.a;
    }

    public static final void m(k00.i iVar) {
        e1 e1Var = (e1) iVar.get(w.B);
        if (e1Var != null && !e1Var.a()) {
            throw e1Var.x();
        }
    }

    public static final k00.i n(k00.i iVar, k00.i iVar2, boolean z) {
        Boolean bool = Boolean.FALSE;
        byte b2 = 0;
        boolean zBooleanValue = ((Boolean) iVar.fold(bool, new t(0, b2))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) iVar2.fold(bool, new t(b2, (byte) 0))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return iVar.plus(iVar2);
        }
        t tVar = new t(1, (byte) 0);
        k00.j jVar = k00.j.A;
        k00.i iVar3 = (k00.i) iVar.fold(jVar, tVar);
        Object objFold = iVar2;
        if (zBooleanValue2) {
            objFold = iVar2.fold(jVar, new t(2, (byte) 0));
        }
        return iVar3.plus((k00.i) objFold);
    }

    public static final v o(Executor executor) {
        return new y0(executor);
    }

    public static final h0 p(k00.i iVar) {
        k00.g gVar = iVar.get(k00.d.A);
        h0 h0Var = gVar instanceof h0 ? (h0) gVar : null;
        return h0Var == null ? e0.a : h0Var;
    }

    public static final String q(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final e1 r(k00.i iVar) {
        e1 e1Var = (e1) iVar.get(w.B);
        if (e1Var != null) {
            return e1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + iVar).toString());
    }

    public static final k s(k00.c cVar) {
        k kVar;
        k kVar2;
        if (!(cVar instanceof f40.e)) {
            return new k(1, cVar);
        }
        f40.e eVar = (f40.e) cVar;
        eh.l lVar = f40.a.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40.e.H;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(eVar);
            kVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(eVar, lVar);
                kVar2 = null;
                break;
            }
            if (obj instanceof k) {
                if (atomicReferenceFieldUpdater.compareAndSet(eVar, obj, lVar)) {
                    kVar2 = (k) obj;
                    break;
                }
            } else if (obj != lVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (kVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k.G;
            Object obj2 = atomicReferenceFieldUpdater2.get(kVar2);
            if (!(obj2 instanceof r) || ((r) obj2).d == null) {
                k.F.set(kVar2, 536870911);
                atomicReferenceFieldUpdater2.set(kVar2, b.A);
                kVar = kVar2;
            } else {
                kVar2.n();
            }
            if (kVar != null) {
                return kVar;
            }
        }
        return new k(2, cVar);
    }

    public static final void t(Throwable th, k00.i iVar) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).A;
        }
        try {
            x xVar = (x) iVar.get(w.A);
            if (xVar != null) {
                xVar.v(th, iVar);
            } else {
                f40.a.d(th, iVar);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                qd.s0.V(runtimeException, th);
                th = runtimeException;
            }
            f40.a.d(th, iVar);
        }
    }

    public static final o0 u(e1 e1Var, boolean z, h1 h1Var) {
        if (e1Var instanceof m1) {
            return ((m1) e1Var).P(z, h1Var);
        }
        return e1Var.O(h1Var.j(), z, new g1(1, h1Var, h1.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0));
    }

    public static final boolean v(z zVar) {
        e1 e1Var = (e1) zVar.A().get(w.B);
        if (e1Var != null) {
            return e1Var.a();
        }
        return true;
    }

    public static final boolean w(k00.i iVar) {
        e1 e1Var = (e1) iVar.get(w.B);
        if (e1Var != null) {
            return e1Var.a();
        }
        return true;
    }

    public static final u1 x(z zVar, k00.i iVar, a0 a0Var, u00.n nVar) {
        k00.i iVarZ = z(zVar, iVar);
        a0Var.getClass();
        u1 o1Var = a0Var == a0.B ? new o1(iVarZ, nVar) : new u1(iVarZ, true);
        o1Var.j0(a0Var, o1Var, nVar);
        return o1Var;
    }

    public static u1 y(z zVar, k00.i iVar, a0 a0Var, u00.n nVar, int i2) {
        if ((i2 & 1) != 0) {
            iVar = k00.j.A;
        }
        if ((i2 & 2) != 0) {
            a0Var = a0.A;
        }
        return x(zVar, iVar, a0Var, nVar);
    }

    public static final k00.i z(z zVar, k00.i iVar) {
        k00.i iVarN = n(zVar.A(), iVar, true);
        h40.e eVar = m0.a;
        return (iVarN == eVar || iVarN.get(k00.d.A) != null) ? iVarN : iVarN.plus(eVar);
    }
}
