package i20;

public enum l0 implements o20.p {
    CLASS(0),
    PACKAGE(1),
    LOCAL(2);

    public final int A;

    l0(int i) {
        this.A = i;
    }

    @Override
    public final int getNumber() {
        return this.A;
    }
}
