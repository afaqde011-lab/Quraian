package bt;

import com.google.android.gms.internal.measurement.g4;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalyticsSource;
import com.mchutov.quranify.auth.presentation.screen.root.AuthRootLauncher;
import com.mchutov.quranify.home.presentation.analytics.HomeAnalytics;
import com.mchutov.quranify.home.presentation.analytics.HomeEvent;
import com.mchutov.quranify.insights.presentation.screen.insights.InsightsAction$OnCloseScreen;
import com.mchutov.quranify.insights.presentation.screen.insights.InsightsEffect$CloseScreen;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

public final class j2 extends vm.a {
    public final xw.k d;
    public final is.m1 e;
    public final pr.c f;
    public final xs.b g;
    public final is.y h;
    public final uu.a i;
    public final aq.a j;
    public final vp.x k;
    public final wo.c0 l;
    public final bp.g m;
    public final hp.b n;
    public final pm.c o;
    public final AuthAnalytics p;
    public final HomeAnalytics q;
    public final vs.c r;
    public final xs.c s;
    public final os.x t;
    public final d40.i u;
    public final d40.t0 v;
    public final d40.i w;
    public final d40.i x;

    public j2(is.j jVar, is.c cVar, is.f fVar, xw.k kVar, is.m1 m1Var, pr.c cVar2, xs.b bVar, jr.b bVar2, is.y yVar, uu.a aVar, aq.a aVar2, vp.x xVar, wo.c0 c0Var, bp.g gVar, hp.b bVar3, pm.c cVar3, AuthAnalytics authAnalytics, HomeAnalytics homeAnalytics, vs.c cVar4, is.g1 g1Var, xs.c cVar5, os.x xVar2) {
        boolean zK = xVar.k();
        int iB = m1Var.b();
        ys.c cVar6 = ys.c.DAY;
        h00.x xVar3 = h00.x.A;
        super(new a1(cVar6, zK, false, null, false, false, false, false, false, null, null, null, ze.d.E(xVar3), null, null, mr.e.a, iB, ze.d.E(xVar3), false, false, false, false, false, false));
        this.d = kVar;
        this.e = m1Var;
        this.f = cVar2;
        this.g = bVar;
        this.h = yVar;
        this.i = aVar;
        this.j = aVar2;
        this.k = xVar;
        this.l = c0Var;
        this.m = gVar;
        this.n = bVar3;
        this.o = cVar3;
        this.p = authAnalytics;
        this.q = homeAnalytics;
        this.r = cVar4;
        this.s = cVar5;
        this.t = xVar2;
        d40.i iVarA = cVar4.a(7);
        d40.z0 z0Var = new d40.z0(c0Var.c);
        y1 y1Var = new y1(d40.o.n(rd.a.o(g1Var.b.a.a, false, new String[]{"listening_year"}, new g1.s1(LocalDate.now().getYear(), 11)), new ir.b(9)), g1Var, 11);
        h40.e eVar = a40.m0.a;
        d40.u0 u0Var = new d40.u0(z0Var, d40.o.v(y1Var, eVar), new i2(3, null, 0));
        e40.i iVarY = d40.o.y(d40.o.o(new t1(this.c.d, 0)), new r1(0, this, null));
        d40.i iVarL = xVar2.l();
        d40.z0 z0Var2 = xVar.k;
        k00.c cVar7 = null;
        this.u = d40.o.v(d40.o.o(d40.o.k(u0Var, iVarY, new d40.u0(iVarL, z0Var2, n1.H), d40.o.o(new t1(this.c.d, 1)), new i1(this, cVar7, 1))), eVar);
        d40.u0 u0Var2 = new d40.u0(iVarY, jVar.c(), new f1(2, this, cVar7));
        d40.u0 u0Var3 = new d40.u0(iVarY, cVar.b(), new f1(0, this, cVar7));
        d40.u0 u0Var4 = new d40.u0(iVarY, fVar.b(), new f1(1, this, cVar7));
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        LocalDate localDateNow = LocalDate.now(zoneIdSystemDefault);
        d40.u0 u0Var5 = new d40.u0(iVarA, new is.k1(m1Var.e(), zoneIdSystemDefault, localDateNow.with((TemporalAdjuster) DayOfWeek.MONDAY), localDateNow.with((TemporalAdjuster) DayOfWeek.SUNDAY)), new f2(this, null, 0));
        t1 t1Var = new t1(new d40.u0(new t1(this.c.d, 2), u0Var2, new g1(0, this, null)), 12);
        k00.c cVar8 = null;
        t1 t1Var2 = new t1(new d40.u0(new t1(this.c.d, 3), u0Var4, new g1(1, this, null)), 12);
        int i = 3;
        d40.t0 t0VarL = d40.o.l(iVarA, t1Var, d40.o.o(d40.o.y(new t1(new d40.z(new d40.u0(t1Var, xVar2.l(), new f2(this, cVar8, 1)), new g2(i, cVar8, 0)), 12), new h2(i, cVar8, 0))), new h1(this, null));
        a2 a2Var = new a2(new t1(d40.o.k(new y1(this.c.d, this, 0), u0Var3, u0Var4, kVar.f(), new i1(this, cVar8, 0)), 12), 0);
        c2 c2Var = new c2(t1Var2, this, 0);
        d40.z0 z0Var3 = bVar2.b;
        k00.c cVar9 = null;
        this.v = d40.o.j(u0Var, iVarA, jVar.c(), m1Var.e(), d40.o.o(new t1(z0Var3, 4)), new q1(this, cVar9, 0));
        int i2 = 1;
        this.w = d40.o.v(d40.o.j(t0VarL, a2Var, c2Var, d40.o.y(d40.o.o(z0Var2), new r1(i2, this, cVar9)), new c2(t1Var, this, i2), new b1(0, cVar9)), eVar);
        this.x = d40.o.v(d40.o.k(u0Var5, z0Var3, ((uu.w) aVar).C, m1Var.f, new e1(this, null)), eVar);
        homeAnalytics.logEvent(new HomeEvent.InsightsViewed(cVar6.a()));
        p(cVar6);
        k00.c cVar10 = null;
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new d1(2, this, cVar10), 31);
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new d1(4, this, cVar10), 31);
        xVar2.u();
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new d1(3, this, cVar10), 31);
    }

    public static final ys.m j(j2 j2Var, List list, List list2, int i, Boolean bool) {
        long jIntValue;
        LocalDate localDate;
        LocalDate localDate2;
        boolean zBooleanValue;
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        LocalDate localDateNow = LocalDate.now(zoneIdSystemDefault);
        LocalDate localDateOf = LocalDate.of(localDateNow.getYear(), 1, 1);
        int iLengthOfYear = localDateOf.lengthOfYear();
        long epochSecond = localDateOf.atStartOfDay(zoneIdSystemDefault).toEpochSecond();
        long epochSecond2 = localDateOf.plusDays(((long) iLengthOfYear) - 1).atStartOfDay(zoneIdSystemDefault).toEpochSecond();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            long j = ((rs.c) obj).b;
            if (epochSecond <= j && j <= epochSecond2) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            Long lValueOf = Long.valueOf(((rs.c) obj2).b);
            Object arrayList2 = linkedHashMap.get(lValueOf);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(lValueOf, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(h00.d0.P(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                i2 += ((rs.c) it.next()).d;
            }
            linkedHashMap2.put(key, Integer.valueOf(i2));
        }
        int iP = h00.d0.P(h00.r.q0(list2, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iP);
        for (Object obj3 : list2) {
            linkedHashMap3.put(Long.valueOf(((rs.f) obj3).b), obj3);
        }
        ArrayList arrayList3 = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < iLengthOfYear) {
            LocalDate localDatePlusDays = localDateOf.plusDays(i3);
            long epochSecond3 = localDatePlusDays.atStartOfDay(zoneIdSystemDefault).toEpochSecond();
            ZoneId zoneId = zoneIdSystemDefault;
            String str = localDatePlusDays.getYear() + "-" + localDatePlusDays.getMonthValue() + "-" + localDatePlusDays.getDayOfMonth();
            if (localDatePlusDays.isAfter(localDateNow)) {
                arrayList3.add(new ys.g(str, ys.i.a));
                localDate = localDateNow;
                localDate2 = localDateOf;
            } else {
                i4++;
                rs.f fVar = (rs.f) linkedHashMap3.get(Long.valueOf(epochSecond3));
                if (fVar != null) {
                    jIntValue = fVar.c;
                } else {
                    Integer num = (Integer) linkedHashMap2.get(Long.valueOf(epochSecond3));
                    jIntValue = num != null ? num.intValue() : 0L;
                }
                int i6 = fVar != null ? fVar.d : i;
                Boolean bool2 = localDatePlusDays.equals(localDateNow) ? bool : null;
                if (bool2 != null) {
                    zBooleanValue = bool2.booleanValue();
                    localDate = localDateNow;
                    localDate2 = localDateOf;
                } else {
                    localDate = localDateNow;
                    localDate2 = localDateOf;
                    zBooleanValue = jIntValue >= ((long) (i6 * 60));
                }
                if (zBooleanValue) {
                    i5++;
                    arrayList3.add(new ys.g(str, ys.h.a));
                } else {
                    arrayList3.add(new ys.g(str, jIntValue > 0 ? ys.k.a : ys.j.a));
                }
            }
            i3++;
            localDateNow = localDate;
            localDateOf = localDate2;
            zoneIdSystemDefault = zoneId;
        }
        ArrayList arrayListE0 = h00.q.E0(arrayList3, 31);
        ArrayList arrayList4 = new ArrayList(h00.r.q0(arrayListE0, 10));
        Iterator it2 = arrayListE0.iterator();
        while (it2.hasNext()) {
            arrayList4.add(ze.d.E((List) it2.next()));
        }
        u30.b bVarD0 = g4.d0(arrayList4);
        String plainString = i4 > 0 ? new BigDecimal(((long) i5) * ((long) 100)).divide(new BigDecimal(i4), 2, RoundingMode.DOWN).stripTrailingZeros().toPlainString() : "0";
        kotlin.jvm.internal.m.b(plainString);
        return new ys.m(i5, i4, plainString, bVarD0);
    }

    public static final ArrayList k(j2 j2Var, List list, ys.c cVar, u00.k kVar) {
        LocalDate localDateMinusDays;
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        LocalDate localDateNow = LocalDate.now(zoneIdSystemDefault);
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            localDateMinusDays = localDateNow;
        } else if (iOrdinal == 1) {
            localDateMinusDays = localDateNow.minusDays(6L);
        } else if (iOrdinal == 2) {
            localDateMinusDays = localDateNow.minusDays(29L);
        } else if (iOrdinal == 3) {
            localDateMinusDays = localDateNow.minusDays(89L);
        } else {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            localDateMinusDays = localDateNow.minusYears(1L).plusDays(1L);
        }
        long epochSecond = localDateMinusDays.atStartOfDay(zoneIdSystemDefault).toEpochSecond();
        long epochSecond2 = localDateNow.atStartOfDay(zoneIdSystemDefault).toEpochSecond();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            long jLongValue = ((Number) kVar.invoke(obj)).longValue();
            if (epochSecond <= jLongValue && jLongValue <= epochSecond2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void l(j2 j2Var, ep.p pVar, String str) {
        j2Var.o();
        if (kotlin.jvm.internal.m.a(pVar, ep.n.a)) {
            j2Var.p.signInCompleted(str);
            ab.a0.A0(j2Var, new d0(j2Var.o.a(2131886222, new Object[0])));
        } else {
            if (!(pVar instanceof ep.o)) {
                throw new NoWhenBranchMatchedException();
            }
            ep.o oVar = (ep.o) pVar;
            j2Var.n.b(oVar.a, oVar.b, oVar.d, AuthAnalyticsSource.INSIGHTS, oVar.c);
        }
    }

    public static final List m(j2 j2Var, ss.v vVar, List list, u00.k kVar) {
        if (vVar != null) {
            return (List) kVar.invoke(vVar);
        }
        return j2Var.l.a.isAuthorized() ? h00.x.A : list;
    }

    public final void n(w action) {
        kotlin.jvm.internal.m.e(action, "action");
        if (action instanceof q) {
            p(((q) action).a);
            return;
        }
        if (action instanceof InsightsAction$OnCloseScreen) {
            ab.a0.A0(this, InsightsEffect$CloseScreen.INSTANCE);
            return;
        }
        if (action instanceof t) {
            ((bq.a) this.j).f(true, zp.b.INSIGHTS);
            return;
        }
        boolean z = action instanceof v;
        k00.c cVar = null;
        pm.b bVar = this.c;
        if (z) {
            ys.f fVar = ((a1) bVar.d.getValue()).l;
            if (fVar != null) {
                ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new a1.d(this, fVar, (k00.c) null, 14), 31);
                return;
            }
            return;
        }
        if (action instanceof j) {
            i(a1.a((a1) bVar.d.getValue(), null, false, false, null, true, false, false, false, null, null, null, null, null, null, null, 0, null, false, false, false, false, false, false, 16777199));
            return;
        }
        if (action instanceof n) {
            if (((a1) bVar.d.getValue()).f) {
                return;
            }
            i(a1.a((a1) bVar.d.getValue(), null, false, false, null, false, false, false, false, null, null, null, null, null, null, null, 0, null, false, false, false, false, false, false, 16777199));
            return;
        }
        if (action instanceof h) {
            int i = ((h) action).a;
            if (((a1) bVar.d.getValue()).f) {
                return;
            }
            this.q.logEvent(new HomeEvent.GoalAdjusted(i));
            this.e.g(i);
            this.h.e();
            i(a1.a((a1) bVar.d.getValue(), null, false, false, null, false, true, false, false, null, null, null, null, null, null, null, i, null, false, false, false, false, false, false, 16711647));
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, new c1(0, this, cVar), new a1.p1(this, i, (k00.c) null, 1), 23);
            return;
        }
        if (action instanceof k) {
            ab.a0.A0(this, a0.a);
            return;
        }
        if (action instanceof u) {
            ab.a0.A0(this, c0.a);
            return;
        }
        if (action instanceof i) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new d1(0, this, cVar), 31);
            return;
        }
        if (action instanceof o) {
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new d1(1, this, cVar), 31);
            return;
        }
        if (action instanceof s) {
            q();
            return;
        }
        if (action instanceof r) {
            if (((a1) bVar.d.getValue()).v) {
                return;
            }
            i(a1.a((a1) bVar.d.getValue(), null, false, false, null, false, false, false, false, null, null, null, null, null, null, null, 0, null, false, false, false, true, false, false, 14680063));
            ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, new c1(1, this, cVar), new d1(5, this, cVar), 23);
            return;
        }
        boolean z2 = action instanceof c;
        AuthAnalytics authAnalytics = this.p;
        if (z2) {
            authAnalytics.authorizationTapped(AuthAnalyticsSource.INSIGHTS);
            i(a1.a((a1) bVar.d.getValue(), null, false, false, null, false, false, false, true, null, null, null, null, null, null, null, 0, null, false, false, false, false, false, false, 16776959));
            return;
        }
        if (action instanceof d) {
            this.l.a.setAuthBannerDismissed(true);
            i(a1.a((a1) bVar.d.getValue(), null, false, false, null, false, false, false, false, null, null, null, null, null, null, null, 0, null, false, false, false, false, false, false, 16777151));
            return;
        }
        if (action instanceof m) {
            authAnalytics.authorizationDismissed(AuthAnalyticsSource.INSIGHTS);
            o();
            return;
        }
        if (action instanceof e) {
            i(a1.a((a1) bVar.d.getValue(), null, false, false, null, false, false, false, true, null, null, null, null, null, null, null, 0, null, false, false, false, false, false, false, 16776447));
            return;
        }
        if (action instanceof g) {
            o();
            return;
        }
        if (!(action instanceof f)) {
            if (action instanceof p) {
                ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, new k1(2, this, null), (u00.k) null, new a1.e2(this, ((p) action).a, (k00.c) null, 6), 27);
                return;
            } else if (action instanceof b) {
                ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, new k1(1, this, null), (u00.k) null, new a1.e2(this, ((b) action).a, (k00.c) null, 5), 27);
                return;
            } else {
                if (!action.equals(l.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((a1) bVar.d.getValue()).h) {
                    ab.a0.A0(this, z.a);
                    return;
                }
                return;
            }
        }
        ep.e eVar = ((f) action).a;
        authAnalytics.authProviderSelected(eVar);
        int iOrdinal = eVar.ordinal();
        if (iOrdinal == 0) {
            o();
            ab.a0.A0(this, e0.a);
        } else if (iOrdinal == 1) {
            o();
            ab.a0.A0(this, f0.a);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i(a1.a((a1) bVar.d.getValue(), null, false, false, null, false, false, false, false, new AuthRootLauncher(eVar), null, null, null, null, null, null, 0, null, false, false, false, false, false, false, 16776447));
        }
    }

    public final void o() {
        i(a1.a((a1) this.c.d.getValue(), null, false, false, null, false, false, false, false, null, null, null, null, null, null, null, 0, null, false, false, false, false, false, false, 16776447));
        q();
    }

    public final void p(ys.c cVar) {
        if (((a1) this.c.d.getValue()).a != cVar) {
            this.q.logEvent(new HomeEvent.InsightsViewed(cVar.a()));
        }
        ta.c0.M(androidx.lifecycle.u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new a1.c0(this, cVar, (k00.c) null, 8), 31);
        int iB = cVar.b();
        if (iB != 7) {
            this.t.k(iB);
        }
    }

    public final void q() {
        wo.c0 c0Var = this.l;
        boolean zIsAuthorized = c0Var.a.isAuthorized();
        boolean z = false;
        if (zIsAuthorized) {
            c0Var.a.setAuthBannerDismissed(false);
        }
        a1 a1Var = (a1) this.c.d.getValue();
        if (!zIsAuthorized && !c0Var.a.isAuthBannerDismissed()) {
            z = true;
        }
        i(a1.a(a1Var, null, false, false, null, false, false, z, false, null, null, null, null, null, null, null, 0, null, false, false, false, false, false, false, 16777151));
    }
}
