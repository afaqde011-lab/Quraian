package pj;

public enum c implements ej.c {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);

    public final int A;

    c(int i10) {
        this.A = i10;
    }

    @Override
    public final int getNumber() {
        return this.A;
    }
}
