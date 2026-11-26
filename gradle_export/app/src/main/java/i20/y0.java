package i20;

public enum y0 implements o20.p {
    IN(0),
    OUT(1),
    INV(2);

    public final int A;

    y0(int i) {
        this.A = i;
    }

    @Override
    public final int getNumber() {
        return this.A;
    }
}
