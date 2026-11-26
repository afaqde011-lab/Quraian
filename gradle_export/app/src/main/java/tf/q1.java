package tf;

public enum q1 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");

    public final String A;

    q1(String str) {
        this.A = str;
    }

    @Override
    public final String toString() {
        return this.A;
    }
}
