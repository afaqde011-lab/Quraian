package ri;

public final class l1 {

    public final String f13428a;

    public final String f13429b;

    public final String f13430c;

    public final String f13431d;

    public final int f13432e;

    public final h7.b f13433f;

    public l1(String str, String str2, String str3, String str4, int i10, h7.b bVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f13428a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f13429b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f13430c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f13431d = str4;
        this.f13432e = i10;
        this.f13433f = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.f13428a.equals(l1Var.f13428a) && this.f13429b.equals(l1Var.f13429b) && this.f13430c.equals(l1Var.f13430c) && this.f13431d.equals(l1Var.f13431d) && this.f13432e == l1Var.f13432e && this.f13433f.equals(l1Var.f13433f);
    }

    public final int hashCode() {
        return this.f13433f.hashCode() ^ ((((((((((this.f13428a.hashCode() ^ 1000003) * 1000003) ^ this.f13429b.hashCode()) * 1000003) ^ this.f13430c.hashCode()) * 1000003) ^ this.f13431d.hashCode()) * 1000003) ^ this.f13432e) * 1000003);
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f13428a + ", versionCode=" + this.f13429b + ", versionName=" + this.f13430c + ", installUuid=" + this.f13431d + ", deliveryMechanism=" + this.f13432e + ", developmentPlatformProvider=" + this.f13433f + "}";
    }
}
