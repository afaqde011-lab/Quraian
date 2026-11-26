package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

public final class e1 extends g1 {

    public final int f603b;

    public e1(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f603b = i10;
    }

    @Override
    public final boolean c(Object obj, long j9) {
        switch (this.f603b) {
            case 0:
                return h1.f619g ? h1.b(obj, j9) : h1.c(obj, j9);
            default:
                return h1.f619g ? h1.b(obj, j9) : h1.c(obj, j9);
        }
    }

    @Override
    public final double d(Object obj, long j9) {
        switch (this.f603b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(g(obj, j9));
    }

    @Override
    public final float e(Object obj, long j9) {
        switch (this.f603b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(f(obj, j9));
    }

    @Override
    public final void j(Object obj, long j9, boolean z10) {
        switch (this.f603b) {
            case 0:
                if (!h1.f619g) {
                    h1.l(obj, j9, z10 ? (byte) 1 : (byte) 0);
                } else {
                    h1.k(obj, j9, z10 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!h1.f619g) {
                    h1.l(obj, j9, z10 ? (byte) 1 : (byte) 0);
                } else {
                    h1.k(obj, j9, z10 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override
    public final void k(Object obj, long j9, byte b7) {
        switch (this.f603b) {
            case 0:
                if (!h1.f619g) {
                    h1.l(obj, j9, b7);
                } else {
                    h1.k(obj, j9, b7);
                }
                break;
            default:
                if (!h1.f619g) {
                    h1.l(obj, j9, b7);
                } else {
                    h1.k(obj, j9, b7);
                }
                break;
        }
    }

    @Override
    public final void l(Object obj, long j9, double d3) {
        switch (this.f603b) {
            case 0:
                o(obj, j9, Double.doubleToLongBits(d3));
                break;
            default:
                o(obj, j9, Double.doubleToLongBits(d3));
                break;
        }
    }

    @Override
    public final void m(Object obj, long j9, float f3) {
        switch (this.f603b) {
            case 0:
                n(obj, j9, Float.floatToIntBits(f3));
                break;
            default:
                n(obj, j9, Float.floatToIntBits(f3));
                break;
        }
    }

    @Override
    public final boolean r() {
        switch (this.f603b) {
        }
        return false;
    }
}
