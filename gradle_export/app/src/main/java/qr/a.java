package qr;

import com.google.android.gms.internal.measurement.x5;

public final class a {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final long e;

    public a(int i, int i2, long j, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && kotlin.jvm.internal.m.a(this.b, aVar.b) && kotlin.jvm.internal.m.a(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e;
    }

    public final int hashCode() {
        int iE = x5.e(Integer.hashCode(this.a) * 31, this.b, 31);
        String str = this.c;
        return Long.hashCode(this.e) + w.c.d(this.d, (iE + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM = g4.c.m("CollectionDownloadsDvo(collectionId=", this.a, ", title=", this.b, ", coverUrl=");
        sbM.append(this.c);
        sbM.append(", surahCount=");
        sbM.append(this.d);
        sbM.append(", downloadsSize=");
        return a1.b.k(this.e, ")", sbM);
    }
}
