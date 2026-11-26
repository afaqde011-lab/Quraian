package eh;

public final class g extends e {
    public final char A;
    public final char B;

    public g(char c10, char c11) {
        this.A = c10;
        this.B = c11;
    }

    @Override
    public final boolean c(char c10) {
        return c10 == this.A || c10 == this.B;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + j.a(this.A) + j.a(this.B) + "\")";
    }
}
