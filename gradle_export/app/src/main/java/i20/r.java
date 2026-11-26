package i20;

public enum r implements o20.p {
    CONCLUSION_CONDITION(0),
    RETURNS_CONDITION(1),
    HOLDSIN_CONDITION(2);

    public final int A;

    r(int i) {
        this.A = i;
    }

    @Override
    public final int getNumber() {
        return this.A;
    }
}
