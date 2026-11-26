package ez;

import java.time.LocalDate;

public final class t {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final ep.f e;
    public final LocalDate f;
    public final boolean g;
    public final boolean h;

    public t(String str, String str2, String str3, int i, ep.f fVar, LocalDate localDate, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = fVar;
        this.f = localDate;
        this.g = z;
        this.h = z2;
    }

    public static t a(t tVar, String str, String str2, String str3, int i, ep.f fVar, LocalDate localDate, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            str = tVar.a;
        }
        String nameValue = str;
        if ((i2 & 2) != 0) {
            str2 = tVar.b;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = tVar.c;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            i = tVar.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            fVar = tVar.e;
        }
        ep.f fVar2 = fVar;
        if ((i2 & 32) != 0) {
            localDate = tVar.f;
        }
        LocalDate localDate2 = localDate;
        boolean z3 = (i2 & 64) != 0 ? tVar.g : z;
        tVar.getClass();
        boolean z4 = (i2 & 256) != 0 ? tVar.h : z2;
        tVar.getClass();
        kotlin.jvm.internal.m.e(nameValue, "nameValue");
        return new t(nameValue, str4, str5, i3, fVar2, localDate2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a.equals(tVar.a) && kotlin.jvm.internal.m.a(this.b, tVar.b) && kotlin.jvm.internal.m.a(this.c, tVar.c) && this.d == tVar.d && this.e == tVar.e && kotlin.jvm.internal.m.a(this.f, tVar.f) && this.g == tVar.g && this.h == tVar.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iD = w.c.d(this.d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        ep.f fVar = this.e;
        int iHashCode3 = (iD + (fVar == null ? 0 : fVar.hashCode())) * 31;
        LocalDate localDate = this.f;
        return Boolean.hashCode(this.h) + w.c.e(w.c.e((iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.g), 31, false);
    }

    public final String toString() {
        StringBuilder sbS = a1.b.s("EditDetailsUiState(nameValue=", this.a, ", nameError=", this.b, ", submitError=");
        sbS.append(this.c);
        sbS.append(", errorShakeKey=");
        sbS.append(this.d);
        sbS.append(", sex=");
        sbS.append(this.e);
        sbS.append(", birthDate=");
        sbS.append(this.f);
        sbS.append(", isLoading=");
        sbS.append(this.g);
        sbS.append(", isDeleting=false, isDeleteDialogVisible=");
        sbS.append(this.h);
        sbS.append(")");
        return sbS.toString();
    }
}
