package s7;

public final class d0 implements e7.h {
    public final int A;
    public final c50.h B;
    public final r C;
    public final w D;

    public d0(c50.h hVar, r rVar, w wVar, int i10) {
        this.A = i10;
        this.B = hVar;
        this.C = rVar;
        this.D = wVar;
    }

    @Override
    public final void accept(Object obj) {
        g0 g0Var = (g0) obj;
        switch (this.A) {
            case 0:
                c50.h hVar = this.B;
                g0Var.b(hVar.B, (a0) hVar.C, this.C, this.D);
                break;
            default:
                c50.h hVar2 = this.B;
                g0Var.j(hVar2.B, (a0) hVar2.C, this.C, this.D);
                break;
        }
    }
}
