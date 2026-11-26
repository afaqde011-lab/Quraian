package ri;

import com.google.android.gms.internal.measurement.x5;
import java.util.List;

public final class g0 extends s1 {

    public final List f13347a;

    public final String f13348b;

    public g0(List list, String str) {
        this.f13347a = list;
        this.f13348b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof s1) {
            g0 g0Var = (g0) ((s1) obj);
            String str2 = g0Var.f13348b;
            if (this.f13347a.equals(g0Var.f13347a) && ((str = this.f13348b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f13347a.hashCode() ^ 1000003) * 1000003;
        String str = this.f13348b;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f13347a);
        sb2.append(", orgId=");
        return x5.n(sb2, this.f13348b, "}");
    }
}
