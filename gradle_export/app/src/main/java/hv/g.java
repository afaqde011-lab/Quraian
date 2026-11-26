package hv;

import ab.a0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c3.k1;
import c3.o1;
import com.google.android.gms.internal.measurement.b5;
import com.revenuecat.purchases.common.Constants;
import g00.b0;
import g1.j7;
import g1.s4;
import h0.z1;
import java.util.Iterator;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.r1;
import l1.z;
import l1.z0;
import v2.f0;
import w.c0;
import w.s0;
import z.p1;
import z2.d0;
import z2.w0;

public abstract class g {
    public static final float a = 28;
    public static final float b = 8;
    public static final float c = 20;

    public static final void a(final u30.b bVar, final Integer num, final int i, final u30.f fVar, final u30.f fVar2, final u30.f fVar3, final boolean z, final boolean z2, final ot.b bVar2, final boolean z3, final int i2, final u00.k kVar, final float f, final float f2, final float f3, final float f4, final u00.a aVar, final u00.a aVar2, final u00.k kVar2, final float f5, final boolean z4, l1.j jVar, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1705612417);
        int i8 = i3 | (g0Var.g(bVar) ? 4 : 2) | (g0Var.g(num) ? 32 : 16) | (g0Var.e(i) ? 256 : 128) | (g0Var.g(fVar) ? 2048 : 1024) | (g0Var.g(fVar2) ? 16384 : 8192) | (g0Var.g(fVar3) ? 131072 : 65536) | (g0Var.h(z) ? 1048576 : 524288) | (g0Var.h(z2) ? 8388608 : 4194304) | (g0Var.g(bVar2) ? 67108864 : 33554432) | (g0Var.h(z3) ? 536870912 : 268435456);
        if ((i4 & 6) == 0) {
            i6 = i4 | (g0Var.e(i2) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= g0Var.i(kVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= g0Var.d(f) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= g0Var.d(f2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= g0Var.d(f3) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i6 |= g0Var.d(f4) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= g0Var.i(aVar) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= g0Var.i(aVar2) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= g0Var.i(kVar2) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= g0Var.d(f5) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i7 = i5 | (g0Var.h(z4) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if (g0Var.S(i8 & 1, ((i8 & 306783379) == 306783378 && (i6 & 306783379) == 306783378 && (i7 & 3) == 2) ? false : true)) {
            boolean z5 = ((3670016 & i8) == 1048576) | ((i8 & 14) == 4) | ((i8 & 112) == 32);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (z5 || objN == cVar) {
                if (!z) {
                    objN = Integer.valueOf(((ot.a) h00.q.L0(t.a)).a);
                } else {
                    if (num == null) {
                        objN = null;
                        break;
                    }
                    int iIntValue = num.intValue();
                    if (bVar != null && bVar.isEmpty()) {
                        objN = null;
                        break;
                    }
                    Iterator<E> it = bVar.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            objN = null;
                            break;
                        } else if (((ot.a) it.next()).a == iIntValue) {
                            objN = num;
                            break;
                        }
                    }
                }
                g0Var.n0(objN);
            }
            final Integer num2 = (Integer) objN;
            final p1 p1VarL = z.n.l(g0Var);
            u uVarA = v.a(p1VarL, p1VarL.d, kVar2, null, g0Var, ((i6 >> 18) & 896) | 3072);
            z0 z0VarG = l1.q.G(aVar, g0Var);
            z0 z0VarG2 = l1.q.G(aVar2, g0Var);
            Object objN2 = g0Var.N();
            if (objN2 == cVar) {
                objN2 = new ct.k(z0VarG2, 6);
                g0Var.n0(objN2);
            }
            u00.a onDoubleTap = (u00.a) objN2;
            p2 p2VarA = x.d.a(f, gv.p.J(), (String) null, g0Var, (i6 >> 6) & 14, 12);
            p2 p2VarA2 = x.d.a(f2, gv.p.J(), (String) null, g0Var, (i6 >> 9) & 14, 12);
            float f6 = 0;
            final float f7 = a0.v(new y3.f(((y3.f) p2VarA.getValue()).A), new y3.f(f6)).A;
            final float f8 = a0.v(new y3.f(((y3.f) p2VarA2.getValue()).A), new y3.f(f6)).A;
            boolean zG = g0Var.g(p1VarL);
            Object objN3 = g0Var.N();
            if (zG || objN3 == cVar) {
                objN3 = new a1.a0(p1VarL, (k00.c) null, 24);
                g0Var.n0(objN3);
            }
            l1.q.i(num2, g0Var, (u00.n) objN3);
            y3.c cVar2 = (y3.c) g0Var.k(o1.h);
            float fA0 = cVar2.A0(a);
            b2.r rVarA = u2.f.a(f2.h.a(z1.c, z2 ? 1.0f : 0.45f), uVarA, (u2.d) null);
            boolean zG2 = g0Var.g(z0VarG);
            Object objN4 = g0Var.N();
            if (zG2 || objN4 == cVar) {
                objN4 = new f(z0VarG, 0);
                g0Var.n0(objN4);
            }
            b2.r rVarB = f0.b(rVarA, b0.a, (PointerInputEventHandler) objN4);
            float f9 = zk.f.a;
            kotlin.jvm.internal.m.e(rVarB, "<this>");
            kotlin.jvm.internal.m.e(onDoubleTap, "onDoubleTap");
            h0.c.a(ca.v.w(f0.b(rVarB, onDoubleTap, new s4(2, onDoubleTap)), cVar2.A0(f7), fA0, cVar2.A0(f8), fA0), (b2.d) null, false, v1.d.d(-234620695, new u00.o() {
                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    h0.t BoxWithConstraints = (h0.t) obj;
                    g0 g0Var2 = (l1.j) obj2;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((iIntValue2 & 6) == 0) {
                        iIntValue2 |= g0Var2.g(BoxWithConstraints) ? 4 : 2;
                    }
                    g0 g0Var3 = g0Var2;
                    if (g0Var3.S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                        y3.f fVar4 = new y3.f(f3);
                        float f11 = g.a;
                        float f12 = f7;
                        float f13 = 0;
                        float f14 = a0.v(new y3.f(f11 - f12), new y3.f(f13)).A;
                        float f15 = g.b;
                        float f16 = p30.f.i0(fVar4, new y3.f(f14 + f15)).A;
                        y3.f fVar5 = new y3.f(f4);
                        float f17 = f8;
                        float f18 = p30.f.i0(fVar5, new y3.f(a0.v(new y3.f(f11 - f17), new y3.f(f13)).A + f15)).A;
                        float f19 = f12 + f16;
                        float f21 = f17 + f18;
                        float f22 = a0.v(new y3.f((BoxWithConstraints.b() - f19) - f21), new y3.f(f13)).A;
                        boolean zD = g0Var3.d(f16) | g0Var3.d(f18);
                        Object objN5 = g0Var3.N();
                        Object obj4 = l1.i.a;
                        if (zD || objN5 == obj4) {
                            objN5 = new h((f18 - f16) / 2);
                            g0Var3.n0(objN5);
                        }
                        h0.a0 a0Var = z1.c;
                        p1 p1Var = p1VarL;
                        final boolean z6 = z2;
                        b2.r rVarG = z1.g(h0.c.G(z.n.p(a0Var, p1Var, z6, 12), 0.0f, f19, 0.0f, f21, 5), f22, 0.0f, 2);
                        h0.v vVarA = h0.u.a((h) objN5, b2.b.N, g0Var2, 48);
                        int iHashCode = Long.hashCode(g0Var3.T);
                        m1 m1VarM = g0Var3.m();
                        b2.r rVarC = b2.a.c(rVarG, g0Var2);
                        b3.i.c.getClass();
                        b3.g gVar = b3.h.b;
                        g0Var3.g0();
                        if (g0Var3.S) {
                            g0Var3.l(gVar);
                        } else {
                            g0Var3.q0();
                        }
                        l1.q.I(vVarA, g0Var2, b3.h.f);
                        l1.q.I(m1VarM, g0Var2, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.g);
                        l1.q.E(g0Var2, b3.h.h);
                        l1.q.I(rVarC, g0Var2, b3.h.d);
                        b2.r rVarD = z1.d(z1.s(b2.o.A, 0.0f, f5, 1), 1.0f);
                        Object objN6 = g0Var3.N();
                        if (objN6 == obj4) {
                            objN6 = new j7(28);
                            g0Var3.n0(objN6);
                        }
                        u00.k kVar3 = (u00.k) objN6;
                        b2.i iVar = b2.b.E;
                        final u30.f fVar6 = fVar;
                        final u30.f fVar7 = fVar2;
                        final u30.f fVar8 = fVar3;
                        final ot.b bVar3 = bVar2;
                        final int i9 = i;
                        final boolean z7 = z;
                        final boolean z8 = z3;
                        final u00.k kVar4 = kVar;
                        final int i11 = i2;
                        v1.c cVarD = v1.d.d(1491933609, new u00.p() {
                            @Override
                            public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                w.p AnimatedContent = (w.p) obj5;
                                Integer num3 = (Integer) obj6;
                                g0 g0Var4 = (l1.j) obj7;
                                int iIntValue3 = ((Integer) obj8).intValue();
                                kotlin.jvm.internal.m.e(AnimatedContent, "$this$AnimatedContent");
                                if (num3 != null) {
                                    g0 g0Var5 = g0Var4;
                                    g0Var5.c0(1872662689);
                                    int iIntValue4 = num3.intValue();
                                    u30.f fVar9 = fVar6;
                                    u30.f fVar10 = fVar7;
                                    u30.f fVar11 = fVar8;
                                    ot.b bVar4 = bVar3;
                                    boolean z9 = z6;
                                    o oVarB = i.b(iIntValue4, fVar9, fVar10, fVar11, bVar4, z9);
                                    final Object objN7 = g0Var5.N();
                                    l1.c cVar3 = l1.i.a;
                                    if (objN7 == cVar3) {
                                        objN7 = new Object();
                                        g0Var5.n0(objN7);
                                    }
                                    boolean zI = g0Var5.i(objN7);
                                    Object objN8 = g0Var5.N();
                                    if (zI || objN8 == cVar3) {
                                        final int i12 = 0;
                                        objN8 = new u00.k() {
                                            @Override
                                            public final Object invoke(Object obj9) {
                                                switch (i12) {
                                                    case 0:
                                                        z DisposableEffect = (z) obj9;
                                                        kotlin.jvm.internal.m.e(DisposableEffect, "$this$DisposableEffect");
                                                        return new k1(objN7, 12);
                                                    case 1:
                                                        z2.a0 coordinates = (z2.a0) obj9;
                                                        kotlin.jvm.internal.m.e(coordinates, "coordinates");
                                                        h2.c cVarG = d0.g(coordinates, true);
                                                        Object key = objN7;
                                                        kotlin.jvm.internal.m.e(key, "key");
                                                        b5.a = new g00.k(key, cVarG);
                                                        return b0.a;
                                                    default:
                                                        ((Integer) obj9).intValue();
                                                        return objN7;
                                                }
                                            }
                                        };
                                        g0Var5.n0(objN8);
                                    }
                                    l1.q.e(objN7, (u00.k) objN8, g0Var4);
                                    boolean zI2 = g0Var5.i(objN7);
                                    Object objN9 = g0Var5.N();
                                    if (zI2 || objN9 == cVar3) {
                                        final int i13 = 1;
                                        objN9 = new u00.k() {
                                            @Override
                                            public final Object invoke(Object obj9) {
                                                switch (i13) {
                                                    case 0:
                                                        z DisposableEffect = (z) obj9;
                                                        kotlin.jvm.internal.m.e(DisposableEffect, "$this$DisposableEffect");
                                                        return new k1(objN7, 12);
                                                    case 1:
                                                        z2.a0 coordinates = (z2.a0) obj9;
                                                        kotlin.jvm.internal.m.e(coordinates, "coordinates");
                                                        h2.c cVarG = d0.g(coordinates, true);
                                                        Object key = objN7;
                                                        kotlin.jvm.internal.m.e(key, "key");
                                                        b5.a = new g00.k(key, cVarG);
                                                        return b0.a;
                                                    default:
                                                        ((Integer) obj9).intValue();
                                                        return objN7;
                                                }
                                            }
                                        };
                                        g0Var5.n0(objN9);
                                    }
                                    b2.r rVarN = d0.n(b2.o.A, (u00.k) objN9);
                                    String str = i9 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + num3;
                                    String str2 = oVarB.a;
                                    boolean z11 = oVarB.b;
                                    String str3 = oVarB.c;
                                    boolean z12 = !z7;
                                    boolean zH = g0Var5.h(z9);
                                    u00.k kVar5 = kVar4;
                                    boolean zG3 = zH | g0Var5.g(kVar5) | ((((iIntValue3 & 112) ^ 48) > 32 && g0Var5.g(num3)) || (iIntValue3 & 48) == 32);
                                    Object objN10 = g0Var5.N();
                                    if (zG3 || objN10 == cVar3) {
                                        objN10 = new gl.a(1, kVar5, num3, z9);
                                        g0Var5.n0(objN10);
                                    }
                                    st.d.a(str, str2, z11, str3, z8, bVar4, true, z12, (u00.a) objN10, rVarN, i11, true, false, g0Var4, 1572864, 48, 4096);
                                    g0Var5.r(false);
                                } else {
                                    g0 g0Var6 = g0Var4;
                                    g0Var6.c0(1874284857);
                                    g0Var6.r(false);
                                }
                                return b0.a;
                            }
                        }, g0Var2);
                        Integer num3 = num2;
                        w.m.a(num3, rVarD, kVar3, iVar, "cinematicAyah", (u00.k) null, cVarD, g0Var2, 1600896, 32);
                        c0.b(h0.w.a, z4 && num3 != null, (b2.r) null, s0.c(gv.p.J(), 2).a(s0.b(gv.p.J(), 14)), s0.d(gv.p.J(), 2).a(s0.h(gv.p.J(), 14)), (String) null, i.a, g0Var2, 1572870, 18);
                        g0Var3.r(true);
                    } else {
                        g0Var3.V();
                    }
                    return b0.a;
                }
            }, g0Var), g0Var, 3072, 6);
            g0Var = g0Var;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n(num, i, fVar, fVar2, fVar3, z, z2, bVar2, z3, i2, kVar, f, f2, f3, f4, aVar, aVar2, kVar2, f5, z4, i3, i4, i5) {
                public final Integer B;
                public final int C;
                public final u30.f D;
                public final u30.f E;
                public final u30.f F;
                public final boolean G;
                public final boolean H;
                public final ot.b I;
                public final boolean J;
                public final int K;
                public final u00.k L;
                public final float M;
                public final float N;
                public final float O;
                public final float P;
                public final u00.a Q;
                public final u00.a R;
                public final u00.k S;
                public final float T;
                public final boolean U;
                public final int V;
                public final int W;

                {
                    this.V = i4;
                    this.W = i5;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(1);
                    int iK2 = l1.q.K(this.V);
                    int iK3 = l1.q.K(this.W);
                    g.a(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, (l1.j) obj, iK, iK2, iK3);
                    return b0.a;
                }
            };
        }
    }

