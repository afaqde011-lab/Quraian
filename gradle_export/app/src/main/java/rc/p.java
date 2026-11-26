package rc;

public final class p {

    public final String f13208a;

    public final String f13209b;

    public final String f13210c;

    public final String f13211d;

    public final String f13212e;

    public final String f13213f;

    public p(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f13208a = str;
        this.f13209b = str2;
        this.f13210c = str3;
        this.f13211d = str4;
        this.f13212e = str5;
        this.f13213f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.m.a(this.f13208a, pVar.f13208a) && kotlin.jvm.internal.m.a(this.f13209b, pVar.f13209b) && kotlin.jvm.internal.m.a(this.f13210c, pVar.f13210c) && kotlin.jvm.internal.m.a(this.f13211d, pVar.f13211d) && kotlin.jvm.internal.m.a(this.f13212e, pVar.f13212e) && kotlin.jvm.internal.m.a(this.f13213f, pVar.f13213f);
    }

    public final int hashCode() {
        String str = this.f13208a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f13209b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f13210c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f13211d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f13212e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f13213f;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TargetInfo(className=");
        sb2.append(this.f13208a);
        sb2.append(", resourceName=");
        sb2.append(this.f13209b);
        sb2.append(", tag=");
        sb2.append(this.f13210c);
        sb2.append(", text=");
        sb2.append(this.f13211d);
        sb2.append(", source=");
        sb2.append(this.f13212e);
        sb2.append(", hierarchy=");
        return g4.c.k(sb2, this.f13213f, ')');
    }
}
