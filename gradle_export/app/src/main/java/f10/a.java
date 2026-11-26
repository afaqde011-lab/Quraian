package f10;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.m;
import n20.b;
import n20.c;
import x10.v;

public abstract class a {
    public static final LinkedHashSet a;
    public static final b b;

    static {
        List<c> listS = va.a.S(new c[]{v.a, v.h, v.i, v.c, v.d, v.f});
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (c topLevelFqName : listS) {
            m.e(topLevelFqName, "topLevelFqName");
            linkedHashSet.add(new b(topLevelFqName.b(), topLevelFqName.a.g()));
        }
        a = linkedHashSet;
        c REPEATABLE_ANNOTATION = v.g;
        m.d(REPEATABLE_ANNOTATION, "REPEATABLE_ANNOTATION");
        b = new b(REPEATABLE_ANNOTATION.b(), REPEATABLE_ANNOTATION.a.g());
    }
}
