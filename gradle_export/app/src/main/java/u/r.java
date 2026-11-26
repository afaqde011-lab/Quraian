package u;

import java.util.ConcurrentModificationException;

public abstract class r {

    public static final Object f14887a = new Object();

    public static final long[] f14888b = new long[0];

    public static final Object f14889c = new Object();

    public static final int a(f fVar, Object obj, int i10) {
        int i11 = fVar.C;
        if (i11 == 0) {
            return -1;
        }
        try {
            int iA = v.a.a(fVar.A, i11, i10);
            if (iA < 0 || kotlin.jvm.internal.m.a(obj, fVar.B[iA])) {
                return iA;
            }
            int i12 = iA + 1;
            while (i12 < i11 && fVar.A[i12] == i10) {
                if (kotlin.jvm.internal.m.a(obj, fVar.B[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = iA - 1; i13 >= 0 && fVar.A[i13] == i10; i13--) {
                if (kotlin.jvm.internal.m.a(obj, fVar.B[i13])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
