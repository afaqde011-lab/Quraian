package e30;

import java.util.Iterator;
import java.util.List;

public final class h0 extends k30.d {
    public static final l9.f0 B = new l9.f0(21);
    public static final h0 C = new h0(h00.x.A);

    public h0(List list) {
        this.A = k30.k.A;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            gVar.getClass();
            String strM = kotlin.jvm.internal.a0.a.b(g.class).m();
            kotlin.jvm.internal.m.b(strM);
            int iJ = B.j(strM);
            int iA = this.A.a();
            if (iA != 0) {
                if (iA == 1) {
                    k30.a aVar = this.A;
                    try {
                        kotlin.jvm.internal.m.c(aVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                        k30.p pVar = (k30.p) aVar;
                        int i = pVar.B;
                        if (i == iJ) {
                            this.A = new k30.p(iJ, gVar);
                        } else {
                            k30.c cVar = new k30.c();
                            cVar.A = new Object[20];
                            cVar.B = 0;
                            cVar.c(i, pVar.A);
                            this.A = cVar;
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException(k30.d.a(aVar, 1, "OneElementArrayMap"), e);
                    }
                }
                this.A.c(iJ, gVar);
            } else {
                k30.a aVar2 = this.A;
                if (!(aVar2 instanceof k30.k)) {
                    throw new IllegalStateException(k30.d.a(aVar2, 0, "EmptyArrayMap"));
                }
                this.A = new k30.p(iJ, gVar);
            }
        }
    }
}
