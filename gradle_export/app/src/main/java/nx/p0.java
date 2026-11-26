package nx;

import androidx.lifecycle.u0;
import bt.f2;
import bt.y1;
import bv.h2;
import com.google.android.gms.internal.measurement.g4;
import com.mchutov.core.deeplink.presentation.analytics.DeepLinkAnalytics;
import com.mchutov.core.deeplink.presentation.analytics.DeepLinkEvent;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.mchutov.quranify.reciters.presentation.screen.detail.main.ReciterEffect$CloseScreen;
import com.mchutov.quranify.reciters.presentation.screen.detail.main.ReciterLauncher;
import com.revenuecat.purchases.common.Constants;
import d40.d1;
import d40.g1;
import d40.i1;
import d40.m1;
import d40.y0;
import is.w0;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

public final class p0 extends vm.a {
    public final ReciterLauncher d;
    public final xw.k e;
    public final uu.a f;
    public final tq.k g;
    public final aq.a h;
    public final zt.a i;
    public final tt.b j;
    public final qu.a k;
    public final vp.x l;
    public final tx.a m;
    public final oq.b n;
    public final DeepLinkAnalytics o;
    public final y1 p;
    public final d40.i q;
    public Integer r;
    public final d40.i s;

    public p0(ReciterLauncher launcher, xw.k kVar, uu.a aVar, tq.k kVar2, aq.a aVar2, au.a aVar3, zt.a aVar4, tt.b bVar, qu.a aVar5, vp.x xVar, tx.a aVar6, oq.b bVar2, DeepLinkAnalytics deepLinkAnalytics) {
        super(new i0(null, null, null, false, false, launcher.getSharedSurahNumber(), 32767));
        kotlin.jvm.internal.m.e(launcher, "launcher");
        this.d = launcher;
        this.e = kVar;
        this.f = aVar;
        this.g = kVar2;
        this.h = aVar2;
        this.i = aVar4;
        this.j = bVar;
        this.k = aVar5;
        this.l = xVar;
        this.m = aVar6;
        this.n = bVar2;
        this.o = deepLinkAnalytics;
        ut.j jVarK = ((ut.p) aVar4).k();
        h40.e eVar = a40.m0.a;
        d40.i iVarV = d40.o.v(jVarK, eVar);
        v6.a aVarI = u0.i(this);
        m1 m1VarA = g1.a(2);
        oe.o oVarM = d40.o.m(iVarV);
        d1 d1VarA = d40.o.a(1, oVarM.A, (c40.a) oVarM.C);
        k00.i iVar = (k00.i) oVarM.D;
        d40.i iVar2 = (d40.i) oVarM.B;
        eh.l lVar = d40.o.c;
        i1 i1Var = g1.a;
        a40.c0.x(aVarI, iVar, m1VarA.equals(i1Var) ? a40.a0.A : a40.a0.D, new a1.g(m1VarA, iVar2, d1VarA, lVar, (k00.c) null));
        y0 y0Var = new y0(d1VarA);
        d40.i iVarV2 = d40.o.v(kVar.f(), eVar);
        v6.a aVarI2 = u0.i(this);
        m1 m1VarA2 = g1.a(2);
        oe.o oVarM2 = d40.o.m(iVarV2);
        d1 d1VarA2 = d40.o.a(1, oVarM2.A, (c40.a) oVarM2.C);
        a40.c0.x(aVarI2, (k00.i) oVarM2.D, m1VarA2.equals(i1Var) ? a40.a0.A : a40.a0.D, new a1.g(m1VarA2, (d40.i) oVarM2.B, d1VarA2, lVar, (k00.c) null));
        y0 y0Var2 = new y0(d1VarA2);
        this.p = new y1(y0Var, this, 15);
        k00.c cVar = null;
        this.q = d40.o.o(new d40.u0(y0Var, y0Var2, new f2(this, cVar, 4)));
        this.r = launcher.getSharedSurahNumber();
        int i = 1;
        this.s = d40.o.o(d40.o.l(new w0(kVar2.c(), launcher.getReciterType(), i), kVar2.c, aVar3.c, new cs.n(this, cVar, i)));
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new j0(this, cVar, 2), 31);
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new j0(this, cVar, 3), 31);
    }

    public static u30.b k(u30.b bVar, String str) {
        String string = r30.k.j1(str).toString();
        if (r30.k.L0(string)) {
            return bVar;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : bVar) {
            PlayerItem playerItem = (PlayerItem) obj;
            if (r30.k.A0(playerItem.getSurahTranscription(), string, true) || r30.k.A0(playerItem.getSurahTranslation(), string, true) || r30.k.A0(playerItem.getSurahOriginalName(), string, true) || r30.k.A0(String.valueOf(playerItem.getSurahNumber()), string, false)) {
                arrayList.add(obj);
            }
        }
        return g4.d0(arrayList);
    }

    public final void j(x action) {
        oq.a aVarD;
        kotlin.jvm.internal.m.e(action, "action");
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        if (action instanceof n) {
            ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new j0(this, objArr9 == true ? 1 : 0, 4), 31);
            return;
        }
        if (action instanceof v) {
            ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new j0(this, objArr8 == true ? 1 : 0, 5), 31);
            return;
        }
        if (action instanceof j) {
            if (this.l.k()) {
                ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new j0(this, objArr7 == true ? 1 : 0, 1), 31);
                return;
            } else {
                ((bq.a) this.h).f(true, zp.b.DOWNLOADS);
                return;
            }
        }
        boolean z = action instanceof b;
        pm.b bVar = this.c;
        if (z) {
            i(i0.a((i0) bVar.d.getValue(), null, null, null, null, null, null, false, null, false, false, false, null, true, false, 57343));
            return;
        }
        if (action instanceof l) {
            ((ut.p) this.i).a();
            return;
        }
        if (action instanceof f) {
            i(i0.a((i0) bVar.d.getValue(), null, null, null, null, null, null, false, null, false, false, false, null, false, false, 64511));
            return;
        }
        if (action instanceof g) {
            i(i0.a((i0) bVar.d.getValue(), null, null, null, null, null, null, false, null, false, false, false, null, false, false, 57343));
            return;
        }
        if (action instanceof h) {
            i(i0.a((i0) bVar.d.getValue(), null, null, null, null, null, null, false, null, false, false, false, null, false, false, 59391));
            return;
        }
        if (action instanceof d) {
            ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new j0(this, objArr6 == true ? 1 : 0, 0), 31);
            return;
        }
        boolean z2 = action instanceof s;
        DeepLinkAnalytics deepLinkAnalytics = this.o;
        oq.b bVar2 = this.n;
        if (z2) {
            bx.c cVar = ((i0) bVar.d.getValue()).b;
            if (cVar == null) {
                return;
            }
            bVar2.getClass();
            String str = cVar.b;
            oq.a aVarB = bVar2.b(str, bVar2.b.a(2131887267, str), bVar2.a.b("reciters", mq.b.c(cVar)), cVar.e);
            deepLinkAnalytics.logEvent(new DeepLinkEvent.ContentShared("reciter", String.valueOf(cVar.a), "reciter_screen"));
            ab.a0.A0(this, new y(aVarB));
            return;
        }
        if (action instanceof t) {
            PlayerItem playerItem = ((t) action).a;
            bx.c cVar2 = ((i0) bVar.d.getValue()).b;
            if (cVar2 == null || (aVarD = bVar2.d(cVar2, playerItem.getSurahNumber(), playerItem.getSurahTranscription())) == null) {
                return;
            }
            deepLinkAnalytics.logEvent(new DeepLinkEvent.ContentShared("reciter_surah", cVar2.a + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + playerItem.getSurahNumber(), "reciter_screen"));
            ab.a0.A0(this, new y(aVarD));
            return;
        }
        if (action instanceof m) {
            bx.c cVar3 = ((i0) bVar.d.getValue()).b;
            String str2 = cVar3 != null ? cVar3.g : null;
            if (str2 == null || str2.length() == 0) {
                return;
            }
            i(i0.a((i0) bVar.d.getValue(), null, null, null, null, null, null, false, null, false, false, false, null, false, true, 49151));
            return;
        }
        if (action instanceof i) {
            i(i0.a((i0) bVar.d.getValue(), null, null, null, null, null, null, false, null, false, false, false, null, false, false, 49151));
            return;
        }
        if (action instanceof k) {
            ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new h2(this, ((i0) bVar.d.getValue()).h, objArr5 == true ? 1 : 0, 4), 31);
            return;
        }
        if (action instanceof c) {
            ab.a0.A0(this, ReciterEffect$CloseScreen.INSTANCE);
            return;
        }
        if (action instanceof p) {
            ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new k0(this, ((p) action).a, objArr4 == true ? 1 : 0, 2), 31);
            return;
        }
        if (action instanceof q) {
            ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new k0(this, ((q) action).a, objArr3 == true ? 1 : 0, 1), 31);
            return;
        }
        if (action instanceof o) {
            ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new g6.a(this, ((o) action).a, (k00.c) null, 22), 31);
            return;
        }
        if (action instanceof w) {
            ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new k0(this, ((w) action).a, objArr2 == true ? 1 : 0, 3), 31);
            return;
        }
        if (action instanceof e) {
            ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new k0(this, ((e) action).a, objArr == true ? 1 : 0, 0), 31);
            return;
        }
        if (action instanceof r) {
            String str3 = ((r) action).a;
            i(i0.a((i0) bVar.d.getValue(), null, null, k(((i0) bVar.d.getValue()).c, str3), str3, null, null, false, null, false, false, false, null, false, false, 65511));
        } else {
            if (!(action instanceof u)) {
                throw new NoWhenBranchMatchedException();
            }
            i(i0.a((i0) bVar.d.getValue(), null, null, null, null, null, null, false, null, false, false, false, null, false, false, 32767));
        }
    }
}
