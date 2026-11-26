package ev;

import java.util.ArrayList;
import java.util.Iterator;

public final class w {
    public final bx.c a;
    public final ArrayList b;

    public w(bx.c reciter) {
        kotlin.jvm.internal.m.e(reciter, "reciter");
        this.a = reciter;
        i00.b bVarS = va.a.s();
        bVarS.add(reciter.b);
        bVarS.add(reciter.i);
        String str = reciter.c;
        if (str != null) {
            bVarS.add(str);
        }
        bVarS.addAll(reciter.j);
        bVarS.addAll(reciter.k);
        Iterator<E> it = reciter.d.iterator();
        while (it.hasNext()) {
            bVarS.add(((bx.b) it.next()).b);
        }
        bVarS.add(String.valueOf(reciter.a));
        i00.b bVarK = va.a.k(bVarS);
        r30.j jVar = ay.e.a;
        ArrayList arrayList = new ArrayList(h00.r.q0(bVarK, 10));
        b3.q qVarListIterator = bVarK.listIterator(0);
        while (true) {
            b3.q qVar = qVarListIterator;
            if (!qVar.hasNext()) {
                break;
            } else {
                arrayList.add(ay.e.c((String) qVar.next()));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        this.b = arrayList2;
    }
}
