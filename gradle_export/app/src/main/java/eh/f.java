package eh;

public final class f extends e {
    public final int A;
    public final char B;

    public f(char c10, int i10) {
        this.A = i10;
        this.B = c10;
    }

    @Override
    public final boolean c(char c10) {
        switch (this.A) {
            case 0:
                return c10 == this.B;
            default:
                return c10 != this.B;
        }
    }

    @Override
    public final j d() {
        switch (this.A) {
            case 0:
                return new f(this.B, 1);
            default:
                return new f(this.B, 0);
        }
    }

    public final String toString() {
        switch (this.A) {
            case 0:
                return "CharMatcher.is('" + j.a(this.B) + "')";
            default:
                return "CharMatcher.isNot('" + j.a(this.B) + "')";
        }
    }
}
