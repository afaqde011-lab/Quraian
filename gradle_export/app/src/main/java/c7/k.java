package c7;

import e7.i0;
import java.util.Objects;

public final class k {

    public static final k f2918e = new k(-1, -1, -1);

    public final int f2919a;

    public final int f2920b;

    public final int f2921c;

    public final int f2922d;

    public k(int i10, int i11, int i12) {
        this.f2919a = i10;
        this.f2920b = i11;
        this.f2921c = i12;
        this.f2922d = i0.D(i12) ? i0.p(i12) * i11 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f2919a == kVar.f2919a && this.f2920b == kVar.f2920b && this.f2921c == kVar.f2921c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2919a), Integer.valueOf(this.f2920b), Integer.valueOf(this.f2921c));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
        sb2.append(this.f2919a);
        sb2.append(", channelCount=");
        sb2.append(this.f2920b);
        sb2.append(", encoding=");
        return oi.k.l(sb2, this.f2921c, ']');
    }
}
