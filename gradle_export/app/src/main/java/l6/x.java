package l6;

import com.google.android.gms.internal.measurement.g4;
import k9.b3;

public final class x {

    public final long f10046a;

    public final long f10047b;

    public final long f10048c;

    public final b3 f10049d;

    public x() {
        s30.a aVar = s30.b.B;
        s30.d dVar = s30.d.E;
        long jB0 = g4.b0(45, dVar);
        long jB1 = g4.b0(5, dVar);
        long jB2 = g4.b0(5, dVar);
        this.f10046a = jB0;
        this.f10047b = jB1;
        this.f10048c = jB2;
        this.f10049d = w.f10045a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return s30.b.d(this.f10046a, xVar.f10046a) && s30.b.d(this.f10047b, xVar.f10047b) && s30.b.d(this.f10048c, xVar.f10048c) && kotlin.jvm.internal.m.a(this.f10049d, xVar.f10049d);
    }

    public final int hashCode() {
        s30.a aVar = s30.b.B;
        return this.f10049d.hashCode() + w.c.f(w.c.f(Long.hashCode(this.f10046a) * 31, this.f10047b, 31), this.f10048c, 31);
    }

    public final String toString() {
        return "TimeoutOptions(initialTimeout=" + ((Object) s30.b.j(this.f10046a)) + ", additionalTime=" + ((Object) s30.b.j(this.f10047b)) + ", idleTimeout=" + ((Object) s30.b.j(this.f10048c)) + ", timeSource=" + this.f10049d + ')';
    }
}
