package yh;

public enum o0 implements com.google.crypto.tink.shaded.protobuf.z {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    public final int A;

    o0(int i10) {
        this.A = i10;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.A;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
