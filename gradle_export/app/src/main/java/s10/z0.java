package s10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class z0 {
    public static final a10.w[] l;
    public int a;
    public final a1 b;
    public final a1 c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public final ArrayList k;

    static {
        kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p(z0.class, "_hasSetter", "get_hasSetter()Z", 0);
        kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
        l = new a10.w[]{b0Var.f(pVar), oi.k.e(z0.class, "_hasGetter", "get_hasGetter()Z", 0, b0Var)};
    }

    public z0(int i, int i2, int i3, String name) {
        int i4;
        kotlin.jvm.internal.m.e(name, "name");
        this.a = i;
        k20.b HAS_SETTER = k20.e.A;
        kotlin.jvm.internal.m.d(HAS_SETTER, "HAS_SETTER");
        t10.h hVar = new t10.h(HAS_SETTER);
        t10.e eVar = t10.e.B;
        int i5 = hVar.b;
        if (i5 != 1 || (i4 = hVar.c) != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar, " was passed").toString());
        }
        k20.b HAS_GETTER = k20.e.z;
        kotlin.jvm.internal.m.d(HAS_GETTER, "HAS_GETTER");
        t10.h hVar2 = new t10.h(HAS_GETTER);
        if (hVar2.b != 1 || hVar2.c != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar2, " was passed").toString());
        }
        int i6 = 1 << hVar2.a;
        a1 a1Var = new a1(i2);
        a10.w[] wVarArr = l;
        a10.w property = wVarArr[1];
        kotlin.jvm.internal.m.e(property, "property");
        eVar.p(this, Integer.valueOf(i6 | this.a));
        this.b = a1Var;
        a10.w property2 = wVarArr[0];
        kotlin.jvm.internal.m.e(property2, "property");
        this.c = ((((Number) eVar.get(this)).intValue() >>> hVar.a) & ((1 << i5) - 1)) == i4 ? new a1(i3) : null;
        this.d = new ArrayList(0);
        this.e = new ArrayList(0);
        new ArrayList(0);
        this.f = new ArrayList();
        this.g = new ArrayList(0);
        this.h = new ArrayList(0);
        this.i = new ArrayList(0);
        this.j = new ArrayList(0);
        u10.l.a.getClass();
        List listA = u10.k.a();
        ArrayList arrayList = new ArrayList(h00.r.q0(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((w10.d) ((u10.l) it.next())).getClass();
            arrayList.add(new w10.f());
        }
        this.k = arrayList;
    }
}
