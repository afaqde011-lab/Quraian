package tf;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

public final class o {

    public static final o f14676f = new o((Boolean) null, 100, (Boolean) null, (String) null);

    public final int f14677a;

    public final String f14678b;

    public final Boolean f14679c;

    public final String f14680d;

    public final EnumMap f14681e;

    public o(Boolean bool, int i10, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(s1.class);
        this.f14681e = enumMap;
        enumMap.put(s1.AD_USER_DATA, bool == null ? q1.UNINITIALIZED : bool.booleanValue() ? q1.GRANTED : q1.DENIED);
        this.f14677a = i10;
        this.f14678b = d();
        this.f14679c = bool2;
        this.f14680d = str;
    }

    public o(EnumMap enumMap, int i10, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(s1.class);
        this.f14681e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f14677a = i10;
        this.f14678b = d();
        this.f14679c = bool;
        this.f14680d = str;
    }

    public static o b(String str) {
        if (str == null || str.length() <= 0) {
            return f14676f;
        }
        String[] strArrSplit = str.split(":");
        int i10 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(s1.class);
        s1[] s1VarArr = r1.DMA.A;
        int length = s1VarArr.length;
        int i11 = 1;
        int i12 = 0;
        while (i12 < length) {
            enumMap.put(s1VarArr[i12], t1.e(strArrSplit[i11].charAt(0)));
            i12++;
            i11++;
        }
        return new o(enumMap, i10, (Boolean) null, (String) null);
    }

    public static o c(int i10, Bundle bundle) {
        if (bundle == null) {
            return new o((Boolean) null, i10, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(s1.class);
        for (s1 s1Var : r1.DMA.A) {
            enumMap.put(s1Var, t1.d(bundle.getString(s1Var.A)));
        }
        return new o(enumMap, i10, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final q1 a() {
        q1 q1Var = (q1) this.f14681e.get(s1.AD_USER_DATA);
        return q1Var == null ? q1.UNINITIALIZED : q1Var;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f14677a);
        for (s1 s1Var : r1.DMA.A) {
            sb2.append(":");
            sb2.append(t1.h((q1) this.f14681e.get(s1Var)));
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f14678b.equalsIgnoreCase(oVar.f14678b) && Objects.equals(this.f14679c, oVar.f14679c)) {
            return Objects.equals(this.f14680d, oVar.f14680d);
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        Boolean bool = this.f14679c;
        if (bool == null) {
            i10 = 3;
        } else {
            i10 = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.f14680d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.f14678b.hashCode() + (i10 * 29);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(t1.a(this.f14677a));
        for (s1 s1Var : r1.DMA.A) {
            sb2.append(",");
            sb2.append(s1Var.A);
            sb2.append("=");
            q1 q1Var = (q1) this.f14681e.get(s1Var);
            if (q1Var == null) {
                sb2.append("uninitialized");
            } else {
                int iOrdinal = q1Var.ordinal();
                if (iOrdinal == 0) {
                    sb2.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb2.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb2.append("denied");
                } else if (iOrdinal == 3) {
                    sb2.append("granted");
                }
            }
        }
        Boolean bool = this.f14679c;
        if (bool != null) {
            sb2.append(",isDmaRegion=");
            sb2.append(bool);
        }
        String str = this.f14680d;
        if (str != null) {
            sb2.append(",cpsDisplayStr=");
            sb2.append(str);
        }
        return sb2.toString();
    }
}
