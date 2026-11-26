package ez;

import c3.p1;
import c3.t2;
import g00.b0;
import l1.p2;

public final class o implements u00.a {
    public final int A;
    public final t2 B;
    public final u00.k C;
    public final p2 D;

    public o(t2 t2Var, u00.k kVar, p2 p2Var, int i) {
        this.A = i;
        this.B = t2Var;
        this.C = kVar;
        this.D = p2Var;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                if (((Boolean) this.D.getValue()).booleanValue()) {
                    p1 p1Var = this.B;
                    if (p1Var != null) {
                        p1Var.a();
                    }
                    this.C.invoke(g.a);
                }
                break;
            case 1:
                if (((Boolean) this.D.getValue()).booleanValue()) {
                    p1 p1Var2 = this.B;
                    if (p1Var2 != null) {
                        p1Var2.a();
                    }
                    this.C.invoke(jp.e.a);
                }
                break;
            default:
                if (((Boolean) this.D.getValue()).booleanValue()) {
                    p1 p1Var3 = this.B;
                    if (p1Var3 != null) {
                        p1Var3.a();
                    }
                    this.C.invoke(jp.p.a);
                }
                break;
        }
        return b0.a;
    }
}
