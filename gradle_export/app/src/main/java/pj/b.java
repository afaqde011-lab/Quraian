package pj;

public enum b implements ej.c {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);

    public final int A;

    b(int i10) {
        this.A = i10;
    }

    @Override
    public final int getNumber() {
        return this.A;
    }
}
