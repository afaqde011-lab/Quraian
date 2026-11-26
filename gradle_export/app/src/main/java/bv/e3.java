package bv;

import android.content.SharedPreferences;
import androidx.media3.common.IllegalSeekPositionException;
import com.google.android.gms.internal.measurement.g4;
import com.google.gson.reflect.TypeToken;
import com.mchutov.core.deeplink.presentation.analytics.DeepLinkAnalytics;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;

public final class e3 extends vm.a {
    public a40.u1 A;
    public a40.u1 B;
    public List C;
    public final ce.c D;
    public final d40.t0 E;
    public final uu.a d;
    public final b00.c e;
    public final ht.e f;
    public final ht.b g;
    public final ht.k h;
    public final rt.b i;
    public final rt.f j;
    public final rt.h k;
    public final jt.a l;
    public final aq.a m;
    public final tq.k n;
    public final tx.a o;
    public final xw.k p;
    public final zt.a q;
    public final tt.b r;
    public final vp.x s;
    public final gq.a t;
    public final xx.c u;
    public final oq.b v;
    public final DeepLinkAnalytics w;
    public final xu.f x;
    public final no.g y;
    public a40.u1 z;

    public e3(uu.a aVar, b00.c cVar, ht.e eVar, ht.b bVar, ht.k kVar, rt.b bVar2, rt.f fVar, rt.h hVar, jt.a aVar2, aq.a aVar3, tq.k kVar2, tx.a aVar4, xw.k kVar3, zt.a aVar5, tt.b bVar3, au.a aVar6, vp.x xVar, gq.a aVar7, xx.c cVar2, oq.b bVar4, DeepLinkAnalytics deepLinkAnalytics, xu.f fVar2, no.g gVar) {
        boolean z;
        boolean z2 = fVar2.a.a.getBoolean("playerNew.memorization.didDismissTip", false);
        h00.x xVar2 = h00.x.A;
        u30.b bVarE = ze.d.E(xVar2);
        u30.b bVarE2 = ze.d.E(xVar2);
        u30.b bVarE3 = ze.d.E(xVar2);
        u30.b bVarE4 = ze.d.E(xVar2);
        u30.b bVarE5 = ze.d.E(xVar2);
        yu.g gVar2 = yu.g.A;
        ru.d dVar = ru.d.OFF;
        x30.c cVar3 = x30.c.D;
        super(new o1(0L, 0L, 0.0f, 0.0f, 1.0f, null, false, false, 0, false, false, false, null, bVarE, bVarE2, bVarE3, bVarE4, bVarE5, true, gVar2, false, false, false, false, false, false, false, dVar, false, false, v30.g.B, null, p30.f.d0(), ot.b.c, "", p30.f.d0(), true, null, "", "", new rt.g(null, null, null, 31), 0, false, false, false, false, null, false, null, null, false, null, false, (2097152 & 14680063) != 0 ? true : z2, false, false));
        this.d = aVar;
        this.e = cVar;
        this.f = eVar;
        this.g = bVar;
        this.h = kVar;
        this.i = bVar2;
        this.j = fVar;
        this.k = hVar;
        this.l = aVar2;
        this.m = aVar3;
        this.n = kVar2;
        this.o = aVar4;
        this.p = kVar3;
        this.q = aVar5;
        this.r = bVar3;
        this.s = xVar;
        this.t = aVar7;
        this.u = cVar2;
        this.v = bVar4;
        this.w = deepLinkAnalytics;
        this.x = fVar2;
        this.y = gVar;
        this.C = xVar2;
        this.D = new ce.c(2);
        uu.w wVar = (uu.w) aVar;
        k00.c cVar4 = null;
        ut.p pVar = (ut.p) aVar5;
        int i = 3;
        this.E = d40.o.j(d40.o.k(wVar.E, wVar.D, wVar.F, cVar.i, new o2(5, null)), d40.o.l(wVar.C, wVar.G, wVar.I, new r2(4, null, 0)), d40.o.j(wVar.J, kVar2.c(), cVar.h, cVar.d, wVar.T, new q2(null)), d40.o.k(kVar2.c(), pVar.k(), pVar.j, aVar6.c, new s2(5, null)), new d40.u0(wVar.L, wVar.M, new p2(3, null)), new bt.b1(1, cVar4));
        if (xVar.k()) {
            ((hq.b) aVar7).c();
        }
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, cVar4, 14), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, cVar4, 8), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, cVar4, 13), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, cVar4, 6), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, cVar4, 17), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, cVar4, 18), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, cVar4, i), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, cVar4, 4), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, cVar4, 12), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, cVar4, 7), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, cVar4, 5), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, cVar4, 15), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, cVar4, 2), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, cVar4, 9), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, cVar4, 10), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, cVar4, 11), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, cVar4, 16), 31);
        if (xVar.k()) {
            z = false;
        } else {
            z = false;
            bVar.f("playerNew.showTafsirInLyrics", false);
            boolean zC = bVar.c("playerNew.showQuranInLyrics", true);
            boolean zC2 = bVar.c("playerNew.showTafsirInLyrics", false);
            if (!zC && !zC2) {
                bVar.f("playerNew.showQuranInLyrics", true);
            }
        }
        bVar.a();
        boolean zC3 = bVar.c("playerNew.showQuranInLyrics", true);
        boolean zC4 = bVar.c("playerNew.showTafsirInLyrics", z);
        if (!zC3 && !zC4) {
            bVar.f("playerNew.showQuranInLyrics", true);
        }
        bVar.a();
        o1 o1Var = (o1) this.c.d.getValue();
        ot.b bVar5 = new ot.b(bVar.c("playerNew.showQuranInLyrics", true), bVar.c("playerNew.showTafsirInLyrics", false));
        String string = bVar.a.getString("playerNew.appliedTafsirTranslationId", "");
        i(o1.a(o1Var, 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, bVar5, string == null ? "" : string, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -1, 16777209));
    }

    public static final Object j(e3 e3Var, cy.g gVar, m00.c cVar) throws Throwable {
        q1 q1Var;
        cy.g gVar2;
        f3 f3Var;
        if (cVar instanceof q1) {
            q1Var = (q1) cVar;
            int i = q1Var.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                q1Var.E = i - Integer.MIN_VALUE;
            } else {
                q1Var = new q1(e3Var, cVar);
            }
        } else {
            q1Var = new q1(e3Var, cVar);
        }
        Object objF = q1Var.C;
        Object obj = l00.a.A;
        int i2 = q1Var.E;
        g00.b0 b0Var = g00.b0.a;
        if (i2 == 0) {
            ri.t1.O(objF);
            q1Var.A = gVar;
            q1Var.E = 1;
            objF = e3Var.F(gVar, q1Var);
            if (objF != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            gVar = q1Var.A;
            ri.t1.O(objF);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ri.t1.O(objF);
                return b0Var;
            }
            f3Var = q1Var.B;
            gVar2 = q1Var.A;
            ri.t1.O(objF);
        }
        if (((Boolean) objF).booleanValue()) {
            q1Var.A = null;
            q1Var.B = null;
            q1Var.E = 3;
            if (e3Var.I(gVar2, f3Var, q1Var) != obj) {
                return obj;
            }
            return b0Var;
        }
        e3Var.u.c.j(null);
        return b0Var;
        f3 f3Var2 = (f3) objF;
        if (f3Var2 != null) {
            q1Var.A = gVar;
            q1Var.B = f3Var2;
            q1Var.E = 2;
            Object objW = e3Var.w(q1Var);
            if (objW != obj) {
                gVar2 = gVar;
                f3Var = f3Var2;
                objF = objW;
                if (((Boolean) objF).booleanValue()) {
                    q1Var.A = null;
                    q1Var.B = null;
                    q1Var.E = 3;
                    if (e3Var.I(gVar2, f3Var, q1Var) != obj) {
                        return b0Var;
                    }
                }
            }
            return obj;
        }
        e3Var.u.c.j(null);
        return b0Var;
    }

    public static final void k(e3 e3Var) {
        e3Var.i(o1.a((o1) e3Var.c.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, ru.d.OFF, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -134217729, 16777215));
    }

    public static final Object l(e3 e3Var, long j, int i, m00.c cVar) {
        z1 z1Var;
        long j2;
        ?? r2;
        h00.x xVar;
        g00.b0 b0Var;
        Object objS;
        ?? r84;
        h00.y yVar;
        Integer numY0;
        Map map;
        cy.g gVar;
        pm.b bVar = e3Var.c;
        if (cVar instanceof z1) {
            z1Var = (z1) cVar;
            int i2 = z1Var.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z1Var.E = i2 - Integer.MIN_VALUE;
            } else {
                z1Var = new z1(e3Var, cVar);
            }
        } else {
            z1Var = new z1(e3Var, cVar);
        }
        Object objA = z1Var.C;
        l00.a aVar = l00.a.A;
        int i3 = z1Var.E;
        h00.x xVar2 = h00.x.A;
        g00.b0 b0Var2 = g00.b0.a;
        if (i3 != 0) {
            if (i3 == 1) {
                int i4 = z1Var.B;
                j2 = z1Var.A;
                ri.t1.O(objA);
                r2 = i4;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ri.t1.O(objA);
                b0Var = b0Var2;
            }
            return b0Var;
        }
        ri.t1.O(objA);
        d40.p1 p1Var = bVar.d;
        if (((o1) p1Var.getValue()).H.b) {
            e3Var.i.g = false;
        }
        e3Var.i(o1.a((o1) p1Var.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, g4.d0(xVar2), null, null, null, null, null, !((o1) p1Var.getValue()).H.b, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, 536870911, 16777199));
        ht.e eVar = e3Var.f;
        z1Var.A = j;
        z1Var.B = i;
        z1Var.E = 1;
        objA = eVar.a(j, z1Var);
        if (objA == aVar) {
            return aVar;
        }
        j2 = j;
        r2 = i;
        List list = (List) objA;
        jt.a aVar2 = e3Var.l;
        h00.y yVar2 = h00.y.A;
        if (r2 <= 0) {
            aVar2.getClass();
            xVar = xVar2;
            b0Var = b0Var2;
            map = yVar2;
        } else {
            ConcurrentHashMap concurrentHashMap = aVar2.c;
            Integer numValueOf = Integer.valueOf((int) r2);
            Object obj = concurrentHashMap.get(numValueOf);
            if (obj == null) {
                xVar = xVar2;
                try {
                    b0Var = b0Var2;
                    try {
                        try {
                            InputStream inputStreamOpen = aVar2.a.getAssets().open("surah/surah_" + r2 + ".json");
                            try {
                                bk.m mVar = aVar2.b;
                                kotlin.jvm.internal.m.b(inputStreamOpen);
                                Map verse = ((ft.d) mVar.c(new InputStreamReader(inputStreamOpen, r30.a.a), TypeToken.get(ft.d.class))).getVerse();
                                Map map2 = verse;
                                if (verse == null) {
                                    map2 = yVar2;
                                }
                                ArrayList arrayList = new ArrayList();
                                Iterator it = map2.entrySet().iterator();
                                yVar2 = yVar2;
                                while (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    Iterator it2 = it;
                                    String str = (String) entry.getKey();
                                    yVar = yVar2;
                                    try {
                                        g00.k kVar = (r30.r.x0(str, "verse_", false) && (numY0 = r30.r.y0(r30.k.R0(str, "verse_"))) != null) ? new g00.k(numY0, (String) entry.getValue()) : null;
                                        if (kVar != null) {
                                            arrayList.add(kVar);
                                        }
                                        it = it2;
                                        yVar2 = yVar;
                                    } catch (Throwable th) {
                                        th = th;
                                        i = yVar;
                                        Throwable th2 = th;
                                        try {
                                            throw th2;
                                        } catch (Throwable th3) {
                                            ta.c0.C(inputStreamOpen, th2);
                                            throw th3;
                                        }
                                    }
                                }
                                yVar = yVar2;
                                objS = h00.d0.Y(arrayList);
                                inputStreamOpen.close();
                                r84 = yVar;
                            } catch (Throwable th4) {
                                th = th4;
                                i = yVar2;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            objS = ri.t1.s(th);
                            r84 = i;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        i = yVar2;
                        objS = ri.t1.s(th);
                        r84 = i;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    b0Var = b0Var2;
                }
                Map map3 = (Map) (g00.n.a(objS) == null ? objS : r84);
                Object objPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, map3);
                obj = objPutIfAbsent == null ? map3 : objPutIfAbsent;
            } else {
                xVar = xVar2;
                b0Var = b0Var2;
            }
            map = (Map) obj;
        }
        u30.f fVarE0 = g4.e0(map);
        if (list.isEmpty()) {
            e3Var.i(o1.a((o1) bVar.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, g4.d0(xVar), null, fVarE0, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, 268435455, 16777214));
        } else {
            cy.g gVar2 = (cy.g) e3Var.u.c.getValue();
            if (gVar2 != null && gVar2.a == r2 && !list.isEmpty()) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        gVar = null;
                        break;
                    }
                    if (((ot.a) it3.next()).a == gVar2.b) {
                        gVar = gVar2;
                        break;
                    }
                }
            } else {
                gVar = null;
                break;
            }
            Integer num = gVar != null ? new Integer(gVar.b) : c7.i.T(((o1) bVar.d.getValue()).a, list);
            d40.p1 p1Var2 = bVar.d;
            e3Var.i(o1.a((o1) p1Var2.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, true, g4.d0(list), num, fVarE0, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, 536870911, 16777214));
            if (((o1) p1Var2.getValue()).H.b) {
                String str2 = ((o1) p1Var2.getValue()).I;
                z1Var.A = j2;
                z1Var.B = r2;
                z1Var.E = 2;
                if (e3Var.D(r2, true, str2, z1Var) == aVar) {
                    return aVar;
                }
            }
        }
        return b0Var;
    }

    public static final void m(e3 e3Var, List list) {
        pm.b bVar = e3Var.c;
        if (list.isEmpty()) {
            return;
        }
        String strB = e3Var.k.b(((o1) bVar.d.getValue()).I, list);
        if (kotlin.jvm.internal.m.a(strB, ((o1) bVar.d.getValue()).I)) {
            return;
        }
        e3Var.g.d(strB);
    }

    public static final Object n(e3 e3Var, PlayerItem playerItem, m00.c cVar) {
        u2 u2Var;
        Object next;
        boolean z;
        bx.b bVarA;
        u30.b bVar;
        e3Var.getClass();
        if (cVar instanceof u2) {
            u2Var = (u2) cVar;
            int i = u2Var.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                u2Var.D = i - Integer.MIN_VALUE;
            } else {
                u2Var = new u2(e3Var, cVar);
            }
        } else {
            u2Var = new u2(e3Var, cVar);
        }
        Object objD = u2Var.B;
        l00.a aVar = l00.a.A;
        int i2 = u2Var.D;
        if (i2 == 0) {
            ri.t1.O(objD);
            Iterator<E> it = ((o1) e3Var.c.d.getValue()).p.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((zq.a) next).a != playerItem.getSurahId());
            zq.a aVar2 = (zq.a) next;
            if (aVar2 != null) {
                return aVar2;
            }
            xw.k kVar = e3Var.p;
            int reciterId = playerItem.getReciterId();
            u2Var.A = playerItem;
            u2Var.D = 1;
            objD = kVar.d(reciterId, u2Var);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            playerItem = u2Var.A;
            ri.t1.O(objD);
        }
        bx.c cVar2 = (bx.c) objD;
        if (cVar2 != null && (bVarA = cVar2.a()) != null && (bVar = bVarA.e) != null && !bVar.isEmpty()) {
            Iterator<E> it2 = bVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                if (((bx.f) it2.next()).a == playerItem.getSurahId()) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        return new zq.a(playerItem.getSurahId(), playerItem.getReciterId(), z, z ? null : playerItem.getCollectionId());
    }

    public final void A(final b bVar) throws IllegalSeekPositionException {
        z00.e eVar;
        int iIntValue;
        int i;
        su.e eVar2;
        boolean z = bVar instanceof i0;
        xu.f fVar = this.x;
        pm.b bVar2 = this.c;
        if (!z) {
            if (bVar instanceof o) {
                i(o1.a((o1) bVar2.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -1, 16252927));
                return;
            }
            if (bVar instanceof z) {
                final int i2 = 0;
                M(new u00.k() {
                    @Override
                    public final Object invoke(Object obj) {
                        yu.a it = (yu.a) obj;
                        switch (i2) {
                            case 0:
                                kotlin.jvm.internal.m.e(it, "it");
                                int iZ = ab.a0.z(((z) bVar).a, it.a);
                                return yu.a.a(it, iZ, Math.max(it.c, iZ), null, 25);
                            case 1:
                                kotlin.jvm.internal.m.e(it, "it");
                                return yu.a.a(it, 0, ab.a0.y(((d0) bVar).a, it.b, it.a.B), null, 27);
                            default:
                                kotlin.jvm.internal.m.e(it, "it");
                                su.e count = ((a0) bVar).a;
                                kotlin.jvm.internal.m.e(count, "count");
                                return yu.a.a(it, 0, 0, count, 23);
                        }
                    }
                });
                return;
            }
            if (bVar instanceof d0) {
                final int i3 = 1;
                M(new u00.k() {
                    @Override
                    public final Object invoke(Object obj) {
                        yu.a it = (yu.a) obj;
                        switch (i3) {
                            case 0:
                                kotlin.jvm.internal.m.e(it, "it");
                                int iZ = ab.a0.z(((z) bVar).a, it.a);
                                return yu.a.a(it, iZ, Math.max(it.c, iZ), null, 25);
                            case 1:
                                kotlin.jvm.internal.m.e(it, "it");
                                return yu.a.a(it, 0, ab.a0.y(((d0) bVar).a, it.b, it.a.B), null, 27);
                            default:
                                kotlin.jvm.internal.m.e(it, "it");
                                su.e count = ((a0) bVar).a;
                                kotlin.jvm.internal.m.e(count, "count");
                                return yu.a.a(it, 0, 0, count, 23);
                        }
                    }
                });
                return;
            }
            if (bVar instanceof a0) {
                final int i4 = 2;
                M(new u00.k() {
                    @Override
                    public final Object invoke(Object obj) {
                        yu.a it = (yu.a) obj;
                        switch (i4) {
                            case 0:
                                kotlin.jvm.internal.m.e(it, "it");
                                int iZ = ab.a0.z(((z) bVar).a, it.a);
                                return yu.a.a(it, iZ, Math.max(it.c, iZ), null, 25);
                            case 1:
                                kotlin.jvm.internal.m.e(it, "it");
                                return yu.a.a(it, 0, ab.a0.y(((d0) bVar).a, it.b, it.a.B), null, 27);
                            default:
                                kotlin.jvm.internal.m.e(it, "it");
                                su.e count = ((a0) bVar).a;
                                kotlin.jvm.internal.m.e(count, "count");
                                return yu.a.a(it, 0, 0, count, 23);
                        }
                    }
                });
                return;
            }
            if (!(bVar instanceof y)) {
                if (bVar instanceof x) {
                    i(o1.a((o1) bVar2.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -1, 15728639));
                    return;
                } else if (bVar instanceof b0) {
                    u();
                    return;
                } else {
                    if (!(bVar instanceof c0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i(o1.a((o1) bVar2.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -1, 14680063));
                    return;
                }
            }
            yu.e eVar3 = ((y) bVar).a;
            i(o1.a((o1) bVar2.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -1, 16252927));
            if (eVar3 instanceof yu.c) {
                PlayerItem playerItem = ((o1) bVar2.d.getValue()).f;
                if (playerItem == null) {
                    return;
                }
                ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new a1.e2(this, eVar3, new su.d(playerItem.getSurahNumber(), playerItem.getSurahId(), playerItem.getReciterId()), (k00.c) null, 8), 31);
                return;
            }
            if (!(eVar3 instanceof yu.d)) {
                if (!(eVar3 instanceof yu.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                fVar.c();
                return;
            }
            su.e count = ((yu.d) eVar3).a;
            fVar.getClass();
            kotlin.jvm.internal.m.e(count, "count");
            su.s sVarD = fVar.d();
            if (sVarD == null) {
                return;
            }
            fVar.k(su.s.c(sVarD, new su.c(sVarD.a.a, count), null, null, 0, false, null, 126), true);
            return;
        }
        o1 o1Var = (o1) bVar2.d.getValue();
        if (!this.s.k()) {
            i(o1.a(o1Var, 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -67108865, 16777215));
            ((bq.a) this.m).f(true, zp.b.MEMORIZATION);
            return;
        }
        boolean zB = o1Var.b();
        u30.b bVar3 = o1Var.E;
        if (zB) {
            Iterator<E> it = bVar3.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            int i5 = ((ot.a) it.next()).a;
            while (it.hasNext()) {
                int i6 = ((ot.a) it.next()).a;
                if (i5 > i6) {
                    i5 = i6;
                }
            }
            Iterator<E> it2 = bVar3.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            int i7 = ((ot.a) it2.next()).a;
            while (it2.hasNext()) {
                int i8 = ((ot.a) it2.next()).a;
                if (i7 < i8) {
                    i7 = i8;
                }
            }
            eVar = new z00.e(i5, i7, 1);
        } else {
            su.c cVar = o1Var.W;
            if (cVar != null) {
                su.b bVar4 = cVar.a;
                eVar = new z00.e(bVar4.a, bVar4.b, 1);
            } else {
                eVar = null;
            }
        }
        if (eVar == null) {
            return;
        }
        Integer num = o1Var.F;
        PlayerItem playerItem2 = o1Var.f;
        su.b bVar5 = playerItem2 != null ? (su.b) fVar.a.b().get(Integer.valueOf(playerItem2.getSurahNumber())) : null;
        su.c cVar2 = o1Var.W;
        if (cVar2 != null) {
            iIntValue = cVar2.a.a;
        } else if (bVar5 != null) {
            iIntValue = bVar5.a;
        } else {
            iIntValue = num != null ? num.intValue() : eVar.A;
        }
        int iZ = ab.a0.z(iIntValue, eVar);
        if (cVar2 != null) {
            i = cVar2.a.b;
        } else {
            i = bVar5 != null ? bVar5.b : iZ + 10;
        }
        int iY = ab.a0.y(i, iZ, eVar.B);
        if (cVar2 == null || (eVar2 = cVar2.b) == null) {
            su.e.B.getClass();
            eVar2 = su.e.C;
        }
        i(o1.a(o1Var, 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, new yu.a(eVar, iZ, iY, eVar2, cVar2), false, false, false, -67108865, 16252927));
    }

    public final void B() {
        pm.b bVar = this.c;
        if (((h00.b) ((o1) bVar.d.getValue()).E).isEmpty()) {
            return;
        }
        i(o1.a((o1) bVar.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, true, null, null, false, null, false, false, false, -1, 16744447));
    }

    public final void C(ot.e eVar) {
        pm.b bVar = this.c;
        int iOrdinal = ((o1) bVar.d.getValue()).t.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            i(o1.a((o1) bVar.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, eVar, false, null, null, false, null, false, false, false, -1, 16760831));
        } else {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new a1.d(this, eVar, (k00.c) null, 17), 31);
        }
    }

    public final java.lang.Object D(int r73, boolean r74, java.lang.String r75, m00.c r76) {
        throw new UnsupportedOperationException("Method not decompiled: bv.e3.D(int, boolean, java.lang.String, m00.c):java.lang.Object");
    }

    public final g00.k E(String str) {
        Object next;
        Iterator it = this.C.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.m.a(((ot.o) next).a, str));
        ot.o oVar = (ot.o) next;
        String str2 = oVar != null ? oVar.c : null;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = oVar != null ? oVar.d : null;
        return new g00.k(str2, str3 != null ? str3 : "");
    }

    public final Object F(cy.g gVar, m00.c cVar) throws Throwable {
        v2 v2Var;
        Object next;
        if (cVar instanceof v2) {
            v2Var = (v2) cVar;
            int i = v2Var.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                v2Var.D = i - Integer.MIN_VALUE;
            } else {
                v2Var = new v2(this, cVar);
            }
        } else {
            v2Var = new v2(this, cVar);
        }
        Object objG = v2Var.B;
        Object obj = l00.a.A;
        int i2 = v2Var.D;
        if (i2 == 0) {
            ri.t1.O(objG);
            v2Var.A = gVar;
            v2Var.D = 1;
            objG = G(gVar, v2Var);
            if (objG == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = v2Var.A;
            ri.t1.O(objG);
        }
        List list = (List) objG;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((ot.a) next).a != gVar.b);
            ot.a aVar = (ot.a) next;
            if (aVar != null) {
                return new f3(list, aVar);
            }
        }
        return null;
    }

    public final Object G(cy.g gVar, m00.c cVar) throws Throwable {
        w2 w2Var;
        cy.g gVar2;
        int i;
        List list;
        Iterator it;
        Object objL;
        if (cVar instanceof w2) {
            w2Var = (w2) cVar;
            int i2 = w2Var.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w2Var.E = i2 - Integer.MIN_VALUE;
            } else {
                w2Var = new w2(this, cVar);
            }
        } else {
            w2Var = new w2(this, cVar);
        }
        Object objP = w2Var.C;
        Object obj = l00.a.A;
        int i3 = w2Var.E;
        int i4 = 1;
        if (i3 == 0) {
            ri.t1.O(objP);
            int i5 = gVar.a;
            w2Var.A = gVar;
            w2Var.E = 1;
            objP = p(i5, w2Var);
            if (objP != obj) {
            }
            return obj;
        }
        if (i3 == 1) {
            gVar = w2Var.A;
            ri.t1.O(objP);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ri.t1.O(objP);
                return objP;
            }
            i = w2Var.B;
            gVar2 = w2Var.A;
            ri.t1.O(objP);
        }
        list = (List) objP;
        if (list != null || !list.isEmpty()) {
            it = list.iterator();
            while (it.hasNext()) {
                if (((ot.a) it.next()).a == gVar2.b) {
                    return list;
                }
            }
        }
        if (!list.isEmpty()) {
            w2Var.A = null;
            w2Var.B = i;
            w2Var.E = 3;
            objL = a40.c0.L(HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS, new a1.e2(this, gVar2, (k00.c) null, 7), w2Var);
            if (objL != obj) {
                return obj;
            }
            return objL;
        }
        return null;
        PlayerItem playerItem = (PlayerItem) objP;
        if (playerItem != null) {
            pm.b bVar = this.c;
            u30.b bVar2 = ((o1) bVar.d.getValue()).E;
            PlayerItem playerItem2 = ((o1) bVar.d.getValue()).f;
            if (playerItem2 != null && playerItem2.getSurahNumber() == gVar.a && (bVar2 == null || !bVar2.isEmpty())) {
                Iterator<E> it2 = bVar2.iterator();
                do {
                    if (!it2.hasNext()) {
                        i4 = 0;
                        break;
                    }
                } while (((ot.a) it2.next()).a != gVar.b);
            } else {
                i4 = 0;
                break;
            }
            if (i4 != 0) {
                return bVar2;
            }
            long surahId = playerItem.getSurahId();
            w2Var.A = gVar;
            w2Var.B = i4;
            w2Var.E = 2;
            objP = this.f.a(surahId, w2Var);
            if (objP != obj) {
                gVar2 = gVar;
                i = i4;
                list = (List) objP;
                if (list != null) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        if (((ot.a) it.next()).a == gVar2.b) {
                            return list;
                        }
                    }
                } else {
                    it = list.iterator();
                    while (it.hasNext()) {
                        if (((ot.a) it.next()).a == gVar2.b) {
                            return list;
                        }
                    }
                }
                if (!list.isEmpty()) {
                    w2Var.A = null;
                    w2Var.B = i;
                    w2Var.E = 3;
                    objL = a40.c0.L(HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS, new a1.e2(this, gVar2, (k00.c) null, 7), w2Var);
                    if (objL != obj) {
                        return objL;
                    }
                }
            }
            return obj;
        }
        return null;
    }

    public final void H(int i) {
        Object next;
        pm.b bVar = this.c;
        d40.p1 p1Var = bVar.d;
        d40.p1 p1Var2 = bVar.d;
        boolean z = ((o1) p1Var.getValue()).Q;
        ce.c cVar = this.D;
        if (z && ((o1) p1Var2.getValue()).x) {
            cVar.F();
            return;
        }
        cVar.C();
        Iterator<E> it = ((o1) p1Var2.getValue()).E.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ot.a) next).a != i);
        ot.a aVar = (ot.a) next;
        if (aVar == null) {
            return;
        }
        ((uu.w) this.d).z(aVar.b);
    }

    public final java.lang.Object I(cy.g r75, bv.f3 r76, m00.c r77) {
        throw new UnsupportedOperationException("Method not decompiled: bv.e3.I(cy.g, bv.f3, m00.c):java.lang.Object");
    }

    public final void J() {
        i(o1.a((o1) this.c.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, ru.d.OFF, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -167772161, 16777215));
    }

    public final void K(ru.d dVar) {
        q();
        int iOrdinal = dVar.ordinal();
        if (iOrdinal == 0) {
            J();
            return;
        }
        pm.b bVar = this.c;
        if (iOrdinal != 8) {
            Long l = dVar.A;
            if (l != null) {
                long jLongValue = l.longValue();
                i(o1.a((o1) bVar.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, dVar, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -167772161, 16777215));
                this.z = ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new b3(jLongValue, this, (k00.c) null), 31);
                return;
            }
            return;
        }
        PlayerItem playerItem = (PlayerItem) ((uu.w) this.d).C.getValue();
        if (playerItem == null) {
            J();
            return;
        }
        long surahId = playerItem.getSurahId();
        i(o1.a((o1) bVar.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, ru.d.WHEN_SURAH_ENDS, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -167772161, 16777215));
        this.z = ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new b3(this, surahId, (k00.c) null), 31);
    }

    public final void L() {
        pm.b bVar = this.c;
        g00.k kVarE = E(((o1) bVar.d.getValue()).I);
        i(o1.a((o1) bVar.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, (String) kVarE.A, (String) kVarE.B, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -1, 16777023));
    }

    public final void M(u00.k kVar) {
        pm.b bVar = this.c;
        yu.a aVar = ((o1) bVar.d.getValue()).Z;
        if (aVar == null) {
            return;
        }
        i(o1.a((o1) bVar.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, (yu.a) kVar.invoke(aVar), false, false, false, -1, 16252927));
    }

    public final void o(g1 action) {
        yu.g gVar;
        kotlin.jvm.internal.m.e(action, "action");
        boolean z = action instanceof e;
        pm.b bVar = this.c;
        if (z) {
            if (((e) action).a.getShowTrackList()) {
                i(o1.a((o1) bVar.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, true, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -6291457, 16777215));
                return;
            }
            return;
        }
        if (action instanceof d) {
            i(o1.a((o1) bVar.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, ((d) action).a, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -524289, 16777215));
            return;
        }
        if (action instanceof w0) {
            o1 o1Var = (o1) bVar.d.getValue();
            boolean z2 = o1Var.v;
            i(o1.a(o1Var, 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, !z2, z2 ? o1Var.w : false, false, false, false, false, null, (z2 || (gVar = o1Var.t) == yu.g.C || gVar == yu.g.B) ? o1Var.C : false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -274726913, 16777215));
            return;
        }
        if (action instanceof c1) {
            d40.p1 p1Var = bVar.d;
            boolean z3 = ((o1) p1Var.getValue()).w;
            i(o1.a((o1) p1Var.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, z3 ? ((o1) p1Var.getValue()).v : false, !z3, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -6291457, 16777215));
            return;
        }
        k00.c cVar = null;
        if (action instanceof s0) {
            o1 o1Var2 = (o1) bVar.d.getValue();
            if (o1Var2.D) {
                if (o1Var2.C) {
                    i(o1.a(o1Var2, 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -268435457, 16777215));
                    return;
                } else {
                    ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new a1.c0(this, o1Var2, (k00.c) null, 9), 31);
                    return;
                }
            }
            return;
        }
        if (action instanceof s) {
            H(((s) action).a);
            return;
        }
        if (action instanceof q0) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, cVar, 22), 31);
            return;
        }
        if (action instanceof f0) {
            yu.g gVar2 = ((o1) bVar.d.getValue()).t;
            if (gVar2 == yu.g.B || gVar2 == yu.g.C) {
                i(o1.a((o1) bVar.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, true, false, null, false, null, null, false, null, false, false, false, -1, 16773119));
                return;
            } else {
                ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, cVar, 19), 31);
                return;
            }
        }
        if (action instanceof m) {
            i(o1.a((o1) bVar.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -1, 16773119));
            return;
        }
        if (action instanceof q) {
            i(o1.a((o1) bVar.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -1, 16769023));
            return;
        }
        if (action instanceof g0) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, cVar, 20), 31);
            return;
        }
        if (action instanceof r0) {
            PlayerItem playerItem = ((o1) bVar.d.getValue()).f;
            if (playerItem == null) {
                return;
            }
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new d3(this, playerItem, ((o1) bVar.d.getValue()).j, (k00.c) null), 31);
            return;
        }
        if (action instanceof o0) {
            PlayerItem playerItem2 = ((o1) bVar.d.getValue()).f;
            if (playerItem2 == null) {
                return;
            }
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new c3(this, playerItem2, null), 31);
            return;
        }
        boolean z4 = action instanceof a1;
        uu.a aVar = this.d;
        if (z4) {
            uu.w wVar = (uu.w) aVar;
            wVar.getClass();
            wVar.v(false, new d40.l1(2, null, 15));
            return;
        }
        if (action instanceof z0) {
            uu.w wVar2 = (uu.w) aVar;
            wVar2.getClass();
            wVar2.v(false, new d40.l1(2, null, 14));
            return;
        }
        if (action instanceof t0) {
            ((uu.w) aVar).p();
            return;
        }
        if (action instanceof l0) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new v1(this, ((l0) action).a, cVar, 1), 31);
            return;
        }
        if (action instanceof e1) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new a1.e2(this, ((e1) action).a, (k00.c) null, 9), 31);
            return;
        }
        if (action instanceof r) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new v1(this, ((r) action).a, cVar, 0), 31);
            return;
        }
        if (action instanceof f) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new a1.d(this, ((f) action).a, (k00.c) null, 15), 31);
            return;
        }
        if (action instanceof g) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new t1(this, ((g) action).a, cVar, 0), 31);
            return;
        }
        if (action instanceof h) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new t1(this, ((h) action).a, cVar, 1), 31);
            return;
        }
        if (action instanceof y0) {
            yu.g gVar3 = ((o1) bVar.d.getValue()).t;
            if (gVar3 == yu.g.B || gVar3 == yu.g.C) {
                i(o1.a((o1) bVar.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, true, null, false, null, null, false, null, false, false, false, -1, 16769023));
                return;
            } else {
                ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, cVar, 23), 31);
                return;
            }
        }
        if (action instanceof u0) {
            i(o1.a((o1) bVar.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, !((o1) bVar.d.getValue()).y, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -16777217, 16777215));
            return;
        }
        if (action instanceof m0) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y2(this, ((m0) action).a, cVar, 0), 31);
            return;
        }
        if (action instanceof b1) {
            i(o1.a((o1) bVar.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, !((o1) bVar.d.getValue()).z, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -33554433, 16777215));
            return;
        }
        if (action instanceof v0) {
            d40.p1 p1Var2 = bVar.d;
            if (((o1) p1Var2.getValue()).Y && !this.x.a.a.getBoolean("playerNew.memorization.didDismissTip", false)) {
                u();
            }
            i(o1.a((o1) p1Var2.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, !((o1) p1Var2.getValue()).A, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -67108865, 16777215));
            return;
        }
        boolean z5 = action instanceof j;
        ce.c cVar2 = this.D;
        if (z5) {
            cVar2.C();
            return;
        }
        if (action instanceof i) {
            if (((o1) bVar.d.getValue()).x) {
                cVar2.F();
                return;
            } else {
                cVar2.C();
                return;
            }
        }
        if (action instanceof n0) {
            a40.u1 u1Var = this.A;
            if (u1Var != null) {
                u1Var.i(null);
            }
            this.A = ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, cVar, 21), 31);
            return;
        }
        if (action instanceof t) {
            cVar2.F();
            return;
        }
        if (action instanceof v) {
            boolean z6 = ((v) action).a;
            d40.p1 p1Var3 = (d40.p1) cVar2.C;
            Boolean boolValueOf = Boolean.valueOf(z6);
            p1Var3.getClass();
            p1Var3.k(null, boolValueOf);
            return;
        }
        if (action instanceof w) {
            if (!((w) action).a) {
                cVar2.F();
                return;
            } else {
                if (((cv.a) cVar2.E).a) {
                    d40.p1 p1Var4 = (d40.p1) cVar2.B;
                    Boolean bool = Boolean.TRUE;
                    p1Var4.getClass();
                    p1Var4.k(null, bool);
                    return;
                }
                return;
            }
        }
        if (action instanceof p0) {
            K(((p0) action).a);
            return;
        }
        boolean z7 = action instanceof h0;
        ht.b bVar2 = this.g;
        if (z7) {
            if (!this.s.k()) {
                bVar2.f("playerNew.showTafsirInLyrics", false);
                boolean zC = bVar2.c("playerNew.showQuranInLyrics", true);
                boolean zC2 = bVar2.c("playerNew.showTafsirInLyrics", false);
                if (!zC && !zC2) {
                    bVar2.f("playerNew.showQuranInLyrics", true);
                }
            }
            bVar2.a();
            boolean zC3 = bVar2.c("playerNew.showQuranInLyrics", true);
            boolean zC4 = bVar2.c("playerNew.showTafsirInLyrics", false);
            if (!zC3 && !zC4) {
                bVar2.f("playerNew.showQuranInLyrics", true);
            }
            bVar2.a();
            i(o1.a((o1) bVar.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, true, false, false, null, false, null, null, false, null, false, false, false, -1, 16775167));
            z();
            return;
        }
        if (action instanceof n) {
            i(o1.a((o1) bVar.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -1, 16775167));
            return;
        }
        if (action instanceof x0) {
            if (y()) {
                boolean zC5 = bVar2.c("playerNew.showQuranInLyrics", true);
                boolean zC6 = bVar2.c("playerNew.showTafsirInLyrics", false);
                if (zC5) {
                    bVar2.f("playerNew.showQuranInLyrics", false);
                    if (!zC6) {
                        bVar2.f("playerNew.showTafsirInLyrics", true);
                    }
                } else {
                    bVar2.f("playerNew.showQuranInLyrics", true);
                }
                bVar2.a();
                return;
            }
            return;
        }
        if (action instanceof d1) {
            if (y()) {
                boolean zC7 = bVar2.c("playerNew.showQuranInLyrics", true);
                if (!bVar2.c("playerNew.showTafsirInLyrics", false)) {
                    bVar2.f("playerNew.showTafsirInLyrics", true);
                } else if (zC7) {
                    bVar2.f("playerNew.showTafsirInLyrics", false);
                } else {
                    bVar2.f("playerNew.showQuranInLyrics", true);
                }
                bVar2.a();
                return;
            }
            return;
        }
        if (action instanceof j0) {
            if (y()) {
                C(ot.e.TAFSIR);
                return;
            }
            return;
        }
        if (action instanceof k0) {
            if (y()) {
                C(ot.e.TRANSCRIPTION);
                return;
            }
            return;
        }
        if (action instanceof f1) {
            ot.d script = ((f1) action).a;
            if (script == ((o1) this.c.d.getValue()).O.a || !y()) {
                return;
            }
            ht.b bVar3 = this.g;
            bVar3.getClass();
            kotlin.jvm.internal.m.e(script, "script");
            SharedPreferences.Editor editorEdit = bVar3.a.edit();
            editorEdit.putString("playerNew.verseScript", script.name());
            editorEdit.apply();
            d40.p1 p1Var5 = bVar3.f;
            p1Var5.getClass();
            p1Var5.k(null, script);
            return;
        }
        if (action instanceof u) {
            int i = ((u) action).a;
            if (i == ((o1) this.c.d.getValue()).P || !y()) {
                return;
            }
            ht.b bVar4 = this.g;
            bVar4.getClass();
            int iY = ab.a0.y(i, 0, ot.c.d - 1);
            SharedPreferences.Editor editorEdit2 = bVar4.a.edit();
            editorEdit2.putInt("playerNew.lyricsTextSizeStep", iY);
            editorEdit2.apply();
            d40.p1 p1Var6 = bVar4.g;
            Integer numValueOf = Integer.valueOf(iY);
            p1Var6.getClass();
            p1Var6.k(null, numValueOf);
            return;
        }
        if (action instanceof k) {
            boolean z8 = ((k) action).a;
            if (z8 == ((o1) this.c.d.getValue()).Q || !y()) {
                return;
            }
            ht.b bVar5 = this.g;
            bVar5.f("playerNew.cinematicMode", z8);
            d40.p1 p1Var7 = bVar5.h;
            Boolean boolValueOf2 = Boolean.valueOf(z8);
            p1Var7.getClass();
            p1Var7.k(null, boolValueOf2);
            return;
        }
        if (action instanceof p) {
            v();
            return;
        }
        if (action instanceof e0) {
            B();
            return;
        }
        if (action instanceof l) {
            t();
        } else if (action instanceof c) {
            s(((c) action).a);
        } else {
            if (!(action instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            A((b) action);
        }
    }

    public final Object p(int i, m00.c cVar) throws Throwable {
        r1 r1Var;
        PlayerItem playerItem;
        if (cVar instanceof r1) {
            r1Var = (r1) cVar;
            int i2 = r1Var.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r1Var.D = i2 - Integer.MIN_VALUE;
            } else {
                r1Var = new r1(this, cVar);
            }
        } else {
            r1Var = new r1(this, cVar);
        }
        Object objL = r1Var.B;
        l00.a aVar = l00.a.A;
        int i3 = r1Var.D;
        uu.a aVar2 = this.d;
        if (i3 == 0) {
            ri.t1.O(objL);
            PlayerItem playerItem2 = (PlayerItem) ((uu.w) aVar2).C.getValue();
            if (playerItem2 == null || playerItem2.getSurahNumber() == i) {
                playerItem = (PlayerItem) ((uu.w) aVar2).C.getValue();
                if (playerItem == null && playerItem.getSurahNumber() == i) {
                    return playerItem;
                }
            } else {
                a1.p1 p1Var = new a1.p1(this, i, (k00.c) null, 2);
                r1Var.A = i;
                r1Var.D = 1;
                objL = a40.c0.L(HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS, p1Var, r1Var);
                if (objL == aVar) {
                    return aVar;
                }
            }
            return null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = r1Var.A;
        ri.t1.O(objL);
        if (((PlayerItem) objL) != null) {
            playerItem = (PlayerItem) ((uu.w) aVar2).C.getValue();
            if (playerItem == null) {
            }
        }
        return null;
    }

    public final void q() {
        a40.u1 u1Var = this.z;
        if (u1Var != null) {
            u1Var.i(null);
        }
        this.z = null;
    }

    public final Object r(m00.c cVar) {
        u1 u1Var;
        if (cVar instanceof u1) {
            u1Var = (u1) cVar;
            int i = u1Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                u1Var.C = i - Integer.MIN_VALUE;
            } else {
                u1Var = new u1(this, cVar);
            }
        } else {
            u1Var = new u1(this, cVar);
        }
        Object obj = u1Var.A;
        l00.a aVar = l00.a.A;
        int i2 = u1Var.C;
        if (i2 == 0) {
            ri.t1.O(obj);
            u1Var.C = 1;
            if (this.i.a("", u1Var, false) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
        }
        i(o1.a((o1) this.c.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, g4.e0(h00.y.A), true, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -1, 16777159));
        return g00.b0.a;
    }

    public final void s(int i) {
        i(o1.a((o1) this.c.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, Integer.valueOf(i), null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, Integer.MAX_VALUE, 16744447));
        H(i);
    }

    public final void t() {
        i(o1.a((o1) this.c.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -1, 16744447));
    }

    public final void u() {
        oi.k.v(this.x.a.a, "playerNew.memorization.didDismissTip", true);
        i(o1.a((o1) this.c.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -1, 14680063));
    }

    public final void v() {
        i(o1.a((o1) this.c.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -1, 16760831));
    }

    public final Object w(m00.c cVar) throws Throwable {
        w1 w1Var;
        if (cVar instanceof w1) {
            w1Var = (w1) cVar;
            int i = w1Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                w1Var.C = i - Integer.MIN_VALUE;
            } else {
                w1Var = new w1(this, cVar);
            }
        } else {
            w1Var = new w1(this, cVar);
        }
        Object objL = w1Var.A;
        l00.a aVar = l00.a.A;
        int i2 = w1Var.C;
        if (i2 == 0) {
            ri.t1.O(objL);
            y1 y1Var = new y1(this, null, 0);
            w1Var.C = 1;
            objL = a40.c0.L(HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS, y1Var, w1Var);
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(objL);
        }
        return Boolean.valueOf(kotlin.jvm.internal.m.a(objL, Boolean.TRUE) && a40.c0.w(w1Var.getContext()));
    }

    public final Boolean x(cy.g gVar, x2 x2Var) {
        return Boolean.valueOf(a40.c0.w(x2Var.getContext()) && kotlin.jvm.internal.m.a(this.u.c.getValue(), gVar));
    }

    public final boolean y() {
        if (this.s.k()) {
            return true;
        }
        i(o1.a((o1) this.c.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -1, 16775167));
        ((bq.a) this.m).f(true, zp.b.LYRICS);
        return false;
    }

    public final void z() {
        if (this.C.isEmpty()) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y1(this, null, 1), 31);
        } else {
            L();
        }
    }
}
