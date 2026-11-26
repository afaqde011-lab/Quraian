package b40;

import a40.c0;
import a40.h0;
import a40.k;
import a40.m0;
import a40.o0;
import a40.r1;
import a40.v;
import ab.f;
import al.l;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import k00.i;
import kotlin.jvm.internal.m;

public final class c extends v implements h0 {
    public final Handler C;
    public final String D;
    public final boolean E;
    public final c F;

    public c(Handler handler) {
        this(handler, null, false);
    }

    public c(Handler handler, String str, boolean z) {
        this.C = handler;
        this.D = str;
        this.E = z;
        this.F = z ? this : new c(handler, str, true);
    }

    @Override
    public final void A(long j, k kVar) {
        Runnable fVar = new f(kVar, this, 1);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.C.postDelayed(fVar, j)) {
            kVar.u(new l(this, fVar, 1));
        } else {
            r0(kVar.E, fVar);
        }
    }

    @Override
    public final o0 S(long j, Runnable runnable, i iVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.C.postDelayed(runnable, j)) {
            return new androidx.datastore.core.a(this, runnable, 1);
        }
        r0(iVar, runnable);
        return r1.A;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.C == this.C && cVar.E == this.E;
    }

    public final int hashCode() {
        return (this.E ? 1231 : 1237) ^ System.identityHashCode(this.C);
    }

    @Override
    public final void n0(i iVar, Runnable runnable) {
        if (this.C.post(runnable)) {
            return;
        }
        r0(iVar, runnable);
    }

    @Override
    public final boolean p0(i iVar) {
        return (this.E && m.a(Looper.myLooper(), this.C.getLooper())) ? false : true;
    }

    @Override
    public v q0(int i) {
        f40.a.a(1);
        return this;
    }

    public final void r0(i iVar, Runnable runnable) {
        c0.j(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        h40.e eVar = m0.a;
        h40.d.C.n0(iVar, runnable);
    }

    @Override
    public final String toString() {
        c cVar;
        String str;
        h40.e eVar = m0.a;
        c cVar2 = f40.m.a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.F;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.D;
        if (string == null) {
            string = this.C.toString();
        }
        return this.E ? w.c.j(string, ".immediate") : string;
    }
}
