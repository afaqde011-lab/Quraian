package z4;

import com.google.protobuf.RuntimeVersion;
import java.util.Objects;

public final class h {

    public final g f17196a;

    static {
        new h(RuntimeVersion.SUFFIX, 0, 0);
    }

    public h(String str, int i10, int i11) {
        this.f17196a = new g(str, i10, i11);
    }

    public static h a(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
        String string;
        if (z10) {
            int i16 = i10 / 2;
            int i17 = i11 / 2;
            StringBuilder sbP = oi.k.p(i17, i16, "M0,", " A", ",");
            w.c.u(sbP, i17, " 0 1,1 ", i10, ",");
            w.c.u(sbP, i17, " A", i16, ",");
            sbP.append(i17);
            sbP.append(" 0 1,1 0,");
            sbP.append(i17);
            sbP.append(" Z");
            string = sbP.toString();
        } else {
            StringBuilder sb2 = new StringBuilder("M ");
            int iMin = Math.min(i10 / 2, i11 / 2);
            int iMin2 = Math.min(iMin, i12);
            int iMin3 = Math.min(iMin, i13);
            int iMin4 = Math.min(iMin, i14);
            int iMin5 = Math.min(iMin, i15);
            sb2.append(iMin2);
            sb2.append(",0 L ");
            sb2.append(i10 - iMin3);
            sb2.append(",0");
            if (iMin3 > 0) {
                w.c.v(sb2, " A ", iMin3, ",", iMin3);
                w.c.v(sb2, " 0 0,1 ", i10, ",", iMin3);
            }
            sb2.append(" L ");
            sb2.append(i10);
            sb2.append(",");
            sb2.append(i11 - iMin4);
            if (iMin4 > 0) {
                w.c.v(sb2, " A ", iMin4, ",", iMin4);
                sb2.append(" 0 0,1 ");
                sb2.append(i10 - iMin4);
                sb2.append(",");
                sb2.append(i11);
            }
            w.c.v(sb2, " L ", iMin5, ",", i11);
            if (iMin5 > 0) {
                w.c.v(sb2, " A ", iMin5, ",", iMin5);
                sb2.append(" 0 0,1 0,");
                sb2.append(i11 - iMin5);
            }
            if (iMin2 > 0) {
                w.c.v(sb2, " L 0,", iMin2, " A ", iMin2);
                w.c.v(sb2, ",", iMin2, " 0 0,1 ", iMin2);
                sb2.append(",0");
            }
            sb2.append(" Z");
            string = sb2.toString();
        }
        return new h(string, i10, i11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return Objects.equals(this.f17196a, ((h) obj).f17196a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f17196a);
    }

    public final String toString() {
        return this.f17196a.toString();
    }
}
