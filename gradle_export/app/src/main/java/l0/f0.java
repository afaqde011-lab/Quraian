package l0;

import java.util.ArrayList;
import java.util.Collections;

public final class f0 {

    public final u.i0 f9729a;

    public c50.h f9730b;

    public int f9731c;

    public final u.j0 f9732d;

    public final ArrayList f9733e;

    public final ArrayList f9734f;

    public final ArrayList f9735g;

    public final ArrayList f9736h;

    public final ArrayList f9737i;

    public c0 f9738j;

    public final b2.r f9739k;

    public f0() {
        long[] jArr = u.q0.f14885a;
        this.f9729a = new u.i0();
        u.j0 j0Var = u.r0.f14890a;
        this.f9732d = new u.j0();
        this.f9733e = new ArrayList();
        this.f9734f = new ArrayList();
        this.f9735g = new ArrayList();
        this.f9736h = new ArrayList();
        this.f9737i = new ArrayList();
        this.f9739k = new b0(this);
    }

    public static void c(p0 p0Var, int i10, d0 d0Var) {
        int i11 = 0;
        long j9 = p0Var.j(0);
        long jA = p0Var.h() ? y3.j.a(0, i10, 1, j9) : y3.j.a(i10, 0, 2, j9);
        z[] zVarArr = d0Var.f9721a;
        int length = zVarArr.length;
        int i12 = 0;
        while (i11 < length) {
            z zVar = zVarArr[i11];
            int i13 = i12 + 1;
            if (zVar != null) {
                zVar.l = y3.j.d(jA, y3.j.c(p0Var.j(i12), j9));
            }
            i11++;
            i12 = i13;
        }
    }

    public static int h(int[] iArr, p0 p0Var) {
        int iK = p0Var.k();
        int iE = p0Var.e() + iK;
        int iMax = 0;
        while (iK < iE) {
            int iC = p0Var.c() + iArr[iK];
            iArr[iK] = iC;
            iMax = Math.max(iMax, iC);
            iK++;
        }
        return iMax;
    }

    public final z a(int i10, Object obj) {
        d0 d0Var = (d0) this.f9729a.g(obj);
        if (d0Var != null) {
            return d0Var.f9721a[i10];
        }
        return null;
    }

