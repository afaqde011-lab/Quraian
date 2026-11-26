package lu;

import androidx.lifecycle.a1;
import androidx.lifecycle.u0;
import com.google.android.gms.internal.measurement.g4;
import com.mchutov.quranify.onboarding.presentation.analytics.OnboardingAnalytics;
import d40.p1;
import is.m1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import ri.t1;

public final class e0 extends vm.a {
    public final gu.a d;
    public final tq.k e;
    public final xw.k f;
    public final xw.e g;
    public final uu.a h;
    public final m1 i;
    public final ty.a j;
    public final OnboardingAnalytics k;
    public final aq.a l;
    public final vp.x m;
    public final is.y n;
    public final ku.a o;
    public final pw.a p;
    public final rw.a q;
    public boolean r;
    public final ArrayList s;
    public final ArrayList t;

    public e0(gu.a aVar, tq.k kVar, xw.k kVar2, xw.e eVar, a00.a aVar2, uu.a aVar3, m1 m1Var, ty.a aVar4, OnboardingAnalytics onboardingAnalytics, aq.a aVar5, vp.x xVar, pm.c cVar, is.y yVar, ku.a aVar6, pw.a aVar7, rw.a aVar8) {
        u30.b pages = g4.d0(h00.n.V0(new ju.f[]{new ju.f("start", 2131886927), new ju.f("reciters", 2131886999), new ju.f("ambient_sounds", 2131886996), new ju.f("tafsir", 2131887001), new ju.f("tailored_playlists", 2131887002), new ju.f("social_proof", 2131887000), new ju.f("daily_minimum", 2131886997), new ju.f("notifications", 2131886998)}));
        kotlin.jvm.internal.m.e(pages, "pages");
        u30.b bVarD0 = g4.d0(h00.n.V0(new ju.h[]{new ju.h(1, cVar.a(2131886982, new Object[0]), "", false), new ju.h(2, cVar.a(2131886983, new Object[0]), "", false), new ju.h(3, cVar.a(2131886984, new Object[0]), "", false)}));
        int iP = h00.d0.P(h00.r.q0(pages, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP < 16 ? 16 : iP);
        for (Iterator it = pages.iterator(); it.hasNext(); it = it) {
            linkedHashMap.put(((ju.f) it.next()).a, new z(bVarD0, bVarD0, ze.d.E(h00.x.A), g4.d0(h00.n.V0(new ju.g[]{new ju.g("focus", cVar.a(2131886980, new Object[0])), new ju.g("sleep", cVar.a(2131886981, new Object[0]))})), new ju.i(cVar.a(2131886979, new Object[0]), cVar.a(2131886946, new Object[0]), ju.m.a), 3239));
        }
        super(new a0(pages, g4.e0(linkedHashMap), 0, false, h00.z.A, false));
        this.d = aVar;
        this.e = kVar;
        this.f = kVar2;
        this.g = eVar;
        this.h = aVar3;
        this.i = m1Var;
        this.j = aVar4;
        this.k = onboardingAnalytics;
        this.l = aVar5;
        this.m = xVar;
        this.n = yVar;
        this.o = aVar6;
        this.p = aVar7;
        this.q = aVar8;
        this.s = new ArrayList();
        this.t = new ArrayList();
        onboardingAnalytics.onboardingStarted();
        onboardingAnalytics.onboardingNewStarted();
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new b0(this, null, 1), 31);
        z zVar = (z) ((a0) this.c.d.getValue()).b.get("ambient_sounds");
        if (zVar != null) {
            m("ambient_sounds", z.a(zVar, false, false, false, null, null, null, g4.d0(((uz.f) aVar2).e()), null, 0, null, 4031));
        }
    }

