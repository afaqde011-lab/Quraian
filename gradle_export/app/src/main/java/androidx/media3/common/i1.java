package androidx.media3.common;

public final class i1 implements e7.m {
    public final int A;
    public final int B;
    public final e1 C;
    public final e1 D;

    public i1(int i10, e1 e1Var, e1 e1Var2, int i11) {
        this.A = i11;
        this.B = i10;
        this.C = e1Var;
        this.D = e1Var2;
    }

    @Override
    public final void invoke(Object obj) {
        d1 d1Var = (d1) obj;
        switch (this.A) {
            case 0:
                int i10 = this.B;
                d1Var.h(i10);
                d1Var.U(this.C, this.D, i10);
                break;
            default:
                int i11 = this.B;
                d1Var.h(i11);
                d1Var.U(this.C, this.D, i11);
                break;
        }
    }
}
