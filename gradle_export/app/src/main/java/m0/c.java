package m0;

import l1.e1;
import l1.f1;

public final class c implements u00.a {
    public final int A;
    public final w B;

    public c(w wVar, int i10) {
        this.A = i10;
        this.B = wVar;
    }

    public final Object invoke() {
        int iL;
        int iH;
        switch (this.A) {
            case 0:
                iL = this.B.l();
                break;
            case 1:
                iL = this.B.l();
                break;
            case 2:
                w wVar = this.B;
                return Integer.valueOf(wVar.f10395k.a() ? wVar.f10400r.h() : ((f1) wVar.f10388d.B).h());
            case 3:
                w wVar2 = this.B;
                f1 f1Var = wVar2.f10399q;
                boolean zA = wVar2.f10395k.a();
                a2.o oVar = wVar2.f10388d;
                if (!zA) {
                    iH = ((f1) oVar.B).h();
                } else if (f1Var.h() != -1) {
                    iH = f1Var.h();
                } else if (Math.abs(((e1) oVar.D).h()) >= Math.abs(Math.min(wVar2.f10396n.A0(z.f10409a), wVar2.m() / 2.0f) / wVar2.m())) {
                    iH = ((Boolean) wVar2.D.getValue()).booleanValue() ? wVar2.f10389e + 1 : wVar2.f10389e;
                } else {
                    iH = ((f1) oVar.B).h();
                }
                iL = wVar2.j(iH);
                break;
            default:
                iL = this.B.l();
                break;
        }
        return Integer.valueOf(iL);
    }
}
