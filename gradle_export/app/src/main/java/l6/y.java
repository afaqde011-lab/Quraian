package l6;

import a40.c0;
import a40.e1;
import androidx.glance.session.TimeoutCancellationException;
import com.google.android.gms.internal.measurement.g4;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import k9.b3;

public final class y implements a40.z {
    public final a40.z A;
    public final AtomicReference B = new AtomicReference(null);
    public final b3 C;
    public final a40.z D;
    public final u00.n E;
    public final AtomicReference F;

    public y(a40.z zVar, b3 b3Var, a40.z zVar2, u00.n nVar, AtomicReference atomicReference) {
        this.C = b3Var;
        this.D = zVar2;
        this.E = nVar;
        this.F = atomicReference;
        this.A = zVar;
    }

    public final k00.i A() {
        return this.A.A();
    }

    public final long a() {
        Long l = (Long) this.B.get();
        if (l == null) {
            s30.a aVar = s30.b.B;
            return s30.b.C;
        }
        long jLongValue = l.longValue();
        this.C.getClass();
        long jCurrentTimeMillis = jLongValue - System.currentTimeMillis();
        s30.a aVar2 = s30.b.B;
        return g4.c0(jCurrentTimeMillis, s30.d.D);
    }

    public final void b(long j9) {
        if (s30.b.e(j9) <= 0) {
            c0.i(this.D, new TimeoutCancellationException("Timed out immediately", this.E.hashCode()));
            return;
        }
        if (s30.b.c(a(), j9) < 0) {
            return;
        }
        this.C.getClass();
        this.B.set(Long.valueOf(s30.b.e(j9) + System.currentTimeMillis()));
        u00.n nVar = this.E;
        b3 b3Var = this.C;
        a40.z zVar = this.D;
        e1 e1Var = (e1) this.F.getAndSet(c0.y(zVar, (k00.i) null, (a40.a0) null, new v(this, b3Var, zVar, nVar, (k00.c) null), 3));
        if (e1Var != null) {
            e1Var.i((CancellationException) null);
        }
    }
}
