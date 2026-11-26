package ri;

public final class d1 {

    public f1 f13317a;

    public String f13318b;

    public String f13319c;

    public long f13320d;

    public byte f13321e;

    public final e1 a() {
        f1 f1Var;
        String str;
        String str2;
        if (this.f13321e == 1 && (f1Var = this.f13317a) != null && (str = this.f13318b) != null && (str2 = this.f13319c) != null) {
            return new e1(f1Var, str, str2, this.f13320d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f13317a == null) {
            sb2.append(" rolloutVariant");
        }
        if (this.f13318b == null) {
            sb2.append(" parameterKey");
        }
        if (this.f13319c == null) {
            sb2.append(" parameterValue");
        }
        if ((this.f13321e & 1) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(oi.k.j("Missing required properties:", sb2));
    }
}
