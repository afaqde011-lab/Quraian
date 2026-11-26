package a10;

public abstract class f0 {
    public static final int[] a;

    static {
        int[] iArr = new int[a0.values().length];
        try {
            a0 a0Var = a0.A;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a0 a0Var2 = a0.A;
            iArr[0] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a0 a0Var3 = a0.A;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
