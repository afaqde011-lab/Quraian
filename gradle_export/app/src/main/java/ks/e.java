package ks;

import androidx.media3.common.f1;
import androidx.media3.ui.PlayerView;
import b3.j0;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import g00.b0;
import g1.l0;
import i2.c0;
import java.util.ArrayList;
import java.util.List;
import k0.u;
import kotlin.jvm.internal.a0;
import l1.b1;
import m3.s;
import m3.v;
import qd.s0;

public final class e implements u00.k {
    public final int A;

    public e(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj) throws Exception {
        int i = this.A;
        int i2 = 2;
        int i3 = 0;
        int i4 = 1;
        b0 b0Var = b0.a;
        switch (i) {
            case 0:
                ma.a _connection = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection, "_connection");
                ma.c cVarK0 = _connection.k0("DELETE FROM listening_hour_stat_data");
                try {
                    cVarK0.d0();
                    return b0Var;
                } finally {
                    cVarK0.close();
                }
            case 1:
                ma.a _connection2 = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection2, "_connection");
                ma.c cVarK1 = _connection2.k0("DELETE FROM listening_hour_background_sound_stat_data");
                try {
                    cVarK1.d0();
                    return b0Var;
                } finally {
                    cVarK1.close();
                }
            case 2:
                ma.a _connection3 = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection3, "_connection");
                ma.c cVarK2 = _connection3.k0("SELECT * FROM listening_hour_background_sound_stat_data ORDER BY updatedAt DESC");
                try {
                    int I = w50.c.I(cVarK2, SubscriberAttributeKt.JSON_NAME_KEY);
                    int I2 = w50.c.I(cVarK2, "dayStart");
                    int I3 = w50.c.I(cVarK2, "hour");
                    int I4 = w50.c.I(cVarK2, "soundId");
                    int I5 = w50.c.I(cVarK2, "seconds");
                    int I6 = w50.c.I(cVarK2, "avgVolumeTimes1000");
                    int I7 = w50.c.I(cVarK2, "updatedAt");
                    ArrayList arrayList = new ArrayList();
                    while (cVarK2.d0()) {
                        arrayList.add(new gs.d(cVarK2.R(I), cVarK2.getLong(I2), (int) cVarK2.getLong(I3), cVarK2.R(I4), (int) cVarK2.getLong(I5), cVarK2.isNull(I6) ? null : Integer.valueOf((int) cVarK2.getLong(I6)), cVarK2.getLong(I7)));
                        I = I;
                        I2 = I2;
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarK2.close();
                }
            case 3:
                ma.a _connection4 = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection4, "_connection");
                ma.c cVarK3 = _connection4.k0("SELECT * FROM listening_event_queue ORDER BY id ASC");
                try {
                    int I8 = w50.c.I(cVarK3, DiagnosticsEntry.ID_KEY);
                    int I9 = w50.c.I(cVarK3, "event_id");
                    int I10 = w50.c.I(cVarK3, "session_id");
                    int I11 = w50.c.I(cVarK3, "track_id");
                    int I12 = w50.c.I(cVarK3, "event_type");
                    int I13 = w50.c.I(cVarK3, "position_ms");
                    int I14 = w50.c.I(cVarK3, "listened_ms");
                    int I15 = w50.c.I(cVarK3, "utc_offset_minutes");
                    int I16 = w50.c.I(cVarK3, "occurred_at");
                    int I17 = w50.c.I(cVarK3, "background_sound_id");
                    int I18 = w50.c.I(cVarK3, "background_volume_times_1000");
                    int I19 = w50.c.I(cVarK3, "reciter_id");
                    int I20 = w50.c.I(cVarK3, "surah_number");
                    int I21 = w50.c.I(cVarK3, "recorded_elapsed_ms");
                    int I22 = w50.c.I(cVarK3, "boot_count");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarK3.d0()) {
                        long j = cVarK3.getLong(I8);
                        String strR = cVarK3.R(I9);
                        int i5 = I9;
                        int i6 = I10;
                        int i7 = I22;
                        arrayList2.add(new gs.e(j, strR, cVarK3.R(I10), cVarK3.getLong(I11), cVarK3.R(I12), cVarK3.getLong(I13), (int) cVarK3.getLong(I14), (int) cVarK3.getLong(I15), cVarK3.R(I16), cVarK3.isNull(I17) ? null : cVarK3.R(I17), cVarK3.isNull(I18) ? null : Integer.valueOf((int) cVarK3.getLong(I18)), cVarK3.isNull(I19) ? null : Integer.valueOf((int) cVarK3.getLong(I19)), cVarK3.isNull(I20) ? null : Integer.valueOf((int) cVarK3.getLong(I20)), cVarK3.isNull(I21) ? null : Long.valueOf(cVarK3.getLong(I21)), cVarK3.isNull(i7) ? null : Integer.valueOf((int) cVarK3.getLong(i7))));
                        I11 = I11;
                        I22 = i7;
                        I9 = i5;
                        I10 = i6;
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarK3.close();
                }
            case 4:
                ma.a _connection5 = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection5, "_connection");
                ma.c cVarK4 = _connection5.k0("SELECT COUNT(*) FROM listening_event_queue");
                try {
                    return Integer.valueOf(cVarK4.d0() ? (int) cVarK4.getLong(0) : 0);
                } finally {
                    cVarK4.close();
                }
            case 5:
                ma.a _connection6 = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection6, "_connection");
                ma.c cVarK5 = _connection6.k0("DELETE FROM listening_event_queue");
                try {
                    cVarK5.d0();
                    return b0Var;
                } finally {
                    cVarK5.close();
                }
            case 6:
                ma.a _connection7 = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection7, "_connection");
                ma.c cVarK6 = _connection7.k0("SELECT * FROM listening_summary");
                try {
                    int I23 = w50.c.I(cVarK6, "history_days");
                    int I24 = w50.c.I(cVarK6, "summary");
                    int I25 = w50.c.I(cVarK6, "saved_at");
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarK6.d0()) {
                        arrayList3.add(new gs.g(cVarK6.R(I24), cVarK6.getLong(I25), (int) cVarK6.getLong(I23)));
                    }
                    cVarK6.close();
                    return arrayList3;
                } catch (Throwable th) {
                    cVarK6.close();
                    throw th;
                }
            case 7:
                ma.a _connection8 = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection8, "_connection");
                ma.c cVarK7 = _connection8.k0("UPDATE listening_summary SET saved_at = 0");
                try {
                    cVarK7.d0();
                    return b0Var;
                } finally {
                    cVarK7.close();
                }
            case 8:
                ma.a _connection9 = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection9, "_connection");
                ma.c cVarK8 = _connection9.k0("DELETE FROM listening_summary");
                try {
                    cVarK8.d0();
                    return b0Var;
                } finally {
                    cVarK8.close();
                }
            case 9:
                ma.a _connection10 = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection10, "_connection");
                ma.c cVarK9 = _connection10.k0("DELETE FROM listening_year");
                try {
                    cVarK9.d0();
                    return b0Var;
                } finally {
                    cVarK9.close();
                }
            case 10:
                ma.a _connection11 = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection11, "_connection");
                ma.c cVarK10 = _connection11.k0("UPDATE listening_year SET saved_at = 0");
                try {
                    cVarK10.d0();
                    return b0Var;
                } finally {
                    cVarK10.close();
                }
            case 11:
                ma.a _connection12 = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection12, "_connection");
                ma.c cVarK11 = _connection12.k0("DELETE FROM streak_info_data");
                try {
                    cVarK11.d0();
                    return b0Var;
                } finally {
                    cVarK11.close();
                }
            case 12:
                ma.a _connection13 = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection13, "_connection");
                ma.c cVarK12 = _connection13.k0("SELECT * FROM streak_info_data ORDER BY dayStart DESC");
                try {
                    int I26 = w50.c.I(cVarK12, SubscriberAttributeKt.JSON_NAME_KEY);
                    int I27 = w50.c.I(cVarK12, "dayStart");
                    int I28 = w50.c.I(cVarK12, "listenedSeconds");
                    int I29 = w50.c.I(cVarK12, "dailyGoalMinutes");
                    int I30 = w50.c.I(cVarK12, "updateDate");
                    ArrayList arrayList4 = new ArrayList();
                    while (cVarK12.d0()) {
                        arrayList4.add(new gs.i(cVarK12.R(I26), cVarK12.getLong(I27), (int) cVarK12.getLong(I29), cVarK12.getLong(I28), cVarK12.getLong(I30)));
                    }
                    cVarK12.close();
                    return arrayList4;
                } catch (Throwable th2) {
                    cVarK12.close();
                    throw th2;
                }
            case 13:
                PlayerItem it = (PlayerItem) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return it.getReciterId() + "/" + it.getSurahId();
            case 14:
                u item = (u) obj;
                kotlin.jvm.internal.m.e(item, "$this$item");
                return new k0.d(s0.H(u.b));
            case 15:
                u item2 = (u) obj;
                kotlin.jvm.internal.m.e(item2, "$this$item");
                return new k0.d(s0.H(u.b));
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                u item3 = (u) obj;
                kotlin.jvm.internal.m.e(item3, "$this$item");
                return new k0.d(s0.H(u.b));
            case 17:
                u item4 = (u) obj;
                kotlin.jvm.internal.m.e(item4, "$this$item");
                return new k0.d(s0.H(u.b));
            case 18:
                fx.b it2 = (fx.b) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                return Integer.valueOf(it2.a);
            case 19:
                kotlin.jvm.internal.m.e((String) obj, "it");
                return b0Var;
            case 20:
                ((Boolean) obj).getClass();
                return b0Var;
            case 21:
                n4.j show = (n4.j) obj;
                kotlin.jvm.internal.m.e(show, "$this$show");
                show.w = 2;
                return b0Var;
            case 22:
                c0 graphicsLayer = (c0) obj;
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.v(-90.0f);
                return b0Var;
            case 23:
                c0 graphicsLayer2 = (c0) obj;
                kotlin.jvm.internal.m.e(graphicsLayer2, "$this$graphicsLayer");
                graphicsLayer2.v(-90.0f);
                return b0Var;
            case 24:
                PlayerView playerView = (PlayerView) obj;
                kotlin.jvm.internal.m.e(playerView, "playerView");
                playerView.setRenderEffect(null);
                playerView.setPlayer((f1) null);
                return b0Var;
            case 25:
                j0 j0Var = ((b1) obj).a;
                if (j0Var != null) {
                    j0Var.invoke();
                }
                return b0Var;
            case 26:
                y50.a module = (y50.a) obj;
                kotlin.jvm.internal.m.e(module, "$this$module");
                jk.c cVar = new jk.c(28);
                v50.c cVar2 = v50.c.A;
                kotlin.jvm.internal.b0 b0Var2 = a0.a;
                a10.d dVarB = b0Var2.b(kt.a.class);
                b60.b bVar = c60.a.e;
                module.a(new w50.e(new v50.a(bVar, dVarB, null, cVar, cVar2)));
                module.a(new w50.e(new v50.a(bVar, b0Var2.b(kt.b.class), null, new lt.a(6), cVar2)));
                module.a(new w50.e(new v50.a(bVar, b0Var2.b(jt.a.class), null, new jk.c(20), cVar2)));
                module.a(new w50.e(new v50.a(bVar, b0Var2.b(jt.d.class), null, new jk.c(21), cVar2)));
                ot.e eVar = ot.e.TAFSIR;
                module.a(new w50.e(new v50.a(bVar, b0Var2.b(jt.d.class), ta.c0.P(), new jk.c(22), cVar2)));
                jk.c cVar3 = new jk.c(23);
                v50.c cVar4 = v50.c.B;
                module.a(new w50.a(new v50.a(bVar, b0Var2.b(et.a.class), null, cVar3, cVar4)));
                module.a(new w50.a(new v50.a(bVar, b0Var2.b(et.b.class), null, new jk.c(24), cVar4)));
                module.a(new w50.a(new v50.a(bVar, b0Var2.b(gt.a.class), null, new jk.c(25), cVar4)));
                module.a(new w50.e(new v50.a(bVar, b0Var2.b(ht.e.class), null, new jk.c(26), cVar2)));
                module.a(new w50.e(new v50.a(bVar, b0Var2.b(ht.k.class), null, new jk.c(27), cVar2)));
                module.a(new w50.e(new v50.a(bVar, b0Var2.b(ht.k.class), ta.c0.P(), new jk.c(29), cVar2)));
                module.a(new w50.e(new v50.a(bVar, b0Var2.b(ht.b.class), null, new lt.a(i3), cVar2)));
                module.a(new w50.a(new v50.a(bVar, b0Var2.b(mt.a.class), null, new lt.a(i4), cVar4)));
                module.a(new w50.a(new v50.a(bVar, b0Var2.b(rt.h.class), null, new lt.a(i2), cVar4)));
                module.a(new w50.a(new v50.a(bVar, b0Var2.b(rt.b.class), null, new lt.a(3), cVar4)));
                module.a(new w50.a(new v50.a(bVar, b0Var2.b(rt.f.class), null, new lt.a(4), cVar4)));
                module.a(new w50.a(new v50.a(bVar, b0Var2.b(qt.k.class), null, new lt.a(5), cVar4)));
                return b0Var;
            case 27:
                List list = (List) obj;
                Object obj2 = list.get(0);
                kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new m0.b(iIntValue, ((Float) obj3).floatValue(), new l0(list, 19));
            case 28:
                return Boolean.valueOf(!(((m3.c) obj) instanceof v));
            default:
                s sVar = (s) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(sVar.b);
                sb.append(", ");
                return oi.k.l(sb, sVar.c, ')');
        }
    }
}
