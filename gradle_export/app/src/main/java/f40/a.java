package f40;

import a40.c0;
import a40.c2;
import a40.e1;
import a40.w0;
import a40.x;
import a40.x1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import qd.s0;
import ri.t1;

public abstract class a {
    public static final eh.l a = new eh.l("CLOSED", 2);
    public static final eh.l b = new eh.l("UNDEFINED", 2);
    public static final eh.l c = new eh.l("REUSABLE_CLAIMED", 2);
    public static final eh.l d = new eh.l("NO_THREAD_ELEMENTS", 2);
    public static final dm.a e = new dm.a(24);
    public static final dm.a f = new dm.a(25);
    public static final dm.a g = new dm.a(26);

    public static final void a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(g4.c.f(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(q qVar, long j, u00.n nVar) {
        while (true) {
            if (qVar.C >= j && !qVar.d()) {
                return qVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.A;
            Object obj = atomicReferenceFieldUpdater.get(qVar);
            eh.l lVar = a;
            if (obj == lVar) {
                return lVar;
            }
            q qVar2 = (q) ((b) obj);
            if (qVar2 == null) {
                qVar2 = (q) nVar.invoke(Long.valueOf(qVar.C + 1), qVar);
                if (atomicReferenceFieldUpdater.compareAndSet(qVar, null, qVar2)) {
                    if (qVar.d()) {
                        qVar.e();
                    }
                }
            }
            qVar = qVar2;
        }
    }

    public static final q c(Object obj) {
        if (obj != a) {
            return (q) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(Throwable th, k00.i iVar) {
        Throwable runtimeException;
        Iterator it = d.a.iterator();
        while (it.hasNext()) {
            try {
                ((x) it.next()).v(th, iVar);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    s0.V(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            s0.V(th, new DiagnosticCoroutineContextException(iVar));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == a;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(k00.i iVar, Object obj) {
        if (obj == d) {
            return;
        }
        if (!(obj instanceof w)) {
            Object objFold = iVar.fold(null, f);
            kotlin.jvm.internal.m.c(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((t) objFold).b(obj);
            return;
        }
        w wVar = (w) obj;
        t[] tVarArr = wVar.c;
        int length = tVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            t tVar = tVarArr[length];
            kotlin.jvm.internal.m.b(tVar);
            tVar.b(wVar.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final void h(Object obj, k00.c cVar) throws DispatchException {
        if (!(cVar instanceof e)) {
            cVar.resumeWith(obj);
            return;
        }
        e eVar = (e) cVar;
        a40.v vVar = eVar.D;
        m00.c cVar2 = eVar.E;
        Throwable thA = g00.n.a(obj);
        Object sVar = thA == null ? obj : new a40.s(thA, false);
        if (j(vVar, cVar2.getContext())) {
            eVar.F = sVar;
            eVar.C = 1;
            i(vVar, cVar2.getContext(), eVar);
            return;
        }
        w0 w0VarA = x1.a();
        if (w0VarA.C >= 4294967296L) {
            eVar.F = sVar;
            eVar.C = 1;
            w0VarA.s0(eVar);
            return;
        }
        w0VarA.u0(true);
        try {
            e1 e1Var = (e1) cVar2.getContext().get(a40.w.B);
            if (e1Var == null || e1Var.a()) {
                Object obj2 = eVar.G;
                k00.i context = cVar2.getContext();
                Object objN = n(context, obj2);
                c2 c2VarI = objN != d ? c0.I(cVar2, context, objN) : null;
                try {
                    cVar2.resumeWith(obj);
                    if (c2VarI == null || c2VarI.l0()) {
                        g(context, objN);
                    }
                } catch (Throwable th) {
                    if (c2VarI == null || c2VarI.l0()) {
                        g(context, objN);
                    }
                    throw th;
                }
            } else {
                eVar.resumeWith(t1.s(e1Var.x()));
            }
            while (w0VarA.w0()) {
            }
        } catch (Throwable th2) {
            try {
                eVar.i(th2);
            } finally {
                w0VarA.r0(true);
            }
        }
    }

    public static final void i(a40.v vVar, k00.i iVar, Runnable runnable) throws DispatchException {
        try {
            vVar.n0(iVar, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, vVar, iVar);
        }
    }

    public static final boolean j(a40.v vVar, k00.i iVar) throws DispatchException {
        try {
            return vVar.p0(iVar);
        } catch (Throwable th) {
            throw new DispatchException(th, vVar, iVar);
        }
    }

    public static final long k(String str, long j, long j2, long j3) {
        String property;
        int i = s.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lZ0 = r30.r.z0(property);
        if (lZ0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lZ0.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int l(int i, String str, int i2) {
        return (int) k(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object m(k00.i iVar) {
        Object objFold = iVar.fold(0, e);
        kotlin.jvm.internal.m.b(objFold);
        return objFold;
    }

    public static final Object n(k00.i iVar, Object obj) {
        if (obj == null) {
            obj = m(iVar);
        }
        if (obj == 0) {
            return d;
        }
        return obj instanceof Integer ? iVar.fold(new w(((Number) obj).intValue(), iVar), g) : ((t) obj).c(iVar);
    }
}
