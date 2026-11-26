package d4;

import com.google.android.gms.internal.measurement.x5;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import kh.v;

public abstract class g implements v {
    public static final boolean D = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger E = Logger.getLogger(g.class.getName());
    public static final a.a F;
    public static final Object G;
    public volatile Object A;
    public volatile c B;
    public volatile f C;

    static {
        a.a eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "C"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "B"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "A"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            eVar = new e();
        }
        F = eVar;
        if (th != null) {
            E.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        G = new Object();
    }

    public static void e(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.C;
        } while (!F.l(gVar, fVar, f.f4606c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f4607a;
            if (thread != null) {
                fVar.f4607a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f4608b;
        }
        gVar.d();
        do {
            cVar2 = gVar.B;
        } while (!F.j(gVar, cVar2, c.f4597d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.f4600c;
            cVar.f4600c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.f4600c;
            f(cVar3.f4598a, cVar3.f4599b);
            cVar3 = cVar4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e3) {
            E.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e3);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th2 = ((a) obj).f4595b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f4596a);
        }
        if (obj == G) {
            return null;
        }
        return obj;
    }

    public static Object h(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.B;
        c cVar2 = c.f4597d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f4600c = cVar;
                if (F.j(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.B;
                }
            } while (cVar != cVar2);
        }
        f(runnable, executor);
    }

    public final void b(StringBuilder sb2) {
        try {
            Object objH = h(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objH == this ? "this future" : String.valueOf(objH));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e3.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        }
    }

    @Override
    public final boolean cancel(boolean z10) {
        a aVar;
        Object obj = this.A;
        if (obj != null) {
            return false;
        }
        if (D) {
            aVar = new a(new CancellationException("Future.cancel() was called."), z10);
        } else {
            aVar = z10 ? a.f4592c : a.f4593d;
        }
        if (!F.k(this, obj, aVar)) {
            return false;
        }
        e(this);
        return true;
    }

    public void d() {
    }

    @Override
    public final Object get() throws InterruptedException {
        Object obj;
        f fVar = f.f4606c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.A;
        if (obj2 != null) {
            return g(obj2);
        }
        f fVar2 = this.C;
        if (fVar2 != fVar) {
            f fVar3 = new f();
            do {
                a.a aVar = F;
                aVar.V(fVar3, fVar2);
                if (aVar.l(this, fVar2, fVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            j(fVar3);
                            throw new InterruptedException();
                        }
                        obj = this.A;
                    } while (obj == null);
                    return g(obj);
                }
                fVar2 = this.C;
            } while (fVar2 != fVar);
        }
        return g(this.A);
    }

    @Override
    public final Object get(long j9, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        f fVar = f.f4606c;
        long nanos = timeUnit.toNanos(j9);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.A;
        if (obj != null) {
            return g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar2 = this.C;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                while (true) {
                    a.a aVar = F;
                    aVar.V(fVar3, fVar2);
                    if (aVar.l(this, fVar2, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                j(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.A;
                            if (obj2 != null) {
                                return g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        j(fVar3);
                        break;
                    }
                    fVar2 = this.C;
                    if (fVar2 == fVar) {
                    }
                }
            }
            return g(this.A);
        }
        while (nanos > 0) {
            Object obj3 = this.A;
            if (obj3 != null) {
                return g(obj3);
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
        if (nanos + 1000 < 0) {
            String strJ = w.c.j(string3, " (plus ");
            long j10 = -nanos;
            long jConvert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(jConvert);
            boolean z10 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strJ2 = strJ + jConvert + " " + lowerCase;
                if (z10) {
                    strJ2 = w.c.j(strJ2, ",");
                }
                strJ = w.c.j(strJ2, " ");
            }
            if (z10) {
                strJ = strJ + nanos2 + " nanoseconds ";
            }
            string3 = w.c.j(strJ, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(w.c.j(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(x5.m(string3, " for ", string));
    }

    public String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override
    public final boolean isCancelled() {
        return this.A instanceof a;
    }

    @Override
    public final boolean isDone() {
        return this.A != null;
    }

    public final void j(f fVar) {
        fVar.f4607a = null;
        while (true) {
            f fVar2 = this.C;
            if (fVar2 == f.f4606c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f4608b;
                if (fVar2.f4607a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f4608b = fVar4;
                    if (fVar3.f4607a == null) {
                    }
                } else if (!F.l(this, fVar2, fVar4)) {
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    public boolean k(Object obj) {
        if (obj == null) {
            obj = G;
        }
        if (!F.k(this, null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    public boolean l(Throwable th2) {
        th2.getClass();
        if (!F.k(this, null, new b(th2))) {
            return false;
        }
        e(this);
        return true;
    }

    public final String toString() {
        String strI;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.A instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                strI = i();
            } catch (RuntimeException e3) {
                strI = "Exception thrown from implementation: " + e3.getClass();
            }
            if (strI != null && !strI.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(strI);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
