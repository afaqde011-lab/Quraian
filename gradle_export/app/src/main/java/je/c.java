package je;

import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.d0;
import h1.l;
import java.util.Arrays;

public final class c implements e {
    public static final c C;
    public final boolean A;
    public final String B;

    static {
        l lVar = new l();
        lVar.A = Boolean.FALSE;
        C = new c(lVar);
    }

    public c(l lVar) {
        this.A = ((Boolean) lVar.A).booleanValue();
        this.B = (String) lVar.B;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return d0.k(null, null) && this.A == cVar.A && d0.k(this.B, cVar.B);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.A), this.B});
    }
}
