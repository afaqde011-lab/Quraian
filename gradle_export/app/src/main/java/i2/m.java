package i2;

import android.graphics.BlendModeColorFilter;

public final class m {

    public final BlendModeColorFilter f7144a;

    public final long f7145b;

    public final int f7146c;

    public m(long j9, int i10) {
        this.f7144a = new BlendModeColorFilter(b0.C(j9), b0.y(i10));
        this.f7145b = j9;
        this.f7146c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return t.c(this.f7145b, mVar.f7145b) && this.f7146c == mVar.f7146c;
    }

    public final int hashCode() {
        int i10 = t.f7168h;
        return Integer.hashCode(this.f7146c) + (Long.hashCode(this.f7145b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BlendModeColorFilter(color=");
        w.c.s(this.f7145b, ", blendMode=", sb2);
        sb2.append((Object) l.a(this.f7146c));
        sb2.append(')');
        return sb2.toString();
    }
}
