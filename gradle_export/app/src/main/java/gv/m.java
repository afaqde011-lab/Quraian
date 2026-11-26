package gv;

public abstract class m {
    public static final int[] a;

    static {
        int[] iArr = new int[androidx.lifecycle.o.values().length];
        try {
            iArr[androidx.lifecycle.o.ON_PAUSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[androidx.lifecycle.o.ON_RESUME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
