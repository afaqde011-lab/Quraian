package ab;

import androidx.work.impl.WorkDatabase;
import g1.j7;
import g1.s1;
import java.util.Iterator;
import java.util.List;

public abstract class l {

    public static final String f385a = za.v.f("Schedulers");

    public static void a(hb.x xVar, za.i iVar, List list) {
        if (list.size() > 0) {
            iVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                xVar.g(jCurrentTimeMillis, ((hb.p) it.next()).f7004a);
            }
        }
    }

    public static void b(za.b bVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        hb.x xVarW = workDatabase.w();
        workDatabase.b();
        try {
            List list2 = (List) rd.a.M(xVarW.f7028a, true, false, new j7(19));
            a(xVarW, bVar.f17340d, list2);
            List list3 = (List) rd.a.M(xVarW.f7028a, true, false, new s1(bVar.f17347k, 3));
            a(xVarW, bVar.f17340d, list3);
            list3.addAll(list2);
            List list4 = (List) rd.a.M(xVarW.f7028a, true, false, new j7(23));
            workDatabase.p();
            workDatabase.f();
            if (list3.size() > 0) {
                hb.p[] pVarArr = (hb.p[]) list3.toArray(new hb.p[list3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    if (iVar.b()) {
                        iVar.a(pVarArr);
                    }
                }
            }
            if (list4.size() > 0) {
                hb.p[] pVarArr2 = (hb.p[]) list4.toArray(new hb.p[list4.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    i iVar2 = (i) it2.next();
                    if (!iVar2.b()) {
                        iVar2.a(pVarArr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.f();
            throw th2;
        }
    }
}
