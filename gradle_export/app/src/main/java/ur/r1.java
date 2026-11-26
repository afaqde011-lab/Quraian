package ur;

import android.content.SharedPreferences;
import bt.y1;
import bv.r2;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.core.deeplink.presentation.analytics.DeepLinkEvent;
import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryAnalyticsEvent;
import com.mchutov.quranify.auth.data.source.local.AuthLocalDataSource;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalyticsSource;
import com.mchutov.quranify.auth.presentation.screen.root.AuthRootLauncher;
import com.mchutov.quranify.home.presentation.analytics.HomeAnalytics;
import com.mchutov.quranify.home.presentation.analytics.HomeEvent;
import com.mchutov.quranify.home.presentation.screen.home.HomeEffect$OpenAudioStoryScreen;
import com.mchutov.quranify.home.presentation.screen.home.HomeEffect$OpenPlaylistScreen;
import com.mchutov.quranify.home.presentation.screen.home.HomeEffect$OpenReciterScreen;
import com.mchutov.quranify.home.presentation.screen.home.HomeEffect$OpenReciterSearchScreen;
import com.mchutov.quranify.home.presentation.screen.playlist.PlaylistLauncher;
import com.mchutov.quranify.reciters.domain.model.ReciterCollectionEvent;
import com.mchutov.quranify.reciters.presentation.screen.detail.main.ReciterLauncher;
import com.mchutov.quranify.reciters.presentation.screen.search.SearchReciterLauncher;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import ri.t1;

public final class r1 extends vm.a {
    public final xw.d A;
    public final or.b B;
    public final pr.b C;
    public final vr.c D;
    public final d40.t0 E;
    public final d40.t0 F;
    public final d40.i G;
    public final uu.a d;
    public final xw.k e;
    public final xw.e f;
    public final tq.k g;
    public final zt.a h;
    public final HomeAnalytics i;
    public final pm.c j;
    public final au.a k;
    public final qu.a l;
    public final aq.a m;
    public final is.m1 n;
    public final pr.c o;
    public final pr.a p;
    public final is.y q;
    public final xv.c r;
    public final er.a s;
    public final wo.b0 t;
    public final wo.c0 u;
    public final bp.g v;
    public final hp.b w;
    public final AuthAnalytics x;
    public final xs.c y;
    public final os.x z;

