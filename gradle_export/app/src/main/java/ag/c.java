package ag;

import android.animation.TimeInterpolator;

public final class c {

    public long f471a;

    public long f472b;

    public TimeInterpolator f473c;

    public int f474d;

    public int f475e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f473c;
        return timeInterpolator != null ? timeInterpolator : a.f466b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f471a == cVar.f471a && this.f472b == cVar.f472b && this.f474d == cVar.f474d && this.f475e == cVar.f475e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f471a;
        long j10 = this.f472b;
        return ((((a().getClass().hashCode() + (((((int) (j9 ^ (j9 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31)) * 31) + this.f474d) * 31) + this.f475e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(c.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f471a);
        sb2.append(" duration: ");
        sb2.append(this.f472b);
        sb2.append(" interpolator: ");
        sb2.append(a().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f474d);
        sb2.append(" repeatMode: ");
        return g4.c.g(this.f475e, "}\n", sb2);
    }
}
