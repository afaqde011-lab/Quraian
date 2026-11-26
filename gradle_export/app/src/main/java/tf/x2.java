package tf;

import android.os.RemoteException;

public final class x2 implements Runnable {
    public final int A;
    public final g4 B;
    public final c3 C;

    public x2(c3 c3Var, g4 g4Var, int i10) {
        this.A = i10;
        this.B = g4Var;
        this.C = c3Var;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                c3 c3Var = this.C;
                e0 e0Var = c3Var.E;
                h1 h1Var = (h1) c3Var.B;
                if (e0Var != null) {
                    try {
                        e0Var.Z0(this.B);
                    } catch (RemoteException e3) {
                        q0 q0Var = h1Var.F;
                        h1.g(q0Var);
                        q0Var.G.c(e3, "Failed to reset data on the service: remote exception");
                    }
                    c3Var.i1();
                } else {
                    q0 q0Var2 = h1Var.F;
                    h1.g(q0Var2);
                    q0Var2.G.b("Failed to reset data on the service: not connected to service");
                }
                break;
            case 1:
                c3 c3Var2 = this.C;
                e0 e0Var2 = c3Var2.E;
                h1 h1Var2 = (h1) c3Var2.B;
                if (e0Var2 == null) {
                    q0 q0Var3 = h1Var2.F;
                    h1.g(q0Var3);
                    q0Var3.J.b("Failed to send app backgrounded");
                } else {
                    try {
                        e0Var2.b1(this.B);
                        c3Var2.i1();
                    } catch (RemoteException e10) {
                        q0 q0Var4 = h1Var2.F;
                        h1.g(q0Var4);
                        q0Var4.G.c(e10, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
                break;
            default:
                c3 c3Var3 = this.C;
                e0 e0Var3 = c3Var3.E;
                h1 h1Var3 = (h1) c3Var3.B;
                if (e0Var3 == null) {
                    q0 q0Var5 = h1Var3.F;
                    h1.g(q0Var5);
                    q0Var5.G.b("Failed to send measurementEnabled to service");
                } else {
                    try {
                        e0Var3.L1(this.B);
                        c3Var3.i1();
                    } catch (RemoteException e11) {
                        q0 q0Var6 = h1Var3.F;
                        h1.g(q0Var6);
                        q0Var6.G.c(e11, "Failed to send measurementEnabled to the service");
                    }
                }
                break;
        }
    }
}