    public static final Object j(e0 e0Var, m00.c cVar) {
        d0 d0Var;
        int i;
        Iterator it;
        if (cVar instanceof d0) {
            d0Var = (d0) cVar;
            int i2 = d0Var.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d0Var.E = i2 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(e0Var, cVar);
            }
        } else {
            d0Var = new d0(e0Var, cVar);
        }
        Object obj = d0Var.C;
        l00.a aVar = l00.a.A;
        int i3 = d0Var.E;
        if (i3 == 0) {
            t1.O(obj);
            z zVar = (z) ((a0) e0Var.c.d.getValue()).b.get("reciters");
            if (zVar != null) {
                u30.b bVar = zVar.d;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : bVar) {
                    if (((ju.h) obj2).d) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Integer(((ju.h) it2.next()).a));
                }
                i = 0;
                it = h00.q.C0(arrayList2).iterator();
            }
            return g00.b0.a;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = d0Var.B;
        it = d0Var.A;
        t1.O(obj);
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            tq.k kVar = e0Var.e;
            d0Var.A = it;
            d0Var.B = i;
            d0Var.E = 1;
            if (kVar.a(iIntValue, d0Var) == aVar) {
                return aVar;
            }
        }
        return g00.b0.a;
    }

    public final void g() {
        ku.a aVar = this.o;
        aVar.a.release();
        aVar.b.release();
    }

    public final void k(p action) {
        String str;
        u30.b bVarD0;
        kotlin.jvm.internal.m.e(action, "action");
        k00.c cVar = null;
        if (action instanceof g) {
            ta.c0.M(u0.i((a1) this), (k00.i) null, (u00.n) null, (u00.k) null, new w(this, cVar, 3), 31);
            return;
        }
        boolean z = action instanceof f;
        pm.b bVar = this.c;
        if (z) {
            ?? r1 = this.r;
            int i = ((a0) bVar.d.getValue()).c - 1;
            ?? r2 = r1;
            if (i >= r1) {
                r2 = i;
            }
            l(r2);
            return;
        }
        if (action instanceof k) {
            l(((k) action).a);
            return;
        }
        if (action instanceof m) {
            if (((m) action).a.equals("reciters")) {
                ((uu.w) this.h).h();
                return;
            }
            return;
        }
        if (action instanceof l) {
            int i2 = ((l) action).a;
            Integer numValueOf = Integer.valueOf(i2);
            ArrayList arrayList = this.s;
            if (!arrayList.remove(numValueOf)) {
                arrayList.add(0, Integer.valueOf(i2));
            }
            z zVar = (z) ((a0) bVar.d.getValue()).b.get("reciters");
            if (zVar == null) {
                return;
            }
            u30.b<ju.h> bVar2 = zVar.d;
            ArrayList arrayList2 = new ArrayList(h00.r.q0(bVar2, 10));
            for (ju.h hVar : bVar2) {
                int i3 = hVar.a;
                if (i3 == i2) {
                    boolean z2 = !hVar.d;
                    String name = hVar.b;
                    String photoUrl = hVar.c;
                    kotlin.jvm.internal.m.e(name, "name");
                    kotlin.jvm.internal.m.e(photoUrl, "photoUrl");
                    hVar = new ju.h(i3, name, photoUrl, z2);
                }
                arrayList2.add(hVar);
            }
            u30.b bVarD1 = g4.d0(arrayList2);
            String string = r30.k.j1(zVar.l).toString();
            if (r30.k.L0(string)) {
                bVarD0 = bVarD1;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : bVarD1) {
                    String str2 = ((ju.h) obj).b;
                    Locale locale = Locale.getDefault();
                    kotlin.jvm.internal.m.d(locale, "getDefault(...)");
                    String lowerCase = str2.toLowerCase(locale);
                    kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                    Locale locale2 = Locale.getDefault();
                    kotlin.jvm.internal.m.d(locale2, "getDefault(...)");
                    String lowerCase2 = string.toLowerCase(locale2);
                    kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
                    if (r30.k.A0(lowerCase, lowerCase2, false)) {
                        arrayList3.add(obj);
                    }
                }
                bVarD0 = g4.d0(arrayList3);
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : bVarD1) {
                if (((ju.h) obj2).d) {
                    arrayList4.add(obj2);
                }
            }
            m("reciters", z.a(zVar, false, false, false, bVarD1, bVarD0, g4.d0(arrayList4), null, null, 0, null, 4039));
            return;
        }
        if (action instanceof h) {
            int i4 = ((h) action).a;
            z zVar2 = (z) ((a0) bVar.d.getValue()).b.get("daily_minimum");
            if (zVar2 == null) {
                return;
            }
            m("daily_minimum", z.a(zVar2, false, false, false, null, null, null, null, null, ab.a0.y(i4, 0, 10800), null, 3071));
            return;
        }
        if (action instanceof i) {
            i(a0.a((a0) bVar.d.getValue(), null, 0, false, null, ((i) action).a, 31));
            return;
        }
        if (action instanceof c) {
            zz.a aVar = ((c) action).a;
            String str3 = aVar.a;
            z zVar3 = (z) ((a0) bVar.d.getValue()).b.get("ambient_sounds");
            zz.a aVar2 = zVar3 != null ? zVar3.h : null;
            if (kotlin.jvm.internal.m.a(aVar2 != null ? aVar2.a : null, str3)) {
                aVar = null;
            }
            if (aVar != null) {
                this.t.add(str3);
            }
            ta.c0.M(u0.i((a1) this), (k00.i) null, (u00.n) null, (u00.k) null, new w(aVar, (Object) this, cVar, 2), 31);
            return;
        }
        if (action instanceof d) {
            p1 p1Var = bVar.d;
            ju.f fVar = (ju.f) h00.q.O0(((a0) p1Var.getValue()).c, ((a0) p1Var.getValue()).a);
            String str4 = fVar != null ? fVar.a : null;
            str = str4 != null ? str4 : "";
            z zVar4 = (z) ((a0) p1Var.getValue()).b.get("ambient_sounds");
            if (zVar4 == null || !str.equals("ambient_sounds") || zVar4.h == null) {
                return;
            }
            ta.c0.M(u0.i((a1) this), (k00.i) null, (u00.n) null, (u00.k) null, new c0(this, cVar, 0), 31);
            return;
        }
        if (action instanceof e) {
            p1 p1Var2 = bVar.d;
            ju.f fVar2 = (ju.f) h00.q.O0(((a0) p1Var2.getValue()).c, ((a0) p1Var2.getValue()).a);
            String str5 = fVar2 != null ? fVar2.a : null;
            str = str5 != null ? str5 : "";
            z zVar5 = (z) ((a0) p1Var2.getValue()).b.get("ambient_sounds");
            if (zVar5 == null || !str.equals("ambient_sounds") || zVar5.h == null) {
                return;
            }
            ta.c0.M(u0.i((a1) this), (k00.i) null, (u00.n) null, (u00.k) null, new c0(this, cVar, 1), 31);
            return;
        }
        if (!(action instanceof j)) {
            if (action instanceof o) {
                ta.c0.M(u0.i((a1) this), (k00.i) null, (u00.n) null, (u00.k) null, new w((e0) this, (Object) ((o) action).a, cVar, 4), 31);
                return;
            } else {
                if (!action.equals(n.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ta.c0.M(u0.i((a1) this), (k00.i) null, (u00.n) null, (u00.k) null, new w(this, cVar, 3), 31);
                return;
            }
        }
        boolean z3 = ((j) action).a;
        oi.k.v(this.p.a, "notification_permission_asked", true);
        OnboardingAnalytics onboardingAnalytics = this.k;
        onboardingAnalytics.onboardingNotificationPermission(z3);
        onboardingAnalytics.onboardingNewNotificationPermission(z3);
        onboardingAnalytics.onboardingNewCompleted();
        if (z3) {
            this.j.b(9, 0, false);
        }
        this.q.a();
        ta.c0.M(u0.i((a1) this), (k00.i) null, (u00.n) null, (u00.k) null, new b0(this, cVar, 0), 31);
    }

    public final void l(int i) {
        g00.k kVar;
        pm.b bVar = this.c;
        u30.b bVar2 = ((a0) bVar.d.getValue()).a;
        p1 p1Var = bVar.d;
        ju.f fVar = (ju.f) h00.q.O0(((a0) p1Var.getValue()).c, bVar2);
        g00.k kVar2 = 0;
        kVar2 = 0;
        kVar2 = 0;
        kVar2 = 0;
        kVar2 = 0;
        kVar2 = 0;
        kVar2 = 0;
        kVar2 = 0;
        String str = fVar != null ? fVar.a : null;
        if (str == null) {
            str = "";
        }
        int iY = ab.a0.y(i, 0, va.a.M(((a0) p1Var.getValue()).a));
        if (iY > 0) {
            this.r = true;
        }
        int i2 = (this.r && iY == 0) ? 1 : iY;
        ju.f fVar2 = (ju.f) h00.q.O0(i2, ((a0) p1Var.getValue()).a);
        String str2 = fVar2 != null ? fVar2.a : null;
        String str3 = str2 != null ? str2 : "";
        if (str.equals("ambient_sounds") && !str3.equals("ambient_sounds")) {
            ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new c0(this, kVar2, 2), 31);
        }
        i(a0.a((a0) p1Var.getValue(), null, i2, i2 == va.a.M(((a0) p1Var.getValue()).a), null, false, 51));
        OnboardingAnalytics onboardingAnalytics = this.k;
        onboardingAnalytics.onboardingStepViewed(i2, str3);
        if (str.equals(str3)) {
            return;
        }
        switch (str3.hashCode()) {
            case -1613332748:
                if (str3.equals("tailored_playlists")) {
                    kVar = new g00.k(4, "tailored_playlists");
                    kVar2 = kVar;
                }
                break;
            case -1570882062:
                if (str3.equals("social_proof")) {
                    kVar2 = new g00.k(5, "rate_us");
                }
                break;
            case -1156855605:
                if (str3.equals("ambient_sounds")) {
                    kVar2 = new g00.k(2, "ambient_sound");
                }
                break;
            case -881251677:
                if (str3.equals("tafsir")) {
                    kVar2 = new g00.k(3, "lyrics");
                }
                break;
            case -804714037:
                if (str3.equals("reciters")) {
                    kVar2 = new g00.k(1, "reciter_selection");
                }
                break;
            case 379775976:
                if (str3.equals("daily_minimum")) {
                    kVar = new g00.k(6, "daily_minimum");
                    kVar2 = kVar;
                }
                break;
            case 1272354024:
                if (str3.equals("notifications")) {
                    kVar = new g00.k(7, "notifications");
                    kVar2 = kVar;
                }
                break;
        }
        if (kVar2 != 0) {
            onboardingAnalytics.onboardingNewStepViewed(((Number) kVar2.A).intValue(), (String) kVar2.B);
        }
        if (str3.equals("ambient_sounds")) {
            this.t.clear();
        }
    }

    public final void m(String str, z zVar) {
        pm.b bVar = this.c;
        a0 a0Var = (a0) bVar.d.getValue();
        LinkedHashMap linkedHashMapB0 = h00.d0.b0(((a0) bVar.d.getValue()).b);
        linkedHashMapB0.put(str, zVar);
        i(a0.a(a0Var, g4.e0(linkedHashMapB0), 0, false, null, false, 61));
    }
}
