package ri;

import com.google.android.gms.internal.measurement.x5;

public final class f0 extends q1 {

    public final String f13335a;

    public final String f13336b;

    public f0(String str, String str2) {
        this.f13335a = str;
        this.f13336b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            f0 f0Var = (f0) ((q1) obj);
            if (this.f13335a.equals(f0Var.f13335a) && this.f13336b.equals(f0Var.f13336b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13336b.hashCode() ^ ((this.f13335a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f13335a);
        sb2.append(", value=");
        return x5.n(sb2, this.f13336b, "}");
    }
}
