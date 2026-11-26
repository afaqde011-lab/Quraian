package k30;

import java.util.Arrays;
import java.util.Collection;

public final class i {
    public final n20.e a;
    public final r30.j b;
    public final Collection c;
    public final u00.k d;
    public final e[] e;

    public i(Collection collection, e[] eVarArr) {
        this(collection, eVarArr, h.D);
    }

    public i(Collection nameList, e[] eVarArr, u00.k kVar) {
        this(null, null, nameList, kVar, (e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        kotlin.jvm.internal.m.e(nameList, "nameList");
    }

    public i(n20.e eVar, r30.j jVar, Collection collection, u00.k kVar, e... eVarArr) {
        this.a = eVar;
        this.b = jVar;
        this.c = collection;
        this.d = kVar;
        this.e = eVarArr;
    }

    public i(n20.e eVar, e[] eVarArr) {
        this(eVar, eVarArr, h.B);
    }

    public i(n20.e name, e[] eVarArr, u00.k kVar) {
        this(name, null, null, kVar, (e[]) Arrays.copyOf(eVarArr, eVarArr.length));
        kotlin.jvm.internal.m.e(name, "name");
    }
}
