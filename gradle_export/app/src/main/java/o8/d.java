package o8;

import java.util.Arrays;
import java.util.Objects;

public final class d extends j {

    public final String f11695b;

    public final boolean f11696c;

    public final boolean f11697d;

    public final String[] f11698e;

    public final j[] f11699f;

    public d(String str, boolean z10, boolean z11, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f11695b = str;
        this.f11696c = z10;
        this.f11697d = z11;
        this.f11698e = strArr;
        this.f11699f = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f11696c == dVar.f11696c && this.f11697d == dVar.f11697d && Objects.equals(this.f11695b, dVar.f11695b) && Arrays.equals(this.f11698e, dVar.f11698e) && Arrays.equals(this.f11699f, dVar.f11699f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((527 + (this.f11696c ? 1 : 0)) * 31) + (this.f11697d ? 1 : 0)) * 31;
        String str = this.f11695b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
