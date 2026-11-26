package androidx.media3.common;

public final class p1 implements Runnable {
    public final c2 A;
    public final kh.v B;

    public p1(c2 c2Var, kh.v vVar) {
        this.A = c2Var;
        this.B = vVar;
    }

    @Override
    public final void run() {
        c2.c(this.A, this.B);
    }
}
