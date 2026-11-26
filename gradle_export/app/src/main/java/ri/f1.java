package ri;

import com.google.android.gms.internal.measurement.x5;

public final class f1 extends g2 {

    public final String f13337a;

    public final String f13338b;

    public f1(String str, String str2) {
        this.f13337a = str;
        this.f13338b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g2) {
            f1 f1Var = (f1) ((g2) obj);
            if (this.f13337a.equals(f1Var.f13337a) && this.f13338b.equals(f1Var.f13338b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13338b.hashCode() ^ ((this.f13337a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f13337a);
        sb2.append(", variantId=");
        return x5.n(sb2, this.f13338b, "}");
    }
}
