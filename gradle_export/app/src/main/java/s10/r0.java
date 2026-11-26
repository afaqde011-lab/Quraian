package s10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class r0 {
    public int a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList(0);
    public final ArrayList d = new ArrayList(0);
    public final ArrayList e;

    public r0(int i) {
        this.a = i;
        u10.l.a.getClass();
        List listA = u10.k.a();
        ArrayList arrayList = new ArrayList(h00.r.q0(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((w10.d) ((u10.l) it.next())).getClass();
            arrayList.add(new w10.b());
        }
        this.e = arrayList;
    }
}
