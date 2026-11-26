package o8;

import java.util.Arrays;
import java.util.Objects;

public final class c extends j {

    public final String f11689b;

    public final int f11690c;

    public final int f11691d;

    public final long f11692e;

    public final long f11693f;

    public final j[] f11694g;

    public c(String str, int i10, int i11, long j9, long j10, j[] jVarArr) {
        super("CHAP");
        this.f11689b = str;
        this.f11690c = i10;
        this.f11691d = i11;
        this.f11692e = j9;
        this.f11693f = j10;
        this.f11694g = jVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f11690c == cVar.f11690c && this.f11691d == cVar.f11691d && this.f11692e == cVar.f11692e && this.f11693f == cVar.f11693f && Objects.equals(this.f11689b, cVar.f11689b) && Arrays.equals(this.f11694g, cVar.f11694g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((((((527 + this.f11690c) * 31) + this.f11691d) * 31) + ((int) this.f11692e)) * 31) + ((int) this.f11693f)) * 31;
        String str = this.f11689b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
