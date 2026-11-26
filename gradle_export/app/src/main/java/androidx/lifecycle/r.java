package androidx.lifecycle;

import java.util.concurrent.CancellationException;

public final class r implements u, a40.z {
    public final q A;
    public final k00.i B;

    public r(q qVar, k00.i iVar) {
        kotlin.jvm.internal.m.e(iVar, "coroutineContext");
        this.A = qVar;
        this.B = iVar;
        if (qVar.b() == p.A) {
            a40.c0.j(iVar, (CancellationException) null);
        }
    }

    public final k00.i A() {
        return this.B;
    }

    @Override
    public final void a(w wVar, o oVar) {
        q qVar = this.A;
        if (qVar.b().compareTo(p.A) <= 0) {
            qVar.d(this);
            a40.c0.j(this.B, (CancellationException) null);
        }
    }
}
