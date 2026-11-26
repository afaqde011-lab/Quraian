package j10;

import java.util.List;

public final class b0 implements u00.k {
    public final int A;
    public final oj.q B;

    public b0(oj.q qVar, int i) {
        this.A = i;
        this.B = qVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                n20.c fqName = (n20.c) obj;
                kotlin.jvm.internal.m.e(fqName, "fqName");
                return new i10.m((z) this.B.C, fqName, 1);
            default:
                c0 c0Var = (c0) obj;
                kotlin.jvm.internal.m.e(c0Var, "<destruct>");
                n20.b bVar = c0Var.a;
                List list = c0Var.b;
                if (bVar.c) {
                    throw new UnsupportedOperationException("Unresolved local class: " + bVar);
                }
                n20.b bVarE = bVar.e();
                oj.q qVar = this.B;
                g gVarB = bVarE != null ? qVar.B(bVarE, h00.q.H0(list, 1)) : (g) ((d30.e) qVar.D).invoke(bVar.a);
                boolean zG = bVar.g();
                d30.l lVar = (d30.l) qVar.B;
                n20.e eVarF = bVar.f();
                Integer num = (Integer) h00.q.N0(list);
                return new d0(lVar, gVarB, eVarF, zG, num != null ? num.intValue() : 0);
        }
    }
}
