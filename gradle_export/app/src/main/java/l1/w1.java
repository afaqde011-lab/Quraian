package l1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class w1 extends m00.i implements u00.o {
    public List A;
    public List B;
    public List C;
    public u.j0 D;
    public u.j0 E;
    public u.j0 F;
    public Set G;
    public u.j0 H;
    public int I;
    public q0 J;
    public final x1 K;

    public w1(x1 x1Var, k00.c cVar) {
        super(3, cVar);
        this.K = x1Var;
    }

    public static final void i(x1 x1Var, List list, List list2, List list3, u.j0 j0Var, u.j0 j0Var2, u.j0 j0Var3, u.j0 j0Var4) {
        char c10;
        long j9;
        long j10;
        synchronized (x1Var.f9952d) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    p pVar = (p) list3.get(i10);
                    pVar.d();
                    x1Var.P(pVar);
                }
                list3.clear();
                Object[] objArr = j0Var.f14865b;
                long[] jArr = j0Var.f14864a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    j9 = 255;
                    while (true) {
                        long j11 = jArr[i11];
                        c10 = 7;
                        j10 = -9187201950435737472L;
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i11 != length) {
                                break;
                                break;
                            }
                            i11++;
                        } else {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((j11 & 255) < 128) {
                                    p pVar2 = (p) objArr[(i11 << 3) + i13];
                                    pVar2.d();
                                    x1Var.P(pVar2);
                                }
                                j11 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            } else if (i11 != length) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                } else {
                    c10 = 7;
                    j9 = 255;
                    j10 = -9187201950435737472L;
                }
                j0Var.b();
                Object[] objArr2 = j0Var2.f14865b;
                long[] jArr2 = j0Var2.f14864a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j12 = jArr2[i14];
                        if ((((~j12) << c10) & j12 & j10) == j10) {
                            if (i14 != length2) {
                                break;
                                break;
                            }
                            i14++;
                        } else {
                            int i15 = 8 - ((~(i14 - length2)) >>> 31);
                            for (int i16 = 0; i16 < i15; i16++) {
                                if ((j12 & j9) < 128) {
                                    ((p) objArr2[(i14 << 3) + i16]).j();
                                }
                                j12 >>= 8;
                            }
                            if (i15 != 8) {
                                break;
                            } else if (i14 != length2) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                    }
                }
                j0Var2.b();
                j0Var3.b();
                Object[] objArr3 = j0Var4.f14865b;
                long[] jArr3 = j0Var4.f14864a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j13 = jArr3[i17];
                        if ((((~j13) << c10) & j13 & j10) == j10) {
                            if (i17 != length3) {
                                break;
                                break;
                            }
                            i17++;
                        } else {
                            int i18 = 8 - ((~(i17 - length3)) >>> 31);
                            for (int i19 = 0; i19 < i18; i19++) {
                                if ((j13 & j9) < 128) {
                                    p pVar3 = (p) objArr3[(i17 << 3) + i19];
                                    pVar3.d();
                                    x1Var.P(pVar3);
                                }
                                j13 >>= 8;
                            }
                            if (i18 != 8) {
                                break;
                            } else if (i17 != length3) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                    }
                }
                j0Var4.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void j(List list, x1 x1Var) {
        list.clear();
        synchronized (x1Var.f9952d) {
            try {
                ArrayList arrayList = x1Var.l;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.add((t0) arrayList.get(i10));
                }
                x1Var.l.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w1 w1Var = new w1(this.K, (k00.c) obj3);
        w1Var.J = (q0) obj2;
        return w1Var.invokeSuspend(g00.b0.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        throw new UnsupportedOperationException("Method not decompiled: l1.w1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
