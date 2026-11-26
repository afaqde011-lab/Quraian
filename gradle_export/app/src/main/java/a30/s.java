package a30;

import i20.j0;
import java.util.List;

public final class s implements u00.a {
    public final int A = 0;
    public final boolean B;
    public final Object C;
    public final Object D;

    public s(u uVar, boolean z, j0 j0Var) {
        this.C = uVar;
        this.B = z;
        this.D = j0Var;
    }

    public s(boolean z, u00.k kVar, ot.a aVar) {
        this.B = z;
        this.C = kVar;
        this.D = aVar;
    }

    @Override
    public final Object invoke() {
        List listN1;
        switch (this.A) {
            case 0:
                u uVar = (u) this.C;
                j0 j0Var = (j0) this.D;
                k kVar = uVar.a;
                j10.k kVar2 = (j10.k) kVar.c;
                a aVar = ((i) kVar.a).e;
                x xVarA = uVar.a(kVar2);
                if (xVarA != null) {
                    listN1 = this.B ? h00.q.n1(aVar.i(xVarA, j0Var)) : h00.q.n1(aVar.h(xVarA, j0Var));
                } else {
                    listN1 = null;
                }
                return listN1 == null ? h00.x.A : listN1;
            default:
                if (this.B) {
                    ((u00.k) this.C).invoke(Integer.valueOf(((ot.a) this.D).a));
                }
                return g00.b0.a;
        }
    }
}
