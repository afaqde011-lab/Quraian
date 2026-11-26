package d10;

public abstract class h2 {
    public static final int[] a;

    static {
        int[] iArr = new int[g10.k.values().length];
        try {
            iArr[g10.k.BOOLEAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g10.k.CHAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g10.k.BYTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[g10.k.SHORT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[g10.k.INT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[g10.k.FLOAT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[g10.k.LONG.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[g10.k.DOUBLE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
    }
}
