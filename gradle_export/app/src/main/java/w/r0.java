package w;

public final class r0 extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final u00.k B;

    public r0(int i10, u00.k kVar) {
        super(1);
        this.A = i10;
        this.B = kVar;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                long j9 = ((y3.l) obj).f16596a;
                return new y3.l((((long) ((Number) this.B.invoke(Integer.valueOf((int) (j9 >> 32)))).intValue()) << 32) | (((long) ((int) (j9 & 4294967295L))) & 4294967295L));
            case 1:
                long j10 = ((y3.l) obj).f16596a;
                return new y3.l((((long) ((Number) this.B.invoke(Integer.valueOf((int) (j10 >> 32)))).intValue()) << 32) | (((long) ((int) (j10 & 4294967295L))) & 4294967295L));
            case 2:
                return new y3.j((((long) ((Number) this.B.invoke(Integer.valueOf((int) (((y3.l) obj).f16596a >> 32)))).intValue()) << 32) | (((long) 0) & 4294967295L));
            case 3:
                return new y3.j((((long) ((Number) this.B.invoke(Integer.valueOf((int) (((y3.l) obj).f16596a & 4294967295L)))).intValue()) & 4294967295L) | (((long) 0) << 32));
            case 4:
                return new y3.j((((long) ((Number) this.B.invoke(Integer.valueOf((int) (((y3.l) obj).f16596a >> 32)))).intValue()) << 32) | (((long) 0) & 4294967295L));
            default:
                return new y3.j((((long) ((Number) this.B.invoke(Integer.valueOf((int) (((y3.l) obj).f16596a & 4294967295L)))).intValue()) & 4294967295L) | (((long) 0) << 32));
        }
    }
}
