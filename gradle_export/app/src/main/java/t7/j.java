package t7;

import a8.m;
import androidx.media3.common.t;
import com.google.android.gms.internal.measurement.b5;
import g7.r;
import q3.e0;
import ta.c0;

public final class j extends e {
    public final d J;
    public e0 K;
    public long L;
    public volatile boolean M;

    public j(g7.f fVar, g7.j jVar, t tVar, int i10, Object obj, d dVar) {
        super(fVar, jVar, 2, tVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.J = dVar;
    }

    @Override
    public final void h() {
        if (this.L == 0) {
            this.J.c(this.K, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            g7.j jVarB = this.B.b(this.L);
            r rVar = this.I;
            m mVar = new m(rVar, jVarB.f6222e, rVar.p(jVarB));
            while (!this.M) {
                try {
                    int iD = this.J.A.d(mVar, d.K);
                    boolean z10 = false;
                    c0.A(iD != 1);
                    if (iD == 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        break;
                    }
                } catch (Throwable th2) {
                    this.L = mVar.D - this.B.f6222e;
                    this.J.a();
                    throw th2;
                }
            }
            this.L = mVar.D - this.B.f6222e;
            this.J.a();
            b5.n(this.I);
        } catch (Throwable th3) {
            b5.n(this.I);
            throw th3;
        }
    }

    @Override
    public final void l() {
        this.M = true;
    }
}
