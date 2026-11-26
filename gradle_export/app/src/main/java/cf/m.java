package cf;

public enum m implements a {
    ED256(-260),
    ED512(-261),
    ED25519(-8),
    ES256(-7),
    ECDH_HKDF_256(-25),
    ES384(-35),
    ES512(-36);

    public final int A;

    m(int i10) {
        this.A = i10;
    }

    @Override
    public final int a() {
        return this.A;
    }
}
