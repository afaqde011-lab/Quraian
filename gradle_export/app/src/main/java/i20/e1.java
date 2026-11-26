package i20;

public enum e1 implements o20.p {
    WARNING(0),
    ERROR(1),
    HIDDEN(2);

    public final int A;

    e1(int i) {
        this.A = i;
    }

    @Override
    public final int getNumber() {
        return this.A;
    }
}
