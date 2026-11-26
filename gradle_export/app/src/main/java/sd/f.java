package sd;

import com.google.protobuf.RuntimeVersion;
import java.util.Iterator;

public final class f implements e {

    public final int f13974a;

    public final int f13975b;

    public final boolean f13976c;

    public final boolean f13977d;

    public final String f13978e;

    public f(int i10, int i11, boolean z10, boolean z11, String str) {
        this.f13974a = i10;
        this.f13975b = i11;
        this.f13976c = z10;
        this.f13977d = z11;
        this.f13978e = str;
    }

    @Override
    public final boolean a(w0 w0Var) {
        int i10;
        int i11;
        boolean z10 = this.f13977d;
        String strO = this.f13978e;
        if (z10 && strO == null) {
            strO = w0Var.o();
        }
        u0 u0Var = w0Var.f14130b;
        if (u0Var != null) {
            Iterator it = u0Var.a().iterator();
            i10 = 0;
            i11 = 0;
            while (it.hasNext()) {
                w0 w0Var2 = (w0) ((y0) it.next());
                if (w0Var2 == w0Var) {
                    i10 = i11;
                }
                if (strO == null || w0Var2.o().equals(strO)) {
                    i11++;
                }
            }
        } else {
            i10 = 0;
            i11 = 1;
        }
        int i12 = this.f13976c ? i10 + 1 : i11 - i10;
        int i13 = this.f13974a;
        int i14 = this.f13975b;
        if (i13 == 0) {
            if (i12 == i14) {
                return true;
            }
            return false;
        }
        int i15 = i12 - i14;
        if (i15 % i13 == 0 && (Integer.signum(i15) == 0 || Integer.signum(i15) == Integer.signum(i13))) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str = this.f13976c ? RuntimeVersion.SUFFIX : "last-";
        boolean z10 = this.f13977d;
        int i10 = this.f13975b;
        int i11 = this.f13974a;
        return z10 ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i11), Integer.valueOf(i10), this.f13978e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i11), Integer.valueOf(i10));
    }
}
