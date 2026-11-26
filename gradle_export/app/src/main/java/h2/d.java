package h2;

import a10.h0;
import c7.i;

public final class d {

    public final float f6550a;

    public final float f6551b;

    public final float f6552c;

    public final float f6553d;

    public final long f6554e;

    public final long f6555f;

    public final long f6556g;

    public final long f6557h;

    static {
        i.f(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public d(float f3, float f10, float f11, float f12, long j9, long j10, long j11, long j12) {
        this.f6550a = f3;
        this.f6551b = f10;
        this.f6552c = f11;
        this.f6553d = f12;
        this.f6554e = j9;
        this.f6555f = j10;
        this.f6556g = j11;
        this.f6557h = j12;
    }

    public final float a() {
        return this.f6553d - this.f6551b;
    }

    public final float b() {
        return this.f6552c - this.f6550a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f6550a, dVar.f6550a) == 0 && Float.compare(this.f6551b, dVar.f6551b) == 0 && Float.compare(this.f6552c, dVar.f6552c) == 0 && Float.compare(this.f6553d, dVar.f6553d) == 0 && a.a.u(this.f6554e, dVar.f6554e) && a.a.u(this.f6555f, dVar.f6555f) && a.a.u(this.f6556g, dVar.f6556g) && a.a.u(this.f6557h, dVar.f6557h);
    }

    public final int hashCode() {
        return Long.hashCode(this.f6557h) + w.c.f(w.c.f(w.c.f(w.c.c(this.f6553d, w.c.c(this.f6552c, w.c.c(this.f6551b, Float.hashCode(this.f6550a) * 31, 31), 31), 31), this.f6554e, 31), this.f6555f, 31), this.f6556g, 31);
    }

    public final String toString() {
        String str = h0.U(this.f6550a) + ", " + h0.U(this.f6551b) + ", " + h0.U(this.f6552c) + ", " + h0.U(this.f6553d);
        long j9 = this.f6554e;
        long j10 = this.f6555f;
        boolean zU = a.a.u(j9, j10);
        long j11 = this.f6556g;
        long j12 = this.f6557h;
        if (!zU || !a.a.u(j10, j11) || !a.a.u(j11, j12)) {
            StringBuilder sbN = g4.c.n("RoundRect(rect=", str, ", topLeft=");
            sbN.append((Object) a.a.h0(j9));
            sbN.append(", topRight=");
            sbN.append((Object) a.a.h0(j10));
            sbN.append(", bottomRight=");
            sbN.append((Object) a.a.h0(j11));
            sbN.append(", bottomLeft=");
            sbN.append((Object) a.a.h0(j12));
            sbN.append(')');
            return sbN.toString();
        }
        int i10 = (int) (j9 >> 32);
        int i11 = (int) (j9 & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            StringBuilder sbN2 = g4.c.n("RoundRect(rect=", str, ", radius=");
            sbN2.append(h0.U(Float.intBitsToFloat(i10)));
            sbN2.append(')');
            return sbN2.toString();
        }
        StringBuilder sbN3 = g4.c.n("RoundRect(rect=", str, ", x=");
        sbN3.append(h0.U(Float.intBitsToFloat(i10)));
        sbN3.append(", y=");
        sbN3.append(h0.U(Float.intBitsToFloat(i11)));
        sbN3.append(')');
        return sbN3.toString();
    }
}
