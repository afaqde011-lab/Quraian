package g1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.datastore.core.DataStore;
import com.google.android.gms.cast.MediaError;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.core.deeplink.presentation.analytics.DeepLinkAnalytics;
import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryAnalytics;
import com.mchutov.quranify.audiostories.presentation.player.AudioStoryPlayerLauncher;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import com.mchutov.quranify.home.presentation.analytics.HomeAnalytics;
import com.mchutov.quranify.home.presentation.screen.playlist.PlaylistLauncher;
import com.mchutov.quranify.onboarding.presentation.analytics.OnboardingAnalytics;

public final class c8 implements u00.n {
    public final int A;

    public c8(int i10) {
        this.A = i10;
    }

    public c8(int i10, int i11) {
        this.A = i11;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        switch (i10) {
            case 0:
                d8 d8Var = (d8) obj2;
                return va.a.S(Integer.valueOf(d8Var.f5758c.h()), Integer.valueOf(d8Var.f5759d.h()), Boolean.valueOf(d8Var.f5756a));
            case 1:
                ((Integer) obj2).getClass();
                l1.g0 g0Var = (l1.g0) ((l1.j) obj);
                g0Var.c0(1148505177);
                h0.p1 p1Var = s.f5954a;
                long j9 = dl.a.N;
                long jB = i2.t.b(0.6f, j9);
                long j10 = dl.a.i;
                r rVarA = s.a(j9, j10, jB, i2.t.b(0.8f, j10), g0Var, 0);
                g0Var.r(false);
                return rVarA;
            case 2:
                ((Integer) obj2).getClass();
                l1.g0 g0Var2 = (l1.g0) ((l1.j) obj);
                g0Var2.c0(-362488281);
                h0.p1 p1Var2 = s.f5954a;
                long j11 = dl.a.i;
                long jB2 = i2.t.b(0.6f, j11);
                long j12 = dl.a.L;
                r rVarA2 = s.a(j11, j12, jB2, i2.t.b(0.8f, j12), g0Var2, 0);
                g0Var2.r(false);
                return rVarA2;
            case 3:
                ((Integer) obj2).getClass();
                kh.o.f((l1.j) obj, l1.q.K(1));
                return b0Var;
            case 4:
                ((Integer) obj2).getClass();
                p30.f.T((l1.j) obj, l1.q.K(1));
                return b0Var;
            case 5:
                ((Integer) obj2).getClass();
                qd.s0.K((l1.j) obj, l1.q.K(1));
                return b0Var;
            case 6:
                e60.a aVar = (e60.a) obj;
                kotlin.jvm.internal.m.e(aVar, "$this$factory");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                return new gu.a((SharedPreferences) aVar.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), (a60.a) null, new b60.b("default_shared_preferences")));
            case 7:
                e60.a aVar2 = (e60.a) obj;
                kotlin.jvm.internal.m.e(aVar2, "$this$factory");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                return new OnboardingAnalytics((tk.c) aVar2.f(kotlin.jvm.internal.a0.a.b(tk.c.class), (a60.a) null, (b60.a) null));
            case 8:
                e60.a aVar3 = (e60.a) obj;
                kotlin.jvm.internal.m.e(aVar3, "$this$factory");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                return new ku.a((Context) aVar3.f(kotlin.jvm.internal.a0.a.b(Context.class), (a60.a) null, (b60.a) null));
            case 9:
                e60.a aVar4 = (e60.a) obj;
                kotlin.jvm.internal.m.e(aVar4, "$this$viewModel");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                kotlin.jvm.internal.b0 b0Var2 = kotlin.jvm.internal.a0.a;
                gu.a aVar5 = (gu.a) aVar4.f(b0Var2.b(gu.a.class), (a60.a) null, (b60.a) null);
                is.m1 m1Var = (is.m1) aVar4.f(b0Var2.b(is.m1.class), (a60.a) null, (b60.a) null);
                ty.a aVar6 = (ty.a) aVar4.f(b0Var2.b(ty.a.class), (a60.a) null, (b60.a) null);
                OnboardingAnalytics onboardingAnalytics = (OnboardingAnalytics) aVar4.f(b0Var2.b(OnboardingAnalytics.class), (a60.a) null, (b60.a) null);
                return new lu.e0(aVar5, (tq.k) aVar4.f(b0Var2.b(tq.k.class), (a60.a) null, (b60.a) null), (xw.k) aVar4.f(b0Var2.b(xw.k.class), (a60.a) null, (b60.a) null), (xw.e) aVar4.f(b0Var2.b(xw.e.class), (a60.a) null, (b60.a) null), (a00.a) aVar4.f(b0Var2.b(a00.a.class), (a60.a) null, (b60.a) null), (uu.a) aVar4.f(b0Var2.b(uu.a.class), (a60.a) null, (b60.a) null), m1Var, aVar6, onboardingAnalytics, (aq.a) aVar4.f(b0Var2.b(aq.a.class), (a60.a) null, (b60.a) null), (vp.x) aVar4.f(b0Var2.b(vp.x.class), (a60.a) null, (b60.a) null), (pm.c) aVar4.f(b0Var2.b(pm.c.class), (a60.a) null, (b60.a) null), (is.y) aVar4.f(b0Var2.b(is.y.class), (a60.a) null, (b60.a) null), (ku.a) aVar4.f(b0Var2.b(ku.a.class), (a60.a) null, (b60.a) null), (pw.a) aVar4.f(b0Var2.b(pw.a.class), (a60.a) null, (b60.a) null), (rw.a) aVar4.f(b0Var2.b(rw.a.class), (a60.a) null, (b60.a) null));
            case 10:
                return x.c.w(MediaError.DetailedErrorCode.NETWORK_UNKNOWN, 0, x.w.f16378b, 2);
            case 11:
                ((Integer) obj2).getClass();
                kh.o.e((l1.j) obj, l1.q.K(1));
                return b0Var;
            case 12:
                ((Integer) obj2).getClass();
                p30.f.R((l1.j) obj, l1.q.K(1));
                return b0Var;
            case 13:
                e60.a aVar7 = (e60.a) obj;
                kotlin.jvm.internal.m.e(aVar7, "$this$factory");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                return new or.b((er.d) aVar7.f(kotlin.jvm.internal.a0.a.b(er.d.class), (a60.a) null, (b60.a) null));
            case 14:
                e60.a aVar8 = (e60.a) obj;
                kotlin.jvm.internal.m.e(aVar8, "$this$factory");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                return new vr.c((jo.d) aVar8.f(b0Var3.b(jo.d.class), (a60.a) null, (b60.a) null), (jo.o) aVar8.f(b0Var3.b(jo.o.class), (a60.a) null, (b60.a) null), (go.a) aVar8.f(b0Var3.b(go.a.class), (a60.a) null, (b60.a) null), (AudioStoryPlayerLauncher) aVar8.f(b0Var3.b(AudioStoryPlayerLauncher.class), (a60.a) null, (b60.a) null), (vn.u) aVar8.f(b0Var3.b(vn.u.class), (a60.a) null, (b60.a) null), (vp.x) aVar8.f(b0Var3.b(vp.x.class), (a60.a) null, (b60.a) null), (io.a) aVar8.f(b0Var3.b(io.a.class), (a60.a) null, (b60.a) null), (jo.i) aVar8.f(b0Var3.b(jo.i.class), (a60.a) null, (b60.a) null), (ko.e) aVar8.f(b0Var3.b(ko.e.class), (a60.a) null, (b60.a) null), (AudioStoryAnalytics) aVar8.f(b0Var3.b(AudioStoryAnalytics.class), (a60.a) null, (b60.a) null), (oq.b) aVar8.f(b0Var3.b(oq.b.class), (a60.a) null, (b60.a) null), (DeepLinkAnalytics) aVar8.f(b0Var3.b(DeepLinkAnalytics.class), (a60.a) null, (b60.a) null));
            case 15:
                e60.a aVar9 = (e60.a) obj;
                kotlin.jvm.internal.m.e(aVar9, "$this$factory");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                return new pr.b((pm.c) aVar9.f(b0Var4.b(pm.c.class), (a60.a) null, (b60.a) null), (ko.b) aVar9.f(b0Var4.b(ko.b.class), (a60.a) null, (b60.a) null));
            case 16:
                e60.a aVar10 = (e60.a) obj;
                kotlin.jvm.internal.m.e(aVar10, "$this$single");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                return new br.i((DataStore) aVar10.f(kotlin.jvm.internal.a0.a.b(DataStore.class), (a60.a) null, new b60.b("LISTENING_TIMER_STORE_SCOPE_KEY")));
            case 17:
                e60.a aVar11 = (e60.a) obj;
                kotlin.jvm.internal.m.e(aVar11, "$this$viewModel");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                return new ur.r1((uu.a) aVar11.f(b0Var5.b(uu.a.class), (a60.a) null, (b60.a) null), (xw.k) aVar11.f(b0Var5.b(xw.k.class), (a60.a) null, (b60.a) null), (xw.e) aVar11.f(b0Var5.b(xw.e.class), (a60.a) null, (b60.a) null), (tq.k) aVar11.f(b0Var5.b(tq.k.class), (a60.a) null, (b60.a) null), (zt.a) aVar11.f(b0Var5.b(zt.a.class), (a60.a) null, (b60.a) null), (HomeAnalytics) aVar11.f(b0Var5.b(HomeAnalytics.class), (a60.a) null, (b60.a) null), (pm.c) aVar11.f(b0Var5.b(pm.c.class), (a60.a) null, (b60.a) null), (au.a) aVar11.f(b0Var5.b(au.a.class), (a60.a) null, (b60.a) null), (qu.a) aVar11.f(b0Var5.b(qu.a.class), (a60.a) null, (b60.a) null), (aq.a) aVar11.f(b0Var5.b(aq.a.class), (a60.a) null, (b60.a) null), (is.m1) aVar11.f(b0Var5.b(is.m1.class), (a60.a) null, (b60.a) null), (pr.c) aVar11.f(b0Var5.b(pr.c.class), (a60.a) null, (b60.a) null), (pr.a) aVar11.f(b0Var5.b(pr.a.class), (a60.a) null, (b60.a) null), (is.y) aVar11.f(b0Var5.b(is.y.class), (a60.a) null, (b60.a) null), (jr.b) aVar11.f(b0Var5.b(jr.b.class), (a60.a) null, (b60.a) null), (vp.x) aVar11.f(b0Var5.b(vp.x.class), (a60.a) null, (b60.a) null), (xv.c) aVar11.f(b0Var5.b(xv.c.class), (a60.a) null, (b60.a) null), (er.a) aVar11.f(b0Var5.b(er.a.class), (a60.a) null, (b60.a) null), (wo.b0) aVar11.f(b0Var5.b(wo.b0.class), (a60.a) null, (b60.a) null), (wo.c0) aVar11.f(b0Var5.b(wo.c0.class), (a60.a) null, (b60.a) null), (bp.g) aVar11.f(b0Var5.b(bp.g.class), (a60.a) null, (b60.a) null), (hp.b) aVar11.f(b0Var5.b(hp.b.class), (a60.a) null, (b60.a) null), (AuthAnalytics) aVar11.f(b0Var5.b(AuthAnalytics.class), (a60.a) null, (b60.a) null), (vs.c) aVar11.f(b0Var5.b(vs.c.class), (a60.a) null, (b60.a) null), (xs.c) aVar11.f(b0Var5.b(xs.c.class), (a60.a) null, (b60.a) null), (os.x) aVar11.f(b0Var5.b(os.x.class), (a60.a) null, (b60.a) null), (xw.d) aVar11.f(b0Var5.b(xw.d.class), (a60.a) null, (b60.a) null), (or.a) aVar11.f(b0Var5.b(or.a.class), (a60.a) null, (b60.a) null), (or.b) aVar11.f(b0Var5.b(or.b.class), (a60.a) null, (b60.a) null), (pr.b) aVar11.f(b0Var5.b(pr.b.class), (a60.a) null, (b60.a) null), (vr.c) aVar11.f(b0Var5.b(vr.c.class), (a60.a) null, (b60.a) null));
            case TYPE_SINT64_VALUE:
                e60.a aVar12 = (e60.a) obj;
                kotlin.jvm.internal.m.e(aVar12, "$this$viewModel");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                return new ds.n((jr.b) aVar12.f(b0Var6.b(jr.b.class), (a60.a) null, (b60.a) null), (is.m1) aVar12.f(b0Var6.b(is.m1.class), (a60.a) null, (b60.a) null), (is.y) aVar12.f(b0Var6.b(is.y.class), (a60.a) null, (b60.a) null), (HomeAnalytics) aVar12.f(b0Var6.b(HomeAnalytics.class), (a60.a) null, (b60.a) null), (os.x) aVar12.f(b0Var6.b(os.x.class), (a60.a) null, (b60.a) null));
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                e60.a aVar13 = (e60.a) obj;
                kotlin.jvm.internal.m.e(aVar13, "$this$viewModel");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                return new cs.p((is.m1) aVar13.f(b0Var7.b(is.m1.class), (a60.a) null, (b60.a) null), (HomeAnalytics) aVar13.f(b0Var7.b(HomeAnalytics.class), (a60.a) null, (b60.a) null), (wo.c0) aVar13.f(b0Var7.b(wo.c0.class), (a60.a) null, (b60.a) null), (vs.c) aVar13.f(b0Var7.b(vs.c.class), (a60.a) null, (b60.a) null), (os.x) aVar13.f(b0Var7.b(os.x.class), (a60.a) null, (b60.a) null));
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                e60.a aVar14 = (e60.a) obj;
                a60.a aVar15 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(aVar14, "$this$viewModel");
                kotlin.jvm.internal.m.e(aVar15, "<destruct>");
                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                return new as.b1((PlaylistLauncher) aVar15.a(0, b0Var8.b(PlaylistLauncher.class)), (xv.c) aVar14.f(b0Var8.b(xv.c.class), (a60.a) null, (b60.a) null), (xw.k) aVar14.f(b0Var8.b(xw.k.class), (a60.a) null, (b60.a) null), (uu.a) aVar14.f(b0Var8.b(uu.a.class), (a60.a) null, (b60.a) null), (tq.k) aVar14.f(b0Var8.b(tq.k.class), (a60.a) null, (b60.a) null), (aq.a) aVar14.f(b0Var8.b(aq.a.class), (a60.a) null, (b60.a) null), (au.a) aVar14.f(b0Var8.b(au.a.class), (a60.a) null, (b60.a) null), (zt.a) aVar14.f(b0Var8.b(zt.a.class), (a60.a) null, (b60.a) null), (tt.b) aVar14.f(b0Var8.b(tt.b.class), (a60.a) null, (b60.a) null), (vp.x) aVar14.f(b0Var8.b(vp.x.class), (a60.a) null, (b60.a) null), (qu.a) aVar14.f(b0Var8.b(qu.a.class), (a60.a) null, (b60.a) null), (cw.a) aVar14.f(b0Var8.b(cw.a.class), (a60.a) null, (b60.a) null), (pm.c) aVar14.f(b0Var8.b(pm.c.class), (a60.a) null, (b60.a) null), (oq.b) aVar14.f(b0Var8.b(oq.b.class), (a60.a) null, (b60.a) null), (DeepLinkAnalytics) aVar14.f(b0Var8.b(DeepLinkAnalytics.class), (a60.a) null, (b60.a) null));
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                e60.a aVar16 = (e60.a) obj;
                kotlin.jvm.internal.m.e(aVar16, "$this$single");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                Object objB = ((l60.q0) aVar16.f(kotlin.jvm.internal.a0.a.b(l60.q0.class), (a60.a) null, (b60.a) null)).b(gr.b.class);
                kotlin.jvm.internal.m.d(objB, "create(...)");
                return (gr.b) objB;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                e60.a aVar17 = (e60.a) obj;
                kotlin.jvm.internal.m.e(aVar17, "$this$single");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                b60.b bVar = new b60.b("s_shared_preferences");
                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                return new er.j((SharedPreferences) aVar17.f(b0Var9.b(SharedPreferences.class), (a60.a) null, bVar), (SharedPreferences) aVar17.f(b0Var9.b(SharedPreferences.class), (a60.a) null, new b60.b("default_shared_preferences")), (yg.b) aVar17.f(b0Var9.b(yg.b.class), (a60.a) null, (b60.a) null), (gr.b) aVar17.f(b0Var9.b(gr.b.class), (a60.a) null, (b60.a) null));
            case 23:
                e60.a aVar18 = (e60.a) obj;
                kotlin.jvm.internal.m.e(aVar18, "$this$single");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                return new er.a((SharedPreferences) aVar18.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), (a60.a) null, new b60.b("default_shared_preferences")));
            case 24:
                e60.a aVar19 = (e60.a) obj;
                kotlin.jvm.internal.m.e(aVar19, "$this$factory");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                return new hr.b((xw.k) aVar19.f(b0Var10.b(xw.k.class), (a60.a) null, (b60.a) null), (er.j) aVar19.f(b0Var10.b(er.j.class), (a60.a) null, (b60.a) null));
            case 25:
                kotlin.jvm.internal.m.e((e60.a) obj, "$this$single");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                return new rr.a();
            case RuntimeVersion.MINOR:
                e60.a aVar20 = (e60.a) obj;
                kotlin.jvm.internal.m.e(aVar20, "$this$single");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                return new rr.b((pm.c) aVar20.f(kotlin.jvm.internal.a0.a.b(pm.c.class), (a60.a) null, (b60.a) null));
            case 27:
                e60.a aVar21 = (e60.a) obj;
                kotlin.jvm.internal.m.e(aVar21, "$this$single");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                return new jr.b((br.i) aVar21.f(b0Var11.b(br.i.class), (a60.a) null, (b60.a) null), (uu.a) aVar21.f(b0Var11.b(uu.a.class), (a60.a) null, (b60.a) null), (is.m1) aVar21.f(b0Var11.b(is.m1.class), (a60.a) null, (b60.a) null));
            case 28:
                kotlin.jvm.internal.m.e((e60.a) obj, "$this$factory");
                kotlin.jvm.internal.m.e((a60.a) obj2, "it");
                return new pr.c();
            default:
                ((Integer) obj2).getClass();
                kotlin.jvm.internal.m.e((w.v) obj, "$this$predictivePopTransitionSpec");
                return w.m.d(w.s0.c(null, 3), w.s0.k(new e6.c(4)));
        }
    }
}
