package sm;

import l1.e1;

public final class b0 implements u00.a {
    public final int A;
    public final e1 B;

    public b0(e1 e1Var, int i) {
        this.A = i;
        this.B = e1Var;
    }

    @Override
    public final Object invoke() {
        float fH;
        int i = this.A;
        e1 e1Var = this.B;
        switch (i) {
            case 0:
                fH = e1Var.h();
                break;
            default:
                fH = e1Var.h();
                break;
        }
        return Float.valueOf(fH);
    }
}
