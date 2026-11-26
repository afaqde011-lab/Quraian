package bw;

import android.app.Activity;
import android.app.LocaleManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Resources;
import androidx.datastore.core.CorruptionException;
import androidx.glance.appwidget.MyPackageReplacedReceiver;
import androidx.glance.appwidget.protobuf.x;
import androidx.media3.common.f1;
import androidx.media3.ui.PlayerView;
import ax.g;
import b6.l;
import c3.o0;
import com.mchutov.core.deeplink.presentation.analytics.DeepLinkAnalytics;
import com.mchutov.quranify.PlaylistsModel;
import com.mchutov.quranify.auth.data.source.local.AuthLocalDataSource;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import com.mchutov.quranify.playlist.presentation.navigation.PlaylistsRoute$PlaylistScreen;
import com.mchutov.quranify.playlist.presentation.navigation.PlaylistsRoute$PlaylistsScreen;
import com.mchutov.quranify.playlist.presentation.navigation.PlaylistsTabRoute$PlaylistsRootScreen;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import d0.i0;
import d6.o1;
import e1.h0;
import f5.h;
import f6.n;
import g00.b0;
import g00.j;
import h00.d0;
import j6.s;
import java.util.LinkedHashMap;
import jp.e0;
import k0.i;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import l1.m1;
import l1.q;
import l1.q2;
import l60.q0;
import rp.o;
import u00.k;
import w.s0;
import w.v;
import wo.c0;
import x.y;
import x40.r;
import x40.w;

public final class b implements k {
    public final int A;

