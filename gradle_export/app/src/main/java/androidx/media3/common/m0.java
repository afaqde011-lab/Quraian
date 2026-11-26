package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

public final class m0 {

    public static final m0 f1344d = new m0(new a1.i(2, false));

    public static final String f1345e;

    public static final String f1346f;

    public static final String f1347g;

    public final Uri f1348a;

    public final String f1349b;

    public final Bundle f1350c;

    static {
        String str = e7.i0.f5136a;
        f1345e = Integer.toString(0, 36);
        f1346f = Integer.toString(1, 36);
        f1347g = Integer.toString(2, 36);
    }

    public m0(a1.i iVar) {
        this.f1348a = (Uri) iVar.B;
        this.f1349b = (String) iVar.C;
        this.f1350c = (Bundle) iVar.D;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (Objects.equals(this.f1348a, m0Var.f1348a) && Objects.equals(this.f1349b, m0Var.f1349b)) {
            if ((this.f1350c == null) == (m0Var.f1350c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.f1348a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f1349b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f1350c != null ? 1 : 0);
    }
}
