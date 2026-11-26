package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;

public final class j1 extends l1 {

    public final int f4273b;

    public j1(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f4273b = i10;
    }

    @Override
    public final boolean c(Object obj, long j9) {
        switch (this.f4273b) {
            case 0:
                if (m1.f4301g) {
                    if (m1.h(obj, j9) == 0) {
                        return false;
                    }
                } else if (m1.i(obj, j9) == 0) {
                    return false;
                }
                return true;
            default:
                if (m1.f4301g) {
                    if (m1.h(obj, j9) == 0) {
                        return false;
                    }
                } else if (m1.i(obj, j9) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final byte d(Object obj, long j9) {
        switch (this.f4273b) {
            case 0:
                return m1.f4301g ? m1.h(obj, j9) : m1.i(obj, j9);
            default:
                return m1.f4301g ? m1.h(obj, j9) : m1.i(obj, j9);
        }
    }

    @Override
    public final double e(Object obj, long j9) {
        switch (this.f4273b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(h(obj, j9));
    }

    @Override
    public final float f(Object obj, long j9) {
        switch (this.f4273b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(g(obj, j9));
    }

    @Override
    public final void k(Object obj, long j9, boolean z10) {
        switch (this.f4273b) {
            case 0:
                if (!m1.f4301g) {
                    m1.m(obj, j9, z10 ? (byte) 1 : (byte) 0);
                } else {
                    m1.l(obj, j9, z10 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!m1.f4301g) {
                    m1.m(obj, j9, z10 ? (byte) 1 : (byte) 0);
                } else {
                    m1.l(obj, j9, z10 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override
    public final void l(Object obj, long j9, byte b7) {
        switch (this.f4273b) {
            case 0:
                if (!m1.f4301g) {
                    m1.m(obj, j9, b7);
                } else {
                    m1.l(obj, j9, b7);
                }
                break;
            default:
                if (!m1.f4301g) {
                    m1.m(obj, j9, b7);
                } else {
                    m1.l(obj, j9, b7);
                }
                break;
        }
    }

    @Override
    public final void m(Object obj, long j9, double d3) {
        switch (this.f4273b) {
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
        switch (this.f4273b) {
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
        switch (this.f4273b) {
        }
        return false;
    }
}
