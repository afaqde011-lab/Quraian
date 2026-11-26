package p7;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.x5;

public final class n {

    public final String f12442a;

    public final boolean f12443b;

    public final boolean f12444c;

    public n(String str, boolean z10, boolean z11) {
        this.f12442a = str;
        this.f12443b = z10;
        this.f12444c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == n.class) {
            n nVar = (n) obj;
            if (TextUtils.equals(this.f12442a, nVar.f12442a) && this.f12443b == nVar.f12443b && this.f12444c == nVar.f12444c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((x5.e(31, this.f12442a, 31) + (this.f12443b ? 1231 : 1237)) * 31) + (this.f12444c ? 1231 : 1237);
    }
}
