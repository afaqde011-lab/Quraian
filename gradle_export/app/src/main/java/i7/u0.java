package i7;

import android.util.Pair;

public final class u0 implements Runnable {
    public final int A;
    public final y0 B;
    public final Pair C;
    public final s7.w D;

    public u0(y0 y0Var, Pair pair, s7.w wVar, int i10) {
        this.A = i10;
        this.B = y0Var;
        this.C = pair;
        this.D = wVar;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                j7.f fVar = (j7.f) this.B.B.f7231i;
                Pair pair = this.C;
                fVar.q(((Integer) pair.first).intValue(), (s7.a0) pair.second, this.D);
                break;
            default:
                j7.f fVar2 = (j7.f) this.B.B.f7231i;
                Pair pair2 = this.C;
                int iIntValue = ((Integer) pair2.first).intValue();
                s7.a0 a0Var = (s7.a0) pair2.second;
                a0Var.getClass();
                fVar2.o(iIntValue, a0Var, this.D);
                break;
        }
    }
}
