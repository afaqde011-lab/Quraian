package y10;

import g00.k;
import g10.o;
import h00.d0;
import h00.r;
import h00.v;
import h00.z;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import k10.m;
import k10.n;
import p10.t;

public abstract class e {
    public static final Object a = d0.R(new k("PACKAGE", EnumSet.noneOf(n.class)), new k("TYPE", EnumSet.of(n.CLASS, n.FILE)), new k("ANNOTATION_TYPE", EnumSet.of(n.ANNOTATION_CLASS)), new k("TYPE_PARAMETER", EnumSet.of(n.TYPE_PARAMETER)), new k("FIELD", EnumSet.of(n.FIELD)), new k("LOCAL_VARIABLE", EnumSet.of(n.LOCAL_VARIABLE)), new k("PARAMETER", EnumSet.of(n.VALUE_PARAMETER)), new k("CONSTRUCTOR", EnumSet.of(n.CONSTRUCTOR)), new k("METHOD", EnumSet.of(n.FUNCTION, n.PROPERTY_GETTER, n.PROPERTY_SETTER)), new k("TYPE_USE", EnumSet.of(n.TYPE)));
    public static final Object b = d0.R(new k("RUNTIME", m.A), new k("CLASS", m.B), new k("SOURCE", m.C));

    public static s20.b a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof t) {
                arrayList.add(obj);
            }
        }
        ArrayList<n> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) a.get(n20.e.e(((t) it.next()).b.name()).b());
            if (iterable == null) {
                iterable = z.A;
            }
            v.u0(iterable, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(r.q0(arrayList2, 10));
        for (n nVar : arrayList2) {
            n20.c topLevelFqName = o.u;
            kotlin.jvm.internal.m.e(topLevelFqName, "topLevelFqName");
            arrayList3.add(new s20.i(new n20.b(topLevelFqName.b(), topLevelFqName.a.g()), n20.e.e(nVar.name())));
        }
        return new s20.b(d.A, arrayList3);
    }
}
