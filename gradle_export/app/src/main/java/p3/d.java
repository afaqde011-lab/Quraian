package p3;

import android.text.Layout;

public abstract class d {

    public static final int[] f12308a;

    static {
        int[] iArr = new int[Layout.Alignment.values().length];
        try {
            iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f12308a = iArr;
    }
}
