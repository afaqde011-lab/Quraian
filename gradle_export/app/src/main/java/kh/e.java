package kh;

public final class e implements Runnable {
    public final l A;
    public final v B;

    public e(l lVar, v vVar) {
        this.A = lVar;
        this.B = vVar;
    }

    @Override
    public final void run() {
        if (this.A.A != this) {
            return;
        }
        if (l.F.t(this.A, this, l.i(this.B))) {
            l.f(this.A, false);
        }
    }
}
