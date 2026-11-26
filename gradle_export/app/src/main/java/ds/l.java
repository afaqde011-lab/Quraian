package ds;

import du.n0;
import e1.h0;
import l1.p2;

public final class l implements u00.a {
    public final int A;
    public final p2 B;

    public l(p2 p2Var, int i) {
        this.A = i;
        this.B = p2Var;
    }

    @Override
    public final Object invoke() {
        int i = this.A;
        p2 p2Var = this.B;
        switch (i) {
            case 0:
                return Float.valueOf(((Number) p2Var.getValue()).floatValue());
            case 1:
                return kh.n.T(new Object[]{Boolean.valueOf(((n0) p2Var.getValue()).a)});
            case 2:
                return new h2.b(((h2.b) p2Var.getValue()).a);
            case 3:
                x.l lVar = h0.a;
                return new h2.b(((h2.b) p2Var.getValue()).a);
            case 4:
                return Float.valueOf(((Number) p2Var.getValue()).floatValue());
            case 5:
                return Float.valueOf(((Number) p2Var.getValue()).floatValue());
            case 6:
                return Boolean.valueOf(((Number) p2Var.getValue()).floatValue() > 0.0f);
            case 7:
                return Boolean.valueOf(((Number) p2Var.getValue()).floatValue() > 0.0f);
            case 8:
                return Float.valueOf(((Number) p2Var.getValue()).floatValue());
            case 9:
                return Float.valueOf(((Number) p2Var.getValue()).floatValue());
            case 10:
                return Float.valueOf(((Number) p2Var.getValue()).floatValue());
            case 11:
                return Float.valueOf(((Number) p2Var.getValue()).floatValue());
            case 12:
                return Float.valueOf(((Number) p2Var.getValue()).floatValue());
            case 13:
                return Float.valueOf(((Number) p2Var.getValue()).floatValue());
            default:
                return Float.valueOf(((Number) p2Var.getValue()).floatValue());
        }
    }
}
