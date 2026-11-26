package androidx.media3.common;

import android.text.TextUtils;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.internal.measurement.x5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

public final class t {
    public static final String A0;
    public static final t Q = new t(new s());
    public static final String R = Integer.toString(0, 36);
    public static final String S = Integer.toString(1, 36);
    public static final String T = Integer.toString(2, 36);
    public static final String U = Integer.toString(3, 36);
    public static final String V = Integer.toString(4, 36);
    public static final String W = Integer.toString(5, 36);
    public static final String X = Integer.toString(6, 36);
    public static final String Y = Integer.toString(7, 36);
    public static final String Z;

    public static final String f1557a0;

    public static final String f1558b0;

    public static final String f1559c0;

    public static final String f1560d0;

    public static final String f1561e0;

    public static final String f1562f0;

    public static final String f1563g0;

    public static final String f1564h0;

    public static final String f1565i0;

    public static final String f1566j0;

    public static final String f1567k0;

    public static final String f1568l0;

    public static final String f1569m0;

    public static final String f1570n0;

    public static final String f1571o0;

    public static final String f1572p0;

    public static final String f1573q0;

    public static final String f1574r0;

    public static final String f1575s0;

    public static final String f1576t0;

    public static final String f1577u0;

    public static final String f1578v0;

    public static final String f1579w0;

    public static final String f1580x0;

    public static final String f1581y0;

    public static final String f1582z0;
    public final float A;
    public final byte[] B;
    public final int C;
    public final i D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public int P;

    public final String f1583a;

    public final String f1584b;

    public final fh.t0 f1585c;

    public final String f1586d;

    public final int f1587e;

    public final int f1588f;

    public final int f1589g;

    public final int f1590h;

    public final int f1591i;

    public final int f1592j;

    public final String f1593k;
    public final v0 l;
    public final String m;

    public final String f1594n;

    public final int f1595o;

    public final int f1596p;

    public final List f1597q;

    public final o f1598r;

    public final long f1599s;

    public final boolean f1600t;

    public final int f1601u;

    public final int f1602v;

    public final int f1603w;

    public final int f1604x;

    public final float f1605y;

    public final int f1606z;

    static {
        Integer.toString(8, 36);
        Z = Integer.toString(9, 36);
        f1557a0 = Integer.toString(10, 36);
        f1558b0 = Integer.toString(11, 36);
        f1559c0 = Integer.toString(12, 36);
        f1560d0 = Integer.toString(13, 36);
        f1561e0 = Integer.toString(14, 36);
        f1562f0 = Integer.toString(15, 36);
        f1563g0 = Integer.toString(16, 36);
        f1564h0 = Integer.toString(17, 36);
        f1565i0 = Integer.toString(18, 36);
        f1566j0 = Integer.toString(19, 36);
        f1567k0 = Integer.toString(20, 36);
        f1568l0 = Integer.toString(21, 36);
        f1569m0 = Integer.toString(22, 36);
        f1570n0 = Integer.toString(23, 36);
        f1571o0 = Integer.toString(24, 36);
        f1572p0 = Integer.toString(25, 36);
        f1573q0 = Integer.toString(26, 36);
        f1574r0 = Integer.toString(27, 36);
        f1575s0 = Integer.toString(28, 36);
        f1576t0 = Integer.toString(29, 36);
        f1577u0 = Integer.toString(30, 36);
        f1578v0 = Integer.toString(31, 36);
        f1579w0 = Integer.toString(32, 36);
        f1580x0 = Integer.toString(33, 36);
        f1581y0 = Integer.toString(34, 36);
        f1582z0 = Integer.toString(35, 36);
        A0 = Integer.toString(36, 36);
    }

