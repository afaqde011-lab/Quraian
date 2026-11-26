package nf;

import java.util.Comparator;

public final class q0 implements Comparator {
    public static final q0 A;
    public static final q0[] B;

    static {
        q0 q0Var = new q0("INSTANCE", 0);
        A = q0Var;
        B = new q0[]{q0Var};
    }

    public static q0[] values() {
        return (q0[]) B.clone();
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = (bArr[i10] & 255) - (bArr2[i10] & 255);
            if (i11 != 0) {
                return i11;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
