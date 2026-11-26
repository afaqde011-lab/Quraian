package qn;

import android.graphics.Bitmap;
import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;
import w.c;

public final class a {
    public final int a;
    public final Long b;
    public final String c;
    public final int d;
    public final Integer e;
    public final String f;
    public final String g;
    public final Bitmap h;
    public final boolean i;

    public a(int i, Long l, String surahName, int i2, Integer num, String reciterName, String subtitle, Bitmap bitmap, boolean z) {
        m.e(surahName, "surahName");
        m.e(reciterName, "reciterName");
        m.e(subtitle, "subtitle");
        this.a = i;
        this.b = l;
        this.c = surahName;
        this.d = i2;
        this.e = num;
        this.f = reciterName;
        this.g = subtitle;
        this.h = bitmap;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && m.a(this.b, aVar.b) && m.a(this.c, aVar.c) && this.d == aVar.d && m.a(this.e, aVar.e) && m.a(this.f, aVar.f) && m.a(this.g, aVar.g) && m.a(this.h, aVar.h) && this.i == aVar.i;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Long l = this.b;
        int iD = c.d(this.d, x5.e((iHashCode + (l == null ? 0 : l.hashCode())) * 31, this.c, 31), 31);
        Integer num = this.e;
        int iE = x5.e(x5.e((iD + (num == null ? 0 : num.hashCode())) * 31, this.f, 31), this.g, 31);
        Bitmap bitmap = this.h;
        return Boolean.hashCode(this.i) + ((iE + (bitmap != null ? bitmap.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentlyPlayedWidgetItem(surahNumber=");
        sb.append(this.a);
        sb.append(", surahId=");
        sb.append(this.b);
        sb.append(", surahName=");
        sb.append(this.c);
        sb.append(", reciterId=");
        sb.append(this.d);
        sb.append(", collectionId=");
        sb.append(this.e);
        sb.append(", reciterName=");
        sb.append(this.f);
        sb.append(", subtitle=");
        sb.append(this.g);
        sb.append(", artwork=");
        sb.append(this.h);
        sb.append(", isPlaying=");
        return g4.c.l(sb, this.i, ")");
    }
}
