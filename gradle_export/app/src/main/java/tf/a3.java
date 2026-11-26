package tf;

import android.os.RemoteException;

public final class a3 implements Runnable {
    public final int A;
    public final c3 B;

    public a3(c3 c3Var, int i10) {
        this.A = i10;
        this.B = c3Var;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                this.B.b1();
                break;
            case 1:
                c3 c3Var = this.B;
                h1 h1Var = (h1) c3Var.B;
                e0 e0Var = c3Var.E;
                if (e0Var == null) {
                    q0 q0Var = h1Var.F;
                    h1.g(q0Var);
                    q0Var.G.b("Failed to send Dma consent settings to service");
                } else {
                    try {
                        e0Var.K1(c3Var.l1(false));
                        c3Var.i1();
                    } catch (RemoteException e3) {
                        q0 q0Var2 = h1Var.F;
                        h1.g(q0Var2);
                        q0Var2.G.c(e3, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
                break;
            default:
                c3 c3Var2 = this.B;
                h1 h1Var2 = (h1) c3Var2.B;
                e0 e0Var2 = c3Var2.E;
                if (e0Var2 == null) {
                    q0 q0Var3 = h1Var2.F;
                    h1.g(q0Var3);
                    q0Var3.G.b("Failed to send storage consent settings to service");
                } else {
                    try {
                        e0Var2.e2(c3Var2.l1(false));
                        c3Var2.i1();
                    } catch (RemoteException e10) {
                        q0 q0Var4 = h1Var2.F;
                        h1.g(q0Var4);
                        q0Var4.G.c(e10, "Failed to send storage consent settings to the service");
                    }
                }
                break;
        }
    }
}
