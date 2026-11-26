package bz;

public final class p {
    public final boolean a;
    public final boolean b;
    public final u30.b c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public p(boolean z, boolean z2, u30.b devices, String str, String str2, boolean z3, boolean z4, boolean z5) {
        kotlin.jvm.internal.m.e(devices, "devices");
        this.a = z;
        this.b = z2;
        this.c = devices;
        this.d = str;
        this.e = str2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
    }

    public static p a(p pVar, boolean z, u30.b devices, String str, String str2, boolean z2, boolean z3, boolean z4, int i) {
        boolean z5 = (i & 1) != 0 ? pVar.a : false;
        if ((i & 2) != 0) {
            z = pVar.b;
        }
        if ((i & 4) != 0) {
            devices = pVar.c;
        }
        if ((i & 8) != 0) {
            str = pVar.d;
        }
        if ((i & 16) != 0) {
            str2 = pVar.e;
        }
        if ((i & 32) != 0) {
            z2 = pVar.f;
        }
        if ((i & 64) != 0) {
            z3 = pVar.g;
        }
        if ((i & 128) != 0) {
            z4 = pVar.h;
        }
        boolean z6 = z4;
        pVar.getClass();
        kotlin.jvm.internal.m.e(devices, "devices");
        boolean z7 = z3;
        boolean z8 = z2;
        String str3 = str2;
        String str4 = str;
        return new p(z5, z, devices, str4, str3, z8, z7, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a == pVar.a && this.b == pVar.b && kotlin.jvm.internal.m.a(this.c, pVar.c) && kotlin.jvm.internal.m.a(this.d, pVar.d) && kotlin.jvm.internal.m.a(this.e, pVar.e) && this.f == pVar.f && this.g == pVar.g && this.h == pVar.h;
    }

    public final int hashCode() {
        int iC = g4.c.c(this.c, w.c.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Boolean.hashCode(this.h) + w.c.e(w.c.e((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "DevicesUiState(isLoading=" + this.a + ", isRefreshing=" + this.b + ", devices=" + this.c + ", selectedDeviceId=" + this.d + ", terminateDeviceId=" + this.e + ", isTerminateDeviceDialogVisible=" + this.f + ", isTerminateOthersDialogVisible=" + this.g + ", isTerminating=" + this.h + ")";
    }
}
