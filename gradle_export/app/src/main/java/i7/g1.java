package i7;

import androidx.media3.common.h2;
import androidx.media3.common.j2;
import androidx.media3.common.k2;

public final class g1 extends s7.p {

    public final int f7328b = 0;

    public final Object f7329c;

    public g1(k2 k2Var) {
        super(k2Var);
        this.f7329c = new j2();
    }

    public g1(k2 k2Var, androidx.media3.common.q0 q0Var) {
        super(k2Var);
        this.f7329c = q0Var;
    }

    @Override
    public h2 getPeriod(int i10, h2 h2Var, boolean z10) {
        switch (this.f7328b) {
            case 0:
                h2 period = this.f13728a.getPeriod(i10, h2Var, z10);
                if (getWindow(period.f1233c, (j2) this.f7329c).a()) {
                    period.j(h2Var.f1231a, h2Var.f1232b, h2Var.f1233c, h2Var.f1234d, h2Var.f1235e, androidx.media3.common.c.f1128f, true);
                } else {
                    period.f1236f = true;
                }
                return period;
            default:
                return super.getPeriod(i10, h2Var, z10);
        }
    }

    @Override
    public j2 getWindow(int i10, j2 j2Var, long j9) {
        switch (this.f7328b) {
            case 1:
                super.getWindow(i10, j2Var, j9);
                androidx.media3.common.q0 q0Var = (androidx.media3.common.q0) this.f7329c;
                j2Var.f1285c = q0Var;
                androidx.media3.common.l0 l0Var = q0Var.f1414b;
                j2Var.getClass();
                return j2Var;
            default:
                return super.getWindow(i10, j2Var, j9);
        }
    }
}
