package ri;

public final class w0 {

    public long f13556a;

    public String f13557b;

    public String f13558c;

    public long f13559d;

    public int f13560e;

    public byte f13561f;

    public final x0 a() {
        String str;
        if (this.f13561f == 7 && (str = this.f13557b) != null) {
            return new x0(this.f13556a, str, this.f13558c, this.f13559d, this.f13560e);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f13561f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f13557b == null) {
            sb2.append(" symbol");
        }
        if ((this.f13561f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f13561f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(oi.k.j("Missing required properties:", sb2));
    }
}
