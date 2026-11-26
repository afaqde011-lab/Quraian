package w;

public final class n extends kotlin.jvm.internal.n implements u00.k {
    public final z2.l1[] A;
    public final o B;
    public final int C;
    public final int D;

    public n(z2.l1[] l1VarArr, o oVar, int i10, int i11) {
        super(1);
        this.A = l1VarArr;
        this.B = oVar;
        this.C = i10;
        this.D = i11;
    }

    public final Object invoke(Object obj) {
        z2.k1 k1Var = (z2.k1) obj;
        for (z2.l1 l1Var : this.A) {
            if (l1Var != null) {
                long jA = this.B.f15798a.f15813b.a((((long) l1Var.A) << 32) | (((long) l1Var.B) & 4294967295L), (((long) this.C) << 32) | (((long) this.D) & 4294967295L), y3.m.A);
                k1Var.h(l1Var, (int) (jA >> 32), (int) (jA & 4294967295L), 0.0f);
            }
        }
        return g00.b0.a;
    }
}
