package ri;

public final class o0 {

    public long f13477a;

    public String f13478b;

    public d2 f13479c;

    public e2 f13480d;

    public f2 f13481e;

    public i2 f13482f;

    public byte f13483g;

    public final p0 a() {
        String str;
        d2 d2Var;
        e2 e2Var;
        if (this.f13483g == 1 && (str = this.f13478b) != null && (d2Var = this.f13479c) != null && (e2Var = this.f13480d) != null) {
            return new p0(this.f13477a, str, d2Var, e2Var, this.f13481e, this.f13482f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f13483g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f13478b == null) {
            sb2.append(" type");
        }
        if (this.f13479c == null) {
            sb2.append(" app");
        }
        if (this.f13480d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(oi.k.j("Missing required properties:", sb2));
    }
}
