package s10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class y0 {
    public int a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;

    public y0(int i, String name) {
        kotlin.jvm.internal.m.e(name, "name");
        this.a = i;
        this.b = new ArrayList(0);
        this.c = new ArrayList(0);
        new ArrayList(0);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList(0);
        this.g = new ArrayList(0);
        u10.l.a.getClass();
        List listA = u10.k.a();
        ArrayList arrayList = new ArrayList(h00.r.q0(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((w10.d) ((u10.l) it.next())).getClass();
            arrayList.add(new w10.c());
        }
        this.h = arrayList;
    }
}
