package rc;

import java.util.ArrayList;

public final class o {

    public final long f13201a;

    public long f13202b;

    public int f13203c = 1;

    public final float f13204d;

    public final float f13205e;

    public final p f13206f;

    public final ArrayList f13207g;

    public o(long j9, long j10, float f3, float f10, p pVar, ArrayList arrayList) {
        this.f13201a = j9;
        this.f13202b = j10;
        this.f13204d = f3;
        this.f13205e = f10;
        this.f13206f = pVar;
        this.f13207g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f13201a == oVar.f13201a && this.f13202b == oVar.f13202b && this.f13203c == oVar.f13203c && Float.compare(this.f13204d, oVar.f13204d) == 0 && Float.compare(this.f13205e, oVar.f13205e) == 0 && this.f13206f.equals(oVar.f13206f) && this.f13207g.equals(oVar.f13207g);
    }

    public final int hashCode() {
        return this.f13207g.hashCode() + ((this.f13206f.hashCode() + w.c.c(this.f13205e, w.c.c(this.f13204d, w.c.d(this.f13203c, w.c.f(Long.hashCode(this.f13201a) * 31, this.f13202b, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "RageClickSession(firstClickTime=" + this.f13201a + ", lastClickTime=" + this.f13202b + ", clickCount=" + this.f13203c + ", firstClickX=" + this.f13204d + ", firstClickY=" + this.f13205e + ", targetInfo=" + this.f13206f + ", clicks=" + this.f13207g + ')';
    }
}
