package w;

import java.util.Comparator;

public final class t1 implements Comparator {
    @Override
    public final int compare(Object obj, Object obj2) {
        k1 k1Var = (k1) obj;
        k1 k1Var2 = (k1) obj2;
        return p30.f.Z(Float.valueOf((k1Var.B.h() == 0.0f && k1Var.K == null) ? -1.0f : k1Var.B.h()), Float.valueOf((k1Var2.B.h() == 0.0f && k1Var2.K == null) ? -1.0f : k1Var2.B.h()));
    }
}
