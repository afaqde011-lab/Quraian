package z4;

import java.util.Objects;

public final class g {

    public final String f17191a;

    public final int f17192b;

    public final int f17193c;

    public g(String str, int i10, int i11) {
        this.f17191a = str;
        this.f17192b = i10;
        this.f17193c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Objects.equals(this.f17191a, gVar.f17191a) && this.f17192b == gVar.f17192b && this.f17193c == gVar.f17193c;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f17192b);
        Integer numValueOf2 = Integer.valueOf(this.f17193c);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(this.f17191a, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisplayShapeCompat{ spec=");
        String str = this.f17191a;
        sb2.append(str != null ? Integer.valueOf(str.hashCode()) : "null");
        sb2.append(" displayWidth=");
        sb2.append(this.f17192b);
        sb2.append(" displayHeight=");
        return g4.c.g(this.f17193c, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}", sb2);
    }
}
