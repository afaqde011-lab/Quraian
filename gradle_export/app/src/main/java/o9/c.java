package o9;

import k9.x0;

public final class c implements Runnable {
    public final int A;
    public final d B;
    public final int C;

    public c(d dVar, int i10, int i11) {
        this.A = i11;
        this.B = dVar;
        this.C = i10;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                b0 b0Var = ((f) ((x0) this.B.f11765f).D).f11781d;
                if (b0Var != null) {
                    b0Var.j(this.C);
                }
                break;
            default:
                b0 b0Var2 = ((f) ((x0) this.B.f11765f).D).f11781d;
                if (b0Var2 != null) {
                    b0Var2.k(this.C);
                }
                break;
        }
    }
}
