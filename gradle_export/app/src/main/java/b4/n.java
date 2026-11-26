package b4;

import b3.l0;
import g00.b0;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

public final class n extends kotlin.jvm.internal.n implements u00.n {
    public static final n B;
    public static final n C;
    public static final n D;
    public static final n E;
    public static final n F;
    public static final n G;
    public static final n H;
    public final int A;

    static {
        int i10 = 2;
        B = new n(i10, 0);
        C = new n(i10, 1);
        D = new n(i10, 2);
        E = new n(i10, 3);
        F = new n(i10, 4);
        G = new n(i10, 5);
        H = new n(i10, 6);
    }

    public n(int i10, int i11) {
        super(i10);
        this.A = i11;
    }

    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        int i10;
        switch (this.A) {
            case 0:
                l.e((l0) obj).setUpdateBlock((u00.k) obj2);
                return b0.a;
            case 1:
                l.e((l0) obj).setReleaseBlock((u00.k) obj2);
                return b0.a;
            case 2:
                l.e((l0) obj).setModifier((b2.r) obj2);
                return b0.a;
            case 3:
                l.e((l0) obj).setDensity((y3.c) obj2);
                return b0.a;
            case 4:
                l.e((l0) obj).setLifecycleOwner((androidx.lifecycle.w) obj2);
                return b0.a;
            case 5:
                l.e((l0) obj).setSavedStateRegistryOwner((ia.g) obj2);
                return b0.a;
            default:
                z zVarE = l.e((l0) obj);
                int iOrdinal = ((y3.m) obj2).ordinal();
                if (iOrdinal != 0) {
                    i10 = 1;
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i10 = 0;
                }
                zVarE.setLayoutDirection(i10);
                return b0.a;
        }
    }
}
