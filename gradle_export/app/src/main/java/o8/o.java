package o8;

import androidx.media3.common.s0;
import com.google.android.gms.internal.measurement.x5;
import e7.i0;
import fh.d2;
import fh.t0;
import java.util.ArrayList;
import java.util.Objects;
import ta.c0;

public final class o extends j {

    public final String f11724b;

    public final t0 f11725c;

    public o(String str, String str2, d2 d2Var) {
        super(str);
        c0.s(!d2Var.isEmpty());
        this.f11724b = str2;
        t0 t0VarO = t0.o(d2Var);
        this.f11725c = t0VarO;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    @Override
    public final void b(s0 s0Var) {
        byte b7;
        switch (this.f11712a) {
            case "TAL":
                b7 = 0;
                break;
            case "TCM":
                b7 = 1;
                break;
            case "TDA":
                b7 = 2;
                break;
            case "TP1":
                b7 = 3;
                break;
            case "TP2":
                b7 = 4;
                break;
            case "TP3":
                b7 = 5;
                break;
            case "TRK":
                b7 = 6;
                break;
            case "TT2":
                b7 = 7;
                break;
            case "TXT":
                b7 = 8;
                break;
            case "TYE":
                b7 = 9;
                break;
            case "TALB":
                b7 = 10;
                break;
            case "TCOM":
                b7 = 11;
                break;
            case "TCON":
                b7 = 12;
                break;
            case "TDAT":
                b7 = 13;
                break;
            case "TDRC":
                b7 = 14;
                break;
            case "TDRL":
                b7 = 15;
                break;
            case "TEXT":
                b7 = 16;
                break;
            case "TIT2":
                b7 = 17;
                break;
            case "TPE1":
                b7 = 18;
                break;
            case "TPE2":
                b7 = 19;
                break;
            case "TPE3":
                b7 = 20;
                break;
            case "TRCK":
                b7 = 21;
                break;
            case "TYER":
                b7 = 22;
                break;
            default:
                b7 = -1;
                break;
        }
        t0 t0Var = this.f11725c;
        try {
            switch (b7) {
                case 0:
                case 10:
                    s0Var.f1517c = (CharSequence) t0Var.get(0);
                    break;
                case 1:
                case 11:
                    s0Var.f1538z = (CharSequence) t0Var.get(0);
                    break;
                case 2:
                case 13:
                    String str = (String) t0Var.get(0);
                    int i10 = Integer.parseInt(str.substring(2, 4));
                    int i11 = Integer.parseInt(str.substring(0, 2));
                    s0Var.f1532t = Integer.valueOf(i10);
                    s0Var.f1533u = Integer.valueOf(i11);
                    break;
                case 3:
                case TYPE_SINT64_VALUE:
                    s0Var.f1516b = (CharSequence) t0Var.get(0);
                    break;
                case 4:
                case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                    s0Var.f1518d = (CharSequence) t0Var.get(0);
                    break;
                case 5:
                case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                    s0Var.A = (CharSequence) t0Var.get(0);
                    break;
                case 6:
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                    String str2 = (String) t0Var.get(0);
                    String str3 = i0.f5136a;
                    String[] strArrSplit = str2.split("/", -1);
                    int i12 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    s0Var.f1526n = Integer.valueOf(i12);
                    s0Var.f1527o = numValueOf;
                    break;
                case 7:
                case 17:
                    s0Var.f1515a = (CharSequence) t0Var.get(0);
                    break;
                case 8:
                case 16:
                    s0Var.f1537y = (CharSequence) t0Var.get(0);
                    break;
                case 9:
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                    s0Var.f1531s = Integer.valueOf(Integer.parseInt((String) t0Var.get(0)));
                    break;
                case 12:
                    Integer numA0 = bi.b.a0((String) t0Var.get(0));
                    if (numA0 != null) {
                        String strA = k.a(numA0.intValue());
                        if (strA != null) {
                            s0Var.D = strA;
                        }
                    } else {
                        s0Var.D = (CharSequence) t0Var.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListD = d((String) t0Var.get(0));
                    int size = arrayListD.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                s0Var.f1533u = (Integer) arrayListD.get(2);
                            }
                        }
                        s0Var.f1532t = (Integer) arrayListD.get(1);
                    }
                    s0Var.f1531s = (Integer) arrayListD.get(0);
                    break;
                case 15:
                    ArrayList arrayListD2 = d((String) t0Var.get(0));
                    int size2 = arrayListD2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                s0Var.f1536x = (Integer) arrayListD2.get(2);
                            }
                        }
                        s0Var.f1535w = (Integer) arrayListD2.get(1);
                    }
                    s0Var.f1534v = (Integer) arrayListD2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (Objects.equals(this.f11712a, oVar.f11712a) && Objects.equals(this.f11724b, oVar.f11724b) && this.f11725c.equals(oVar.f11725c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = x5.e(527, this.f11712a, 31);
        String str = this.f11724b;
        return this.f11725c.hashCode() + ((iE + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override
    public final String toString() {
        return this.f11712a + ": description=" + this.f11724b + ": values=" + this.f11725c;
    }
}
