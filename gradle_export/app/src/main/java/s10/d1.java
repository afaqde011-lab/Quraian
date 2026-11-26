package s10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d1 {
    public int a;
    public final String b;
    public final int c;
    public final g1 d;
    public final ArrayList e;
    public final ArrayList f;

    public d1(int i, String name, int i2, g1 g1Var) {
        kotlin.jvm.internal.m.e(name, "name");
        this.a = i;
        this.b = name;
        this.c = i2;
        this.d = g1Var;
        this.e = new ArrayList(1);
        u10.l.a.getClass();
        List listA = u10.k.a();
        ArrayList arrayList = new ArrayList(h00.r.q0(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((w10.d) ((u10.l) it.next())).getClass();
            arrayList.add(new w10.h());
        }
        this.f = arrayList;
    }

    public d1(String name, int i, g1 g1Var) {
        this(0, name, i, g1Var);
        kotlin.jvm.internal.m.e(name, "name");
    }
}
