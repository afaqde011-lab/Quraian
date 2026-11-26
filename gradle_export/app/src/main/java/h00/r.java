package h00;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public abstract class r extends va.a {
    public static int q0(Iterable iterable, int i) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static ArrayList r0(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v.u0((Iterable) it.next(), arrayList2);
        }
        return arrayList2;
    }
}
