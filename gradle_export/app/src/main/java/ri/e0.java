package ri;

import com.google.android.gms.internal.measurement.x5;

public final class e0 extends o1 {

    public final String f13325a;

    public final String f13326b;

    public final String f13327c;

    public e0(String str, String str2, String str3) {
        this.f13325a = str;
        this.f13326b = str2;
        this.f13327c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1) {
            e0 e0Var = (e0) ((o1) obj);
            if (this.f13325a.equals(e0Var.f13325a) && this.f13326b.equals(e0Var.f13326b) && this.f13327c.equals(e0Var.f13327c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13327c.hashCode() ^ ((((this.f13325a.hashCode() ^ 1000003) * 1000003) ^ this.f13326b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f13325a);
        sb2.append(", libraryName=");
        sb2.append(this.f13326b);
        sb2.append(", buildId=");
        return x5.n(sb2, this.f13327c, "}");
    }
}
