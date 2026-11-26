package n8;

import androidx.media3.common.s0;
import androidx.media3.common.u0;
import com.google.android.gms.internal.measurement.x5;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import ta.c0;

public final class b implements u0 {

    public final int f11188a;

    public final String f11189b;

    public final String f11190c;

    public final String f11191d;

    public final boolean f11192e;

    public final int f11193f;

    public b(int i10, int i11, String str, String str2, String str3, boolean z10) {
        c0.s(i11 == -1 || i11 > 0);
        this.f11188a = i10;
        this.f11189b = str;
        this.f11190c = str2;
        this.f11191d = str3;
        this.f11192e = z10;
        this.f11193f = i11;
    }

    public static b d(Map map) {
        boolean z10;
        int i10;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i11;
        List list = (List) map.get("icy-br");
        boolean z11 = true;
        int i12 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i11 = Integer.parseInt(str4) * 1000;
                if (i11 > 0) {
                    z10 = true;
                } else {
                    try {
                        e7.a.m("IcyHeaders", "Invalid bitrate: " + str4);
                        z10 = false;
                        i11 = -1;
                    } catch (NumberFormatException unused) {
                        x5.x("Invalid bitrate header: ", str4, "IcyHeaders");
                        z10 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i11 = -1;
            }
            i10 = i11;
        } else {
            z10 = false;
            i10 = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z10 = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z10 = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z10 = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z10 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i13 = Integer.parseInt(str5);
                if (i13 > 0) {
                    i12 = i13;
                } else {
                    try {
                        e7.a.m("IcyHeaders", "Invalid metadata interval: " + str5);
                        z11 = z10;
                    } catch (NumberFormatException unused3) {
                        i12 = i13;
                        x5.x("Invalid metadata interval: ", str5, "IcyHeaders");
                    }
                }
                z10 = z11;
            } catch (NumberFormatException unused4) {
            }
        }
        int i14 = i12;
        if (z10) {
            return new b(i10, i14, str, str2, str3, zEquals);
        }
        return null;
    }

    @Override
    public final void b(s0 s0Var) {
        String str = this.f11190c;
        if (str != null) {
            s0Var.F = str;
        }
        String str2 = this.f11189b;
        if (str2 != null) {
            s0Var.D = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f11188a == bVar.f11188a && Objects.equals(this.f11189b, bVar.f11189b) && Objects.equals(this.f11190c, bVar.f11190c) && Objects.equals(this.f11191d, bVar.f11191d) && this.f11192e == bVar.f11192e && this.f11193f == bVar.f11193f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (527 + this.f11188a) * 31;
        String str = this.f11189b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11190c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11191d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f11192e ? 1 : 0)) * 31) + this.f11193f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f11190c + "\", genre=\"" + this.f11189b + "\", bitrate=" + this.f11188a + ", metadataInterval=" + this.f11193f;
    }
}
