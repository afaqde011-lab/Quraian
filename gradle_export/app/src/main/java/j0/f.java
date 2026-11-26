package j0;

import g00.b0;
import l1.g0;

public final class f implements u00.o {
    public final int A = 1;
    public final int B;
    public final g00.e C;

    public f(int i10, u00.k kVar) {
        this.B = i10;
        this.C = kVar;
    }

    public f(v1.c cVar, int i10) {
        this.C = cVar;
        this.B = i10;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                v1.c cVar = this.C;
                b bVar = (b) obj;
                l1.j jVar = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((g0) jVar).g(bVar) ? 4 : 2;
                }
                g0 g0Var = (g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    cVar.invoke(bVar, Integer.valueOf(this.B), jVar, Integer.valueOf(iIntValue & 14));
                } else {
                    g0Var.V();
                }
                break;
            default:
                u00.k kVar = this.C;
                l1.j jVar2 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e((b) obj, "$this$item");
                g0 g0Var2 = (g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    st.g.d(this.B, kVar, jVar2, 0);
                } else {
                    g0Var2.V();
                }
                break;
        }
        return b0.a;
    }
}