    public b(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj) {
        Context context;
        int i = this.A;
        int i2 = 27;
        int i3 = 25;
        int i4 = 24;
        int i5 = 20;
        int i6 = 28;
        int i7 = 13;
        int i8 = 12;
        int i9 = 11;
        int i11 = 2;
        int i12 = 29;
        int i13 = 26;
        boolean z = true;
        z = true;
        z = true;
        b0 b0Var = b0.a;
        byte b = 0;
        switch (i) {
            case 0:
                v popTransitionSpec = (v) obj;
                m.e(popTransitionSpec, "$this$popTransitionSpec");
                return w.m.d(s0.c((y) null, 3), s0.k(new e6.c(4)));
            case 1:
                f60.a aVar = (f60.a) obj;
                m.e(aVar, "<this>");
                kotlin.jvm.internal.b0 b0Var2 = a0.a;
                aVar.b.a(new w50.d(new v50.a(aVar.a, b0Var2.b(k.class), new b60.c(b0Var2.b(PlaylistsTabRoute$PlaylistsRootScreen.class)), new e(), v50.c.C)));
                return b0Var;
            case 2:
                m.e((CorruptionException) obj, "it");
                PlaylistsModel defaultInstance = PlaylistsModel.getDefaultInstance();
                m.d(defaultInstance, "getDefaultInstance(...)");
                return defaultInstance;
            case 3:
                f60.a scope = (f60.a) obj;
                m.e(scope, "$this$scope");
                LinkedHashMap linkedHashMapU = d0.U(d0.U(d0.Q(new g00.k("transitionSpec", new a1.s0(29))), d0.Q(new g00.k("popTransitionSpec", new b(b)))), d0.Q(new g00.k("predictivePopTransitionSpec", new ax.c(i13))));
                kotlin.jvm.internal.b0 b0Var3 = a0.a;
                b60.c cVar = new b60.c(b0Var3.b(PlaylistsRoute$PlaylistsScreen.class));
                g gVar = new g(linkedHashMapU, 4);
                b60.b bVar = scope.a;
                v50.c cVar2 = v50.c.C;
                w50.d dVar = new w50.d(new v50.a(bVar, b0Var3.b(k.class), cVar, gVar, cVar2));
                y50.a aVar2 = scope.b;
                aVar2.a(dVar);
                aVar2.a(new w50.d(new v50.a(bVar, b0Var3.b(k.class), new b60.c(b0Var3.b(PlaylistsRoute$PlaylistScreen.class)), new g(linkedHashMapU, 5), cVar2)));
                return b0Var;
            case 4:
                i LazyVerticalGrid = (i) obj;
                m.e(LazyVerticalGrid, "$this$LazyVerticalGrid");
                i.r(LazyVerticalGrid, 9, c00.a.e);
                return b0Var;
            case 5:
                zz.a it = (zz.a) obj;
                m.e(it, "it");
                return it.a;
            case 6:
                ca.a config = (ca.a) obj;
                m.e(config, "config");
                throw new j();
            case 7:
                ma.c it2 = (ma.c) obj;
                m.e(it2, "it");
                return Boolean.valueOf(it2.d0());
            case 8:
                ma.c statement = (ma.c) obj;
                m.e(statement, "statement");
                i00.i iVar = new i00.i();
                while (statement.d0()) {
                    iVar.add(Integer.valueOf((int) statement.getLong(0)));
                }
                return w50.c.m(iVar);
            case 9:
                y50.a module = (y50.a) obj;
                m.e(module, "$this$module");
                c cVar3 = new c(18, b);
                v50.c cVar4 = v50.c.A;
                kotlin.jvm.internal.b0 b0Var4 = a0.a;
                a10.d dVarB = b0Var4.b(ap.a.class);
                b60.b bVar2 = c60.a.e;
                module.a(new w50.e(new v50.a(bVar2, dVarB, null, cVar3, cVar4)));
                module.a(new w50.e(new v50.a(bVar2, b0Var4.b(h.class), null, new c(10, b), cVar4)));
                module.a(new w50.e(new v50.a(bVar2, b0Var4.b(xo.e.class), null, new c(17, b), cVar4)));
                module.a(new w50.e(new v50.a(bVar2, b0Var4.b(xo.a.class), null, new c(19, b), cVar4)));
                module.a(new w50.e(new v50.a(bVar2, b0Var4.b(r.class), new b60.b("AUTH_TOKEN_INTERCEPTOR"), new c(i5, b), cVar4)));
                module.a(new w50.e(new v50.a(bVar2, b0Var4.b(x40.c.class), null, new c(21, b), cVar4)));
                c cVar5 = new c(22, b);
                v50.c cVar6 = v50.c.B;
                module.a(new w50.a(new v50.a(bVar2, b0Var4.b(uo.a.class), null, cVar5, cVar6)));
                module.a(new w50.a(new v50.a(bVar2, b0Var4.b(uo.b.class), null, new c(23, b), cVar6)));
                module.a(new w50.a(new v50.a(bVar2, b0Var4.b(uo.c.class), null, new c(i4, b), cVar6)));
                module.a(new w50.a(new v50.a(bVar2, b0Var4.b(uo.g.class), null, new c(i3, b), cVar6)));
                module.a(new w50.a(new v50.a(bVar2, b0Var4.b(uo.f.class), null, new c(i13, b), cVar6)));
                module.a(new w50.a(new v50.a(bVar2, b0Var4.b(uo.e.class), null, new c(i2, b), cVar6)));
                module.a(new w50.a(new v50.a(bVar2, b0Var4.b(uo.h.class), null, new c(i6, b), cVar6)));
                module.a(new w50.a(new v50.a(bVar2, b0Var4.b(uo.d.class), null, new c(i12, b), cVar6)));
                module.a(new w50.e(new v50.a(bVar2, b0Var4.b(AuthLocalDataSource.class), null, new cp.a(b), cVar4)));
                module.a(new w50.e(new v50.a(bVar2, b0Var4.b(c0.class), null, new cp.a(true ? 1 : 0), cVar4)));
                module.a(new w50.e(new v50.a(bVar2, b0Var4.b(wo.b0.class), null, new cp.a(i11), cVar4)));
                module.a(new w50.a(new v50.a(bVar2, b0Var4.b(bp.g.class), null, new cp.a(3), cVar6)));
                module.a(new w50.a(new v50.a(bVar2, b0Var4.b(bp.a.class), null, new c(8, b), cVar6)));
                module.a(new w50.a(new v50.a(bVar2, b0Var4.b(bp.c.class), null, new c(9, b), cVar6)));
                module.a(new w50.e(new v50.a(bVar2, b0Var4.b(bp.b.class), null, new c(i9, b), cVar4)));
                module.a(new w50.e(new v50.a(bVar2, b0Var4.b(hp.b.class), null, new c(i8, b), cVar4)));
                module.a(new w50.e(new v50.a(bVar2, b0Var4.b(AuthAnalytics.class), null, new c(13, b), cVar4)));
                module.a(new w50.a(new v50.a(bVar2, b0Var4.b(o.class), null, new c(14, b), cVar6)));
                b60.c cVar7 = new b60.c(b0Var4.b(e0.class));
                module.a(new w50.d(new v50.a(cVar7, b0Var4.b(kp.b.class), null, new c(15, b), v50.c.C)));
                module.d.add(cVar7);
                module.a(new w50.a(new v50.a(bVar2, b0Var4.b(e0.class), null, new c(16, b), cVar6)));
                return b0Var;
            case 10:
                PlayerView playerView = (PlayerView) obj;
                m.e(playerView, "playerView");
                playerView.setRenderEffect(null);
                playerView.setPlayer((f1) null);
                return b0Var;
            case 11:
                m.e((Resources) obj, "<unused var>");
                return Boolean.TRUE;
            case 12:
                q2 q2Var = o0.b;
                m1 m1Var = (m1) obj;
                m1Var.getClass();
                if (((Context) q.D(m1Var, q2Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return d0.e.b;
                }
                d0.c.a.getClass();
                return d0.b.c;
            case 13:
                float f = i0.a;
                return b0Var;
            case 14:
                return Boolean.TRUE;
            case 15:
                v2.a0 a0Var = (v2.a0) obj;
                if (a0Var != null && a0Var.a == 2) {
                    b = 1;
                }
                return Boolean.valueOf(b ^ 1);
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                ((Float) obj).getClass();
                return b0Var;
            case 17:
                return Boolean.TRUE;
            case 18:
                return 150L;
            case 19:
                Object obj2 = o1.a;
                return Boolean.TRUE;
            case 20:
                f6.a aVar3 = (f6.a) obj;
                int i14 = MyPackageReplacedReceiver.a;
                f6.g gVarA = f6.g.n().a();
                aVar3.c();
                n.s(((x) aVar3).B, gVarA);
                return b0Var;
            case 21:
                return Boolean.valueOf(((l) obj) instanceof c6.b);
            case 22:
                return Boolean.valueOf(((l) obj) instanceof c6.b);
            case 23:
                l lVar = (l) obj;
                if (!(lVar instanceof s) && !(lVar instanceof j6.m) && !(lVar instanceof d6.c0)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                return Boolean.FALSE;
            case 25:
                y50.a module2 = (y50.a) obj;
                m.e(module2, "$this$module");
                cp.a aVar4 = new cp.a(i6);
                v50.c cVar8 = v50.c.A;
                kotlin.jvm.internal.b0 b0Var5 = a0.a;
                a10.d dVarB2 = b0Var5.b(ah.e.class);
                b60.b bVar3 = c60.a.e;
                module2.a(new w50.e(new v50.a(bVar3, dVarB2, null, aVar4, cVar8)));
                module2.a(new w50.e(new v50.a(bVar3, b0Var5.b(SharedPreferences.class), new b60.b("default_shared_preferences"), new cp.a(i5), cVar8)));
                module2.a(new w50.e(new v50.a(bVar3, b0Var5.b(SharedPreferences.class), new b60.b("s_shared_preferences"), new cp.a(i4), cVar8)));
                cp.a aVar5 = new cp.a(i3);
                v50.c cVar9 = v50.c.B;
                module2.a(new w50.a(new v50.a(bVar3, b0Var5.b(bk.m.class), null, aVar5, cVar9)));
                module2.a(new w50.e(new v50.a(bVar3, b0Var5.b(cm.a.class), null, new cp.a(i13), cVar8)));
                module2.a(new w50.a(new v50.a(bVar3, b0Var5.b(cm.b.class), null, new cp.a(i2), cVar9)));
                module2.a(new w50.a(new v50.a(bVar3, b0Var5.b(im.a.class), null, new cp.a(i12), cVar9)));
                module2.a(new w50.a(new v50.a(bVar3, b0Var5.b(jm.a.class), null, new dm.a(b), cVar9)));
                module2.a(new w50.e(new v50.a(bVar3, b0Var5.b(w.class), new b60.b("DEFAULT_OK_HTTP_CLIENT"), new dm.a(true ? 1 : 0), cVar8)));
                module2.a(new w50.e(new v50.a(bVar3, b0Var5.b(rj.b.class), null, new dm.a(i11), cVar8)));
                module2.a(new w50.e(new v50.a(bVar3, b0Var5.b(sl.a.class), null, new dm.a(3), cVar8)));
                module2.a(new w50.e(new v50.a(bVar3, b0Var5.b(lb.f.class), null, new dm.a(4), cVar8)));
                module2.a(new w50.e(new v50.a(bVar3, b0Var5.b(q0.class), null, new dm.a(5), cVar8)));
                module2.a(new w50.e(new v50.a(bVar3, b0Var5.b(yg.b.class), null, new dm.a(6), cVar8)));
                module2.a(new w50.a(new v50.a(bVar3, b0Var5.b(pm.c.class), null, new dm.a(7), cVar9)));
                module2.a(new w50.a(new v50.a(bVar3, b0Var5.b(xm.a.class), null, new dm.a(8), cVar9)));
                module2.a(new w50.a(new v50.a(bVar3, b0Var5.b(LocaleManager.class), null, new dm.a(9), cVar9)));
                module2.a(new w50.e(new v50.a(bVar3, b0Var5.b(rc.c.class), null, new dm.a(10), cVar8)));
                module2.a(new w50.e(new v50.a(bVar3, b0Var5.b(sk.a.class), new b60.b("AMPLITUDE_ANALYTICS_DELEGATE"), new cp.a(18), cVar8)));
                module2.a(new w50.e(new v50.a(bVar3, b0Var5.b(uk.a.class), null, new cp.a(19), cVar8)));
                module2.a(new w50.a(new v50.a(bVar3, b0Var5.b(tk.d.class), null, new cp.a(21), cVar9)));
                module2.a(new w50.a(new v50.a(bVar3, b0Var5.b(tk.c.class), null, new cp.a(22), cVar9)));
                module2.a(new w50.e(new v50.a(bVar3, b0Var5.b(nm.b.class), null, new cp.a(23), cVar8)));
                return b0Var;
            case 26:
                y50.a module3 = (y50.a) obj;
                m.e(module3, "$this$module");
                dm.a aVar6 = new dm.a(i9);
                v50.c cVar10 = v50.c.A;
                kotlin.jvm.internal.b0 b0Var6 = a0.a;
                a10.d dVarB3 = b0Var6.b(ul.a.class);
                b60.b bVar4 = c60.a.e;
                module3.a(new w50.e(new v50.a(bVar4, dVarB3, null, aVar6, cVar10)));
                module3.a(new w50.a(new v50.a(bVar4, b0Var6.b(DeepLinkAnalytics.class), null, new dm.a(i8), v50.c.B)));
                module3.a(new w50.e(new v50.a(bVar4, b0Var6.b(am.c.class), null, new dm.a(i7), cVar10)));
                return b0Var;
            case 27:
                q2 q2Var2 = o0.b;
                m1 m1Var2 = (m1) obj;
                m1Var2.getClass();
                for (Context baseContext = (Context) q.D(m1Var2, q2Var2); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
                    if (baseContext instanceof Activity) {
                        context = baseContext;
                        return (Activity) context;
                    }
                }
                context = null;
                return (Activity) context;
            case 28:
                h2.b bVar5 = (h2.b) obj;
                long j = bVar5.a;
                return (9223372034707292159L & j) != 9205357640488583168L ? new x.l(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (bVar5.a & 4294967295L))) : h0.a;
            default:
                x.l lVar2 = (x.l) obj;
                return new h2.b((((long) Float.floatToRawIntBits(lVar2.a)) << 32) | (((long) Float.floatToRawIntBits(lVar2.b)) & 4294967295L));
        }
    }
}
