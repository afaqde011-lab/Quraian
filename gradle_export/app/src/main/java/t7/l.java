package t7;

import a8.l0;
import a8.m;
import androidx.media3.common.t;
import com.google.android.gms.internal.measurement.b5;
import g7.r;
import q3.e0;
import s7.z0;

public final class l extends a {
    public final int O;
    public final t P;
    public long Q;
    public boolean R;

    public l(g7.f fVar, g7.j jVar, t tVar, int i10, Object obj, long j9, long j10, long j11, int i11, t tVar2) {
        super(fVar, jVar, tVar, i10, obj, j9, j10, -9223372036854775807L, -9223372036854775807L, j11);
        this.O = i11;
        this.P = tVar2;
    }

    @Override
    public final boolean c() {
        return this.R;
    }

    @Override
    public final void h() {
        r rVar = this.I;
        e0 e0Var = this.M;
        e0Var.getClass();
        for (z0 z0Var : (z0[]) e0Var.C) {
            if (z0Var.E != 0) {
                z0Var.E = 0L;
                z0Var.f13820z = true;
            }
        }
        l0 l0VarU = e0Var.u(this.O);
        l0VarU.f(this.P);
        try {
            long jP = rVar.p(this.B.b(this.Q));
            if (jP != -1) {
                jP += this.Q;
            }
            m mVar = new m(this.I, this.Q, jP);
            for (int iA = 0; iA != -1; iA = l0VarU.a(mVar, Integer.MAX_VALUE, true)) {
                this.Q += (long) iA;
            }
            l0VarU.d(this.G, 1, (int) this.Q, 0, null);
            b5.n(rVar);
            this.R = true;
        } catch (Throwable th2) {
            b5.n(rVar);
            throw th2;
        }
    }

    @Override
    public final void l() {
    }
}
