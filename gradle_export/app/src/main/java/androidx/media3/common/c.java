package androidx.media3.common;

import java.util.Arrays;

public final class c {

    public static final c f1128f = new c(new a[0], 0, -9223372036854775807L, 0);

    public static final a f1129g;

    public static final String f1130h;

    public static final String f1131i;

    public static final String f1132j;

    public static final String f1133k;

    public final int f1134a;

    public final long f1135b;

    public final long f1136c;

    public final int f1137d;

    public final a[] f1138e;

    static {
        a aVar = new a(0L, -1, -1, new int[0], new q0[0], new long[0], 0L, false, new String[0], new b[0], false);
        int[] iArr = aVar.f1055f;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = aVar.f1056g;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        q0[] q0VarArr = (q0[]) Arrays.copyOf(aVar.f1054e, 0);
        String[] strArr = (String[]) Arrays.copyOf(aVar.f1057h, 0);
        b[] bVarArr = aVar.f1058i;
        f1129g = new a(aVar.f1050a, 0, aVar.f1052c, iArrCopyOf, q0VarArr, jArrCopyOf, aVar.f1059j, aVar.f1060k, strArr, (b[]) Arrays.copyOf(bVarArr, Math.max(0, bVarArr.length)), aVar.l);
        String str = e7.i0.f5136a;
        f1130h = Integer.toString(1, 36);
        f1131i = Integer.toString(2, 36);
        f1132j = Integer.toString(3, 36);
        f1133k = Integer.toString(4, 36);
    }

    public c(a[] aVarArr, long j9, long j10, int i10) {
        this.f1135b = j9;
        this.f1136c = j10;
        this.f1134a = aVarArr.length + i10;
        this.f1138e = aVarArr;
        this.f1137d = i10;
    }

    public final a a(int i10) {
        int i11 = this.f1137d;
        return i10 < i11 ? f1129g : this.f1138e[i10 - i11];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1134a == cVar.f1134a && this.f1135b == cVar.f1135b && this.f1136c == cVar.f1136c && this.f1137d == cVar.f1137d && Arrays.equals(this.f1138e, cVar.f1138e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1138e) + (((((((this.f1134a * 961) + ((int) this.f1135b)) * 31) + ((int) this.f1136c)) * 31) + this.f1137d) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb2.append(this.f1135b);
        sb2.append(", adGroups=[");
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f1138e;
            if (i10 >= aVarArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=");
            sb2.append(aVarArr[i10].f1050a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < aVarArr[i10].f1055f.length; i11++) {
                sb2.append("ad(state=");
                int i12 = aVarArr[i10].f1055f[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(aVarArr[i10].f1056g[i11]);
                sb2.append(')');
                if (i11 < aVarArr[i10].f1055f.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < aVarArr.length - 1) {
                sb2.append(", ");
            }
            i10++;
        }
    }
}
