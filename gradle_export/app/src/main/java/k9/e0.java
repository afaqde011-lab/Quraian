package k9;

import java.util.List;

public final class e0 implements p0 {
    public final int A;
    public final t0 B;
    public final List C;

    public e0(t0 t0Var, List list, int i10) {
        this.A = i10;
        this.B = t0Var;
        this.C = list;
    }

    @Override
    public final void b(m mVar, int i10) {
        switch (this.A) {
            case 0:
                d1 d1Var = this.B.f9440c;
                fh.q0 q0VarM = fh.t0.m();
                int i11 = 0;
                while (true) {
                    List list = this.C;
                    if (i11 >= list.size()) {
                        mVar.j1(d1Var, i10, new androidx.media3.common.g(q0VarM.g()));
                    } else {
                        q0VarM.c(((androidx.media3.common.q0) list.get(i11)).c(true));
                        i11++;
                    }
                    break;
                }
                break;
            default:
                d1 d1Var2 = this.B.f9440c;
                fh.q0 q0VarM2 = fh.t0.m();
                int i12 = 0;
                while (true) {
                    List list2 = this.C;
                    if (i12 >= list2.size()) {
                        mVar.m1(d1Var2, i10, new androidx.media3.common.g(q0VarM2.g()));
                    } else {
                        q0VarM2.c(((androidx.media3.common.q0) list2.get(i12)).c(true));
                        i12++;
                    }
                    break;
                }
                break;
        }
    }
}
