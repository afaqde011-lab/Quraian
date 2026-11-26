package i7;

import android.util.Pair;

public final class t0 implements Runnable {
    public final int A;
    public final y0 B;
    public final Pair C;
    public final s7.r D;
    public final s7.w E;

    public t0(y0 y0Var, Pair pair, s7.r rVar, s7.w wVar, int i10) {
        this.A = i10;
        this.B = y0Var;
        this.C = pair;
        this.D = rVar;
        this.E = wVar;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                j7.f fVar = (j7.f) this.B.B.f7231i;
                Pair pair = this.C;
                fVar.j(((Integer) pair.first).intValue(), (s7.a0) pair.second, this.D, this.E);
                break;
            default:
                j7.f fVar2 = (j7.f) this.B.B.f7231i;
                Pair pair2 = this.C;
                fVar2.b(((Integer) pair2.first).intValue(), (s7.a0) pair2.second, this.D, this.E);
                break;
        }
    }
}
