package ri;

public final class h1 {

    public int f13353a;

    public String f13354b;

    public String f13355c;

    public boolean f13356d;

    public byte f13357e;

    public final i1 a() {
        String str;
        String str2;
        if (this.f13357e == 3 && (str = this.f13354b) != null && (str2 = this.f13355c) != null) {
            return new i1(this.f13353a, str, str2, this.f13356d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f13357e & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.f13354b == null) {
            sb2.append(" version");
        }
        if (this.f13355c == null) {
            sb2.append(" buildVersion");
        }
        if ((this.f13357e & 2) == 0) {
            sb2.append(" jailbroken");
        }
        throw new IllegalStateException(oi.k.j("Missing required properties:", sb2));
    }
}
