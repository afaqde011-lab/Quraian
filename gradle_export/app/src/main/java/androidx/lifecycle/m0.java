package androidx.lifecycle;

import java.util.concurrent.CancellationException;

public final class m0 implements u {
    public final o A;
    public final kotlin.jvm.internal.z B;
    public final a40.z C;
    public final o D;
    public final a40.k E;
    public final j40.c F;
    public final m00.i G;

    public m0(o oVar, kotlin.jvm.internal.z zVar, a40.z zVar2, o oVar2, a40.k kVar, j40.c cVar, u00.n nVar) {
        this.A = oVar;
        this.B = zVar;
        this.C = zVar2;
        this.D = oVar2;
        this.E = kVar;
        this.F = cVar;
        this.G = (m00.i) nVar;
    }

    @Override
    public final void a(w wVar, o oVar) {
        o oVar2 = this.A;
        kotlin.jvm.internal.z zVar = this.B;
        if (oVar == oVar2) {
            zVar.A = a40.c0.y(this.C, (k00.i) null, (a40.a0) null, new a1.g(this.F, (u00.n) this.G, (k00.c) null), 3);
            return;
        }
        if (oVar == this.D) {
            a40.e1 e1Var = (a40.e1) zVar.A;
            if (e1Var != null) {
                e1Var.i((CancellationException) null);
            }
            zVar.A = null;
        }
        if (oVar == o.ON_DESTROY) {
            this.E.resumeWith(g00.b0.a);
        }
    }
}
