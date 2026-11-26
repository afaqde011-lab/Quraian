package z2;

public final class d1 implements x1, p {
    public static final d1 B = new d1(0);
    public final int A;

    public d1(int i10) {
        this.A = i10;
    }

    @Override
    public long a(long j9, long j10) {
        switch (this.A) {
            case 1:
                float fMax = Math.max(Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)) / Float.intBitsToFloat((int) (j9 & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i10 = p1.f17155a;
                return jFloatToRawIntBits;
            case 2:
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (j9 >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) / Float.intBitsToFloat((int) (j9 & 4294967295L));
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                int i11 = p1.f17155a;
                return jFloatToRawIntBits2;
            case 3:
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (j9 >> 32));
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
                int i12 = p1.f17155a;
                return jFloatToRawIntBits3;
            case 4:
                float fD = d0.d(j9, j10);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L);
                int i13 = p1.f17155a;
                return jFloatToRawIntBits4;
            default:
                if (Float.intBitsToFloat((int) (j9 >> 32)) <= Float.intBitsToFloat((int) (j10 >> 32)) && Float.intBitsToFloat((int) (j9 & 4294967295L)) <= Float.intBitsToFloat((int) (j10 & 4294967295L))) {
                    long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i14 = p1.f17155a;
                    return jFloatToRawIntBits5;
                }
                float fD2 = d0.d(j9, j10);
                long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(fD2)) << 32) | (((long) Float.floatToRawIntBits(fD2)) & 4294967295L);
                int i15 = p1.f17155a;
                return jFloatToRawIntBits6;
        }
    }

    @Override
    public boolean e(Object obj, Object obj2) {
        return false;
    }

    @Override
    public void g(u.u0 u0Var) {
        u0Var.clear();
    }

    public String toString() {
        switch (this.A) {
            case 6:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
