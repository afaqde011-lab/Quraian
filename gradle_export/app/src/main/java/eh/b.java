package eh;

public final class b extends j {
    public final j A;
    public final j B;

    public b(j jVar, j jVar2) {
        jVar.getClass();
        this.A = jVar;
        jVar2.getClass();
        this.B = jVar2;
    }

    @Override
    public final boolean apply(Object obj) {
        return c(((Character) obj).charValue());
    }

    @Override
    public final boolean c(char c10) {
        return this.A.c(c10) && this.B.c(c10);
    }

    public final String toString() {
        return "CharMatcher.and(" + this.A + ", " + this.B + ")";
    }
}
