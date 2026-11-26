package wh;

import java.util.Objects;
import mh.f;
import oi.k;

public final class b {

    public final f f16084a;

    public final int f16085b;

    public final String f16086c;

    public final String f16087d;

    public b(f fVar, int i10, String str, String str2) {
        this.f16084a = fVar;
        this.f16085b = i10;
        this.f16086c = str;
        this.f16087d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f16084a == bVar.f16084a && this.f16085b == bVar.f16085b && this.f16086c.equals(bVar.f16086c) && this.f16087d.equals(bVar.f16087d);
    }

    public final int hashCode() {
        return Objects.hash(this.f16084a, Integer.valueOf(this.f16085b), this.f16086c, this.f16087d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(status=");
        sb2.append(this.f16084a);
        sb2.append(", keyId=");
        sb2.append(this.f16085b);
        sb2.append(", keyType='");
        return k.m(sb2, this.f16086c, "', keyPrefix='", this.f16087d, "')");
    }
}
