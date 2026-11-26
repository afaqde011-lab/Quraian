package i20;

public enum d0 implements o20.p {
    FINAL(0),
    OPEN(1),
    ABSTRACT(2),
    SEALED(3);

    public final int A;

    d0(int i) {
        this.A = i;
    }

    @Override
    public final int getNumber() {
        return this.A;
    }
}
