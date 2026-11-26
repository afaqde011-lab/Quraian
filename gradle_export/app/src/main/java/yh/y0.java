package yh;

public enum y0 implements com.google.crypto.tink.shaded.protobuf.z {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public final int A;

    y0(int i10) {
        this.A = i10;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.A;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
