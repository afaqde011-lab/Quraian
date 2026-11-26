package qr;

import com.google.android.gms.internal.measurement.x5;

public final class s {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final String e;

    public s(int i, int i2, long j, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.a == sVar.a && kotlin.jvm.internal.m.a(this.b, sVar.b) && this.c == sVar.c && this.d == sVar.d && kotlin.jvm.internal.m.a(this.e, sVar.e);
    }

    public final int hashCode() {
        int iF = w.c.f(w.c.d(this.c, x5.e(Integer.hashCode(this.a) * 31, this.b, 31), 31), this.d, 31);
        String str = this.e;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = g4.c.m("ReciterDownloadsDvo(reciterId=", this.a, ", reciterName=", this.b, ", surahCount=");
        sbM.append(this.c);
        sbM.append(", downloadsSize=");
        sbM.append(this.d);
        return w.c.l(sbM, ", photoUrl=", this.e, ")");
    }
}
