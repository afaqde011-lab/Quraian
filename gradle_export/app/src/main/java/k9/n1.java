package k9;

public final class n1 implements i2, e7.h {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;

    public n1(c50.h hVar, s7.r rVar, s7.w wVar, int i10) {
        this.B = hVar;
        this.C = rVar;
        this.D = wVar;
        this.A = i10;
    }

    public n1(s1 s1Var, String str, int i10, e1 e1Var) {
        this.B = s1Var;
        this.C = str;
        this.A = i10;
        this.D = e1Var;
    }

    @Override
    public void accept(Object obj) {
        c50.h hVar = (c50.h) this.B;
        ((s7.g0) obj).c(hVar.B, (s7.a0) hVar.C, (s7.r) this.C, (s7.w) this.D, this.A);
    }

    @Override
    public void c(z1 z1Var, int i10) {
        s1 s1Var = (s1) this.B;
        String str = (String) this.C;
        e1 e1Var = (e1) this.D;
        if (s1Var.H.c(z1Var, str)) {
            z1Var.p(i10, this.A, str, e1Var);
        }
    }
}
