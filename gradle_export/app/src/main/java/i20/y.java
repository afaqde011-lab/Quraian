package i20;

public enum y implements o20.p {
    TRUE(0),
    FALSE(1),
    NULL(2);

    public final int A;

    y(int i) {
        this.A = i;
    }

    @Override
    public final int getNumber() {
        return this.A;
    }
}
