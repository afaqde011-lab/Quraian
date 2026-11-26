package androidx.glance.appwidget.protobuf;

import sun.misc.Unsafe;

public final class f1 extends h1 {

    public final int f888b;

    public f1(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f888b = i10;
    }

    @Override
    public final boolean c(Object obj, long j9) {
        switch (this.f888b) {
            case 0:
                if (i1.f898g) {
                    if (i1.h(obj, j9) == 0) {
                        return false;
                    }
                } else if (i1.i(obj, j9) == 0) {
                    return false;
                }
                return true;
            default:
                if (i1.f898g) {
                    if (i1.h(obj, j9) == 0) {
                        return false;
                    }
                } else if (i1.i(obj, j9) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final byte d(Object obj, long j9) {
        switch (this.f888b) {
            case 0:
                return i1.f898g ? i1.h(obj, j9) : i1.i(obj, j9);
            default:
                return i1.f898g ? i1.h(obj, j9) : i1.i(obj, j9);
        }
    }

    @Override
    public final double e(Object obj, long j9) {
        switch (this.f888b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(h(obj, j9));
    }

    @Override
    public final float f(Object obj, long j9) {
        switch (this.f888b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(g(obj, j9));
    }

    @Override
    public final void k(Object obj, long j9, boolean z10) {
        switch (this.f888b) {
            case 0:
                if (!i1.f898g) {
                    i1.m(obj, j9, z10 ? (byte) 1 : (byte) 0);
                } else {
                    i1.l(obj, j9, z10 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!i1.f898g) {
                    i1.m(obj, j9, z10 ? (byte) 1 : (byte) 0);
                } else {
                    i1.l(obj, j9, z10 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override
    public final void l(Object obj, long j9, byte b7) {
        switch (this.f888b) {
            case 0:
                if (!i1.f898g) {
                    i1.m(obj, j9, b7);
                } else {
                    i1.l(obj, j9, b7);
                }
                break;
            default:
                if (!i1.f898g) {
                    i1.m(obj, j9, b7);
                } else {
                    i1.l(obj, j9, b7);
                }
                break;
        }
    }

    @Override
    public final void m(Object obj, long j9, double d3) {
        switch (this.f888b) {
            case 0:
                p(obj, j9, Double.doubleToLongBits(d3));
                break;
            default:
                p(obj, j9, Double.doubleToLongBits(d3));
                break;
        }
    }

    @Override
    public final void n(Object obj, long j9, float f3) {
        switch (this.f888b) {
            case 0:
                o(obj, j9, Float.floatToIntBits(f3));
                break;
            default:
                o(obj, j9, Float.floatToIntBits(f3));
                break;
        }
    }

    @Override
    public final boolean s() {
        switch (this.f888b) {
        }
        return false;
    }
}
