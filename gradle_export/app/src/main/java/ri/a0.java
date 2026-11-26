package ri;

public final class a0 {

    public String f13239a;

    public String f13240b;

    public int f13241c;

    public String f13242d;

    public String f13243e;

    public String f13244f;

    public String f13245g;

    public String f13246h;

    public String f13247i;

    public m2 f13248j;

    public s1 f13249k;
    public p1 l;
    public byte m;

    public final b0 a() {
        if (this.m == 1 && this.f13239a != null && this.f13240b != null && this.f13242d != null && this.f13246h != null && this.f13247i != null) {
            return new b0(this.f13239a, this.f13240b, this.f13241c, this.f13242d, this.f13243e, this.f13244f, this.f13245g, this.f13246h, this.f13247i, this.f13248j, this.f13249k, this.l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f13239a == null) {
            sb2.append(" sdkVersion");
        }
        if (this.f13240b == null) {
            sb2.append(" gmpAppId");
        }
        if ((1 & this.m) == 0) {
            sb2.append(" platform");
        }
        if (this.f13242d == null) {
            sb2.append(" installationUuid");
        }
        if (this.f13246h == null) {
            sb2.append(" buildVersion");
        }
        if (this.f13247i == null) {
            sb2.append(" displayVersion");
        }
        throw new IllegalStateException(oi.k.j("Missing required properties:", sb2));
    }
}
