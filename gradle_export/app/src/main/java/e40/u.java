package e40;

import d40.d1;
import d40.n1;

public final class u extends d1 implements n1 {
    @Override
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.H;
            kotlin.jvm.internal.m.b(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.I + ((long) ((int) ((o() + ((long) this.K)) - this.I)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void v(int i) {
        synchronized (this) {
            Object[] objArr = this.H;
            kotlin.jvm.internal.m.b(objArr);
            f(Integer.valueOf(((Number) objArr[((int) ((this.I + ((long) ((int) ((o() + ((long) this.K)) - this.I)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
