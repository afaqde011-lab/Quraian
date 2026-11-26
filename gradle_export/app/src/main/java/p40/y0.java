package p40;

import java.util.Arrays;

public final class y0 extends r0 {
    public short[] a;
    public int b;

    @Override
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.a, this.b);
        kotlin.jvm.internal.m.d(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @Override
    public final void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            int length = sArr.length * 2;
            if (i < length) {
                i = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i);
            kotlin.jvm.internal.m.d(sArrCopyOf, "copyOf(...)");
            this.a = sArrCopyOf;
        }
    }

    @Override
    public final int d() {
        return this.b;
    }
}
