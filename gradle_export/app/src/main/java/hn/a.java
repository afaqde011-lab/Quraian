package hn;

import android.graphics.Bitmap;
import com.google.android.gms.internal.measurement.x5;
import g4.c;
import kotlin.jvm.internal.m;

public final class a {
    public final int a;
    public final String b;
    public final String c;
    public final Bitmap d;
    public final boolean e;

    public a(int i, String reciterName, String subtitle, Bitmap bitmap, boolean z) {
        m.e(reciterName, "reciterName");
        m.e(subtitle, "subtitle");
        this.a = i;
        this.b = reciterName;
        this.c = subtitle;
        this.d = bitmap;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && m.a(this.b, aVar.b) && m.a(this.c, aVar.c) && m.a(this.d, aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        int iE = x5.e(x5.e(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31);
        Bitmap bitmap = this.d;
        return Boolean.hashCode(this.e) + ((iE + (bitmap == null ? 0 : bitmap.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM = c.m("FavoritesWidgetItem(reciterId=", this.a, ", reciterName=", this.b, ", subtitle=");
        sbM.append(this.c);
        sbM.append(", artwork=");
        sbM.append(this.d);
        sbM.append(", isPlaying=");
        return c.l(sbM, this.e, ")");
    }
}
