package nz;

public final class m {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;

    public m(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, String str, String str2) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
        this.f = z4;
        this.g = str;
        this.h = str2;
    }

    public static m a(m mVar, boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, String str, String str2, int i3) {
        if ((i3 & 1) != 0) {
            z = mVar.a;
        }
        boolean z5 = z;
        if ((i3 & 2) != 0) {
            z2 = mVar.b;
        }
        boolean z6 = z2;
        if ((i3 & 4) != 0) {
            i = mVar.c;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = mVar.d;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            z3 = mVar.e;
        }
        boolean z7 = z3;
        if ((i3 & 32) != 0) {
            z4 = mVar.f;
        }
        boolean z8 = z4;
        String str3 = (i3 & 64) != 0 ? mVar.g : str;
        String str4 = (i3 & 128) != 0 ? mVar.h : str2;
        mVar.getClass();
        return new m(z5, z6, i4, i5, z7, z8, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a == mVar.a && this.b == mVar.b && this.c == mVar.c && this.d == mVar.d && this.e == mVar.e && this.f == mVar.f && kotlin.jvm.internal.m.a(this.g, mVar.g) && kotlin.jvm.internal.m.a(this.h, mVar.h);
    }

    public final int hashCode() {
        int iE = w.c.e(w.c.e(w.c.d(this.d, w.c.d(this.c, w.c.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f);
        String str = this.g;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationUiState(isTimePickerVisible=");
        sb.append(this.a);
        sb.append(", isSelectedPickerDaily=");
        sb.append(this.b);
        sb.append(", selectedPickerHour=");
        w.c.u(sb, this.c, ", selectedPickerMinute=", this.d, ", isDailyNotificationEnabled=");
        oi.k.y(sb, this.e, ", isWeeklyNotificationEnabled=", this.f, ", dailyNotificationTime=");
        return oi.k.m(sb, this.g, ", weeklyNotificationTime=", this.h, ")");
    }
}
