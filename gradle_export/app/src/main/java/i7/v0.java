package i7;

import android.util.Pair;

public final class v0 implements Runnable {
    public final int A;
    public final y0 B;
    public final Pair C;

    public v0(y0 y0Var, Pair pair, int i10) {
        this.A = i10;
        this.B = y0Var;
        this.C = pair;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                j7.f fVar = (j7.f) this.B.B.f7231i;
                Pair pair = this.C;
                fVar.d(((Integer) pair.first).intValue(), (s7.a0) pair.second);
                break;
            default:
                j7.f fVar2 = (j7.f) this.B.B.f7231i;
                Pair pair2 = this.C;
                fVar2.i(((Integer) pair2.first).intValue(), (s7.a0) pair2.second);
                break;
        }
    }
}
