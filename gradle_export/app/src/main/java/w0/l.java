package w0;

import a40.a0;
import a40.c0;
import a40.u1;
import b3.m;

public final class l {

    public j f15828a;

    public k f15829b = k.A;

    public final void a() {
        x0.f fVar;
        if (this.f15829b == k.A) {
            g0.a.c("ToolbarRequester is not initialized.");
        }
        j jVar = this.f15828a;
        if (jVar == null || !jVar.N) {
            return;
        }
        u1 u1Var = jVar.U;
        if ((u1Var == null || !u1Var.a()) && (fVar = (x0.f) m.h(jVar, x0.g.f16398b)) != null) {
            jVar.U = c0.y(jVar.p1(), (k00.i) null, a0.D, new pz.k(jVar, fVar, (k00.c) null, 19), 1);
        }
    }
}
