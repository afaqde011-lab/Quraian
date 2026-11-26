package m2;

import b3.o0;
import i2.d;
import i2.m;
import kh.n;
import w.c;
import y3.j;
import y3.l;

public final class a extends b {
    public final d E;
    public final long F;
    public int G = 1;
    public final long H;
    public float I;
    public m J;

    public a(d dVar, long j9) {
        int i10;
        int i11;
        this.E = dVar;
        this.F = j9;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i10 = (int) (j9 >> 32)) < 0 || (i11 = (int) (4294967295L & j9)) < 0 || i10 > dVar.f7117a.getWidth() || i11 > dVar.f7117a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.H = j9;
        this.I = 1.0f;
    }

    @Override
    public final void a(float f3) {
        this.I = f3;
    }

    @Override
    public final void e(m mVar) {
        this.J = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m.a(this.E, aVar.E) && j.b(0L, 0L) && l.b(this.F, aVar.F) && this.G == aVar.G;
    }

    @Override
    public final long h() {
        return n.m0(this.H);
    }

    public final int hashCode() {
        return Integer.hashCode(this.G) + c.f(c.f(this.E.hashCode() * 31, 0L, 31), this.F, 31);
    }

    @Override
    public final void i(o0 o0Var) {
        k2.b bVar = o0Var.A;
        k2.d.y(o0Var, this.E, this.F, (((long) Math.round(Float.intBitsToFloat((int) (bVar.b() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (bVar.b() & 4294967295L)))) & 4294967295L), this.I, this.J, this.G, 328);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BitmapPainter(image=");
        sb2.append(this.E);
        sb2.append(", srcOffset=");
        sb2.append((Object) j.e(0L));
        sb2.append(", srcSize=");
        sb2.append((Object) l.c(this.F));
        sb2.append(", filterQuality=");
        int i10 = this.G;
        if (i10 == 0) {
            str = "None";
        } else if (i10 == 1) {
            str = "Low";
        } else if (i10 == 2) {
            str = "Medium";
        } else {
            str = i10 == 3 ? "High" : "Unknown";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
