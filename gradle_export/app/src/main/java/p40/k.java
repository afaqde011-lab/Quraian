package p40;

import java.util.Arrays;

public final class k extends r0 {
    public char[] a;
    public int b;

    @Override
    public final Object a() {
        char[] cArrCopyOf = Arrays.copyOf(this.a, this.b);
        kotlin.jvm.internal.m.d(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override
    public final void b(int i) {
        char[] cArr = this.a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i);
            kotlin.jvm.internal.m.d(cArrCopyOf, "copyOf(...)");
            this.a = cArrCopyOf;
        }
    }

    @Override
    public final int d() {
        return this.b;
    }
}
