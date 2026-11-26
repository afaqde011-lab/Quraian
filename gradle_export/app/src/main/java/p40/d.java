package p40;

import java.util.Arrays;

public final class d extends r0 {
    public boolean[] a;
    public int b;

    @Override
    public final Object a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.a, this.b);
        kotlin.jvm.internal.m.d(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @Override
    public final void b(int i) {
        boolean[] zArr = this.a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i);
            kotlin.jvm.internal.m.d(zArrCopyOf, "copyOf(...)");
            this.a = zArrCopyOf;
        }
    }

    @Override
    public final int d() {
        return this.b;
    }
}
