package z6;

import android.text.TextUtils;
import java.util.Objects;

public final class b {

    public String f17250a;

    public int f17251b;

    public int f17252c;

    public final boolean equals(Object obj) {
        int i10 = this.f17252c;
        String str = this.f17250a;
        int i11 = this.f17251b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        int i12 = bVar.f17252c;
        String str2 = bVar.f17250a;
        int i13 = bVar.f17251b;
        if (i11 < 0 || i13 < 0) {
            return TextUtils.equals(str, str2) && i10 == i12;
        }
        return TextUtils.equals(str, str2) && i11 == i13 && i10 == i12;
    }

    public final int hashCode() {
        return Objects.hash(this.f17250a, Integer.valueOf(this.f17252c));
    }
}
