package tf;

import android.os.RemoteException;
import java.util.Objects;

public final class y2 implements Runnable {
    public final int A;
    public final g4 B;
    public final c3 C;

    public y2(c3 c3Var, g4 g4Var, int i10) {
        this.A = i10;
        switch (i10) {
            case 1:
                this.B = g4Var;
                Objects.requireNonNull(c3Var);
                this.C = c3Var;
                break;
            default:
                this.B = g4Var;
                this.C = c3Var;
                break;
        }
    }

    @Override
    public final void run() throws Throwable {
        switch (this.A) {
            case 0:
                c3 c3Var = this.C;
                e0 e0Var = c3Var.E;
                h1 h1Var = (h1) c3Var.B;
                if (e0Var == null) {
                    q0 q0Var = h1Var.F;
                    h1.g(q0Var);
                    q0Var.G.b("Discarding data. Failed to send app launch");
                } else {
                    try {
                        g4 g4Var = this.B;
                        g gVar = h1Var.D;
                        a0 a0Var = b0.f14550b1;
                        if (gVar.f1(null, a0Var)) {
                            c3Var.n1(e0Var, null, g4Var);
                        }
                        e0Var.m(g4Var);
                        h1Var.i().a1();
                        h1Var.D.f1(null, a0Var);
                        c3Var.n1(e0Var, null, g4Var);
                        c3Var.i1();
                    } catch (RemoteException e3) {
                        q0 q0Var2 = h1Var.F;
                        h1.g(q0Var2);
                        q0Var2.G.c(e3, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            default:
                c3 c3Var2 = this.C;
                e0 e0Var2 = c3Var2.E;
                h1 h1Var2 = (h1) c3Var2.B;
                if (e0Var2 == null) {
                    q0 q0Var3 = h1Var2.F;
                    h1.g(q0Var3);
                    q0Var3.G.b("Failed to send consent settings to service");
                } else {
                    try {
                        e0Var2.Y(this.B);
                        c3Var2.i1();
                    } catch (RemoteException e10) {
                        q0 q0Var4 = h1Var2.F;
                        h1.g(q0Var4);
                        q0Var4.G.c(e10, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }
}
