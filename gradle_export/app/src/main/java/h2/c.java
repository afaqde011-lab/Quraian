package h2;

import a10.h0;

public final class c {

    public static final c f6545e = new c(0.0f, 0.0f, 0.0f, 0.0f);

    public final float f6546a;

    public final float f6547b;

    public final float f6548c;

    public final float f6549d;

    public c(float f3, float f10, float f11, float f12) {
        this.f6546a = f3;
        this.f6547b = f10;
        this.f6548c = f11;
        this.f6549d = f12;
    }

    public final boolean a(long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        return (fIntBitsToFloat >= this.f6546a) & (fIntBitsToFloat < this.f6548c) & (fIntBitsToFloat2 >= this.f6547b) & (fIntBitsToFloat2 < this.f6549d);
    }

    public final long b() {
        float f3 = this.f6548c;
        float f10 = this.f6546a;
        return (((long) Float.floatToRawIntBits(((f3 - f10) / 2.0f) + f10)) << 32) | (((long) Float.floatToRawIntBits(this.f6549d)) & 4294967295L);
    }

    public final long c() {
        float f3 = this.f6548c;
        float f10 = this.f6546a;
        float f11 = ((f3 - f10) / 2.0f) + f10;
        float f12 = this.f6549d;
        float f13 = this.f6547b;
        return (((long) Float.floatToRawIntBits(((f12 - f13) / 2.0f) + f13)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }

    public final long d() {
        float f3 = this.f6548c - this.f6546a;
        return (((long) Float.floatToRawIntBits(this.f6549d - this.f6547b)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long e() {
        return (((long) Float.floatToRawIntBits(this.f6546a)) << 32) | (((long) Float.floatToRawIntBits(this.f6547b)) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f6546a, cVar.f6546a) == 0 && Float.compare(this.f6547b, cVar.f6547b) == 0 && Float.compare(this.f6548c, cVar.f6548c) == 0 && Float.compare(this.f6549d, cVar.f6549d) == 0;
    }

    public final c f(c cVar) {
        return new c(Math.max(this.f6546a, cVar.f6546a), Math.max(this.f6547b, cVar.f6547b), Math.min(this.f6548c, cVar.f6548c), Math.min(this.f6549d, cVar.f6549d));
    }

    public final boolean g() {
        return (this.f6546a >= this.f6548c) | (this.f6547b >= this.f6549d);
    }

    public final boolean h(c cVar) {
        return (this.f6546a < cVar.f6548c) & (cVar.f6546a < this.f6548c) & (this.f6547b < cVar.f6549d) & (cVar.f6547b < this.f6549d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f6549d) + w.c.c(this.f6548c, w.c.c(this.f6547b, Float.hashCode(this.f6546a) * 31, 31), 31);
    }

    public final c i(float f3, float f10) {
        return new c(this.f6546a + f3, this.f6547b + f10, this.f6548c + f3, this.f6549d + f10);
    }

    public final c j(long j9) {
        int i10 = (int) (j9 >> 32);
        int i11 = (int) (j9 & 4294967295L);
        return new c(Float.intBitsToFloat(i10) + this.f6546a, Float.intBitsToFloat(i11) + this.f6547b, Float.intBitsToFloat(i10) + this.f6548c, Float.intBitsToFloat(i11) + this.f6549d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + h0.U(this.f6546a) + ", " + h0.U(this.f6547b) + ", " + h0.U(this.f6548c) + ", " + h0.U(this.f6549d) + ')';
    }
}
