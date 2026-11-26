package s7;

import androidx.media3.common.h2;
import androidx.media3.common.j2;
import androidx.media3.common.k2;

public final class u extends k2 {

    public final androidx.media3.common.q0 f13759a;

    public u(androidx.media3.common.q0 q0Var) {
        this.f13759a = q0Var;
    }

    @Override
    public final int getIndexOfPeriod(Object obj) {
        return obj == t.f13756d ? 0 : -1;
    }

    @Override
    public final h2 getPeriod(int i10, h2 h2Var, boolean z10) {
        h2Var.j(z10 ? 0 : null, z10 ? t.f13756d : null, 0, -9223372036854775807L, 0L, androidx.media3.common.c.f1128f, true);
        return h2Var;
    }

    @Override
    public final int getPeriodCount() {
        return 1;
    }

    @Override
    public final Object getUidOfPeriod(int i10) {
        return t.f13756d;
    }

    @Override
    public final j2 getWindow(int i10, j2 j2Var, long j9) {
        j2Var.b(j2.f1273q, this.f13759a, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        j2Var.f1293k = true;
        return j2Var;
    }

    @Override
    public final int getWindowCount() {
        return 1;
    }
}
