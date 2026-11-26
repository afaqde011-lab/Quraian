package i7;

import fh.d2;
import java.util.List;
import k9.a2;
import k9.n3;
import k9.s1;

public final class t implements e7.m, n3 {
    public final int A;
    public final List B;

    public t(int i10, d2 d2Var) {
        this.A = i10;
        this.B = d2Var;
    }

    public t(j7.a aVar, List list) {
        this.A = 1;
        this.B = list;
    }

    @Override
    public Object d(s1 s1Var, a2 a2Var, int i10) {
        int i11 = this.A;
        List list = this.B;
        switch (i11) {
            case 2:
                break;
        }
        return s1Var.r(a2Var, list);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.A) {
            case 0:
                ((androidx.media3.common.d1) obj).L(this.B);
                break;
            default:
                ((j7.i) obj).getClass();
                break;
        }
    }
}
