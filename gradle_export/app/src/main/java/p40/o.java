package p40;

import java.util.Arrays;

public final class o extends r0 {
    public double[] a;
    public int b;

    @Override
    public final Object a() {
        double[] dArrCopyOf = Arrays.copyOf(this.a, this.b);
        kotlin.jvm.internal.m.d(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @Override
    public final void b(int i) {
        double[] dArr = this.a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i);
            kotlin.jvm.internal.m.d(dArrCopyOf, "copyOf(...)");
            this.a = dArrCopyOf;
        }
    }

    @Override
    public final int d() {
        return this.b;
    }
}
