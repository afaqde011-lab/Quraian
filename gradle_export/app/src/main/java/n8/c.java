package n8;

import androidx.media3.common.s0;
import androidx.media3.common.u0;
import java.util.Arrays;

public final class c implements u0 {

    public final byte[] f11194a;

    public final String f11195b;

    public final String f11196c;

    public c(String str, String str2, byte[] bArr) {
        this.f11194a = bArr;
        this.f11195b = str;
        this.f11196c = str2;
    }

    @Override
    public final void b(s0 s0Var) {
        String str = this.f11195b;
        if (str != null) {
            s0Var.f1515a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f11194a, ((c) obj).f11194a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11194a);
    }

    public final String toString() {
        return g4.c.g(this.f11194a.length, "\"", a1.b.s("ICY: title=\"", this.f11195b, "\", url=\"", this.f11196c, "\", rawMetadata.length=\""));
    }
}
