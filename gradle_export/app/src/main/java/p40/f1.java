package p40;

import java.util.Arrays;

public final class f1 extends r0 {
    public int[] a;
    public int b;

    @Override
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.a, this.b);
        kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
        return new g00.v(iArrCopyOf);
    }

    @Override
    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int length = iArr.length * 2;
            if (i < length) {
                i = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.a = iArrCopyOf;
        }
    }

    @Override
    public final int d() {
        return this.b;
    }
}
