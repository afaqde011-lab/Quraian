package lu;

public abstract class x {
    public static final int[] a;

    static {
        int[] iArr = new int[gm.a.values().length];
        try {
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            gm.a aVar = gm.a.A;
            iArr[0] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[androidx.lifecycle.o.values().length];
        try {
            iArr2[androidx.lifecycle.o.ON_PAUSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[androidx.lifecycle.o.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[androidx.lifecycle.o.ON_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr2;
    }
}
