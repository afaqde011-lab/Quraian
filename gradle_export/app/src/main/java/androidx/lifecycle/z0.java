package androidx.lifecycle;

public final class z0 implements Runnable {
    public final y A;
    public final o B;
    public boolean C;

    public z0(y yVar, o oVar) {
        kotlin.jvm.internal.m.e(yVar, "registry");
        kotlin.jvm.internal.m.e(oVar, "event");
        this.A = yVar;
        this.B = oVar;
    }

    @Override
    public final void run() {
        if (this.C) {
            return;
        }
        this.A.g(this.B);
        this.C = true;
    }
}
