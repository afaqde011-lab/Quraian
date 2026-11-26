package ri;

public final class y0 {

    public String f13574a;

    public int f13575b;

    public int f13576c;

    public boolean f13577d;

    public byte f13578e;

    public final z0 a() {
        String str;
        if (this.f13578e == 7 && (str = this.f13574a) != null) {
            return new z0(this.f13575b, this.f13576c, str, this.f13577d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f13574a == null) {
            sb2.append(" processName");
        }
        if ((this.f13578e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.f13578e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.f13578e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(oi.k.j("Missing required properties:", sb2));
    }
}
