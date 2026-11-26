package as;

import com.google.android.gms.internal.measurement.g4;
import com.mchutov.core.deeplink.presentation.analytics.DeepLinkAnalytics;
import com.mchutov.core.deeplink.presentation.analytics.DeepLinkEvent;
import com.mchutov.quranify.home.presentation.screen.playlist.PlaylistEffect$CloseScreen;
import com.mchutov.quranify.home.presentation.screen.playlist.PlaylistLauncher;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import ri.t1;

public final class b1 extends vm.a {
    public final PlaylistLauncher d;
    public final xw.k e;
    public final uu.a f;
    public final tq.k g;
    public final aq.a h;
    public final zt.a i;
    public final tt.b j;
    public final vp.x k;
    public final qu.a l;
    public final cw.a m;
    public final pm.c n;
    public final oq.b o;
    public final DeepLinkAnalytics p;
    public final d40.t0 q;

    public b1(PlaylistLauncher launcher, xv.c cVar, xw.k kVar, uu.a aVar, tq.k kVar2, aq.a aVar2, au.a aVar3, zt.a aVar4, tt.b bVar, vp.x xVar, qu.a aVar5, cw.a aVar6, pm.c cVar2, oq.b bVar2, DeepLinkAnalytics deepLinkAnalytics) {
        kotlin.jvm.internal.m.e(launcher, "launcher");
        h00.x xVar2 = h00.x.A;
        super(new u0(true, null, ze.d.E(xVar2), ze.d.E(xVar2), ze.d.E(xVar2), 0, false, "", false, qr.r.A, false, false, ze.d.E(xVar2), true, ze.d.E(xVar2), ze.d.E(xVar2), (65536 & 2097151) == 0, false, null, false, false));
        this.d = launcher;
        this.e = kVar;
        this.f = aVar;
        this.g = kVar2;
        this.h = aVar2;
        this.i = aVar4;
        this.j = bVar;
        this.k = xVar;
        this.l = aVar5;
        this.m = aVar6;
        this.n = cVar2;
        this.o = bVar2;
        this.p = deepLinkAnalytics;
        k00.c cVar3 = null;
        this.q = d40.o.j(cVar.c.c, ((ut.p) aVar4).k(), kVar2.c(), kVar.f(), aVar3.c, new z0(this, cVar3, 0));
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new w0(this, cVar3, 2), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new w0(this, cVar3, 3), 31);
    }

    public static final Boolean j(b1 b1Var) {
        u30.b<PlayerItem> bVar = ((u0) b1Var.c.d.getValue()).e;
        ArrayList arrayList = new ArrayList(h00.r.q0(bVar, 10));
        for (PlayerItem playerItem : bVar) {
            arrayList.add(new g00.k(new Integer(playerItem.getReciterId()), new Long(playerItem.getSurahId())));
        }
        Set setR1 = h00.q.r1(arrayList);
        List<yt.a> list = (List) ((ut.p) b1Var.i).j.getValue();
        boolean z = false;
        if (list == null || !list.isEmpty()) {
            for (yt.a aVar : list) {
                if (!setR1.contains(new g00.k(new Integer(aVar.b), new Long(aVar.c)))) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public static final Object k(b1 b1Var, m00.c cVar) {
        a1 a1Var;
        Object next;
        yt.a aVar;
        pm.b bVar = b1Var.c;
        if (cVar instanceof a1) {
            a1Var = (a1) cVar;
            int i = a1Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                a1Var.C = i - Integer.MIN_VALUE;
            } else {
                a1Var = new a1(b1Var, cVar);
            }
        } else {
            a1Var = new a1(b1Var, cVar);
        }
        Object objJ = a1Var.A;
        l00.a aVar2 = l00.a.A;
        int i2 = a1Var.C;
        g00.b0 b0Var = g00.b0.a;
        Object[] objArr = 0;
        if (i2 == 0) {
            t1.O(objJ);
            u30.b<PlayerItem> bVar2 = ((u0) bVar.d.getValue()).e;
            ArrayList arrayList = new ArrayList(h00.r.q0(bVar2, 10));
            for (PlayerItem playerItem : bVar2) {
                arrayList.add(new g00.k(new Integer(playerItem.getReciterId()), new Long(playerItem.getSurahId())));
            }
            Set setR1 = h00.q.r1(arrayList);
            Iterator it = ((List) ((ut.p) b1Var.i).j.getValue()).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                aVar = (yt.a) next;
            } while (setR1.contains(new g00.k(new Integer(aVar.b), new Long(aVar.c))));
            yt.a aVar3 = (yt.a) next;
            if (aVar3 == null) {
                return b0Var;
            }
            h40.e eVar = a40.m0.a;
            v0 v0Var = new v0(b1Var, aVar3, objArr == true ? 1 : 0, 1);
            a1Var.C = 1;
            objJ = a40.c0.J(v0Var, eVar, a1Var);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objJ);
        }
        bx.c cVar2 = (bx.c) objJ;
        b1Var.i(u0.a((u0) bVar.d.getValue(), null, null, null, null, 0, false, null, false, null, false, false, null, false, null, null, false, true, cVar2 != null ? cVar2.b : null, false, false, 1703935));
        return b0Var;
    }

    public static List m(int i, long j, LinkedHashMap linkedHashMap) {
        yt.b bVar = (yt.b) linkedHashMap.get(new g00.k(Integer.valueOf(i), Long.valueOf(j)));
        List listR = bVar != null ? va.a.R(bVar) : null;
        return listR == null ? h00.x.A : listR;
    }

    public static u0 n(b1 b1Var, u0 u0Var, u30.b bVar, dw.a aVar, qr.r rVar, String str, boolean z, int i) {
        u30.b bVarD0;
        u30.b bVarD1;
        int i2;
        int i3;
        int i4;
        boolean z2;
        u30.b bVar2 = (i & 2) != 0 ? u0Var.c : bVar;
        dw.a aVar2 = (i & 4) != 0 ? u0Var.b : aVar;
        qr.r rVar2 = (i & 8) != 0 ? u0Var.j : rVar;
        String str2 = (i & 16) != 0 ? u0Var.h : str;
        boolean z3 = (i & 32) != 0 ? u0Var.i : z;
        b1Var.getClass();
        int iOrdinal = rVar2.ordinal();
        int i5 = 1;
        if (iOrdinal == 0) {
            bVarD0 = bVar2;
        } else if (iOrdinal == 1) {
            bVarD0 = g4.d0(h00.q.i1(bVar2, p30.f.Y(new a1.s0(5), new a1.s0(6))));
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVarD0 = g4.d0(h00.q.i1(bVar2, p30.f.Y(new a1.s0(7), new a1.s0(8), new a1.s0(9))));
        }
        String string = r30.k.j1(str2).toString();
        if (r30.k.L0(string)) {
            bVarD1 = bVarD0;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : bVarD0) {
                PlayerItem playerItem = (PlayerItem) obj;
                if (r30.k.A0(playerItem.getSurahTranscription(), string, true) || r30.k.A0(playerItem.getSurahTranslation(), string, true) || r30.k.A0(playerItem.getSurahOriginalName(), string, true) || r30.k.A0(playerItem.getReciterName(), string, true) || r30.k.A0(String.valueOf(playerItem.getSurahNumber()), string, false)) {
                    arrayList.add(obj);
                }
            }
            bVarD1 = g4.d0(arrayList);
        }
        boolean z4 = ((h00.b) bVar2).a() > 10;
        boolean z5 = z3 && z4;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : bVar2) {
            if (!r30.k.L0(((PlayerItem) obj2).getPlayerUrl())) {
                arrayList2.add(obj2);
            }
        }
        u30.b<PlayerItem> bVarD2 = g4.d0(arrayList2);
        if (bVarD2 == null || !bVarD2.isEmpty()) {
            int i6 = 0;
            for (PlayerItem playerItem2 : bVarD2) {
                u30.b bVar3 = u0Var.o;
                if (bVar3 != null && bVar3.isEmpty()) {
                    i4 = i5;
                    break;
                    break;
                }
                Iterator<E> it = bVar3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i4 = i5;
                        break;
                    }
                    yt.b bVar4 = (yt.b) it.next();
                    i4 = i5;
                    if (bVar4.a == playerItem2.getReciterId() && bVar4.b == playerItem2.getSurahId()) {
                        i6++;
                        if (i6 >= 0) {
                            break;
                        }
                        va.a.j0();
                        throw null;
                    }
                    i5 = i4;
                }
                i5 = i4;
            }
            i2 = i5;
            i3 = i6;
        } else {
            i2 = 1;
            i3 = 0;
        }
        if (!z5) {
            bVarD1 = bVarD0;
        }
        boolean z6 = !bVarD2.isEmpty();
        if (aVar2 == null || aVar2.g) {
            z2 = 0;
        } else {
            ArrayList arrayList3 = new ArrayList(h00.r.q0(bVar2, 10));
            Iterator<E> it2 = bVar2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Integer.valueOf(((PlayerItem) it2.next()).getReciterId()));
            }
            int i7 = i2;
            if (h00.q.G0(arrayList3).size() > i7) {
                z2 = i7;
            } else {
                z2 = 0;
            }
        }
        return u0.a(u0Var, null, bVar2, bVarD1, bVarD2, i3, z6, null, z5, null, z2, z4, null, false, null, null, false, false, null, false, false, 2093699);
    }

    public final void l(u action) {
        oq.a aVarA;
        kotlin.jvm.internal.m.e(action, "action");
        k00.c cVar = null;
        if (action instanceof j) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new y0(this, cVar, 0), 31);
            return;
        }
        if (action instanceof r) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new w0(this, cVar, 4), 31);
            return;
        }
        if (action instanceof c) {
            ab.a0.A0(this, PlaylistEffect$CloseScreen.INSTANCE);
            return;
        }
        if (action instanceof m) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new x0(this, ((m) action).a, cVar, 2), 31);
            return;
        }
        if (action instanceof t) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new x0(this, ((t) action).a, cVar, 4), 31);
            return;
        }
        if (action instanceof k) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new x0(this, ((k) action).a, cVar, 0), 31);
            return;
        }
        if (action instanceof n) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new x0(this, ((n) action).a, cVar, 1), 31);
            return;
        }
        if (action instanceof l) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new v0(this, ((l) action).a, cVar, 0), 31);
            return;
        }
        if (action instanceof h) {
            if (this.k.k()) {
                ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new w0(this, cVar, 1), 31);
                return;
            } else {
                ((bq.a) this.h).f(true, zp.b.DOWNLOADS);
                return;
            }
        }
        boolean z = action instanceof b;
        pm.b bVar = this.c;
        if (z) {
            i(u0.a((u0) bVar.d.getValue(), null, null, null, null, 0, false, null, false, null, false, false, null, false, null, null, false, false, null, true, false, 1572863));
            return;
        }
        if (action instanceof i) {
            ((ut.p) this.i).a();
            return;
        }
        if (action instanceof e) {
            i(u0.a((u0) bVar.d.getValue(), null, null, null, null, 0, false, null, false, null, false, false, null, false, null, null, false, false, null, false, false, 2031615));
            return;
        }
        if (action instanceof f) {
            i(u0.a((u0) bVar.d.getValue(), null, null, null, null, 0, false, null, false, null, false, false, null, false, null, null, false, false, null, false, false, 1572863));
            return;
        }
        if (action instanceof g) {
            i(u0.a((u0) bVar.d.getValue(), null, null, null, null, 0, false, null, false, null, false, false, null, false, null, null, false, false, null, false, false, 1703935));
            return;
        }
        if (action instanceof d) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new w0(this, cVar, 0), 31);
            return;
        }
        if (action instanceof q) {
            dw.a aVar = ((u0) bVar.d.getValue()).b;
            if (aVar == null || (aVarA = this.o.a(aVar)) == null) {
                return;
            }
            this.p.logEvent(new DeepLinkEvent.ContentShared("collection", String.valueOf(aVar.a), "collection_screen"));
            ab.a0.A0(this, new v(aVarA));
            return;
        }
        if (action instanceof p) {
            String str = ((p) action).a;
            i(n(this, u0.a((u0) bVar.d.getValue(), null, null, null, null, 0, false, str, false, null, false, false, null, false, null, null, false, false, null, false, false, 2097023), null, null, null, str, false, 46));
        } else if (action instanceof o) {
            boolean z2 = ((o) action).a;
            i(n(this, u0.a((u0) bVar.d.getValue(), null, null, null, null, 0, false, null, z2, null, false, false, null, false, null, null, false, false, null, false, false, 2096895), null, null, null, null, z2, 30));
        } else {
            if (!(action instanceof s)) {
                throw new NoWhenBranchMatchedException();
            }
            qr.r rVar = ((s) action).a;
            i(n(this, u0.a((u0) bVar.d.getValue(), null, null, null, null, 0, false, null, false, rVar, false, false, null, false, null, null, false, false, null, false, false, 2096639), null, null, rVar, null, false, 54));
        }
    }
}
