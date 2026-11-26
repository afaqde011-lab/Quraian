package ly;

import java.util.Iterator;
import kotlin.jvm.internal.m;
import ri.t1;

public final class f {
    public final my.b a;

    public f(my.b bVar, iy.b bVar2) {
        this.a = bVar;
    }

    public final Object a(String str, String str2, m00.c cVar) {
        e eVar;
        Object next;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i = eVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.C = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objA = eVar.A;
        l00.a aVar = l00.a.A;
        int i2 = eVar.C;
        if (i2 == 0) {
            t1.O(objA);
            jy.c cVar2 = new jy.c(str, str2);
            eVar.C = 1;
            objA = this.a.a(cVar2, eVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objA);
        }
        jy.d from = (jy.d) objA;
        m.e(from, "from");
        Iterator it = oy.c.C.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!m.a(((oy.c) next).name(), from.getStatus()));
        oy.c cVar3 = (oy.c) next;
        if (cVar3 == null) {
            cVar3 = oy.c.A;
        }
        return new oy.b(cVar3, from.getPlatform(), from.getManagementUrl());
    }
}
