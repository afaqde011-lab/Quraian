package iz;

import g00.b0;
import h0.p1;
import l1.z0;

public final class h implements u00.k {
    public final int A;
    public final u00.a B;
    public final z0 C;

    public h(u00.a aVar, z0 z0Var, int i) {
        this.A = i;
        this.B = aVar;
        this.C = z0Var;
    }

    @Override
    public final Object invoke(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        z0 z0Var = this.C;
        u00.a aVar = this.B;
        switch (i) {
            case 0:
                String it = (String) obj;
                kotlin.jvm.internal.m.e(it, "it");
                z0Var.setValue(it);
                aVar.invoke();
                break;
            default:
                p1 p1Var = po.m.a;
                z0Var.setValue(Boolean.TRUE);
                aVar.invoke();
                break;
        }
        return b0Var;
    }
}
