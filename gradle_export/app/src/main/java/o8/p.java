package o8;

import com.google.android.gms.internal.measurement.x5;
import java.util.Objects;

public final class p extends j {

    public final String f11726b;

    public final String f11727c;

    public p(String str, String str2, String str3) {
        super(str);
        this.f11726b = str2;
        this.f11727c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f11712a.equals(pVar.f11712a) && Objects.equals(this.f11726b, pVar.f11726b) && Objects.equals(this.f11727c, pVar.f11727c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = x5.e(527, this.f11712a, 31);
        String str = this.f11726b;
        int iHashCode = (iE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11727c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override
    public final String toString() {
        return this.f11712a + ": url=" + this.f11727c;
    }
}
