package h2;

import a10.h0;

public final class a {

    public final int f6539a;

    public float f6540b;

    public float f6541c;

    public float f6542d;

    public float f6543e;

    public a() {
        this.f6539a = 0;
        this.f6540b = 0.0f;
        this.f6541c = 0.0f;
        this.f6542d = 0.0f;
        this.f6543e = 0.0f;
    }

    public a(float f3, float f10, float f11, float f12) {
        this.f6539a = 1;
        this.f6540b = f3;
        this.f6541c = f10;
        this.f6542d = f11;
        this.f6543e = f12;
    }

    public a(a aVar) {
        this.f6539a = 1;
        this.f6540b = aVar.f6540b;
        this.f6541c = aVar.f6541c;
        this.f6542d = aVar.f6542d;
        this.f6543e = aVar.f6543e;
    }

    public void a(float f3, float f10, float f11, float f12) {
        this.f6540b = Math.max(f3, this.f6540b);
        this.f6541c = Math.max(f10, this.f6541c);
        this.f6542d = Math.min(f11, this.f6542d);
        this.f6543e = Math.min(f12, this.f6543e);
    }

    public boolean b() {
        return (this.f6540b >= this.f6542d) | (this.f6541c >= this.f6543e);
    }

    public float c() {
        return this.f6540b + this.f6542d;
    }

    public float d() {
        return this.f6541c + this.f6543e;
    }

    public void e(long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        this.f6540b += fIntBitsToFloat;
        this.f6541c += fIntBitsToFloat2;
        this.f6542d += fIntBitsToFloat;
        this.f6543e += fIntBitsToFloat2;
    }

    public final String toString() {
        switch (this.f6539a) {
            case 0:
                return "MutableRect(" + h0.U(this.f6540b) + ", " + h0.U(this.f6541c) + ", " + h0.U(this.f6542d) + ", " + h0.U(this.f6543e) + ')';
            default:
                return "[" + this.f6540b + " " + this.f6541c + " " + this.f6542d + " " + this.f6543e + "]";
        }
    }
}
