package d;

public abstract class d0 {

    public static final int[] f4381a;

    static {
        int[] iArr = new int[androidx.lifecycle.o.values().length];
        try {
            iArr[androidx.lifecycle.o.ON_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[androidx.lifecycle.o.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[androidx.lifecycle.o.ON_DESTROY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f4381a = iArr;
    }
}
