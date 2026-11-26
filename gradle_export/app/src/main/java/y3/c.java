package y3;

public interface c {
    default float A0(float f3) {
        return c() * f3;
    }

    default float H(long j9) {
        if (!p.a(o.b(j9), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        float[] fArr = z3.b.f17169a;
        if (t0() < 1.03f) {
            return t0() * o.c(j9);
        }
        z3.a aVarA = z3.b.a(t0());
        if (aVarA != null) {
            return aVarA.b(o.c(j9));
        }
        return t0() * o.c(j9);
    }

    default int R0(float f3) {
        float fA0 = A0(f3);
        if (Float.isInfinite(fA0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fA0);
    }

    default long b0(float f3) {
        return r(k0(f3));
    }

    default long b1(long j9) {
        if (j9 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fA0 = A0(h.b(j9));
        float fA1 = A0(h.a(j9));
        return (((long) Float.floatToRawIntBits(fA0)) << 32) | (((long) Float.floatToRawIntBits(fA1)) & 4294967295L);
    }

    float c();

    default float f1(long j9) {
        if (!p.a(o.b(j9), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        return A0(H(j9));
    }

    default float h0(int i10) {
        return i10 / c();
    }

    default float k0(float f3) {
        return f3 / c();
    }

    default long r(float f3) {
        float[] fArr = z3.b.f17169a;
        if (t0() < 1.03f) {
            return kh.o.F(f3 / t0(), 4294967296L);
        }
        z3.a aVarA = z3.b.a(t0());
        return kh.o.F(aVarA != null ? aVarA.a(f3) : f3 / t0(), 4294967296L);
    }

    default long t(long j9) {
        if (j9 != 9205357640488583168L) {
            return f50.c.b(k0(Float.intBitsToFloat((int) (j9 >> 32))), k0(Float.intBitsToFloat((int) (j9 & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    float t0();
}
