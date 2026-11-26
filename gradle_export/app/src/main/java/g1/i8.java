package g1;

public final class i8 implements c4.b0 {
    public final int A;

    public i8(int i10) {
        this.A = i10;
    }

    @Override
    public final long f(y3.k kVar, long j9, y3.m mVar, long j10) {
        int i10 = (int) (j10 >> 32);
        int iD = ((kVar.d() - i10) / 2) + kVar.f16592a;
        if (iD < 0) {
            iD = kVar.f16592a;
        } else if (iD + i10 > ((int) (j9 >> 32))) {
            iD = kVar.f16594c - i10;
        }
        int i11 = kVar.f16593b - ((int) (j10 & 4294967295L));
        int i12 = this.A;
        int i13 = i11 - i12;
        if (i13 < 0) {
            i13 = kVar.f16595d + i12;
        }
        return (((long) iD) << 32) | (((long) i13) & 4294967295L);
    }
}
