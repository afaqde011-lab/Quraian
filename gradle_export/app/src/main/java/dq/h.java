package dq;

import g00.b0;

public final class h implements u00.a {
    public final int A;
    public final u B;

    public h(u uVar, int i) {
        this.A = i;
        this.B = uVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                this.B.l(new b(false));
                break;
            case 1:
                this.B.l(a.a);
                break;
            case 2:
                this.B.l(a.a);
                break;
            case 3:
                this.B.l(new b(false));
                break;
            default:
                this.B.l(new b(true));
                break;
        }
        return b0.a;
    }
}
