package i2;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.b5;

public final class q0 implements c0 {
    public int A;
    public float B = 1.0f;
    public float C = 1.0f;
    public float D = 1.0f;
    public float E;
    public float F;
    public float G;
    public long H;
    public long I;
    public float J;
    public float K;
    public long L;
    public t0 M;
    public boolean N;
    public int O;
    public long P;
    public y3.c Q;
    public y3.m R;
    public p0 S;
    public m T;
    public int U;
    public l0 V;

    public q0() {
        long j9 = d0.f7118a;
        this.H = j9;
        this.I = j9;
        this.K = 8.0f;
        this.L = w0.f7175b;
        this.M = b0.f7111b;
        this.O = 0;
        this.P = 9205357640488583168L;
        this.Q = b5.d();
        this.R = y3.m.A;
        this.U = 3;
    }

    @Override
    public final void B0() {
    }

    @Override
    public final void C(int i10) {
        if (this.U == i10) {
            return;
        }
        this.A |= 524288;
        this.U = i10;
    }

    @Override
    public final void D0(long j9) {
        if (t.c(this.H, j9)) {
            return;
        }
        this.A |= 64;
        this.H = j9;
    }

    @Override
    public final void I(p0 p0Var) {
        if (kotlin.jvm.internal.m.a(this.S, p0Var)) {
            return;
        }
        this.A |= 131072;
        this.S = p0Var;
    }

    @Override
    public final void I0(float f3) {
        if (this.B == f3) {
            return;
        }
        this.A |= 1;
        this.B = f3;
    }

    @Override
    public final void K(m mVar) {
        if (kotlin.jvm.internal.m.a(this.T, mVar)) {
            return;
        }
        this.A |= 262144;
        this.T = mVar;
    }

    @Override
    public final void L0(boolean z10) {
        if (this.N != z10) {
            this.A |= 16384;
            this.N = z10;
        }
    }

    @Override
    public final void N(float f3) {
        if (this.C == f3) {
            return;
        }
        this.A |= 2;
        this.C = f3;
    }

    @Override
    public final void Q(int i10) {
        if (this.O == i10) {
            return;
        }
        this.A |= 32768;
        this.O = i10;
    }

    @Override
    public final void S0(long j9) {
        if (w0.a(this.L, j9)) {
            return;
        }
        this.A |= 4096;
        this.L = j9;
    }

    @Override
    public final void T0(float f3) {
        if (this.E == f3) {
            return;
        }
        this.A |= 8;
        this.E = f3;
    }

    @Override
    public final void U0(long j9) {
        if (t.c(this.I, j9)) {
            return;
        }
        this.A |= Cast.MAX_NAMESPACE_LENGTH;
        this.I = j9;
    }

    public final void a() {
        I0(1.0f);
        N(1.0f);
        s0(1.0f);
        T0(0.0f);
        w(0.0f);
        n(0.0f);
        long j9 = d0.f7118a;
        D0(j9);
        U0(j9);
        v(0.0f);
        g1(8.0f);
        S0(w0.f7175b);
        z0(b0.f7111b);
        L0(false);
        I(null);
        K(null);
        C(3);
        Q(0);
        this.P = 9205357640488583168L;
        this.V = null;
        this.A = 0;
    }

    @Override
    public final long b() {
        return this.P;
    }

    @Override
    public final float c() {
        return this.Q.c();
    }

    @Override
    public final void g1(float f3) {
        if (this.K == f3) {
            return;
        }
        this.A |= 2048;
        this.K = f3;
    }

    @Override
    public final float j1() {
        return this.C;
    }

    @Override
    public final float l() {
        return this.B;
    }

    @Override
    public final void n(float f3) {
        if (this.G == f3) {
            return;
        }
        this.A |= 32;
        this.G = f3;
    }

    @Override
    public final void p0() {
    }

    @Override
    public final void s0(float f3) {
        if (this.D == f3) {
            return;
        }
        this.A |= 4;
        this.D = f3;
    }

    @Override
    public final float t0() {
        return this.Q.t0();
    }

    @Override
    public final void v(float f3) {
        if (this.J == f3) {
            return;
        }
        this.A |= 1024;
        this.J = f3;
    }

    @Override
    public final void w(float f3) {
        if (this.F == f3) {
            return;
        }
        this.A |= 16;
        this.F = f3;
    }

    @Override
    public final void z0(t0 t0Var) {
        if (kotlin.jvm.internal.m.a(this.M, t0Var)) {
            return;
        }
        this.A |= 8192;
        this.M = t0Var;
    }
}
