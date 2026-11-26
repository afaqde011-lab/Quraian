package k;

import android.view.ViewGroup;

public final class q implements Runnable {
    public final int A;
    public final b0 B;

    public q(b0 b0Var, int i10) {
        this.A = i10;
        this.B = b0Var;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        switch (this.A) {
            case 0:
                b0 b0Var = this.B;
                if ((b0Var.f8363x0 & 1) != 0) {
                    b0Var.u(0);
                }
                if ((b0Var.f8363x0 & 4096) != 0) {
                    b0Var.u(108);
                }
                b0Var.f8362w0 = false;
                b0Var.f8363x0 = 0;
                break;
            default:
                b0 b0Var2 = this.B;
                b0Var2.U.showAtLocation(b0Var2.T, 55, 0, 0);
                z4.n0 n0Var = b0Var2.W;
                if (n0Var != null) {
                    n0Var.b();
                }
                if (b0Var2.X && (viewGroup = b0Var2.Y) != null && viewGroup.isLaidOut()) {
                    b0Var2.T.setAlpha(0.0f);
                    z4.n0 n0VarB = z4.j0.b(b0Var2.T);
                    n0VarB.a(1.0f);
                    b0Var2.W = n0VarB;
                    n0VarB.d(new t(this, 0));
                } else {
                    b0Var2.T.setAlpha(1.0f);
                    b0Var2.T.setVisibility(0);
                }
                break;
        }
    }
}
