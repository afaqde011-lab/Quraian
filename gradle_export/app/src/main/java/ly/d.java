package ly;

import er.j;
import kotlin.jvm.internal.m;
import ri.t1;

public final class d {
    public final my.a a;
    public final j b;

    public d(my.a aVar, iy.a aVar2, j jVar) {
        this.a = aVar;
        this.b = jVar;
    }

    public final java.lang.Object a(java.lang.String r7, m00.c r8) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: ly.d.a(java.lang.String, m00.c):java.lang.Object");
    }

    public final Object b(String str, m00.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i = cVar2.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar2.C = i - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objB = cVar2.A;
        l00.a aVar = l00.a.A;
        int i2 = cVar2.C;
        if (i2 == 0) {
            t1.O(objB);
            jy.b bVar = new jy.b(str);
            cVar2.C = 1;
            objB = this.a.b(bVar, cVar2);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objB);
        }
        jy.a from = (jy.a) objB;
        m.e(from, "from");
        String status = from.getStatus();
        if (status == null) {
            status = "";
        }
        return new oy.a(status, from.getProductId());
    }
}
