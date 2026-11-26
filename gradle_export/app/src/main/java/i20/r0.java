package i20;

public enum r0 implements o20.p {
    IN(0),
    OUT(1),
    INV(2),
    STAR(3);

    public final int A;

    r0(int i) {
        this.A = i;
    }

    @Override
    public final int getNumber() {
        return this.A;
    }
}
