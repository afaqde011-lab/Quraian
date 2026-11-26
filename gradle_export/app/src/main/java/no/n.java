package no;

import a40.c0;
import a40.m0;
import a40.u1;
import a40.w1;
import a40.z;
import ab.a0;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.k0;
import bv.i2;
import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryAnalytics;
import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryAnalyticsEvent;
import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryEpisodeParams;
import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryPaywallTrigger;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import d40.p1;
import d40.u0;
import du.q0;
import e7.i0;
import g00.b0;
import h00.q;
import h00.r;
import h00.y;
import ho.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k9.f4;
import k9.v;
import ri.t1;
import vn.u;
import vp.x;

public final class n implements go.a {
    public u1 A;
    public Integer B;
    public int C;
    public long D;
    public u1 E;
    public u1 F;
    public v G;
    public final Context a;
    public final e b;
    public final zu.a c;
    public final jo.m d;
    public final u e;
    public final ko.l f;
    public final x g;
    public final aq.a h;
    public final jo.d i;
    public final jo.h j;
    public final jo.i k;
    public final au.a l;
    public final d m;
    public final AudioStoryAnalytics n;
    public final ko.k o;
    public final g p;
    public final z q;
    public final p1 r;
    public ho.a s;
    public ho.a t;
    public int u;
    public ho.c v;
    public Object w;
    public g00.k x;
    public o y;
    public boolean z;

