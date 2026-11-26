package i7;

import androidx.media3.common.k2;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.framework.media.NotificationOptions;

public abstract class a implements e1 {
    public final int B;
    public i1 D;
    public int E;
    public j7.j F;
    public e7.b0 G;
    public int H;
    public s7.a1 I;
    public androidx.media3.common.t[] J;
    public long K;
    public long L;
    public boolean N;
    public boolean O;
    public s7.a0 Q;
    public v7.p R;
    public final Object A = new Object();
    public final h7.b C = new h7.b();
    public long M = Long.MIN_VALUE;
    public k2 P = k2.EMPTY;

    public a(int i10) {
        this.B = i10;
    }

    public static int c(int i10, int i11, int i12, int i13) {
        return i10 | i11 | i12 | Cast.MAX_NAMESPACE_LENGTH | i13;
    }

    public static boolean l(int i10, boolean z10) {
        int i11 = i10 & 7;
        if (i11 != 4) {
            return z10 && i11 == 3;
        }
        return true;
    }

    public void A(float f3, float f10) {
    }

    public abstract int B(androidx.media3.common.t tVar);

    public int C() {
        return 0;
    }

    public boolean D(long j9) {
        return false;
    }

    public final ExoPlaybackException d(Exception exc, androidx.media3.common.t tVar, boolean z10, int i10) {
        int iB;
        if (tVar == null || this.O) {
            iB = 4;
        } else {
            this.O = true;
            try {
                iB = B(tVar) & 7;
                this.O = false;
            } catch (ExoPlaybackException unused) {
                this.O = false;
                iB = 4;
            } catch (Throwable th2) {
                this.O = false;
                throw th2;
            }
        }
        return new ExoPlaybackException(1, exc, i10, i(), this.E, tVar, tVar == null ? 4 : iB, this.Q, z10);
    }

    @Override
    public void e(int i10, Object obj) {
    }

    public void f() {
    }

    public long g(long j9, long j10) {
        if (this.H != 1) {
            return NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS;
        }
        if (m() || k()) {
            return 1000000L;
        }
        return NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS;
    }

    public n0 h() {
        return null;
    }

    public abstract String i();

    public final boolean j() {
        return this.M == Long.MIN_VALUE;
    }

    public abstract boolean k();

    public abstract boolean m();

    public abstract void n();

    public void o(boolean z10, boolean z11) {
    }

    public abstract void p(long j9, boolean z10, boolean z11);

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u(androidx.media3.common.t[] tVarArr, long j9, long j10, s7.a0 a0Var) {
    }

    public void v() {
    }

    public final int w(h7.b bVar, h7.e eVar, int i10) {
        s7.a1 a1Var = this.I;
        a1Var.getClass();
        int iN = a1Var.n(bVar, eVar, i10);
        if (iN == -4) {
            if (eVar.c(4)) {
                this.M = Long.MIN_VALUE;
                return this.N ? -4 : -3;
            }
            long j9 = eVar.G + this.K;
            eVar.G = j9;
            this.M = Math.max(this.M, j9);
            return iN;
        }
        if (iN == -5) {
            androidx.media3.common.t tVar = (androidx.media3.common.t) bVar.B;
            tVar.getClass();
            long j10 = tVar.f1599s;
            if (j10 != Long.MAX_VALUE) {
                androidx.media3.common.s sVarA = tVar.a();
                sVarA.f1506r = j10 + this.K;
                bVar.B = new androidx.media3.common.t(sVarA);
            }
        }
        return iN;
    }

    public abstract void x(long j9, long j10);

    public final void y(androidx.media3.common.t[] tVarArr, s7.a1 a1Var, long j9, long j10, s7.a0 a0Var) {
        ta.c0.A(!this.N);
        this.I = a1Var;
        this.Q = a0Var;
        if (this.M == Long.MIN_VALUE) {
            this.M = j9;
        }
        this.J = tVarArr;
        this.K = j10;
        u(tVarArr, j9, j10, a0Var);
    }

    public final void z(long j9, boolean z10, boolean z11) {
        this.N = false;
        this.L = j9;
        this.M = j9;
        if (!z11) {
            s7.a1 a1Var = this.I;
            a1Var.getClass();
            z11 = a1Var.l(j9 - this.K) != 0;
        }
        p(j9, z10, z11);
    }
}
