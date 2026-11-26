package a1;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.RecitersModel;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.mchutov.quranify.reciters.presentation.navigation.ReciterRoute;
import com.mchutov.quranify.reciters.presentation.navigation.ReciterTabRoute;
import java.util.LinkedHashMap;
import java.util.Locale;

public final class s0 implements u00.k {
    public final int A;

    public s0(int i10) {
        this.A = i10;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                ((z0.a) obj).e(null);
                return g00.b0.a;
            case 1:
                return g00.b0.a;
            case 2:
                return g00.b0.a;
            case 3:
                a40.v vVar = (k00.g) obj;
                if (vVar instanceof a40.v) {
                    return vVar;
                }
                return null;
            case 4:
                y50.a aVar = (y50.a) obj;
                kotlin.jvm.internal.m.e(aVar, "$this$module");
                a40.t tVar = new a40.t(5, (byte) 0);
                v50.c cVar = v50.c.A;
                kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
                a10.d dVarB = b0Var.b(zm.b.class);
                b60.b bVar = c60.a.e;
                aVar.a(new w50.e(new v50.a(bVar, dVarB, (b60.a) null, tVar, cVar)));
                aVar.a(new w50.e(new v50.a(bVar, b0Var.b(sn.c.class), (b60.a) null, new a40.t(7, (byte) 0), cVar)));
                aVar.a(new w50.e(new v50.a(bVar, b0Var.b(sn.i.class), (b60.a) null, new a40.t(8, (byte) 0), cVar)));
                aVar.a(new w50.e(new v50.a(bVar, b0Var.b(sn.e.class), (b60.a) null, new a40.t(9, (byte) 0), cVar)));
                aVar.a(new w50.e(new v50.a(bVar, b0Var.b(nn.d.class), (b60.a) null, new a40.t(10, (byte) 0), cVar)));
                aVar.a(new w50.e(new v50.a(bVar, b0Var.b(nn.k.class), (b60.a) null, new a40.t(11, (byte) 0), cVar)));
                a40.t tVar2 = new a40.t(12, (byte) 0);
                v50.c cVar2 = v50.c.B;
                aVar.a(new w50.a(new v50.a(bVar, b0Var.b(nn.j.class), (b60.a) null, tVar2, cVar2)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var.b(dn.c.class), (b60.a) null, new a40.t(13, (byte) 0), cVar2)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var.b(jn.a.class), (b60.a) null, new a40.t(3, (byte) 0), cVar2)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var.b(on.d.class), (b60.a) null, new a40.t(4, (byte) 0), cVar2)));
                aVar.a(new w50.a(new v50.a(bVar, b0Var.b(fn.b.class), (b60.a) null, new a40.t(6, (byte) 0), cVar2)));
                return g00.b0.a;
            case 5:
                PlayerItem playerItem = (PlayerItem) obj;
                kotlin.jvm.internal.m.e(playerItem, "it");
                return Integer.valueOf(playerItem.getSurahNumber());
            case 6:
                PlayerItem playerItem2 = (PlayerItem) obj;
                kotlin.jvm.internal.m.e(playerItem2, "it");
                return Integer.valueOf(playerItem2.getReciterId());
            case 7:
                PlayerItem playerItem3 = (PlayerItem) obj;
                kotlin.jvm.internal.m.e(playerItem3, "it");
                String lowerCase = playerItem3.getReciterName().toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                return lowerCase;
            case 8:
                PlayerItem playerItem4 = (PlayerItem) obj;
                kotlin.jvm.internal.m.e(playerItem4, "it");
                return Integer.valueOf(playerItem4.getSurahNumber());
            case 9:
                PlayerItem playerItem5 = (PlayerItem) obj;
                kotlin.jvm.internal.m.e(playerItem5, "it");
                return Integer.valueOf(playerItem5.getReciterId());
            case 10:
                return h00.q.D0(((dw.a) obj).i);
            case 11:
                y50.a aVar2 = (y50.a) obj;
                kotlin.jvm.internal.m.e(aVar2, "$this$module");
                b60.b bVar2 = new b60.b("RECENT_SEARCHED_RECITER_STORE_SCOPE_KEY");
                ax.c cVar3 = new ax.c(5);
                v50.c cVar4 = v50.c.A;
                kotlin.jvm.internal.b0 b0Var2 = kotlin.jvm.internal.a0.a;
                a10.d dVarB2 = b0Var2.b(DataStore.class);
                b60.b bVar3 = c60.a.e;
                aVar2.a(new w50.e(new v50.a(bVar3, dVarB2, bVar2, cVar3, cVar4)));
                aVar2.a(new w50.e(new v50.a(bVar3, b0Var2.b(DataStore.class), new b60.b("RECITER_STORE_SCOPE_KEY"), new a40.t(22, (byte) 0), cVar4)));
                aVar2.a(new w50.e(new v50.a(bVar3, b0Var2.b(zw.a.class), (b60.a) null, new a40.t(26, (byte) 0), cVar4)));
                aVar2.a(new w50.e(new v50.a(bVar3, b0Var2.b(ww.a.class), (b60.a) null, new a40.t(27, (byte) 0), cVar4)));
                aVar2.a(new w50.e(new v50.a(bVar3, b0Var2.b(xw.e.class), (b60.a) null, new a40.t(28, (byte) 0), cVar4)));
                aVar2.a(new w50.e(new v50.a(bVar3, b0Var2.b(xw.k.class), (b60.a) null, new a40.t(29, (byte) 0), cVar4)));
                aVar2.a(new w50.e(new v50.a(bVar3, b0Var2.b(xw.d.class), (b60.a) null, new ax.c(0), cVar4)));
                ax.c cVar5 = new ax.c(1);
                v50.c cVar6 = v50.c.B;
                aVar2.a(new w50.a(new v50.a(bVar3, b0Var2.b(uw.c.class), (b60.a) null, cVar5, cVar6)));
                aVar2.a(new w50.a(new v50.a(bVar3, b0Var2.b(uw.f.class), (b60.a) null, new ax.c(2), cVar6)));
                aVar2.a(new w50.a(new v50.a(bVar3, b0Var2.b(uw.e.class), (b60.a) null, new ax.c(3), cVar6)));
                aVar2.a(new w50.a(new v50.a(bVar3, b0Var2.b(uw.h.class), (b60.a) null, new ax.c(6), cVar6)));
                aVar2.a(new w50.a(new v50.a(bVar3, b0Var2.b(uw.b.class), (b60.a) null, new ax.c(7), cVar6)));
                aVar2.a(new w50.a(new v50.a(bVar3, b0Var2.b(uw.a.class), (b60.a) null, new ax.c(8), cVar6)));
                aVar2.a(new w50.a(new v50.a(bVar3, b0Var2.b(uw.j.class), (b60.a) null, new ax.c(9), cVar6)));
                aVar2.a(new w50.e(new v50.a(bVar3, b0Var2.b(gx.d.class), (b60.a) null, new a40.t(16, (byte) 0), cVar4)));
                aVar2.a(new w50.e(new v50.a(bVar3, b0Var2.b(gx.e.class), (b60.a) null, new a40.t(17, (byte) 0), cVar4)));
                aVar2.a(new w50.e(new v50.a(bVar3, b0Var2.b(bm.a.class), new b60.b("ReciterDeepLinkHandler"), new a40.t(18, (byte) 0), cVar4)));
                aVar2.a(new w50.e(new v50.a(bVar3, b0Var2.b(bm.a.class), new b60.b("ReciterSurahDeepLinkHandler"), new a40.t(19, (byte) 0), cVar4)));
                aVar2.a(new w50.e(new v50.a(bVar3, b0Var2.b(bm.a.class), new b60.b("ReciterCollectionDeepLinkHandler"), new a40.t(20, (byte) 0), cVar4)));
                aVar2.a(new w50.a(new v50.a(bVar3, b0Var2.b(hx.e0.class), (b60.a) null, new a40.t(21, (byte) 0), cVar6)));
                aVar2.a(new w50.a(new v50.a(bVar3, b0Var2.b(qx.t.class), (b60.a) null, new a40.t(23, (byte) 0), cVar6)));
                aVar2.a(new w50.a(new v50.a(bVar3, b0Var2.b(jx.x.class), (b60.a) null, new a40.t(24, (byte) 0), cVar6)));
                aVar2.a(new w50.a(new v50.a(bVar3, b0Var2.b(nx.p0.class), (b60.a) null, new a40.t(25, (byte) 0), cVar6)));
                aVar2.b(new b60.b("RECITERS_SCOPE_KEY"), new s0(12));
                return g00.b0.a;
            case 12:
                f60.a aVar3 = (f60.a) obj;
                kotlin.jvm.internal.m.e(aVar3, "$this$scope");
                LinkedHashMap linkedHashMapU = h00.d0.U(h00.d0.U(h00.d0.Q(new g00.k("transitionSpec", new s0(13))), h00.d0.Q(new g00.k("popTransitionSpec", new s0(15)))), h00.d0.Q(new g00.k("predictivePopTransitionSpec", new ax.c(4))));
                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                b60.c cVar7 = new b60.c(b0Var3.b(ReciterRoute.ReciterCollectionScreen.class));
                ax.g gVar = new ax.g(linkedHashMapU, 0);
                b60.b bVar4 = aVar3.a;
                v50.c cVar8 = v50.c.C;
                w50.d dVar = new w50.d(new v50.a(bVar4, b0Var3.b(u00.k.class), cVar7, gVar, cVar8));
                y50.a aVar4 = aVar3.b;
                aVar4.a(dVar);
                aVar4.a(new w50.d(new v50.a(bVar4, b0Var3.b(u00.k.class), new b60.c(b0Var3.b(gx.k.class)), new ax.g(linkedHashMapU, 1), cVar8)));
                aVar4.a(new w50.d(new v50.a(bVar4, b0Var3.b(u00.k.class), new b60.c(b0Var3.b(gx.n.class)), new ax.g(linkedHashMapU, 2), cVar8)));
                aVar4.a(new w50.d(new v50.a(bVar4, b0Var3.b(u00.k.class), new b60.c(b0Var3.b(ReciterRoute.ReciterScreen.class)), new ax.g(linkedHashMapU, 3), cVar8)));
                return g00.b0.a;
            case 13:
                kotlin.jvm.internal.m.e((w.v) obj, "$this$transitionSpec");
                return w.m.d(w.s0.i(new e6.c(4)), w.s0.d(null, 3));
            case 14:
                f60.a aVar5 = (f60.a) obj;
                kotlin.jvm.internal.m.e(aVar5, "<this>");
                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                aVar5.b.a(new w50.d(new v50.a(aVar5.a, b0Var4.b(u00.k.class), new b60.c(b0Var4.b(ReciterTabRoute.ReciterRootScreen.class)), new ax.i(), v50.c.C)));
                return g00.b0.a;
            case 15:
                kotlin.jvm.internal.m.e((w.v) obj, "$this$popTransitionSpec");
                return w.m.d(w.s0.c(null, 3), w.s0.k(new e6.c(4)));
            case 16:
                kotlin.jvm.internal.m.e((CorruptionException) obj, "it");
                return yw.b.B;
            case 17:
                kotlin.jvm.internal.m.e((CorruptionException) obj, "it");
                RecitersModel defaultInstance = RecitersModel.getDefaultInstance();
                kotlin.jvm.internal.m.d(defaultInstance, "getDefaultInstance(...)");
                return defaultInstance;
            case TYPE_SINT64_VALUE:
                ry.c cVar9 = (ry.c) obj;
                kotlin.jvm.internal.m.e(cVar9, "it");
                return cVar9.a;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return Boolean.valueOf(((h2.c) obj) == null);
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                i2.c0 c0Var = (i2.c0) obj;
                kotlin.jvm.internal.m.e(c0Var, "$this$graphicsLayer");
                c0Var.s0(0.4f);
                return g00.b0.a;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                i2.c0 c0Var2 = (i2.c0) obj;
                kotlin.jvm.internal.m.e(c0Var2, "$this$graphicsLayer");
                c0Var2.s0(0.55f);
                return g00.b0.a;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                d00.n0 n0Var = (d00.n0) obj;
                kotlin.jvm.internal.m.e(n0Var, "$this$hazeEffect");
                e00.d dVar2 = n0Var.d0;
                e00.d dVar3 = dVar2 instanceof e00.d ? dVar2 : null;
                if (dVar3 == null) {
                    dVar3 = new e00.d();
                }
                n0Var.E1(dVar3);
                float f3 = 50;
                if (!y3.f.b(f3, dVar3.e)) {
                    dVar3.e = f3;
                    dVar3.p(dVar3.m() | 2);
                }
                if (0.1f != dVar3.f) {
                    dVar3.f = 0.1f;
                    dVar3.p(dVar3.m() | 4);
                }
                return g00.b0.a;
            case 23:
                return Long.valueOf(((rs.a) obj).b);
            case 24:
                return Long.valueOf(((rs.b) obj).b);
            case 25:
                return Long.valueOf(((rs.b) obj).b);
            case RuntimeVersion.MINOR:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 27:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 28:
                y50.a aVar6 = (y50.a) obj;
                kotlin.jvm.internal.m.e(aVar6, "$this$module");
                b60.b bVar5 = new b60.b("PLAYLIST_STORE_SCOPE_KEY");
                ax.c cVar10 = new ax.c(27);
                v50.c cVar11 = v50.c.A;
                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                a10.d dVarB3 = b0Var5.b(DataStore.class);
                b60.b bVar6 = c60.a.e;
                aVar6.a(new w50.e(new v50.a(bVar6, dVarB3, bVar5, cVar10, cVar11)));
                aVar6.a(new w50.e(new v50.a(bVar6, b0Var5.b(aw.a.class), (b60.a) null, new bw.c(1, (byte) 0), cVar11)));
                aVar6.a(new w50.e(new v50.a(bVar6, b0Var5.b(yv.c.class), (b60.a) null, new bw.c(2, (byte) 0), cVar11)));
                aVar6.a(new w50.e(new v50.a(bVar6, b0Var5.b(xv.c.class), (b60.a) null, new ax.c(19), cVar11)));
                ax.c cVar12 = new ax.c(20);
                v50.c cVar13 = v50.c.B;
                aVar6.a(new w50.a(new v50.a(bVar6, b0Var5.b(vv.c.class), (b60.a) null, cVar12, cVar13)));
                aVar6.a(new w50.a(new v50.a(bVar6, b0Var5.b(vv.a.class), (b60.a) null, new ax.c(21), cVar13)));
                aVar6.a(new w50.a(new v50.a(bVar6, b0Var5.b(vv.d.class), (b60.a) null, new ax.c(22), cVar13)));
                aVar6.a(new w50.a(new v50.a(bVar6, b0Var5.b(vv.b.class), (b60.a) null, new ax.c(23), cVar13)));
                aVar6.a(new w50.a(new v50.a(bVar6, b0Var5.b(cw.a.class), (b60.a) null, new ax.c(24), cVar13)));
                aVar6.a(new w50.e(new v50.a(bVar6, b0Var5.b(fw.b.class), (b60.a) null, new ax.c(25), cVar11)));
                aVar6.a(new w50.e(new v50.a(bVar6, b0Var5.b(fw.c.class), (b60.a) null, new ax.c(28), cVar11)));
                aVar6.a(new w50.e(new v50.a(bVar6, b0Var5.b(bm.a.class), new b60.b("CollectionDeepLinkHandler"), new ax.c(29), cVar11)));
                aVar6.a(new w50.a(new v50.a(bVar6, b0Var5.b(hw.j.class), (b60.a) null, new bw.c(0, (byte) 0), cVar13)));
                aVar6.b(new b60.b("PLAYLISTS_SCOPE_KEY"), new bw.b(3));
                return g00.b0.a;
            default:
                kotlin.jvm.internal.m.e((w.v) obj, "$this$transitionSpec");
                return w.m.d(w.s0.i(new e6.c(4)), w.s0.d(null, 3));
        }
    }
}
