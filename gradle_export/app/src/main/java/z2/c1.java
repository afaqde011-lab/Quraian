package z2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;

public final class c1 implements w0 {

    public final h0.j0 f17092a;

    public c1(h0.j0 j0Var) {
        this.f17092a = j0Var;
    }

    @Override
    public final int b(w wVar, List list, int i10) throws NoWhenBranchMatchedException {
        ArrayList arrayListK = b3.m.k(wVar);
        h0.j0 j0Var = this.f17092a;
        h0.h0 h0Var = j0Var.f6421f;
        List list2 = (List) h00.q.O0(1, arrayListK);
        v0 v0Var = list2 != null ? (v0) h00.q.N0(list2) : null;
        List list3 = (List) h00.q.O0(2, arrayListK);
        h0Var.a(v0Var, list3 != null ? (v0) h00.q.N0(list3) : null, y3.b.b(0, i10, 0, 0, 13));
        h00.x xVar = (List) h00.q.N0(arrayListK);
        if (xVar == null) {
            xVar = h00.x.A;
        }
        return h0.j0.b(xVar, i10, wVar.R0(j0Var.f6418c), wVar.R0(j0Var.f6420e), j0Var.f6421f);
    }

    @Override
    public final int d(w wVar, List list, int i10) throws NoWhenBranchMatchedException {
        int[] iArr;
        int i11;
        long jA;
        ArrayList arrayListK = b3.m.k(wVar);
        h0.j0 j0Var = this.f17092a;
        h0.h0 h0Var = j0Var.f6421f;
        int i12 = 1;
        List list2 = (List) h00.q.O0(1, arrayListK);
        v0 v0Var = list2 != null ? (v0) h00.q.N0(list2) : null;
        List list3 = (List) h00.q.O0(2, arrayListK);
        h0Var.a(v0Var, list3 != null ? (v0) h00.q.N0(list3) : null, y3.b.b(0, 0, 0, i10, 7));
        h00.x xVar = (List) h00.q.N0(arrayListK);
        if (xVar == null) {
            xVar = h00.x.A;
        }
        int iR0 = wVar.R0(j0Var.f6418c);
        int iR1 = wVar.R0(j0Var.f6420e);
        h0.h0 h0Var2 = j0Var.f6421f;
        long jA2 = u.j.a(0, 0);
        if (xVar.isEmpty()) {
            return 0;
        }
        int size = xVar.size();
        int[] iArr2 = new int[size];
        int size2 = xVar.size();
        int[] iArr3 = new int[size2];
        int size3 = xVar.size();
        for (int i13 = 0; i13 < size3; i13++) {
            v0 v0Var2 = (v0) xVar.get(i13);
            int iS = v0Var2.s(i10);
            iArr2[i13] = iS;
            iArr3[i13] = v0Var2.f0(iS);
        }
        int i14 = Integer.MAX_VALUE;
        if (Integer.MAX_VALUE < xVar.size()) {
            h0Var2.getClass();
            h0.f0 f0Var = h0.f0.A;
        }
        if (Integer.MAX_VALUE >= xVar.size()) {
            h0Var2.getClass();
            h0.f0 f0Var2 = h0.f0.A;
        }
        int iMin = Math.min(Integer.MAX_VALUE, xVar.size());
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            i15 += iArr2[i16];
        }
        int size4 = ((xVar.size() - 1) * iR0) + i15;
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int i17 = iArr3[0];
        int i18 = size2 - 1;
        int i19 = 0;
        if (1 <= i18) {
            int i20 = 1;
            while (true) {
                int i21 = iArr3[i20];
                if (i17 < i21) {
                    i17 = i21;
                }
                if (i20 == i18) {
                    break;
                }
                i20++;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i22 = iArr2[0];
        int i23 = size - 1;
        if (1 <= i23) {
            int i24 = 1;
            while (true) {
                int i25 = iArr2[i24];
                if (i22 < i25) {
                    i22 = i25;
                }
                if (i24 == i23) {
                    break;
                }
                i24++;
            }
        }
        int i26 = size4;
        while (i22 <= i26 && i17 != i10) {
            int i27 = (i22 + i26) / 2;
            if (xVar.isEmpty()) {
                iArr = iArr2;
            } else {
                int i28 = i19;
                androidx.glance.appwidget.protobuf.d dVar = new androidx.glance.appwidget.protobuf.d(h0Var2, y3.b.a(i28, i27, i28, i14), iR0, iR1);
                v0 v0Var3 = (v0) h00.q.O0(i28, xVar);
                int i29 = v0Var3 != null ? iArr3[i28] : i28;
                int i30 = v0Var3 != null ? iArr2[i28] : i28;
                iArr = iArr2;
                int i31 = 0;
                if (dVar.b(xVar.size() > i12 ? i12 : 0, 0, u.j.a(i27, Integer.MAX_VALUE), v0Var3 == null ? null : new u.j(u.j.a(i30, i29)), 0, 0, 0, false, false).f6397b) {
                    h0Var2.getClass();
                    h0.f0 f0Var3 = h0.f0.A;
                } else {
                    int size5 = xVar.size();
                    int i32 = i27;
                    int i33 = 0;
                    int i34 = 0;
                    int i35 = 0;
                    int i36 = 0;
                    int i37 = 0;
                    while (true) {
                        if (i35 >= size5) {
                            xVar = xVar;
                            jA2 = jA2;
                            i11 = i36;
                            break;
                        }
                        int i38 = i32 - i30;
                        i11 = i35 + 1;
                        int iMax = Math.max(i34, i29);
                        v0 v0Var4 = (v0) h00.q.O0(i11, xVar);
                        i29 = v0Var4 != null ? iArr3[i11] : 0;
                        int i39 = v0Var4 != null ? iArr[i11] + iR0 : 0;
                        jA2 = jA2;
                        int i40 = i11 - i37;
                        int i41 = i33;
                        h0.d0 d0VarB = dVar.b(i35 + 2 < xVar.size(), i40, u.j.a(i38, Integer.MAX_VALUE), v0Var4 == null ? null : new u.j(u.j.a(i39, i29)), i41, i31, iMax, false, false);
                        if (d0VarB.f6396a) {
                            int i42 = iMax + iR1 + i31;
                            dVar.a(d0VarB, v0Var4 != null, i41, i42, i38, i40);
                            i39 -= iR0;
                            i33 = i41 + 1;
                            if (d0VarB.f6397b) {
                                i31 = i42;
                                break;
                            }
                            i32 = i27;
                            i37 = i11;
                            i31 = i42;
                            i34 = 0;
                        } else {
                            i32 = i38;
                            i33 = i41;
                            i34 = iMax;
                        }
                        i30 = i39;
                        i35 = i11;
                        i36 = i35;
                        xVar = xVar;
                        jA2 = jA2;
                    }
                    jA = u.j.a(i31 - iR1, i11);
                }
                i17 = (int) (jA >> 32);
                int i43 = (int) (jA & 4294967295L);
                if (i17 <= i10 || i43 < iMin) {
                    i22 = i27 + 1;
                    if (i22 > i26) {
                        return i22;
                    }
                } else {
                    if (i17 >= i10) {
                        return i27;
                    }
                    i26 = i27 - 1;
                }
                size4 = i27;
                iArr2 = iArr;
                xVar = xVar;
                jA2 = jA2;
                i12 = 1;
                i14 = Integer.MAX_VALUE;
                i19 = 0;
            }
            jA = jA2;
            i17 = (int) (jA >> 32);
            int i44 = (int) (jA & 4294967295L);
            if (i17 <= i10) {
                i22 = i27 + 1;
                if (i22 > i26) {
                    return i22;
                }
            } else {
                i22 = i27 + 1;
                if (i22 > i26) {
                    return i22;
                }
            }
            size4 = i27;
            iArr2 = iArr;
            xVar = xVar;
            jA2 = jA2;
            i12 = 1;
            i14 = Integer.MAX_VALUE;
            i19 = 0;
        }
        return size4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && kotlin.jvm.internal.m.a(this.f17092a, ((c1) obj).f17092a);
    }

    @Override
    public final int g(w wVar, List list, int i10) throws NoWhenBranchMatchedException {
        ArrayList arrayListK = b3.m.k(wVar);
        h0.j0 j0Var = this.f17092a;
        h0.h0 h0Var = j0Var.f6421f;
        List list2 = (List) h00.q.O0(1, arrayListK);
        v0 v0Var = list2 != null ? (v0) h00.q.N0(list2) : null;
        List list3 = (List) h00.q.O0(2, arrayListK);
        h0Var.a(v0Var, list3 != null ? (v0) h00.q.N0(list3) : null, y3.b.b(0, i10, 0, 0, 13));
        h00.x xVar = (List) h00.q.N0(arrayListK);
        if (xVar == null) {
            xVar = h00.x.A;
        }
        return h0.j0.b(xVar, i10, wVar.R0(j0Var.f6418c), wVar.R0(j0Var.f6420e), j0Var.f6421f);
    }

    public final int hashCode() {
        return this.f17092a.hashCode();
    }

    @Override
    public final int i(w wVar, List list, int i10) throws NoWhenBranchMatchedException {
        ArrayList arrayListK = b3.m.k(wVar);
        h0.j0 j0Var = this.f17092a;
        h0.h0 h0Var = j0Var.f6421f;
        List list2 = (List) h00.q.O0(1, arrayListK);
        v0 v0Var = list2 != null ? (v0) h00.q.N0(list2) : null;
        List list3 = (List) h00.q.O0(2, arrayListK);
        h0Var.a(v0Var, list3 != null ? (v0) h00.q.N0(list3) : null, y3.b.b(0, 0, 0, i10, 7));
        h00.x xVar = (List) h00.q.N0(arrayListK);
        if (xVar == null) {
            xVar = h00.x.A;
        }
        int iR0 = wVar.R0(j0Var.f6418c);
        int size = xVar.size();
        int i11 = 0;
        int iMax = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            int iD = ((v0) xVar.get(i11)).D(i10) + iR0;
            int i14 = i11 + 1;
            if (i14 - i12 == Integer.MAX_VALUE || i14 == xVar.size()) {
                iMax = Math.max(iMax, (i13 + iD) - iR0);
                i12 = i11;
                i13 = 0;
            } else {
                i13 += iD;
            }
            i11 = i14;
        }
        return iMax;
    }

