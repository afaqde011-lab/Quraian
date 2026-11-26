package p40;

public final class s {
    public static final long[] e = new long[0];
    public final n40.e a;
    public final av.b b;
    public long c;
    public final long[] d;

    public s(n40.e descriptor, av.b bVar) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        this.a = descriptor;
        this.b = bVar;
        int iE = descriptor.e();
        if (iE <= 64) {
            this.c = iE != 64 ? (-1) << iE : 0L;
            this.d = e;
            return;
        }
        this.c = 0L;
        int i = (iE - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iE & 63) != 0) {
            jArr[i - 1] = (-1) << iE;
        }
        this.d = jArr;
    }
}
