package z2;

public final class q1 extends kotlin.jvm.internal.n implements u00.a {
    public final int A;
    public final Object B;

    public q1(Object obj, int i10) {
        super(0);
        this.A = i10;
        this.B = obj;
    }

    public final Object invoke() {
        l1.p pVar;
        switch (this.A) {
            case 0:
                q0 q0VarA = ((v1) this.B).a();
                b3.l0 l0Var = q0VarA.A;
                if (q0VarA.N != ((m1.e) ((m1.b) l0Var.p()).B).C) {
                    u.i0 i0Var = q0VarA.F;
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
                                        ((j0) objArr[(i10 << 3) + i12]).f17121d = true;
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
                    if (l0Var.I != null) {
                        if (!l0Var.f2060h0.f2113e) {
                            b3.l0.V(l0Var, false, 7);
                        }
                    } else if (!l0Var.r()) {
                        b3.l0.X(l0Var, false, 7);
                    }
                }
                break;
            default:
                j0 j0Var = (j0) this.B;
                if (!((Boolean) j0Var.f17124g.getValue()).booleanValue() && (pVar = j0Var.f17120c) != null) {
                    pVar.o();
                }
                break;
        }
        return g00.b0.a;
    }
}
