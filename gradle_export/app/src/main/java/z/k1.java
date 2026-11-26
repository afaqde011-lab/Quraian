package z;

import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

public final class k1 extends b3.l {
    public b3.k Q;

    @Override
    public final void t1() {
        b3.k kVar = this.Q;
        if (kVar == null || ((b2.q) kVar).A.N) {
            kVar = null;
        } else {
            B1(kVar);
        }
        this.Q = kVar;
    }

    @Override
    public final void u1() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        b3.k kVar = this.Q;
        if (kVar != null) {
            C1(kVar);
        }
    }
}
