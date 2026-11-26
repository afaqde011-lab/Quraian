package v;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

public abstract class a {

    public static final int[] f15304a = new int[0];

    public static final long[] f15305b = new long[0];

    public static final Object[] f15306c = new Object[0];

    public static final int a(int[] iArr, int i10, int i11) {
        m.e(iArr, "array");
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static final int b(long[] jArr, int i10, long j9) {
        m.e(jArr, "array");
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long j10 = jArr[i13];
            if (j10 < j9) {
                i12 = i13 + 1;
            } else {
                if (j10 <= j9) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static final void c(String str) {
        m.e(str, "message");
        throw new IllegalArgumentException(str);
    }

    public static final void d(String str) {
        m.e(str, "message");
        throw new IndexOutOfBoundsException(str);
    }

    public static final void e(String str) {
        m.e(str, "message");
        throw new NoSuchElementException(str);
    }
}
