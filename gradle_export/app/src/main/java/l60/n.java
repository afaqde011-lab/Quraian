package l60;

import java.util.concurrent.Executor;

public final class n implements d {
    public final Executor A;
    public final d B;

    public n(Executor executor, d dVar) {
        this.A = executor;
        this.B = dVar;
    }

    @Override
    public final void cancel() {
        this.B.cancel();
    }

    @Override
    public final d clone() {
        return new n(this.A, this.B.clone());
    }

    @Override
    public final boolean i() {
        return this.B.i();
    }

    @Override
    public final void l(g gVar) {
        this.B.l(new h1.l(this, gVar));
    }

    @Override
    public final th.o r() {
        return this.B.r();
    }
}
