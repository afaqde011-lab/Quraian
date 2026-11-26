package jx;

import kotlin.NoWhenBranchMatchedException;

public abstract class q {
    public static final float a = 108;
    public static final float b = 140;

    public static final float a(gm.a orientation) {
        kotlin.jvm.internal.m.e(orientation, "orientation");
        int iOrdinal = orientation.ordinal();
        if (iOrdinal == 0) {
            return a;
        }
        if (iOrdinal == 1) {
            return b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
