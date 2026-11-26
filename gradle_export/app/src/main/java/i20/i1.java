package i20;

public enum i1 implements o20.p {
    INTERNAL(0),
    PRIVATE(1),
    PROTECTED(2),
    PUBLIC(3),
    PRIVATE_TO_THIS(4),
    LOCAL(5);

    public final int A;

    i1(int i) {
        this.A = i;
    }

    @Override
    public final int getNumber() {
        return this.A;
    }
}
