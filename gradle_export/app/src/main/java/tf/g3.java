package tf;

import java.util.Objects;

public final class g3 implements Runnable {
    public final int A;
    public final long B;
    public final j3 C;

    public g3(j3 j3Var, long j9, int i10) {
        this.A = i10;
        switch (i10) {
            case 1:
                this.B = j9;
                Objects.requireNonNull(j3Var);
                this.C = j3Var;
                break;
            default:
                this.B = j9;
                Objects.requireNonNull(j3Var);
                this.C = j3Var;
                break;
        }
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                j3 j3Var = this.C;
                s7.w0 w0Var = j3Var.G;
                j3Var.V0();
                j3Var.Z0();
                h1 h1Var = (h1) j3Var.B;
                q0 q0Var = h1Var.F;
                h1.g(q0Var);
                b50.b bVar = q0Var.O;
                long j9 = this.B;
                bVar.c(Long.valueOf(j9), "Activity resumed, time");
                g gVar = h1Var.D;
                if (gVar.f1(null, b0.U0)) {
                    if (gVar.j1() || j3Var.E) {
                        ((j3) w0Var.D).V0();
                        ((i3) w0Var.C).c();
                        w0Var.A = j9;
                        w0Var.B = j9;
                    }
                } else if (gVar.j1()) {
                    ((j3) w0Var.D).V0();
                    ((i3) w0Var.C).c();
                    w0Var.A = j9;
                    w0Var.B = j9;
                } else {
                    w0 w0Var2 = h1Var.E;
                    h1.e(w0Var2);
                    if (w0Var2.T.a()) {
                        ((j3) w0Var.D).V0();
                        ((i3) w0Var.C).c();
                        w0Var.A = j9;
                        w0Var.B = j9;
                    }
                }
                s10.w0 w0Var3 = j3Var.H;
                j3 j3Var2 = (j3) w0Var3.C;
                j3Var2.V0();
                h1 h1Var2 = (h1) j3Var2.B;
                h3 h3Var = (h3) w0Var3.B;
                if (h3Var != null) {
                    j3Var2.D.removeCallbacks(h3Var);
                }
                w0 w0Var4 = h1Var2.E;
                i2 i2Var = h1Var2.M;
                h1.e(w0Var4);
                w0Var4.T.b(false);
                j3Var2.V0();
                j3Var2.E = false;
                if (h1Var2.D.f1(null, b0.T0)) {
                    h1.f(i2Var);
                    if (i2Var.O) {
                        q0 q0Var2 = h1Var2.F;
                        h1.g(q0Var2);
                        q0Var2.O.b("Retrying trigger URI registration in foreground");
                        h1.f(i2Var);
                        i2Var.u1();
                    }
                }
                o9.q qVar = j3Var.F;
                j3 j3Var3 = (j3) qVar.B;
                j3Var3.V0();
                h1 h1Var3 = (h1) j3Var3.B;
                if (h1Var3.a()) {
                    h1Var3.K.getClass();
                    qVar.a0(System.currentTimeMillis());
                    break;
                }
                break;
            default:
                j3 j3Var4 = this.C;
                j3Var4.V0();
                j3Var4.Z0();
                h1 h1Var4 = (h1) j3Var4.B;
                q0 q0Var3 = h1Var4.F;
                h1.g(q0Var3);
                b50.b bVar2 = q0Var3.O;
                long j10 = this.B;
                bVar2.c(Long.valueOf(j10), "Activity paused, time");
                s10.w0 w0Var5 = j3Var4.H;
                j3 j3Var5 = (j3) w0Var5.C;
                ((h1) j3Var5.B).K.getClass();
                h3 h3Var2 = new h3(w0Var5, System.currentTimeMillis(), j10);
                w0Var5.B = h3Var2;
                j3Var5.D.postDelayed(h3Var2, 2000L);
                if (h1Var4.D.j1()) {
                    ((i3) j3Var4.G.C).c();
                }
                break;
        }
    }
}
