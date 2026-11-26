package k7;

import fh.d1;
import fh.e1;
import fh.s2;
import java.util.Objects;
import java.util.Set;

public final class a {

    public static final a f8975d;

    public final int f8976a;

    public final int f8977b;

    public final e1 f8978c;

    static {
        d1 d1Var = new d1(4);
        for (int i10 = 1; i10 <= 10; i10++) {
            d1Var.c(Integer.valueOf(e7.i0.n(i10)));
        }
        f8975d = new a(2, d1Var.g());
    }

    public a(int i10, int i11) {
        this.f8976a = i10;
        this.f8977b = i11;
        this.f8978c = null;
    }

    public a(int i10, Set set) {
        this.f8976a = i10;
        e1 e1VarN = e1.n(set);
        this.f8978c = e1VarN;
        s2 it = e1VarN.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.f8977b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f8976a == aVar.f8976a && this.f8977b == aVar.f8977b && Objects.equals(this.f8978c, aVar.f8978c);
    }

    public final int hashCode() {
        int i10 = ((this.f8976a * 31) + this.f8977b) * 31;
        e1 e1Var = this.f8978c;
        return i10 + (e1Var == null ? 0 : e1Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f8976a + ", maxChannelCount=" + this.f8977b + ", channelMasks=" + this.f8978c + "]";
    }
}
