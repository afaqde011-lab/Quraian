package s7;

import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import java.io.IOException;

public final class q0 implements a1 {
    public final int A;
    public final s0 B;

    public q0(s0 s0Var, int i10) {
        this.B = s0Var;
        this.A = i10;
    }

    @Override
    public final void a() throws IOException {
        int i10 = this.A;
        s0 s0Var = this.B;
        z0 z0Var = s0Var.V[i10];
        n7.e eVar = z0Var.f13804h;
        if (eVar != null && eVar.getState() == 1) {
            DrmSession$DrmSessionException drmSession$DrmSessionExceptionF = z0Var.f13804h.f();
            drmSession$DrmSessionExceptionF.getClass();
            throw drmSession$DrmSessionExceptionF;
        }
        w7.l lVar = s0Var.M;
        int iN = s0Var.D.n(s0Var.f13744f0);
        IOException iOException = lVar.f15878c;
        if (iOException != null) {
            throw iOException;
        }
        w7.i iVar = lVar.f15877b;
        if (iVar != null) {
            if (iN == Integer.MIN_VALUE) {
                iN = iVar.A;
            }
            IOException iOException2 = iVar.E;
            if (iOException2 != null && iVar.F > iN) {
                throw iOException2;
            }
        }
    }

    @Override
    public final boolean b() {
        s0 s0Var = this.B;
        return !s0Var.E() && s0Var.V[this.A].s(s0Var.f13754p0);
    }

    @Override
    public final int l(long j9) {
        s0 s0Var = this.B;
        if (s0Var.E()) {
            return 0;
        }
        int i10 = this.A;
        s0Var.z(i10);
        z0 z0Var = s0Var.V[i10];
        int iR = z0Var.r(s0Var.f13754p0, j9);
        z0Var.z(iR);
        if (iR == 0) {
            s0Var.A(i10);
        }
        return iR;
    }

    @Override
    public final int n(h7.b bVar, h7.e eVar, int i10) {
        s0 s0Var = this.B;
        if (s0Var.E()) {
            return -3;
        }
        int i11 = this.A;
        s0Var.z(i11);
        int iV = s0Var.V[i11].v(bVar, eVar, i10, s0Var.f13754p0);
        if (iV == -3) {
            s0Var.A(i11);
        }
        return iV;
    }
}
