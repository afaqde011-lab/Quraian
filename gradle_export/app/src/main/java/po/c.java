package po;

import g00.b0;

public final class c implements u00.a {
    public final int A;
    public final u00.k B;
    public final lo.l C;

    public c(u00.k kVar, lo.l lVar, int i) {
        this.A = i;
        this.B = kVar;
        this.C = lVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                this.B.invoke(Integer.valueOf(this.C.a));
                break;
            case 1:
                this.B.invoke(Integer.valueOf(this.C.a));
                break;
            case 2:
                this.B.invoke(new qo.f(this.C.a));
                break;
            case 3:
                this.B.invoke(new qo.d(this.C.a));
                break;
            case 4:
                this.B.invoke(new qo.h(this.C.a));
                break;
            default:
                this.B.invoke(new qo.j(this.C.a));
                break;
        }
        return b0.a;
    }
}
