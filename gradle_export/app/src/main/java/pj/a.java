package pj;

public enum a implements ej.c {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);

    public final int A;

    a(int i10) {
        this.A = i10;
    }

    @Override
    public final int getNumber() {
        return this.A;
    }
}
