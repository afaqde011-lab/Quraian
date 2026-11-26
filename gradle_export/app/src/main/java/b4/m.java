package b4;

import androidx.compose.ui.node.Owner;
import c3.n1;
import c3.o1;
import c3.r3;
import c3.s3;
import c3.w2;
import g00.b0;
import l1.g0;

public final class m extends kotlin.jvm.internal.n implements u00.n {
    public final int A = 1;
    public final Object B;
    public final Object C;
    public final Object D;

    public m(Owner owner, w2 w2Var, u00.n nVar, int i10) {
        super(2);
        this.B = owner;
        this.C = w2Var;
        this.D = nVar;
    }

    public m(s3 s3Var, n1 n1Var, u00.n nVar) {
        super(2);
        this.B = s3Var;
        this.C = n1Var;
        this.D = nVar;
    }

    public m(u00.k kVar, b2.r rVar, u00.k kVar2, int i10) {
        super(2);
        this.B = kVar;
        this.D = rVar;
        this.C = kVar2;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Number) obj2).intValue();
                l.a((u00.k) this.B, (b2.r) this.D, (u00.k) this.C, (l1.j) obj, l1.q.K(49));
                break;
            case 1:
                ((Number) obj2).intValue();
                o1.a((Owner) this.B, (w2) this.C, (u00.n) this.D, (l1.j) obj, l1.q.K(1));
                break;
            default:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                s3 s3Var = (s3) this.B;
                g0 g0Var = (g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c3.z zVar = s3Var.A;
                    boolean zI = g0Var.i(s3Var);
                    Object objN = g0Var.N();
                    k00.c cVar = null;
                    l1.c cVar2 = l1.i.f9868a;
                    if (zI || objN == cVar2) {
                        objN = new r3(s3Var, cVar, 0);
                        g0Var.n0(objN);
                    }
                    l1.q.i(zVar, jVar, (u00.n) objN);
                    boolean zI2 = g0Var.i(s3Var);
                    Object objN2 = g0Var.N();
                    if (zI2 || objN2 == cVar2) {
                        objN2 = new r3(s3Var, cVar, 1);
                        g0Var.n0(objN2);
                    }
                    l1.q.i(zVar, jVar, (u00.n) objN2);
                    ((n1) this.C).a(zVar, (u00.n) this.D, jVar, 0);
                } else {
                    g0Var.V();
                }
                break;
        }
        return b0.a;
    }
}
