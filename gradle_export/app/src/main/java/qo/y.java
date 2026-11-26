package qo;

import a1.p1;
import a40.u1;
import androidx.lifecycle.u0;
import com.mchutov.core.deeplink.presentation.analytics.DeepLinkAnalytics;
import com.mchutov.core.deeplink.presentation.analytics.DeepLinkEvent;
import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryAnalytics;
import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryAnalyticsEvent;
import com.mchutov.quranify.audiostories.presentation.player.AudioStoryPlayerLauncher;
import com.mchutov.quranify.audiostories.presentation.screen.story.AudioStoryEffect$CloseScreen;
import com.revenuecat.purchases.common.Constants;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import ta.c0;

public final class y extends vm.a {
    public final int d;
    public final jo.d e;
    public final go.a f;
    public final ko.h g;
    public final AudioStoryPlayerLauncher h;
    public final io.a i;
    public final jo.i j;
    public final au.a k;
    public final vp.x l;
    public final aq.a m;
    public final AudioStoryAnalytics n;
    public final oq.b o;
    public final DeepLinkAnalytics p;
    public ho.a q;
    public boolean r;
    public Integer s;
    public final p10.a t;

    public y(int i, Integer num, jo.d dVar, go.a aVar, ko.h hVar, AudioStoryPlayerLauncher audioStoryPlayerLauncher, io.a aVar2, jo.i iVar, au.a aVar3, vp.x xVar, aq.a aVar4, AudioStoryAnalytics audioStoryAnalytics, oq.b bVar, DeepLinkAnalytics deepLinkAnalytics) {
        super(new t(null, false, num, null));
        k00.c cVar = null;
        this.d = i;
        this.e = dVar;
        this.f = aVar;
        this.g = hVar;
        this.h = audioStoryPlayerLauncher;
        this.i = aVar2;
        this.j = iVar;
        this.k = aVar3;
        this.l = xVar;
        this.m = aVar4;
        this.n = audioStoryAnalytics;
        this.o = bVar;
        this.p = deepLinkAnalytics;
        this.s = num;
        v6.a aVarI = u0.i(this);
        q0.a aVar5 = new q0.a(this, 6);
        p10.a aVar6 = new p10.a();
        aVar6.A = aVarI;
        aVar6.B = aVar5;
        this.t = aVar6;
        c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new v(this, cVar, 1), 31);
        c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new v(this, cVar, 0), 31);
    }

    public final void j(l action) {
        u30.b bVar;
        oq.a aVarC;
        oq.a aVarE;
        kotlin.jvm.internal.m.e(action, "action");
        if (action.equals(c.a)) {
            ab.a0.A0(this, AudioStoryEffect$CloseScreen.INSTANCE);
            return;
        }
        if (action.equals(g.a)) {
            ho.a aVar = this.q;
            if (aVar != null) {
                this.h.playOrPause(aVar, ho.o.STORY_SCREEN);
                return;
            }
            return;
        }
        if (action instanceof f) {
            k(((f) action).a);
            return;
        }
        boolean zEquals = action.equals(a.a);
        Object obj = null;
        pm.b bVar2 = this.c;
        if (zEquals) {
            this.n.logEvent(AudioStoryAnalyticsEvent.AudioStoryInfoSheetViewed.INSTANCE);
            i(t.a((t) bVar2.d.getValue(), null, true, null, 13));
            return;
        }
        if (action.equals(b.a)) {
            i(t.a((t) bVar2.d.getValue(), null, false, null, 13));
            return;
        }
        boolean zEquals2 = action.equals(i.a);
        DeepLinkAnalytics deepLinkAnalytics = this.p;
        oq.b bVar3 = this.o;
        if (zEquals2) {
            ho.a aVar2 = this.q;
            if (aVar2 == null || (aVarE = bVar3.e(aVar2)) == null) {
                return;
            }
            deepLinkAnalytics.logEvent(new DeepLinkEvent.ContentShared("story", String.valueOf(aVar2.a), "story_screen"));
            ab.a0.A0(this, new m(aVarE));
            return;
        }
        if (action instanceof j) {
            int i = ((j) action).a;
            ho.a aVar3 = this.q;
            if (aVar3 == null) {
                return;
            }
            for (Object obj2 : aVar3.g) {
                if (((ho.g) obj2).a == i) {
                    obj = obj2;
                    break;
                }
            }
            ho.g gVar = (ho.g) obj;
            if (gVar == null || (aVarC = bVar3.c(aVar3, gVar)) == null) {
                return;
            }
            deepLinkAnalytics.logEvent(new DeepLinkEvent.ContentShared("episode", aVar3.a + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + gVar.a, "story_screen"));
            ab.a0.A0(this, new m(aVarC));
            return;
        }
        if (action.equals(k.a)) {
            i(t.a((t) bVar2.d.getValue(), null, false, null, 11));
            return;
        }
        boolean zEquals3 = action.equals(e.a);
        aq.a aVar4 = this.m;
        vp.x xVar = this.l;
        lo.h hVar = lo.h.a;
        lo.f fVar = lo.f.a;
        int i2 = this.d;
        io.a aVar5 = this.i;
        if (zEquals3) {
            ho.a aVar6 = this.q;
            if (aVar6 == null) {
                return;
            }
            lo.k kVar = ((t) bVar2.d.getValue()).a;
            lo.i iVar = kVar != null ? kVar.i : null;
            if (iVar instanceof lo.g) {
                ((vn.o) aVar5).a(i2, null);
                return;
            }
            if (kotlin.jvm.internal.m.a(iVar, fVar) || iVar == null) {
                return;
            }
            if (!iVar.equals(hVar)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!xVar.k()) {
                ((bq.a) aVar4).f(true, zp.b.AUDIO_STORY_DOWNLOADS);
                return;
            }
            vn.o oVar = (vn.o) aVar5;
            oVar.getClass();
            a40.c0.y(oVar.f, null, null, new vn.i(oVar, aVar6, null), 3);
            oVar.e(aVar6.a, null, false);
            return;
        }
        if (!(action instanceof d)) {
            if (!(action instanceof h)) {
                throw new NoWhenBranchMatchedException();
            }
            c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new p1(this, ((h) action).a, (k00.c) null, 9), 31);
            return;
        }
        int i3 = ((d) action).a;
        lo.k kVar2 = ((t) bVar2.d.getValue()).a;
        if (kVar2 == null || (bVar = kVar2.g) == null) {
            return;
        }
        for (Object obj3 : bVar) {
            if (((lo.l) obj3).a == i3) {
                obj = obj3;
                break;
            }
        }
        lo.l lVar = (lo.l) obj;
        if (lVar == null) {
            return;
        }
        lo.i iVar2 = lVar.e;
        if (iVar2 instanceof lo.g) {
            ((vn.o) aVar5).a(i2, Integer.valueOf(i3));
            return;
        }
        if (iVar2.equals(fVar)) {
            return;
        }
        if (!iVar2.equals(hVar)) {
            throw new NoWhenBranchMatchedException();
        }
        if (xVar.k()) {
            ((vn.o) aVar5).d(i2, i3);
        } else {
            ((bq.a) aVar4).f(true, zp.b.AUDIO_STORY_DOWNLOADS);
        }
    }

    public final void k(int i) {
        boolean z;
        u30.b bVar;
        Object next;
        p10.a aVar = this.t;
        u1 u1Var = (u1) aVar.D;
        Object obj = null;
        if (u1Var != null) {
            u1Var.i(null);
        }
        if (!kotlin.jvm.internal.m.a(aVar.C, null)) {
            aVar.C = null;
            ((q0.a) aVar.B).invoke((Object) null);
        }
        ho.a aVar2 = this.q;
        if (aVar2 == null) {
            return;
        }
        lo.k kVar = ((t) this.c.d.getValue()).a;
        if (kVar == null || (bVar = kVar.g) == null) {
            z = false;
        } else {
            Iterator<E> it = bVar.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((lo.l) next).a != i);
            lo.l lVar = (lo.l) next;
            if (lVar != null) {
                z = lVar.f;
            } else {
                z = false;
            }
        }
        for (Object obj2 : aVar2.g) {
            if (((ho.g) obj2).a == i) {
                obj = obj2;
                break;
            }
        }
        ho.g gVar = (ho.g) obj;
        if (gVar != null && z) {
            this.h.start(aVar2, gVar, ho.o.STORY_SCREEN, true);
        }
    }
}