    @Override
    public final x0 j(y0 y0Var, List list, long j9) throws NoWhenBranchMatchedException {
        v0 v0Var;
        v0 v0Var2;
        l1 l1Var;
        u.j jVar;
        h0.d0 d0Var;
        int i10;
        char c10;
        v0 v0Var3;
        u.j jVar2;
        l1 l1Var2;
        u.j jVar3;
        h0.d0 d0Var2;
        Integer numValueOf;
        long jA;
        long jA2;
        l1 l1VarO;
        ArrayList arrayListK = b3.m.k(y0Var);
        final h0.j0 j0Var = this.f17092a;
        final h0.h0 h0Var = j0Var.f6421f;
        boolean zIsEmpty = arrayListK.isEmpty();
        h00.y yVar = h00.y.A;
        final int i11 = 0;
        if (!zIsEmpty) {
            if (y3.a.g(j9) != 0) {
                List list2 = (List) h00.q.L0(arrayListK);
                if (list2.isEmpty()) {
                    return y0Var.o0(0, 0, yVar, new xn.a(29));
                }
                final int i12 = 1;
                List list3 = (List) h00.q.O0(1, arrayListK);
                v0 v0Var4 = list3 != null ? (v0) h00.q.N0(list3) : null;
                List list4 = (List) h00.q.O0(2, arrayListK);
                v0 v0Var5 = list4 != null ? (v0) h00.q.N0(list4) : null;
                list2.size();
                h0Var.getClass();
                h0.b1 b1Var = h0.b1.A;
                long jH = h0.c.H(h0.c.r(10, h0.c.p(j9, b1Var)));
                if (v0Var4 != null) {
                    h0.c.x(v0Var4, j0Var, jH, new u00.k() {
                        public final Object invoke(Object obj) {
                            int iJ0;
                            int iI0;
                            int iJ1;
                            int iI1;
                            z2.l1 l1Var3 = (z2.l1) obj;
                            switch (i11) {
                                case 0:
                                    if (l1Var3 != null) {
                                        j0Var.getClass();
                                        iJ0 = l1Var3.j0();
                                        iI0 = l1Var3.i0();
                                    } else {
                                        iJ0 = 0;
                                        iI0 = 0;
                                    }
                                    new u.j(u.j.a(iJ0, iI0));
                                    h0Var.getClass();
                                    break;
                                default:
                                    if (l1Var3 != null) {
                                        j0Var.getClass();
                                        iJ1 = l1Var3.j0();
                                        iI1 = l1Var3.i0();
                                    } else {
                                        iJ1 = 0;
                                        iI1 = 0;
                                    }
                                    new u.j(u.j.a(iJ1, iI1));
                                    h0Var.getClass();
                                    break;
                            }
                            return g00.b0.a;
                        }
                    });
                }
                if (v0Var5 != null) {
                    h0.c.x(v0Var5, j0Var, jH, new u00.k() {
                        public final Object invoke(Object obj) {
                            int iJ0;
                            int iI0;
                            int iJ1;
                            int iI1;
                            z2.l1 l1Var3 = (z2.l1) obj;
                            switch (i12) {
                                case 0:
                                    if (l1Var3 != null) {
                                        j0Var.getClass();
                                        iJ0 = l1Var3.j0();
                                        iI0 = l1Var3.i0();
                                    } else {
                                        iJ0 = 0;
                                        iI0 = 0;
                                    }
                                    new u.j(u.j.a(iJ0, iI0));
                                    h0Var.getClass();
                                    break;
                                default:
                                    if (l1Var3 != null) {
                                        j0Var.getClass();
                                        iJ1 = l1Var3.j0();
                                        iI1 = l1Var3.i0();
                                    } else {
                                        iJ1 = 0;
                                        iI1 = 0;
                                    }
                                    new u.j(u.j.a(iJ1, iI1));
                                    h0Var.getClass();
                                    break;
                            }
                            return g00.b0.a;
                        }
                    });
                }
                Iterator it = list2.iterator();
                float f3 = j0Var.f6418c;
                float f10 = j0Var.f6420e;
                long jP = h0.c.p(j9, b1Var);
                h0.h0 h0Var2 = j0Var.f6421f;
                m1.e eVar = new m1.e(0, new x0[16]);
                int iH = y3.a.h(jP);
                int iJ = y3.a.j(jP);
                int iG = y3.a.g(jP);
                u.w wVar = u.m.f14876a;
                u.w wVar2 = new u.w();
                ArrayList arrayList = new ArrayList();
                int iCeil = (int) Math.ceil(y0Var.A0(f3));
                int iCeil2 = (int) Math.ceil(y0Var.A0(f10));
                long jA3 = y3.b.a(0, iH, 0, iG);
                long jH2 = h0.c.H(h0.c.r(14, jA3));
                if (it.hasNext()) {
                    try {
                        v0Var = (v0) it.next();
                    } catch (IndexOutOfBoundsException unused) {
                        v0Var = null;
                    }
                    v0Var2 = v0Var;
                } else {
                    v0Var2 = null;
                }
                if (v0Var2 != null) {
                    if (h0.c.t(h0.c.s(v0Var2)) == 0.0f) {
                        h0.c.s(v0Var2);
                        l1VarO = v0Var2.O(jH2);
                        jA2 = u.j.a(l1VarO.j0(), l1VarO.i0());
                    } else {
                        int iS = v0Var2.s(Integer.MAX_VALUE);
                        jA2 = u.j.a(iS, v0Var2.f0(iS));
                        l1VarO = null;
                    }
                    jVar = new u.j(jA2);
                    l1Var = l1VarO;
                } else {
                    eVar = eVar;
                    l1Var = null;
                    jVar = null;
                }
                l1 l1Var3 = l1Var;
                Integer numValueOf2 = jVar != null ? Integer.valueOf((int) (jVar.f14863a >> 32)) : null;
                Integer numValueOf3 = jVar != null ? Integer.valueOf((int) (jVar.f14863a & 4294967295L)) : null;
                int[] iArr = new int[16];
                int[] iArrCopyOf = new int[16];
                v0 v0Var6 = v0Var2;
                u.x xVar = new u.x();
                androidx.glance.appwidget.protobuf.d dVar = new androidx.glance.appwidget.protobuf.d(h0Var2, jP, iCeil, iCeil2);
                u.j jVar4 = jVar;
                h0.d0 d0VarB = dVar.b(it.hasNext(), 0, u.j.a(iH, iG), jVar4, 0, 0, 0, false, false);
                if (d0VarB.f6397b) {
                    d0Var = d0VarB;
                    dVar.a(d0Var, jVar4 != null, -1, 0, iH, 0);
                } else {
                    d0Var = d0VarB;
                }
                int i13 = iH;
                int i14 = iG;
                l1 l1Var4 = l1Var3;
                v0 v0Var7 = v0Var6;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = iJ;
                int[] iArrCopyOf2 = iArr;
                int i22 = 0;
                h0.j0 j0Var2 = j0Var;
                h0.d0 d0Var3 = d0Var;
                int i23 = 0;
                while (!d0Var3.f6397b && v0Var7 != null) {
                    kotlin.jvm.internal.m.b(numValueOf2);
                    int iIntValue = numValueOf2.intValue();
                    kotlin.jvm.internal.m.b(numValueOf3);
                    int iIntValue2 = numValueOf3.intValue();
                    u.x xVar2 = xVar;
                    int i24 = i23 + iIntValue;
                    int iMax = Math.max(i22, iIntValue2);
                    int i25 = i13 - iIntValue;
                    int i26 = i15 + 1;
                    h0Var2.getClass();
                    arrayList = arrayList;
                    arrayList.add(v0Var7);
                    wVar2.i(i15, l1Var4);
                    v0Var7.U();
                    int i27 = i26 - i18;
                    if (it.hasNext()) {
                        try {
                            v0Var3 = (v0) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            v0Var3 = null;
                        }
                    } else {
                        v0Var3 = null;
                    }
                    if (v0Var3 != null) {
                        if (h0.c.t(h0.c.s(v0Var3)) == 0.0f) {
                            h0.c.s(v0Var3);
                            l1 l1VarO2 = v0Var3.O(jH2);
                            jA = u.j.a(l1VarO2.j0(), l1VarO2.i0());
                            l1Var2 = l1VarO2;
                        } else {
                            int iS2 = v0Var3.s(Integer.MAX_VALUE);
                            jA = u.j.a(iS2, v0Var3.f0(iS2));
                            l1Var2 = null;
                        }
                        jVar2 = new u.j(jA);
                    } else {
                        jVar2 = null;
                        l1Var2 = null;
                    }
                    Integer numValueOf4 = jVar2 != null ? Integer.valueOf(((int) (jVar2.f14863a >> 32)) + iCeil) : null;
                    Integer numValueOf5 = jVar2 != null ? Integer.valueOf((int) (jVar2.f14863a & 4294967295L)) : null;
                    boolean zHasNext = it.hasNext();
                    long jA4 = u.j.a(i25, i14);
                    if (jVar2 == null) {
                        jVar3 = null;
                    } else {
                        kotlin.jvm.internal.m.b(numValueOf4);
                        int iIntValue3 = numValueOf4.intValue();
                        kotlin.jvm.internal.m.b(numValueOf5);
                        jVar3 = new u.j(u.j.a(iIntValue3, numValueOf5.intValue()));
                    }
                    h0.d0 d0VarB2 = dVar.b(zHasNext, i27, jA4, jVar3, i19, i20, iMax, false, false);
                    if (d0VarB2.f6396a) {
                        int iMin = Math.min(Math.max(i21, i24), iH);
                        int i28 = i20 + iMax;
                        d0Var2 = d0VarB2;
                        androidx.glance.appwidget.protobuf.d dVar2 = dVar;
                        int i29 = i19;
                        dVar2.a(d0Var2, jVar2 != null, i29, i28, i25, i27);
                        dVar = dVar2;
                        int i30 = i17 + 1;
                        if (iArrCopyOf.length < i30) {
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i30, (iArrCopyOf.length * 3) / 2));
                            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
                        }
                        iArrCopyOf[i17] = iMax;
                        i17++;
                        i14 = (i14 - i28) - iCeil2;
                        int i31 = i16 + 1;
                        if (iArrCopyOf2.length < i31) {
                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, Math.max(i31, (iArrCopyOf2.length * 3) / 2));
                            kotlin.jvm.internal.m.d(iArrCopyOf2, "copyOf(...)");
                        }
                        iArrCopyOf2[i16] = i26;
                        i16++;
                        numValueOf = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - iCeil) : null;
                        i19 = i29 + 1;
                        i20 = i28 + iCeil2;
                        i21 = iMin;
                        i13 = iH;
                        i18 = i26;
                        i24 = 0;
                        iMax = 0;
                    } else {
                        d0Var2 = d0VarB2;
                        i13 = i25;
                        numValueOf = numValueOf4;
                    }
                    d0Var3 = d0Var2;
                    i15 = i26;
                    l1Var4 = l1Var2;
                    numValueOf2 = numValueOf;
                    i23 = i24;
                    v0Var7 = v0Var3;
                    xVar = xVar2;
                    numValueOf3 = numValueOf5;
                    i22 = iMax;
                }
                u.x xVar3 = xVar;
                int size = arrayList.size();
                ?? r4 = new l1[size];
                for (int i32 = 0; i32 < size; i32++) {
                    r4[i32] = wVar2.b(i32);
                }
                int[] iArr2 = new int[i16];
                int[] iArr3 = new int[i16];
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                ?? r7 = r4;
                while (i34 < i16) {
                    int[] iArr4 = iArrCopyOf2;
                    int i36 = iArr4[i34];
                    if (i34 < 0 || i34 >= i17) {
                        v.a.d("Index must be between 0 and size");
                        throw null;
                    }
                    int iG2 = iArrCopyOf[i34];
                    u.x xVar4 = xVar3;
                    if (xVar4.c(i34)) {
                        c10 = 65535;
                    } else {
                        c10 = 65535;
                        iG2 = y3.a.g(jA3) == Integer.MAX_VALUE ? Integer.MAX_VALUE : y3.a.g(jA3) - i35;
                    }
                    ?? r10 = r7;
                    int[] iArr5 = iArrCopyOf;
                    int i37 = i21;
                    int i38 = i17;
                    int[] iArr6 = iArr2;
                    h0.j0 j0Var3 = j0Var2;
                    ArrayList arrayList2 = arrayList;
                    x0 x0VarW = h0.c.w(j0Var3, i37, y3.a.i(jA3), y3.a.h(jA3), iG2, iCeil, y0Var, arrayList2, r10, i33, i36, iArr6, i34);
                    int iD = x0VarW.d();
                    int iC = x0VarW.c();
                    iArr3[i34] = iC;
                    int iMax2 = Math.max(i37, iD);
                    eVar.b(x0VarW);
                    i34++;
                    arrayList = arrayList2;
                    r7 = r10;
                    i33 = i36;
                    xVar3 = xVar4;
                    i16 = i16;
                    iArrCopyOf2 = iArr4;
                    j0Var2 = j0Var3;
                    i35 += iC;
                    iArr2 = iArr6;
                    i17 = i38;
                    i21 = iMax2;
                    iArrCopyOf = iArr5;
                }
                int[] iArr7 = iArr2;
                int i39 = i21;
                int i40 = i35;
                h0.j0 j0Var4 = j0Var2;
                m1.e eVar2 = eVar;
                if (eVar2.C == 0) {
                    i39 = 0;
                    i10 = 0;
                } else {
                    i10 = i40;
                }
                h0.h hVar = j0Var4.f6417b;
                int iR0 = ((eVar2.C - 1) * y0Var.R0(hVar.a())) + i10;
                int i41 = y3.a.i(jP);
                int iG3 = y3.a.g(jP);
                if (iR0 < i41) {
                    iR0 = i41;
                }
                if (iR0 <= iG3) {
                    iG3 = iR0;
                }
                hVar.b(y0Var, iG3, iArr3, iArr7);
                int iJ2 = y3.a.j(jP);
                int iH2 = y3.a.h(jP);
                if (i39 < iJ2) {
                    i39 = iJ2;
                }
                if (i39 <= iH2) {
                    iH2 = i39;
                }
                return y0Var.o0(iH2, iG3, yVar, new a1.e1(eVar2, 28));
            }
            h0Var.getClass();
            h0.f0 f0Var = h0.f0.A;
            h0.f0 f0Var2 = h0.f0.A;
        }
        return y0Var.o0(0, 0, yVar, new xn.a(29));
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f17092a + ')';
    }
}
