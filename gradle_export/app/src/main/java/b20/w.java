package b20;

import j10.l0;

public final class w implements u00.a {
    public final int A;
    public final a0 B;
    public final p10.u C;
    public final kotlin.jvm.internal.z D;

    public w(a0 a0Var, p10.u uVar, kotlin.jvm.internal.z zVar, int i) {
        this.A = i;
        this.B = a0Var;
        this.C = uVar;
        this.D = zVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                a0 a0Var = this.B;
                d30.o oVar = ((a20.b) a0Var.b.B).a;
                w wVar = new w(a0Var, this.C, this.D, 1);
                d30.l lVar = (d30.l) oVar;
                lVar.getClass();
                return new d30.h(lVar, wVar);
            default:
                y10.h hVar = ((a20.b) this.B.b.B).h;
                l0 descriptor = (l0) this.D.A;
                hVar.getClass();
                p10.u field = this.C;
                kotlin.jvm.internal.m.e(field, "field");
                kotlin.jvm.internal.m.e(descriptor, "descriptor");
                return null;
        }
    }
}
