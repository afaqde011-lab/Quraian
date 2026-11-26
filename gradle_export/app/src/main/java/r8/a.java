package r8;

import androidx.media3.common.s0;
import androidx.media3.common.u0;
import bi.b;
import com.google.android.gms.internal.measurement.x5;

public final class a implements u0 {

    public final String f13127a;

    public final String f13128b;

    public a(String str, String str2) {
        this.f13127a = w00.a.K(str);
        this.f13128b = str2;
    }

    @Override
    public final void b(s0 s0Var) {
        String str = this.f13127a;
        str.getClass();
        byte b7 = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b7 = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b7 = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b7 = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b7 = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b7 = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b7 = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b7 = 6;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b7 = 7;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b7 = 8;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b7 = 9;
                }
                break;
        }
        String str2 = this.f13128b;
        switch (b7) {
            case 0:
                Integer numA0 = b.a0(str2);
                if (numA0 != null) {
                    s0Var.f1527o = numA0;
                }
                break;
            case 1:
                Integer numA1 = b.a0(str2);
                if (numA1 != null) {
                    s0Var.C = numA1;
                }
                break;
            case 2:
                Integer numA2 = b.a0(str2);
                if (numA2 != null) {
                    s0Var.f1526n = numA2;
                }
                break;
            case 3:
                s0Var.f1517c = str2;
                break;
            case 4:
                s0Var.D = str2;
                break;
            case 5:
                s0Var.f1515a = str2;
                break;
            case 6:
                s0Var.f1521g = str2;
                break;
            case 7:
                Integer numA3 = b.a0(str2);
                if (numA3 != null) {
                    s0Var.B = numA3;
                }
                break;
            case 8:
                s0Var.f1518d = str2;
                break;
            case 9:
                s0Var.f1516b = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f13127a.equals(aVar.f13127a) && this.f13128b.equals(aVar.f13128b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13128b.hashCode() + x5.e(527, this.f13127a, 31);
    }

    public final String toString() {
        return "VC: " + this.f13127a + "=" + this.f13128b;
    }
}
