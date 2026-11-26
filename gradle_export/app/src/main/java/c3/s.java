package c3;

public final class s extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final kotlin.jvm.internal.z B;

    public s(kotlin.jvm.internal.z zVar, int i10) {
        super(1);
        this.A = i10;
        this.B = zVar;
    }

    public final Object invoke(Object obj) {
        boolean z10;
        switch (this.A) {
            case 0:
                this.B.A = (g2.a0) obj;
                return Boolean.TRUE;
            case 1:
                b3.k kVar = (b3.o2) obj;
                if (((b2.q) kVar).A.N) {
                    this.B.A = kVar;
                    z10 = false;
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                v2.e eVar = (v2.e) obj;
                kotlin.jvm.internal.z zVar = this.B;
                Object obj2 = zVar.A;
                if (obj2 == null && eVar.Q) {
                    zVar.A = eVar;
                } else if (obj2 != null) {
                    eVar.getClass();
                }
                return Boolean.TRUE;
        }
    }
}
