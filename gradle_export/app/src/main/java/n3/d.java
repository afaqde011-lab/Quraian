package n3;

import com.google.android.gms.internal.measurement.x5;

public final class d {

    public final int f11023a;

    public final int f11024b;

    public final boolean f11025c;

    public d(int i10, int i11, boolean z10) {
        this.f11023a = i10;
        this.f11024b = i11;
        this.f11025c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f11023a == dVar.f11023a && this.f11024b == dVar.f11024b && this.f11025c == dVar.f11025c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11025c) + w.c.d(this.f11024b, Integer.hashCode(this.f11023a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BidiRun(start=");
        sb2.append(this.f11023a);
        sb2.append(", end=");
        sb2.append(this.f11024b);
        sb2.append(", isRtl=");
        return x5.o(sb2, this.f11025c, ')');
    }
}
