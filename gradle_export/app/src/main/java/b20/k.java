package b20;

import h00.j0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class k implements u00.a {
    public final int A;
    public final n B;

    public k(n nVar, int i) {
        this.A = i;
        this.B = nVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                Class<?>[] declaredClasses = this.B.o.a.getDeclaredClasses();
                kotlin.jvm.internal.m.d(declaredClasses, "getDeclaredClasses(...)");
                return h00.q.r1(q30.l.u0(q30.l.s0(new q30.f(h00.n.l0(declaredClasses), false, p10.c.D), p10.c.E)));
            case 1:
                List listB = this.B.o.b();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listB) {
                    if (((p10.u) obj).a.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int iP = h00.d0.P(h00.r.q0(arrayList, 10));
                if (iP < 16) {
                    iP = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((p10.u) obj2).c(), obj2);
                }
                return linkedHashMap;
            default:
                n nVar = this.B;
                return j0.q0(nVar.b(), nVar.f());
        }
    }
}
