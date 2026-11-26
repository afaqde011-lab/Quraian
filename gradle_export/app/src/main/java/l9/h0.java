package l9;

import android.text.TextUtils;
import java.util.Objects;

public final class h0 {

    public final String f10150a;

    public final int f10151b;

    public final int f10152c;

    public h0(String str, int i10, int i11) {
        this.f10150a = str;
        this.f10151b = i10;
        this.f10152c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        int i10 = h0Var.f10152c;
        String str = h0Var.f10150a;
        int i11 = h0Var.f10151b;
        int i12 = this.f10152c;
        String str2 = this.f10150a;
        int i13 = this.f10151b;
        if (i13 < 0 || i11 < 0) {
            return TextUtils.equals(str2, str) && i12 == i10;
        }
        return TextUtils.equals(str2, str) && i13 == i11 && i12 == i10;
    }

    public final int hashCode() {
        return Objects.hash(this.f10150a, Integer.valueOf(this.f10152c));
    }
}
