package v0;

import kotlin.jvm.internal.z;
import q0.f2;
import z2.a0;

public final class b implements u00.a {
    public final int A;
    public final f B;
    public final x0.e C;

    public b(f fVar, x0.e eVar, int i10) {
        this.A = i10;
        this.B = fVar;
        this.C = eVar;
    }

    public final Object invoke() {
        switch (this.A) {
            case 0:
                f fVar = this.B;
                a aVar = fVar.f15320f;
                f2 f2Var = new f2(this.C, 8);
                z zVar = new z();
                fVar.f15319e.d("dataBuilder", aVar, new l6.c(zVar, f2Var, 22));
                Object obj = zVar.A;
                if (obj != null) {
                    return (t0.c) obj;
                }
                kotlin.jvm.internal.m.k("result");
                throw null;
            case 1:
                f fVar2 = this.B;
                a aVar2 = fVar2.f15321g;
                b bVar = new b(fVar2, this.C, 2);
                z zVar2 = new z();
                fVar2.f15319e.d("positioner", aVar2, new l6.c(zVar2, bVar, 22));
                Object obj2 = zVar2.A;
                if (obj2 != null) {
                    return (h2.c) obj2;
                }
                kotlin.jvm.internal.m.k("result");
                throw null;
            default:
                Object objInvoke = this.B.f15317c.invoke();
                if (!((a0) objInvoke).A()) {
                    objInvoke = null;
                }
                a0 a0Var = (a0) objInvoke;
                return a0Var == null ? h2.c.f6545e : this.C.W0(a0Var).j(a0Var.d0(0L));
        }
    }
}
