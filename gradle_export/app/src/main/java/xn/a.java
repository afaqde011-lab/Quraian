package xn;

import android.app.Application;
import android.app.LocaleManager;
import android.content.SharedPreferences;
import androidx.datastore.core.DataStore;
import ax.j;
import b3.o0;
import c00.x;
import ca.r;
import com.mchutov.quranify.favoriters.data.source.local.db.FavoritesDatabase;
import com.mchutov.quranify.main.presentation.analytics.DownloadAnalytics;
import com.mchutov.quranify.main.presentation.analytics.PaywallAnalytics;
import com.mchutov.quranify.reciters.presentation.navigation.ReciterRoute$ReciterScreen;
import com.mchutov.quranify.search.presentation.navigation.SearchRoute$PlaylistScreen;
import com.mchutov.quranify.search.presentation.navigation.SearchRoute$SearchScreen;
import com.mchutov.quranify.search.presentation.navigation.SearchTabRoute$SearchScreen;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import dq.u;
import du.t0;
import e6.c;
import fy.c0;
import g00.b0;
import h00.d0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import l1.i1;
import l1.k2;
import l1.z0;
import ny.g;
import qs.f;
import ri.t1;
import u00.k;
import w.d1;
import w.d2;
import w.g2;
import w.i0;
import w.r0;
import w.s0;
import w.v;
import w.x0;
import w.y0;
import x.b1;
import x.r1;
import x.y;
import x40.w;
import z.p1;
import z1.n;

public final class a implements k {
    public final int A;

