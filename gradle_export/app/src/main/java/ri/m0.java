package ri;

public final class m0 {

    public int f13440a;

    public String f13441b;

    public int f13442c;

    public long f13443d;

    public long f13444e;

    public boolean f13445f;

    public int f13446g;

    public String f13447h;

    public String f13448i;

    public byte f13449j;

    public final n0 a() {
        String str;
        String str2;
        String str3;
        if (this.f13449j == 63 && (str = this.f13441b) != null && (str2 = this.f13447h) != null && (str3 = this.f13448i) != null) {
            return new n0(this.f13440a, str, this.f13442c, this.f13443d, this.f13444e, this.f13445f, this.f13446g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f13449j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f13441b == null) {
            sb2.append(" model");
        }
        if ((this.f13449j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.f13449j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.f13449j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.f13449j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.f13449j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.f13447h == null) {
            sb2.append(" manufacturer");
        }
        if (this.f13448i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(oi.k.j("Missing required properties:", sb2));
    }
}
