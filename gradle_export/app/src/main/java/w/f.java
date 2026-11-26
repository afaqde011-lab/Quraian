package w;

public final class f extends kotlin.jvm.internal.n implements u00.k {
    public static final f B;
    public static final f C;
    public static final f D;
    public static final f E;
    public static final f F;
    public static final f G;
    public static final f H;
    public static final f I;
    public static final f J;
    public static final f K;
    public static final f L;
    public static final f M;
    public static final f N;
    public static final f O;
    public static final f P;
    public static final f Q;
    public final int A;

    static {
        int i10 = 1;
        B = new f(i10, 0);
        C = new f(i10, 1);
        D = new f(i10, 2);
        E = new f(i10, 3);
        F = new f(i10, 4);
        G = new f(i10, 5);
        H = new f(i10, 6);
        I = new f(i10, 7);
        J = new f(i10, 8);
        K = new f(i10, 9);
        L = new f(i10, 10);
        M = new f(i10, 11);
        N = new f(i10, 12);
        O = new f(i10, 13);
        P = new f(i10, 14);
        Q = new f(i10, 15);
    }

    public f(int i10, int i11) {
        super(i10);
        this.A = i11;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                return m.d(s0.c(x.c.w(220, 90, null, 4), 2).a(s0.e(x.c.w(220, 90, null, 4), 0.92f, 4)), s0.d(x.c.w(90, 0, null, 6), 2));
            case 1:
                return obj;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 4:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 5:
                long jA = i2.t.a(((i2.t) obj).f7169a, j2.d.f7884x);
                return new x.n(i2.t.d(jA), i2.t.h(jA), i2.t.g(jA), i2.t.e(jA));
            case 6:
                return obj;
            case 7:
                long j9 = ((i2.w0) obj).f7177a;
                return new x.l(i2.w0.b(j9), i2.w0.c(j9));
            case 8:
                x.l lVar = (x.l) obj;
                return new i2.w0(i2.b0.h(lVar.f16309a, lVar.f16310b));
            case 9:
                return x.c.v(0.0f, 0.0f, null, 7);
            case 10:
                ((Number) obj).intValue();
                return 0;
            case 11:
                long j10 = ((y3.l) obj).f16596a;
                long j11 = 0;
                return new y3.l((j11 & 4294967295L) | (j11 << 32));
            case 12:
                ((Number) obj).intValue();
                return 0;
            case 13:
                long j12 = ((y3.l) obj).f16596a;
                long j13 = 0;
                return new y3.l((j13 & 4294967295L) | (j13 << 32));
            case 14:
                return s0.f15808c;
            case 15:
                return Boolean.valueOf(((l0) obj) == l0.B);
            case 16:
                return new y3.l((((long) ((int) (((y3.l) obj).f16596a >> 32))) << 32) | (((long) 0) & 4294967295L));
            default:
                return new y3.l((((long) ((int) (((y3.l) obj).f16596a >> 32))) << 32) | (((long) 0) & 4294967295L));
        }
    }
}
