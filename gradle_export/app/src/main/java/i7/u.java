package i7;

import androidx.media3.common.w2;

public final class u implements e7.m {
    public final int A = 0;
    public final w2 B;

    public u(w2 w2Var) {
        this.B = w2Var;
    }

    public u(j7.a aVar, w2 w2Var) {
        this.B = w2Var;
    }

    @Override
    public final void invoke(Object obj) {
        switch (this.A) {
            case 0:
                ((androidx.media3.common.d1) obj).a(this.B);
                break;
            default:
                j7.i iVar = (j7.i) obj;
                c50.h hVar = iVar.f8237p;
                w2 w2Var = this.B;
                if (hVar != null) {
                    androidx.media3.common.t tVar = (androidx.media3.common.t) hVar.C;
                    if (tVar.f1602v == -1) {
                        androidx.media3.common.s sVarA = tVar.a();
                        sVarA.f1508t = w2Var.f1673a;
                        sVarA.f1509u = w2Var.f1674b;
                        iVar.f8237p = new c50.h(hVar.B, 10, new androidx.media3.common.t(sVarA), (String) hVar.D);
                    }
                }
                int i10 = w2Var.f1673a;
                break;
        }
    }
}
