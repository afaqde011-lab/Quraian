package kz;

import androidx.lifecycle.o;

public abstract class e {
    public static final int[] a;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.ON_RESUME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.ON_PAUSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
