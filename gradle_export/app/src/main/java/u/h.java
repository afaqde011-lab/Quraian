package u;

public abstract class h {

    public static final float[] f14854a;

    static {
        long[] jArr = q0.f14885a;
        int iD = q0.d(0);
        int iMax = iD > 0 ? Math.max(7, q0.c(iD)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            h00.n.B0(jArr, -9187201950435737472L);
        }
        int i10 = iMax >> 3;
        long j9 = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j9)) | j9;
        float[] fArr = new float[iMax];
        f14854a = new float[0];
    }
}