    public r1(uu.a aVar, xw.k kVar, xw.e eVar, tq.k kVar2, zt.a aVar2, HomeAnalytics homeAnalytics, pm.c cVar, au.a aVar3, qu.a aVar4, aq.a aVar5, is.m1 m1Var, pr.c cVar2, pr.a aVar6, is.y yVar, jr.b bVar, vp.x xVar, xv.c cVar3, er.a aVar7, wo.b0 b0Var, wo.c0 c0Var, bp.g gVar, hp.b bVar2, AuthAnalytics authAnalytics, vs.c cVar4, xs.c cVar5, os.x xVar2, xw.d dVar, or.a aVar8, or.b bVar3, pr.b bVar4, vr.c cVar6) {
        i00.b bVarS = va.a.s();
        AuthLocalDataSource authLocalDataSource = c0Var.a;
        if (!authLocalDataSource.isAuthorized() && !authLocalDataSource.isHomeAuthBannerDismissed()) {
            bVarS.add(qr.b.A);
        }
        Set set = sr.a.a;
        SharedPreferences sharedPreferences = aVar7.a;
        String string = sharedPreferences.getString("last_seen_whats_new_version", null);
        boolean zContains = sharedPreferences.contains("last_change_log_version");
        if (string != null || zContains) {
            if (string == null && zContains) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.remove("last_change_log_version");
                editorEdit.apply();
            }
            string = string == null ? "__legacy__" : string;
            Set set2 = sr.a.a;
            Set set3 = set2;
            if (set3.isEmpty() || set2.contains("2.4.1")) {
                if (!string.equals("2.4.1") && (set3.isEmpty() || set2.contains("2.4.1"))) {
                    bVarS.add(qr.b.D);
                }
            } else if (!string.equals("2.4.1")) {
                sr.a.a(sharedPreferences);
            }
        } else {
            sr.a.a(sharedPreferences);
        }
        u30.b bVarE = ze.d.E(va.a.k(bVarS));
        h00.x xVar3 = h00.x.A;
        super(new h1(ze.d.E(xVar3), qr.p.a, false, null, true, ze.d.E(xVar3), false, ze.d.E(xVar3), ze.d.E(xVar3), null, false, ze.d.E(xVar3), ze.d.E(xVar3), false, false, false, 1, false, ze.d.E(xVar3), ze.d.E(xVar3), mr.e.a, ze.d.E(xVar3), 0, 0, 0, false, true, false, null, (536870912 & (-536870913)) != 0 ? ze.d.E(xVar3) : bVarE, "", "", "", "", false, false, "", "", ze.d.E(xVar3), ze.d.E(xVar3)));
        this.d = aVar;
        this.e = kVar;
        this.f = eVar;
        this.g = kVar2;
        this.h = aVar2;
        this.i = homeAnalytics;
        this.j = cVar;
        this.k = aVar3;
        this.l = aVar4;
        this.m = aVar5;
        this.n = m1Var;
        this.o = cVar2;
        this.p = aVar6;
        this.q = yVar;
        this.r = cVar3;
        this.s = aVar7;
        this.t = b0Var;
        this.u = c0Var;
        this.v = gVar;
        this.w = bVar2;
        this.x = authAnalytics;
        this.y = cVar5;
        this.z = xVar2;
        this.A = dVar;
        this.B = bVar3;
        this.C = bVar4;
        this.D = cVar6;
        d40.i iVarA = cVar4.a(7);
        d40.u0 u0VarF = kVar.f();
        uu.w wVar = (uu.w) aVar;
        d40.p1 p1Var = wVar.B;
        d40.t0 t0VarK = d40.o.k(u0VarF, p1Var, wVar.N, ((ut.p) aVar2).k(), new bt.i1(this, null, 3));
        d40.t0 t0VarL = d40.o.l(wVar.C, wVar.G, wVar.O, new r2(4, null, 1));
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        LocalDate localDateNow = LocalDate.now(zoneIdSystemDefault);
        d40.i iVarO = d40.o.o(d40.o.j(iVarA, new is.k1(m1Var.e(), zoneIdSystemDefault, localDateNow.with((TemporalAdjuster) DayOfWeek.MONDAY), localDateNow.with((TemporalAdjuster) DayOfWeek.SUNDAY)), bVar.b, xVar.k, xVar2.l(), new as.z0(this, null, 3)));
        d40.t0 t0VarL2 = d40.o.l(kVar2.c(), kVar2.c, p1Var, new hx.d0(4, null, 2));
        y1 y1Var = new y1(cVar3.c.c, this, 21);
        k00.c cVar7 = null;
        this.E = d40.o.l(new d40.z0(eVar.e), new d40.z0(eVar.f), new d40.z0(eVar.i), new o1(this, null));
        this.F = d40.o.l(new d40.z0(aVar8.a.g), dVar.g, cVar6.m, new hx.d0(4, null, 3));
        this.G = d40.o.v(d40.o.j(t0VarK, t0VarL, iVarO, t0VarL2, y1Var, new bt.q1(this, cVar7, 1)), a40.m0.a);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new j1(this, cVar7, 3), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new j1(this, cVar7, 4), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new j1(this, cVar7, 5), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new j1(this, cVar7, 2), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), h40.d.C, (u00.n) null, (u00.k) null, new j1(this, cVar7, 1), 30);
        p(false);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new l1(this, false, cVar7, 0 == true ? 1 : 0), 31);
        xVar2.k(7);
    }

    public static final Object j(r1 r1Var, ReciterCollectionEvent reciterCollectionEvent, long j, m00.c cVar) {
        i1 i1Var;
        i00.b bVarK;
        long j2;
        u30.b bVarE;
        i00.b bVar;
        String strA;
        String strR;
        String strR2;
        String info;
        String string;
        String strA2;
        ArrayList arrayList;
        Iterator<T> it;
        String upperCase;
        ReciterCollectionEvent reciterCollectionEvent2 = reciterCollectionEvent;
        pm.c cVar2 = r1Var.j;
        if (cVar instanceof i1) {
            i1Var = (i1) cVar;
            int i = i1Var.F;
            if ((i & Integer.MIN_VALUE) != 0) {
                i1Var.F = i - Integer.MIN_VALUE;
            } else {
                i1Var = new i1(r1Var, cVar);
            }
        } else {
            i1Var = new i1(r1Var, cVar);
        }
        Object objE = i1Var.D;
        Object obj = l00.a.A;
        int i2 = i1Var.F;
        if (i2 == 0) {
            t1.O(objE);
            h00.x xVar = h00.x.A;
            if (reciterCollectionEvent2 == null) {
                return new qr.t(ze.d.E(xVar), "", "", "", "", "", "", ze.d.E(xVar), ze.d.E(xVar));
            }
            boolean z = reciterCollectionEvent2.getReleaseAtEpochMillis() == null ? false : !z3.F(reciterCollectionEvent, j);
            boolean zF = z3.F(reciterCollectionEvent, j);
            String strK = zF ? z3.K(reciterCollectionEvent2) : null;
            boolean z2 = (!zF || reciterCollectionEvent2.getReciterIds().isEmpty() || strK == null || kotlin.jvm.internal.m.a((String) r1Var.f.i.getValue(), strK)) ? false : true;
            i00.b bVarS = va.a.s();
            if (z) {
                bVarS.add(qr.b.B);
            } else if (z2) {
                bVarS.add(qr.b.C);
            }
            bVarK = va.a.k(bVarS);
            if (zF) {
                xw.k kVar = r1Var.e;
                List<Integer> reciterIds = reciterCollectionEvent2.getReciterIds();
                i1Var.A = reciterCollectionEvent2;
                i1Var.B = bVarK;
                j2 = j;
                i1Var.C = j2;
                i1Var.F = 1;
                objE = kVar.e(reciterIds, i1Var);
                if (objE == obj) {
                    return obj;
                }
                bVar = bVarK;
            } else {
                j2 = j;
                bVarE = ze.d.E(xVar);
            }
            u30.b bVar2 = bVarE;
            u30.b bVarE2 = ze.d.E(bVarK);
            if (reciterCollectionEvent2.getReciterIds().size() > 1) {
                strA = cVar2.a(2131886911, new Object[0]);
            } else {
                strA = cVar2.a(2131886910, new Object[0]);
            }
            String str = strA;
            strR = r(reciterCollectionEvent2, cVar2, j2);
            if (strR == null) {
                strR = "";
            }
            if (strR.length() == 0) {
                strR = cVar2.a(2131887156, new Object[0]);
            }
            String str2 = strR;
            int size = reciterCollectionEvent2.getReciterIds().size();
            String quantityString = cVar2.a.getQuantityString(2131755012, size, Integer.valueOf(size));
            kotlin.jvm.internal.m.d(quantityString, "getQuantityString(...)");
            String strA3 = cVar2.a(2131887333, new Object[0]);
            strR2 = r(reciterCollectionEvent2, cVar2, j2);
            if (strR2 == null) {
                strR2 = "";
            }
            if (strR2.length() == 0) {
                strR2 = cVar2.a(2131887156, new Object[0]);
            }
            String str3 = strR2;
            info = reciterCollectionEvent2.getInfo();
            if (info != null) {
                string = r30.k.j1(info).toString();
            } else {
                string = null;
            }
            strA2 = string != null ? string : "";
            if (strA2.length() == 0) {
                strA2 = cVar2.a(2131887175, new Object[0]);
            }
            String str4 = strA2;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            List<String> countries = reciterCollectionEvent2.getCountries();
            arrayList = new ArrayList();
            it = countries.iterator();
            while (it.hasNext()) {
                upperCase = r30.k.j1((String) it.next()).toString().toUpperCase(Locale.ROOT);
                kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
                if (upperCase.length() != 0 || !linkedHashSet.add(upperCase)) {
                    upperCase = null;
                }
                if (upperCase != null) {
                    arrayList.add(upperCase);
                }
            }
            return new qr.t(bVarE2, str, str2, quantityString, strA3, str3, str4, g4.d0(arrayList), bVar2);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j3 = i1Var.C;
        bVar = i1Var.B;
        ReciterCollectionEvent reciterCollectionEvent3 = i1Var.A;
        t1.O(objE);
        j2 = j3;
        reciterCollectionEvent2 = reciterCollectionEvent3;
        bVarE = ze.d.E((List) objE);
        bVarK = bVar;
        u30.b bVar3 = bVarE;
        u30.b bVarE3 = ze.d.E(bVarK);
        if (reciterCollectionEvent2.getReciterIds().size() > 1) {
            strA = cVar2.a(2131886911, new Object[0]);
        } else {
            strA = cVar2.a(2131886910, new Object[0]);
        }
        String str5 = strA;
        strR = r(reciterCollectionEvent2, cVar2, j2);
        if (strR == null) {
            strR = "";
        }
        if (strR.length() == 0) {
            strR = cVar2.a(2131887156, new Object[0]);
        }
        String str6 = strR;
        int size2 = reciterCollectionEvent2.getReciterIds().size();
        String quantityString2 = cVar2.a.getQuantityString(2131755012, size2, Integer.valueOf(size2));
        kotlin.jvm.internal.m.d(quantityString2, "getQuantityString(...)");
        String strA4 = cVar2.a(2131887333, new Object[0]);
        strR2 = r(reciterCollectionEvent2, cVar2, j2);
        if (strR2 == null) {
            strR2 = "";
        }
        if (strR2.length() == 0) {
            strR2 = cVar2.a(2131887156, new Object[0]);
        }
        String str7 = strR2;
        info = reciterCollectionEvent2.getInfo();
        if (info != null) {
            string = r30.k.j1(info).toString();
        } else {
            string = null;
        }
        if (string != null) {
        }
        if (strA2.length() == 0) {
            strA2 = cVar2.a(2131887175, new Object[0]);
        }
        String str8 = strA2;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        List<String> countries2 = reciterCollectionEvent2.getCountries();
        arrayList = new ArrayList();
        it = countries2.iterator();
        while (it.hasNext()) {
            upperCase = r30.k.j1((String) it.next()).toString().toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
            if (upperCase.length() != 0) {
                upperCase = null;
            } else {
                upperCase = null;
            }
            if (upperCase != null) {
                arrayList.add(upperCase);
            }
        }
        return new qr.t(bVarE3, str5, str6, quantityString2, strA4, str7, str8, g4.d0(arrayList), bVar3);
    }

    public static final void k(r1 r1Var, ep.p pVar, String str) {
        r1Var.o();
        if (kotlin.jvm.internal.m.a(pVar, ep.n.a)) {
            r1Var.x.signInCompleted(str);
            ab.a0.A0(r1Var, new u0(r1Var.j.a(2131886222, new Object[0])));
        } else {
            if (!(pVar instanceof ep.o)) {
                throw new NoWhenBranchMatchedException();
            }
            ep.o oVar = (ep.o) pVar;
            r1Var.w.b(oVar.a, oVar.b, oVar.d, AuthAnalyticsSource.SIDEBAR, oVar.c);
        }
    }

    public static u30.b n(r1 r1Var, List list, boolean z) {
        wo.c0 c0Var = r1Var.u;
        boolean z2 = (c0Var.a.isAuthorized() || c0Var.a.isHomeAuthBannerDismissed()) ? false : true;
        r1Var.getClass();
        i00.b bVarS = va.a.s();
        bVarS.addAll(list);
        if (z2) {
            bVarS.add(qr.b.A);
        }
        if (z) {
            bVarS.add(qr.b.D);
        }
        return ze.d.E(va.a.k(bVarS));
    }

    public static ArrayList q(u30.b bVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : bVar) {
            qr.b bVar2 = (qr.b) obj;
            if (bVar2 == qr.b.B || bVar2 == qr.b.C) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static String r(ReciterCollectionEvent reciterCollectionEvent, pm.c cVar, long j) {
        Integer numValueOf;
        Long releaseAtEpochMillis = reciterCollectionEvent.getReleaseAtEpochMillis();
        if (releaseAtEpochMillis != null) {
            long jLongValue = releaseAtEpochMillis.longValue() - j;
            if (jLongValue <= 0) {
                return cVar.a(2131887155, new Object[0]);
            }
            Long releaseAtEpochMillis2 = reciterCollectionEvent.getReleaseAtEpochMillis();
            if (releaseAtEpochMillis2 != null) {
                double dLongValue = (releaseAtEpochMillis2.longValue() - j) / 1000.0d;
                if (dLongValue <= 0.0d || dLongValue > 6.0d) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(Math.max(1, (int) dLongValue));
                }
            } else {
                numValueOf = null;
            }
            if (numValueOf == null) {
                double d = jLongValue / 1000.0d;
                double d2 = d / ((double) 3600);
                if (d2 >= 24.0d) {
                    int i = ((int) d2) / 24;
                    return i == 1 ? cVar.a(2131887166, new Object[0]) : cVar.a(2131887157, Integer.valueOf(i));
                }
                if (d2 >= 1.0d) {
                    int i2 = (int) d2;
                    return i2 == 1 ? cVar.a(2131887167, new Object[0]) : cVar.a(2131887158, Integer.valueOf(i2));
                }
                double d3 = d / ((double) 60);
                if (d3 >= 1.0d) {
                    int i3 = (int) d3;
                    return i3 == 1 ? cVar.a(2131887168, new Object[0]) : cVar.a(2131887159, Integer.valueOf(i3));
                }
                int iMax = Math.max(1, (int) d);
                return iMax == 1 ? cVar.a(2131887169, new Object[0]) : cVar.a(2131887170, Integer.valueOf(iMax));
            }
        }
        return null;
    }

    public final void l(p0 action) {
        Object next;
        Object next2;
        oq.a aVarE;
        Object next3;
        kotlin.jvm.internal.m.e(action, "action");
        int i = 0;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        ?? ValueOf = 0;
        Object obj = null;
        Object obj2 = null;
        aVar = null;
        oq.a aVar = null;
        if (action instanceof e0) {
            uu.w wVar = (uu.w) this.d;
            wVar.getClass();
            uu.w.m(wVar, false, 1);
            v6.a aVarI = androidx.lifecycle.u0.i(this);
            h40.e eVar = a40.m0.a;
            ta.c0.M(aVarI, h40.d.C, (u00.n) null, (u00.k) null, new j1(this, ValueOf, 7), 30);
            p(true);
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new l1(this, z, ValueOf, i), 31);
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new j1(this, ValueOf, 8), 31);
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new j1(this, ValueOf, 6), 31);
            return;
        }
        if (action instanceof f0) {
            ((uu.w) this.d).h();
            return;
        }
        int i2 = 2;
        if (action instanceof m0) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new k1(this, ((m0) action).a, ValueOf, i2), 31);
            return;
        }
        if (action instanceof q) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new k1(this, ((q) action).a, ValueOf, z4 ? 1 : 0), 31);
            return;
        }
        if (action instanceof z) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new k1(this, ((z) action).a, ValueOf, i), 31);
            return;
        }
        if (action instanceof d0) {
            ab.a0.A0(this, new HomeEffect$OpenReciterScreen(new ReciterLauncher(((d0) action).a, (Integer) null, 2, (kotlin.jvm.internal.f) null)));
            return;
        }
        if (action instanceof a0) {
            int i3 = ((a0) action).a;
            for (Object obj3 : ((h1) this.c.d.getValue()).l) {
                if (((dw.a) obj3).a == i3) {
                    obj = obj3;
                    break;
                }
            }
            dw.a aVar2 = (dw.a) obj;
            if (aVar2 == null) {
                return;
            }
            this.i.logEvent(new HomeEvent.MixSelected(aVar2.c));
            ab.a0.A0(this, new HomeEffect$OpenPlaylistScreen(new PlaylistLauncher(i3)));
            return;
        }
        if (action instanceof l) {
            bx.c cVar = ((h1) this.c.d.getValue()).d;
            if (cVar != null) {
                ab.a0.A0(this, new HomeEffect$OpenReciterScreen(new ReciterLauncher(cVar.a, (Integer) null, 2, (kotlin.jvm.internal.f) null)));
                return;
            }
            return;
        }
        if (action instanceof l0) {
            ab.a0.A0(this, q0.a);
            return;
        }
        if (action instanceof k0) {
            ab.a0.A0(this, s0.a);
            return;
        }
        if (action instanceof p) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new j1(this, ValueOf, i), 31);
            return;
        }
        if (action instanceof j0) {
            i(h1.a((h1) this.c.d.getValue(), null, null, false, null, false, null, false, null, null, null, false, null, null, false, true, false, 0, false, null, null, null, null, 0, 0, 0, false, false, false, null, null, null, null, null, null, false, false, null, null, null, null, -16385, 255));
            return;
        }
        if (action instanceof s) {
            pm.b bVar = this.c;
            if (((h1) bVar.d.getValue()).p) {
                return;
            }
            i(h1.a((h1) bVar.d.getValue(), null, null, false, null, false, null, false, null, null, null, false, null, null, false, false, false, 0, false, null, null, null, null, 0, 0, 0, false, false, false, null, null, null, null, null, null, false, false, null, null, null, null, -16385, 255));
            return;
        }
        if (action instanceof b0) {
            ((bq.a) this.m).f(true, zp.b.HOME);
            return;
        }
        if (action instanceof x) {
            ab.a0.A0(this, new x0() {
                public static final int $stable = 0;

                public boolean equals(Object other) {
                    return this == other || (other instanceof HomeEffect$OpenInsightsScreen);
                }

                @Override
                public long getDebounce() {
                    return 300L;
                }

                public int hashCode() {
                    return -728374317;
                }

                public String toString() {
                    return "OpenInsightsScreen";
                }
            });
            return;
        }
        if (action instanceof v) {
            bx.c cVar2 = ((h1) this.c.d.getValue()).d;
            if (cVar2 != null) {
                ab.a0.A0(this, new HomeEffect$OpenReciterScreen(new ReciterLauncher(cVar2.a, (Integer) null, 2, (kotlin.jvm.internal.f) null)));
                return;
            }
            return;
        }
        int i4 = 10;
        if (action instanceof i0) {
            String str = ((i0) action).a;
            u30.b bVar2 = ((h1) this.c.d.getValue()).f;
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : bVar2) {
                if (obj4 instanceof qr.k) {
                    arrayList.add(obj4);
                }
            }
            for (Object obj5 : arrayList) {
                if (kotlin.jvm.internal.m.a(((qr.k) obj5).a, str)) {
                    obj2 = obj5;
                    break;
                }
            }
            qr.k kVar = (qr.k) obj2;
            if (kVar == null) {
                return;
            }
            String str2 = kVar.d;
            u30.b bVar3 = kVar.f;
            ArrayList arrayList2 = new ArrayList(h00.r.q0(bVar3, 10));
            Iterator it = bVar3.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((bx.c) it.next()).a));
            }
            ab.a0.A0(this, new HomeEffect$OpenReciterSearchScreen(new SearchReciterLauncher(str2, arrayList2, (String) null, 4, (kotlin.jvm.internal.f) null)));
            return;
        }
        if (action instanceof h0) {
            ab.a0.A0(this, r0.a);
            return;
        }
        if (action instanceof d) {
            m(((d) action).a, false);
            return;
        }
        if (action instanceof f) {
            m(((f) action).a, true);
            return;
        }
        if (action instanceof e) {
            int i5 = ((e) action).a;
            vr.c cVar3 = this.D;
            Iterator it2 = cVar3.j.iterator();
            do {
                if (!it2.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it2.next();
            } while (((ho.a) next3).a != i5);
            ho.a aVar3 = (ho.a) next3;
            if (aVar3 == null) {
                return;
            }
            List list = aVar3.g;
            List list2 = cVar3.k;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj6 : list2) {
                if (((ho.d) obj6).c == i5) {
                    arrayList3.add(obj6);
                }
            }
            lo.i iVarX = ko.e.X(new ko.f(i5, list, null, arrayList3, cVar3.l));
            if (iVarX instanceof lo.g) {
                ((vn.o) cVar3.e).a(i5, null);
                return;
            }
            if (iVarX.equals(lo.f.a)) {
                return;
            }
            if (!iVarX.equals(lo.h.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!cVar3.d.k()) {
                ((bq.a) this.m).f(true, zp.b.AUDIO_STORY_DOWNLOADS);
                return;
            }
            vn.o oVar = (vn.o) cVar3.e;
            a40.c0.y(oVar.f, null, null, new vn.i(oVar, aVar3, null), 3);
            oVar.e(aVar3.a, null, false);
            return;
        }
        if (action instanceof g) {
            int i6 = ((g) action).a;
            vr.c cVar4 = this.D;
            Iterator it3 = cVar4.j.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (((ho.a) next2).a != i6);
            ho.a aVar4 = (ho.a) next2;
            if (aVar4 != null && (aVarE = cVar4.g.e(aVar4)) != null) {
                cVar4.h.logEvent(new DeepLinkEvent.ContentShared("story", String.valueOf(aVar4.a), "home_screen"));
                aVar = aVarE;
            }
            if (aVar == null) {
                return;
            }
            ab.a0.A0(this, new t0(aVar));
            return;
        }
        if (action instanceof c) {
            i(h1.a((h1) this.c.d.getValue(), null, null, false, null, false, null, false, null, null, null, false, null, null, false, false, false, 0, false, null, null, null, null, 0, 0, 0, false, false, false, null, null, null, null, null, null, false, false, null, null, null, null, -65, 255));
            vr.c cVar5 = this.D;
            Iterator it4 = cVar5.j.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (!((ho.a) next).b.equals("prophet-yunus"));
            ho.a aVar5 = (ho.a) next;
            if (aVar5 != null || (aVar5 = (ho.a) h00.q.N0(cVar5.j)) != null) {
                cVar5.f.logEvent(new AudioStoryAnalyticsEvent.AudioStoryPreviewCtaTapped(aVar5.a, aVar5.b));
                ValueOf = Integer.valueOf(aVar5.a);
            }
            if (ValueOf != 0) {
                ab.a0.A0(this, new HomeEffect$OpenAudioStoryScreen(ValueOf.intValue()));
                return;
            }
            return;
        }
        if (action instanceof b) {
            i(h1.a((h1) this.c.d.getValue(), null, null, false, null, false, null, false, null, null, null, false, null, null, false, false, false, 0, false, null, null, null, null, 0, 0, 0, false, false, false, null, null, null, null, null, null, false, false, null, null, null, null, -65, 255));
            return;
        }
        if (action instanceof m) {
            er.a aVar6 = this.s;
            aVar6.getClass();
            Set set = sr.a.a;
            sr.a.a(aVar6.a);
            h1 h1Var = (h1) this.c.d.getValue();
            i(h1.a(h1Var, null, null, false, null, false, null, false, null, null, null, false, null, null, false, false, false, 0, false, null, null, null, null, 0, 0, 0, false, false, false, null, n(this, q(h1Var.D), false), null, null, null, null, false, false, null, null, null, null, -536870913, 255));
            return;
        }
        if (action instanceof o0) {
            i(h1.a((h1) this.c.d.getValue(), null, null, false, null, false, null, false, null, null, null, false, null, null, false, false, false, 0, false, null, null, null, null, 0, 0, 0, false, false, false, null, null, null, null, null, null, true, false, null, null, null, null, -1, 251));
            return;
        }
        if (action instanceof c0) {
            i(h1.a((h1) this.c.d.getValue(), null, null, false, null, false, null, false, null, null, null, false, null, null, false, false, false, 0, false, null, null, null, null, 0, 0, 0, false, false, false, null, null, null, null, null, null, false, true, null, null, null, null, -1, 247));
            return;
        }
        if (action instanceof u) {
            i(h1.a((h1) this.c.d.getValue(), null, null, false, null, false, null, false, null, null, null, false, null, null, false, false, false, 0, false, null, null, null, null, 0, 0, 0, false, false, false, null, null, null, null, null, null, false, false, null, null, null, null, -1, 251));
            return;
        }
        if (action instanceof t) {
            i(h1.a((h1) this.c.d.getValue(), null, null, false, null, false, null, false, null, null, null, false, null, null, false, false, false, 0, false, null, null, null, null, 0, 0, 0, false, false, false, null, null, null, null, null, null, false, false, null, null, null, null, -1, 247));
            return;
        }
        if (action instanceof y) {
            xw.e eVar2 = this.f;
            ReciterCollectionEvent reciterCollectionEvent = (ReciterCollectionEvent) eVar2.e.getValue();
            if (reciterCollectionEvent != null && z3.F(reciterCollectionEvent, System.currentTimeMillis())) {
                String key = z3.K(reciterCollectionEvent);
                kotlin.jvm.internal.m.e(key, "key");
                SharedPreferences.Editor editorEdit = eVar2.a.edit();
                editorEdit.putString("lastSeenPublishedReciterEventKey", key);
                editorEdit.apply();
                d40.p1 p1Var = eVar2.i;
                p1Var.getClass();
                p1Var.k(null, key);
                ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new m1(this, ValueOf, i), 31);
                return;
            }
            return;
        }
        if (action instanceof n0) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new p1(this, ((n0) action).a, ValueOf, z3 ? 1 : 0), 31);
            return;
        }
        if (action instanceof o) {
            int i7 = ((o) action).a;
            pm.b bVar4 = this.c;
            if (((h1) bVar4.d.getValue()).p) {
                return;
            }
            this.i.logEvent(new HomeEvent.GoalAdjusted(i7));
            this.n.g(i7);
            this.q.e();
            i(h1.a((h1) bVar4.d.getValue(), null, null, false, null, false, null, false, null, null, null, false, null, null, false, false, true, i7, false, null, null, null, null, 0, 0, 0, false, false, false, null, null, null, null, null, null, false, false, null, null, null, null, -98305, 255));
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, new a1.r1(this, (k00.c) null, 10), new p1(this, i7, ValueOf, i), 23);
            return;
        }
        if (action instanceof g0) {
            s();
            return;
        }
        if (action instanceof h) {
            this.x.authorizationTapped(AuthAnalyticsSource.SIDEBAR);
            i(h1.a((h1) this.c.d.getValue(), null, null, false, null, false, null, false, null, null, null, false, null, null, false, false, false, 0, false, null, null, null, null, 0, 0, 0, false, false, true, null, null, null, null, null, null, false, false, null, null, null, null, -134217729, 255));
            return;
        }
        if (action instanceof i) {
            this.u.a.setHomeAuthBannerDismissed(true);
            s();
            return;
        }
        if (action instanceof r) {
            this.x.authorizationDismissed(AuthAnalyticsSource.SIDEBAR);
            o();
            return;
        }
        if (action instanceof j) {
            i(h1.a((h1) this.c.d.getValue(), null, null, false, null, false, null, false, null, null, null, false, null, null, false, false, false, 0, false, null, null, null, null, 0, 0, 0, false, false, true, null, null, null, null, null, null, false, false, null, null, null, null, -402653185, 255));
            return;
        }
        if (action instanceof n) {
            o();
            return;
        }
        if (!(action instanceof k)) {
            if (action instanceof w) {
                ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, new n1(this, ValueOf, i2), (u00.k) null, new pz.k(this, ((w) action).a, (k00.c) ValueOf, 11), 27);
                return;
            } else {
                if (!(action instanceof a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, new n1(this, ValueOf, z2 ? 1 : 0), (u00.k) null, new pz.k(this, ((a) action).a, (k00.c) ValueOf, i4), 27);
                return;
            }
        }
        ep.e eVar3 = ((k) action).a;
        this.x.authProviderSelected(eVar3);
        int iOrdinal = eVar3.ordinal();
        if (iOrdinal == 0) {
            o();
            ab.a0.A0(this, v0.a);
        } else if (iOrdinal == 1) {
            o();
            ab.a0.A0(this, w0.a);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i(h1.a((h1) this.c.d.getValue(), null, null, false, null, false, null, false, null, null, null, false, null, null, false, false, false, 0, false, null, null, null, null, 0, 0, 0, false, false, false, new AuthRootLauncher(eVar3), null, null, null, null, null, false, false, null, null, null, null, -402653185, 255));
        }
    }

    public final void m(int i, boolean z) {
        Object obj;
        Object next;
        vr.c cVar = this.D;
        vn.u uVar = cVar.c;
        boolean z2 = false;
        if (!uVar.a.getBoolean("audio_stories_preview_shown", false) && !cVar.d.k()) {
            z2 = true;
            oi.k.v(uVar.a, "audio_stories_preview_shown", true);
            cVar.f.logEvent(AudioStoryAnalyticsEvent.AudioStoryPreviewScreenViewed.INSTANCE);
        }
        if (z2) {
            i(h1.a((h1) this.c.d.getValue(), null, null, false, null, false, null, true, null, null, null, false, null, null, false, false, false, 0, false, null, null, null, null, 0, 0, 0, false, false, false, null, null, null, null, null, null, false, false, null, null, null, null, -65, 255));
        }
        vr.c cVar2 = this.D;
        Iterator it = cVar2.j.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ho.a) next).a != i);
        ho.a aVar = (ho.a) next;
        if (aVar != null) {
            cVar2.f.logEvent(new AudioStoryAnalyticsEvent.AudioStoryCardTapped(aVar.a, aVar.b, z ? "play" : "card", z2));
        }
        if (z2) {
            return;
        }
        if (!z) {
            ab.a0.A0(this, new HomeEffect$OpenAudioStoryScreen(i));
            return;
        }
        vr.c cVar3 = this.D;
        for (Object obj2 : cVar3.j) {
            if (((ho.a) obj2).a == i) {
                obj = obj2;
                break;
            }
        }
        ho.a aVar2 = (ho.a) obj;
        if (aVar2 == null) {
            return;
        }
        cVar3.b.playOrPauseFromStart(aVar2, ho.o.HOME);
    }

    public final void o() {
        i(h1.a((h1) this.c.d.getValue(), null, null, false, null, false, null, false, null, null, null, false, null, null, false, false, false, 0, false, null, null, null, null, 0, 0, 0, false, false, false, null, null, null, null, null, null, false, false, null, null, null, null, -402653185, 255));
        s();
    }

    public final void p(boolean z) {
        k00.c cVar = null;
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new l1(this, z, cVar, 1), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), h40.d.C, (u00.n) null, (u00.k) null, new l1(this, z, cVar, 2), 30);
    }

    public final void s() {
        h1 h1Var = (h1) this.c.d.getValue();
        i(h1.a(h1Var, null, null, false, null, false, null, false, null, null, null, false, null, null, false, false, false, 0, false, null, null, null, null, 0, 0, 0, false, false, false, null, n(this, q(h1Var.D), h1Var.D.contains(qr.b.D)), null, null, null, null, false, false, null, null, null, null, -536870913, 255));
    }
}
