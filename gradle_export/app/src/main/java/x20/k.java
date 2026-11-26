package x20;

import m10.l0;

public final class k implements u00.k {
    public static final k B = new k(0);
    public static final k C = new k(1);
    public static final k D = new k(2);
    public static final k E = new k(3);
    public final int A;

    public k(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                n20.e it = (n20.e) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return Boolean.TRUE;
            case 1:
                l0 selectMostSpecificInEachOverridableGroup = (l0) obj;
                kotlin.jvm.internal.m.e(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
            case 2:
                j10.l0 selectMostSpecificInEachOverridableGroup2 = (j10.l0) obj;
                kotlin.jvm.internal.m.e(selectMostSpecificInEachOverridableGroup2, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup2;
            default:
                j10.b selectMostSpecificInEachOverridableGroup3 = (j10.b) obj;
                kotlin.jvm.internal.m.e(selectMostSpecificInEachOverridableGroup3, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup3;
        }
    }
}
