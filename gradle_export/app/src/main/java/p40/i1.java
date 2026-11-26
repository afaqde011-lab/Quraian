package p40;

import java.util.Arrays;

public final class i1 extends r0 {
    public long[] a;
    public int b;

    @Override
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.a, this.b);
        kotlin.jvm.internal.m.d(jArrCopyOf, "copyOf(...)");
        return new g00.x(jArrCopyOf);
    }

    @Override
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i);
            kotlin.jvm.internal.m.d(jArrCopyOf, "copyOf(...)");
            this.a = jArrCopyOf;
        }
    }

    @Override
    public final int d() {
        return this.b;
    }
}
