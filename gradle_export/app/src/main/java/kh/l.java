package kh;

import com.google.android.gms.internal.cast.z3;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class l extends lh.a implements v {
    public static final boolean D;
    public static final z3 E;
    public static final g4 F;
    public static final Object G;
    public volatile Object A;
    public volatile c B;
    public volatile k C;

    static {
        boolean z10;
        Throwable th2;
        g4 fVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        D = z10;
        E = new z3(3, l.class);
        Throwable th3 = null;
        try {
            fVar = new j();
            th2 = null;
        } catch (Error | Exception e3) {
            th2 = e3;
            try {
                fVar = new d(AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, "b"), AtomicReferenceFieldUpdater.newUpdater(l.class, k.class, "C"), AtomicReferenceFieldUpdater.newUpdater(l.class, c.class, "B"), AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "A"));
            } catch (Error | Exception e10) {
                th3 = e10;
                fVar = new f();
            }
        }
        F = fVar;
        if (th3 != null) {
            z3 z3Var = E;
            Logger loggerA = z3Var.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th2);
            z3Var.a().log(level, "SafeAtomicHelper is broken!", th3);
        }
        G = new Object();
    }

    public static void f(l lVar, boolean z10) {
        c cVar = null;
        while (true) {
            for (k kVarI = F.I(lVar); kVarI != null; kVarI = kVarI.f9678b) {
                Thread thread = kVarI.f9677a;
                if (thread != null) {
                    kVarI.f9677a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z10) {
                z10 = false;
            }
            lVar.d();
            c cVar2 = cVar;
            c cVarH = F.H(lVar);
            c cVar3 = cVar2;
            while (cVarH != null) {
                c cVar4 = cVarH.f9668c;
                cVarH.f9668c = cVar3;
                cVar3 = cVarH;
                cVarH = cVar4;
            }
            while (cVar3 != null) {
                cVar = cVar3.f9668c;
                Runnable runnable = cVar3.f9666a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof e) {
                    e eVar = (e) runnable;
                    lVar = eVar.A;
                    if (lVar.A == eVar) {
                        if (F.t(lVar, eVar, i(eVar.B))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = cVar3.f9667b;
                    Objects.requireNonNull(executor);
                    g(runnable, executor);
                }
                cVar3 = cVar;
            }
            return;
        }
    }

    public static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e3) {
            E.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e3);
        }
    }

    public static Object h(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th2 = ((a) obj).f9662b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f9664a);
        }
        if (obj == G) {
            return null;
        }
        return obj;
    }

    public static Object i(v vVar) {
        Object obj;
        Throwable th2;
        if (vVar instanceof g) {
            Object aVar = ((l) vVar).A;
            if (aVar instanceof a) {
                a aVar2 = (a) aVar;
                if (aVar2.f9661a) {
                    aVar = aVar2.f9662b != null ? new a(aVar2.f9662b, false) : a.f9660d;
                }
            }
            Objects.requireNonNull(aVar);
            return aVar;
        }
        if (vVar instanceof lh.a) {
            l lVar = (l) ((lh.a) vVar);
            if (lVar instanceof g) {
                Object obj2 = lVar.A;
                th2 = obj2 instanceof b ? ((b) obj2).f9664a : null;
                if (th2 != null) {
                    return new b(th2);
                }
            } else {
                lVar.getClass();
            }
            if (th2 != null) {
                return new b(th2);
            }
        }
        boolean zIsCancelled = vVar.isCancelled();
        boolean z10 = true;
        if ((!D) && zIsCancelled) {
            a aVar3 = a.f9660d;
            Objects.requireNonNull(aVar3);
            return aVar3;
        }
        boolean z11 = false;
        while (true) {
            try {
                try {
                    obj = vVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z11 = z10;
                } catch (Throwable th3) {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    throw th3;
                }
            } catch (Error | Exception e3) {
                return new b(e3);
            } catch (CancellationException e10) {
                if (zIsCancelled) {
                    return new a(e10, false);
                }
                return new b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + vVar, e10));
            } catch (ExecutionException e11) {
                if (!zIsCancelled) {
                    return new b(e11.getCause());
                }
                return new a(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + vVar, e11), false);
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? G : obj;
        }
        return new a(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + vVar), false);
    }

    @Override
    public void a(Runnable runnable, Executor executor) {
        c cVar;
        c cVar2 = c.f9665d;
        ta.c0.w(executor, "Executor was null.");
        if (!isDone() && (cVar = this.B) != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f9668c = cVar;
                if (F.s(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.B;
                }
            } while (cVar != cVar2);
        }
        g(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (CancellationException unused2) {
                sb2.append("CANCELLED");
                return;
            } catch (ExecutionException e3) {
                sb2.append("FAILURE, cause=[");
                sb2.append(e3.getCause());
                sb2.append("]");
                return;
            } catch (Exception e10) {
                sb2.append("UNKNOWN, cause=[");
                sb2.append(e10.getClass());
                sb2.append(" thrown from get()]");
                return;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        e(obj, sb2);
        sb2.append("]");
    }

    @Override
    public boolean cancel(boolean z10) {
        a aVar;
        Object obj = this.A;
        if (!(obj == null) && !(obj instanceof e)) {
            return false;
        }
        if (D) {
            aVar = new a(new CancellationException("Future.cancel() was called."), z10);
        } else {
            aVar = z10 ? a.f9659c : a.f9660d;
            Objects.requireNonNull(aVar);
        }
        boolean z11 = false;
        while (true) {
            if (F.t(this, obj, aVar)) {
                f(this, z10);
                if (obj instanceof e) {
                    v vVar = ((e) obj).B;
                    if (vVar instanceof g) {
                        this = (l) vVar;
                        obj = this.A;
                        if ((obj == null) | (obj instanceof e)) {
                            z11 = true;
                        }
                    } else {
                        vVar.cancel(z10);
                    }
                }
                return true;
            }
            obj = this.A;
            if (!(obj instanceof e)) {
                return z11;
            }
        }
    }

    public void d() {
    }

    public final void e(Object obj, StringBuilder sb2) {
        if (obj == null) {
            sb2.append("null");
        } else {
            if (obj == this) {
                sb2.append("this future");
                return;
            }
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override
    public Object get() throws InterruptedException {
        Object obj;
        k kVar = k.f9676c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.A;
        if ((obj2 != null) && (!(obj2 instanceof e))) {
            return h(obj2);
        }
        k kVar2 = this.C;
        if (kVar2 != kVar) {
            k kVar3 = new k();
            do {
                g4 g4Var = F;
                g4Var.Y(kVar3, kVar2);
                if (g4Var.u(this, kVar2, kVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            k(kVar3);
                            throw new InterruptedException();
                        }
                        obj = this.A;
                    } while (!((obj != null) & (!(obj instanceof e))));
                    return h(obj);
                }
                kVar2 = this.C;
            } while (kVar2 != kVar);
        }
        Object obj3 = this.A;
        Objects.requireNonNull(obj3);
        return h(obj3);
    }

    @Override
    public Object get(long j9, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z10;
        long j10;
        k kVar = k.f9676c;
        long nanos = timeUnit.toNanos(j9);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.A;
        if ((obj != null) && (!(obj instanceof e))) {
            return h(obj);
        }
        long j11 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            k kVar2 = this.C;
            if (kVar2 != kVar) {
                k kVar3 = new k();
                z10 = true;
                while (true) {
                    g4 g4Var = F;
                    g4Var.Y(kVar3, kVar2);
                    if (g4Var.u(this, kVar2, kVar3)) {
                        j10 = j11;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                k(kVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.A;
                            if ((obj2 != null) && (!(obj2 instanceof e))) {
                                return h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        k(kVar3);
                        break;
                    }
                    long j12 = j11;
                    kVar2 = this.C;
                    if (kVar2 != kVar) {
                        j11 = j12;
                    }
                }
            }
            Object obj3 = this.A;
            Objects.requireNonNull(obj3);
            return h(obj3);
        }
        z10 = true;
        j10 = 0;
        while (nanos > j10) {
            Object obj4 = this.A;
            if ((obj4 != null ? z10 : false) && (!(obj4 instanceof e))) {
                return h(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbN = w.c.n("Waited ", j9, " ");
        sbN.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbN.toString();
        if (nanos + 1000 < j10) {
            String strJ = w.c.j(string3, " (plus ");
            long j13 = -nanos;
            long jConvert = timeUnit.convert(j13, TimeUnit.NANOSECONDS);
            long nanos2 = j13 - timeUnit.toNanos(jConvert);
            boolean z11 = (jConvert == j10 || nanos2 > 1000) ? z10 : false;
            if (jConvert > j10) {
                String strJ2 = strJ + jConvert + " " + lowerCase;
                if (z11) {
                    strJ2 = w.c.j(strJ2, ",");
                }
                strJ = w.c.j(strJ2, " ");
            }
            if (z11) {
                strJ = strJ + nanos2 + " nanoseconds ";
            }
            string3 = w.c.j(strJ, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(w.c.j(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(x5.m(string3, " for ", string));
    }

    public boolean isCancelled() {
        return this.A instanceof a;
    }

    @Override
    public boolean isDone() {
        Object obj = this.A;
        return (!(obj instanceof e)) & (obj != null);
    }

    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void k(k kVar) {
        kVar.f9677a = null;
        while (true) {
            k kVar2 = this.C;
            if (kVar2 == k.f9676c) {
                return;
            }
            k kVar3 = null;
            while (kVar2 != null) {
                k kVar4 = kVar2.f9678b;
                if (kVar2.f9677a != null) {
                    kVar3 = kVar2;
                } else if (kVar3 != null) {
                    kVar3.f9678b = kVar4;
                    if (kVar3.f9677a == null) {
                    }
                } else if (!F.u(this, kVar2, kVar4)) {
                }
                kVar2 = kVar4;
            }
            return;
        }
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = G;
        }
        if (!F.t(this, null, obj)) {
            return false;
        }
        f(this, false);
        return true;
    }

    public boolean m(Throwable th2) {
        th2.getClass();
        if (!F.t(this, null, new b(th2))) {
            return false;
        }
        f(this, false);
        return true;
    }

    public boolean n(v vVar) {
        b bVar;
        vVar.getClass();
        Object obj = this.A;
        if (obj != null) {
            if (obj instanceof a) {
                vVar.cancel(((a) obj).f9661a);
            }
        } else if (vVar.isDone()) {
            if (F.t(this, null, i(vVar))) {
                f(this, false);
                return true;
            }
        } else {
            e eVar = new e(this, vVar);
            if (F.t(this, null, eVar)) {
                try {
                    vVar.a(eVar, p.A);
                    return true;
                } catch (Throwable th2) {
                    try {
                        bVar = new b(th2);
                    } catch (Error | Exception unused) {
                        bVar = b.f9663b;
                    }
                    F.t(this, eVar, bVar);
                    return true;
                }
            }
            obj = this.A;
            if (obj instanceof a) {
                vVar.cancel(((a) obj).f9661a);
            }
        }
        return false;
    }

    public final String toString() {
        String strJ;
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            int length = sb2.length();
            sb2.append("PENDING");
            Object obj = this.A;
            if (obj instanceof e) {
                sb2.append(", setFuture=[");
                v vVar = ((e) obj).B;
                try {
                    if (vVar == this) {
                        sb2.append("this future");
                    } else {
                        sb2.append(vVar);
                    }
                } catch (Exception | StackOverflowError e3) {
                    sb2.append("Exception thrown from implementation: ");
                    sb2.append(e3.getClass());
                }
                sb2.append("]");
            } else {
                try {
                    strJ = j();
                    if (strJ == null || strJ.isEmpty()) {
                        strJ = null;
                    }
                } catch (Exception | StackOverflowError e10) {
                    strJ = "Exception thrown from implementation: " + e10.getClass();
                }
                if (strJ != null) {
                    sb2.append(", info=[");
                    sb2.append(strJ);
                    sb2.append("]");
                }
            }
            if (isDone()) {
                sb2.delete(length, sb2.length());
                b(sb2);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
