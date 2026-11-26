package l0;

public final class k {

    public final int f9774a;

    public final int f9775b;

    public final w f9776c;

    public k(int i10, int i11, w wVar) {
        this.f9774a = i10;
        this.f9775b = i11;
        this.f9776c = wVar;
        if (i10 < 0) {
            g0.a.a("startIndex should be >= 0");
        }
        if (i11 > 0) {
            return;
        }
        g0.a.a("size should be > 0");
    }
}
