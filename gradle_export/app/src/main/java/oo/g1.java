package oo;

import a1.r1;
import a40.u1;
import com.mchutov.core.deeplink.presentation.analytics.DeepLinkAnalytics;
import com.mchutov.core.deeplink.presentation.analytics.DeepLinkEvent;
import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryAnalytics;
import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryAnalyticsEvent;
import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryEpisodeParams;
import com.revenuecat.purchases.common.Constants;
import d40.p1;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

public final class g1 extends vm.a {
    public boolean A;
    public boolean B;
    public g00.q C;
    public u1 D;
    public final go.a d;
    public final jo.d e;
    public final jo.k f;
    public final vn.u g;
    public final io.a h;
    public final jo.i i;
    public final au.a j;
    public final jo.b k;
    public final ko.n l;
    public final vp.x m;
    public final ko.c n;
    public final ko.j o;
    public final gq.a p;
    public final aq.a q;
    public final ko.e r;
    public final AudioStoryAnalytics s;
    public final ko.k t;
    public final oq.b u;
    public final DeepLinkAnalytics v;
    public final d40.x0 w;
    public ho.a x;
    public List y;
    public List z;

    public g1(go.a aVar, jo.d dVar, jo.k kVar, vn.u uVar, io.a aVar2, jo.i iVar, au.a aVar3, jo.b bVar, ko.n nVar, vp.x xVar, ko.c cVar, ko.j jVar, gq.a aVar4, aq.a aVar5, ko.e eVar, AudioStoryAnalytics audioStoryAnalytics, ko.k kVar2, oq.b bVar2, DeepLinkAnalytics deepLinkAnalytics) {
        p1 p1VarC = d40.o.c(new lo.t(0L, 0L));
        boolean z = uVar.a.getBoolean("audio_stories_text_shown", false);
        ru.d dVar2 = ru.d.OFF;
        h00.x xVar2 = h00.x.A;
        super(new z0(null, 0, "", false, p1VarC, null, 1.0f, dVar2, ze.d.E(xVar2), false, false, false, false, ze.d.E(xVar2), false, false, null, z, false, false, lo.x.a, false, false, false, lo.h.a, false));
        this.d = aVar;
        this.e = dVar;
        this.f = kVar;
        this.g = uVar;
        this.h = aVar2;
        this.i = iVar;
        this.j = aVar3;
        this.k = bVar;
        this.l = nVar;
        this.m = xVar;
        this.n = cVar;
        this.o = jVar;
        this.p = aVar4;
        this.q = aVar5;
        this.r = eVar;
        this.s = audioStoryAnalytics;
        this.t = kVar2;
        this.u = bVar2;
        this.v = deepLinkAnalytics;
        this.w = p1VarC;
        this.y = xVar2;
        this.z = xVar2;
        audioStoryAnalytics.logEvent(AudioStoryAnalyticsEvent.AudioStoryPlayerScreenViewed.INSTANCE);
        p1 p1Var = ((no.n) aVar).r;
        d40.z0 z0Var = new d40.z0(p1Var);
        k00.c cVar2 = null;
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new c1(z0Var, this, cVar2, 0), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new c1(z0Var, this, cVar2, 1), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new l6.d(this, (k00.c) null, 6), 31);
        bq.a aVar6 = (bq.a) aVar5;
        if (aVar6.h.getAndSet(false)) {
            j(e.a);
        }
        if (aVar6.i.getAndSet(false)) {
            if (l(((ho.p) p1Var.getValue()).b) || !((z0) this.c.d.getValue()).r) {
                n();
            }
        }
    }

    public final void j(a0 action) {
        ho.g gVarD;
        ho.g gVar;
        oq.a aVarC;
        Object next;
        String str;
        kotlin.jvm.internal.m.e(action, "action");
        boolean zEquals = action.equals(m.a);
        go.a aVar = this.d;
        if (zEquals) {
            ((no.n) aVar).l();
            return;
        }
        if (action.equals(t.a)) {
            no.n nVar = (no.n) aVar;
            nVar.t(nVar.b.a().getCurrentPosition() - 10000);
            return;
        }
        if (action.equals(u.a)) {
            ((no.n) aVar).w();
            return;
        }
        if (action instanceof r) {
            ((no.n) aVar).t(((r) action).a);
            return;
        }
        boolean zEquals2 = action.equals(x.a);
        pm.b bVar = this.c;
        if (zEquals2) {
            i(z0.a((z0) bVar.d.getValue(), null, 0, null, false, null, 0.0f, null, null, true, false, false, false, null, false, false, null, false, false, false, null, false, false, false, null, false, 67108351));
            return;
        }
        if (action instanceof y) {
            ((no.n) aVar).v(((y) action).a);
            i(z0.a((z0) bVar.d.getValue(), null, 0, null, false, null, 0.0f, null, null, false, false, false, false, null, false, false, null, false, false, false, null, false, false, false, null, false, 67108351));
            return;
        }
        if (action.equals(v.a)) {
            i(z0.a((z0) bVar.d.getValue(), null, 0, null, false, null, 0.0f, null, null, false, true, false, false, null, false, false, null, false, false, false, null, false, false, false, null, false, 67107839));
            return;
        }
        boolean z = action instanceof w;
        AudioStoryAnalytics audioStoryAnalytics = this.s;
        if (z) {
            ru.d dVar = ((w) action).a;
            int iOrdinal = dVar.ordinal();
            if (iOrdinal == 0) {
                str = "off";
            } else if (iOrdinal == 8) {
                str = "episode_end";
            } else if (iOrdinal != 9) {
                Long l = dVar.A;
                str = ((l != null ? l.longValue() : 0L) / 60000) + "_min";
            } else {
                str = "story_end";
            }
            audioStoryAnalytics.logEvent(new AudioStoryAnalyticsEvent.AudioStorySleepTimerSet(str));
            ((no.n) aVar).u(dVar);
            i(z0.a((z0) bVar.d.getValue(), null, 0, null, false, null, 0.0f, null, null, false, false, false, false, null, false, false, null, false, false, false, null, false, false, false, null, false, 67107839));
            return;
        }
        if (action.equals(j.a)) {
            i(z0.a((z0) bVar.d.getValue(), null, 0, null, false, null, 0.0f, null, null, false, false, false, false, null, false, false, null, false, false, false, null, false, false, false, null, false, 67105279));
            return;
        }
        if (action.equals(k.a)) {
            i(z0.a((z0) bVar.d.getValue(), null, 0, null, false, null, 0.0f, null, null, false, false, true, false, null, false, false, null, false, false, false, null, false, false, false, null, false, 67106815));
            return;
        }
        if (action.equals(e.a)) {
            audioStoryAnalytics.logEvent(AudioStoryAnalyticsEvent.AudioStoryEpisodesSheetViewed.INSTANCE);
            i(z0.a((z0) bVar.d.getValue(), null, 0, null, false, null, 0.0f, null, null, false, false, false, true, null, false, false, null, false, false, false, null, false, false, false, null, false, 67104767));
            return;
        }
        if (action.equals(f.a)) {
            i(z0.a((z0) bVar.d.getValue(), null, 0, null, false, null, 0.0f, null, null, false, false, false, false, null, false, false, null, false, false, false, null, false, false, false, null, false, 67104767));
            return;
        }
        Object obj = null;
        if (action instanceof d) {
            int i = ((d) action).a;
            i(z0.a((z0) bVar.d.getValue(), null, 0, null, false, null, 0.0f, null, null, false, false, false, false, null, false, false, null, false, false, false, null, false, false, false, null, false, 67104767));
            ho.a aVar2 = this.x;
            if (aVar2 == null) {
                return;
            }
            Iterator it = aVar2.g.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((ho.g) next).a != i);
            ho.g gVar2 = (ho.g) next;
            if (gVar2 == null) {
                return;
            }
            for (Object obj2 : ((z0) bVar.d.getValue()).i) {
                if (((lo.l) obj2).a == i) {
                    obj = obj2;
                    break;
                }
            }
            lo.l lVar = (lo.l) obj;
            if (lVar == null || lVar.f) {
                ((no.n) aVar).x(aVar2, gVar2, ho.o.STORY_SCREEN, true);
                return;
            }
            return;
        }
        if (action.equals(g.a)) {
            i(z0.a((z0) bVar.d.getValue(), null, 0, null, false, null, 0.0f, null, null, false, false, false, false, null, true, false, null, false, false, false, null, false, false, false, null, false, 67092479));
            return;
        }
        if (action.equals(h.a)) {
            i(z0.a((z0) bVar.d.getValue(), null, 0, null, false, null, 0.0f, null, null, false, false, false, false, null, false, false, null, false, false, false, null, false, false, false, null, false, 67092479));
            return;
        }
        if (action instanceof i) {
            String str2 = ((i) action).a;
            ho.g gVar3 = ((ho.p) ((no.n) aVar).r.getValue()).b;
            p1 p1Var = bVar.d;
            if (((z0) p1Var.getValue()).p) {
                return;
            }
            if (gVar3 == null || kotlin.jvm.internal.m.a(str2, k(gVar3))) {
                i(z0.a((z0) p1Var.getValue(), null, 0, null, false, null, 0.0f, null, null, false, false, false, false, null, false, false, null, false, false, false, null, false, false, false, null, false, 67092479));
                return;
            } else {
                i(z0.a((z0) p1Var.getValue(), null, 0, null, false, null, 0.0f, null, null, false, false, false, false, null, false, true, str2, false, false, false, null, false, false, false, null, false, 67010559));
                ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, new r1(this, (k00.c) null, 8), new f1(this, str2, gVar3, null), 23);
                return;
            }
        }
        if (action.equals(z.a)) {
            n();
            return;
        }
        if (action.equals(n.a)) {
            m(true);
            return;
        }
        if (action instanceof l) {
            no.n nVar2 = (no.n) aVar;
            nVar2.t(((l) action).a);
            nVar2.r();
            i(z0.a((z0) bVar.d.getValue(), null, 0, null, false, null, 0.0f, null, null, false, false, false, false, null, false, false, null, false, false, false, null, false, false, false, null, false, 65011711));
            return;
        }
        if (action instanceof o) {
            i(z0.a((z0) bVar.d.getValue(), null, 0, null, false, null, 0.0f, null, null, false, false, false, false, null, false, false, null, false, false, false, null, ((o) action).a, false, false, null, false, 65011711));
            return;
        }
        if (action.equals(p.a)) {
            i(z0.a((z0) bVar.d.getValue(), null, 0, null, false, null, 0.0f, null, null, false, false, false, false, null, false, false, null, false, false, false, null, false, false, false, null, false, 65011711));
            return;
        }
        boolean zEquals3 = action.equals(a.a);
        aq.a aVar3 = this.q;
        vp.x xVar = this.m;
        if (zEquals3) {
            if (xVar.k()) {
                ab.a0.A0(this, e0.a);
                return;
            } else {
                ((bq.a) aVar3).f(true, zp.b.AIRPLAY);
                return;
            }
        }
        boolean zEquals4 = action.equals(b.a);
        lo.h hVar = lo.h.a;
        lo.f fVar = lo.f.a;
        io.a aVar4 = this.h;
        if (zEquals4) {
            ho.p pVar = (ho.p) ((no.n) aVar).r.getValue();
            ho.a aVar5 = pVar.a;
            if (aVar5 != null) {
                int i2 = aVar5.a;
                ho.g gVar4 = pVar.b;
                if (gVar4 != null) {
                    int i3 = gVar4.a;
                    lo.i iVar = ((z0) bVar.d.getValue()).y;
                    if (iVar instanceof lo.g) {
                        ((vn.o) aVar4).a(i2, Integer.valueOf(i3));
                        return;
                    }
                    if (kotlin.jvm.internal.m.a(iVar, fVar)) {
                        return;
                    }
                    if (!kotlin.jvm.internal.m.a(iVar, hVar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (xVar.k()) {
                        ((vn.o) aVar4).d(i2, i3);
                        return;
                    } else {
                        ((bq.a) aVar3).f(true, zp.b.AUDIO_STORY_DOWNLOADS);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (action.equals(s.a)) {
            ho.p pVar2 = (ho.p) ((no.n) aVar).r.getValue();
            ho.a aVar6 = pVar2.a;
            if (aVar6 == null || (gVar = pVar2.b) == null || (aVarC = this.u.c(aVar6, gVar)) == null) {
                return;
            }
            this.v.logEvent(new DeepLinkEvent.ContentShared("episode", aVar6.a + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + gVar.a, "player_screen"));
            ab.a0.A0(this, new d0(aVarC));
            return;
        }
        if (!(action instanceof c)) {
            if (!action.equals(q.a)) {
                throw new NoWhenBranchMatchedException();
            }
            no.n nVar3 = (no.n) aVar;
            ho.a aVar7 = nVar3.s;
            if (aVar7 == null || (gVarD = nVar3.d()) == null) {
                return;
            }
            nVar3.b.a().seekTo(0L);
            nVar3.r();
            nVar3.n.logEvent(new AudioStoryAnalyticsEvent.AudioStoryRecordingRestarted(nVar3.k(aVar7, gVarD)));
            nVar3.n();
            return;
        }
        int i4 = ((c) action).a;
        ho.a aVar8 = this.x;
        if (aVar8 != null) {
            int i5 = aVar8.a;
            for (Object obj3 : ((z0) bVar.d.getValue()).i) {
                if (((lo.l) obj3).a == i4) {
                    obj = obj3;
                    break;
                }
            }
            lo.l lVar2 = (lo.l) obj;
            if (lVar2 != null) {
                lo.i iVar2 = lVar2.e;
                if (iVar2 instanceof lo.g) {
                    ((vn.o) aVar4).a(i5, Integer.valueOf(i4));
                    return;
                }
                if (iVar2.equals(fVar)) {
                    return;
                }
                if (!iVar2.equals(hVar)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (xVar.k()) {
                    ((vn.o) aVar4).d(i5, i4);
                } else {
                    ((bq.a) aVar3).f(true, zp.b.AUDIO_STORY_DOWNLOADS);
                }
            }
        }
    }

    public final String k(ho.g gVar) {
        String str;
        if (gVar != null && (str = gVar.c) != null) {
            if (r30.k.L0(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return this.g.a();
    }

    public final boolean l(ho.g gVar) {
        return (gVar == null || this.m.k() || gVar.b() > 0) ? false : true;
    }

    public final void m(boolean z) {
        ho.g gVar = ((ho.p) ((no.n) this.d).r.getValue()).b;
        pm.b bVar = this.c;
        if (!((z0) bVar.d.getValue()).r || gVar == null) {
            return;
        }
        String str = gVar.h;
        if (str == null || r30.k.L0(str)) {
            return;
        }
        long jB = this.m.k() ? Long.MAX_VALUE : gVar.b();
        g00.q qVar = new g00.q(Integer.valueOf(gVar.a), k(gVar), Long.valueOf(jB));
        if (!qVar.equals(this.C) || z) {
            this.C = qVar;
            u1 u1Var = this.D;
            if (u1Var != null) {
                u1Var.i(null);
            }
            i(z0.a((z0) bVar.d.getValue(), null, 0, null, false, null, 0.0f, null, null, false, false, false, false, null, false, false, null, false, false, false, lo.x.a, false, false, false, null, false, 66060287));
            this.D = ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new b1.w(this, gVar, jB, qVar, (k00.c) null, 7), 31);
        }
    }

    public final void n() {
        no.n nVar = (no.n) this.d;
        if (l(((ho.p) nVar.r.getValue()).b)) {
            ((bq.a) this.q).f(true, zp.b.AUDIO_STORIES);
            return;
        }
        pm.b bVar = this.c;
        boolean z = true ^ ((z0) bVar.d.getValue()).r;
        vn.u uVar = this.g;
        oi.k.v(uVar.a, "audio_stories_text_shown", z);
        ho.p pVar = (ho.p) nVar.r.getValue();
        ho.a aVar = pVar.a;
        ho.g gVar = pVar.b;
        if (aVar != null && gVar != null) {
            String strA = uVar.a();
            this.t.getClass();
            int i = aVar.a;
            String str = aVar.b;
            int i2 = gVar.a;
            int i3 = gVar.b;
            String str2 = gVar.c;
            this.s.logEvent(new AudioStoryAnalyticsEvent.AudioStoryTextToggled(new AudioStoryEpisodeParams(i, str, i2, i3, r30.k.L0(str2) ? strA : str2), z));
        }
        i(z0.a((z0) bVar.d.getValue(), null, 0, null, false, null, 0.0f, null, null, false, false, false, false, null, false, false, null, z, false, false, null, false, false, false, null, false, 64880639));
        m(false);
    }
}
