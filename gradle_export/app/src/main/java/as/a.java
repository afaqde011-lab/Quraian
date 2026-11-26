package as;

import a1.v2;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import h0.m2;
import h0.n1;
import h0.p1;
import h0.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import l1.m1;
import l1.r1;
import z.h1;
import z.i1;
import z.u1;

public abstract class a {
    public static final v1.c a = new v1.c(new al.c(2), -153298961, false);
    public static final v1.c b = new v1.c(new al.c(3), 228685492, false);

    public static final void a(final j0.v vVar, final u0 u0Var, final boolean z, final PlayerItem playerItem, float f, final u00.k kVar, b2.r rVar, l1.j jVar, int i) {
        l1.j jVar2;
        float fC;
        int i2;
        int i3;
        int i4;
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(-904815090);
        int i5 = i | (jVar3.g(vVar) ? 4 : 2) | (jVar3.g(u0Var) ? 32 : 16) | (jVar3.h(z) ? 256 : 128) | (jVar3.g(playerItem) ? 2048 : 1024) | (jVar3.d(f) ? 16384 : 8192) | (jVar3.i(kVar) ? 131072 : 65536) | (jVar3.g(rVar) ? 1048576 : 524288);
        if (jVar3.S(i5 & 1, (599187 & i5) != 599186)) {
            n1 n1Var = (n1) jVar3.k(dq.l.a);
            final gm.a aVar = (gm.a) jVar3.k(dl.e.a);
            WeakHashMap weakHashMap = m2.w;
            h0.t0 t0VarL = h0.c.l(h0.b.e(jVar3).g, jVar3);
            boolean zE = jVar3.e(aVar.ordinal()) | jVar3.g(n1Var) | ((i5 & 57344) == 16384);
            Object objN = jVar3.N();
            l1.c cVar = l1.i.a;
            if (zE || objN == cVar) {
                float fC2 = n1Var.c();
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    fC = 0;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (y3.f.a(f, fC2) > 0) {
                        fC2 = f;
                    }
                    fC = t0VarL.c() + fC2 + 16;
                }
                objN = oi.k.t(fC, jVar3);
            }
            float f2 = ((y3.f) objN).A;
            boolean zG = jVar3.g(n1Var) | jVar3.g(t0VarL);
            Object objN2 = jVar3.N();
            if (zG || objN2 == cVar) {
                objN2 = oi.k.t(t0VarL.a() + n1Var.a() + 12, jVar3);
            }
            float f3 = ((y3.f) objN2).A;
            boolean zE2 = jVar3.e(aVar.ordinal());
            Object objN3 = jVar3.N();
            if (zE2 || objN3 == cVar) {
                int iOrdinal2 = aVar.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = 16;
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 24;
                }
                objN3 = oi.k.t(i2, jVar3);
            }
            final float f4 = ((y3.f) objN3).A;
            Object objN4 = jVar3.N();
            if (objN4 == cVar) {
                objN4 = new g2.t();
                jVar3.n0(objN4);
            }
            final g2.t tVar = (g2.t) objN4;
            dw.a aVar2 = u0Var.b;
            u30.b bVar = u0Var.d;
            boolean z2 = aVar2 != null && aVar2.c() && ((h00.b) u0Var.c).isEmpty();
            PlayerItem playerItem2 = (PlayerItem) h00.q.N0(bVar);
            String strE = playerItem2 != null ? e(playerItem2) : null;
            PlayerItem playerItem3 = (PlayerItem) h00.q.U0(bVar);
            final String strE2 = playerItem3 != null ? e(playerItem3) : null;
            final long jB = i2.t.b(0.1f, dl.a.i);
            h1 h1VarB = i1.b(jVar3);
            b2.r rVarA = i1.a(rVar.V(z1.c), h1VarB);
            boolean zG2 = ((i5 & 14) == 4) | jVar3.g(strE) | jVar3.g(strE2) | jVar3.d(f4) | jVar3.f(jB);
            Object objN5 = jVar3.N();
            if (zG2 || objN5 == cVar) {
                i3 = 2048;
                final String str = strE;
                u00.k kVar2 = new u00.k() {
                    @Override
                    public final Object invoke(Object obj) {
                        boolean z3;
                        boolean z4;
                        k2.d drawBehind = (k2.d) obj;
                        kotlin.jvm.internal.m.e(drawBehind, "$this$drawBehind");
                        j0.n nVarH = vVar.h();
                        float fA0 = drawBehind.A0(f4);
                        float fA1 = drawBehind.A0(24);
                        ?? r4 = nVarH.k;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = r4.iterator();
                        while (true) {
                            z3 = false;
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (r30.r.x0(((j0.o) next).k.toString(), "playlist_surah_", false)) {
                                arrayList.add(next);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            int i6 = nVarH.l;
                            Iterator it2 = arrayList.iterator();
                            if (!it2.hasNext()) {
                                throw new NoSuchElementException();
                            }
                            int i7 = ((j0.o) it2.next()).o;
                            while (it2.hasNext()) {
                                int i8 = ((j0.o) it2.next()).o;
                                if (i7 > i8) {
                                    i7 = i8;
                                }
                            }
                            float f5 = i7 - i6;
                            Iterator it3 = arrayList.iterator();
                            if (!it3.hasNext()) {
                                throw new NoSuchElementException();
                            }
                            j0.o oVar = (j0.o) it3.next();
                            int i9 = oVar.o + oVar.p;
                            while (it3.hasNext()) {
                                j0.o oVar2 = (j0.o) it3.next();
                                int i11 = oVar2.p + oVar2.o;
                                if (i9 < i11) {
                                    i9 = i11;
                                }
                            }
                            float f6 = i9 - i6;
                            String str2 = str;
                            if (str2 != null && !arrayList.isEmpty()) {
                                Iterator it4 = arrayList.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        z4 = false;
                                        break;
                                    }
                                    if (((j0.o) it4.next()).k.equals(str2)) {
                                        z4 = true;
                                        break;
                                    }
                                }
                            } else {
                                z4 = false;
                                break;
                            }
                            String str3 = strE2;
                            if (str3 != null && !arrayList.isEmpty()) {
                                Iterator it5 = arrayList.iterator();
                                while (it5.hasNext()) {
                                    if (((j0.o) it5.next()).k.equals(str3)) {
                                        z3 = true;
                                        break;
                                    }
                                }
                            }
                            float f7 = z4 ? fA1 : 0.0f;
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
                            if (!z3) {
                                fA1 = 0.0f;
                            }
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fA1)) << 32) | (((long) Float.floatToRawIntBits(fA1)) & 4294967295L);
                            i2.g gVarA = i2.j.a();
                            i2.g.c(gVarA, new h2.d(fA0, f5, Float.intBitsToFloat((int) (drawBehind.b() >> 32)) - fA0, f6, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2));
                            k2.d.X0(drawBehind, gVarA, jB, 0.0f, (k2.e) null, 60);
                        }
                        return g00.b0.a;
                    }
                };
                jVar3.n0(kVar2);
                objN5 = kVar2;
            } else {
                i3 = 2048;
            }
            b2.r rVarE = f2.h.e(rVarA, (u00.k) objN5);
            h1 u1Var = h1VarB != null ? new u1(h1VarB) : null;
            p1 p1VarG = h0.c.g(0.0f, f2, 0.0f, f3, 5);
            h0.f fVarG = h0.i.g(0);
            boolean zE3 = ((i5 & 112) == 32) | jVar3.e(aVar.ordinal()) | ((458752 & i5) == 131072) | jVar3.h(z2) | jVar3.d(f4) | ((i5 & 896) == 256) | ((i5 & 7168) == i3);
            Object objN6 = jVar3.N();
            if (zE3 || objN6 == cVar) {
                i4 = i5;
                final boolean z3 = z2;
                u00.k kVar3 = new u00.k() {
                    @Override
                    public final Object invoke(Object obj) {
                        j0.h LazyColumn = (j0.h) obj;
                        kotlin.jvm.internal.m.e(LazyColumn, "$this$LazyColumn");
                        u0 u0Var2 = u0Var;
                        gm.a aVar3 = aVar;
                        u00.k kVar4 = kVar;
                        boolean z4 = z3;
                        j0.h.q(LazyColumn, "PLAYLIST_HEADER_KEY", new v1.c(new o0(u0Var2, aVar3, kVar4, z4), 1286708067, true), 2);
                        float f5 = f4;
                        if (z4) {
                            j0.h.q(LazyColumn, "PLAYLIST_FAVOURITES_EMPTY_KEY", new v1.c(new p0(f5, 0), -942667970, true), 2);
                        } else {
                            u30.b bVar2 = u0Var2.c;
                            u30.b bVar3 = u0Var2.d;
                            if (!bVar2.isEmpty()) {
                                j0.h.q(LazyColumn, "PLAYLIST_SURAHS_COUNT_KEY", new v1.c(new a0(f5, u0Var2, kVar4), -1936547614, true), 2);
                            }
                            if (u0Var2.k) {
                                j0.h.q(LazyColumn, "PLAYLIST_SURAHS_FILTER_KEY", new v1.c(new a0(f5, u0Var2, kVar4, 1), 652743385, true), 2);
                            }
                            if (aVar3 == gm.a.B && u0Var2.l) {
                                b0 b0Var = new b0(tVar, kVar4, f5, u0Var2, 0);
                                u0Var2 = u0Var2;
                                j0.h.q(LazyColumn, "PLAYLIST_SURAHS_SEARCH_KEY", new v1.c(b0Var, 1300970842, true), 2);
                            }
                            h00.b bVar4 = (h00.b) bVar3;
                            if (bVar4.isEmpty()) {
                                j0.h.q(LazyColumn, "PLAYLIST_SURAHS_LIST_KEY", new v1.c(new c0(f5, u0Var2, 0), 1949198299, true), 2);
                            } else {
                                LazyColumn.r(bVar4.a(), new v2(new a40.t(14, (byte) 0), bVar3, 2), new r0(0, bVar3), new v1.c(new s0(bVar3, u0Var2, f5, aVar3, z, playerItem, kVar4), 2039820996, true));
                            }
                        }
                        return g00.b0.a;
                    }
                };
                jVar3.n0(kVar3);
                objN6 = kVar3;
            } else {
                i4 = i5;
            }
            jVar2 = jVar3;
            k00.f.d(rVarE, vVar, p1VarG, fVarG, null, null, false, u1Var, (u00.k) objN6, jVar2, ((i4 << 3) & 112) | 24576, 232);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new n0(vVar, u0Var, z, playerItem, f, kVar, rVar, i);
        }
    }

    public static final void b(com.mchutov.quranify.home.presentation.screen.playlist.PlaylistLauncher r41, l1.j r42, int r43) {
        throw new UnsupportedOperationException("Method not decompiled: as.a.b(com.mchutov.quranify.home.presentation.screen.playlist.PlaylistLauncher, l1.j, int):void");
    }

    public static final void c(final boolean z, final boolean z2, final float f, final b2.r rVar, final v1.c cVar, l1.j jVar, final int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1582629502);
        int i2 = (g0Var.h(z) ? 4 : 2) | i | (g0Var.h(z2) ? 32 : 16) | (g0Var.d(f) ? 256 : 128) | (g0Var.g(rVar) ? 2048 : 1024);
        if (g0Var.S(i2 & 1, (i2 & 9363) != 9362)) {
            float f2 = 8;
            b2.r rVarF = h0.c.F(h0.c.E(z1.d(rVar, 1.0f), f, 0.0f, 2), f2, z ? f2 : 0, f2, z2 ? f2 : 0);
            z2.w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarF, g0Var);
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
            cVar.invoke(h0.s.a, g0Var, 54);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n(z, z2, f, rVar, cVar, i) {
                public final boolean A;
                public final boolean B;
                public final float C;
                public final b2.r D;
                public final v1.c E;

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(24577);
                    a.c(this.A, this.B, this.C, this.D, this.E, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void d(PlayerItem playerItem, u0 u0Var, gm.a aVar, boolean z, PlayerItem playerItem2, u00.k kVar, l1.j jVar, int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        Object next;
        u00.k kVar2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-10490258);
        int i2 = i | (g0Var.g(playerItem) ? 4 : 2) | (g0Var.g(u0Var) ? 32 : 16) | (g0Var.e(aVar.ordinal()) ? 256 : 128) | (g0Var.h(z) ? 2048 : 1024) | (g0Var.g(playerItem2) ? 16384 : 8192) | (g0Var.i(kVar) ? 131072 : 65536);
        if (g0Var.S(i2 & 1, (74899 & i2) != 74898)) {
            u30.b bVar = u0Var.m;
            if (bVar != null && bVar.isEmpty()) {
                z2 = false;
                break;
            }
            Iterator<E> it = bVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                } else if (((zq.a) it.next()).a == playerItem.getSurahId()) {
                    z2 = true;
                    break;
                }
            }
            u30.b bVar2 = u0Var.o;
            if (bVar2 != null && bVar2.isEmpty()) {
                z3 = false;
                break;
            }
            Iterator<E> it2 = bVar2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z3 = false;
                    break;
                }
                yt.b bVar3 = (yt.b) it2.next();
                if (bVar3.a == playerItem.getReciterId() && bVar3.b == playerItem.getSurahId()) {
                    z3 = true;
                    break;
                }
            }
            boolean z5 = playerItem2 != null && playerItem2.getSurahId() == playerItem.getSurahId() && playerItem2.getReciterId() == playerItem.getReciterId();
            boolean z6 = z5 && z;
            boolean z7 = u0Var.g && !r30.k.L0(playerItem.getPlayerUrl());
            Iterator<E> it3 = u0Var.p.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z4 = z2;
                    next = null;
                    break;
                }
                next = it3.next();
                yt.a aVar2 = (yt.a) next;
                z4 = z2;
                if (aVar2.c == playerItem.getSurahId() && aVar2.b == playerItem.getReciterId()) {
                    break;
                } else {
                    z2 = z4;
                }
            }
            yt.a aVar3 = (yt.a) next;
            int iOrdinal = aVar.ordinal();
            Object obj = l1.i.a;
            if (iOrdinal == 0) {
                boolean z8 = z3;
                g0Var.c0(1019421034);
                boolean z9 = u0Var.n;
                Float f = aVar3 != null ? aVar3.g : null;
                int i3 = 458752 & i2;
                int i4 = i2 & 14;
                boolean z11 = (i3 == 131072) | (i4 == 4);
                Object objN = g0Var.N();
                if (z11 || objN == obj) {
                    kVar2 = kVar;
                    objN = new g0(kVar2, playerItem, 4);
                    g0Var.n0(objN);
                } else {
                    kVar2 = kVar;
                }
                u00.a aVar4 = (u00.a) objN;
                boolean z12 = (i4 == 4) | (i3 == 131072);
                Object objN2 = g0Var.N();
                if (z12 || objN2 == obj) {
                    objN2 = new g0(kVar2, playerItem, 5);
                    g0Var.n0(objN2);
                }
                u00.a aVar5 = (u00.a) objN2;
                boolean z13 = (i3 == 131072) | (i4 == 4);
                Object objN3 = g0Var.N();
                if (z13 || objN3 == obj) {
                    objN3 = new g0(kVar2, playerItem, 6);
                    g0Var.n0(objN3);
                }
                u00.a aVar6 = (u00.a) objN3;
                boolean z14 = (i4 == 4) | (i3 == 131072);
                Object objN4 = g0Var.N();
                if (z14 || objN4 == obj) {
                    objN4 = new g0(kVar2, playerItem, 7);
                    g0Var.n0(objN4);
                }
                u00.a aVar7 = (u00.a) objN4;
                boolean zI = g0Var.i(aVar3) | (i3 == 131072);
                Object objN5 = g0Var.N();
                if (zI || objN5 == obj) {
                    objN5 = new j0(aVar3, kVar2, 1);
                    g0Var.n0(objN5);
                }
                ox.a.g(playerItem, z4, z6, z7, aVar4, aVar5, aVar6, z9, z8, null, z5, true, f, aVar7, (u00.a) objN5, null, g0Var, i4, 48, 33280);
                g0Var = g0Var;
                g0Var.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw oi.k.r(g0Var, -1491173112, false);
                }
                g0Var.c0(1018294990);
                boolean z15 = u0Var.n;
                Float f2 = aVar3 != null ? aVar3.g : null;
                int i5 = 458752 & i2;
                int i6 = i2 & 14;
                boolean z16 = (i6 == 4) | (i5 == 131072);
                Object objN6 = g0Var.N();
                if (z16 || objN6 == obj) {
                    objN6 = new g0(kVar, playerItem, 0);
                    g0Var.n0(objN6);
                }
                u00.a aVar8 = (u00.a) objN6;
                boolean z17 = (i6 == 4) | (i5 == 131072);
                Object objN7 = g0Var.N();
                if (z17 || objN7 == obj) {
                    objN7 = new g0(kVar, playerItem, 1);
                    g0Var.n0(objN7);
                }
                u00.a aVar9 = (u00.a) objN7;
                boolean z18 = (i6 == 4) | (i5 == 131072);
                Object objN8 = g0Var.N();
                if (z18 || objN8 == obj) {
                    objN8 = new g0(kVar, playerItem, 2);
                    g0Var.n0(objN8);
                }
                u00.a aVar10 = (u00.a) objN8;
                boolean z19 = (i5 == 131072) | (i6 == 4);
                Object objN9 = g0Var.N();
                if (z19 || objN9 == obj) {
                    objN9 = new g0(kVar, playerItem, 3);
                    g0Var.n0(objN9);
                }
                u00.a aVar11 = (u00.a) objN9;
                boolean zI2 = g0Var.i(aVar3) | (i5 == 131072);
                Object objN10 = g0Var.N();
                if (zI2 || objN10 == obj) {
                    objN10 = new j0(aVar3, kVar, 0);
                    g0Var.n0(objN10);
                }
                ox.a.b(playerItem, z4, z6, z7, aVar8, aVar9, aVar10, z15, z3, null, true, aVar11, (u00.a) objN10, f2, null, g0Var, i6, 6, 49664);
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new h0(playerItem, u0Var, aVar, z, playerItem2, kVar, i);
        }
    }

    public static final String e(PlayerItem playerItem) {
        return "playlist_surah_" + playerItem.getReciterId() + "_" + playerItem.getSurahId();
    }
}
