package o9;

import android.util.SparseArray;

public final class m0 implements Runnable {
    public final int A;
    public final n0 B;

    public m0(n0 n0Var, int i10) {
        this.A = i10;
        this.B = n0Var;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                SparseArray sparseArray = this.B.f11835h;
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((p0) sparseArray.valueAt(i10)).getClass();
                    p0.a(null, null);
                }
                sparseArray.clear();
                break;
            default:
                n0 n0Var = this.B;
                s0 s0Var = n0Var.f11836i;
                if (s0Var.N == n0Var) {
                    s0Var.j();
                }
                break;
        }
    }
}
