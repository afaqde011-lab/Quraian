package i7;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.x5;

public final class d {

    public final String f7265a;

    public final androidx.media3.common.t f7266b;

    public final androidx.media3.common.t f7267c;

    public final int f7268d;

    public final int f7269e;

    public d(String str, androidx.media3.common.t tVar, androidx.media3.common.t tVar2, int i10, int i11) {
        ta.c0.s(i10 == 0 || i11 == 0);
        ta.c0.s(true ^ TextUtils.isEmpty(str));
        this.f7265a = str;
        tVar.getClass();
        this.f7266b = tVar;
        tVar2.getClass();
        this.f7267c = tVar2;
        this.f7268d = i10;
        this.f7269e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f7268d == dVar.f7268d && this.f7269e == dVar.f7269e && this.f7265a.equals(dVar.f7265a) && this.f7266b.equals(dVar.f7266b) && this.f7267c.equals(dVar.f7267c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7267c.hashCode() + ((this.f7266b.hashCode() + x5.e((((527 + this.f7268d) * 31) + this.f7269e) * 31, this.f7265a, 31)) * 31);
    }
}
