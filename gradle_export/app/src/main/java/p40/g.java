package p40;

import java.util.Arrays;

public final class g extends r0 {
    public byte[] a;
    public int b;

    @Override
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.a, this.b);
        kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @Override
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
            kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
            this.a = bArrCopyOf;
        }
    }

    @Override
    public final int d() {
        return this.b;
    }
}
