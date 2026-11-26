package hv;

import a1.v2;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import as.r0;
import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import g00.b0;
import g1.j7;
import g1.s4;
import g1.z6;
import h0.p1;
import h0.z1;
import j0.x;
import l1.g0;
import l1.m1;
import l1.r1;
import l1.y0;
import l1.z0;
import v2.f0;
import z2.w0;

public abstract class t {
    public static final v30.a a = v30.g.B.c(h00.n.k0(new ot.a[]{new ot.a(1, 0, 1000), new ot.a(2, 1000, HTTPTimeoutManager.REDUCED_TIMEOUT_MS), new ot.a(3, HTTPTimeoutManager.REDUCED_TIMEOUT_MS, 3000), new ot.a(4, 3000, 4000), new ot.a(5, 4000, HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS), new ot.a(6, HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS, 6000), new ot.a(7, 6000, 7000), new ot.a(8, 7000, 8000)}));

    public static final void a(final u30.b timings, final Integer num, final int i, final u30.f arabicTextByAyah, final u30.f transcriptionTextByAyah, final u30.f tafsirTextByAyah, final boolean z, final boolean z2, final boolean z3, final ot.b cellVisibility, final boolean z4, final u00.k onAyahClick, final b2.r rVar, final u00.a aVar, final u00.a aVar2, final Object obj, final int i2, final u00.k kVar, final u00.k kVar2, final float f, final float f2, final float f3, final float f4, final su.b bVar, final float f5, l1.j jVar, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        l1.j jVar2;
        u00.n nVar;
        r1 r1Var;
        l1.j jVar3;
        j0.v vVar;
        boolean z5;
        l1.j jVar4;
        kotlin.jvm.internal.m.e(timings, "timings");
        kotlin.jvm.internal.m.e(arabicTextByAyah, "arabicTextByAyah");
        kotlin.jvm.internal.m.e(transcriptionTextByAyah, "transcriptionTextByAyah");
        kotlin.jvm.internal.m.e(tafsirTextByAyah, "tafsirTextByAyah");
        kotlin.jvm.internal.m.e(cellVisibility, "cellVisibility");
        kotlin.jvm.internal.m.e(onAyahClick, "onAyahClick");
        l1.j jVar5 = (g0) jVar;
        jVar5.e0(-2015466227);
        if ((i3 & 6) == 0) {
            i6 = i3 | (jVar5.g(timings) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= jVar5.g(num) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= jVar5.e(i) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i6 |= jVar5.g(arabicTextByAyah) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i6 |= jVar5.g(transcriptionTextByAyah) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i6 |= jVar5.g(tafsirTextByAyah) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i6 |= jVar5.h(z) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i6 |= jVar5.h(z2) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i6 |= jVar5.h(z3) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i6 |= jVar5.g(cellVisibility) ? 536870912 : 268435456;
        }
        int i9 = i6;
        if ((i4 & 6) == 0) {
            i7 = i4 | (jVar5.h(z4) ? 4 : 2);
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= jVar5.i(onAyahClick) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i7 |= jVar5.g(rVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i7 |= jVar5.i(aVar) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i7 |= jVar5.i(aVar2) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i7 |= jVar5.i(obj) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i7 |= jVar5.e(i2) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i7 |= jVar5.i(kVar) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i7 |= jVar5.i(kVar2) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i7 |= jVar5.d(f) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i8 = i5 | (jVar5.d(f2) ? 4 : 2);
        } else {
            i8 = i5;
        }
        if ((i5 & 48) == 0) {
            i8 |= jVar5.d(f3) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i8 |= jVar5.d(f4) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i8 |= jVar5.g(bVar) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i8 |= jVar5.d(f5) ? 16384 : 8192;
        }
        int i11 = i8;
        if (jVar5.S(i9 & 1, ((i9 & 306783379) == 306783378 && (i7 & 306783379) == 306783378 && (i11 & 9363) == 9362) ? false : true)) {
            if (z && ((h00.b) timings).isEmpty()) {
                jVar5.c0(889462569);
                b(rVar, jVar5, (i7 >> 6) & 14, 0);
                jVar5.r(false);
                r1 r1VarT = jVar5.t();
                if (r1VarT == null) {
                    return;
                }
                final int i12 = 0;
                nVar = new u00.n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i12) {
                            case 0:
                                ((Integer) obj3).getClass();
                                int iK = l1.q.K(i3 | 1);
                                int iK2 = l1.q.K(i4);
                                int iK3 = l1.q.K(i5);
                                t.a(timings, num, i, arabicTextByAyah, transcriptionTextByAyah, tafsirTextByAyah, z, z2, z3, cellVisibility, z4, onAyahClick, rVar, aVar, aVar2, obj, i2, kVar, kVar2, f, f2, f3, f4, bVar, f5, (l1.j) obj2, iK, iK2, iK3);
                                break;
                            default:
                                ((Integer) obj3).getClass();
                                int iK4 = l1.q.K(i3 | 1);
                                int iK5 = l1.q.K(i4);
                                int iK6 = l1.q.K(i5);
                                t.a(timings, num, i, arabicTextByAyah, transcriptionTextByAyah, tafsirTextByAyah, z, z2, z3, cellVisibility, z4, onAyahClick, rVar, aVar, aVar2, obj, i2, kVar, kVar2, f, f2, f3, f4, bVar, f5, (l1.j) obj2, iK4, iK5, iK6);
                                break;
                        }
                        return b0.a;
                    }
                };
                r1Var = r1VarT;
            } else {
                jVar5.c0(889535605);
                jVar5.r(false);
                int i13 = i9 & 3670016;
                boolean z6 = ((i9 & 14) == 4) | (i13 == 1048576);
                Object objN = jVar5.N();
                Object obj2 = l1.i.a;
                Object obj3 = objN;
                if (z6 || objN == obj2) {
                    Object obj4 = (!z || timings.isEmpty()) ? a : timings;
                    jVar5.n0(obj4);
                    obj3 = obj4;
                }
                final u30.b bVar2 = (u30.b) obj3;
                j0.v vVarA = x.a(0, jVar5, 3);
                u uVarA = v.a(vVarA, vVarA.g, kVar, kVar2, jVar5, (i7 >> 15) & 8064);
                z0 z0VarG = l1.q.G(aVar, jVar5);
                z0 z0VarG2 = l1.q.G(aVar2, jVar5);
                Object objN2 = jVar5.N();
                if (objN2 == obj2) {
                    objN2 = new ct.k(z0VarG2, 7);
                    jVar5.n0(objN2);
                }
                u00.a onDoubleTap = (u00.a) objN2;
                int i14 = i9 & 896;
                boolean z7 = i14 == 256;
                Object objN3 = jVar5.N();
                if (z7 || objN3 == obj2) {
                    objN3 = l1.q.z(Boolean.FALSE);
                    jVar5.n0(objN3);
                }
                z0 z0Var = (z0) objN3;
                boolean z8 = i14 == 256;
                Object objN4 = jVar5.N();
                if (z8 || objN4 == obj2) {
                    objN4 = oi.k.s(-1, jVar5);
                }
                y0 y0Var = (y0) objN4;
                Boolean boolValueOf = Boolean.valueOf(z3);
                Integer numValueOf = Integer.valueOf(i2);
                int i15 = i9 & 234881024;
                boolean zG = (i15 == 67108864) | jVar5.g(z0Var) | jVar5.g(y0Var);
                Object objN5 = jVar5.N();
                if (zG || objN5 == obj2) {
                    objN5 = new av.d(z3, z0Var, y0Var, (k00.c) null);
                    jVar5.n0(objN5);
                }
                l1.q.g(boolValueOf, obj, numValueOf, (u00.n) objN5, jVar5);
                Object[] objArr = {num, Boolean.valueOf(z), Boolean.valueOf(z3), Integer.valueOf(i), bVar2, obj, Integer.valueOf(i2)};
                int i16 = i9 & 112;
                boolean zG2 = (i15 == 67108864) | (i16 == 32) | (i13 == 1048576) | jVar5.g(bVar2) | jVar5.g(z0Var) | jVar5.g(vVarA) | jVar5.g(y0Var);
                Object objN6 = jVar5.N();
                if (zG2 || objN6 == obj2) {
                    jVar3 = jVar5;
                    Object rVar2 = new r(z3, num, z, bVar2, vVarA, z0Var, y0Var, null);
                    vVar = vVarA;
                    jVar3.n0(rVar2);
                    objN6 = rVar2;
                } else {
                    jVar3 = jVar5;
                    vVar = vVarA;
                }
                l1.q.j(objArr, (u00.n) objN6, jVar3);
                b2.r rVarA = u2.f.a(f2.h.a(z1.c, z2 ? 1.0f : 0.45f), uVarA, (u2.d) null);
                boolean zG3 = jVar3.g(z0VarG);
                Object objN7 = jVar3.N();
                if (zG3 || objN7 == obj2) {
                    z5 = true;
                    objN7 = new f(z0VarG, 1);
                    jVar3.n0(objN7);
                } else {
                    z5 = true;
                }
                b2.r rVarB = f0.b(rVarA, b0.a, (PointerInputEventHandler) objN7);
                float f6 = zk.f.a;
                kotlin.jvm.internal.m.e(rVarB, "<this>");
                kotlin.jvm.internal.m.e(onDoubleTap, "onDoubleTap");
                b2.r rVarW = ca.v.w(f0.b(rVarB, onDoubleTap, new s4(2, onDoubleTap)), f, f2, f3, f4);
                p1 p1VarG = h0.c.g(0.0f, f5, 0.0f, 100, 5);
                h0.f fVarG = h0.i.g(8);
                int i17 = i9 & 29360128;
                boolean zG4 = jVar3.g(bVar2) | ((i9 & 7168) == 2048 ? z5 : false) | ((57344 & i9) == 16384 ? z5 : false) | ((458752 & i9) == 131072 ? z5 : false) | ((1879048192 & i9) == 536870912 ? z5 : false) | (i17 == 8388608 ? z5 : false) | (i14 == 256 ? z5 : false) | (i16 == 32 ? z5 : false) | (i13 == 1048576 ? z5 : false) | ((i11 & 7168) == 2048 ? z5 : false) | ((i7 & 14) == 4 ? z5 : false) | ((i7 & 112) == 32 ? z5 : false);
                if ((i7 & 3670016) != 1048576) {
                    z5 = false;
                }
                boolean z9 = zG4 | z5;
                Object objN8 = jVar3.N();
                if (z9 || objN8 == obj2) {
                    jVar4 = jVar3;
                    Object obj5 = new u00.k() {
                        @Override
                        public final Object invoke(Object obj6) {
                            j0.h LazyColumn = (j0.h) obj6;
                            kotlin.jvm.internal.m.e(LazyColumn, "$this$LazyColumn");
                            j7 j7Var = new j7(29);
                            u30.b bVar3 = bVar2;
                            LazyColumn.r(((h00.b) bVar3).a(), new v2(j7Var, bVar3, 15), new r0(6, bVar3), new v1.c(new s(bVar3, arabicTextByAyah, transcriptionTextByAyah, tafsirTextByAyah, cellVisibility, z2, i, num, z, bVar, z4, onAyahClick, i2), 802480018, true));
                            return b0.a;
                        }
                    };
                    jVar4.n0(obj5);
                    objN8 = obj5;
                } else {
                    jVar4 = jVar3;
                }
                l1.j jVar6 = jVar4;
                k00.f.d(rVarW, vVar, p1VarG, fVarG, null, null, z2, null, (u00.k) objN8, jVar6, i17 | 24576, 360);
                jVar2 = jVar6;
            }
            r1Var.d = nVar;
        }
        jVar2 = jVar5;
        jVar2.V();
        r1 r1VarT2 = jVar2.t();
        if (r1VarT2 != null) {
            final int i18 = 1;
            nVar = new u00.n() {
                @Override
                public final Object invoke(Object obj6, Object obj7) {
                    switch (i18) {
                        case 0:
                            ((Integer) obj7).getClass();
                            int iK = l1.q.K(i3 | 1);
                            int iK2 = l1.q.K(i4);
                            int iK3 = l1.q.K(i5);
                            t.a(timings, num, i, arabicTextByAyah, transcriptionTextByAyah, tafsirTextByAyah, z, z2, z3, cellVisibility, z4, onAyahClick, rVar, aVar, aVar2, obj, i2, kVar, kVar2, f, f2, f3, f4, bVar, f5, (l1.j) obj6, iK, iK2, iK3);
                            break;
                        default:
                            ((Integer) obj7).getClass();
                            int iK4 = l1.q.K(i3 | 1);
                            int iK5 = l1.q.K(i4);
                            int iK6 = l1.q.K(i5);
                            t.a(timings, num, i, arabicTextByAyah, transcriptionTextByAyah, tafsirTextByAyah, z, z2, z3, cellVisibility, z4, onAyahClick, rVar, aVar, aVar2, obj, i2, kVar, kVar2, f, f2, f3, f4, bVar, f5, (l1.j) obj6, iK4, iK5, iK6);
                            break;
                    }
                    return b0.a;
                }
            };
            r1Var = r1VarT2;
            r1Var.d = nVar;
        }
    }

    public static final void b(b2.r rVar, l1.j jVar, int i, int i2) {
        b2.r rVar2;
        int i3;
        g0 g0Var = (g0) jVar;
        g0Var.e0(221582650);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = i | (g0Var.g(rVar2) ? 4 : 2);
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        if (g0Var.S(i3 & 1, (i3 & 3) != 2)) {
            b2.r rVar3 = b2.o.A;
            b2.r rVar4 = i4 != 0 ? rVar3 : rVar2;
            b2.r rVarV = rVar4.V(z1.c);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarV, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
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
            z6.b(z3.U(g0Var, 2131886632), h0.c.E(rVar3, 24, 0.0f, 2), i2.t.b(0.5f, dl.a.k), 0L, (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, dl.c.g, g0Var, 48, 0, 130040);
            g0Var = g0Var;
            g0Var.r(true);
            rVar2 = rVar4;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new androidx.media3.cast.f(rVar2, i, i2, 1);
        }
    }
}