    public final long b() {
        ArrayList arrayList = this.f9737i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            z zVar = (z) arrayList.get(i10);
            l2.b bVar = zVar.f9819n;
            if (bVar != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (zVar.l >> 32)) + ((int) (bVar.f9991u >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (zVar.l & 4294967295L)) + ((int) (bVar.f9991u & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    public final void d(int i10, int i11, int i12, ArrayList arrayList, c50.h hVar, f5.c cVar, boolean z10, boolean z11, int i13, boolean z12, int i14, int i15, a40.z zVar, i2.y yVar) {
        u.i0 i0Var;
        n nVar;
        long j9;
        long j10;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int[] iArr;
        u.i0 i0Var2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        u.j0 j0Var;
        c50.h hVar2;
        int[] iArr2;
        u.i0 i0Var3;
        int i16;
        Object[] objArr;
        long[] jArr;
        Object[] objArr2;
        long[] jArr2;
        u.i0 i0Var4;
        int i17;
        ArrayList arrayList7;
        u.j0 j0Var2;
        ArrayList arrayList8;
        int[] iArr3;
        int i18;
        z[] zVarArr;
        Object obj;
        ArrayList arrayList9 = arrayList;
        int i19 = i13;
        c50.h hVar3 = this.f9730b;
        this.f9730b = hVar;
        int size = arrayList9.size();
        int i20 = 0;
        loop0: while (true) {
            i0Var = this.f9729a;
            if (i20 >= size) {
                nVar = null;
                if (!i0Var.i()) {
                    break;
                }
                e();
                return;
            }
            p0 p0Var = (p0) arrayList9.get(i20);
            int iA = p0Var.a();
            for (int i21 = 0; i21 < iA; i21++) {
                nVar = null;
                Object objF = p0Var.f(i21);
                if ((objF instanceof n ? (n) objF : null) != null) {
                    break loop0;
                }
            }
            i20++;
        }
        int i22 = this.f9731c;
        p0 p0Var2 = (p0) h00.q.N0(arrayList9);
        this.f9731c = p0Var2 != null ? p0Var2.getIndex() : 0;
        if (z10) {
            j9 = 4294967295L;
            j10 = (((long) i10) & 4294967295L) | (((long) 0) << 32);
        } else {
            j9 = 4294967295L;
            j10 = (((long) i10) << 32) | (((long) 0) & 4294967295L);
        }
        boolean z13 = z11 || !z12;
        Object[] objArr3 = i0Var.f14857b;
        long[] jArr3 = i0Var.f14856a;
        int length = jArr3.length - 2;
        u.j0 j0Var3 = this.f9732d;
        if (length >= 0) {
            int i23 = 0;
            while (true) {
                long j11 = jArr3[i23];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i23 != length) {
                        break;
                        break;
                    }
                    i23++;
                } else {
                    int i24 = 8 - ((~(i23 - length)) >>> 31);
                    for (int i25 = 0; i25 < i24; i25++) {
                        if ((j11 & 255) < 128) {
                            j0Var3.a(objArr3[(i23 << 3) + i25]);
                        }
                        j11 >>= 8;
                    }
                    if (i24 != 8) {
                        break;
                    } else if (i23 != length) {
                        break;
                    } else {
                        i23++;
                    }
                }
            }
        }
        int size2 = arrayList9.size();
        int i26 = 0;
        while (true) {
            arrayList2 = this.f9737i;
            arrayList3 = this.f9734f;
            arrayList4 = this.f9733e;
            if (i26 >= size2) {
                break;
            }
            p0 p0Var3 = (p0) arrayList9.get(i26);
            int i27 = size2;
            j0Var3.l(p0Var3.getKey());
            int iA2 = p0Var3.a();
            int i28 = i26;
            int i29 = 0;
            while (true) {
                if (i29 >= iA2) {
                    f(p0Var3.getKey());
                    break;
                }
                int i30 = iA2;
                Object objF2 = p0Var3.f(i29);
                int i31 = i29;
                if ((objF2 instanceof n ? (n) objF2 : nVar) != null) {
                    d0 d0Var = (d0) i0Var.g(p0Var3.getKey());
                    int iL = hVar3 != null ? hVar3.l(p0Var3.getKey()) : -1;
                    boolean z14 = iL == -1 && hVar3 != null;
                    if (d0Var != null) {
                        boolean z15 = z14;
                        if (!z13) {
                            break;
                        }
                        d0.b(d0Var, p0Var3, zVar, yVar, i14, i15);
                        z[] zVarArr2 = d0Var.f9721a;
                        int length2 = zVarArr2.length;
                        int i32 = 0;
                        while (i32 < length2) {
                            z[] zVarArr3 = zVarArr2;
                            z zVar2 = zVarArr3[i32];
                            int i33 = length2;
                            int i34 = i32;
                            if (zVar2 != null && !y3.j.b(zVar2.l, z.f9806s)) {
                                zVar2.l = y3.j.d(zVar2.l, j10);
                            }
                            i32 = i34 + 1;
                            zVarArr2 = zVarArr3;
                            length2 = i33;
                        }
                        if (z15) {
                            for (z zVar3 : d0Var.f9721a) {
                                if (zVar3 != null) {
                                    if (zVar3.b()) {
                                        arrayList2.remove(zVar3);
                                        c0 c0Var = this.f9738j;
                                        if (c0Var != null) {
                                            b3.m.m(c0Var);
                                        }
                                    }
                                    zVar3.a();
                                }
                            }
                        }
                        g(p0Var3, false);
                        break;
                    }
                    d0 d0Var2 = new d0(this);
                    d0.b(d0Var2, p0Var3, zVar, yVar, i14, i15);
                    boolean z16 = z14;
                    i0Var.m(p0Var3.getKey(), d0Var2);
                    if (p0Var3.getIndex() != iL && iL != -1) {
                        if (iL < i22) {
                            arrayList4.add(p0Var3);
                            break;
                        } else {
                            arrayList3.add(p0Var3);
                            break;
                        }
                    }
                    long j12 = p0Var3.j(0);
                    c(p0Var3, (int) (p0Var3.h() ? j12 & j9 : j12 >> 32), d0Var2);
                    if (!z16) {
                        break;
                    }
                    z[] zVarArr4 = d0Var2.f9721a;
                    for (z zVar4 : zVarArr4) {
                        if (zVar4 != null) {
                            zVar4.a();
                        }
                    }
                    break;
                }
                i29 = i31 + 1;
                iA2 = i30;
            }
            i26 = i28 + 1;
            arrayList9 = arrayList;
            size2 = i27;
        }
        int[] iArr4 = new int[i19];
        if (z13 && hVar3 != null) {
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    h00.u.t0(arrayList4, new e0(hVar3, 2));
                }
                int size3 = arrayList4.size();
                for (int i35 = 0; i35 < size3; i35++) {
                    p0 p0Var4 = (p0) arrayList4.get(i35);
                    int iH = i14 - h(iArr4, p0Var4);
                    Object objG = i0Var.g(p0Var4.getKey());
                    kotlin.jvm.internal.m.b(objG);
                    c(p0Var4, iH, (d0) objG);
                    g(p0Var4, false);
                }
                h00.n.A0(iArr4, 0);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    h00.u.t0(arrayList3, new e0(hVar3, 0));
                }
                int size4 = arrayList3.size();
                for (int i36 = 0; i36 < size4; i36++) {
                    p0 p0Var5 = (p0) arrayList3.get(i36);
                    int iH2 = (h(iArr4, p0Var5) + i15) - p0Var5.c();
                    Object objG2 = i0Var.g(p0Var5.getKey());
                    kotlin.jvm.internal.m.b(objG2);
                    c(p0Var5, iH2, (d0) objG2);
                    g(p0Var5, false);
                }
                h00.n.A0(iArr4, 0);
            }
        }
        Object[] objArr4 = j0Var3.f14865b;
        long[] jArr4 = j0Var3.f14864a;
        int length3 = jArr4.length - 2;
        ArrayList arrayList10 = this.f9736h;
        ArrayList arrayList11 = this.f9735g;
        if (length3 >= 0) {
            ArrayList arrayList12 = arrayList3;
            int i37 = 0;
            while (true) {
                long j13 = jArr4[i37];
                ArrayList arrayList13 = arrayList4;
                u.j0 j0Var4 = j0Var3;
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i38 = 8 - ((~(i37 - length3)) >>> 31);
                    long j14 = j13;
                    int i39 = 0;
                    while (i39 < i38) {
                        if ((j14 & 255) < 128) {
                            Object obj2 = objArr4[(i37 << 3) + i39];
                            d0 d0Var3 = (d0) i0Var.g(obj2);
                            if (d0Var3 == null) {
                                objArr2 = objArr4;
                                jArr2 = jArr4;
                                i0Var4 = i0Var;
                                i17 = i38;
                                arrayList7 = arrayList12;
                                j0Var2 = j0Var4;
                                arrayList8 = arrayList13;
                                iArr3 = iArr4;
                                i18 = i39;
                            } else {
                                objArr2 = objArr4;
                                jArr2 = jArr4;
                                int iL2 = hVar.l(obj2);
                                u.i0 i0Var5 = i0Var;
                                int iMin = Math.min(i19, d0Var3.f9725e);
                                d0Var3.f9725e = iMin;
                                d0Var3.f9724d = Math.min(i19 - iMin, d0Var3.f9724d);
                                if (iL2 == -1) {
                                    z[] zVarArr5 = d0Var3.f9721a;
                                    int length4 = zVarArr5.length;
                                    int i40 = 0;
                                    boolean z17 = false;
                                    int i41 = 0;
                                    while (i40 < length4) {
                                        z zVar5 = zVarArr5[i40];
                                        int i42 = i41 + 1;
                                        if (zVar5 != null) {
                                            if (zVar5.b()) {
                                                zVarArr = zVarArr5;
                                                z17 = true;
                                                iArr4 = iArr4;
                                                obj = obj2;
                                            } else {
                                                zVarArr = zVarArr5;
                                                if (((Boolean) zVar5.f9818k.getValue()).booleanValue()) {
                                                    zVar5.c();
                                                    d0Var3.f9721a[i41] = nVar;
                                                    arrayList2.remove(zVar5);
                                                    c0 c0Var2 = this.f9738j;
                                                    if (c0Var2 != null) {
                                                        b3.m.m(c0Var2);
                                                    }
                                                } else {
                                                    int i43 = i38;
                                                    l2.b bVar = zVar5.f9819n;
                                                    if (bVar != null) {
                                                        Object obj3 = obj2;
                                                        x.y yVar2 = zVar5.f9813f;
                                                        if (zVar5.b() || yVar2 == null) {
                                                            d0Var3 = d0Var3;
                                                            nVar = nVar;
                                                            i38 = i43;
                                                            obj = obj3;
                                                        } else {
                                                            zVar5.e(true);
                                                            d0 d0Var4 = d0Var3;
                                                            nVar = nVar;
                                                            i38 = i43;
                                                            d0Var3 = d0Var4;
                                                            obj = obj3;
                                                            a40.c0.y(zVar5.f9808a, nVar, nVar, new ev.p(zVar5, yVar2, bVar, nVar, 18), 3);
                                                        }
                                                    } else {
                                                        d0Var3 = d0Var3;
                                                        nVar = nVar;
                                                        i38 = i43;
                                                        obj = obj2;
                                                    }
                                                    if (zVar5.b()) {
                                                        arrayList2.add(zVar5);
                                                        c0 c0Var3 = this.f9738j;
                                                        if (c0Var3 != null) {
                                                            b3.m.m(c0Var3);
                                                        }
                                                        z17 = true;
                                                    } else {
                                                        zVar5.c();
                                                        d0Var3.f9721a[i41] = nVar;
                                                    }
                                                }
                                            }
                                            obj2 = obj;
                                            i38 = i38;
                                            nVar = nVar;
                                            i39 = r37;
                                            iArr4 = iArr4;
                                            i41 = i42;
                                            length4 = length4;
                                            j0Var4 = j0Var4;
                                            arrayList12 = arrayList12;
                                            arrayList13 = arrayList13;
                                            i0Var5 = i0Var5;
                                            d0Var3 = d0Var3;
                                            i40++;
                                            zVarArr5 = zVarArr;
                                        } else {
                                            zVarArr = zVarArr5;
                                        }
                                        iArr4 = iArr4;
                                        obj = obj2;
                                        obj2 = obj;
                                        i38 = i38;
                                        nVar = nVar;
                                        i39 = r37;
                                        iArr4 = iArr4;
                                        i41 = i42;
                                        length4 = length4;
                                        j0Var4 = j0Var4;
                                        arrayList12 = arrayList12;
                                        arrayList13 = arrayList13;
                                        i0Var5 = i0Var5;
                                        d0Var3 = d0Var3;
                                        i40++;
                                        zVarArr5 = zVarArr;
                                    }
                                    i17 = i38;
                                    arrayList7 = arrayList12;
                                    j0Var2 = j0Var4;
                                    arrayList8 = arrayList13;
                                    i0Var4 = i0Var5;
                                    iArr3 = iArr4;
                                    i18 = i39;
                                    Object obj4 = obj2;
                                    if (!z17) {
                                        f(obj4);
                                    }
                                } else {
                                    arrayList7 = arrayList12;
                                    j0Var2 = j0Var4;
                                    arrayList8 = arrayList13;
                                    i0Var4 = i0Var5;
                                    iArr3 = iArr4;
                                    i18 = i39;
                                    i17 = i38;
                                    y3.a aVar = d0Var3.f9722b;
                                    kotlin.jvm.internal.m.b(aVar);
                                    p0 p0VarH0 = cVar.H0(iL2, d0Var3.f9724d, d0Var3.f9725e, aVar.f16587a);
                                    p0VarH0.i();
                                    z[] zVarArr6 = d0Var3.f9721a;
                                    int length5 = zVarArr6.length;
                                    int i44 = 0;
                                    while (true) {
                                        if (i44 < length5) {
                                            z zVar6 = zVarArr6[i44];
                                            if (zVar6 == null || !((Boolean) zVar6.f9815h.getValue()).booleanValue()) {
                                                i44++;
                                            }
                                        } else if (hVar3 != null && iL2 == hVar3.l(obj2)) {
                                            f(obj2);
                                        }
                                        d0Var3.a(p0VarH0, zVar, yVar, i14, i15, d0Var3.f9723c);
                                        if (iL2 < this.f9731c) {
                                            arrayList11.add(p0VarH0);
                                        } else {
                                            arrayList10.add(p0VarH0);
                                        }
                                    }
                                }
                            }
                        } else {
                            objArr2 = objArr4;
                            jArr2 = jArr4;
                            i0Var4 = i0Var;
                            i17 = i38;
                            arrayList7 = arrayList12;
                            j0Var2 = j0Var4;
                            arrayList8 = arrayList13;
                            iArr3 = iArr4;
                            i18 = i39;
                        }
                        j14 >>= 8;
                        i39 = i18 + 1;
                        i38 = i17;
                        iArr4 = iArr3;
                        objArr4 = objArr2;
                        jArr4 = jArr2;
                        j0Var4 = j0Var2;
                        arrayList12 = arrayList7;
                        arrayList13 = arrayList8;
                        i0Var = i0Var4;
                        nVar = null;
                        i19 = i13;
                    }
                    objArr = objArr4;
                    jArr = jArr4;
                    i0Var2 = i0Var;
                    arrayList5 = arrayList12;
                    j0Var = j0Var4;
                    arrayList6 = arrayList13;
                    iArr = iArr4;
                    if (i38 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr4;
                    jArr = jArr4;
                    i0Var2 = i0Var;
                    arrayList5 = arrayList12;
                    j0Var = j0Var4;
                    arrayList6 = arrayList13;
                    iArr = iArr4;
                }
                if (i37 == length3) {
                    break;
                }
                i37++;
                i19 = i13;
                iArr4 = iArr;
                objArr4 = objArr;
                jArr4 = jArr;
                j0Var3 = j0Var;
                arrayList12 = arrayList5;
                arrayList4 = arrayList6;
                i0Var = i0Var2;
                nVar = null;
            }
        } else {
            iArr = iArr4;
            i0Var2 = i0Var;
            arrayList5 = arrayList3;
            arrayList6 = arrayList4;
            j0Var = j0Var3;
        }
        if (arrayList11.isEmpty()) {
            hVar2 = hVar;
            iArr2 = iArr;
            i0Var3 = i0Var2;
        } else {
            if (arrayList11.size() > 1) {
                hVar2 = hVar;
                h00.u.t0(arrayList11, new e0(hVar2, 3));
            } else {
                hVar2 = hVar;
            }
            int size5 = arrayList11.size();
            int i45 = 0;
            while (i45 < size5) {
                p0 p0Var6 = (p0) arrayList11.get(i45);
                u.i0 i0Var6 = i0Var2;
                Object objG3 = i0Var6.g(p0Var6.getKey());
                kotlin.jvm.internal.m.b(objG3);
                d0 d0Var5 = (d0) objG3;
                int[] iArr5 = iArr;
                int iH3 = h(iArr5, p0Var6);
                if (z11) {
                    p0 p0Var7 = (p0) h00.q.L0(arrayList);
                    long j15 = p0Var7.j(0);
                    i16 = (int) (p0Var7.h() ? j15 & j9 : j15 >> 32);
                } else {
                    i16 = d0Var5.f9726f;
                }
                p0Var6.b(i16 - iH3, d0Var5.f9723c, i11, i12);
                if (z13) {
                    g(p0Var6, true);
                }
                i45++;
                i0Var2 = i0Var6;
                iArr = iArr5;
            }
            iArr2 = iArr;
            i0Var3 = i0Var2;
            h00.n.A0(iArr2, 0);
        }
        if (!arrayList10.isEmpty()) {
            if (arrayList10.size() > 1) {
                h00.u.t0(arrayList10, new e0(hVar2, 1));
            }
            int size6 = arrayList10.size();
            for (int i46 = 0; i46 < size6; i46++) {
                p0 p0Var8 = (p0) arrayList10.get(i46);
                Object objG4 = i0Var3.g(p0Var8.getKey());
                kotlin.jvm.internal.m.b(objG4);
                d0 d0Var6 = (d0) objG4;
                p0Var8.b((d0Var6.f9727g - p0Var8.c()) + h(iArr2, p0Var8), d0Var6.f9723c, i11, i12);
                if (z13) {
                    g(p0Var8, true);
                }
            }
        }
        Collections.reverse(arrayList11);
        arrayList.addAll(0, arrayList11);
        arrayList.addAll(arrayList10);
        arrayList6.clear();
        arrayList5.clear();
        arrayList11.clear();
        arrayList10.clear();
        j0Var.b();
    }

    public final void e() {
        u.i0 i0Var = this.f9729a;
        if (i0Var.j()) {
            Object[] objArr = i0Var.f14858c;
            long[] jArr = i0Var.f14856a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j9 = jArr[i10];
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j9) < 128) {
                                for (z zVar : ((d0) objArr[(i10 << 3) + i12]).f9721a) {
                                    if (zVar != null) {
                                        zVar.c();
                                    }
                                }
                            }
                            j9 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            i0Var.a();
        }
    }

    public final void f(Object obj) {
        z[] zVarArr;
        d0 d0Var = (d0) this.f9729a.k(obj);
        if (d0Var == null || (zVarArr = d0Var.f9721a) == null) {
            return;
        }
        for (z zVar : zVarArr) {
            if (zVar != null) {
                zVar.c();
            }
        }
    }

    public final void g(p0 p0Var, boolean z10) {
        Object objG = this.f9729a.g(p0Var.getKey());
        kotlin.jvm.internal.m.b(objG);
        z[] zVarArr = ((d0) objG).f9721a;
        int length = zVarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            z zVar = zVarArr[i10];
            int i12 = i11 + 1;
            if (zVar != null) {
                long j9 = p0Var.j(i11);
                long j10 = zVar.l;
                if (!y3.j.b(j10, z.f9806s) && !y3.j.b(j10, j9)) {
                    long jC = y3.j.c(j9, j10);
                    x.y yVar = zVar.f9812e;
                    if (yVar != null) {
                        long jC2 = y3.j.c(((y3.j) zVar.f9822q.getValue()).f16590a, jC);
                        zVar.g(jC2);
                        zVar.f(true);
                        zVar.f9814g = z10;
                        a40.c0.y(zVar.f9808a, (k00.i) null, (a40.a0) null, new b1.w(zVar, yVar, jC2, (k00.c) null), 3);
                    }
                }
                zVar.l = j9;
            }
            i10++;
            i11 = i12;
        }
    }
}
