package gc;

import g2.a0;
import kotlin.jvm.internal.z;

public final class d extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final Object B;
    public final int C;

    public d(Object obj, int i10, int i11) {
        super(1);
        this.A = i11;
        this.B = obj;
        this.C = i10;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                return Boolean.valueOf(g.a((g) this.B, this.C, ((Number) obj).longValue()));
            case 1:
                return Boolean.valueOf(g.a((g) this.B, this.C, ((Number) obj).longValue()));
            default:
                z zVar = (z) this.B;
                Boolean boolValueOf = Boolean.valueOf(((a0) obj).I1(this.C));
                zVar.A = boolValueOf;
                return boolValueOf;
        }
    }
}
