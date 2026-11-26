package g10;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class d {
    public static final LinkedHashSet a;

    static {
        Set<k> set = k.E;
        ArrayList arrayList = new ArrayList(h00.r.q0(set, 10));
        for (k primitiveType : set) {
            kotlin.jvm.internal.m.e(primitiveType, "primitiveType");
            arrayList.add(p.l.a(primitiveType.A));
        }
        ArrayList<n20.c> arrayListZ0 = h00.q.Z0(o.j.i(), h00.q.Z0(o.h.i(), h00.q.Z0(o.f.i(), arrayList)));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n20.c topLevelFqName : arrayListZ0) {
            kotlin.jvm.internal.m.e(topLevelFqName, "topLevelFqName");
            linkedHashSet.add(new n20.b(topLevelFqName.b(), topLevelFqName.a.g()));
        }
        a = linkedHashSet;
    }
}
