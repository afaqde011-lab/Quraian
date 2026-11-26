package ay;

import h00.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r30.j;

public abstract class d {
    public static final a8.d a = new a8.d(100, 85, 70);
    public static final a8.d b = new a8.d(60, 50, 35);
    public static final a8.d c = new a8.d(75, 65, 55);
    public static final a8.d d = new a8.d(100, 85, 75);

    public static ArrayList a(List list) {
        j jVar = e.a;
        ArrayList arrayList = new ArrayList(r.q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(e.c((String) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