    public a(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj) throws Exception {
        int i = this.A;
        int i2 = 29;
        int i3 = 27;
        int i4 = 26;
        final int i5 = 3;
        final int i6 = 4;
        Object objInvoke = null;
        boolean z = false;
        z = false;
        b0 b0Var = b0.a;
        switch (i) {
            case 0:
                ma.a _connection = (ma.a) obj;
                m.e(_connection, "_connection");
                ma.c cVarK0 = _connection.k0("SELECT * FROM audio_story_download");
                try {
                    int I = w50.c.I(cVarK0, "episode_id");
                    int I2 = w50.c.I(cVarK0, "language");
                    int I3 = w50.c.I(cVarK0, "story_id");
                    int I4 = w50.c.I(cVarK0, "label");
                    int I5 = w50.c.I(cVarK0, DiagnosticsEntry.VERSION_KEY);
                    int I6 = w50.c.I(cVarK0, "duration_ms");
                    int I7 = w50.c.I(cVarK0, "audio_path");
                    int I8 = w50.c.I(cVarK0, "transcript_path");
                    int I9 = w50.c.I(cVarK0, "size_bytes");
                    int I10 = w50.c.I(cVarK0, "downloaded_at");
                    ArrayList arrayList = new ArrayList();
                    while (cVarK0.d0()) {
                        arrayList.add(new bo.a((int) cVarK0.getLong(I), cVarK0.R(I2), (int) cVarK0.getLong(I3), cVarK0.R(I4), (int) cVarK0.getLong(I5), cVarK0.getLong(I6), cVarK0.R(I7), cVarK0.isNull(I8) ? null : cVarK0.R(I8), cVarK0.getLong(I9), cVarK0.getLong(I10)));
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarK0.close();
                }
            case 1:
                ma.a _connection2 = (ma.a) obj;
                m.e(_connection2, "_connection");
                ma.c cVarK1 = _connection2.k0("SELECT * FROM audio_story_download");
                try {
                    int I11 = w50.c.I(cVarK1, "episode_id");
                    int I12 = w50.c.I(cVarK1, "language");
                    int I13 = w50.c.I(cVarK1, "story_id");
                    int I14 = w50.c.I(cVarK1, "label");
                    int I15 = w50.c.I(cVarK1, DiagnosticsEntry.VERSION_KEY);
                    int I16 = w50.c.I(cVarK1, "duration_ms");
                    int I17 = w50.c.I(cVarK1, "audio_path");
                    int I18 = w50.c.I(cVarK1, "transcript_path");
                    int I19 = w50.c.I(cVarK1, "size_bytes");
                    int I20 = w50.c.I(cVarK1, "downloaded_at");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarK1.d0()) {
                        arrayList2.add(new bo.a((int) cVarK1.getLong(I11), cVarK1.R(I12), (int) cVarK1.getLong(I13), cVarK1.R(I14), (int) cVarK1.getLong(I15), cVarK1.getLong(I16), cVarK1.R(I17), cVarK1.isNull(I18) ? null : cVarK1.R(I18), cVarK1.getLong(I19), cVarK1.getLong(I20)));
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarK1.close();
                }
            case 2:
                ma.a _connection3 = (ma.a) obj;
                m.e(_connection3, "_connection");
                ma.c cVarK2 = _connection3.k0("DELETE FROM audio_story_download");
                try {
                    cVarK2.d0();
                    return b0Var;
                } finally {
                    cVarK2.close();
                }
            case 3:
                ma.a _connection4 = (ma.a) obj;
                m.e(_connection4, "_connection");
                ma.c cVarK3 = _connection4.k0("DELETE FROM audio_story_event_queue");
                try {
                    cVarK3.d0();
                    return b0Var;
                } finally {
                    cVarK3.close();
                }
            case 4:
                ma.a _connection5 = (ma.a) obj;
                m.e(_connection5, "_connection");
                ma.c cVarK4 = _connection5.k0("SELECT COUNT(*) FROM audio_story_event_queue");
                try {
                    int i7 = cVarK4.d0() ? (int) cVarK4.getLong(0) : 0;
                    cVarK4.close();
                    return Integer.valueOf(i7);
                } catch (Throwable th) {
                    cVarK4.close();
                    throw th;
                }
            case 5:
                ma.a _connection6 = (ma.a) obj;
                m.e(_connection6, "_connection");
                ma.c cVarK5 = _connection6.k0("DELETE FROM audio_story_event_queue WHERE id NOT IN (SELECT id FROM audio_story_event_queue ORDER BY id DESC LIMIT ?)");
                try {
                    cVarK5.d(1, 10000);
                    cVarK5.d0();
                    return b0Var;
                } finally {
                    cVarK5.close();
                }
            case 6:
                ma.a _connection7 = (ma.a) obj;
                m.e(_connection7, "_connection");
                ma.c cVarK6 = _connection7.k0("DELETE FROM audio_story_event_queue WHERE julianday(occurred_at) < julianday('now', '-' || ? || ' days')");
                try {
                    cVarK6.d(1, 30);
                    cVarK6.d0();
                    return b0Var;
                } finally {
                    cVarK6.close();
                }
            case 7:
                ma.a _connection8 = (ma.a) obj;
                m.e(_connection8, "_connection");
                ma.c cVarK7 = _connection8.k0("SELECT * FROM audio_story_event_queue ORDER BY id ASC LIMIT ?");
                try {
                    cVarK7.d(1, 100);
                    int I21 = w50.c.I(cVarK7, DiagnosticsEntry.ID_KEY);
                    int I22 = w50.c.I(cVarK7, "event_id");
                    int I23 = w50.c.I(cVarK7, "session_id");
                    int I24 = w50.c.I(cVarK7, "story_id");
                    int I25 = w50.c.I(cVarK7, "episode_id");
                    int I26 = w50.c.I(cVarK7, "language");
                    int I27 = w50.c.I(cVarK7, "event_type");
                    int I28 = w50.c.I(cVarK7, "position_ms");
                    int I29 = w50.c.I(cVarK7, "seek_from_ms");
                    int I30 = w50.c.I(cVarK7, "listened_ms");
                    int I31 = w50.c.I(cVarK7, "playback_rate_times_100");
                    int I32 = w50.c.I(cVarK7, "is_offline");
                    int I33 = w50.c.I(cVarK7, "utc_offset_minutes");
                    int I34 = w50.c.I(cVarK7, "occurred_at");
                    int I35 = w50.c.I(cVarK7, "source");
                    int I36 = w50.c.I(cVarK7, "recorded_elapsed_ms");
                    int I37 = w50.c.I(cVarK7, "boot_count");
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarK7.d0()) {
                        long j = cVarK7.getLong(I21);
                        String strR = cVarK7.R(I22);
                        String strR2 = cVarK7.R(I23);
                        ArrayList arrayList4 = arrayList3;
                        int i8 = I23;
                        int i9 = (int) cVarK7.getLong(I24);
                        int i11 = (int) cVarK7.getLong(I25);
                        String strR3 = cVarK7.R(I26);
                        String strR4 = cVarK7.R(I27);
                        long j2 = cVarK7.getLong(I28);
                        Long lValueOf = cVarK7.isNull(I29) ? null : Long.valueOf(cVarK7.getLong(I29));
                        int i12 = (int) cVarK7.getLong(I30);
                        int i13 = (int) cVarK7.getLong(I31);
                        boolean z2 = ((int) cVarK7.getLong(I32)) != 0;
                        int i14 = (int) cVarK7.getLong(I33);
                        String strR5 = cVarK7.R(I34);
                        int i15 = I35;
                        String strR6 = cVarK7.isNull(i15) ? null : cVarK7.R(i15);
                        int i16 = I21;
                        int i17 = I36;
                        long j3 = cVarK7.getLong(i17);
                        I36 = i17;
                        int i18 = I34;
                        int i19 = I37;
                        int i21 = I22;
                        arrayList4.add(new bo.b(j, strR, strR2, i9, i11, strR3, strR4, j2, lValueOf, i12, i13, z2, i14, strR5, strR6, j3, (int) cVarK7.getLong(i19)));
                        arrayList3 = arrayList4;
                        I22 = i21;
                        I34 = i18;
                        I37 = i19;
                        I21 = i16;
                        I35 = i15;
                        I23 = i8;
                        break;
                    }
                    return arrayList3;
                } finally {
                    cVarK7.close();
                }
            case 8:
                ma.a _connection9 = (ma.a) obj;
                m.e(_connection9, "_connection");
                ma.c cVarK8 = _connection9.k0("SELECT EXISTS(SELECT 1 FROM audio_story_progress WHERE needs_upload = 0 AND (position_ms > 0 OR is_completed = 1))");
                try {
                    if (cVarK8.d0() && ((int) cVarK8.getLong(0)) != 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                } finally {
                    cVarK8.close();
                }
            case 9:
                ma.a _connection10 = (ma.a) obj;
                m.e(_connection10, "_connection");
                ma.c cVarK9 = _connection10.k0("SELECT * FROM audio_story_progress WHERE needs_upload = 1 ORDER BY updated_at ASC");
                try {
                    int I38 = w50.c.I(cVarK9, "episode_id");
                    int I39 = w50.c.I(cVarK9, "language");
                    int I40 = w50.c.I(cVarK9, "position_ms");
                    int I41 = w50.c.I(cVarK9, "is_completed");
                    int I42 = w50.c.I(cVarK9, "updated_at");
                    int I43 = w50.c.I(cVarK9, "needs_upload");
                    ArrayList arrayList5 = new ArrayList();
                    while (cVarK9.d0()) {
                        arrayList5.add(new bo.c((int) cVarK9.getLong(I38), cVarK9.R(I39), cVarK9.getLong(I40), ((int) cVarK9.getLong(I41)) != 0, cVarK9.getLong(I42), ((int) cVarK9.getLong(I43)) != 0));
                    }
                    cVarK9.close();
                    return arrayList5;
                } catch (Throwable th2) {
                    cVarK9.close();
                    throw th2;
                }
            case 10:
                ma.a _connection11 = (ma.a) obj;
                m.e(_connection11, "_connection");
                ma.c cVarK10 = _connection11.k0("DELETE FROM audio_story_progress");
                try {
                    cVarK10.d0();
                    return b0Var;
                } finally {
                    cVarK10.close();
                }
            case 11:
                ma.a _connection12 = (ma.a) obj;
                m.e(_connection12, "_connection");
                ma.c cVarK11 = _connection12.k0("SELECT * FROM audio_story_progress");
                try {
                    int I44 = w50.c.I(cVarK11, "episode_id");
                    int I45 = w50.c.I(cVarK11, "language");
                    int I46 = w50.c.I(cVarK11, "position_ms");
                    int I47 = w50.c.I(cVarK11, "is_completed");
                    int I48 = w50.c.I(cVarK11, "updated_at");
                    int I49 = w50.c.I(cVarK11, "needs_upload");
                    ArrayList arrayList6 = new ArrayList();
                    while (cVarK11.d0()) {
                        arrayList6.add(new bo.c((int) cVarK11.getLong(I44), cVarK11.R(I45), cVarK11.getLong(I46), ((int) cVarK11.getLong(I47)) != 0, cVarK11.getLong(I48), ((int) cVarK11.getLong(I49)) != 0));
                    }
                    cVarK11.close();
                    return arrayList6;
                } catch (Throwable th3) {
                    cVarK11.close();
                    throw th3;
                }
            case 12:
                y50.a module = (y50.a) obj;
                m.e(module, "$this$module");
                b60.b bVar = new b60.b("LOCAL_SURAH_STORE_SCOPE_KEY");
                wy.k kVar = new wy.k(6);
                v50.c cVar = v50.c.A;
                kotlin.jvm.internal.b0 b0Var2 = a0.a;
                a10.d dVarB = b0Var2.b(DataStore.class);
                b60.b bVar2 = c60.a.e;
                module.a(new w50.e(new v50.a(bVar2, dVarB, bVar, kVar, cVar)));
                wy.k kVar2 = new wy.k(8);
                v50.c cVar2 = v50.c.B;
                module.a(new w50.a(new v50.a(bVar2, b0Var2.b(fu.a.class), null, kVar2, cVar2)));
                module.a(new w50.a(new v50.a(bVar2, b0Var2.b(DownloadAnalytics.class), null, new wy.k(9), cVar2)));
                module.a(new w50.a(new v50.a(bVar2, b0Var2.b(PaywallAnalytics.class), null, new wy.k(10), cVar2)));
                module.a(new w50.e(new v50.a(bVar2, b0Var2.b(zt.a.class), null, new wy.k(11), cVar)));
                module.a(new w50.e(new v50.a(bVar2, b0Var2.b(w.class), new b60.b("WORK_MANAGER_OK_HTTP_CLIENT"), new wy.k(12), cVar)));
                module.a(new w50.a(new v50.a(bVar2, b0Var2.b(t0.class), null, new wy.k(13), cVar2)));
                module.a(new w50.e(new v50.a(bVar2, b0Var2.b(cu.a.class), null, new wy.k(i5), cVar)));
                module.a(new w50.e(new v50.a(bVar2, b0Var2.b(au.a.class), null, new wy.k(i6), cVar)));
                module.a(new w50.a(new v50.a(bVar2, b0Var2.b(tt.b.class), null, new wy.k(5), cVar2)));
                module.a(new w50.a(new v50.a(bVar2, b0Var2.b(tt.a.class), null, new wy.k(7), cVar2)));
                module.b(new b60.b("MAIN_SCOPE_KEY"), new a(13));
                return b0Var;
            case 13:
                f60.a scope = (f60.a) obj;
                m.e(scope, "$this$scope");
                kotlin.jvm.internal.b0 b0Var3 = a0.a;
                b60.c cVar3 = new b60.c(b0Var3.b(cu.d.class));
                xt.c cVar4 = new xt.c(z ? 1 : 0);
                b60.b bVar3 = scope.a;
                v50.c cVar5 = v50.c.C;
                w50.d dVar = new w50.d(new v50.a(bVar3, b0Var3.b(k.class), cVar3, cVar4, cVar5));
                y50.a aVar = scope.b;
                aVar.a(dVar);
                aVar.a(new w50.d(new v50.a(bVar3, b0Var3.b(k.class), new b60.c(b0Var3.b(cu.b.class)), new xt.c(1), cVar5)));
                return b0Var;
            case 14:
                y50.a module2 = (y50.a) obj;
                m.e(module2, "$this$module");
                wy.k kVar3 = new wy.k(15);
                v50.c cVar6 = v50.c.A;
                kotlin.jvm.internal.b0 b0Var4 = a0.a;
                a10.d dVarB2 = b0Var4.b(wz.a.class);
                b60.b bVar4 = c60.a.e;
                module2.a(new w50.e(new v50.a(bVar4, dVarB2, null, kVar3, cVar6)));
                module2.a(new w50.e(new v50.a(bVar4, b0Var4.b(vz.c.class), null, new wy.k(16), cVar6)));
                wy.k kVar4 = new wy.k(17);
                v50.c cVar7 = v50.c.B;
                module2.a(new w50.a(new v50.a(bVar4, b0Var4.b(sz.a.class), null, kVar4, cVar7)));
                module2.a(new w50.e(new v50.a(bVar4, b0Var4.b(a00.a.class), null, new wy.k(18), cVar6)));
                module2.a(new w50.e(new v50.a(bVar4, b0Var4.b(b00.c.class), null, new wy.k(19), cVar6)));
                module2.a(new w50.a(new v50.a(bVar4, b0Var4.b(x.class), null, new wy.k(20), cVar7)));
                return b0Var;
            case 15:
                n nVar = (z0) obj;
                if (!(nVar instanceof n)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                n nVar2 = nVar;
                if (nVar2.getValue() != null) {
                    Object value = nVar2.getValue();
                    m.b(value);
                    objInvoke = ((k) r3.w.d.C).invoke(value);
                }
                k2 k2VarD = nVar2.d();
                m.c(k2VarD, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver?>");
                return new i1(objInvoke, k2VarD);
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                return new y1.d((Map) obj);
            case 17:
                return obj;
            case 18:
                y50.a module3 = (y50.a) obj;
                m.e(module3, "$this$module");
                wy.k kVar5 = new wy.k(24);
                v50.c cVar8 = v50.c.B;
                kotlin.jvm.internal.b0 b0Var5 = a0.a;
                a10.d dVarB3 = b0Var5.b(u.class);
                b60.b bVar5 = c60.a.e;
                module3.a(new w50.a(new v50.a(bVar5, dVarB3, null, kVar5, cVar8)));
                wy.k kVar6 = new wy.k(25);
                v50.c cVar9 = v50.c.A;
                module3.a(new w50.e(new v50.a(bVar5, b0Var5.b(cq.b.class), null, kVar6, cVar9)));
                module3.a(new w50.e(new v50.a(bVar5, b0Var5.b(cq.a.class), null, new wy.k(i4), cVar9)));
                b60.b bVar6 = new b60.b("bottomNavigationScope");
                f60.a aVar2 = new f60.a(bVar6, module3);
                ir.e.d.invoke(aVar2);
                f.b.invoke(aVar2);
                j.c.invoke(aVar2);
                bw.f.c.invoke(aVar2);
                g.b.invoke(aVar2);
                yx.f.b.invoke(aVar2);
                module3.d.add(bVar6);
                return b0Var;
            case 19:
                y50.a module4 = (y50.a) obj;
                m.e(module4, "$this$module");
                b60.b bVar7 = new b60.b("FAVORITE_RECITER_STORE_SCOPE_KEY");
                wy.k kVar7 = new wy.k(i3);
                v50.c cVar10 = v50.c.A;
                kotlin.jvm.internal.b0 b0Var6 = a0.a;
                a10.d dVarB4 = b0Var6.b(DataStore.class);
                b60.b bVar8 = c60.a.e;
                module4.a(new w50.e(new v50.a(bVar8, dVarB4, bVar7, kVar7, cVar10)));
                wy.k kVar8 = new wy.k(28);
                v50.c cVar11 = v50.c.B;
                module4.a(new w50.a(new v50.a(bVar8, b0Var6.b(rq.b.class), null, kVar8, cVar11)));
                module4.a(new w50.a(new v50.a(bVar8, b0Var6.b(rq.a.class), null, new wy.k(i2), cVar11)));
                final int i22 = z ? 1 : 0;
                module4.a(new w50.a(new v50.a(bVar8, b0Var6.b(uq.b.class), null, new u00.n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i22) {
                            case 0:
                                e60.a factory = (e60.a) obj2;
                                a60.a it = (a60.a) obj3;
                                m.e(factory, "$this$factory");
                                m.e(it, "it");
                                kotlin.jvm.internal.b0 b0Var7 = a0.a;
                                return new uq.b((vq.a) factory.f(b0Var7.b(vq.a.class), null, null), (rq.b) factory.f(b0Var7.b(rq.b.class), null, null));
                            case 1:
                                e60.a single = (e60.a) obj2;
                                a60.a it2 = (a60.a) obj3;
                                m.e(single, "$this$single");
                                m.e(it2, "it");
                                r rVarX = bi.b.x(t1.h(single), FavoritesDatabase.class, "favorites_database");
                                rVarX.a(new fa.a[]{FavoritesDatabase.m, FavoritesDatabase.l});
                                return (FavoritesDatabase) rVarX.b();
                            case 2:
                                e60.a single2 = (e60.a) obj2;
                                a60.a it3 = (a60.a) obj3;
                                m.e(single2, "$this$single");
                                m.e(it3, "it");
                                return ((FavoritesDatabase) single2.f(a0.a.b(FavoritesDatabase.class), null, null)).r();
                            case 3:
                                e60.a single3 = (e60.a) obj2;
                                a60.a it4 = (a60.a) obj3;
                                m.e(single3, "$this$single");
                                m.e(it4, "it");
                                kotlin.jvm.internal.b0 b0Var8 = a0.a;
                                return new tq.k((uq.b) single3.f(b0Var8.b(uq.b.class), null, null), (rq.b) single3.f(b0Var8.b(rq.b.class), null, null), (DataStore) single3.f(b0Var8.b(DataStore.class), null, new b60.b("FAVORITE_RECITER_STORE_SCOPE_KEY")), (rq.a) single3.f(b0Var8.b(rq.a.class), null, null));
                            case 4:
                                v predictivePopTransitionSpec = (v) obj2;
                                ((Integer) obj3).getClass();
                                m.e(predictivePopTransitionSpec, "$this$predictivePopTransitionSpec");
                                return w.m.d(s0.c((y) null, 3), s0.k(new c(4)));
                            case 5:
                                e60.a single4 = (e60.a) obj2;
                                a60.a it5 = (a60.a) obj3;
                                m.e(single4, "$this$single");
                                m.e(it5, "it");
                                Application applicationH = t1.h(single4);
                                kotlin.jvm.internal.b0 b0Var9 = a0.a;
                                return new zx.b(applicationH, (bk.m) single4.f(b0Var9.b(bk.m.class), null, null), (LocaleManager) single4.f(b0Var9.b(LocaleManager.class), null, null));
                            case 6:
                                e60.a single5 = (e60.a) obj2;
                                a60.a it6 = (a60.a) obj3;
                                m.e(single5, "$this$single");
                                m.e(it6, "it");
                                b60.b bVar9 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var10 = a0.a;
                                return new xx.c((SharedPreferences) single5.f(b0Var10.b(SharedPreferences.class), null, bVar9), (bk.m) single5.f(b0Var10.b(bk.m.class), null, null));
                            case 7:
                                a60.a it7 = (a60.a) obj3;
                                m.e((e60.a) obj2, "$this$single");
                                m.e(it7, "it");
                                return new ey.a();
                            case 8:
                                a60.a it8 = (a60.a) obj3;
                                m.e((e60.a) obj2, "$this$single");
                                m.e(it8, "it");
                                return new ey.b();
                            case 9:
                                e60.a viewModel = (e60.a) obj2;
                                a60.a it9 = (a60.a) obj3;
                                m.e(viewModel, "$this$viewModel");
                                m.e(it9, "it");
                                kotlin.jvm.internal.b0 b0Var11 = a0.a;
                                return new c0((xw.k) viewModel.f(b0Var11.b(xw.k.class), null, null), (xv.c) viewModel.f(b0Var11.b(xv.c.class), null, null), (xx.c) viewModel.f(b0Var11.b(xx.c.class), null, null), (zx.b) viewModel.f(b0Var11.b(zx.b.class), null, null), (au.a) viewModel.f(b0Var11.b(au.a.class), null, null), (zt.a) viewModel.f(b0Var11.b(zt.a.class), null, null), (vp.x) viewModel.f(b0Var11.b(vp.x.class), null, null), (tq.k) viewModel.f(b0Var11.b(tq.k.class), null, null), (uu.a) viewModel.f(b0Var11.b(uu.a.class), null, null), (aq.a) viewModel.f(b0Var11.b(aq.a.class), null, null), (pm.c) viewModel.f(b0Var11.b(pm.c.class), null, null));
                            default:
                                return Integer.valueOf(((p1) obj3).a.h());
                        }
                    }
                }, cVar11)));
                final int i23 = 1;
                module4.a(new w50.e(new v50.a(bVar8, b0Var6.b(FavoritesDatabase.class), null, new u00.n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i23) {
                            case 0:
                                e60.a factory = (e60.a) obj2;
                                a60.a it = (a60.a) obj3;
                                m.e(factory, "$this$factory");
                                m.e(it, "it");
                                kotlin.jvm.internal.b0 b0Var7 = a0.a;
                                return new uq.b((vq.a) factory.f(b0Var7.b(vq.a.class), null, null), (rq.b) factory.f(b0Var7.b(rq.b.class), null, null));
                            case 1:
                                e60.a single = (e60.a) obj2;
                                a60.a it2 = (a60.a) obj3;
                                m.e(single, "$this$single");
                                m.e(it2, "it");
                                r rVarX = bi.b.x(t1.h(single), FavoritesDatabase.class, "favorites_database");
                                rVarX.a(new fa.a[]{FavoritesDatabase.m, FavoritesDatabase.l});
                                return (FavoritesDatabase) rVarX.b();
                            case 2:
                                e60.a single2 = (e60.a) obj2;
                                a60.a it3 = (a60.a) obj3;
                                m.e(single2, "$this$single");
                                m.e(it3, "it");
                                return ((FavoritesDatabase) single2.f(a0.a.b(FavoritesDatabase.class), null, null)).r();
                            case 3:
                                e60.a single3 = (e60.a) obj2;
                                a60.a it4 = (a60.a) obj3;
                                m.e(single3, "$this$single");
                                m.e(it4, "it");
                                kotlin.jvm.internal.b0 b0Var8 = a0.a;
                                return new tq.k((uq.b) single3.f(b0Var8.b(uq.b.class), null, null), (rq.b) single3.f(b0Var8.b(rq.b.class), null, null), (DataStore) single3.f(b0Var8.b(DataStore.class), null, new b60.b("FAVORITE_RECITER_STORE_SCOPE_KEY")), (rq.a) single3.f(b0Var8.b(rq.a.class), null, null));
                            case 4:
                                v predictivePopTransitionSpec = (v) obj2;
                                ((Integer) obj3).getClass();
                                m.e(predictivePopTransitionSpec, "$this$predictivePopTransitionSpec");
                                return w.m.d(s0.c((y) null, 3), s0.k(new c(4)));
                            case 5:
                                e60.a single4 = (e60.a) obj2;
                                a60.a it5 = (a60.a) obj3;
                                m.e(single4, "$this$single");
                                m.e(it5, "it");
                                Application applicationH = t1.h(single4);
                                kotlin.jvm.internal.b0 b0Var9 = a0.a;
                                return new zx.b(applicationH, (bk.m) single4.f(b0Var9.b(bk.m.class), null, null), (LocaleManager) single4.f(b0Var9.b(LocaleManager.class), null, null));
                            case 6:
                                e60.a single5 = (e60.a) obj2;
                                a60.a it6 = (a60.a) obj3;
                                m.e(single5, "$this$single");
                                m.e(it6, "it");
                                b60.b bVar9 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var10 = a0.a;
                                return new xx.c((SharedPreferences) single5.f(b0Var10.b(SharedPreferences.class), null, bVar9), (bk.m) single5.f(b0Var10.b(bk.m.class), null, null));
                            case 7:
                                a60.a it7 = (a60.a) obj3;
                                m.e((e60.a) obj2, "$this$single");
                                m.e(it7, "it");
                                return new ey.a();
                            case 8:
                                a60.a it8 = (a60.a) obj3;
                                m.e((e60.a) obj2, "$this$single");
                                m.e(it8, "it");
                                return new ey.b();
                            case 9:
                                e60.a viewModel = (e60.a) obj2;
                                a60.a it9 = (a60.a) obj3;
                                m.e(viewModel, "$this$viewModel");
                                m.e(it9, "it");
                                kotlin.jvm.internal.b0 b0Var11 = a0.a;
                                return new c0((xw.k) viewModel.f(b0Var11.b(xw.k.class), null, null), (xv.c) viewModel.f(b0Var11.b(xv.c.class), null, null), (xx.c) viewModel.f(b0Var11.b(xx.c.class), null, null), (zx.b) viewModel.f(b0Var11.b(zx.b.class), null, null), (au.a) viewModel.f(b0Var11.b(au.a.class), null, null), (zt.a) viewModel.f(b0Var11.b(zt.a.class), null, null), (vp.x) viewModel.f(b0Var11.b(vp.x.class), null, null), (tq.k) viewModel.f(b0Var11.b(tq.k.class), null, null), (uu.a) viewModel.f(b0Var11.b(uu.a.class), null, null), (aq.a) viewModel.f(b0Var11.b(aq.a.class), null, null), (pm.c) viewModel.f(b0Var11.b(pm.c.class), null, null));
                            default:
                                return Integer.valueOf(((p1) obj3).a.h());
                        }
                    }
                }, cVar10)));
                final int i24 = 2;
                module4.a(new w50.e(new v50.a(bVar8, b0Var6.b(vq.a.class), null, new u00.n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i24) {
                            case 0:
                                e60.a factory = (e60.a) obj2;
                                a60.a it = (a60.a) obj3;
                                m.e(factory, "$this$factory");
                                m.e(it, "it");
                                kotlin.jvm.internal.b0 b0Var7 = a0.a;
                                return new uq.b((vq.a) factory.f(b0Var7.b(vq.a.class), null, null), (rq.b) factory.f(b0Var7.b(rq.b.class), null, null));
                            case 1:
                                e60.a single = (e60.a) obj2;
                                a60.a it2 = (a60.a) obj3;
                                m.e(single, "$this$single");
                                m.e(it2, "it");
                                r rVarX = bi.b.x(t1.h(single), FavoritesDatabase.class, "favorites_database");
                                rVarX.a(new fa.a[]{FavoritesDatabase.m, FavoritesDatabase.l});
                                return (FavoritesDatabase) rVarX.b();
                            case 2:
                                e60.a single2 = (e60.a) obj2;
                                a60.a it3 = (a60.a) obj3;
                                m.e(single2, "$this$single");
                                m.e(it3, "it");
                                return ((FavoritesDatabase) single2.f(a0.a.b(FavoritesDatabase.class), null, null)).r();
                            case 3:
                                e60.a single3 = (e60.a) obj2;
                                a60.a it4 = (a60.a) obj3;
                                m.e(single3, "$this$single");
                                m.e(it4, "it");
                                kotlin.jvm.internal.b0 b0Var8 = a0.a;
                                return new tq.k((uq.b) single3.f(b0Var8.b(uq.b.class), null, null), (rq.b) single3.f(b0Var8.b(rq.b.class), null, null), (DataStore) single3.f(b0Var8.b(DataStore.class), null, new b60.b("FAVORITE_RECITER_STORE_SCOPE_KEY")), (rq.a) single3.f(b0Var8.b(rq.a.class), null, null));
                            case 4:
                                v predictivePopTransitionSpec = (v) obj2;
                                ((Integer) obj3).getClass();
                                m.e(predictivePopTransitionSpec, "$this$predictivePopTransitionSpec");
                                return w.m.d(s0.c((y) null, 3), s0.k(new c(4)));
                            case 5:
                                e60.a single4 = (e60.a) obj2;
                                a60.a it5 = (a60.a) obj3;
                                m.e(single4, "$this$single");
                                m.e(it5, "it");
                                Application applicationH = t1.h(single4);
                                kotlin.jvm.internal.b0 b0Var9 = a0.a;
                                return new zx.b(applicationH, (bk.m) single4.f(b0Var9.b(bk.m.class), null, null), (LocaleManager) single4.f(b0Var9.b(LocaleManager.class), null, null));
                            case 6:
                                e60.a single5 = (e60.a) obj2;
                                a60.a it6 = (a60.a) obj3;
                                m.e(single5, "$this$single");
                                m.e(it6, "it");
                                b60.b bVar9 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var10 = a0.a;
                                return new xx.c((SharedPreferences) single5.f(b0Var10.b(SharedPreferences.class), null, bVar9), (bk.m) single5.f(b0Var10.b(bk.m.class), null, null));
                            case 7:
                                a60.a it7 = (a60.a) obj3;
                                m.e((e60.a) obj2, "$this$single");
                                m.e(it7, "it");
                                return new ey.a();
                            case 8:
                                a60.a it8 = (a60.a) obj3;
                                m.e((e60.a) obj2, "$this$single");
                                m.e(it8, "it");
                                return new ey.b();
                            case 9:
                                e60.a viewModel = (e60.a) obj2;
                                a60.a it9 = (a60.a) obj3;
                                m.e(viewModel, "$this$viewModel");
                                m.e(it9, "it");
                                kotlin.jvm.internal.b0 b0Var11 = a0.a;
                                return new c0((xw.k) viewModel.f(b0Var11.b(xw.k.class), null, null), (xv.c) viewModel.f(b0Var11.b(xv.c.class), null, null), (xx.c) viewModel.f(b0Var11.b(xx.c.class), null, null), (zx.b) viewModel.f(b0Var11.b(zx.b.class), null, null), (au.a) viewModel.f(b0Var11.b(au.a.class), null, null), (zt.a) viewModel.f(b0Var11.b(zt.a.class), null, null), (vp.x) viewModel.f(b0Var11.b(vp.x.class), null, null), (tq.k) viewModel.f(b0Var11.b(tq.k.class), null, null), (uu.a) viewModel.f(b0Var11.b(uu.a.class), null, null), (aq.a) viewModel.f(b0Var11.b(aq.a.class), null, null), (pm.c) viewModel.f(b0Var11.b(pm.c.class), null, null));
                            default:
                                return Integer.valueOf(((p1) obj3).a.h());
                        }
                    }
                }, cVar10)));
                module4.a(new w50.e(new v50.a(bVar8, b0Var6.b(tq.k.class), null, new u00.n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i5) {
                            case 0:
                                e60.a factory = (e60.a) obj2;
                                a60.a it = (a60.a) obj3;
                                m.e(factory, "$this$factory");
                                m.e(it, "it");
                                kotlin.jvm.internal.b0 b0Var7 = a0.a;
                                return new uq.b((vq.a) factory.f(b0Var7.b(vq.a.class), null, null), (rq.b) factory.f(b0Var7.b(rq.b.class), null, null));
                            case 1:
                                e60.a single = (e60.a) obj2;
                                a60.a it2 = (a60.a) obj3;
                                m.e(single, "$this$single");
                                m.e(it2, "it");
                                r rVarX = bi.b.x(t1.h(single), FavoritesDatabase.class, "favorites_database");
                                rVarX.a(new fa.a[]{FavoritesDatabase.m, FavoritesDatabase.l});
                                return (FavoritesDatabase) rVarX.b();
                            case 2:
                                e60.a single2 = (e60.a) obj2;
                                a60.a it3 = (a60.a) obj3;
                                m.e(single2, "$this$single");
                                m.e(it3, "it");
                                return ((FavoritesDatabase) single2.f(a0.a.b(FavoritesDatabase.class), null, null)).r();
                            case 3:
                                e60.a single3 = (e60.a) obj2;
                                a60.a it4 = (a60.a) obj3;
                                m.e(single3, "$this$single");
                                m.e(it4, "it");
                                kotlin.jvm.internal.b0 b0Var8 = a0.a;
                                return new tq.k((uq.b) single3.f(b0Var8.b(uq.b.class), null, null), (rq.b) single3.f(b0Var8.b(rq.b.class), null, null), (DataStore) single3.f(b0Var8.b(DataStore.class), null, new b60.b("FAVORITE_RECITER_STORE_SCOPE_KEY")), (rq.a) single3.f(b0Var8.b(rq.a.class), null, null));
                            case 4:
                                v predictivePopTransitionSpec = (v) obj2;
                                ((Integer) obj3).getClass();
                                m.e(predictivePopTransitionSpec, "$this$predictivePopTransitionSpec");
                                return w.m.d(s0.c((y) null, 3), s0.k(new c(4)));
                            case 5:
                                e60.a single4 = (e60.a) obj2;
                                a60.a it5 = (a60.a) obj3;
                                m.e(single4, "$this$single");
                                m.e(it5, "it");
                                Application applicationH = t1.h(single4);
                                kotlin.jvm.internal.b0 b0Var9 = a0.a;
                                return new zx.b(applicationH, (bk.m) single4.f(b0Var9.b(bk.m.class), null, null), (LocaleManager) single4.f(b0Var9.b(LocaleManager.class), null, null));
                            case 6:
                                e60.a single5 = (e60.a) obj2;
                                a60.a it6 = (a60.a) obj3;
                                m.e(single5, "$this$single");
                                m.e(it6, "it");
                                b60.b bVar9 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var10 = a0.a;
                                return new xx.c((SharedPreferences) single5.f(b0Var10.b(SharedPreferences.class), null, bVar9), (bk.m) single5.f(b0Var10.b(bk.m.class), null, null));
                            case 7:
                                a60.a it7 = (a60.a) obj3;
                                m.e((e60.a) obj2, "$this$single");
                                m.e(it7, "it");
                                return new ey.a();
                            case 8:
                                a60.a it8 = (a60.a) obj3;
                                m.e((e60.a) obj2, "$this$single");
                                m.e(it8, "it");
                                return new ey.b();
                            case 9:
                                e60.a viewModel = (e60.a) obj2;
                                a60.a it9 = (a60.a) obj3;
                                m.e(viewModel, "$this$viewModel");
                                m.e(it9, "it");
                                kotlin.jvm.internal.b0 b0Var11 = a0.a;
                                return new c0((xw.k) viewModel.f(b0Var11.b(xw.k.class), null, null), (xv.c) viewModel.f(b0Var11.b(xv.c.class), null, null), (xx.c) viewModel.f(b0Var11.b(xx.c.class), null, null), (zx.b) viewModel.f(b0Var11.b(zx.b.class), null, null), (au.a) viewModel.f(b0Var11.b(au.a.class), null, null), (zt.a) viewModel.f(b0Var11.b(zt.a.class), null, null), (vp.x) viewModel.f(b0Var11.b(vp.x.class), null, null), (tq.k) viewModel.f(b0Var11.b(tq.k.class), null, null), (uu.a) viewModel.f(b0Var11.b(uu.a.class), null, null), (aq.a) viewModel.f(b0Var11.b(aq.a.class), null, null), (pm.c) viewModel.f(b0Var11.b(pm.c.class), null, null));
                            default:
                                return Integer.valueOf(((p1) obj3).a.h());
                        }
                    }
                }, cVar10)));
                return b0Var;
            case 20:
                v AnimatedContent = (v) obj;
                m.e(AnimatedContent, "$this$AnimatedContent");
                b1 b1VarV = x.c.v(0.0f, 400.0f, (Object) null, 5);
                e6.c cVar12 = new e6.c(4);
                r1 r1Var = s0.a;
                return w.m.d(new x0(new g2((w.z0) null, new d2(new r0(2, cVar12), b1VarV), (i0) null, (d1) null, (LinkedHashMap) null, 125)).a(s0.c((y) null, 3)), new y0(new g2((w.z0) null, new d2(new r0(4, new a(21)), x.c.v(0.0f, 400.0f, (Object) null, 5)), (i0) null, (d1) null, (LinkedHashMap) null, 125)).a(s0.d((y) null, 3)));
            case 21:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 22:
                bx.c it = (bx.c) obj;
                m.e(it, "it");
                return Integer.valueOf(it.a);
            case 23:
                y50.a module5 = (y50.a) obj;
                m.e(module5, "$this$module");
                final int i25 = 5;
                u00.n nVar3 = new u00.n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i25) {
                            case 0:
                                e60.a factory = (e60.a) obj2;
                                a60.a it2 = (a60.a) obj3;
                                m.e(factory, "$this$factory");
                                m.e(it2, "it");
                                kotlin.jvm.internal.b0 b0Var7 = a0.a;
                                return new uq.b((vq.a) factory.f(b0Var7.b(vq.a.class), null, null), (rq.b) factory.f(b0Var7.b(rq.b.class), null, null));
                            case 1:
                                e60.a single = (e60.a) obj2;
                                a60.a it3 = (a60.a) obj3;
                                m.e(single, "$this$single");
                                m.e(it3, "it");
                                r rVarX = bi.b.x(t1.h(single), FavoritesDatabase.class, "favorites_database");
                                rVarX.a(new fa.a[]{FavoritesDatabase.m, FavoritesDatabase.l});
                                return (FavoritesDatabase) rVarX.b();
                            case 2:
                                e60.a single2 = (e60.a) obj2;
                                a60.a it4 = (a60.a) obj3;
                                m.e(single2, "$this$single");
                                m.e(it4, "it");
                                return ((FavoritesDatabase) single2.f(a0.a.b(FavoritesDatabase.class), null, null)).r();
                            case 3:
                                e60.a single3 = (e60.a) obj2;
                                a60.a it5 = (a60.a) obj3;
                                m.e(single3, "$this$single");
                                m.e(it5, "it");
                                kotlin.jvm.internal.b0 b0Var8 = a0.a;
                                return new tq.k((uq.b) single3.f(b0Var8.b(uq.b.class), null, null), (rq.b) single3.f(b0Var8.b(rq.b.class), null, null), (DataStore) single3.f(b0Var8.b(DataStore.class), null, new b60.b("FAVORITE_RECITER_STORE_SCOPE_KEY")), (rq.a) single3.f(b0Var8.b(rq.a.class), null, null));
                            case 4:
                                v predictivePopTransitionSpec = (v) obj2;
                                ((Integer) obj3).getClass();
                                m.e(predictivePopTransitionSpec, "$this$predictivePopTransitionSpec");
                                return w.m.d(s0.c((y) null, 3), s0.k(new c(4)));
                            case 5:
                                e60.a single4 = (e60.a) obj2;
                                a60.a it6 = (a60.a) obj3;
                                m.e(single4, "$this$single");
                                m.e(it6, "it");
                                Application applicationH = t1.h(single4);
                                kotlin.jvm.internal.b0 b0Var9 = a0.a;
                                return new zx.b(applicationH, (bk.m) single4.f(b0Var9.b(bk.m.class), null, null), (LocaleManager) single4.f(b0Var9.b(LocaleManager.class), null, null));
                            case 6:
                                e60.a single5 = (e60.a) obj2;
                                a60.a it7 = (a60.a) obj3;
                                m.e(single5, "$this$single");
                                m.e(it7, "it");
                                b60.b bVar9 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var10 = a0.a;
                                return new xx.c((SharedPreferences) single5.f(b0Var10.b(SharedPreferences.class), null, bVar9), (bk.m) single5.f(b0Var10.b(bk.m.class), null, null));
                            case 7:
                                a60.a it8 = (a60.a) obj3;
                                m.e((e60.a) obj2, "$this$single");
                                m.e(it8, "it");
                                return new ey.a();
                            case 8:
                                a60.a it9 = (a60.a) obj3;
                                m.e((e60.a) obj2, "$this$single");
                                m.e(it9, "it");
                                return new ey.b();
                            case 9:
                                e60.a viewModel = (e60.a) obj2;
                                a60.a it10 = (a60.a) obj3;
                                m.e(viewModel, "$this$viewModel");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var11 = a0.a;
                                return new c0((xw.k) viewModel.f(b0Var11.b(xw.k.class), null, null), (xv.c) viewModel.f(b0Var11.b(xv.c.class), null, null), (xx.c) viewModel.f(b0Var11.b(xx.c.class), null, null), (zx.b) viewModel.f(b0Var11.b(zx.b.class), null, null), (au.a) viewModel.f(b0Var11.b(au.a.class), null, null), (zt.a) viewModel.f(b0Var11.b(zt.a.class), null, null), (vp.x) viewModel.f(b0Var11.b(vp.x.class), null, null), (tq.k) viewModel.f(b0Var11.b(tq.k.class), null, null), (uu.a) viewModel.f(b0Var11.b(uu.a.class), null, null), (aq.a) viewModel.f(b0Var11.b(aq.a.class), null, null), (pm.c) viewModel.f(b0Var11.b(pm.c.class), null, null));
                            default:
                                return Integer.valueOf(((p1) obj3).a.h());
                        }
                    }
                };
                v50.c cVar13 = v50.c.A;
                kotlin.jvm.internal.b0 b0Var7 = a0.a;
                a10.d dVarB5 = b0Var7.b(zx.b.class);
                b60.b bVar9 = c60.a.e;
                module5.a(new w50.e(new v50.a(bVar9, dVarB5, null, nVar3, cVar13)));
                final int i26 = 6;
                module5.a(new w50.e(new v50.a(bVar9, b0Var7.b(xx.c.class), null, new u00.n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i26) {
                            case 0:
                                e60.a factory = (e60.a) obj2;
                                a60.a it2 = (a60.a) obj3;
                                m.e(factory, "$this$factory");
                                m.e(it2, "it");
                                kotlin.jvm.internal.b0 b0Var8 = a0.a;
                                return new uq.b((vq.a) factory.f(b0Var8.b(vq.a.class), null, null), (rq.b) factory.f(b0Var8.b(rq.b.class), null, null));
                            case 1:
                                e60.a single = (e60.a) obj2;
                                a60.a it3 = (a60.a) obj3;
                                m.e(single, "$this$single");
                                m.e(it3, "it");
                                r rVarX = bi.b.x(t1.h(single), FavoritesDatabase.class, "favorites_database");
                                rVarX.a(new fa.a[]{FavoritesDatabase.m, FavoritesDatabase.l});
                                return (FavoritesDatabase) rVarX.b();
                            case 2:
                                e60.a single2 = (e60.a) obj2;
                                a60.a it4 = (a60.a) obj3;
                                m.e(single2, "$this$single");
                                m.e(it4, "it");
                                return ((FavoritesDatabase) single2.f(a0.a.b(FavoritesDatabase.class), null, null)).r();
                            case 3:
                                e60.a single3 = (e60.a) obj2;
                                a60.a it5 = (a60.a) obj3;
                                m.e(single3, "$this$single");
                                m.e(it5, "it");
                                kotlin.jvm.internal.b0 b0Var9 = a0.a;
                                return new tq.k((uq.b) single3.f(b0Var9.b(uq.b.class), null, null), (rq.b) single3.f(b0Var9.b(rq.b.class), null, null), (DataStore) single3.f(b0Var9.b(DataStore.class), null, new b60.b("FAVORITE_RECITER_STORE_SCOPE_KEY")), (rq.a) single3.f(b0Var9.b(rq.a.class), null, null));
                            case 4:
                                v predictivePopTransitionSpec = (v) obj2;
                                ((Integer) obj3).getClass();
                                m.e(predictivePopTransitionSpec, "$this$predictivePopTransitionSpec");
                                return w.m.d(s0.c((y) null, 3), s0.k(new c(4)));
                            case 5:
                                e60.a single4 = (e60.a) obj2;
                                a60.a it6 = (a60.a) obj3;
                                m.e(single4, "$this$single");
                                m.e(it6, "it");
                                Application applicationH = t1.h(single4);
                                kotlin.jvm.internal.b0 b0Var10 = a0.a;
                                return new zx.b(applicationH, (bk.m) single4.f(b0Var10.b(bk.m.class), null, null), (LocaleManager) single4.f(b0Var10.b(LocaleManager.class), null, null));
                            case 6:
                                e60.a single5 = (e60.a) obj2;
                                a60.a it7 = (a60.a) obj3;
                                m.e(single5, "$this$single");
                                m.e(it7, "it");
                                b60.b bVar10 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var11 = a0.a;
                                return new xx.c((SharedPreferences) single5.f(b0Var11.b(SharedPreferences.class), null, bVar10), (bk.m) single5.f(b0Var11.b(bk.m.class), null, null));
                            case 7:
                                a60.a it8 = (a60.a) obj3;
                                m.e((e60.a) obj2, "$this$single");
                                m.e(it8, "it");
                                return new ey.a();
                            case 8:
                                a60.a it9 = (a60.a) obj3;
                                m.e((e60.a) obj2, "$this$single");
                                m.e(it9, "it");
                                return new ey.b();
                            case 9:
                                e60.a viewModel = (e60.a) obj2;
                                a60.a it10 = (a60.a) obj3;
                                m.e(viewModel, "$this$viewModel");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var12 = a0.a;
                                return new c0((xw.k) viewModel.f(b0Var12.b(xw.k.class), null, null), (xv.c) viewModel.f(b0Var12.b(xv.c.class), null, null), (xx.c) viewModel.f(b0Var12.b(xx.c.class), null, null), (zx.b) viewModel.f(b0Var12.b(zx.b.class), null, null), (au.a) viewModel.f(b0Var12.b(au.a.class), null, null), (zt.a) viewModel.f(b0Var12.b(zt.a.class), null, null), (vp.x) viewModel.f(b0Var12.b(vp.x.class), null, null), (tq.k) viewModel.f(b0Var12.b(tq.k.class), null, null), (uu.a) viewModel.f(b0Var12.b(uu.a.class), null, null), (aq.a) viewModel.f(b0Var12.b(aq.a.class), null, null), (pm.c) viewModel.f(b0Var12.b(pm.c.class), null, null));
                            default:
                                return Integer.valueOf(((p1) obj3).a.h());
                        }
                    }
                }, cVar13)));
                final int i27 = 7;
                module5.a(new w50.e(new v50.a(bVar9, b0Var7.b(ey.a.class), null, new u00.n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i27) {
                            case 0:
                                e60.a factory = (e60.a) obj2;
                                a60.a it2 = (a60.a) obj3;
                                m.e(factory, "$this$factory");
                                m.e(it2, "it");
                                kotlin.jvm.internal.b0 b0Var8 = a0.a;
                                return new uq.b((vq.a) factory.f(b0Var8.b(vq.a.class), null, null), (rq.b) factory.f(b0Var8.b(rq.b.class), null, null));
                            case 1:
                                e60.a single = (e60.a) obj2;
                                a60.a it3 = (a60.a) obj3;
                                m.e(single, "$this$single");
                                m.e(it3, "it");
                                r rVarX = bi.b.x(t1.h(single), FavoritesDatabase.class, "favorites_database");
                                rVarX.a(new fa.a[]{FavoritesDatabase.m, FavoritesDatabase.l});
                                return (FavoritesDatabase) rVarX.b();
                            case 2:
                                e60.a single2 = (e60.a) obj2;
                                a60.a it4 = (a60.a) obj3;
                                m.e(single2, "$this$single");
                                m.e(it4, "it");
                                return ((FavoritesDatabase) single2.f(a0.a.b(FavoritesDatabase.class), null, null)).r();
                            case 3:
                                e60.a single3 = (e60.a) obj2;
                                a60.a it5 = (a60.a) obj3;
                                m.e(single3, "$this$single");
                                m.e(it5, "it");
                                kotlin.jvm.internal.b0 b0Var9 = a0.a;
                                return new tq.k((uq.b) single3.f(b0Var9.b(uq.b.class), null, null), (rq.b) single3.f(b0Var9.b(rq.b.class), null, null), (DataStore) single3.f(b0Var9.b(DataStore.class), null, new b60.b("FAVORITE_RECITER_STORE_SCOPE_KEY")), (rq.a) single3.f(b0Var9.b(rq.a.class), null, null));
                            case 4:
                                v predictivePopTransitionSpec = (v) obj2;
                                ((Integer) obj3).getClass();
                                m.e(predictivePopTransitionSpec, "$this$predictivePopTransitionSpec");
                                return w.m.d(s0.c((y) null, 3), s0.k(new c(4)));
                            case 5:
                                e60.a single4 = (e60.a) obj2;
                                a60.a it6 = (a60.a) obj3;
                                m.e(single4, "$this$single");
                                m.e(it6, "it");
                                Application applicationH = t1.h(single4);
                                kotlin.jvm.internal.b0 b0Var10 = a0.a;
                                return new zx.b(applicationH, (bk.m) single4.f(b0Var10.b(bk.m.class), null, null), (LocaleManager) single4.f(b0Var10.b(LocaleManager.class), null, null));
                            case 6:
                                e60.a single5 = (e60.a) obj2;
                                a60.a it7 = (a60.a) obj3;
                                m.e(single5, "$this$single");
                                m.e(it7, "it");
                                b60.b bVar10 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var11 = a0.a;
                                return new xx.c((SharedPreferences) single5.f(b0Var11.b(SharedPreferences.class), null, bVar10), (bk.m) single5.f(b0Var11.b(bk.m.class), null, null));
                            case 7:
                                a60.a it8 = (a60.a) obj3;
                                m.e((e60.a) obj2, "$this$single");
                                m.e(it8, "it");
                                return new ey.a();
                            case 8:
                                a60.a it9 = (a60.a) obj3;
                                m.e((e60.a) obj2, "$this$single");
                                m.e(it9, "it");
                                return new ey.b();
                            case 9:
                                e60.a viewModel = (e60.a) obj2;
                                a60.a it10 = (a60.a) obj3;
                                m.e(viewModel, "$this$viewModel");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var12 = a0.a;
                                return new c0((xw.k) viewModel.f(b0Var12.b(xw.k.class), null, null), (xv.c) viewModel.f(b0Var12.b(xv.c.class), null, null), (xx.c) viewModel.f(b0Var12.b(xx.c.class), null, null), (zx.b) viewModel.f(b0Var12.b(zx.b.class), null, null), (au.a) viewModel.f(b0Var12.b(au.a.class), null, null), (zt.a) viewModel.f(b0Var12.b(zt.a.class), null, null), (vp.x) viewModel.f(b0Var12.b(vp.x.class), null, null), (tq.k) viewModel.f(b0Var12.b(tq.k.class), null, null), (uu.a) viewModel.f(b0Var12.b(uu.a.class), null, null), (aq.a) viewModel.f(b0Var12.b(aq.a.class), null, null), (pm.c) viewModel.f(b0Var12.b(pm.c.class), null, null));
                            default:
                                return Integer.valueOf(((p1) obj3).a.h());
                        }
                    }
                }, cVar13)));
                final int i28 = 8;
                module5.a(new w50.e(new v50.a(bVar9, b0Var7.b(ey.b.class), null, new u00.n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i28) {
                            case 0:
                                e60.a factory = (e60.a) obj2;
                                a60.a it2 = (a60.a) obj3;
                                m.e(factory, "$this$factory");
                                m.e(it2, "it");
                                kotlin.jvm.internal.b0 b0Var8 = a0.a;
                                return new uq.b((vq.a) factory.f(b0Var8.b(vq.a.class), null, null), (rq.b) factory.f(b0Var8.b(rq.b.class), null, null));
                            case 1:
                                e60.a single = (e60.a) obj2;
                                a60.a it3 = (a60.a) obj3;
                                m.e(single, "$this$single");
                                m.e(it3, "it");
                                r rVarX = bi.b.x(t1.h(single), FavoritesDatabase.class, "favorites_database");
                                rVarX.a(new fa.a[]{FavoritesDatabase.m, FavoritesDatabase.l});
                                return (FavoritesDatabase) rVarX.b();
                            case 2:
                                e60.a single2 = (e60.a) obj2;
                                a60.a it4 = (a60.a) obj3;
                                m.e(single2, "$this$single");
                                m.e(it4, "it");
                                return ((FavoritesDatabase) single2.f(a0.a.b(FavoritesDatabase.class), null, null)).r();
                            case 3:
                                e60.a single3 = (e60.a) obj2;
                                a60.a it5 = (a60.a) obj3;
                                m.e(single3, "$this$single");
                                m.e(it5, "it");
                                kotlin.jvm.internal.b0 b0Var9 = a0.a;
                                return new tq.k((uq.b) single3.f(b0Var9.b(uq.b.class), null, null), (rq.b) single3.f(b0Var9.b(rq.b.class), null, null), (DataStore) single3.f(b0Var9.b(DataStore.class), null, new b60.b("FAVORITE_RECITER_STORE_SCOPE_KEY")), (rq.a) single3.f(b0Var9.b(rq.a.class), null, null));
                            case 4:
                                v predictivePopTransitionSpec = (v) obj2;
                                ((Integer) obj3).getClass();
                                m.e(predictivePopTransitionSpec, "$this$predictivePopTransitionSpec");
                                return w.m.d(s0.c((y) null, 3), s0.k(new c(4)));
                            case 5:
                                e60.a single4 = (e60.a) obj2;
                                a60.a it6 = (a60.a) obj3;
                                m.e(single4, "$this$single");
                                m.e(it6, "it");
                                Application applicationH = t1.h(single4);
                                kotlin.jvm.internal.b0 b0Var10 = a0.a;
                                return new zx.b(applicationH, (bk.m) single4.f(b0Var10.b(bk.m.class), null, null), (LocaleManager) single4.f(b0Var10.b(LocaleManager.class), null, null));
                            case 6:
                                e60.a single5 = (e60.a) obj2;
                                a60.a it7 = (a60.a) obj3;
                                m.e(single5, "$this$single");
                                m.e(it7, "it");
                                b60.b bVar10 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var11 = a0.a;
                                return new xx.c((SharedPreferences) single5.f(b0Var11.b(SharedPreferences.class), null, bVar10), (bk.m) single5.f(b0Var11.b(bk.m.class), null, null));
                            case 7:
                                a60.a it8 = (a60.a) obj3;
                                m.e((e60.a) obj2, "$this$single");
                                m.e(it8, "it");
                                return new ey.a();
                            case 8:
                                a60.a it9 = (a60.a) obj3;
                                m.e((e60.a) obj2, "$this$single");
                                m.e(it9, "it");
                                return new ey.b();
                            case 9:
                                e60.a viewModel = (e60.a) obj2;
                                a60.a it10 = (a60.a) obj3;
                                m.e(viewModel, "$this$viewModel");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var12 = a0.a;
                                return new c0((xw.k) viewModel.f(b0Var12.b(xw.k.class), null, null), (xv.c) viewModel.f(b0Var12.b(xv.c.class), null, null), (xx.c) viewModel.f(b0Var12.b(xx.c.class), null, null), (zx.b) viewModel.f(b0Var12.b(zx.b.class), null, null), (au.a) viewModel.f(b0Var12.b(au.a.class), null, null), (zt.a) viewModel.f(b0Var12.b(zt.a.class), null, null), (vp.x) viewModel.f(b0Var12.b(vp.x.class), null, null), (tq.k) viewModel.f(b0Var12.b(tq.k.class), null, null), (uu.a) viewModel.f(b0Var12.b(uu.a.class), null, null), (aq.a) viewModel.f(b0Var12.b(aq.a.class), null, null), (pm.c) viewModel.f(b0Var12.b(pm.c.class), null, null));
                            default:
                                return Integer.valueOf(((p1) obj3).a.h());
                        }
                    }
                }, cVar13)));
                final int i29 = 9;
                module5.a(new w50.a(new v50.a(bVar9, b0Var7.b(c0.class), null, new u00.n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i29) {
                            case 0:
                                e60.a factory = (e60.a) obj2;
                                a60.a it2 = (a60.a) obj3;
                                m.e(factory, "$this$factory");
                                m.e(it2, "it");
                                kotlin.jvm.internal.b0 b0Var8 = a0.a;
                                return new uq.b((vq.a) factory.f(b0Var8.b(vq.a.class), null, null), (rq.b) factory.f(b0Var8.b(rq.b.class), null, null));
                            case 1:
                                e60.a single = (e60.a) obj2;
                                a60.a it3 = (a60.a) obj3;
                                m.e(single, "$this$single");
                                m.e(it3, "it");
                                r rVarX = bi.b.x(t1.h(single), FavoritesDatabase.class, "favorites_database");
                                rVarX.a(new fa.a[]{FavoritesDatabase.m, FavoritesDatabase.l});
                                return (FavoritesDatabase) rVarX.b();
                            case 2:
                                e60.a single2 = (e60.a) obj2;
                                a60.a it4 = (a60.a) obj3;
                                m.e(single2, "$this$single");
                                m.e(it4, "it");
                                return ((FavoritesDatabase) single2.f(a0.a.b(FavoritesDatabase.class), null, null)).r();
                            case 3:
                                e60.a single3 = (e60.a) obj2;
                                a60.a it5 = (a60.a) obj3;
                                m.e(single3, "$this$single");
                                m.e(it5, "it");
                                kotlin.jvm.internal.b0 b0Var9 = a0.a;
                                return new tq.k((uq.b) single3.f(b0Var9.b(uq.b.class), null, null), (rq.b) single3.f(b0Var9.b(rq.b.class), null, null), (DataStore) single3.f(b0Var9.b(DataStore.class), null, new b60.b("FAVORITE_RECITER_STORE_SCOPE_KEY")), (rq.a) single3.f(b0Var9.b(rq.a.class), null, null));
                            case 4:
                                v predictivePopTransitionSpec = (v) obj2;
                                ((Integer) obj3).getClass();
                                m.e(predictivePopTransitionSpec, "$this$predictivePopTransitionSpec");
                                return w.m.d(s0.c((y) null, 3), s0.k(new c(4)));
                            case 5:
                                e60.a single4 = (e60.a) obj2;
                                a60.a it6 = (a60.a) obj3;
                                m.e(single4, "$this$single");
                                m.e(it6, "it");
                                Application applicationH = t1.h(single4);
                                kotlin.jvm.internal.b0 b0Var10 = a0.a;
                                return new zx.b(applicationH, (bk.m) single4.f(b0Var10.b(bk.m.class), null, null), (LocaleManager) single4.f(b0Var10.b(LocaleManager.class), null, null));
                            case 6:
                                e60.a single5 = (e60.a) obj2;
                                a60.a it7 = (a60.a) obj3;
                                m.e(single5, "$this$single");
                                m.e(it7, "it");
                                b60.b bVar10 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var11 = a0.a;
                                return new xx.c((SharedPreferences) single5.f(b0Var11.b(SharedPreferences.class), null, bVar10), (bk.m) single5.f(b0Var11.b(bk.m.class), null, null));
                            case 7:
                                a60.a it8 = (a60.a) obj3;
                                m.e((e60.a) obj2, "$this$single");
                                m.e(it8, "it");
                                return new ey.a();
                            case 8:
                                a60.a it9 = (a60.a) obj3;
                                m.e((e60.a) obj2, "$this$single");
                                m.e(it9, "it");
                                return new ey.b();
                            case 9:
                                e60.a viewModel = (e60.a) obj2;
                                a60.a it10 = (a60.a) obj3;
                                m.e(viewModel, "$this$viewModel");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var12 = a0.a;
                                return new c0((xw.k) viewModel.f(b0Var12.b(xw.k.class), null, null), (xv.c) viewModel.f(b0Var12.b(xv.c.class), null, null), (xx.c) viewModel.f(b0Var12.b(xx.c.class), null, null), (zx.b) viewModel.f(b0Var12.b(zx.b.class), null, null), (au.a) viewModel.f(b0Var12.b(au.a.class), null, null), (zt.a) viewModel.f(b0Var12.b(zt.a.class), null, null), (vp.x) viewModel.f(b0Var12.b(vp.x.class), null, null), (tq.k) viewModel.f(b0Var12.b(tq.k.class), null, null), (uu.a) viewModel.f(b0Var12.b(uu.a.class), null, null), (aq.a) viewModel.f(b0Var12.b(aq.a.class), null, null), (pm.c) viewModel.f(b0Var12.b(pm.c.class), null, null));
                            default:
                                return Integer.valueOf(((p1) obj3).a.h());
                        }
                    }
                }, v50.c.B)));
                module5.b(new b60.b("SEARCH_SCOPE_KEY"), new a(25));
                return b0Var;
            case 24:
                f60.a aVar3 = (f60.a) obj;
                m.e(aVar3, "<this>");
                kotlin.jvm.internal.b0 b0Var8 = a0.a;
                aVar3.b.a(new w50.d(new v50.a(aVar3.a, b0Var8.b(k.class), new b60.c(b0Var8.b(SearchTabRoute$SearchScreen.class)), new yx.e(), v50.c.C)));
                return b0Var;
            case 25:
                f60.a scope2 = (f60.a) obj;
                m.e(scope2, "$this$scope");
                LinkedHashMap linkedHashMapU = d0.U(d0.U(d0.Q(new g00.k("transitionSpec", new a(i4))), d0.Q(new g00.k("popTransitionSpec", new a(i3)))), d0.Q(new g00.k("predictivePopTransitionSpec", new u00.n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i6) {
                            case 0:
                                e60.a factory = (e60.a) obj2;
                                a60.a it2 = (a60.a) obj3;
                                m.e(factory, "$this$factory");
                                m.e(it2, "it");
                                kotlin.jvm.internal.b0 b0Var9 = a0.a;
                                return new uq.b((vq.a) factory.f(b0Var9.b(vq.a.class), null, null), (rq.b) factory.f(b0Var9.b(rq.b.class), null, null));
                            case 1:
                                e60.a single = (e60.a) obj2;
                                a60.a it3 = (a60.a) obj3;
                                m.e(single, "$this$single");
                                m.e(it3, "it");
                                r rVarX = bi.b.x(t1.h(single), FavoritesDatabase.class, "favorites_database");
                                rVarX.a(new fa.a[]{FavoritesDatabase.m, FavoritesDatabase.l});
                                return (FavoritesDatabase) rVarX.b();
                            case 2:
                                e60.a single2 = (e60.a) obj2;
                                a60.a it4 = (a60.a) obj3;
                                m.e(single2, "$this$single");
                                m.e(it4, "it");
                                return ((FavoritesDatabase) single2.f(a0.a.b(FavoritesDatabase.class), null, null)).r();
                            case 3:
                                e60.a single3 = (e60.a) obj2;
                                a60.a it5 = (a60.a) obj3;
                                m.e(single3, "$this$single");
                                m.e(it5, "it");
                                kotlin.jvm.internal.b0 b0Var10 = a0.a;
                                return new tq.k((uq.b) single3.f(b0Var10.b(uq.b.class), null, null), (rq.b) single3.f(b0Var10.b(rq.b.class), null, null), (DataStore) single3.f(b0Var10.b(DataStore.class), null, new b60.b("FAVORITE_RECITER_STORE_SCOPE_KEY")), (rq.a) single3.f(b0Var10.b(rq.a.class), null, null));
                            case 4:
                                v predictivePopTransitionSpec = (v) obj2;
                                ((Integer) obj3).getClass();
                                m.e(predictivePopTransitionSpec, "$this$predictivePopTransitionSpec");
                                return w.m.d(s0.c((y) null, 3), s0.k(new c(4)));
                            case 5:
                                e60.a single4 = (e60.a) obj2;
                                a60.a it6 = (a60.a) obj3;
                                m.e(single4, "$this$single");
                                m.e(it6, "it");
                                Application applicationH = t1.h(single4);
                                kotlin.jvm.internal.b0 b0Var11 = a0.a;
                                return new zx.b(applicationH, (bk.m) single4.f(b0Var11.b(bk.m.class), null, null), (LocaleManager) single4.f(b0Var11.b(LocaleManager.class), null, null));
                            case 6:
                                e60.a single5 = (e60.a) obj2;
                                a60.a it7 = (a60.a) obj3;
                                m.e(single5, "$this$single");
                                m.e(it7, "it");
                                b60.b bVar10 = new b60.b("default_shared_preferences");
                                kotlin.jvm.internal.b0 b0Var12 = a0.a;
                                return new xx.c((SharedPreferences) single5.f(b0Var12.b(SharedPreferences.class), null, bVar10), (bk.m) single5.f(b0Var12.b(bk.m.class), null, null));
                            case 7:
                                a60.a it8 = (a60.a) obj3;
                                m.e((e60.a) obj2, "$this$single");
                                m.e(it8, "it");
                                return new ey.a();
                            case 8:
                                a60.a it9 = (a60.a) obj3;
                                m.e((e60.a) obj2, "$this$single");
                                m.e(it9, "it");
                                return new ey.b();
                            case 9:
                                e60.a viewModel = (e60.a) obj2;
                                a60.a it10 = (a60.a) obj3;
                                m.e(viewModel, "$this$viewModel");
                                m.e(it10, "it");
                                kotlin.jvm.internal.b0 b0Var13 = a0.a;
                                return new c0((xw.k) viewModel.f(b0Var13.b(xw.k.class), null, null), (xv.c) viewModel.f(b0Var13.b(xv.c.class), null, null), (xx.c) viewModel.f(b0Var13.b(xx.c.class), null, null), (zx.b) viewModel.f(b0Var13.b(zx.b.class), null, null), (au.a) viewModel.f(b0Var13.b(au.a.class), null, null), (zt.a) viewModel.f(b0Var13.b(zt.a.class), null, null), (vp.x) viewModel.f(b0Var13.b(vp.x.class), null, null), (tq.k) viewModel.f(b0Var13.b(tq.k.class), null, null), (uu.a) viewModel.f(b0Var13.b(uu.a.class), null, null), (aq.a) viewModel.f(b0Var13.b(aq.a.class), null, null), (pm.c) viewModel.f(b0Var13.b(pm.c.class), null, null));
                            default:
                                return Integer.valueOf(((p1) obj3).a.h());
                        }
                    }
                })));
                kotlin.jvm.internal.b0 b0Var9 = a0.a;
                b60.c cVar14 = new b60.c(b0Var9.b(SearchRoute$SearchScreen.class));
                ax.g gVar = new ax.g(linkedHashMapU, i2);
                b60.b bVar10 = scope2.a;
                v50.c cVar15 = v50.c.C;
                w50.d dVar2 = new w50.d(new v50.a(bVar10, b0Var9.b(k.class), cVar14, gVar, cVar15));
                y50.a aVar4 = scope2.b;
                aVar4.a(dVar2);
                aVar4.a(new w50.d(new v50.a(bVar10, b0Var9.b(k.class), new b60.c(b0Var9.b(ReciterRoute$ReciterScreen.class)), new yx.d(linkedHashMapU, z ? 1 : 0), cVar15)));
                aVar4.a(new w50.d(new v50.a(bVar10, b0Var9.b(k.class), new b60.c(b0Var9.b(SearchRoute$PlaylistScreen.class)), new yx.d(linkedHashMapU, 1), cVar15)));
                return b0Var;
            case 26:
                v transitionSpec = (v) obj;
                m.e(transitionSpec, "$this$transitionSpec");
                return w.m.d(s0.i(new e6.c(4)), s0.d((y) null, 3));
            case 27:
                v popTransitionSpec = (v) obj;
                m.e(popTransitionSpec, "$this$popTransitionSpec");
                return w.m.d(s0.c((y) null, 3), s0.k(new e6.c(4)));
            case 28:
                ((o0) obj).a();
                return b0Var;
            default:
                return b0Var;
        }
    }
}
