package j10;

import java.util.List;

public final class r implements u00.k {
    public static final r B = new r(0);
    public static final r C = new r(1);
    public static final r D = new r(2);
    public static final r E = new r(3);
    public final int A;

    public r(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e((n20.b) obj, "it");
                return 0;
            case 1:
                e0 it = (e0) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return ((m10.c0) it).F;
            case 2:
                k it2 = (k) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                return Boolean.valueOf(!(it2 instanceof j));
            default:
                k it3 = (k) obj;
                kotlin.jvm.internal.m.e(it3, "it");
                List typeParameters = ((b) it3).getTypeParameters();
                kotlin.jvm.internal.m.d(typeParameters, "getTypeParameters(...)");
                return h00.q.D0(typeParameters);
        }
    }
}