    public n(Context context, e eVar, zu.a aVar, jo.m mVar, u uVar, ko.l lVar, x xVar, aq.a aVar2, jo.d dVar, jo.h hVar, jo.i iVar, au.a aVar3, d dVar2, AudioStoryAnalytics audioStoryAnalytics, ko.k kVar, g gVar) {
        ho.n nVar;
        w1 w1VarE = c0.e();
        h40.e eVar2 = m0.a;
        f40.c cVarC = c0.c(rd.a.P(w1VarE, f40.m.a.F));
        this.a = context;
        this.b = eVar;
        this.c = aVar;
        this.d = mVar;
        this.e = uVar;
        this.f = lVar;
        this.g = xVar;
        this.h = aVar2;
        this.i = dVar;
        this.j = hVar;
        this.k = iVar;
        this.l = aVar3;
        this.m = dVar2;
        this.n = audioStoryAnalytics;
        this.o = kVar;
        this.p = gVar;
        this.q = cVarC;
        SharedPreferences sharedPreferences = uVar.a;
        this.r = d40.o.c(new p(null, null, false, 0L, 0L, sharedPreferences.getFloat("audio_stories_playback_speed", 1.0f), ru.d.OFF, false));
        this.w = y.A;
        this.C = -1;
        int i = 0;
        i iVar2 = new i(this, i);
        eVar.c.add(iVar2);
        i7.z zVar = eVar.b;
        if (zVar != null) {
            zVar.m.a(iVar2);
        }
        k00.c cVar = null;
        ta.c0.M(cVarC, (k00.i) null, (u00.n) null, (u00.k) null, new m(this, cVar, 4), 31);
        ta.c0.M(cVarC, (k00.i) null, (u00.n) null, (u00.k) null, new m(this, cVar, 3), 31);
        int i2 = sharedPreferences.getInt("audio_stories_last_story_id", -1);
        Integer numValueOf = i2 == -1 ? null : Integer.valueOf(i2);
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            int i3 = sharedPreferences.getInt("audio_stories_last_episode_id", -1);
            Integer numValueOf2 = i3 == -1 ? null : Integer.valueOf(i3);
            if (numValueOf2 != null) {
                nVar = new ho.n(iIntValue, numValueOf2.intValue());
            } else {
                nVar = null;
            }
        } else {
            nVar = null;
        }
        if (nVar != null) {
            ta.c0.M(cVarC, (k00.i) null, (u00.n) null, (u00.k) null, new a1.f(this, nVar, (k00.c) null), 31);
        }
        ta.c0.M(cVarC, (k00.i) null, (u00.n) null, (u00.k) null, new m(this, cVar, i), 31);
        ta.c0.M(cVarC, (k00.i) null, (u00.n) null, (u00.k) null, new m(this, cVar, 1), 31);
        ta.c0.M(cVarC, (k00.i) null, (u00.n) null, (u00.k) null, new m(this, cVar, 2), 31);
        k0.H.F.a(new k(this));
        ta.c0.M(cVarC, (k00.i) null, (u00.n) null, (u00.k) null, new m(this, cVar, 5), 31);
    }

    public static final void a(n nVar, ho.g gVar) {
        AudioStoryAnalytics audioStoryAnalytics = nVar.n;
        long jE = nVar.e(gVar);
        int i = gVar.a;
        nVar.o(gVar, jE, true, true);
        d dVar = nVar.m;
        long jE2 = nVar.e(gVar);
        dVar.getClass();
        dVar.a(ho.l.AUDIO_END, jE2);
        ho.a aVar = nVar.s;
        if (aVar == null) {
            return;
        }
        List list = aVar.g;
        ho.g gVar2 = (ho.g) q.U0(list);
        boolean z = false;
        if (gVar2 != null && gVar2.a == i) {
            z = true;
        }
        if (z && ((p) nVar.r.getValue()).g == ru.d.WHEN_STORY_ENDS) {
            nVar.u(ru.d.OFF);
        }
        Integer num = nVar.B;
        if (num != null && num.intValue() == i) {
            return;
        }
        nVar.B = Integer.valueOf(i);
        audioStoryAnalytics.logEvent(new AudioStoryAnalyticsEvent.AudioStoryEpisodeCompleted(nVar.k(aVar, gVar)));
        if (z) {
            audioStoryAnalytics.logEvent(new AudioStoryAnalyticsEvent.AudioStoryCompleted(aVar.a, aVar.b, list.size()));
        }
    }

    public static final Object b(n nVar, AudioStoryEpisodeParams audioStoryEpisodeParams, m00.c cVar) {
        j jVar;
        x xVar = nVar.g;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i = jVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                jVar.D = i - Integer.MIN_VALUE;
            } else {
                jVar = new j(nVar, cVar);
            }
        } else {
            jVar = new j(nVar, cVar);
        }
        Object obj = jVar.B;
        l00.a aVar = l00.a.A;
        int i2 = jVar.D;
        if (i2 == 0) {
            t1.O(obj);
            u0 u0Var = new u0(((bq.a) nVar.h).a, xVar.k, new q0(3, null, 1));
            l6.u uVar = new l6.u(2, (k00.c) null, 1);
            jVar.A = audioStoryEpisodeParams;
            jVar.D = 1;
            if (d40.o.t(u0Var, uVar, jVar) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            audioStoryEpisodeParams = jVar.A;
            t1.O(obj);
        }
        nVar.n.logEvent(new AudioStoryAnalyticsEvent.AudioStoryPaywallClosed(audioStoryEpisodeParams, xVar.k()));
        return b0.a;
    }

    public static final void c(n nVar) {
        g00.k kVar;
        i7.z zVar = nVar.b.b;
        if (zVar == null) {
            return;
        }
        ho.a aVar = nVar.s;
        if (aVar == null || aVar.g.size() != zVar.getMediaItemCount()) {
            aVar = null;
        }
        ho.a aVar2 = nVar.t;
        if (aVar2 == null || aVar == null || aVar2.a != aVar.a) {
            aVar2 = null;
        }
        ho.g gVar = aVar != null ? (ho.g) q.N0(aVar.g) : null;
        if (aVar != null) {
            List list = aVar.g;
            if (aVar2 == null || gVar == null) {
                kVar = null;
            } else {
                ho.a aVar3 = (ho.a) nVar.m(aVar2, gVar).A;
                List list2 = aVar3.g;
                ArrayList arrayList = new ArrayList(r.q0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((ho.g) it.next()).a));
                }
                ArrayList arrayList2 = new ArrayList(r.q0(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(((ho.g) it2.next()).a));
                }
                if (arrayList.equals(arrayList2)) {
                    z00.e eVarL = va.a.L(list2);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = eVarL.iterator();
                    while (true) {
                        z00.d dVar = (z00.d) it3;
                        if (!dVar.C) {
                            break;
                        }
                        Object next = dVar.next();
                        int iIntValue = ((Number) next).intValue();
                        if (!((ho.g) list2.get(iIntValue)).e.equals(((ho.g) list.get(iIntValue)).e) && ((ho.g) list2.get(iIntValue)).c.equals(((ho.g) list.get(iIntValue)).c)) {
                            arrayList3.add(next);
                        }
                    }
                    kVar = new g00.k(aVar3, arrayList3);
                    if (arrayList3.isEmpty()) {
                        kVar = null;
                    }
                } else {
                    kVar = null;
                }
            }
        } else {
            kVar = null;
        }
        if (kVar == null) {
            return;
        }
        ho.a aVar4 = (ho.a) kVar.A;
        List list3 = (List) kVar.B;
        ho.a aVar5 = nVar.s;
        if (aVar5 == null) {
            return;
        }
        List list4 = aVar5.g;
        ArrayList arrayList4 = new ArrayList(r.q0(list4, 10));
        int i = 0;
        for (Object obj : list4) {
            int i2 = i + 1;
            if (i < 0) {
                va.a.k0();
                throw null;
            }
            ho.g gVar2 = (ho.g) obj;
            if (list3.contains(Integer.valueOf(i))) {
                gVar2 = (ho.g) aVar4.g.get(i);
            }
            arrayList4.add(gVar2);
            i = i2;
        }
        nVar.s = ho.a.a(aVar5, arrayList4);
        int currentMediaItemIndex = zVar.getCurrentMediaItemIndex();
        long currentPosition = zVar.getCurrentPosition();
        Iterator it4 = list3.iterator();
        while (it4.hasNext()) {
            int iIntValue2 = ((Number) it4.next()).intValue();
            zVar.replaceMediaItem(iIntValue2, nVar.f.X(new g00.k(aVar4, aVar4.g.get(iIntValue2))));
        }
        if (list3.contains(Integer.valueOf(currentMediaItemIndex))) {
            nVar.u++;
            zVar.seekTo(currentMediaItemIndex, currentPosition);
        }
        nVar.n();
    }

    public static long z(ho.g gVar) {
        long j = gVar.k;
        long j2 = gVar.f;
        boolean z = j2 > 0 && j >= j2 - 1000;
        if (gVar.l || j <= 0 || z) {
            return 0L;
        }
        return j;
    }

    public final ho.g d() {
        i7.z zVar = this.b.b;
        if (zVar == null) {
            return null;
        }
        int currentMediaItemIndex = zVar.getCurrentMediaItemIndex();
        ho.a aVar = this.s;
        if (aVar != null) {
            return (ho.g) q.O0(currentMediaItemIndex, aVar.g);
        }
        return null;
    }

    public final long e(ho.g gVar) {
        long j = gVar.f;
        Long lValueOf = Long.valueOf(j);
        Long l = null;
        if (j <= 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        i7.z zVar = this.b.b;
        if (zVar != null) {
            long duration = zVar.getDuration();
            Long lValueOf2 = Long.valueOf(duration);
            if (duration > 0) {
                l = lValueOf2;
            }
        }
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final void f() {
        ho.g gVarD;
        i7.z zVar = this.b.b;
        if (zVar != null && zVar.getPlayWhenReady() && h(zVar.getCurrentPosition())) {
            zVar.pause();
            ho.a aVar = this.s;
            if (aVar == null || (gVarD = d()) == null) {
                return;
            }
            this.n.logEvent(new AudioStoryAnalyticsEvent.AudioStoryRecordingBlocked(k(aVar, gVarD)));
        }
    }

    public final boolean g(ho.g gVar, long j) {
        return j >= i(gVar);
    }

    public final boolean h(long j) {
        return ((Boolean) this.p.a.getValue()).booleanValue() && j >= 25000;
    }

    public final long i(ho.g gVar) {
        if (this.g.k()) {
            return Long.MAX_VALUE;
        }
        return gVar.b();
    }

    public final void j(ho.a aVar, ho.g gVar) {
        this.B = null;
        this.n.logEvent(new AudioStoryAnalyticsEvent.AudioStoryEpisodeStarted(k(aVar, gVar), r30.r.x0(gVar.e, "file:", false), this.g.k()));
    }

    public final AudioStoryEpisodeParams k(ho.a story, ho.g episode) {
        String strA = this.e.a();
        kotlin.jvm.internal.m.e(story, "story");
        kotlin.jvm.internal.m.e(episode, "episode");
        this.o.getClass();
        int i = story.a;
        String str = story.b;
        int i2 = episode.a;
        int i3 = episode.b;
        String str2 = episode.c;
        return new AudioStoryEpisodeParams(i, str, i2, i3, r30.k.L0(str2) ? strA : str2);
    }

    public final void l() {
        e eVar = this.b;
        i7.z zVar = eVar.b;
        if (zVar == null || !zVar.isPlaying()) {
            r();
            return;
        }
        i7.z zVar2 = eVar.b;
        if (zVar2 != null) {
            zVar2.pause();
        }
    }

    public final g00.k m(ho.a aVar, ho.g gVar) {
        ho.a aVar2;
        ho.g gVar2;
        ho.g gVarA;
        Object next;
        List list;
        Object next2;
        String str = (String) this.e.c.getValue();
        ho.c cVar = this.v;
        Object obj = null;
        if (cVar == null) {
            aVar2 = null;
        } else {
            if (!kotlin.jvm.internal.m.a(cVar.a, str)) {
                cVar = null;
            }
            if (cVar == null || (list = cVar.b) == null) {
                aVar2 = null;
            } else {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (((ho.a) next2).a != aVar.a);
                aVar2 = (ho.a) next2;
            }
        }
        List<ho.g> list2 = aVar.g;
        ArrayList arrayList = new ArrayList(r.q0(list2, 10));
        for (ho.g gVar3 : list2) {
            if (aVar2 != null) {
                Iterator it2 = aVar2.g.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    ho.g gVar4 = (ho.g) next;
                    if (gVar4.a == gVar3.a && gVar4.c.equals(str)) {
                        break;
                    }
                }
                ho.g gVar5 = (ho.g) next;
                if (gVar5 == null) {
                    gVarA = gVar3;
                } else {
                    gVarA = gVar5;
                }
            } else {
                gVarA = gVar3;
            }
            String str2 = str == null ? gVarA.c : str;
            ?? r8 = this.w;
            int i = gVarA.a;
            String str3 = gVarA.c;
            ho.d dVar = (ho.d) r8.get(new g00.k(Integer.valueOf(i), str2));
            if (dVar != null || (dVar = (ho.d) this.w.get(new g00.k(Integer.valueOf(gVarA.a), str3))) != null) {
                boolean zBooleanValue = ((Boolean) this.l.c.getValue()).booleanValue();
                boolean z = !kotlin.jvm.internal.m.a(dVar.b, str3) || dVar.e >= gVarA.m;
                if (!zBooleanValue || z) {
                    String str4 = dVar.b;
                    String str5 = dVar.g;
                    String str6 = dVar.h;
                    if (str6 == null) {
                        str6 = gVarA.h;
                    }
                    String str7 = str6;
                    long j = dVar.f;
                    Long lValueOf = Long.valueOf(j);
                    if (j <= 0) {
                        lValueOf = null;
                    }
                    gVarA = ho.g.a(gVarA, 0, str4, str5, lValueOf != null ? lValueOf.longValue() : gVarA.f, str7, 0L, false, dVar.e, 12107);
                }
            }
            arrayList.add(gVarA);
        }
        ho.a aVarA = ho.a.a(aVar, arrayList);
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                gVar2 = gVar;
                break;
            }
            Object next3 = it3.next();
            gVar2 = gVar;
            if (((ho.g) next3).a == gVar2.a) {
                obj = next3;
                break;
            }
        }
        ho.g gVar6 = (ho.g) obj;
        if (gVar6 == null) {
            gVar6 = gVar2;
        }
        return new g00.k(aVarA, gVar6);
    }

    public final void n() {
        p1 p1Var;
        Object value;
        p pVar;
        ho.a aVar;
        boolean zIsPlaying;
        long currentPosition;
        long jLongValue;
        i7.z zVar = this.b.b;
        if (zVar == null) {
            return;
        }
        ho.g gVarD = d();
        do {
            p1Var = this.r;
            value = p1Var.getValue();
            pVar = (p) value;
            aVar = this.s;
            zIsPlaying = zVar.isPlaying();
            currentPosition = zVar.getCurrentPosition();
            jLongValue = 0;
            if (currentPosition < 0) {
                currentPosition = 0;
            }
            long duration = zVar.getDuration();
            Long lValueOf = Long.valueOf(duration);
            if (duration <= 0) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            } else {
                Long lValueOf2 = gVarD != null ? Long.valueOf(gVarD.f) : null;
                if (lValueOf2 != null) {
                    jLongValue = lValueOf2.longValue();
                }
            }
        } while (!p1Var.i(value, p.a(pVar, aVar, gVarD, zIsPlaying, currentPosition, jLongValue, 0.0f, null, gVarD != null && h(zVar.getCurrentPosition()), 96)));
    }

    public final void o(ho.g gVar, long j, boolean z, boolean z2) {
        int i = gVar.a;
        String strA = gVar.c;
        if (r30.k.L0(strA)) {
            strA = this.e.a();
        }
        ho.q qVar = new ho.q(i, j, strA, z);
        h40.e eVar = m0.a;
        ta.c0.M(this.q, h40.d.C, (u00.n) null, (u00.k) null, new i2(this, qVar, z2, (k00.c) null, 6), 30);
    }

    public final void p() {
        ho.g gVarD;
        ho.a aVar = this.s;
        if (aVar == null || (gVarD = d()) == null) {
            return;
        }
        int i = aVar.a;
        int i2 = gVarD.a;
        u uVar = this.e;
        uVar.getClass();
        SharedPreferences.Editor editorEdit = uVar.a.edit();
        editorEdit.putInt("audio_stories_last_story_id", i);
        editorEdit.putInt("audio_stories_last_episode_id", i2);
        editorEdit.apply();
    }

    public final void q(ho.a aVar, ho.g gVar, AudioStoryPaywallTrigger audioStoryPaywallTrigger, long j) {
        i7.z zVar = this.b.b;
        if (zVar != null) {
            zVar.pause();
        }
        this.z = true;
        u1 u1Var = this.A;
        boolean z = false;
        if (u1Var != null && u1Var.a()) {
            z = true;
        }
        AudioStoryEpisodeParams audioStoryEpisodeParamsK = k(aVar, gVar);
        if (!z) {
            String analyticsValue = audioStoryPaywallTrigger.getAnalyticsValue();
            if (j < 0) {
                j = 0;
            }
            this.n.logEvent(new AudioStoryAnalyticsEvent.AudioStoryPaywallRequested(audioStoryEpisodeParamsK, analyticsValue, j));
        }
        ((bq.a) this.h).f(true, zp.b.AUDIO_STORIES);
        if (z) {
            return;
        }
        this.A = ta.c0.M(this.q, (k00.i) null, (u00.n) null, (u00.k) null, new g6.a(this, audioStoryEpisodeParamsK, (k00.c) null, 20), 31);
    }

    public final void r() {
        g00.k kVar = this.x;
        if (kVar != null) {
            if (this.s != null) {
                kVar = null;
            }
            if (kVar != null) {
                x((ho.a) kVar.A, (ho.g) kVar.B, ho.o.CONTINUE, false);
                return;
            }
        }
        ho.a aVar = this.s;
        ho.g gVarD = d();
        if (aVar == null || gVarD == null) {
            return;
        }
        e eVar = this.b;
        if (h(eVar.a().getCurrentPosition())) {
            return;
        }
        if (g(gVarD, eVar.a().getCurrentPosition())) {
            q(aVar, gVarD, AudioStoryPaywallTrigger.RESUME, eVar.a().getCurrentPosition());
            return;
        }
        this.c.b(ru.a.B);
        if (eVar.a().getPlaybackState() == 1) {
            eVar.a().prepare();
        }
        eVar.a().play();
    }

    public final void s(boolean z) {
        i7.z zVar;
        ho.g gVarD = d();
        if (gVarD == null || (zVar = this.b.b) == null) {
            return;
        }
        long currentPosition = zVar.getCurrentPosition();
        this.D = SystemClock.elapsedRealtime();
        o(gVarD, currentPosition, false, z);
    }

    public final void t(long j) {
        g00.k kVar = this.x;
        long jA = 0;
        if (kVar != null) {
            if (this.s != null) {
                kVar = null;
            }
            if (kVar != null) {
                ho.a aVar = (ho.a) kVar.A;
                ho.g gVar = (ho.g) kVar.B;
                this.t = aVar;
                g00.k kVarM = m(aVar, gVar);
                y((ho.a) kVarM.A, (ho.g) kVarM.B, j >= 0 ? j : 0L, ho.o.CONTINUE);
                return;
            }
        }
        ho.a aVar2 = this.s;
        if (aVar2 == null) {
            return;
        }
        Long l = null;
        ho.g gVarD = d();
        if (gVarD == null) {
            return;
        }
        e eVar = this.b;
        long duration = eVar.a().getDuration();
        Long lValueOf = Long.valueOf(duration);
        if (duration > 0) {
            l = lValueOf;
        }
        long jLongValue = l != null ? l.longValue() : gVarD.f;
        if (jLongValue > 0) {
            jA = a0.A(j, 0L, jLongValue);
        } else if (j >= 0) {
            jA = j;
        }
        long jI = i(gVarD);
        if (jA >= jI) {
            d dVar = this.m;
            dVar.getClass();
            dVar.a(ho.l.PREVIEW_LIMIT_REACHED, jI);
            eVar.a().seekTo(jI);
            q(aVar2, gVarD, AudioStoryPaywallTrigger.SEEK, jI);
        } else {
            eVar.a().seekTo(jA);
        }
        f();
        n();
    }

    public final void u(ru.d dVar) {
        n nVar;
        ru.d option = dVar;
        kotlin.jvm.internal.m.e(option, "option");
        u1 u1Var = this.F;
        if (u1Var != null) {
            u1Var.i(null);
        }
        this.F = null;
        i7.z zVar = this.b.b;
        if (zVar != null) {
            ?? r1 = option == ru.d.WHEN_SURAH_ENDS ? 1 : 0;
            zVar.A();
            if (zVar.R != r1) {
                zVar.R = r1;
                zVar.l.H.a(23, (int) r1, 0).b();
            }
        }
        Long l = option.A;
        if (l != null) {
            b1.f fVar = new b1.f(l.longValue(), this, (k00.c) null, 4);
            nVar = this;
            nVar.F = ta.c0.M(nVar.q, (k00.i) null, (u00.n) null, (u00.k) null, fVar, 31);
        } else {
            nVar = this;
        }
        while (true) {
            p1 p1Var = nVar.r;
            Object value = p1Var.getValue();
            if (p1Var.i(value, p.a((p) value, null, null, false, 0L, 0L, 0.0f, option, false, 191))) {
                return;
            }
            nVar = this;
            option = dVar;
        }
    }

    public final void v(float f) {
        float f2 = f;
        p1 p1Var = this.r;
        if (f2 != ((p) p1Var.getValue()).f) {
            this.n.logEvent(new AudioStoryAnalyticsEvent.AudioStorySpeedChanged(f2));
        }
        SharedPreferences.Editor editorEdit = this.e.a.edit();
        editorEdit.putFloat("audio_stories_playback_speed", f2);
        editorEdit.apply();
        e eVar = this.b;
        i7.z zVar = eVar.b;
        if (zVar != null) {
            zVar.setPlaybackSpeed(f2);
        }
        i7.z zVar2 = eVar.b;
        long currentPosition = zVar2 != null ? zVar2.getCurrentPosition() : 0L;
        d dVar = this.m;
        if (dVar.f == null) {
            dVar.h = f2;
        } else {
            long jA = a0.A(dVar.e(), 0L, HTTPTimeoutManager.DEFAULT_TIMEOUT_MS);
            dVar.m = 0L;
            dVar.l = SystemClock.elapsedRealtime();
            dVar.h = f2;
            d.b(dVar, ho.l.RATE_CHANGE, currentPosition, null, null, (int) jA, 44);
        }
        while (true) {
            Object value = p1Var.getValue();
            if (p1Var.i(value, p.a((p) value, null, null, false, 0L, 0L, f2, null, false, 223))) {
                return;
            } else {
                f2 = f;
            }
        }
    }

    public final void w() {
        t(this.b.a().getCurrentPosition() + 10000);
    }

    public final void x(ho.a story, ho.g episode, ho.o oVar, boolean z) {
        kotlin.jvm.internal.m.e(story, "story");
        kotlin.jvm.internal.m.e(episode, "episode");
        this.t = story;
        g00.k kVarM = m(story, episode);
        ho.a aVar = (ho.a) kVarM.A;
        ho.g gVar = (ho.g) kVarM.B;
        y(aVar, gVar, z ? 0L : z(gVar), oVar);
    }

    public final void y(ho.a aVar, ho.g gVar, long j, ho.o oVar) {
        if (g(gVar, j)) {
            this.y = new o(aVar, gVar, oVar == null ? ho.o.CONTINUE : oVar);
            q(aVar, gVar, AudioStoryPaywallTrigger.LOCKED_EPISODE, j);
            return;
        }
        this.y = null;
        this.x = null;
        s(true);
        if (this.G == null) {
            Context context = this.a;
            f4 f4Var = new f4(context, new ComponentName(context, (Class<?>) AudioPlayerService.class));
            Bundle bundle = Bundle.EMPTY;
            sg.f fVar = new sg.f();
            Looper looperR = i0.r();
            v vVar = new v(looperR);
            i0.M(new Handler(looperR), new k9.r(vVar, new k9.u(context, f4Var, bundle, fVar, looperR, vVar, f4Var.a.e() ? new h1.l(new g7.g(new c7.g(context))) : null), 0));
            this.G = vVar;
        }
        this.c.b(ru.a.B);
        this.s = aVar;
        Iterator it = aVar.g.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((ho.g) it.next()).a == gVar.a) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i >= 0 ? i : 0;
        this.C = i2;
        e eVar = this.b;
        i7.z zVarA = eVar.a();
        List list = aVar.g;
        ArrayList arrayList = new ArrayList(r.q0(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(this.f.X(new g00.k(aVar, (ho.g) it2.next())));
        }
        zVarA.setMediaItems(arrayList, i2, j);
        androidx.media3.common.f fVarA = eVar.a();
        p1 p1Var = this.r;
        fVarA.setPlaybackSpeed(((p) p1Var.getValue()).f);
        int i3 = aVar.a;
        int i4 = gVar.a;
        String strA = gVar.c;
        if (r30.k.L0(strA)) {
            strA = this.e.a();
        }
        h hVar = new h(i3, strA, i4);
        boolean zH = h(j);
        if (oVar != null) {
            this.m.f(hVar, oVar, j, ((p) p1Var.getValue()).f);
            if (!zH) {
                j(aVar, gVar);
            }
        } else {
            float f = ((p) p1Var.getValue()).f;
            d dVar = this.m;
            dVar.getClass();
            if (dVar.f == null) {
                dVar.f(hVar, ho.o.CONTINUE, j, f);
            } else {
                d.b(dVar, ho.l.PROGRESS, dVar.i, null, null, 0, 28);
                dVar.g = hVar;
                d.b(dVar, ho.l.LANGUAGE_CHANGE, j, null, null, 0, 60);
            }
        }
        eVar.a().prepare();
        if (zH) {
            eVar.a().pause();
            this.n.logEvent(new AudioStoryAnalyticsEvent.AudioStoryRecordingBlocked(k(aVar, gVar)));
        } else {
            eVar.a().play();
        }
        p();
        n();
    }
}
