package l1;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

public final class k1 {

    public final p f9880a;

    public final n f9881b;

    public final g0 f9882c;

    public final u00.n f9883d;

    public final boolean f9884e;

    public final a30.x f9885f;

    public final Object f9886g;

    public final AtomicReference f9887h = new AtomicReference(l1.C);

    public long f9888i = v1.d.b();

    public u.j0 f9889j;

    public final v1.i f9890k;
    public final k9.x0 l;

    public k1(p pVar, n nVar, g0 g0Var, u.l0 l0Var, u00.n nVar2, boolean z10, a30.x xVar, Object obj) {
        this.f9880a = pVar;
        this.f9881b = nVar;
        this.f9882c = g0Var;
        this.f9883d = nVar2;
        this.f9884e = z10;
        this.f9885f = xVar;
        this.f9886g = obj;
        u.j0 j0Var = u.r0.f14890a;
        kotlin.jvm.internal.m.c(j0Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        this.f9889j = j0Var;
        v1.i iVar = new v1.i();
        iVar.g(l0Var, g0Var.B());
        this.f9890k = iVar;
        this.l = new k9.x0(xVar.D);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.f9887h;
        try {
            switch (((l1) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    l1 l1Var = l1.F;
                    l1 l1Var2 = l1.G;
                    if (atomicReference.compareAndSet(l1Var, l1Var2)) {
                        return;
                    }
                    n1.b("Unexpected state change from: " + l1Var + " to: " + l1Var2 + '.');
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e3) {
            atomicReference.set(l1.A);
            throw e3;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.f9886g) {
                try {
                    this.l.L(this.f9885f, this.f9890k);
                    this.f9890k.c();
                    this.f9890k.d();
                    this.f9890k.b();
                    this.f9880a.Q = null;
                } catch (Throwable th2) {
                    this.f9890k.b();
                    this.f9880a.Q = null;
                    throw th2;
                }
            }
            Trace.endSection();
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    public final boolean c() {
        return ((l1) this.f9887h.get()).compareTo(l1.F) >= 0;
    }

    public final void d() {
        l1 l1Var = l1.D;
        l1 l1Var2 = l1.F;
        if (this.f9887h.compareAndSet(l1Var, l1Var2)) {
            return;
        }
        n1.b("Unexpected state change from: " + l1Var + " to: " + l1Var2 + '.');
    }

    public final boolean e(d2 d2Var) throws Exception {
        AtomicReference atomicReference = this.f9887h;
        try {
            int iOrdinal = ((l1) atomicReference.get()).ordinal();
            p pVar = this.f9880a;
            n nVar = this.f9881b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    g0 g0Var = this.f9882c;
                    boolean z10 = this.f9884e;
                    if (z10) {
                        g0Var.f9865z = 0;
                        g0Var.f9864y = true;
                    }
                    try {
                        this.f9889j = nVar.b(pVar, d2Var, this.f9883d);
                        if (z10) {
                            g0Var.u();
                        }
                        l1 l1Var = l1.C;
                        l1 l1Var2 = l1.D;
                        if (!atomicReference.compareAndSet(l1Var, l1Var2)) {
                            n1.b("Unexpected state change from: " + l1Var + " to: " + l1Var2 + '.');
                        }
                        if (this.f9889j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th2) {
                        if (z10) {
                            g0Var.u();
                        }
                        throw th2;
                    }
                case 3:
                    l1 l1Var3 = l1.D;
                    l1 l1Var4 = l1.E;
                    if (!atomicReference.compareAndSet(l1Var3, l1Var4)) {
                        n1.b("Unexpected state change from: " + l1Var3 + " to: " + l1Var4 + '.');
                    }
                    long j9 = this.f9888i;
                    try {
                        this.f9888i = v1.d.b();
                        this.f9889j = nVar.q(pVar, d2Var, this.f9889j);
                        this.f9888i = j9;
                        if (!atomicReference.compareAndSet(l1Var4, l1Var3)) {
                            n1.b("Unexpected state change from: " + l1Var4 + " to: " + l1Var3 + '.');
                        }
                        if (this.f9889j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th3) {
                        this.f9888i = j9;
                        l1 l1Var5 = l1.E;
                        l1 l1Var6 = l1.D;
                        if (!atomicReference.compareAndSet(l1Var5, l1Var6)) {
                            n1.b("Unexpected state change from: " + l1Var5 + " to: " + l1Var6 + '.');
                        }
                        throw th3;
                    }
                case 4:
                    l.b("Recursive call to resume()");
                    throw new KotlinNothingValueException();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e3) {
            atomicReference.set(l1.A);
            throw e3;
        }
    }
}
