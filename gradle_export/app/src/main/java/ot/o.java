package ot;

import com.google.android.gms.internal.measurement.x5;

public final class o {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final int i;
    public final boolean j;

    public o(String id, String str, String str2, String imamName, String str3, String str4, String str5, boolean z, int i, boolean z2) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(imamName, "imamName");
        this.a = id;
        this.b = str;
        this.c = str2;
        this.d = imamName;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = z;
        this.i = i;
        this.j = z2;
    }

    public final o a() {
        String id = this.a;
        kotlin.jvm.internal.m.e(id, "id");
        String imamName = this.d;
        kotlin.jvm.internal.m.e(imamName, "imamName");
        return new o(id, this.b, this.c, imamName, this.e, this.f, this.g, this.h, this.i, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.m.a(this.a, oVar.a) && kotlin.jvm.internal.m.a(this.b, oVar.b) && kotlin.jvm.internal.m.a(this.c, oVar.c) && kotlin.jvm.internal.m.a(this.d, oVar.d) && kotlin.jvm.internal.m.a(this.e, oVar.e) && kotlin.jvm.internal.m.a(this.f, oVar.f) && kotlin.jvm.internal.m.a(this.g, oVar.g) && this.h == oVar.h && this.i == oVar.i && this.j == oVar.j;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iE = x5.e(x5.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31), this.d, 31);
        String str2 = this.e;
        int iHashCode2 = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return Boolean.hashCode(this.j) + w.c.d(this.i, w.c.e((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.h), 31);
    }

    public final String toString() {
        StringBuilder sbS = a1.b.s("TafsirOption(id=", this.a, ", languageCode=", this.b, ", languageName=");
        a1.b.z(sbS, this.c, ", imamName=", this.d, ", flagAssetName=");
        a1.b.z(sbS, this.e, ", imageUrl=", this.f, ", fileUrl=");
        sbS.append(this.g);
        sbS.append(", isDefault=");
        sbS.append(this.h);
        sbS.append(", contentVersion=");
        sbS.append(this.i);
        sbS.append(", isDownloaded=");
        sbS.append(this.j);
        sbS.append(")");
        return sbS.toString();
    }
}
