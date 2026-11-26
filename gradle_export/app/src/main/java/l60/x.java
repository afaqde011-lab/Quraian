package l60;

public final class x extends x40.d0 {
    public final x40.s B;
    public final long C;

    public x(x40.s sVar, long j) {
        this.B = sVar;
        this.C = j;
    }

    @Override
    public final long l() {
        return this.C;
    }

    @Override
    public final x40.s r() {
        return this.B;
    }

    @Override
    public final k50.k v() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
