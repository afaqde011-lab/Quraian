package b3;

import java.util.Comparator;

public final class x1 implements Comparator {
    public static final x1 B = new x1(0);
    public final int A;

    public x1(int i10) {
        this.A = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                l0 l0Var = (l0) obj;
                l0 l0Var2 = (l0) obj2;
                int iF = kotlin.jvm.internal.m.f(l0Var2.Q, l0Var.Q);
                return iF != 0 ? iF : kotlin.jvm.internal.m.f(l0Var.hashCode(), l0Var2.hashCode());
            default:
                l0 l0Var3 = (l0) obj;
                l0 l0Var4 = (l0) obj2;
                int iF2 = kotlin.jvm.internal.m.f(l0Var3.Q, l0Var4.Q);
                return iF2 != 0 ? iF2 : kotlin.jvm.internal.m.f(l0Var3.hashCode(), l0Var4.hashCode());
        }
    }
}