    public static final void b(final u30.b timings, final Integer num, final int i, final u30.f arabicTextByAyah, final u30.f transcriptionTextByAyah, final u30.f tafsirTextByAyah, final boolean z, final boolean z2, final ot.b cellVisibility, final boolean z3, final int i2, final u00.k onAyahClick, final b2.r rVar, final float f, final float f2, final float f3, final float f4, final u00.a aVar, final u00.a aVar2, final u00.k kVar, final float f5, final boolean z4, l1.j jVar, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        g0 g0Var;
        boolean z5;
        kotlin.jvm.internal.m.e(timings, "timings");
        kotlin.jvm.internal.m.e(arabicTextByAyah, "arabicTextByAyah");
        kotlin.jvm.internal.m.e(transcriptionTextByAyah, "transcriptionTextByAyah");
        kotlin.jvm.internal.m.e(tafsirTextByAyah, "tafsirTextByAyah");
        kotlin.jvm.internal.m.e(cellVisibility, "cellVisibility");
        kotlin.jvm.internal.m.e(onAyahClick, "onAyahClick");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-678192763);
        int i8 = i3 | (g0Var2.g(timings) ? 4 : 2) | (g0Var2.g(num) ? 32 : 16) | (g0Var2.e(i) ? 256 : 128) | (g0Var2.g(arabicTextByAyah) ? 2048 : 1024) | (g0Var2.g(transcriptionTextByAyah) ? 16384 : 8192) | (g0Var2.g(tafsirTextByAyah) ? 131072 : 65536) | (g0Var2.h(z) ? 1048576 : 524288) | (g0Var2.h(z2) ? 8388608 : 4194304) | (g0Var2.g(cellVisibility) ? 67108864 : 33554432) | (g0Var2.h(z3) ? 536870912 : 268435456);
        if ((i4 & 6) == 0) {
            i6 = i4 | (g0Var2.e(i2) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= g0Var2.i(onAyahClick) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= g0Var2.g(rVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= g0Var2.d(f) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= g0Var2.d(f2) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i6 |= g0Var2.d(f3) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= g0Var2.d(f4) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= g0Var2.i(aVar) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= g0Var2.i(aVar2) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= g0Var2.i(kVar) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i7 = i5 | (g0Var2.d(f5) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= g0Var2.h(z4) ? 32 : 16;
        }
        if (g0Var2.S(i8 & 1, ((i8 & 306783379) == 306783378 && (i6 & 306783379) == 306783378 && (i7 & 19) == 18) ? false : true)) {
            b2.r rVarV = rVar.V(z1.c);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(rVarV, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(w0VarD, g0Var2, b3.h.f);
            l1.q.I(m1VarM, g0Var2, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.g);
            l1.q.E(g0Var2, b3.h.h);
            l1.q.I(rVarC, g0Var2, b3.h.d);
            if (z && ((h00.b) timings).isEmpty()) {
                g0Var2.c0(523266577);
                z5 = true;
                t.b(null, g0Var2, 0, 1);
                g0Var2.r(false);
                g0Var = g0Var2;
            } else {
                g0Var2.c0(523354307);
                int i9 = i6 >> 3;
                a(timings, num, i, arabicTextByAyah, transcriptionTextByAyah, tafsirTextByAyah, z, z2, cellVisibility, z3, i2, onAyahClick, f, f2, f3, f4, aVar, aVar2, kVar, f5, z4, g0Var2, i8 & 2147483646, (i6 & 126) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (i9 & 234881024) | ((i7 << 27) & 1879048192), (i7 >> 3) & 14);
                g0Var = g0Var2;
                g0Var.r(false);
                z5 = true;
            }
            g0Var.r(z5);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n(num, i, arabicTextByAyah, transcriptionTextByAyah, tafsirTextByAyah, z, z2, cellVisibility, z3, i2, onAyahClick, rVar, f, f2, f3, f4, aVar, aVar2, kVar, f5, z4, i3, i4, i5) {
                public final Integer B;
                public final int C;
                public final u30.f D;
                public final u30.f E;
                public final u30.f F;
                public final boolean G;
                public final boolean H;
                public final ot.b I;
                public final boolean J;
                public final int K;
                public final u00.k L;
                public final b2.r M;
                public final float N;
                public final float O;
                public final float P;
                public final float Q;
                public final u00.a R;
                public final u00.a S;
                public final u00.k T;
                public final float U;
                public final boolean V;
                public final int W;
                public final int X;

                {
                    this.W = i4;
                    this.X = i5;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(1);
                    int iK2 = l1.q.K(this.W);
                    int iK3 = l1.q.K(this.X);
                    g.b(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, (l1.j) obj, iK, iK2, iK3);
                    return b0.a;
                }
            };
        }
    }
}
