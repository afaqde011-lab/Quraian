package tf;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class a2 implements Runnable {
    public final int A;
    public final long B;
    public final i2 C;

    public a2(i2 i2Var, long j9, int i10) {
        this.A = i10;
        switch (i10) {
            case 1:
                this.B = j9;
                Objects.requireNonNull(i2Var);
                this.C = i2Var;
                break;
            default:
                this.B = j9;
                Objects.requireNonNull(i2Var);
                this.C = i2Var;
                break;
        }
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                h1 h1Var = (h1) this.C.B;
                w0 w0Var = h1Var.E;
                h1.e(w0Var);
                i7.m1 m1Var = w0Var.L;
                long j9 = this.B;
                m1Var.f(j9);
                q0 q0Var = h1Var.F;
                h1.g(q0Var);
                q0Var.N.c(Long.valueOf(j9), "Session timeout duration set");
                break;
            default:
                i2 i2Var = this.C;
                i2Var.V0();
                i2Var.W0();
                h1 h1Var2 = (h1) i2Var.B;
                q0 q0Var2 = h1Var2.F;
                h1.g(q0Var2);
                q0Var2.N.b("Resetting analytics data (FE)");
                j3 j3Var = h1Var2.H;
                h1.f(j3Var);
                j3Var.V0();
                s7.w0 w0Var2 = j3Var.G;
                ((i3) w0Var2.C).c();
                ((h1) ((j3) w0Var2.D).B).K.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                w0Var2.A = jElapsedRealtime;
                w0Var2.B = jElapsedRealtime;
                h1Var2.l().a1();
                boolean z10 = !h1Var2.a();
                w0 w0Var3 = h1Var2.E;
                h1.e(w0Var3);
                w0Var3.G.f(this.B);
                h1 h1Var3 = (h1) w0Var3.B;
                w0 w0Var4 = h1Var3.E;
                h1.e(w0Var4);
                if (!TextUtils.isEmpty(w0Var4.W.p())) {
                    w0Var3.W.r(null);
                }
                w0Var3.Q.f(0L);
                w0Var3.R.f(0L);
                if (!h1Var3.D.i1()) {
                    w0Var3.e1(z10);
                }
                w0Var3.X.r(null);
                w0Var3.Y.f(0L);
                w0Var3.Z.G((Bundle) null);
                c3 c3VarJ = h1Var2.j();
                c3VarJ.V0();
                c3VarJ.W0();
                g4 g4VarL1 = c3VarJ.l1(false);
                c3VarJ.h1();
                ((h1) c3VarJ.B).i().Z0();
                c3VarJ.j1(new x2(c3VarJ, g4VarL1, 0));
                h1.f(j3Var);
                j3Var.F.Z();
                i2Var.T = z10;
                h1Var2.j().Z0(new AtomicReference());
                break;
        }
    }
}
