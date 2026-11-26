package z1;

import b3.a2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import l1.k2;
import u.i0;
import u.j0;

public final class t {

    public final u00.k f17053a;

    public Object f17054b;

    public u.c0 f17055c;

    public boolean f17062j;

    public int f17063k;

    public int f17056d = -1;

    public final i0 f17057e = va.a.n();

    public final i0 f17058f = new i0();

    public final j0 f17059g = new j0();

    public final m1.e f17060h = new m1.e(0, new l1.w[16]);

    public final l1.f0 f17061i = new l1.f0(this, 1);
    public final i0 l = va.a.n();
    public final HashMap m = new HashMap();

    public t(u00.k kVar) {
        this.f17053a = kVar;
    }

    public final boolean a(Set set) throws Throwable {
        long j9;
        boolean z10;
        Iterator it;
        Object obj;
        String str;
        HashMap map;
        int i10;
        boolean z11;
        Iterator it2;
        Object obj2;
        String str2;
        i0 i0Var;
        int i11;
        boolean z12;
        long[] jArr;
        int i12;
        int i13;
        Object[] objArr;
        int i14;
        u.c0 c0Var;
        long[] jArr2;
        l1.c cVar;
        i0 i0Var2;
        Object[] objArr2;
        int i15;
        long[] jArr3;
        l1.c cVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        long j10;
        i0 i0Var3;
        Object[] objArr3;
        boolean z13;
        i0 i0Var4;
        int i20;
        int i21;
        int i22;
        long j11;
        t tVar = this;
        l1.c cVar3 = l1.c.G;
        boolean z14 = set instanceof m1.h;
        String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
        m1.e eVar = tVar.f17060h;
        i0 i0Var5 = tVar.l;
        HashMap map2 = tVar.m;
        i0 i0Var6 = tVar.f17057e;
        j0 j0Var = tVar.f17059g;
        if (z14) {
            j0 j0Var2 = ((m1.h) set).A;
            Object[] objArr4 = j0Var2.f14865b;
            long[] jArr4 = j0Var2.f14864a;
            j9 = -9187201950435737472L;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i23 = 0;
                z10 = false;
                while (true) {
                    int i24 = 8;
                    long j12 = jArr4[i23];
                    i0 i0Var7 = i0Var5;
                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i25 = 8 - ((~(i23 - length)) >>> 31);
                        int i26 = 0;
                        while (i26 < i25) {
                            if ((j12 & 255) < 128) {
                                Object obj3 = objArr4[(i23 << 3) + i26];
                                jArr3 = jArr4;
                                if (obj3 instanceof a0) {
                                    cVar2 = cVar3;
                                    if (!((a0) obj3).f(2)) {
                                    }
                                    j12 = j10 >> 8;
                                    i26 = i17 + 1;
                                    i24 = 8;
                                    objArr4 = objArr3;
                                    jArr4 = jArr3;
                                    cVar3 = cVar2;
                                    length = i18;
                                    i23 = i19;
                                    i25 = i16;
                                    i0Var7 = i0Var3;
                                } else {
                                    cVar2 = cVar3;
                                }
                                if (tVar.f17062j) {
                                    i0Var3 = i0Var7;
                                    i16 = i25;
                                    i17 = i26;
                                    i18 = length;
                                    i19 = i23;
                                    j10 = j12;
                                    objArr3 = objArr4;
                                } else {
                                    i0Var3 = i0Var7;
                                    if (i0Var3.c(obj3)) {
                                        tVar.f17062j = true;
                                        try {
                                            Object objG = i0Var3.g(obj3);
                                            if (objG != null) {
                                                objArr3 = objArr4;
                                                try {
                                                    if (objG instanceof j0) {
                                                        j0 j0Var3 = (j0) objG;
                                                        Object[] objArr5 = j0Var3.f14865b;
                                                        long[] jArr5 = j0Var3.f14864a;
                                                        int length2 = jArr5.length - 2;
                                                        if (length2 >= 0) {
                                                            j10 = j12;
                                                            int i27 = 0;
                                                            while (true) {
                                                                long j13 = jArr5[i27];
                                                                i18 = length;
                                                                i19 = i23;
                                                                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i28 = 8 - ((~(i27 - length2)) >>> 31);
                                                                    int i29 = 0;
                                                                    while (i29 < i28) {
                                                                        if ((j13 & 255) < 128) {
                                                                            i21 = i26;
                                                                            l1.w wVar = (l1.w) objArr5[(i27 << 3) + i29];
                                                                            kotlin.jvm.internal.m.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                                            i22 = i29;
                                                                            Object obj4 = map2.get(wVar);
                                                                            j11 = j13;
                                                                            k2 k2Var = wVar.C;
                                                                            if (k2Var == null) {
                                                                                k2Var = cVar2;
                                                                            }
                                                                            if (k2Var.a(wVar.i().f9946f, obj4)) {
                                                                                i0Var4 = i0Var3;
                                                                                i20 = i25;
                                                                                eVar.b(wVar);
                                                                            } else {
                                                                                Object objG2 = i0Var6.g(wVar);
                                                                                if (objG2 == null) {
                                                                                    i0Var4 = i0Var3;
                                                                                    i20 = i25;
                                                                                } else if (objG2 instanceof j0) {
                                                                                    j0 j0Var4 = (j0) objG2;
                                                                                    Object[] objArr6 = j0Var4.f14865b;
                                                                                    long[] jArr6 = j0Var4.f14864a;
                                                                                    int length3 = jArr6.length - 2;
                                                                                    if (length3 >= 0) {
                                                                                        i20 = i25;
                                                                                        int i30 = 0;
                                                                                        while (true) {
                                                                                            long j14 = jArr6[i30];
                                                                                            i0Var4 = i0Var3;
                                                                                            if ((((~j14) << 7) & j14 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                                if (i30 != length3) {
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                i30++;
                                                                                                i24 = 8;
                                                                                                i0Var3 = i0Var4;
                                                                                            } else {
                                                                                                int i31 = 8 - ((~(i30 - length3)) >>> 31);
                                                                                                for (int i32 = 0; i32 < i31; i32++) {
                                                                                                    if ((j14 & 255) < 128) {
                                                                                                        j0Var.a(objArr6[(i30 << 3) + i32]);
                                                                                                        z10 = true;
                                                                                                    }
                                                                                                    j14 >>= i24;
                                                                                                }
                                                                                                if (i31 != i24) {
                                                                                                    break;
                                                                                                }
                                                                                                if (i30 != length3) {
                                                                                                    break;
                                                                                                }
                                                                                                i30++;
                                                                                                i24 = 8;
                                                                                                i0Var3 = i0Var4;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        i0Var4 = i0Var3;
                                                                                        i20 = i25;
                                                                                    }
                                                                                } else {
                                                                                    i0Var4 = i0Var3;
                                                                                    i20 = i25;
                                                                                    j0Var.a(objG2);
                                                                                    z10 = true;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            i0Var4 = i0Var3;
                                                                            i20 = i25;
                                                                            i21 = i26;
                                                                            i22 = i29;
                                                                            j11 = j13;
                                                                        }
                                                                        j13 = j11 >> 8;
                                                                        i29 = i22 + 1;
                                                                        i24 = 8;
                                                                        i26 = i21;
                                                                        i25 = i20;
                                                                        i0Var3 = i0Var4;
                                                                    }
                                                                    i0Var3 = i0Var3;
                                                                    i16 = i25;
                                                                    i17 = i26;
                                                                    if (i28 != i24) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    i0Var3 = i0Var3;
                                                                    i16 = i25;
                                                                    i17 = i26;
                                                                }
                                                                if (i27 == length2) {
                                                                    break;
                                                                }
                                                                i27++;
                                                                i24 = 8;
                                                                length = i18;
                                                                i23 = i19;
                                                                i26 = i17;
                                                                i25 = i16;
                                                                i0Var3 = i0Var3;
                                                            }
                                                        }
                                                    } else {
                                                        i0Var3 = i0Var3;
                                                        i16 = i25;
                                                        i17 = i26;
                                                        i18 = length;
                                                        i19 = i23;
                                                        j10 = j12;
                                                        l1.w wVar2 = (l1.w) objG;
                                                        Object obj5 = map2.get(wVar2);
                                                        k2 k2Var2 = wVar2.C;
                                                        if (k2Var2 == null) {
                                                            k2Var2 = cVar2;
                                                        }
                                                        if (k2Var2.a(wVar2.i().f9946f, obj5)) {
                                                            eVar.b(wVar2);
                                                        } else {
                                                            Object objG3 = i0Var6.g(wVar2);
                                                            if (objG3 != null) {
                                                                if (objG3 instanceof j0) {
                                                                    j0 j0Var5 = (j0) objG3;
                                                                    Object[] objArr7 = j0Var5.f14865b;
                                                                    long[] jArr7 = j0Var5.f14864a;
                                                                    int length4 = jArr7.length - 2;
                                                                    if (length4 >= 0) {
                                                                        int i33 = 0;
                                                                        while (true) {
                                                                            long j15 = jArr7[i33];
                                                                            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                if (i33 != length4) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                i33++;
                                                                            } else {
                                                                                int i34 = 8 - ((~(i33 - length4)) >>> 31);
                                                                                for (int i35 = 0; i35 < i34; i35++) {
                                                                                    if ((j15 & 255) < 128) {
                                                                                        j0Var.a(objArr7[(i33 << 3) + i35]);
                                                                                        z10 = true;
                                                                                    }
                                                                                    j15 >>= 8;
                                                                                }
                                                                                if (i34 != 8) {
                                                                                    break;
                                                                                }
                                                                                if (i33 != length4) {
                                                                                    break;
                                                                                }
                                                                                i33++;
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    j0Var.a(objG3);
                                                                    z10 = true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    tVar = this;
                                                    tVar.f17062j = false;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    z13 = false;
                                                    tVar = this;
                                                    tVar.f17062j = z13;
                                                    throw th;
                                                }
                                            } else {
                                                objArr3 = objArr4;
                                            }
                                            i16 = i25;
                                            i17 = i26;
                                            i18 = length;
                                            i19 = i23;
                                            j10 = j12;
                                            tVar = this;
                                            tVar.f17062j = false;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            z13 = false;
                                        }
                                    } else {
                                        i0Var3 = i0Var3;
                                        objArr3 = objArr4;
                                        i16 = i25;
                                        i17 = i26;
                                        i18 = length;
                                        i19 = i23;
                                        j10 = j12;
                                    }
                                }
                                Object objG4 = i0Var6.g(obj3);
                                if (objG4 != null) {
                                    if (objG4 instanceof j0) {
                                        j0 j0Var6 = (j0) objG4;
                                        Object[] objArr8 = j0Var6.f14865b;
                                        long[] jArr8 = j0Var6.f14864a;
                                        int length5 = jArr8.length - 2;
                                        if (length5 >= 0) {
                                            int i36 = 0;
                                            while (true) {
                                                long j16 = jArr8[i36];
                                                if ((((~j16) << 7) & j16 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                    if (i36 != length5) {
                                                        break;
                                                        break;
                                                    }
                                                    i36++;
                                                } else {
                                                    int i37 = 8 - ((~(i36 - length5)) >>> 31);
                                                    for (int i38 = 0; i38 < i37; i38++) {
                                                        if ((j16 & 255) < 128) {
                                                            j0Var.a(objArr8[(i36 << 3) + i38]);
                                                            z10 = true;
                                                        }
                                                        j16 >>= 8;
                                                    }
                                                    if (i37 != 8) {
                                                        break;
                                                    }
                                                    if (i36 != length5) {
                                                        break;
                                                    }
                                                    i36++;
                                                }
                                            }
                                        }
                                    } else {
                                        j0Var.a(objG4);
                                        z10 = true;
                                    }
                                }
                                j12 = j10 >> 8;
                                i26 = i17 + 1;
                                i24 = 8;
                                objArr4 = objArr3;
                                jArr4 = jArr3;
                                cVar3 = cVar2;
                                length = i18;
                                i23 = i19;
                                i25 = i16;
                                i0Var7 = i0Var3;
                            } else {
                                jArr3 = jArr4;
                                cVar2 = cVar3;
                            }
                            i16 = i25;
                            i17 = i26;
                            i18 = length;
                            i19 = i23;
                            j10 = j12;
                            i0Var3 = i0Var7;
                            objArr3 = objArr4;
                            j12 = j10 >> 8;
                            i26 = i17 + 1;
                            i24 = 8;
                            objArr4 = objArr3;
                            jArr4 = jArr3;
                            cVar3 = cVar2;
                            length = i18;
                            i23 = i19;
                            i25 = i16;
                            i0Var7 = i0Var3;
                        }
                        jArr2 = jArr4;
                        cVar = cVar3;
                        int i39 = length;
                        int i40 = i23;
                        i0Var2 = i0Var7;
                        objArr2 = objArr4;
                        if (i25 != i24) {
                            break;
                        }
                        length = i39;
                        i15 = i40;
                    } else {
                        jArr2 = jArr4;
                        cVar = cVar3;
                        i0Var2 = i0Var7;
                        objArr2 = objArr4;
                        i15 = i23;
                    }
                    if (i15 == length) {
                        break;
                    }
                    i23 = i15 + 1;
                    objArr4 = objArr2;
                    jArr4 = jArr2;
                    cVar3 = cVar;
                    i0Var5 = i0Var2;
                }
            } else {
                z10 = false;
            }
        } else {
            i0 i0Var8 = i0Var5;
            j9 = -9187201950435737472L;
            Iterator it3 = set.iterator();
            boolean z15 = false;
            while (it3.hasNext()) {
                Object next = it3.next();
                if (!(next instanceof a0) || ((a0) next).f(2)) {
                    if (tVar.f17062j) {
                        it = it3;
                        obj = next;
                        str = str3;
                        map = map2;
                        i10 = 0;
                    } else {
                        i0 i0Var9 = i0Var8;
                        if (i0Var9.c(next)) {
                            tVar.f17062j = true;
                            try {
                                Object objG5 = i0Var9.g(next);
                                if (objG5 == null) {
                                    it = it3;
                                    obj = next;
                                    str = str3;
                                    i0Var8 = i0Var9;
                                    map = map2;
                                } else if (objG5 instanceof j0) {
                                    j0 j0Var7 = (j0) objG5;
                                    Object[] objArr9 = j0Var7.f14865b;
                                    long[] jArr9 = j0Var7.f14864a;
                                    int length6 = jArr9.length - 2;
                                    if (length6 >= 0) {
                                        boolean z16 = z15;
                                        map = map2;
                                        int i41 = 0;
                                        while (true) {
                                            long j17 = jArr9[i41];
                                            long[] jArr10 = jArr9;
                                            Object[] objArr10 = objArr9;
                                            if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i42 = 8 - ((~(i41 - length6)) >>> 31);
                                                long j18 = j17;
                                                int i43 = 0;
                                                while (i43 < i42) {
                                                    if ((j18 & 255) < 128) {
                                                        l1.w wVar3 = (l1.w) objArr10[(i41 << 3) + i43];
                                                        kotlin.jvm.internal.m.c(wVar3, str3);
                                                        Object obj6 = map.get(wVar3);
                                                        it2 = it3;
                                                        k2 k2Var3 = wVar3.C;
                                                        if (k2Var3 == null) {
                                                            k2Var3 = cVar3;
                                                        }
                                                        str2 = str3;
                                                        if (k2Var3.a(wVar3.i().f9946f, obj6)) {
                                                            obj2 = next;
                                                            i0Var = i0Var9;
                                                            i11 = i43;
                                                            eVar.b(wVar3);
                                                        } else {
                                                            Object objG6 = i0Var6.g(wVar3);
                                                            if (objG6 == null) {
                                                                obj2 = next;
                                                                i0Var = i0Var9;
                                                                i11 = i43;
                                                                z12 = z16;
                                                            } else if (objG6 instanceof j0) {
                                                                j0 j0Var8 = (j0) objG6;
                                                                Object[] objArr11 = j0Var8.f14865b;
                                                                long[] jArr11 = j0Var8.f14864a;
                                                                int length7 = jArr11.length - 2;
                                                                if (length7 >= 0) {
                                                                    i0Var = i0Var9;
                                                                    i11 = i43;
                                                                    int i44 = 0;
                                                                    while (true) {
                                                                        long j19 = jArr11[i44];
                                                                        obj2 = next;
                                                                        Object[] objArr12 = objArr11;
                                                                        if ((((~j19) << 7) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                            int i45 = 8 - ((~(i44 - length7)) >>> 31);
                                                                            int i46 = 0;
                                                                            while (i46 < i45) {
                                                                                if ((j19 & 255) < 128) {
                                                                                    j0Var.a(objArr12[(i44 << 3) + i46]);
                                                                                    z16 = true;
                                                                                }
                                                                                j19 >>= 8;
                                                                                i46++;
                                                                                jArr11 = jArr11;
                                                                            }
                                                                            jArr = jArr11;
                                                                            if (i45 != 8) {
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            jArr = jArr11;
                                                                        }
                                                                        if (i44 == length7) {
                                                                            break;
                                                                        }
                                                                        i44++;
                                                                        next = obj2;
                                                                        objArr11 = objArr12;
                                                                        jArr11 = jArr;
                                                                    }
                                                                } else {
                                                                    obj2 = next;
                                                                    i0Var = i0Var9;
                                                                    i11 = i43;
                                                                }
                                                                z12 = z16;
                                                            } else {
                                                                obj2 = next;
                                                                i0Var = i0Var9;
                                                                i11 = i43;
                                                                j0Var.a(objG6);
                                                                z12 = true;
                                                            }
                                                            z16 = z12;
                                                        }
                                                    } else {
                                                        it2 = it3;
                                                        obj2 = next;
                                                        str2 = str3;
                                                        i0Var = i0Var9;
                                                        i11 = i43;
                                                    }
                                                    j18 >>= 8;
                                                    i43 = i11 + 1;
                                                    it3 = it2;
                                                    str3 = str2;
                                                    next = obj2;
                                                    i0Var9 = i0Var;
                                                }
                                                it = it3;
                                                obj = next;
                                                str = str3;
                                                i0Var8 = i0Var9;
                                                if (i42 != 8) {
                                                    break;
                                                }
                                            } else {
                                                it = it3;
                                                obj = next;
                                                str = str3;
                                                i0Var8 = i0Var9;
                                            }
                                            if (i41 == length6) {
                                                break;
                                            }
                                            i41++;
                                            it3 = it;
                                            objArr9 = objArr10;
                                            jArr9 = jArr10;
                                            str3 = str;
                                            next = obj;
                                            i0Var9 = i0Var8;
                                        }
                                        z15 = z16;
                                    } else {
                                        it = it3;
                                        obj = next;
                                        str = str3;
                                        i0Var8 = i0Var9;
                                        map = map2;
                                    }
                                } else {
                                    it = it3;
                                    obj = next;
                                    str = str3;
                                    i0Var8 = i0Var9;
                                    map = map2;
                                    l1.w wVar4 = (l1.w) objG5;
                                    Object obj7 = map.get(wVar4);
                                    k2 k2Var4 = wVar4.C;
                                    if (k2Var4 == null) {
                                        k2Var4 = cVar3;
                                    }
                                    if (k2Var4.a(wVar4.i().f9946f, obj7)) {
                                        eVar.b(wVar4);
                                    } else {
                                        Object objG7 = i0Var6.g(wVar4);
                                        if (objG7 == null) {
                                            z11 = z15;
                                            break;
                                        }
                                        if (objG7 instanceof j0) {
                                            j0 j0Var9 = (j0) objG7;
                                            Object[] objArr13 = j0Var9.f14865b;
                                            long[] jArr12 = j0Var9.f14864a;
                                            int length8 = jArr12.length - 2;
                                            if (length8 < 0) {
                                                z11 = z15;
                                                break;
                                            }
                                            boolean z17 = z15;
                                            int i47 = 0;
                                            while (true) {
                                                long j20 = jArr12[i47];
                                                if ((((~j20) << 7) & j20 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i48 = 8 - ((~(i47 - length8)) >>> 31);
                                                    long j21 = j20;
                                                    for (int i49 = 0; i49 < i48; i49++) {
                                                        if ((j21 & 255) < 128) {
                                                            j0Var.a(objArr13[(i47 << 3) + i49]);
                                                            z17 = true;
                                                        }
                                                        j21 >>= 8;
                                                    }
                                                    if (i48 != 8) {
                                                        z11 = z17;
                                                        break;
                                                    }
                                                }
                                                if (i47 == length8) {
                                                    z15 = z17;
                                                    z11 = z15;
                                                    break;
                                                }
                                                i47++;
                                            }
                                        } else {
                                            j0Var.a(objG7);
                                            z11 = true;
                                        }
                                        z15 = z11;
                                    }
                                }
                                i10 = 0;
                                tVar.f17062j = false;
                            } catch (Throwable th4) {
                                tVar.f17062j = false;
                                throw th4;
                            }
                        } else {
                            i0Var8 = i0Var9;
                            it = it3;
                            obj = next;
                            str = str3;
                            map = map2;
                            i10 = 0;
                        }
                    }
                    boolean z18 = z15;
                    Object objG8 = i0Var6.g(obj);
                    if (objG8 != null) {
                        if (objG8 instanceof j0) {
                            j0 j0Var10 = (j0) objG8;
                            Object[] objArr14 = j0Var10.f14865b;
                            long[] jArr13 = j0Var10.f14864a;
                            int length9 = jArr13.length - 2;
                            if (length9 >= 0) {
                                int i50 = i10;
                                while (true) {
                                    long j22 = jArr13[i50];
                                    if ((((~j22) << 7) & j22 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i50 != length9) {
                                            break;
                                            break;
                                        }
                                        i50++;
                                    } else {
                                        int i51 = 8 - ((~(i50 - length9)) >>> 31);
                                        for (int i52 = i10; i52 < i51; i52++) {
                                            if ((j22 & 255) < 128) {
                                                j0Var.a(objArr14[(i50 << 3) + i52]);
                                                z18 = true;
                                            }
                                            j22 >>= 8;
                                        }
                                        if (i51 != 8) {
                                            break;
                                        }
                                        if (i50 != length9) {
                                            break;
                                        }
                                        i50++;
                                    }
                                }
                            }
                        } else {
                            j0Var.a(objG8);
                            z18 = true;
                        }
                    }
                    z15 = z18;
                } else {
                    it = it3;
                    str = str3;
                    map = map2;
                }
                it3 = it;
                map2 = map;
                str3 = str;
            }
            z10 = z15;
        }
        int i53 = 0;
        if (!tVar.f17062j && (i12 = eVar.C) != 0) {
            Object[] objArr15 = eVar.A;
            int i54 = 0;
            while (i54 < i12) {
                l1.w wVar5 = (l1.w) objArr15[i54];
                int iHashCode = Long.hashCode(l.j().g());
                Object objG9 = i0Var6.g(wVar5);
                if (objG9 != null) {
                    boolean z19 = objG9 instanceof j0;
                    i0 i0Var10 = tVar.f17058f;
                    if (z19) {
                        j0 j0Var11 = (j0) objG9;
                        Object[] objArr16 = j0Var11.f14865b;
                        long[] jArr14 = j0Var11.f14864a;
                        int length10 = jArr14.length - 2;
                        if (length10 >= 0) {
                            int i55 = i53;
                            while (true) {
                                long j23 = jArr14[i55];
                                i14 = i54;
                                if ((((~j23) << 7) & j23 & j9) != j9) {
                                    int i56 = 8 - ((~(i55 - length10)) >>> 31);
                                    int i57 = 0;
                                    while (i57 < i56) {
                                        if ((j23 & 255) < 128) {
                                            Object obj8 = objArr16[(i55 << 3) + i57];
                                            u.c0 c0Var2 = (u.c0) i0Var10.g(obj8);
                                            if (c0Var2 == null) {
                                                c0Var = new u.c0();
                                                i0Var10.m(obj8, c0Var);
                                            } else {
                                                c0Var = c0Var2;
                                            }
                                            tVar.b(wVar5, iHashCode, obj8, c0Var);
                                        }
                                        j23 >>= 8;
                                        i57++;
                                        i12 = i12;
                                        objArr15 = objArr15;
                                    }
                                    i13 = i12;
                                    objArr = objArr15;
                                    if (i56 != 8) {
                                        break;
                                    }
                                } else {
                                    i13 = i12;
                                    objArr = objArr15;
                                }
                                if (i55 == length10) {
                                    break;
                                }
                                i55++;
                                i54 = i14;
                                i12 = i13;
                                objArr15 = objArr;
                            }
                        } else {
                            i13 = i12;
                            objArr = objArr15;
                            i14 = i54;
                        }
                    } else {
                        i13 = i12;
                        objArr = objArr15;
                        i14 = i54;
                        u.c0 c0Var3 = (u.c0) i0Var10.g(objG9);
                        if (c0Var3 == null) {
                            c0Var3 = new u.c0();
                            i0Var10.m(objG9, c0Var3);
                        }
                        tVar.b(wVar5, iHashCode, objG9, c0Var3);
                    }
                } else {
                    i13 = i12;
                    objArr = objArr15;
                    i14 = i54;
                }
                i54 = i14 + 1;
                i12 = i13;
                objArr15 = objArr;
                i53 = 0;
            }
            eVar.g();
        }
        return z10;
    }

    public final void b(Object obj, int i10, Object obj2, u.c0 c0Var) {
        int i11;
        if (this.f17063k > 0) {
            return;
        }
        int iC = c0Var.c(obj);
        if (iC < 0) {
            iC = ~iC;
            i11 = -1;
        } else {
            i11 = c0Var.f14833c[iC];
        }
        c0Var.f14832b[iC] = obj;
        c0Var.f14833c[iC] = i10;
        if ((obj instanceof l1.w) && i11 != i10) {
            l1.v vVarI = ((l1.w) obj).i();
            this.m.put(obj, vVarI.f9946f);
            u.c0 c0Var2 = vVarI.f9945e;
            i0 i0Var = this.l;
            va.a.c0(i0Var, obj);
            Object[] objArr = c0Var2.f14832b;
            long[] jArr = c0Var2.f14831a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j9 = jArr[i12];
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i12 != length) {
                            break;
                            break;
                        }
                        i12++;
                    } else {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        for (int i14 = 0; i14 < i13; i14++) {
                            if ((j9 & 255) < 128) {
                                z zVar = (z) objArr[(i12 << 3) + i14];
                                if (zVar instanceof a0) {
                                    ((a0) zVar).g(2);
                                }
                                va.a.g(i0Var, zVar, obj);
                            }
                            j9 >>= 8;
                        }
                        if (i13 != 8) {
                            break;
                        } else if (i12 != length) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            }
        }
        if (i11 == -1) {
            if (obj instanceof a0) {
                ((a0) obj).g(2);
            }
            va.a.g(this.f17057e, obj, obj2);
        }
    }

    public final void c(Object obj, Object obj2) {
        i0 i0Var = this.f17057e;
        va.a.b0(i0Var, obj2, obj);
        if (!(obj2 instanceof l1.w) || i0Var.c(obj2)) {
            return;
        }
        va.a.c0(this.l, obj2);
        this.m.remove(obj2);
    }

    public final void d() {
        long[] jArr;
        long[] jArr2;
        long j9;
        char c10;
        long j10;
        int i10;
        boolean z10;
        i0 i0Var = this.f17058f;
        long[] jArr3 = i0Var.f14856a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr3[i11];
            char c11 = 7;
            long j12 = -9187201950435737472L;
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((j11 & 255) < 128) {
                        int i15 = (i11 << 3) + i14;
                        c10 = c11;
                        Object obj = i0Var.f14857b[i15];
                        j10 = j12;
                        u.c0 c0Var = (u.c0) i0Var.f14858c[i15];
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                        boolean zU = ((a2) obj).u();
                        if (zU) {
                            jArr2 = jArr3;
                            j9 = j11;
                            z10 = zU;
                        } else {
                            Object[] objArr = c0Var.f14832b;
                            int[] iArr = c0Var.f14833c;
                            long[] jArr4 = c0Var.f14831a;
                            int i16 = i12;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j9 = j11;
                                int i17 = 0;
                                while (true) {
                                    long j13 = jArr4[i17];
                                    long[] jArr5 = jArr4;
                                    z10 = zU;
                                    if ((((~j13) << c10) & j13 & j10) == j10) {
                                        if (i17 != length2) {
                                            break;
                                            break;
                                        }
                                        i17++;
                                        zU = z10;
                                        jArr4 = jArr5;
                                        i16 = 8;
                                    } else {
                                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                        for (int i19 = 0; i19 < i18; i19++) {
                                            if ((j13 & 255) < 128) {
                                                int i20 = (i17 << 3) + i19;
                                                Object obj2 = objArr[i20];
                                                int i21 = iArr[i20];
                                                c(obj, obj2);
                                            }
                                            j13 >>= i16;
                                        }
                                        if (i18 != i16) {
                                            break;
                                        }
                                        if (i17 != length2) {
                                            break;
                                        }
                                        i17++;
                                        zU = z10;
                                        jArr4 = jArr5;
                                        i16 = 8;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                j9 = j11;
                                z10 = zU;
                            }
                        }
                        if (!z10) {
                            i0Var.l(i15);
                        }
                        i10 = 8;
                    } else {
                        jArr2 = jArr3;
                        j9 = j11;
                        c10 = c11;
                        j10 = j12;
                        i10 = i12;
                    }
                    i14++;
                    i12 = i10;
                    j11 = j9 >> i10;
                    c11 = c10;
                    j12 = j10;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i13 != i12) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i11 == length) {
                return;
            }
            i11++;
            jArr3 = jArr;
        }
    }
}
