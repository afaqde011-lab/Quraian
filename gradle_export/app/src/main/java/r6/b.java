package r6;

import androidx.lifecycle.o;

public abstract class b {

    public static final int[] f13125a;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.ON_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o.ON_RESUME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[o.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f13125a = iArr;
    }
}
