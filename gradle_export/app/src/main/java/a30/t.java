package a30;

import i20.c1;

public final class t implements u00.a {
    public final int A;
    public final u B;
    public final x C;
    public final o20.b D;
    public final int E;
    public final int F;
    public final c1 G;

    public t(u uVar, x xVar, o20.b bVar, int i, int i2, c1 c1Var, int i3) {
        this.A = i3;
        this.B = uVar;
        this.C = xVar;
        this.D = bVar;
        this.E = i;
        this.F = i2;
        this.G = c1Var;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                return h00.q.n1(((i) this.B.a.a).e.b(this.C, this.D, this.E, this.F, this.G));
            default:
                return h00.q.n1(((i) this.B.a.a).e.c(this.C, this.D, this.E, this.F, this.G));
        }
    }
}
