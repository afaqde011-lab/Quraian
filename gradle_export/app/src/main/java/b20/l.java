package b20;

import java.lang.reflect.Modifier;
import m10.l0;

public final class l implements u00.k {
    public static final l B = new l(0);
    public static final l C = new l(1);
    public static final l D = new l(2);
    public static final l E = new l(3);
    public static final l F = new l(4);
    public final int A;

    public l(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                p10.w it = (p10.w) obj;
                int i = n.v;
                kotlin.jvm.internal.m.e(it, "it");
                return Boolean.valueOf(!Modifier.isStatic(it.b().getModifiers()));
            case 1:
                l0 selectMostSpecificInEachOverridableGroup = (l0) obj;
                a10.w[] wVarArr = a0.m;
                kotlin.jvm.internal.m.e(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
                return selectMostSpecificInEachOverridableGroup;
            case 2:
                p10.w it2 = (p10.w) obj;
                int i2 = d0.p;
                kotlin.jvm.internal.m.e(it2, "it");
                return Boolean.valueOf(Modifier.isStatic(it2.b().getModifiers()));
            case 3:
                x20.n it3 = (x20.n) obj;
                int i3 = d0.p;
                kotlin.jvm.internal.m.e(it3, "it");
                return it3.f();
            default:
                int i4 = d0.p;
                j10.h hVarG = ((e30.w) obj).m0().g();
                if (hVarG instanceof j10.e) {
                    return (j10.e) hVarG;
                }
                return null;
        }
    }
}
