package i20;

public enum o0 implements o20.p {
    UNSPECIFIED(0),
    MUST_USE(1),
    EXPLICITLY_IGNORABLE(2);

    public final int A;

    o0(int i) {
        this.A = i;
    }

    @Override
    public final int getNumber() {
        return this.A;
    }
}
