package z;

import java.io.Serializable;

public final class f0 implements u00.a {
    public final int A;
    public final Serializable B;
    public final Object C;

    public f0(int i11, Serializable serializable, Object obj) {
        this.A = i11;
        this.B = serializable;
        this.C = obj;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                ((kotlin.jvm.internal.z) this.B).A = b3.m.h((g0) this.C, z2.j1.f23886a);
                return g00.b0.f7770a;
            default:
                String str = (String) this.B;
                l40.b bVar = new l40.b((l40.c) this.C, 0);
                return ri.t1.l(str, n40.b.f15086c, new n40.e[0], bVar);
        }
    }
}
