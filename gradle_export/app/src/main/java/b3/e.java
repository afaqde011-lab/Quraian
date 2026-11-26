package b3;

public final class e extends kotlin.jvm.internal.n implements u00.k {
    public static final e B;
    public static final e C;
    public static final e D;
    public static final e E;
    public static final e F;
    public static final e G;
    public static final e H;
    public static final e I;
    public static final e J;
    public static final e K;
    public static final e L;
    public static final e M;
    public final int A;

    static {
        int i10 = 1;
        B = new e(i10, 0);
        C = new e(i10, 1);
        D = new e(i10, 2);
        E = new e(i10, 3);
        F = new e(i10, 4);
        G = new e(i10, 5);
        H = new e(i10, 6);
        I = new e(i10, 7);
        J = new e(i10, 8);
        K = new e(i10, 9);
        L = new e(i10, 10);
        M = new e(i10, 11);
    }

    public e(int i10, int i11) {
        super(i10);
        this.A = i11;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                i iVar = (i) obj;
                l0 l0Var = iVar instanceof l0 ? (l0) iVar : null;
                if (l0Var != null && l0Var.f2070r0) {
                    y2.a.c("Apply is called on deactivated node " + iVar);
                }
                return g00.b0.a;
            case 1:
                d2 d2Var = (d2) obj;
                if (d2Var.u()) {
                    u0 u0Var = d2Var.B;
                    if (!u0Var.K) {
                        u00.k kVarE = d2Var.A.e();
                        u.i0 i0Var = u0Var.N;
                        if (kVarE != null) {
                            u0Var.E0(d2Var, 9223372034707292159L, 0L);
                            u0Var.G = kVarE;
                        } else if (i0Var != null) {
                            Object[] objArr = i0Var.f14858c;
                            long[] jArr = i0Var.f14856a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i10 = 0;
                                while (true) {
                                    long j9 = jArr[i10];
                                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((255 & j9) < 128) {
                                                u0Var.l1((u.j0) objArr[(i10 << 3) + i12]);
                                            }
                                            j9 >>= 8;
                                        }
                                        if (i11 == 8) {
                                            if (i10 != length) {
                                                i10++;
                                            }
                                        }
                                    } else if (i10 != length) {
                                        i10++;
                                    }
                                }
                            }
                            i0Var.a();
                        }
                    }
                }
                return g00.b0.a;
            case 2:
                z1 z1Var = ((p1) obj).f2107n0;
                if (z1Var != null) {
                    z1Var.invalidate();
                }
                return g00.b0.a;
            case 3:
                p1 p1Var = (p1) obj;
                l0 l0Var2 = p1Var.O;
                try {
                    if (p1Var.u()) {
                        p1Var.Z1(true);
                        break;
                    }
                    return g00.b0.a;
                } catch (Throwable th2) {
                    l0Var2.a0(th2);
                    throw null;
                }
            case 4:
                w1 w1Var = (w1) obj;
                if (w1Var.u()) {
                    w1Var.A.J0();
                }
                return g00.b0.a;
            case 5:
                l0 l0Var3 = (l0) obj;
                if (l0Var3.J()) {
                    l0Var3.W(false);
                }
                return g00.b0.a;
            case 6:
                l0 l0Var4 = (l0) obj;
                if (l0Var4.J()) {
                    l0Var4.W(false);
                }
                return g00.b0.a;
            case 7:
                l0 l0Var5 = (l0) obj;
                if (l0Var5.J()) {
                    l0Var5.U(false);
                }
                return g00.b0.a;
            case 8:
                l0 l0Var6 = (l0) obj;
                if (l0Var6.J()) {
                    l0Var6.U(false);
                }
                return g00.b0.a;
            case 9:
                l0 l0Var7 = (l0) obj;
                if (l0Var7.J()) {
                    l0.V(l0Var7, false, 7);
                }
                return g00.b0.a;
            case 10:
                l0 l0Var8 = (l0) obj;
                if (l0Var8.J()) {
                    l0.X(l0Var8, false, 7);
                }
                return g00.b0.a;
            default:
                l0 l0Var9 = (l0) obj;
                if (l0Var9.J()) {
                    l0Var9.H();
                }
                return g00.b0.a;
        }
    }
}
