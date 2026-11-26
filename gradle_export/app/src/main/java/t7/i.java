package t7;

import a8.l0;
import a8.m;
import androidx.media3.common.t;
import androidx.media3.common.x0;
import com.google.android.gms.internal.measurement.b5;
import e7.u;
import g7.r;
import q3.e0;
import s7.z0;
import ta.c0;

public final class i extends a {
    public final int O;
    public final long P;
    public final d Q;
    public long R;
    public volatile boolean S;
    public boolean T;

    public i(g7.f fVar, g7.j jVar, t tVar, int i10, Object obj, long j9, long j10, long j11, long j12, long j13, int i11, long j14, d dVar) {
        super(fVar, jVar, tVar, i10, obj, j9, j10, j11, j12, j13);
        this.O = i11;
        this.P = j14;
        this.Q = dVar;
    }

    @Override
    public final long b() {
        return this.J + ((long) this.O);
    }

    @Override
    public final boolean c() {
        return this.T;
    }

    @Override
    public final void h() {
        e0 e0Var = this.M;
        e0Var.getClass();
        if (this.R == 0) {
            long j9 = this.P;
            for (z0 z0Var : (z0[]) e0Var.C) {
                if (z0Var.E != j9) {
                    z0Var.E = j9;
                    z0Var.f13820z = true;
                }
            }
            d dVar = this.Q;
            long j10 = this.K;
            long j11 = j10 == -9223372036854775807L ? -9223372036854775807L : j10 - this.P;
            long j12 = this.L;
            dVar.c(e0Var, j11, j12 != -9223372036854775807L ? j12 - this.P : -9223372036854775807L);
        }
        try {
            g7.j jVarB = this.B.b(this.R);
            r rVar = this.I;
            m mVar = new m(rVar, jVarB.f6222e, rVar.p(jVarB));
            while (!this.S) {
                try {
                    int iD = this.Q.A.d(mVar, d.K);
                    c0.A(iD != 1);
                    if (!(iD == 0)) {
                        break;
                    }
                } catch (Throwable th2) {
                    this.R = mVar.D - this.B.f6222e;
                    throw th2;
                }
            }
            t tVar = this.D;
            String str = tVar.m;
            int i10 = tVar.M;
            int i11 = tVar.N;
            if (x0.k(str) && ((i10 > 1 || i11 > 1) && i10 != -1 && i11 != -1)) {
                l0 l0VarU = e0Var.u(4);
                int i12 = i10 * i11;
                long j13 = (this.H - this.G) / ((long) i12);
                for (int i13 = 1; i13 < i12; i13++) {
                    l0VarU.g(0, new u());
                    l0VarU.d(((long) i13) * j13, 0, 0, 0, null);
                }
            }
            this.R = mVar.D - this.B.f6222e;
            b5.n(this.I);
            this.T = !this.S;
        } catch (Throwable th3) {
            b5.n(this.I);
            throw th3;
        }
    }

    @Override
    public final void l() {
        this.S = true;
    }
}
