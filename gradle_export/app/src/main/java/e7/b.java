package e7;

import b3.i2;

public final class b implements Runnable {
    public final int A;
    public final i2 B;
    public final Object C;

    public b(i2 i2Var, Object obj, int i10) {
        this.A = i10;
        this.B = i2Var;
        this.C = obj;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                i2 i2Var = this.B;
                if (i2Var.f2044a == 0) {
                    i2Var.A(this.C);
                }
                break;
            default:
                i2 i2Var2 = this.B;
                int i10 = i2Var2.f2044a - 1;
                i2Var2.f2044a = i10;
                if (i10 == 0) {
                    i2Var2.A(this.C);
                }
                break;
        }
    }
}
