package hv;

import android.content.res.Configuration;
import as.d0;
import as.f0;
import bv.o1;
import c3.o0;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import g00.b0;
import h0.a0;
import h0.z1;
import java.util.Locale;
import l1.g0;
import l1.m1;
import l1.r1;
import l1.z0;
import w.c0;
import w.s0;
import z2.w0;

public abstract class n {
    public static final float a = 12;
    public static final float b = 28;
    public static final float c = 48;

    public static final void a(final o1 uiState, final u00.k onAction, final jk.a backdrop, final long j, final b2.r rVar, boolean z, float f, Object obj, float f2, float f3, float f4, l1.j jVar, final int i, final int i2) {
        int i3;
        boolean z2;
        float f5;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        final Object obj2;
        final float f6;
        final boolean z3;
        final float f7;
        final float f8;
        final float f9;
        r1 r1VarT;
        boolean z4;
        float f11;
        String lowerCase;
        Object obj3;
        float f12;
        float f13;
        float f14;
        boolean z5;
        boolean z6;
        String str;
        boolean zA;
        PlayerItem playerItem;
        int surahNumber;
        Integer num;
        int i12;
        final y3.c cVar;
        Object objN;
        Object obj4;
        float f15;
        float fA0;
        float f16;
        Object obj5;
        float fA1;
        float fA2;
        boolean zG;
        float f17;
        Object objN2;
        u30.f fVar;
        boolean zG2;
        Object objN3;
        u30.f fVar2;
        boolean z7;
        a0 a0Var;
        b3.g gVar;
        int i13;
        int i14;
        boolean z8;
        Object objN4;
        boolean z9;
        Object objN5;
        boolean z11;
        Object objN6;
        boolean z12;
        Object objN7;
        int iIntValue;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        boolean z13 = uiState.Q;
        u30.f fVar3 = uiState.J;
        u30.f fVar4 = uiState.G;
        rt.g gVar2 = uiState.O;
        kotlin.jvm.internal.m.e(onAction, "onAction");
        kotlin.jvm.internal.m.e(backdrop, "backdrop");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1383333433);
        if ((i & 6) == 0) {
            i3 = (g0Var.g(uiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= g0Var.i(onAction) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= g0Var.i(backdrop) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= g0Var.f(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= g0Var.g(rVar) ? 16384 : 8192;
        }
        int i15 = i2 & 32;
        if (i15 != 0) {
            i3 |= 196608;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 196608) == 0) {
                i3 |= g0Var.h(z2) ? 131072 : 65536;
            }
        }
        int i16 = i2 & 64;
        if (i16 != 0) {
            i3 |= 1572864;
            f5 = f;
        } else {
            f5 = f;
            if ((i & 1572864) == 0) {
                i3 |= g0Var.d(f5) ? 1048576 : 524288;
            }
        }
        int i17 = i2 & 128;
        if (i17 == 0) {
            if ((i & 12582912) == 0) {
                i3 |= g0Var.i(obj) ? 8388608 : 4194304;
            }
            i4 = i2 & 256;
            if (i4 != 0) {
                if ((i & 100663296) == 0) {
                    if (g0Var.d(f2)) {
                        i5 = 67108864;
                    } else {
                        i5 = 33554432;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 512;
                if (i6 != 0) {
                    if ((i & 805306368) == 0) {
                        if (g0Var.d(f3)) {
                            i7 = 536870912;
                        } else {
                            i7 = 268435456;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 1024;
                    if (i8 != 0) {
                        i11 = 6;
                        i9 = i8;
                    } else {
                        i9 = i8;
                        if (g0Var.d(f4)) {
                            i11 = 4;
                        } else {
                            i11 = 2;
                        }
                    }
                    if (g0Var.S(i3 & 1, (i3 & 306783379) == 306783378 || (i11 & 3) != 2)) {
                        if (i15 != 0) {
                            z4 = true;
                        } else {
                            z4 = z2;
                        }
                        if (i16 != 0) {
                            f11 = 0;
                        } else {
                            f11 = f5;
                        }
                        lowerCase = null;
                        if (i17 != 0) {
                            obj3 = null;
                        } else {
                            obj3 = obj;
                        }
                        if (i4 != 0) {
                            f12 = Float.NaN;
                        } else {
                            f12 = f2;
                        }
                        if (i6 != 0) {
                            f13 = 0;
                        } else {
                            f13 = f3;
                        }
                        if (i9 != 0) {
                            f14 = 0;
                        } else {
                            f14 = f4;
                        }
                        if (uiState.D || uiState.E.isEmpty()) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (z5 || ((uiState.H.b && !uiState.K) || !gVar2.c)) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        str = uiState.L;
                        if (str != null) {
                            lowerCase = str.toLowerCase(Locale.ROOT);
                            kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                        }
                        zA = kotlin.jvm.internal.m.a(lowerCase, "ar");
                        playerItem = uiState.f;
                        if (playerItem != null) {
                            surahNumber = playerItem.getSurahNumber();
                        } else {
                            surahNumber = 1;
                        }
                        num = uiState.F;
                        if (num != null) {
                            iIntValue = num.intValue();
                            if (iIntValue < 1) {
                                iIntValue = 1;
                            }
                            i12 = iIntValue;
                        } else {
                            i12 = 1;
                        }
                        cVar = (y3.c) g0Var.k(c3.o1.h);
                        objN = g0Var.N();
                        obj4 = l1.i.a;
                        if (objN == obj4) {
                            objN = x5.s(0, g0Var);
                        }
                        final z0 z0Var = (z0) objN;
                        float f18 = ((y3.f) z0Var.getValue()).A + a;
                        float f19 = b;
                        f15 = f18 + f19;
                        if (z4) {
                            fA0 = cVar.A0(f15);
                        } else {
                            fA0 = 0.0f;
                        }
                        f16 = c;
                        if (z4) {
                            f16 = p30.f.i0(new y3.f(f16), new y3.f(f15)).A;
                        }
                        obj5 = obj3;
                        fA1 = cVar.A0(f11);
                        fA2 = cVar.A0(f19);
                        zG = g0Var.g(fVar4);
                        f17 = f11;
                        objN2 = g0Var.N();
                        if (zG || objN2 == obj4) {
                            objN2 = g4.e0(fVar4);
                            g0Var.n0(objN2);
                        }
                        fVar = (u30.f) objN2;
                        zG2 = g0Var.g(fVar3);
                        objN3 = g0Var.N();
                        if (zG2 || objN3 == obj4) {
                            objN3 = g4.e0(fVar3);
                            g0Var.n0(objN3);
                        }
                        fVar2 = (u30.f) objN3;
                        if (z4 || (z13 && uiState.x)) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        a0Var = z1.c;
                        b2.r rVarV = rVar.V(a0Var);
                        w0 w0VarD = h0.o.d(b2.b.I, false);
                        int iHashCode = Long.hashCode(g0Var.T);
                        m1 m1VarM = g0Var.m();
                        b2.r rVarC = b2.a.c(rVarV, g0Var);
                        b3.i.c.getClass();
                        gVar = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(w0VarD, g0Var, b3.h.f);
                        l1.q.I(m1VarM, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC, g0Var, b3.h.d);
                        if (z13 != 0) {
                            g0Var.c0(-1195387091);
                            u30.b bVar = uiState.E;
                            Integer num2 = uiState.F;
                            u30.f fVar5 = gVar2.b;
                            ot.b bVar2 = uiState.H;
                            int i18 = uiState.P;
                            if (!z7) {
                                f15 = 0;
                            }
                            float f21 = f15;
                            boolean z14 = uiState.c0;
                            i14 = i3 & 112;
                            if (i14 == 32) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            objN4 = g0Var.N();
                            if (z8 || objN4 == obj4) {
                                objN4 = new d0(29, onAction);
                                g0Var.n0(objN4);
                            }
                            u00.k kVar = (u00.k) objN4;
                            if (i14 == 32) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objN5 = g0Var.N();
                            if (z9 || objN5 == obj4) {
                                objN5 = new gv.a0(12, onAction);
                                g0Var.n0(objN5);
                            }
                            u00.a aVar = (u00.a) objN5;
                            if (i14 == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objN6 = g0Var.N();
                            if (z11 || objN6 == obj4) {
                                objN6 = new gv.a0(13, onAction);
                                g0Var.n0(objN6);
                            }
                            u00.a aVar2 = (u00.a) objN6;
                            if (i14 == 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            objN7 = g0Var.N();
                            if (z12 || objN7 == obj4) {
                                objN7 = new j(1, onAction);
                                g0Var.n0(objN7);
                            }
                            g.b(bVar, num2, surahNumber, fVar, fVar5, fVar2, z5, z6, bVar2, zA, i18, kVar, a0Var, f21, f17, f13, f14, aVar, aVar2, (u00.k) objN7, f12, z14, g0Var, 0, ((i3 >> 6) & 57344) | 384 | ((i3 >> 12) & 458752) | ((i11 << 18) & 3670016), (i3 >> 24) & 14);
                            g0Var.r(false);
                            obj2 = obj5;
                            i13 = 2;
                        } else {
                            g0Var.c0(-1193914095);
                            float f22 = f16;
                            i13 = 2;
                            b(uiState, onAction, fVar, fVar2, z5, z6, zA, surahNumber, obj5, fA0, fA1, fA2, f22, g0Var, (i3 & 126) | (234881024 & (i3 << 3)));
                            obj2 = obj5;
                            g0Var.r(false);
                        }
                        final int i19 = surahNumber;
                        final int i21 = i12;
                        c0.c(z7, h0.s.a.a(b2.o.A, b2.b.B), s0.c(gv.p.J(), i13), s0.d(gv.p.J(), i13), (String) null, v1.d.d(-433660009, new u00.o() {
                            @Override
                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                w.d0 AnimatedVisibility = (w.d0) obj6;
                                g0 g0Var2 = (l1.j) obj7;
                                ((Integer) obj8).getClass();
                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                b2.r rVarD = z1.d(b2.o.A, 1.0f);
                                g0 g0Var3 = g0Var2;
                                y3.c cVar2 = cVar;
                                boolean zG3 = g0Var3.g(cVar2);
                                Object objN8 = g0Var3.N();
                                Object obj9 = l1.i.a;
                                if (zG3 || objN8 == obj9) {
                                    objN8 = new f0(cVar2, z0Var, 10);
                                    g0Var3.n0(objN8);
                                }
                                b2.r rVarO = z2.d0.o(rVarD, (u00.k) objN8);
                                h0.b bVar3 = h0.i.b;
                                u00.k kVar2 = onAction;
                                boolean zG4 = g0Var3.g(kVar2);
                                Object objN9 = g0Var3.N();
                                if (zG4 || objN9 == obj9) {
                                    objN9 = new gv.a0(14, kVar2);
                                    g0Var3.n0(objN9);
                                }
                                g4.h(i19, i21, backdrop, (u00.a) objN9, (u00.a) null, j, rVarO, bVar3, g0Var2, 12607488, 0);
                                return b0.a;
                            }
                        }, g0Var), g0Var, 196608, 16);
                        g0Var = g0Var;
                        g0Var.r(true);
                        f7 = f17;
                        f9 = f13;
                        f6 = f14;
                        f8 = f12;
                        z3 = z4;
                    } else {
                        g0Var.V();
                        obj2 = obj;
                        f6 = f4;
                        z3 = z2;
                        f7 = f5;
                        f8 = f2;
                        f9 = f3;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.d = new u00.n() {
                            @Override
                            public final Object invoke(Object obj6, Object obj7) {
                                ((Integer) obj7).getClass();
                                int iK = l1.q.K(i | 1);
                                n.a(uiState, onAction, backdrop, j, rVar, z3, f7, obj2, f8, f9, f6, (l1.j) obj6, iK, i2);
                                return b0.a;
                            }
                        };
                    }
                }
                i3 |= 805306368;
                i8 = i2 & 1024;
                if (i8 != 0) {
                    i11 = 6;
                    i9 = i8;
                } else {
                    i9 = i8;
                    if (g0Var.d(f4)) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                }
                if (g0Var.S(i3 & 1, (i3 & 306783379) == 306783378 || (i11 & 3) != 2)) {
                    if (i15 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i16 != 0) {
                        f11 = 0;
                    } else {
                        f11 = f5;
                    }
                    lowerCase = null;
                    if (i17 != 0) {
                        obj3 = null;
                    } else {
                        obj3 = obj;
                    }
                    if (i4 != 0) {
                        f12 = Float.NaN;
                    } else {
                        f12 = f2;
                    }
                    if (i6 != 0) {
                        f13 = 0;
                    } else {
                        f13 = f3;
                    }
                    if (i9 != 0) {
                        f14 = 0;
                    } else {
                        f14 = f4;
                    }
                    if (uiState.D) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    str = uiState.L;
                    if (str != null) {
                        lowerCase = str.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                    }
                    zA = kotlin.jvm.internal.m.a(lowerCase, "ar");
                    playerItem = uiState.f;
                    if (playerItem != null) {
                        surahNumber = playerItem.getSurahNumber();
                    } else {
                        surahNumber = 1;
                    }
                    num = uiState.F;
                    if (num != null) {
                        iIntValue = num.intValue();
                        if (iIntValue < 1) {
                            iIntValue = 1;
                        }
                        i12 = iIntValue;
                    } else {
                        i12 = 1;
                    }
                    cVar = (y3.c) g0Var.k(c3.o1.h);
                    objN = g0Var.N();
                    obj4 = l1.i.a;
                    if (objN == obj4) {
                        objN = x5.s(0, g0Var);
                    }
                    final z0 z0Var2 = (z0) objN;
                    float f110 = ((y3.f) z0Var2.getValue()).A + a;
                    float f111 = b;
                    f15 = f110 + f111;
                    if (z4) {
                        fA0 = cVar.A0(f15);
                    } else {
                        fA0 = 0.0f;
                    }
                    f16 = c;
                    if (z4) {
                        f16 = p30.f.i0(new y3.f(f16), new y3.f(f15)).A;
                    }
                    obj5 = obj3;
                    fA1 = cVar.A0(f11);
                    fA2 = cVar.A0(f111);
                    zG = g0Var.g(fVar4);
                    f17 = f11;
                    objN2 = g0Var.N();
                    if (zG) {
                        objN2 = g4.e0(fVar4);
                        g0Var.n0(objN2);
                    } else {
                        objN2 = g4.e0(fVar4);
                        g0Var.n0(objN2);
                    }
                    fVar = (u30.f) objN2;
                    zG2 = g0Var.g(fVar3);
                    objN3 = g0Var.N();
                    if (zG2) {
                        objN3 = g4.e0(fVar3);
                        g0Var.n0(objN3);
                    } else {
                        objN3 = g4.e0(fVar3);
                        g0Var.n0(objN3);
                    }
                    fVar2 = (u30.f) objN3;
                    if (z4) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    a0Var = z1.c;
                    b2.r rVarV2 = rVar.V(a0Var);
                    w0 w0VarD2 = h0.o.d(b2.b.I, false);
                    int iHashCode2 = Long.hashCode(g0Var.T);
                    m1 m1VarM2 = g0Var.m();
                    b2.r rVarC2 = b2.a.c(rVarV2, g0Var);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0VarD2, g0Var, b3.h.f);
                    l1.q.I(m1VarM2, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC2, g0Var, b3.h.d);
                    if (z13 != 0) {
                        g0Var.c0(-1195387091);
                        u30.b bVar3 = uiState.E;
                        Integer num3 = uiState.F;
                        u30.f fVar6 = gVar2.b;
                        ot.b bVar4 = uiState.H;
                        int i110 = uiState.P;
                        if (!z7) {
                            f15 = 0;
                        }
                        float f23 = f15;
                        boolean z15 = uiState.c0;
                        i14 = i3 & 112;
                        if (i14 == 32) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        objN4 = g0Var.N();
                        if (z8) {
                            objN4 = new d0(29, onAction);
                            g0Var.n0(objN4);
                        } else {
                            objN4 = new d0(29, onAction);
                            g0Var.n0(objN4);
                        }
                        u00.k kVar2 = (u00.k) objN4;
                        if (i14 == 32) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objN5 = g0Var.N();
                        if (z9) {
                            objN5 = new gv.a0(12, onAction);
                            g0Var.n0(objN5);
                        } else {
                            objN5 = new gv.a0(12, onAction);
                            g0Var.n0(objN5);
                        }
                        u00.a aVar3 = (u00.a) objN5;
                        if (i14 == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objN6 = g0Var.N();
                        if (z11) {
                            objN6 = new gv.a0(13, onAction);
                            g0Var.n0(objN6);
                        } else {
                            objN6 = new gv.a0(13, onAction);
                            g0Var.n0(objN6);
                        }
                        u00.a aVar4 = (u00.a) objN6;
                        if (i14 == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objN7 = g0Var.N();
                        if (z12) {
                            objN7 = new j(1, onAction);
                            g0Var.n0(objN7);
                        } else {
                            objN7 = new j(1, onAction);
                            g0Var.n0(objN7);
                        }
                        g.b(bVar3, num3, surahNumber, fVar, fVar6, fVar2, z5, z6, bVar4, zA, i110, kVar2, a0Var, f23, f17, f13, f14, aVar3, aVar4, (u00.k) objN7, f12, z15, g0Var, 0, ((i3 >> 6) & 57344) | 384 | ((i3 >> 12) & 458752) | ((i11 << 18) & 3670016), (i3 >> 24) & 14);
                        g0Var.r(false);
                        obj2 = obj5;
                        i13 = 2;
                    } else {
                        g0Var.c0(-1193914095);
                        float f24 = f16;
                        i13 = 2;
                        b(uiState, onAction, fVar, fVar2, z5, z6, zA, surahNumber, obj5, fA0, fA1, fA2, f24, g0Var, (i3 & 126) | (234881024 & (i3 << 3)));
                        obj2 = obj5;
                        g0Var.r(false);
                    }
                    final int i111 = surahNumber;
                    final int i22 = i12;
                    c0.c(z7, h0.s.a.a(b2.o.A, b2.b.B), s0.c(gv.p.J(), i13), s0.d(gv.p.J(), i13), (String) null, v1.d.d(-433660009, new u00.o() {
                        @Override
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            w.d0 AnimatedVisibility = (w.d0) obj6;
                            g0 g0Var2 = (l1.j) obj7;
                            ((Integer) obj8).getClass();
                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                            b2.r rVarD = z1.d(b2.o.A, 1.0f);
                            g0 g0Var3 = g0Var2;
                            y3.c cVar2 = cVar;
                            boolean zG3 = g0Var3.g(cVar2);
                            Object objN8 = g0Var3.N();
                            Object obj9 = l1.i.a;
                            if (zG3 || objN8 == obj9) {
                                objN8 = new f0(cVar2, z0Var2, 10);
                                g0Var3.n0(objN8);
                            }
                            b2.r rVarO = z2.d0.o(rVarD, (u00.k) objN8);
                            h0.b bVar5 = h0.i.b;
                            u00.k kVar3 = onAction;
                            boolean zG4 = g0Var3.g(kVar3);
                            Object objN9 = g0Var3.N();
                            if (zG4 || objN9 == obj9) {
                                objN9 = new gv.a0(14, kVar3);
                                g0Var3.n0(objN9);
                            }
                            g4.h(i111, i22, backdrop, (u00.a) objN9, (u00.a) null, j, rVarO, bVar5, g0Var2, 12607488, 0);
                            return b0.a;
                        }
                    }, g0Var), g0Var, 196608, 16);
                    g0Var = g0Var;
                    g0Var.r(true);
                    f7 = f17;
                    f9 = f13;
                    f6 = f14;
                    f8 = f12;
                    z3 = z4;
                } else {
                    g0Var.V();
                    obj2 = obj;
                    f6 = f4;
                    z3 = z2;
                    f7 = f5;
                    f8 = f2;
                    f9 = f3;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj6, Object obj7) {
                            ((Integer) obj7).getClass();
                            int iK = l1.q.K(i | 1);
                            n.a(uiState, onAction, backdrop, j, rVar, z3, f7, obj2, f8, f9, f6, (l1.j) obj6, iK, i2);
                            return b0.a;
                        }
                    };
                }
            }
            i3 |= 100663296;
            i6 = i2 & 512;
            if (i6 != 0) {
                if ((i & 805306368) == 0) {
                    if (g0Var.d(f3)) {
                        i7 = 536870912;
                    } else {
                        i7 = 268435456;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 1024;
                if (i8 != 0) {
                    i11 = 6;
                    i9 = i8;
                } else {
                    i9 = i8;
                    if (g0Var.d(f4)) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                }
                if (g0Var.S(i3 & 1, (i3 & 306783379) == 306783378 || (i11 & 3) != 2)) {
                    if (i15 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i16 != 0) {
                        f11 = 0;
                    } else {
                        f11 = f5;
                    }
                    lowerCase = null;
                    if (i17 != 0) {
                        obj3 = null;
                    } else {
                        obj3 = obj;
                    }
                    if (i4 != 0) {
                        f12 = Float.NaN;
                    } else {
                        f12 = f2;
                    }
                    if (i6 != 0) {
                        f13 = 0;
                    } else {
                        f13 = f3;
                    }
                    if (i9 != 0) {
                        f14 = 0;
                    } else {
                        f14 = f4;
                    }
                    if (uiState.D) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    str = uiState.L;
                    if (str != null) {
                        lowerCase = str.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                    }
                    zA = kotlin.jvm.internal.m.a(lowerCase, "ar");
                    playerItem = uiState.f;
                    if (playerItem != null) {
                        surahNumber = playerItem.getSurahNumber();
                    } else {
                        surahNumber = 1;
                    }
                    num = uiState.F;
                    if (num != null) {
                        iIntValue = num.intValue();
                        if (iIntValue < 1) {
                            iIntValue = 1;
                        }
                        i12 = iIntValue;
                    } else {
                        i12 = 1;
                    }
                    cVar = (y3.c) g0Var.k(c3.o1.h);
                    objN = g0Var.N();
                    obj4 = l1.i.a;
                    if (objN == obj4) {
                        objN = x5.s(0, g0Var);
                    }
                    final z0 z0Var3 = (z0) objN;
                    float f112 = ((y3.f) z0Var3.getValue()).A + a;
                    float f113 = b;
                    f15 = f112 + f113;
                    if (z4) {
                        fA0 = cVar.A0(f15);
                    } else {
                        fA0 = 0.0f;
                    }
                    f16 = c;
                    if (z4) {
                        f16 = p30.f.i0(new y3.f(f16), new y3.f(f15)).A;
                    }
                    obj5 = obj3;
                    fA1 = cVar.A0(f11);
                    fA2 = cVar.A0(f113);
                    zG = g0Var.g(fVar4);
                    f17 = f11;
                    objN2 = g0Var.N();
                    if (zG) {
                        objN2 = g4.e0(fVar4);
                        g0Var.n0(objN2);
                    } else {
                        objN2 = g4.e0(fVar4);
                        g0Var.n0(objN2);
                    }
                    fVar = (u30.f) objN2;
                    zG2 = g0Var.g(fVar3);
                    objN3 = g0Var.N();
                    if (zG2) {
                        objN3 = g4.e0(fVar3);
                        g0Var.n0(objN3);
                    } else {
                        objN3 = g4.e0(fVar3);
                        g0Var.n0(objN3);
                    }
                    fVar2 = (u30.f) objN3;
                    if (z4) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    a0Var = z1.c;
                    b2.r rVarV3 = rVar.V(a0Var);
                    w0 w0VarD3 = h0.o.d(b2.b.I, false);
                    int iHashCode3 = Long.hashCode(g0Var.T);
                    m1 m1VarM3 = g0Var.m();
                    b2.r rVarC3 = b2.a.c(rVarV3, g0Var);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0VarD3, g0Var, b3.h.f);
                    l1.q.I(m1VarM3, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode3), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC3, g0Var, b3.h.d);
                    if (z13 != 0) {
                        g0Var.c0(-1195387091);
                        u30.b bVar5 = uiState.E;
                        Integer num4 = uiState.F;
                        u30.f fVar7 = gVar2.b;
                        ot.b bVar6 = uiState.H;
                        int i112 = uiState.P;
                        if (!z7) {
                            f15 = 0;
                        }
                        float f25 = f15;
                        boolean z16 = uiState.c0;
                        i14 = i3 & 112;
                        if (i14 == 32) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        objN4 = g0Var.N();
                        if (z8) {
                            objN4 = new d0(29, onAction);
                            g0Var.n0(objN4);
                        } else {
                            objN4 = new d0(29, onAction);
                            g0Var.n0(objN4);
                        }
                        u00.k kVar3 = (u00.k) objN4;
                        if (i14 == 32) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objN5 = g0Var.N();
                        if (z9) {
                            objN5 = new gv.a0(12, onAction);
                            g0Var.n0(objN5);
                        } else {
                            objN5 = new gv.a0(12, onAction);
                            g0Var.n0(objN5);
                        }
                        u00.a aVar5 = (u00.a) objN5;
                        if (i14 == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objN6 = g0Var.N();
                        if (z11) {
                            objN6 = new gv.a0(13, onAction);
                            g0Var.n0(objN6);
                        } else {
                            objN6 = new gv.a0(13, onAction);
                            g0Var.n0(objN6);
                        }
                        u00.a aVar6 = (u00.a) objN6;
                        if (i14 == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objN7 = g0Var.N();
                        if (z12) {
                            objN7 = new j(1, onAction);
                            g0Var.n0(objN7);
                        } else {
                            objN7 = new j(1, onAction);
                            g0Var.n0(objN7);
                        }
                        g.b(bVar5, num4, surahNumber, fVar, fVar7, fVar2, z5, z6, bVar6, zA, i112, kVar3, a0Var, f25, f17, f13, f14, aVar5, aVar6, (u00.k) objN7, f12, z16, g0Var, 0, ((i3 >> 6) & 57344) | 384 | ((i3 >> 12) & 458752) | ((i11 << 18) & 3670016), (i3 >> 24) & 14);
                        g0Var.r(false);
                        obj2 = obj5;
                        i13 = 2;
                    } else {
                        g0Var.c0(-1193914095);
                        float f26 = f16;
                        i13 = 2;
                        b(uiState, onAction, fVar, fVar2, z5, z6, zA, surahNumber, obj5, fA0, fA1, fA2, f26, g0Var, (i3 & 126) | (234881024 & (i3 << 3)));
                        obj2 = obj5;
                        g0Var.r(false);
                    }
                    final int i113 = surahNumber;
                    final int i23 = i12;
                    c0.c(z7, h0.s.a.a(b2.o.A, b2.b.B), s0.c(gv.p.J(), i13), s0.d(gv.p.J(), i13), (String) null, v1.d.d(-433660009, new u00.o() {
                        @Override
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            w.d0 AnimatedVisibility = (w.d0) obj6;
                            g0 g0Var2 = (l1.j) obj7;
                            ((Integer) obj8).getClass();
                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                            b2.r rVarD = z1.d(b2.o.A, 1.0f);
                            g0 g0Var3 = g0Var2;
                            y3.c cVar2 = cVar;
                            boolean zG3 = g0Var3.g(cVar2);
                            Object objN8 = g0Var3.N();
                            Object obj9 = l1.i.a;
                            if (zG3 || objN8 == obj9) {
                                objN8 = new f0(cVar2, z0Var3, 10);
                                g0Var3.n0(objN8);
                            }
                            b2.r rVarO = z2.d0.o(rVarD, (u00.k) objN8);
                            h0.b bVar7 = h0.i.b;
                            u00.k kVar4 = onAction;
                            boolean zG4 = g0Var3.g(kVar4);
                            Object objN9 = g0Var3.N();
                            if (zG4 || objN9 == obj9) {
                                objN9 = new gv.a0(14, kVar4);
                                g0Var3.n0(objN9);
                            }
                            g4.h(i113, i23, backdrop, (u00.a) objN9, (u00.a) null, j, rVarO, bVar7, g0Var2, 12607488, 0);
                            return b0.a;
                        }
                    }, g0Var), g0Var, 196608, 16);
                    g0Var = g0Var;
                    g0Var.r(true);
                    f7 = f17;
                    f9 = f13;
                    f6 = f14;
                    f8 = f12;
                    z3 = z4;
                } else {
                    g0Var.V();
                    obj2 = obj;
                    f6 = f4;
                    z3 = z2;
                    f7 = f5;
                    f8 = f2;
                    f9 = f3;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj6, Object obj7) {
                            ((Integer) obj7).getClass();
                            int iK = l1.q.K(i | 1);
                            n.a(uiState, onAction, backdrop, j, rVar, z3, f7, obj2, f8, f9, f6, (l1.j) obj6, iK, i2);
                            return b0.a;
                        }
                    };
                }
            }
            i3 |= 805306368;
            i8 = i2 & 1024;
            if (i8 != 0) {
                i11 = 6;
                i9 = i8;
            } else {
                i9 = i8;
                if (g0Var.d(f4)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
            }
            if (g0Var.S(i3 & 1, (i3 & 306783379) == 306783378 || (i11 & 3) != 2)) {
                if (i15 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i16 != 0) {
                    f11 = 0;
                } else {
                    f11 = f5;
                }
                lowerCase = null;
                if (i17 != 0) {
                    obj3 = null;
                } else {
                    obj3 = obj;
                }
                if (i4 != 0) {
                    f12 = Float.NaN;
                } else {
                    f12 = f2;
                }
                if (i6 != 0) {
                    f13 = 0;
                } else {
                    f13 = f3;
                }
                if (i9 != 0) {
                    f14 = 0;
                } else {
                    f14 = f4;
                }
                if (uiState.D) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                if (z5) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                str = uiState.L;
                if (str != null) {
                    lowerCase = str.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                }
                zA = kotlin.jvm.internal.m.a(lowerCase, "ar");
                playerItem = uiState.f;
                if (playerItem != null) {
                    surahNumber = playerItem.getSurahNumber();
                } else {
                    surahNumber = 1;
                }
                num = uiState.F;
                if (num != null) {
                    iIntValue = num.intValue();
                    if (iIntValue < 1) {
                        iIntValue = 1;
                    }
                    i12 = iIntValue;
                } else {
                    i12 = 1;
                }
                cVar = (y3.c) g0Var.k(c3.o1.h);
                objN = g0Var.N();
                obj4 = l1.i.a;
                if (objN == obj4) {
                    objN = x5.s(0, g0Var);
                }
                final z0 z0Var4 = (z0) objN;
                float f114 = ((y3.f) z0Var4.getValue()).A + a;
                float f115 = b;
                f15 = f114 + f115;
                if (z4) {
                    fA0 = cVar.A0(f15);
                } else {
                    fA0 = 0.0f;
                }
                f16 = c;
                if (z4) {
                    f16 = p30.f.i0(new y3.f(f16), new y3.f(f15)).A;
                }
                obj5 = obj3;
                fA1 = cVar.A0(f11);
                fA2 = cVar.A0(f115);
                zG = g0Var.g(fVar4);
                f17 = f11;
                objN2 = g0Var.N();
                if (zG) {
                    objN2 = g4.e0(fVar4);
                    g0Var.n0(objN2);
                } else {
                    objN2 = g4.e0(fVar4);
                    g0Var.n0(objN2);
                }
                fVar = (u30.f) objN2;
                zG2 = g0Var.g(fVar3);
                objN3 = g0Var.N();
                if (zG2) {
                    objN3 = g4.e0(fVar3);
                    g0Var.n0(objN3);
                } else {
                    objN3 = g4.e0(fVar3);
                    g0Var.n0(objN3);
                }
                fVar2 = (u30.f) objN3;
                if (z4) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                a0Var = z1.c;
                b2.r rVarV4 = rVar.V(a0Var);
                w0 w0VarD4 = h0.o.d(b2.b.I, false);
                int iHashCode4 = Long.hashCode(g0Var.T);
                m1 m1VarM4 = g0Var.m();
                b2.r rVarC4 = b2.a.c(rVarV4, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD4, g0Var, b3.h.f);
                l1.q.I(m1VarM4, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode4), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC4, g0Var, b3.h.d);
                if (z13 != 0) {
                    g0Var.c0(-1195387091);
                    u30.b bVar7 = uiState.E;
                    Integer num5 = uiState.F;
                    u30.f fVar8 = gVar2.b;
                    ot.b bVar8 = uiState.H;
                    int i114 = uiState.P;
                    if (!z7) {
                        f15 = 0;
                    }
                    float f27 = f15;
                    boolean z17 = uiState.c0;
                    i14 = i3 & 112;
                    if (i14 == 32) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    objN4 = g0Var.N();
                    if (z8) {
                        objN4 = new d0(29, onAction);
                        g0Var.n0(objN4);
                    } else {
                        objN4 = new d0(29, onAction);
                        g0Var.n0(objN4);
                    }
                    u00.k kVar4 = (u00.k) objN4;
                    if (i14 == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objN5 = g0Var.N();
                    if (z9) {
                        objN5 = new gv.a0(12, onAction);
                        g0Var.n0(objN5);
                    } else {
                        objN5 = new gv.a0(12, onAction);
                        g0Var.n0(objN5);
                    }
                    u00.a aVar7 = (u00.a) objN5;
                    if (i14 == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objN6 = g0Var.N();
                    if (z11) {
                        objN6 = new gv.a0(13, onAction);
                        g0Var.n0(objN6);
                    } else {
                        objN6 = new gv.a0(13, onAction);
                        g0Var.n0(objN6);
                    }
                    u00.a aVar8 = (u00.a) objN6;
                    if (i14 == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objN7 = g0Var.N();
                    if (z12) {
                        objN7 = new j(1, onAction);
                        g0Var.n0(objN7);
                    } else {
                        objN7 = new j(1, onAction);
                        g0Var.n0(objN7);
                    }
                    g.b(bVar7, num5, surahNumber, fVar, fVar8, fVar2, z5, z6, bVar8, zA, i114, kVar4, a0Var, f27, f17, f13, f14, aVar7, aVar8, (u00.k) objN7, f12, z17, g0Var, 0, ((i3 >> 6) & 57344) | 384 | ((i3 >> 12) & 458752) | ((i11 << 18) & 3670016), (i3 >> 24) & 14);
                    g0Var.r(false);
                    obj2 = obj5;
                    i13 = 2;
                } else {
                    g0Var.c0(-1193914095);
                    float f28 = f16;
                    i13 = 2;
                    b(uiState, onAction, fVar, fVar2, z5, z6, zA, surahNumber, obj5, fA0, fA1, fA2, f28, g0Var, (i3 & 126) | (234881024 & (i3 << 3)));
                    obj2 = obj5;
                    g0Var.r(false);
                }
                final int i115 = surahNumber;
                final int i24 = i12;
                c0.c(z7, h0.s.a.a(b2.o.A, b2.b.B), s0.c(gv.p.J(), i13), s0.d(gv.p.J(), i13), (String) null, v1.d.d(-433660009, new u00.o() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        w.d0 AnimatedVisibility = (w.d0) obj6;
                        g0 g0Var2 = (l1.j) obj7;
                        ((Integer) obj8).getClass();
                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                        b2.r rVarD = z1.d(b2.o.A, 1.0f);
                        g0 g0Var3 = g0Var2;
                        y3.c cVar2 = cVar;
                        boolean zG3 = g0Var3.g(cVar2);
                        Object objN8 = g0Var3.N();
                        Object obj9 = l1.i.a;
                        if (zG3 || objN8 == obj9) {
                            objN8 = new f0(cVar2, z0Var4, 10);
                            g0Var3.n0(objN8);
                        }
                        b2.r rVarO = z2.d0.o(rVarD, (u00.k) objN8);
                        h0.b bVar9 = h0.i.b;
                        u00.k kVar5 = onAction;
                        boolean zG4 = g0Var3.g(kVar5);
                        Object objN9 = g0Var3.N();
                        if (zG4 || objN9 == obj9) {
                            objN9 = new gv.a0(14, kVar5);
                            g0Var3.n0(objN9);
                        }
                        g4.h(i115, i24, backdrop, (u00.a) objN9, (u00.a) null, j, rVarO, bVar9, g0Var2, 12607488, 0);
                        return b0.a;
                    }
                }, g0Var), g0Var, 196608, 16);
                g0Var = g0Var;
                g0Var.r(true);
                f7 = f17;
                f9 = f13;
                f6 = f14;
                f8 = f12;
                z3 = z4;
            } else {
                g0Var.V();
                obj2 = obj;
                f6 = f4;
                z3 = z2;
                f7 = f5;
                f8 = f2;
                f9 = f3;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        ((Integer) obj7).getClass();
                        int iK = l1.q.K(i | 1);
                        n.a(uiState, onAction, backdrop, j, rVar, z3, f7, obj2, f8, f9, f6, (l1.j) obj6, iK, i2);
                        return b0.a;
                    }
                };
            }
        }
        i3 |= 12582912;
        i4 = i2 & 256;
        if (i4 != 0) {
            if ((i & 100663296) == 0) {
                if (g0Var.d(f2)) {
                    i5 = 67108864;
                } else {
                    i5 = 33554432;
                }
                i3 |= i5;
            }
            i6 = i2 & 512;
            if (i6 != 0) {
                if ((i & 805306368) == 0) {
                    if (g0Var.d(f3)) {
                        i7 = 536870912;
                    } else {
                        i7 = 268435456;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 1024;
                if (i8 != 0) {
                    i11 = 6;
                    i9 = i8;
                } else {
                    i9 = i8;
                    if (g0Var.d(f4)) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                }
                if (g0Var.S(i3 & 1, (i3 & 306783379) == 306783378 || (i11 & 3) != 2)) {
                    if (i15 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i16 != 0) {
                        f11 = 0;
                    } else {
                        f11 = f5;
                    }
                    lowerCase = null;
                    if (i17 != 0) {
                        obj3 = null;
                    } else {
                        obj3 = obj;
                    }
                    if (i4 != 0) {
                        f12 = Float.NaN;
                    } else {
                        f12 = f2;
                    }
                    if (i6 != 0) {
                        f13 = 0;
                    } else {
                        f13 = f3;
                    }
                    if (i9 != 0) {
                        f14 = 0;
                    } else {
                        f14 = f4;
                    }
                    if (uiState.D) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    str = uiState.L;
                    if (str != null) {
                        lowerCase = str.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                    }
                    zA = kotlin.jvm.internal.m.a(lowerCase, "ar");
                    playerItem = uiState.f;
                    if (playerItem != null) {
                        surahNumber = playerItem.getSurahNumber();
                    } else {
                        surahNumber = 1;
                    }
                    num = uiState.F;
                    if (num != null) {
                        iIntValue = num.intValue();
                        if (iIntValue < 1) {
                            iIntValue = 1;
                        }
                        i12 = iIntValue;
                    } else {
                        i12 = 1;
                    }
                    cVar = (y3.c) g0Var.k(c3.o1.h);
                    objN = g0Var.N();
                    obj4 = l1.i.a;
                    if (objN == obj4) {
                        objN = x5.s(0, g0Var);
                    }
                    final z0 z0Var5 = (z0) objN;
                    float f116 = ((y3.f) z0Var5.getValue()).A + a;
                    float f117 = b;
                    f15 = f116 + f117;
                    if (z4) {
                        fA0 = cVar.A0(f15);
                    } else {
                        fA0 = 0.0f;
                    }
                    f16 = c;
                    if (z4) {
                        f16 = p30.f.i0(new y3.f(f16), new y3.f(f15)).A;
                    }
                    obj5 = obj3;
                    fA1 = cVar.A0(f11);
                    fA2 = cVar.A0(f117);
                    zG = g0Var.g(fVar4);
                    f17 = f11;
                    objN2 = g0Var.N();
                    if (zG) {
                        objN2 = g4.e0(fVar4);
                        g0Var.n0(objN2);
                    } else {
                        objN2 = g4.e0(fVar4);
                        g0Var.n0(objN2);
                    }
                    fVar = (u30.f) objN2;
                    zG2 = g0Var.g(fVar3);
                    objN3 = g0Var.N();
                    if (zG2) {
                        objN3 = g4.e0(fVar3);
                        g0Var.n0(objN3);
                    } else {
                        objN3 = g4.e0(fVar3);
                        g0Var.n0(objN3);
                    }
                    fVar2 = (u30.f) objN3;
                    if (z4) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    a0Var = z1.c;
                    b2.r rVarV5 = rVar.V(a0Var);
                    w0 w0VarD5 = h0.o.d(b2.b.I, false);
                    int iHashCode5 = Long.hashCode(g0Var.T);
                    m1 m1VarM5 = g0Var.m();
                    b2.r rVarC5 = b2.a.c(rVarV5, g0Var);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0VarD5, g0Var, b3.h.f);
                    l1.q.I(m1VarM5, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode5), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC5, g0Var, b3.h.d);
                    if (z13 != 0) {
                        g0Var.c0(-1195387091);
                        u30.b bVar9 = uiState.E;
                        Integer num6 = uiState.F;
                        u30.f fVar9 = gVar2.b;
                        ot.b bVar10 = uiState.H;
                        int i116 = uiState.P;
                        if (!z7) {
                            f15 = 0;
                        }
                        float f29 = f15;
                        boolean z18 = uiState.c0;
                        i14 = i3 & 112;
                        if (i14 == 32) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        objN4 = g0Var.N();
                        if (z8) {
                            objN4 = new d0(29, onAction);
                            g0Var.n0(objN4);
                        } else {
                            objN4 = new d0(29, onAction);
                            g0Var.n0(objN4);
                        }
                        u00.k kVar5 = (u00.k) objN4;
                        if (i14 == 32) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objN5 = g0Var.N();
                        if (z9) {
                            objN5 = new gv.a0(12, onAction);
                            g0Var.n0(objN5);
                        } else {
                            objN5 = new gv.a0(12, onAction);
                            g0Var.n0(objN5);
                        }
                        u00.a aVar9 = (u00.a) objN5;
                        if (i14 == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objN6 = g0Var.N();
                        if (z11) {
                            objN6 = new gv.a0(13, onAction);
                            g0Var.n0(objN6);
                        } else {
                            objN6 = new gv.a0(13, onAction);
                            g0Var.n0(objN6);
                        }
                        u00.a aVar10 = (u00.a) objN6;
                        if (i14 == 32) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        objN7 = g0Var.N();
                        if (z12) {
                            objN7 = new j(1, onAction);
                            g0Var.n0(objN7);
                        } else {
                            objN7 = new j(1, onAction);
                            g0Var.n0(objN7);
                        }
                        g.b(bVar9, num6, surahNumber, fVar, fVar9, fVar2, z5, z6, bVar10, zA, i116, kVar5, a0Var, f29, f17, f13, f14, aVar9, aVar10, (u00.k) objN7, f12, z18, g0Var, 0, ((i3 >> 6) & 57344) | 384 | ((i3 >> 12) & 458752) | ((i11 << 18) & 3670016), (i3 >> 24) & 14);
                        g0Var.r(false);
                        obj2 = obj5;
                        i13 = 2;
                    } else {
                        g0Var.c0(-1193914095);
                        float f210 = f16;
                        i13 = 2;
                        b(uiState, onAction, fVar, fVar2, z5, z6, zA, surahNumber, obj5, fA0, fA1, fA2, f210, g0Var, (i3 & 126) | (234881024 & (i3 << 3)));
                        obj2 = obj5;
                        g0Var.r(false);
                    }
                    final int i117 = surahNumber;
                    final int i25 = i12;
                    c0.c(z7, h0.s.a.a(b2.o.A, b2.b.B), s0.c(gv.p.J(), i13), s0.d(gv.p.J(), i13), (String) null, v1.d.d(-433660009, new u00.o() {
                        @Override
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            w.d0 AnimatedVisibility = (w.d0) obj6;
                            g0 g0Var2 = (l1.j) obj7;
                            ((Integer) obj8).getClass();
                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                            b2.r rVarD = z1.d(b2.o.A, 1.0f);
                            g0 g0Var3 = g0Var2;
                            y3.c cVar2 = cVar;
                            boolean zG3 = g0Var3.g(cVar2);
                            Object objN8 = g0Var3.N();
                            Object obj9 = l1.i.a;
                            if (zG3 || objN8 == obj9) {
                                objN8 = new f0(cVar2, z0Var5, 10);
                                g0Var3.n0(objN8);
                            }
                            b2.r rVarO = z2.d0.o(rVarD, (u00.k) objN8);
                            h0.b bVar11 = h0.i.b;
                            u00.k kVar6 = onAction;
                            boolean zG4 = g0Var3.g(kVar6);
                            Object objN9 = g0Var3.N();
                            if (zG4 || objN9 == obj9) {
                                objN9 = new gv.a0(14, kVar6);
                                g0Var3.n0(objN9);
                            }
                            g4.h(i117, i25, backdrop, (u00.a) objN9, (u00.a) null, j, rVarO, bVar11, g0Var2, 12607488, 0);
                            return b0.a;
                        }
                    }, g0Var), g0Var, 196608, 16);
                    g0Var = g0Var;
                    g0Var.r(true);
                    f7 = f17;
                    f9 = f13;
                    f6 = f14;
                    f8 = f12;
                    z3 = z4;
                } else {
                    g0Var.V();
                    obj2 = obj;
                    f6 = f4;
                    z3 = z2;
                    f7 = f5;
                    f8 = f2;
                    f9 = f3;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj6, Object obj7) {
                            ((Integer) obj7).getClass();
                            int iK = l1.q.K(i | 1);
                            n.a(uiState, onAction, backdrop, j, rVar, z3, f7, obj2, f8, f9, f6, (l1.j) obj6, iK, i2);
                            return b0.a;
                        }
                    };
                }
            }
            i3 |= 805306368;
            i8 = i2 & 1024;
            if (i8 != 0) {
                i11 = 6;
                i9 = i8;
            } else {
                i9 = i8;
                if (g0Var.d(f4)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
            }
            if (g0Var.S(i3 & 1, (i3 & 306783379) == 306783378 || (i11 & 3) != 2)) {
                if (i15 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i16 != 0) {
                    f11 = 0;
                } else {
                    f11 = f5;
                }
                lowerCase = null;
                if (i17 != 0) {
                    obj3 = null;
                } else {
                    obj3 = obj;
                }
                if (i4 != 0) {
                    f12 = Float.NaN;
                } else {
                    f12 = f2;
                }
                if (i6 != 0) {
                    f13 = 0;
                } else {
                    f13 = f3;
                }
                if (i9 != 0) {
                    f14 = 0;
                } else {
                    f14 = f4;
                }
                if (uiState.D) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                if (z5) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                str = uiState.L;
                if (str != null) {
                    lowerCase = str.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                }
                zA = kotlin.jvm.internal.m.a(lowerCase, "ar");
                playerItem = uiState.f;
                if (playerItem != null) {
                    surahNumber = playerItem.getSurahNumber();
                } else {
                    surahNumber = 1;
                }
                num = uiState.F;
                if (num != null) {
                    iIntValue = num.intValue();
                    if (iIntValue < 1) {
                        iIntValue = 1;
                    }
                    i12 = iIntValue;
                } else {
                    i12 = 1;
                }
                cVar = (y3.c) g0Var.k(c3.o1.h);
                objN = g0Var.N();
                obj4 = l1.i.a;
                if (objN == obj4) {
                    objN = x5.s(0, g0Var);
                }
                final z0 z0Var6 = (z0) objN;
                float f118 = ((y3.f) z0Var6.getValue()).A + a;
                float f119 = b;
                f15 = f118 + f119;
                if (z4) {
                    fA0 = cVar.A0(f15);
                } else {
                    fA0 = 0.0f;
                }
                f16 = c;
                if (z4) {
                    f16 = p30.f.i0(new y3.f(f16), new y3.f(f15)).A;
                }
                obj5 = obj3;
                fA1 = cVar.A0(f11);
                fA2 = cVar.A0(f119);
                zG = g0Var.g(fVar4);
                f17 = f11;
                objN2 = g0Var.N();
                if (zG) {
                    objN2 = g4.e0(fVar4);
                    g0Var.n0(objN2);
                } else {
                    objN2 = g4.e0(fVar4);
                    g0Var.n0(objN2);
                }
                fVar = (u30.f) objN2;
                zG2 = g0Var.g(fVar3);
                objN3 = g0Var.N();
                if (zG2) {
                    objN3 = g4.e0(fVar3);
                    g0Var.n0(objN3);
                } else {
                    objN3 = g4.e0(fVar3);
                    g0Var.n0(objN3);
                }
                fVar2 = (u30.f) objN3;
                if (z4) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                a0Var = z1.c;
                b2.r rVarV6 = rVar.V(a0Var);
                w0 w0VarD6 = h0.o.d(b2.b.I, false);
                int iHashCode6 = Long.hashCode(g0Var.T);
                m1 m1VarM6 = g0Var.m();
                b2.r rVarC6 = b2.a.c(rVarV6, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD6, g0Var, b3.h.f);
                l1.q.I(m1VarM6, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode6), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC6, g0Var, b3.h.d);
                if (z13 != 0) {
                    g0Var.c0(-1195387091);
                    u30.b bVar11 = uiState.E;
                    Integer num7 = uiState.F;
                    u30.f fVar10 = gVar2.b;
                    ot.b bVar12 = uiState.H;
                    int i118 = uiState.P;
                    if (!z7) {
                        f15 = 0;
                    }
                    float f211 = f15;
                    boolean z19 = uiState.c0;
                    i14 = i3 & 112;
                    if (i14 == 32) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    objN4 = g0Var.N();
                    if (z8) {
                        objN4 = new d0(29, onAction);
                        g0Var.n0(objN4);
                    } else {
                        objN4 = new d0(29, onAction);
                        g0Var.n0(objN4);
                    }
                    u00.k kVar6 = (u00.k) objN4;
                    if (i14 == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objN5 = g0Var.N();
                    if (z9) {
                        objN5 = new gv.a0(12, onAction);
                        g0Var.n0(objN5);
                    } else {
                        objN5 = new gv.a0(12, onAction);
                        g0Var.n0(objN5);
                    }
                    u00.a aVar11 = (u00.a) objN5;
                    if (i14 == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objN6 = g0Var.N();
                    if (z11) {
                        objN6 = new gv.a0(13, onAction);
                        g0Var.n0(objN6);
                    } else {
                        objN6 = new gv.a0(13, onAction);
                        g0Var.n0(objN6);
                    }
                    u00.a aVar12 = (u00.a) objN6;
                    if (i14 == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objN7 = g0Var.N();
                    if (z12) {
                        objN7 = new j(1, onAction);
                        g0Var.n0(objN7);
                    } else {
                        objN7 = new j(1, onAction);
                        g0Var.n0(objN7);
                    }
                    g.b(bVar11, num7, surahNumber, fVar, fVar10, fVar2, z5, z6, bVar12, zA, i118, kVar6, a0Var, f211, f17, f13, f14, aVar11, aVar12, (u00.k) objN7, f12, z19, g0Var, 0, ((i3 >> 6) & 57344) | 384 | ((i3 >> 12) & 458752) | ((i11 << 18) & 3670016), (i3 >> 24) & 14);
                    g0Var.r(false);
                    obj2 = obj5;
                    i13 = 2;
                } else {
                    g0Var.c0(-1193914095);
                    float f212 = f16;
                    i13 = 2;
                    b(uiState, onAction, fVar, fVar2, z5, z6, zA, surahNumber, obj5, fA0, fA1, fA2, f212, g0Var, (i3 & 126) | (234881024 & (i3 << 3)));
                    obj2 = obj5;
                    g0Var.r(false);
                }
                final int i119 = surahNumber;
                final int i26 = i12;
                c0.c(z7, h0.s.a.a(b2.o.A, b2.b.B), s0.c(gv.p.J(), i13), s0.d(gv.p.J(), i13), (String) null, v1.d.d(-433660009, new u00.o() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        w.d0 AnimatedVisibility = (w.d0) obj6;
                        g0 g0Var2 = (l1.j) obj7;
                        ((Integer) obj8).getClass();
                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                        b2.r rVarD = z1.d(b2.o.A, 1.0f);
                        g0 g0Var3 = g0Var2;
                        y3.c cVar2 = cVar;
                        boolean zG3 = g0Var3.g(cVar2);
                        Object objN8 = g0Var3.N();
                        Object obj9 = l1.i.a;
                        if (zG3 || objN8 == obj9) {
                            objN8 = new f0(cVar2, z0Var6, 10);
                            g0Var3.n0(objN8);
                        }
                        b2.r rVarO = z2.d0.o(rVarD, (u00.k) objN8);
                        h0.b bVar13 = h0.i.b;
                        u00.k kVar7 = onAction;
                        boolean zG4 = g0Var3.g(kVar7);
                        Object objN9 = g0Var3.N();
                        if (zG4 || objN9 == obj9) {
                            objN9 = new gv.a0(14, kVar7);
                            g0Var3.n0(objN9);
                        }
                        g4.h(i119, i26, backdrop, (u00.a) objN9, (u00.a) null, j, rVarO, bVar13, g0Var2, 12607488, 0);
                        return b0.a;
                    }
                }, g0Var), g0Var, 196608, 16);
                g0Var = g0Var;
                g0Var.r(true);
                f7 = f17;
                f9 = f13;
                f6 = f14;
                f8 = f12;
                z3 = z4;
            } else {
                g0Var.V();
                obj2 = obj;
                f6 = f4;
                z3 = z2;
                f7 = f5;
                f8 = f2;
                f9 = f3;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        ((Integer) obj7).getClass();
                        int iK = l1.q.K(i | 1);
                        n.a(uiState, onAction, backdrop, j, rVar, z3, f7, obj2, f8, f9, f6, (l1.j) obj6, iK, i2);
                        return b0.a;
                    }
                };
            }
        }
        i3 |= 100663296;
        i6 = i2 & 512;
        if (i6 != 0) {
            if ((i & 805306368) == 0) {
                if (g0Var.d(f3)) {
                    i7 = 536870912;
                } else {
                    i7 = 268435456;
                }
                i3 |= i7;
            }
            i8 = i2 & 1024;
            if (i8 != 0) {
                i11 = 6;
                i9 = i8;
            } else {
                i9 = i8;
                if (g0Var.d(f4)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
            }
            if (g0Var.S(i3 & 1, (i3 & 306783379) == 306783378 || (i11 & 3) != 2)) {
                if (i15 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i16 != 0) {
                    f11 = 0;
                } else {
                    f11 = f5;
                }
                lowerCase = null;
                if (i17 != 0) {
                    obj3 = null;
                } else {
                    obj3 = obj;
                }
                if (i4 != 0) {
                    f12 = Float.NaN;
                } else {
                    f12 = f2;
                }
                if (i6 != 0) {
                    f13 = 0;
                } else {
                    f13 = f3;
                }
                if (i9 != 0) {
                    f14 = 0;
                } else {
                    f14 = f4;
                }
                if (uiState.D) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                if (z5) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                str = uiState.L;
                if (str != null) {
                    lowerCase = str.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                }
                zA = kotlin.jvm.internal.m.a(lowerCase, "ar");
                playerItem = uiState.f;
                if (playerItem != null) {
                    surahNumber = playerItem.getSurahNumber();
                } else {
                    surahNumber = 1;
                }
                num = uiState.F;
                if (num != null) {
                    iIntValue = num.intValue();
                    if (iIntValue < 1) {
                        iIntValue = 1;
                    }
                    i12 = iIntValue;
                } else {
                    i12 = 1;
                }
                cVar = (y3.c) g0Var.k(c3.o1.h);
                objN = g0Var.N();
                obj4 = l1.i.a;
                if (objN == obj4) {
                    objN = x5.s(0, g0Var);
                }
                final z0 z0Var7 = (z0) objN;
                float f1110 = ((y3.f) z0Var7.getValue()).A + a;
                float f1111 = b;
                f15 = f1110 + f1111;
                if (z4) {
                    fA0 = cVar.A0(f15);
                } else {
                    fA0 = 0.0f;
                }
                f16 = c;
                if (z4) {
                    f16 = p30.f.i0(new y3.f(f16), new y3.f(f15)).A;
                }
                obj5 = obj3;
                fA1 = cVar.A0(f11);
                fA2 = cVar.A0(f1111);
                zG = g0Var.g(fVar4);
                f17 = f11;
                objN2 = g0Var.N();
                if (zG) {
                    objN2 = g4.e0(fVar4);
                    g0Var.n0(objN2);
                } else {
                    objN2 = g4.e0(fVar4);
                    g0Var.n0(objN2);
                }
                fVar = (u30.f) objN2;
                zG2 = g0Var.g(fVar3);
                objN3 = g0Var.N();
                if (zG2) {
                    objN3 = g4.e0(fVar3);
                    g0Var.n0(objN3);
                } else {
                    objN3 = g4.e0(fVar3);
                    g0Var.n0(objN3);
                }
                fVar2 = (u30.f) objN3;
                if (z4) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                a0Var = z1.c;
                b2.r rVarV7 = rVar.V(a0Var);
                w0 w0VarD7 = h0.o.d(b2.b.I, false);
                int iHashCode7 = Long.hashCode(g0Var.T);
                m1 m1VarM7 = g0Var.m();
                b2.r rVarC7 = b2.a.c(rVarV7, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD7, g0Var, b3.h.f);
                l1.q.I(m1VarM7, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode7), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC7, g0Var, b3.h.d);
                if (z13 != 0) {
                    g0Var.c0(-1195387091);
                    u30.b bVar13 = uiState.E;
                    Integer num8 = uiState.F;
                    u30.f fVar11 = gVar2.b;
                    ot.b bVar14 = uiState.H;
                    int i1110 = uiState.P;
                    if (!z7) {
                        f15 = 0;
                    }
                    float f213 = f15;
                    boolean z110 = uiState.c0;
                    i14 = i3 & 112;
                    if (i14 == 32) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    objN4 = g0Var.N();
                    if (z8) {
                        objN4 = new d0(29, onAction);
                        g0Var.n0(objN4);
                    } else {
                        objN4 = new d0(29, onAction);
                        g0Var.n0(objN4);
                    }
                    u00.k kVar7 = (u00.k) objN4;
                    if (i14 == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objN5 = g0Var.N();
                    if (z9) {
                        objN5 = new gv.a0(12, onAction);
                        g0Var.n0(objN5);
                    } else {
                        objN5 = new gv.a0(12, onAction);
                        g0Var.n0(objN5);
                    }
                    u00.a aVar13 = (u00.a) objN5;
                    if (i14 == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objN6 = g0Var.N();
                    if (z11) {
                        objN6 = new gv.a0(13, onAction);
                        g0Var.n0(objN6);
                    } else {
                        objN6 = new gv.a0(13, onAction);
                        g0Var.n0(objN6);
                    }
                    u00.a aVar14 = (u00.a) objN6;
                    if (i14 == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objN7 = g0Var.N();
                    if (z12) {
                        objN7 = new j(1, onAction);
                        g0Var.n0(objN7);
                    } else {
                        objN7 = new j(1, onAction);
                        g0Var.n0(objN7);
                    }
                    g.b(bVar13, num8, surahNumber, fVar, fVar11, fVar2, z5, z6, bVar14, zA, i1110, kVar7, a0Var, f213, f17, f13, f14, aVar13, aVar14, (u00.k) objN7, f12, z110, g0Var, 0, ((i3 >> 6) & 57344) | 384 | ((i3 >> 12) & 458752) | ((i11 << 18) & 3670016), (i3 >> 24) & 14);
                    g0Var.r(false);
                    obj2 = obj5;
                    i13 = 2;
                } else {
                    g0Var.c0(-1193914095);
                    float f214 = f16;
                    i13 = 2;
                    b(uiState, onAction, fVar, fVar2, z5, z6, zA, surahNumber, obj5, fA0, fA1, fA2, f214, g0Var, (i3 & 126) | (234881024 & (i3 << 3)));
                    obj2 = obj5;
                    g0Var.r(false);
                }
                final int i1111 = surahNumber;
                final int i27 = i12;
                c0.c(z7, h0.s.a.a(b2.o.A, b2.b.B), s0.c(gv.p.J(), i13), s0.d(gv.p.J(), i13), (String) null, v1.d.d(-433660009, new u00.o() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        w.d0 AnimatedVisibility = (w.d0) obj6;
                        g0 g0Var2 = (l1.j) obj7;
                        ((Integer) obj8).getClass();
                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                        b2.r rVarD = z1.d(b2.o.A, 1.0f);
                        g0 g0Var3 = g0Var2;
                        y3.c cVar2 = cVar;
                        boolean zG3 = g0Var3.g(cVar2);
                        Object objN8 = g0Var3.N();
                        Object obj9 = l1.i.a;
                        if (zG3 || objN8 == obj9) {
                            objN8 = new f0(cVar2, z0Var7, 10);
                            g0Var3.n0(objN8);
                        }
                        b2.r rVarO = z2.d0.o(rVarD, (u00.k) objN8);
                        h0.b bVar15 = h0.i.b;
                        u00.k kVar8 = onAction;
                        boolean zG4 = g0Var3.g(kVar8);
                        Object objN9 = g0Var3.N();
                        if (zG4 || objN9 == obj9) {
                            objN9 = new gv.a0(14, kVar8);
                            g0Var3.n0(objN9);
                        }
                        g4.h(i1111, i27, backdrop, (u00.a) objN9, (u00.a) null, j, rVarO, bVar15, g0Var2, 12607488, 0);
                        return b0.a;
                    }
                }, g0Var), g0Var, 196608, 16);
                g0Var = g0Var;
                g0Var.r(true);
                f7 = f17;
                f9 = f13;
                f6 = f14;
                f8 = f12;
                z3 = z4;
            } else {
                g0Var.V();
                obj2 = obj;
                f6 = f4;
                z3 = z2;
                f7 = f5;
                f8 = f2;
                f9 = f3;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        ((Integer) obj7).getClass();
                        int iK = l1.q.K(i | 1);
                        n.a(uiState, onAction, backdrop, j, rVar, z3, f7, obj2, f8, f9, f6, (l1.j) obj6, iK, i2);
                        return b0.a;
                    }
                };
            }
        }
        i3 |= 805306368;
        i8 = i2 & 1024;
        if (i8 != 0) {
            i11 = 6;
            i9 = i8;
        } else {
            i9 = i8;
            if (g0Var.d(f4)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
        }
        if (g0Var.S(i3 & 1, (i3 & 306783379) == 306783378 || (i11 & 3) != 2)) {
            if (i15 != 0) {
                z4 = true;
            } else {
                z4 = z2;
            }
            if (i16 != 0) {
                f11 = 0;
            } else {
                f11 = f5;
            }
            lowerCase = null;
            if (i17 != 0) {
                obj3 = null;
            } else {
                obj3 = obj;
            }
            if (i4 != 0) {
                f12 = Float.NaN;
            } else {
                f12 = f2;
            }
            if (i6 != 0) {
                f13 = 0;
            } else {
                f13 = f3;
            }
            if (i9 != 0) {
                f14 = 0;
            } else {
                f14 = f4;
            }
            if (uiState.D) {
                z5 = false;
            } else {
                z5 = false;
            }
            if (z5) {
                z6 = false;
            } else {
                z6 = false;
            }
            str = uiState.L;
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
            }
            zA = kotlin.jvm.internal.m.a(lowerCase, "ar");
            playerItem = uiState.f;
            if (playerItem != null) {
                surahNumber = playerItem.getSurahNumber();
            } else {
                surahNumber = 1;
            }
            num = uiState.F;
            if (num != null) {
                iIntValue = num.intValue();
                if (iIntValue < 1) {
                    iIntValue = 1;
                }
                i12 = iIntValue;
            } else {
                i12 = 1;
            }
            cVar = (y3.c) g0Var.k(c3.o1.h);
            objN = g0Var.N();
            obj4 = l1.i.a;
            if (objN == obj4) {
                objN = x5.s(0, g0Var);
            }
            final z0 z0Var8 = (z0) objN;
            float f1112 = ((y3.f) z0Var8.getValue()).A + a;
            float f1113 = b;
            f15 = f1112 + f1113;
            if (z4) {
                fA0 = cVar.A0(f15);
            } else {
                fA0 = 0.0f;
            }
            f16 = c;
            if (z4) {
                f16 = p30.f.i0(new y3.f(f16), new y3.f(f15)).A;
            }
            obj5 = obj3;
            fA1 = cVar.A0(f11);
            fA2 = cVar.A0(f1113);
            zG = g0Var.g(fVar4);
            f17 = f11;
            objN2 = g0Var.N();
            if (zG) {
                objN2 = g4.e0(fVar4);
                g0Var.n0(objN2);
            } else {
                objN2 = g4.e0(fVar4);
                g0Var.n0(objN2);
            }
            fVar = (u30.f) objN2;
            zG2 = g0Var.g(fVar3);
            objN3 = g0Var.N();
            if (zG2) {
                objN3 = g4.e0(fVar3);
                g0Var.n0(objN3);
            } else {
                objN3 = g4.e0(fVar3);
                g0Var.n0(objN3);
            }
            fVar2 = (u30.f) objN3;
            if (z4) {
                z7 = false;
            } else {
                z7 = false;
            }
            a0Var = z1.c;
            b2.r rVarV8 = rVar.V(a0Var);
            w0 w0VarD8 = h0.o.d(b2.b.I, false);
            int iHashCode8 = Long.hashCode(g0Var.T);
            m1 m1VarM8 = g0Var.m();
            b2.r rVarC8 = b2.a.c(rVarV8, g0Var);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD8, g0Var, b3.h.f);
            l1.q.I(m1VarM8, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode8), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC8, g0Var, b3.h.d);
            if (z13 != 0) {
                g0Var.c0(-1195387091);
                u30.b bVar15 = uiState.E;
                Integer num9 = uiState.F;
                u30.f fVar12 = gVar2.b;
                ot.b bVar16 = uiState.H;
                int i1112 = uiState.P;
                if (!z7) {
                    f15 = 0;
                }
                float f215 = f15;
                boolean z111 = uiState.c0;
                i14 = i3 & 112;
                if (i14 == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                objN4 = g0Var.N();
                if (z8) {
                    objN4 = new d0(29, onAction);
                    g0Var.n0(objN4);
                } else {
                    objN4 = new d0(29, onAction);
                    g0Var.n0(objN4);
                }
                u00.k kVar8 = (u00.k) objN4;
                if (i14 == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objN5 = g0Var.N();
                if (z9) {
                    objN5 = new gv.a0(12, onAction);
                    g0Var.n0(objN5);
                } else {
                    objN5 = new gv.a0(12, onAction);
                    g0Var.n0(objN5);
                }
                u00.a aVar15 = (u00.a) objN5;
                if (i14 == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objN6 = g0Var.N();
                if (z11) {
                    objN6 = new gv.a0(13, onAction);
                    g0Var.n0(objN6);
                } else {
                    objN6 = new gv.a0(13, onAction);
                    g0Var.n0(objN6);
                }
                u00.a aVar16 = (u00.a) objN6;
                if (i14 == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objN7 = g0Var.N();
                if (z12) {
                    objN7 = new j(1, onAction);
                    g0Var.n0(objN7);
                } else {
                    objN7 = new j(1, onAction);
                    g0Var.n0(objN7);
                }
                g.b(bVar15, num9, surahNumber, fVar, fVar12, fVar2, z5, z6, bVar16, zA, i1112, kVar8, a0Var, f215, f17, f13, f14, aVar15, aVar16, (u00.k) objN7, f12, z111, g0Var, 0, ((i3 >> 6) & 57344) | 384 | ((i3 >> 12) & 458752) | ((i11 << 18) & 3670016), (i3 >> 24) & 14);
                g0Var.r(false);
                obj2 = obj5;
                i13 = 2;
            } else {
                g0Var.c0(-1193914095);
                float f216 = f16;
                i13 = 2;
                b(uiState, onAction, fVar, fVar2, z5, z6, zA, surahNumber, obj5, fA0, fA1, fA2, f216, g0Var, (i3 & 126) | (234881024 & (i3 << 3)));
                obj2 = obj5;
                g0Var.r(false);
            }
            final int i1113 = surahNumber;
            final int i28 = i12;
            c0.c(z7, h0.s.a.a(b2.o.A, b2.b.B), s0.c(gv.p.J(), i13), s0.d(gv.p.J(), i13), (String) null, v1.d.d(-433660009, new u00.o() {
                @Override
                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                    w.d0 AnimatedVisibility = (w.d0) obj6;
                    g0 g0Var2 = (l1.j) obj7;
                    ((Integer) obj8).getClass();
                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                    b2.r rVarD = z1.d(b2.o.A, 1.0f);
                    g0 g0Var3 = g0Var2;
                    y3.c cVar2 = cVar;
                    boolean zG3 = g0Var3.g(cVar2);
                    Object objN8 = g0Var3.N();
                    Object obj9 = l1.i.a;
                    if (zG3 || objN8 == obj9) {
                        objN8 = new f0(cVar2, z0Var8, 10);
                        g0Var3.n0(objN8);
                    }
                    b2.r rVarO = z2.d0.o(rVarD, (u00.k) objN8);
                    h0.b bVar17 = h0.i.b;
                    u00.k kVar9 = onAction;
                    boolean zG4 = g0Var3.g(kVar9);
                    Object objN9 = g0Var3.N();
                    if (zG4 || objN9 == obj9) {
                        objN9 = new gv.a0(14, kVar9);
                        g0Var3.n0(objN9);
                    }
                    g4.h(i1113, i28, backdrop, (u00.a) objN9, (u00.a) null, j, rVarO, bVar17, g0Var2, 12607488, 0);
                    return b0.a;
                }
            }, g0Var), g0Var, 196608, 16);
            g0Var = g0Var;
            g0Var.r(true);
            f7 = f17;
            f9 = f13;
            f6 = f14;
            f8 = f12;
            z3 = z4;
        } else {
            g0Var.V();
            obj2 = obj;
            f6 = f4;
            z3 = z2;
            f7 = f5;
            f8 = f2;
            f9 = f3;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    int iK = l1.q.K(i | 1);
                    n.a(uiState, onAction, backdrop, j, rVar, z3, f7, obj2, f8, f9, f6, (l1.j) obj6, iK, i2);
                    return b0.a;
                }
            };
        }
    }

    public static final void b(final o1 o1Var, final u00.k kVar, final u30.f fVar, final u30.f fVar2, final boolean z, final boolean z2, final boolean z3, final int i, final Object obj, final float f, final float f2, final float f3, final float f4, l1.j jVar, final int i2) {
        int i3;
        u30.f fVar3;
        boolean z4;
        boolean z5;
        l1.j jVar2;
        u00.k kVar2;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(-2011308869);
        if ((i2 & 6) == 0) {
            i3 = (jVar3.g(o1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= jVar3.i(kVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= jVar3.g(fVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            fVar3 = fVar2;
            i3 |= jVar3.g(fVar3) ? 2048 : 1024;
        } else {
            fVar3 = fVar2;
        }
        if ((i2 & 24576) == 0) {
            z4 = z;
            i3 |= jVar3.h(z4) ? 16384 : 8192;
        } else {
            z4 = z;
        }
        if ((196608 & i2) == 0) {
            z5 = z2;
            i3 |= jVar3.h(z5) ? 131072 : 65536;
        } else {
            z5 = z2;
        }
        if ((1572864 & i2) == 0) {
            i3 |= jVar3.h(z3) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= jVar3.e(i) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= jVar3.i(obj) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= jVar3.d(f) ? 536870912 : 268435456;
        }
        int i4 = i3;
        int i5 = (jVar3.d(f2) ? 4 : 2) | (jVar3.d(f3) ? 32 : 16) | (jVar3.d(f4) ? 256 : 128);
        if (jVar3.S(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 147) == 146) ? false : true)) {
            sg.f fVar4 = cm.a.A;
            Configuration configuration = (Configuration) jVar3.k(o0.a);
            fVar4.getClass();
            boolean z6 = sg.f.J(configuration) == cm.a.C;
            a0 a0Var = z1.c;
            u30.b bVar = o1Var.E;
            Integer num = o1Var.F;
            u30.f fVar5 = o1Var.O.b;
            boolean z7 = o1Var.C;
            ot.b bVar2 = o1Var.H;
            int i6 = o1Var.P;
            Object obj2 = l1.i.a;
            if (z6) {
                jVar3.c0(187946961);
                boolean z8 = (i4 & 112) == 32;
                Object objN = jVar3.N();
                if (z8 || objN == obj2) {
                    objN = new j(2, kVar);
                    jVar3.n0(objN);
                }
                jVar3.r(false);
                kVar2 = (u00.k) objN;
            } else {
                jVar3.c0(188036427);
                jVar3.r(false);
                kVar2 = null;
            }
            su.c cVar = o1Var.W;
            su.b bVar3 = cVar != null ? cVar.a : null;
            int i7 = i4 & 112;
            boolean z9 = i7 == 32;
            Object objN2 = jVar3.N();
            if (z9 || objN2 == obj2) {
                objN2 = new j(3, kVar);
                jVar3.n0(objN2);
            }
            u00.k kVar3 = (u00.k) objN2;
            boolean z11 = i7 == 32;
            Object objN3 = jVar3.N();
            if (z11 || objN3 == obj2) {
                objN3 = new gv.a0(10, kVar);
                jVar3.n0(objN3);
            }
            u00.a aVar = (u00.a) objN3;
            boolean z12 = i7 == 32;
            Object objN4 = jVar3.N();
            if (z12 || objN4 == obj2) {
                objN4 = new gv.a0(11, kVar);
                jVar3.n0(objN4);
            }
            u00.a aVar2 = (u00.a) objN4;
            boolean z13 = i7 == 32;
            Object objN5 = jVar3.N();
            if (z13 || objN5 == obj2) {
                objN5 = new j(0, kVar);
                jVar3.n0(objN5);
            }
            int i8 = i4 << 6;
            int i9 = (i5 >> 3) & 14;
            int i11 = i5 << 3;
            jVar2 = jVar3;
            t.a(bVar, num, i, fVar, fVar5, fVar3, z4, z5, z7, bVar2, z3, kVar3, a0Var, aVar, aVar2, obj, i6, (u00.k) objN5, kVar2, f, f3, f2, f3, bVar3, f4, jVar2, ((i4 >> 15) & 896) | ((i4 << 3) & 7168) | (i8 & 458752) | (3670016 & i8) | (i8 & 29360128), ((i4 >> 18) & 14) | 384 | ((i4 >> 9) & 458752) | (i4 & 1879048192), i9 | (i11 & 112) | (i11 & 896) | (57344 & (i5 << 6)));
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iK = l1.q.K(i2 | 1);
                    n.b(o1Var, kVar, fVar, fVar2, z, z2, z3, i, obj, f, f2, f3, f4, (l1.j) obj3, iK);
                    return b0.a;
                }
            };
        }
    }
}
