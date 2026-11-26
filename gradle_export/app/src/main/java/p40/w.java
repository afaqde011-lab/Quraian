package p40;

import java.util.Arrays;

public final class w extends r0 {
    public float[] a;
    public int b;

    @Override
    public final Object a() {
        float[] fArrCopyOf = Arrays.copyOf(this.a, this.b);
        kotlin.jvm.internal.m.d(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override
    public final void b(int i) {
        float[] fArr = this.a;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i);
            kotlin.jvm.internal.m.d(fArrCopyOf, "copyOf(...)");
            this.a = fArrCopyOf;
        }
    }

    @Override
    public final int d() {
        return this.b;
    }
}
