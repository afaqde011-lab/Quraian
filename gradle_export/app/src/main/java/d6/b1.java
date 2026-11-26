package d6;

import java.util.List;

public final class b1 implements u00.k {
    public final int A;
    public final f1 B;
    public final int[] C;

    public b1(f1 f1Var, int[] iArr, int i10) {
        this.A = i10;
        this.B = f1Var;
        this.C = iArr;
    }

    public final Object invoke(Object obj) {
        f6.a aVar = (f6.a) obj;
        switch (this.A) {
            case 0:
                f6.b bVarS = f6.c.s();
                String canonicalName = this.B.getClass().getCanonicalName();
                bVarS.c();
                f6.c.n((f6.c) bVarS.B, canonicalName);
                List listU0 = h00.n.U0(this.C);
                bVarS.c();
                f6.c.o((f6.c) bVarS.B, listU0);
                f6.c cVar = (f6.c) bVarS.a();
                aVar.c();
                f6.n.p((f6.n) aVar.B, cVar);
                break;
            default:
                f6.l lVarS = f6.m.s();
                String canonicalName2 = this.B.getClass().getCanonicalName();
                lVarS.c();
                f6.m.n((f6.m) lVarS.B, canonicalName2);
                List listU1 = h00.n.U0(this.C);
                lVarS.c();
                f6.m.o((f6.m) lVarS.B, listU1);
                f6.m mVar = (f6.m) lVarS.a();
                aVar.c();
                f6.n.n((f6.n) aVar.B, mVar);
                break;
        }
        return g00.b0.a;
    }
}
