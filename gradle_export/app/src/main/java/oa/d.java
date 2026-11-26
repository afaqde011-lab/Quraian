package oa;

public final class d extends RuntimeException {
    public final e A;
    public final Throwable B;

    public d(e eVar, Throwable th2) {
        super(th2);
        this.A = eVar;
        this.B = th2;
    }

    @Override
    public final Throwable getCause() {
        return this.B;
    }
}
