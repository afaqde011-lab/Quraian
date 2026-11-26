package tf;

public enum o2 {
    UNKNOWN(0),
    SUCCESS(1),
    FAILURE(2),
    BACKOFF(3);

    public final int A;

    o2(int i10) {
        this.A = i10;
    }
}