    public t(s sVar) {
        boolean z10;
        String str;
        this.f1583a = sVar.f1491a;
        String strI = e7.i0.I(sVar.f1494d);
        this.f1586d = strI;
        if (sVar.f1493c.isEmpty() && sVar.f1492b != null) {
            this.f1585c = fh.t0.s(new b0(strI, sVar.f1492b));
            this.f1584b = sVar.f1492b;
        } else if (sVar.f1493c.isEmpty() || sVar.f1492b != null) {
            if (!sVar.f1493c.isEmpty() || sVar.f1492b != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= sVar.f1493c.size()) {
                        z10 = false;
                        break;
                    } else {
                        if (((b0) sVar.f1493c.get(i10)).f1100b.equals(sVar.f1492b)) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    }
                }
            } else {
                z10 = true;
                break;
            }
            ta.c0.A(z10);
            this.f1585c = sVar.f1493c;
            this.f1584b = sVar.f1492b;
        } else {
            fh.t0 t0Var = sVar.f1493c;
            this.f1585c = t0Var;
            Iterator it = t0Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((b0) t0Var.get(0)).f1100b;
                    break;
                }
                b0 b0Var = (b0) it.next();
                if (TextUtils.equals(b0Var.f1099a, strI)) {
                    str = b0Var.f1100b;
                    break;
                }
            }
            this.f1584b = str;
        }
        this.f1587e = sVar.f1495e;
        ta.c0.z("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", sVar.f1497g == 0 || (sVar.f1496f & 32768) != 0);
        this.f1588f = sVar.f1496f;
        this.f1589g = sVar.f1497g;
        int i11 = sVar.f1498h;
        this.f1590h = i11;
        int i12 = sVar.f1499i;
        this.f1591i = i12;
        this.f1592j = i12 != -1 ? i12 : i11;
        this.f1593k = sVar.f1500j;
        this.l = sVar.f1501k;
        this.m = sVar.l;
        this.f1594n = sVar.m;
        this.f1595o = sVar.f1502n;
        this.f1596p = sVar.f1503o;
        List list = sVar.f1504p;
        this.f1597q = list == null ? Collections.EMPTY_LIST : list;
        o oVar = sVar.f1505q;
        this.f1598r = oVar;
        this.f1599s = sVar.f1506r;
        this.f1600t = sVar.f1507s;
        this.f1601u = sVar.f1508t;
        this.f1602v = sVar.f1509u;
        this.f1603w = sVar.f1510v;
        this.f1604x = sVar.f1511w;
        this.f1605y = sVar.f1512x;
        int i13 = sVar.f1513y;
        this.f1606z = i13 == -1 ? 0 : i13;
        float f3 = sVar.f1514z;
        this.A = f3 == -1.0f ? 1.0f : f3;
        this.B = sVar.A;
        this.C = sVar.B;
        this.D = sVar.C;
        this.E = sVar.D;
        this.F = sVar.E;
        this.G = sVar.F;
        this.H = sVar.G;
        int i14 = sVar.H;
        this.I = i14 == -1 ? 0 : i14;
        int i15 = sVar.I;
        this.J = i15 != -1 ? i15 : 0;
        this.K = sVar.J;
        this.L = sVar.K;
        this.M = sVar.L;
        this.N = sVar.M;
        int i16 = sVar.N;
        if (i16 != 0 || oVar == null) {
            this.O = i16;
        } else {
            this.O = 1;
        }
    }

    public static String c(t tVar) {
        int i10;
        String str;
        String str2;
        if (tVar == null) {
            return "null";
        }
        int i11 = tVar.f1587e;
        fh.t0 t0Var = tVar.f1585c;
        String str3 = tVar.f1586d;
        int i12 = tVar.G;
        int i13 = tVar.F;
        int i14 = tVar.E;
        float f3 = tVar.f1605y;
        i iVar = tVar.D;
        float f10 = tVar.A;
        int i15 = tVar.f1604x;
        int i16 = tVar.f1603w;
        int i17 = tVar.f1602v;
        int i18 = tVar.f1601u;
        o oVar = tVar.f1598r;
        String str4 = tVar.f1593k;
        int i19 = tVar.f1592j;
        String str5 = tVar.m;
        int i20 = tVar.f1588f;
        eh.l lVar = new eh.l(String.valueOf(','));
        StringBuilder sbQ = x5.q("id=");
        sbQ.append(tVar.f1583a);
        sbQ.append(", mimeType=");
        sbQ.append(tVar.f1594n);
        if (str5 != null) {
            sbQ.append(", container=");
            sbQ.append(str5);
        }
        if (i19 != -1) {
            sbQ.append(", bitrate=");
            sbQ.append(i19);
        }
        if (str4 != null) {
            sbQ.append(", codecs=");
            sbQ.append(str4);
        }
        if (oVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i21 = 0; i21 < oVar.D; i21++) {
                UUID uuid = oVar.A[i21].B;
                if (uuid.equals(h.f1215b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(h.f1216c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(h.f1218e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(h.f1217d)) {
                    linkedHashSet.add("widevine");
                } else {
                    if (uuid.equals(h.f1214a)) {
                        linkedHashSet.add("universal");
                    } else {
                        linkedHashSet.add("unknown (" + uuid + ")");
                    }
                }
            }
            sbQ.append(", drm=[");
            lVar.a(sbQ, linkedHashSet.iterator());
            sbQ.append(']');
        }
        if (i18 != -1 && i17 != -1) {
            w.c.v(sbQ, ", res=", i18, "x", i17);
        }
        if (i16 != -1 && i15 != -1) {
            w.c.v(sbQ, ", decRes=", i16, "x", i15);
        }
        double d3 = f10;
        int i22 = hh.c.f7066a;
        if (Math.copySign(d3 - 1.0d, 1.0d) > 0.001d && d3 != 1.0d && (!Double.isNaN(d3) || !Double.isNaN(1.0d))) {
            sbQ.append(", par=");
            Object[] objArr = {Float.valueOf(f10)};
            String str6 = e7.i0.f5136a;
            sbQ.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (iVar != null) {
            int i23 = iVar.f1248f;
            int i24 = iVar.f1247e;
            if ((i24 != -1 && i23 != -1) || iVar.d()) {
                sbQ.append(", color=");
                if (iVar.d()) {
                    String strB = i.b(iVar.f1243a);
                    String strA = i.a(iVar.f1244b);
                    String strC = i.c(iVar.f1245c);
                    String str7 = e7.i0.f5136a;
                    Locale locale = Locale.US;
                    str2 = strB + "/" + strA + "/" + strC;
                } else {
                    str2 = "NA/NA/NA";
                }
                sbQ.append(str2 + "/" + ((i24 == -1 || i23 == -1) ? "NA/NA" : i24 + "/" + i23));
            }
        }
        if (f3 != -1.0f) {
            sbQ.append(", fps=");
            sbQ.append(f3);
        }
        if (i14 != -1) {
            sbQ.append(", maxSubLayers=");
            sbQ.append(i14);
        }
        if (i13 != -1) {
            sbQ.append(", channels=");
            sbQ.append(i13);
        }
        if (i12 != -1) {
            sbQ.append(", sample_rate=");
            sbQ.append(i12);
        }
        if (str3 != null) {
            sbQ.append(", language=");
            sbQ.append(str3);
        }
        boolean zIsEmpty = t0Var.isEmpty();
        int i25 = 3;
        if (!zIsEmpty) {
            sbQ.append(", labels=[");
            lVar.a(sbQ, fh.w.A(new a8.n(i25), t0Var).iterator());
            sbQ.append("]");
        }
        if (i11 != 0) {
            sbQ.append(", selectionFlags=[");
            String str8 = e7.i0.f5136a;
            ArrayList arrayList = new ArrayList();
            if ((i11 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i11 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i11 & 2) != 0) {
                arrayList.add("forced");
            }
            lVar.a(sbQ, arrayList.iterator());
            sbQ.append("]");
        }
        if (i20 != 0) {
            sbQ.append(", roleFlags=[");
            String str9 = e7.i0.f5136a;
            ArrayList arrayList2 = new ArrayList();
            if ((i20 & 1) != 0) {
                arrayList2.add(MediaTrack.ROLE_MAIN);
            }
            if ((i20 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i20 & 4) != 0) {
                arrayList2.add(MediaTrack.ROLE_SUPPLEMENTARY);
            }
            if ((i20 & 8) != 0) {
                arrayList2.add(MediaTrack.ROLE_COMMENTARY);
            }
            if ((i20 & 16) != 0) {
                arrayList2.add(MediaTrack.ROLE_DUB);
            }
            if ((i20 & 32) != 0) {
                arrayList2.add(MediaTrack.ROLE_EMERGENCY);
            }
            if ((i20 & 64) != 0) {
                arrayList2.add(MediaTrack.ROLE_CAPTION);
            }
            i10 = i20;
            if ((i10 & Cast.MAX_NAMESPACE_LENGTH) != 0) {
                arrayList2.add(MediaTrack.ROLE_SUBTITLE);
            }
            if ((i10 & 256) != 0) {
                arrayList2.add(MediaTrack.ROLE_SIGN);
            }
            if ((i10 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i10 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i10 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i10 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i10 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i10 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i10 & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            lVar.a(sbQ, arrayList2.iterator());
            sbQ.append("]");
        } else {
            i10 = i20;
        }
        if ((i10 & 32768) != 0) {
            sbQ.append(", auxiliaryTrackType=");
            int i26 = tVar.f1589g;
            String str10 = e7.i0.f5136a;
            if (i26 == 0) {
                str = "undefined";
            } else if (i26 == 1) {
                str = "original";
            } else if (i26 == 2) {
                str = "depth-linear";
            } else if (i26 == 3) {
                str = "depth-inverse";
            } else {
                if (i26 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sbQ.append(str);
        }
        return sbQ.toString();
    }

    public final s a() {
        s sVar = new s();
        sVar.f1491a = this.f1583a;
        sVar.f1492b = this.f1584b;
        sVar.f1493c = this.f1585c;
        sVar.f1494d = this.f1586d;
        sVar.f1495e = this.f1587e;
        sVar.f1496f = this.f1588f;
        sVar.f1498h = this.f1590h;
        sVar.f1499i = this.f1591i;
        sVar.f1500j = this.f1593k;
        sVar.f1501k = this.l;
        sVar.l = this.m;
        sVar.m = this.f1594n;
        sVar.f1502n = this.f1595o;
        sVar.f1503o = this.f1596p;
        sVar.f1504p = this.f1597q;
        sVar.f1505q = this.f1598r;
        sVar.f1506r = this.f1599s;
        sVar.f1507s = this.f1600t;
        sVar.f1508t = this.f1601u;
        sVar.f1509u = this.f1602v;
        sVar.f1510v = this.f1603w;
        sVar.f1511w = this.f1604x;
        sVar.f1512x = this.f1605y;
        sVar.f1513y = this.f1606z;
        sVar.f1514z = this.A;
        sVar.A = this.B;
        sVar.B = this.C;
        sVar.C = this.D;
        sVar.D = this.E;
        sVar.E = this.F;
        sVar.F = this.G;
        sVar.G = this.H;
        sVar.H = this.I;
        sVar.I = this.J;
        sVar.J = this.K;
        sVar.K = this.L;
        sVar.L = this.M;
        sVar.M = this.N;
        sVar.N = this.O;
        return sVar;
    }

    public final boolean b(t tVar) {
        List list = this.f1597q;
        if (list.size() != tVar.f1597q.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) tVar.f1597q.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        int i11 = this.P;
        return (i11 == 0 || (i10 = tVar.P) == 0 || i11 == i10) && this.f1587e == tVar.f1587e && this.f1588f == tVar.f1588f && this.f1589g == tVar.f1589g && this.f1590h == tVar.f1590h && this.f1591i == tVar.f1591i && this.f1595o == tVar.f1595o && this.f1599s == tVar.f1599s && this.f1601u == tVar.f1601u && this.f1602v == tVar.f1602v && this.f1603w == tVar.f1603w && this.f1604x == tVar.f1604x && this.f1606z == tVar.f1606z && this.C == tVar.C && this.E == tVar.E && this.F == tVar.F && this.G == tVar.G && this.H == tVar.H && this.I == tVar.I && this.J == tVar.J && this.K == tVar.K && this.M == tVar.M && this.N == tVar.N && this.O == tVar.O && Float.compare(this.f1605y, tVar.f1605y) == 0 && Float.compare(this.A, tVar.A) == 0 && Objects.equals(this.f1583a, tVar.f1583a) && Objects.equals(this.f1584b, tVar.f1584b) && this.f1585c.equals(tVar.f1585c) && Objects.equals(this.f1593k, tVar.f1593k) && Objects.equals(this.m, tVar.m) && Objects.equals(this.f1594n, tVar.f1594n) && Objects.equals(this.f1586d, tVar.f1586d) && Arrays.equals(this.B, tVar.B) && Objects.equals(this.l, tVar.l) && Objects.equals(this.D, tVar.D) && Objects.equals(this.f1598r, tVar.f1598r) && b(tVar);
    }

    public final int hashCode() {
        if (this.P == 0) {
            String str = this.f1583a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f1584b;
            int iHashCode2 = (this.f1585c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f1586d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f1587e) * 31) + this.f1588f) * 31) + this.f1589g) * 31) + this.f1590h) * 31) + this.f1591i) * 31;
            String str4 = this.f1593k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            v0 v0Var = this.l;
            int iHashCode5 = (iHashCode4 + (v0Var == null ? 0 : v0Var.hashCode())) * 961;
            String str5 = this.m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f1594n;
            this.P = ((((((((((((((((((((((Float.floatToIntBits(this.A) + ((((Float.floatToIntBits(this.f1605y) + ((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f1595o) * 31) + ((int) this.f1599s)) * 31) + this.f1601u) * 31) + this.f1602v) * 31) + this.f1603w) * 31) + this.f1604x) * 31)) * 31) + this.f1606z) * 31)) * 31) + this.C) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.M) * 31) + this.N) * 31) + this.O;
        }
        return this.P;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f1583a);
        sb2.append(", ");
        sb2.append(this.f1584b);
        sb2.append(", ");
        sb2.append(this.m);
        sb2.append(", ");
        sb2.append(this.f1594n);
        sb2.append(", ");
        sb2.append(this.f1593k);
        sb2.append(", ");
        sb2.append(this.f1592j);
        sb2.append(", ");
        sb2.append(this.f1586d);
        sb2.append(", [");
        sb2.append(this.f1601u);
        sb2.append(", ");
        sb2.append(this.f1602v);
        sb2.append(", ");
        sb2.append(this.f1605y);
        sb2.append(", ");
        sb2.append(this.D);
        sb2.append("], [");
        sb2.append(this.F);
        sb2.append(", ");
        return g4.c.g(this.G, "])", sb2);
    }
}
