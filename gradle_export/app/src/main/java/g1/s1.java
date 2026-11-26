package g1;

import com.mchutov.quranify.player.domain.model.PlayerItem;
import java.util.ArrayList;

public final class s1 implements u00.k {
    public final int A;
    public final int B;

    public s1(int i10, int i11) {
        this.A = i11;
        this.B = i10;
    }

    public s1(j0.v vVar, int i10) {
        this.A = 6;
        this.B = i10;
    }

    public final Object invoke(Object obj) throws Exception {
        Long lValueOf;
        int i10 = this.A;
        int i11 = 0;
        g00.b0 b0Var = g00.b0.a;
        int i12 = this.B;
        switch (i10) {
            case 0:
                ((Integer) obj).intValue();
                return Integer.valueOf(i12);
            case 1:
                j3.y.p((j3.a0) obj, i12 + 1.0f);
                return b0Var;
            case 2:
                j3.y.p((j3.a0) obj, 12 + i12);
                return b0Var;
            case 3:
                ma.a aVar = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar, "_connection");
                ma.c cVarK0 = aVar.k0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                try {
                    cVarK0.d(1, i12);
                    int I = w50.c.I(cVarK0, "id");
                    int I2 = w50.c.I(cVarK0, "state");
                    int I3 = w50.c.I(cVarK0, "worker_class_name");
                    int I4 = w50.c.I(cVarK0, "input_merger_class_name");
                    int I5 = w50.c.I(cVarK0, "input");
                    int I6 = w50.c.I(cVarK0, "output");
                    int I7 = w50.c.I(cVarK0, "initial_delay");
                    int I8 = w50.c.I(cVarK0, "interval_duration");
                    int I9 = w50.c.I(cVarK0, "flex_duration");
                    int I10 = w50.c.I(cVarK0, "run_attempt_count");
                    int I11 = w50.c.I(cVarK0, "backoff_policy");
                    int I12 = w50.c.I(cVarK0, "backoff_delay_duration");
                    int I13 = w50.c.I(cVarK0, "last_enqueue_time");
                    int I14 = w50.c.I(cVarK0, "minimum_retention_duration");
                    int I15 = w50.c.I(cVarK0, "schedule_requested_at");
                    int I16 = w50.c.I(cVarK0, "run_in_foreground");
                    int I17 = w50.c.I(cVarK0, "out_of_quota_policy");
                    int I18 = w50.c.I(cVarK0, "period_count");
                    int I19 = w50.c.I(cVarK0, "generation");
                    int I20 = w50.c.I(cVarK0, "next_schedule_time_override");
                    int I21 = w50.c.I(cVarK0, "next_schedule_time_override_generation");
                    int I22 = w50.c.I(cVarK0, "stop_reason");
                    int I23 = w50.c.I(cVarK0, "trace_tag");
                    int I24 = w50.c.I(cVarK0, "backoff_on_system_interruptions");
                    int I25 = w50.c.I(cVarK0, "required_network_type");
                    int I26 = w50.c.I(cVarK0, "required_network_request");
                    int I27 = w50.c.I(cVarK0, "requires_charging");
                    int I28 = w50.c.I(cVarK0, "requires_device_idle");
                    int I29 = w50.c.I(cVarK0, "requires_battery_not_low");
                    int I30 = w50.c.I(cVarK0, "requires_storage_not_low");
                    int I31 = w50.c.I(cVarK0, "trigger_content_update_delay");
                    int I32 = w50.c.I(cVarK0, "trigger_max_content_delay");
                    int I33 = w50.c.I(cVarK0, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (cVarK0.d0()) {
                        String strR = cVarK0.R(I);
                        int i13 = I12;
                        int i14 = I13;
                        za.g0 g0VarL = c7.i.L((int) cVarK0.getLong(I2));
                        String strR2 = cVarK0.R(I3);
                        String strR3 = cVarK0.R(I4);
                        byte[] blob = cVarK0.getBlob(I5);
                        za.g gVar = za.g.f17367b;
                        za.g gVarD = kh.n.D(blob);
                        za.g gVarD2 = kh.n.D(cVarK0.getBlob(I6));
                        long j9 = cVarK0.getLong(I7);
                        long j10 = cVarK0.getLong(I8);
                        long j11 = cVarK0.getLong(I9);
                        int i15 = (int) cVarK0.getLong(I10);
                        int i16 = I2;
                        int i17 = I3;
                        za.a aVarI = c7.i.I((int) cVarK0.getLong(I11));
                        long j12 = cVarK0.getLong(i13);
                        long j13 = cVarK0.getLong(i14);
                        long j14 = cVarK0.getLong(I14);
                        int i18 = I;
                        int i19 = I15;
                        long j15 = cVarK0.getLong(i19);
                        I15 = i19;
                        int i20 = I16;
                        boolean z10 = ((int) cVarK0.getLong(i20)) != 0;
                        int i21 = I17;
                        int i22 = I4;
                        za.c0 c0VarK = c7.i.K((int) cVarK0.getLong(i21));
                        int i23 = I18;
                        int i24 = I14;
                        int i25 = (int) cVarK0.getLong(i23);
                        int i26 = I19;
                        int i27 = (int) cVarK0.getLong(i26);
                        int i28 = I20;
                        long j16 = cVarK0.getLong(i28);
                        int i29 = I21;
                        int i30 = (int) cVarK0.getLong(i29);
                        int i31 = I22;
                        int i32 = (int) cVarK0.getLong(i31);
                        int i33 = I23;
                        String strR4 = cVarK0.isNull(i33) ? null : cVarK0.R(i33);
                        int i34 = I24;
                        Integer numValueOf = cVarK0.isNull(i34) ? null : Integer.valueOf((int) cVarK0.getLong(i34));
                        Boolean boolValueOf = numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null;
                        int i35 = I25;
                        za.w wVarJ = c7.i.J((int) cVarK0.getLong(i35));
                        int i36 = I26;
                        ib.f fVarX = c7.i.X(cVarK0.getBlob(i36));
                        I25 = i35;
                        I26 = i36;
                        int i37 = I27;
                        boolean z11 = ((int) cVarK0.getLong(i37)) != 0;
                        I27 = i37;
                        int i38 = I28;
                        boolean z12 = ((int) cVarK0.getLong(i38)) != 0;
                        int i39 = I29;
                        boolean z13 = ((int) cVarK0.getLong(i39)) != 0;
                        I29 = i39;
                        int i40 = I30;
                        int i41 = I31;
                        int i42 = I32;
                        int i43 = I33;
                        arrayList.add(new hb.p(strR, g0VarL, strR2, strR3, gVarD, gVarD2, j9, j10, j11, new za.e(fVarX, wVarJ, z11, z12, z13, ((int) cVarK0.getLong(i40)) != 0, cVarK0.getLong(i41), cVarK0.getLong(i42), c7.i.n(cVarK0.getBlob(i43))), i15, aVarI, j12, j13, j14, j15, z10, c0VarK, i25, i27, j16, i30, i32, strR4, boolValueOf));
                        I30 = i40;
                        I4 = i22;
                        I17 = i21;
                        I19 = i26;
                        I22 = i31;
                        I24 = i34;
                        I33 = i43;
                        I31 = i41;
                        I32 = i42;
                        I2 = i16;
                        I = i18;
                        I12 = i13;
                        I3 = i17;
                        I13 = i14;
                        I16 = i20;
                        I20 = i28;
                        I21 = i29;
                        I23 = i33;
                        I28 = i38;
                        I14 = i24;
                        I18 = i23;
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarK0.close();
                }
            case 4:
                return Integer.valueOf(((Integer) obj).intValue() * i12);
            case 5:
                return Integer.valueOf((-((Integer) obj).intValue()) * i12);
            case 6:
                l0.t0 t0Var = (l0.t0) obj;
                z1.f fVarF = z1.q.f();
                z1.q.n(fVarF, z1.q.k(fVarF), fVarF != null ? fVarF.e() : null);
                int i44 = t0Var.f9795a;
                int i45 = i44 != -1 ? i44 : 2;
                for (int i46 = 0; i46 < i45; i46++) {
                    t0Var.a(i12 + i46);
                }
                return b0Var;
            case 7:
                ma.a aVar2 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar2, "_connection");
                ma.c cVarK1 = aVar2.k0("DELETE FROM listening_event_queue WHERE julianday(occurred_at) < julianday('now', '-' || ? || ' days')");
                try {
                    cVarK1.d(1, i12);
                    cVarK1.d0();
                    return b0Var;
                } finally {
                    cVarK1.close();
                }
            case 8:
                ma.a aVar3 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar3, "_connection");
                ma.c cVarK2 = aVar3.k0("DELETE FROM listening_event_queue WHERE id NOT IN (SELECT id FROM listening_event_queue ORDER BY id DESC LIMIT ?)");
                try {
                    cVarK2.d(1, i12);
                    cVarK2.d0();
                    return b0Var;
                } finally {
                    cVarK2.close();
                }
            case 9:
                ma.a aVar4 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar4, "_connection");
                ma.c cVarK3 = aVar4.k0("SELECT * FROM listening_event_queue ORDER BY id ASC LIMIT ?");
                try {
                    cVarK3.d(1, i12);
                    int I34 = w50.c.I(cVarK3, "id");
                    int I35 = w50.c.I(cVarK3, "event_id");
                    int I36 = w50.c.I(cVarK3, "session_id");
                    int I37 = w50.c.I(cVarK3, "track_id");
                    int I38 = w50.c.I(cVarK3, "event_type");
                    int I39 = w50.c.I(cVarK3, "position_ms");
                    int I40 = w50.c.I(cVarK3, "listened_ms");
                    int I41 = w50.c.I(cVarK3, "utc_offset_minutes");
                    int I42 = w50.c.I(cVarK3, "occurred_at");
                    int I43 = w50.c.I(cVarK3, "background_sound_id");
                    int I44 = w50.c.I(cVarK3, "background_volume_times_1000");
                    int I45 = w50.c.I(cVarK3, "reciter_id");
                    int I46 = w50.c.I(cVarK3, "surah_number");
                    int I47 = w50.c.I(cVarK3, "recorded_elapsed_ms");
                    int I48 = w50.c.I(cVarK3, "boot_count");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarK3.d0()) {
                        long j17 = cVarK3.getLong(I34);
                        String strR5 = cVarK3.R(I35);
                        int i47 = I35;
                        int i48 = I36;
                        int i49 = I48;
                        arrayList2.add(new gs.e(j17, strR5, cVarK3.R(I36), cVarK3.getLong(I37), cVarK3.R(I38), cVarK3.getLong(I39), (int) cVarK3.getLong(I40), (int) cVarK3.getLong(I41), cVarK3.R(I42), cVarK3.isNull(I43) ? null : cVarK3.R(I43), cVarK3.isNull(I44) ? null : Integer.valueOf((int) cVarK3.getLong(I44)), cVarK3.isNull(I45) ? null : Integer.valueOf((int) cVarK3.getLong(I45)), cVarK3.isNull(I46) ? null : Integer.valueOf((int) cVarK3.getLong(I46)), cVarK3.isNull(I47) ? null : Long.valueOf(cVarK3.getLong(I47)), cVarK3.isNull(i49) ? null : Integer.valueOf((int) cVarK3.getLong(i49))));
                        I37 = I37;
                        I48 = i49;
                        I38 = I38;
                        I36 = i48;
                        I35 = i47;
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarK3.close();
                }
            case 10:
                ma.a aVar5 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar5, "_connection");
                ma.c cVarK4 = aVar5.k0("SELECT saved_at FROM listening_year WHERE year = ?");
                try {
                    cVarK4.d(1, i12);
                    if (cVarK4.d0() && !cVarK4.isNull(0)) {
                        lValueOf = Long.valueOf(cVarK4.getLong(0));
                        break;
                    } else {
                        lValueOf = null;
                    }
                    return lValueOf;
                } finally {
                    cVarK4.close();
                }
            case 11:
                ma.a aVar6 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar6, "_connection");
                ma.c cVarK5 = aVar6.k0("SELECT * FROM listening_year WHERE year = ?");
                try {
                    cVarK5.d(1, i12);
                    int I49 = w50.c.I(cVarK5, "year");
                    return cVarK5.d0() ? new gs.h(cVarK5.R(w50.c.I(cVarK5, "days")), cVarK5.getLong(w50.c.I(cVarK5, "saved_at")), (int) cVarK5.getLong(I49)) : null;
                } finally {
                    cVarK5.close();
                }
            case 12:
                ((Integer) obj).intValue();
                return Integer.valueOf(i12);
            case 13:
                PlayerItem playerItem = (PlayerItem) obj;
                kotlin.jvm.internal.m.e(playerItem, "it");
                return Boolean.valueOf(playerItem.getSurahNumber() == i12);
            case 14:
                k2.d dVar = (k2.d) obj;
                kotlin.jvm.internal.m.e(dVar, "$this$Canvas");
                float fA0 = dVar.A0(sm.d0.a);
                float fA1 = dVar.A0(sm.d0.b);
                char c10 = ' ';
                float f3 = 2;
                float fIntBitsToFloat = (Float.intBitsToFloat((int) (dVar.b() >> 32)) - (fA0 * f3)) / (i12 - 1);
                while (i11 < i12) {
                    float f10 = fA1 / f3;
                    char c11 = c10;
                    k2.d.a1(dVar, i2.t.b(0.5f, dl.a.k), (((long) Float.floatToRawIntBits(((i11 * fIntBitsToFloat) + fA0) - f10)) << c10) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.b() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fA1)) << c11), (((long) Float.floatToRawIntBits(f10)) << c11) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L), null, 240);
                    i11++;
                    c10 = c11;
                }
                return b0Var;
            case 15:
                ma.a aVar7 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar7, "_connection");
                ma.c cVarK6 = aVar7.k0("\n        SELECT * FROM favorites_data\n        WHERE surah_owner_id = ?\n        ORDER BY added_at ASC\n        ");
                try {
                    cVarK6.d(1, i12);
                    int I50 = w50.c.I(cVarK6, "id");
                    int I51 = w50.c.I(cVarK6, "surah_owner_id");
                    int I52 = w50.c.I(cVarK6, "is_from_catalog");
                    int I53 = w50.c.I(cVarK6, "collection_id");
                    int I54 = w50.c.I(cVarK6, "added_at");
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarK6.d0()) {
                        arrayList3.add(new sq.a(cVarK6.getLong(I50), (int) cVarK6.getLong(I51), ((int) cVarK6.getLong(I52)) != 0, cVarK6.isNull(I53) ? null : Integer.valueOf((int) cVarK6.getLong(I53)), cVarK6.getLong(I54)));
                        break;
                    }
                    return arrayList3;
                } finally {
                    cVarK6.close();
                }
            case 16:
                ma.a aVar8 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar8, "_connection");
                ma.c cVarK7 = aVar8.k0("DELETE FROM audio_story_download WHERE episode_id = ?");
                try {
                    cVarK7.d(1, i12);
                    cVarK7.d0();
                    return b0Var;
                } finally {
                    cVarK7.close();
                }
            default:
                ma.a aVar9 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar9, "_connection");
                ma.c cVarK8 = aVar9.k0("DELETE FROM audio_story_download WHERE story_id = ?");
                try {
                    cVarK8.d(1, i12);
                    cVarK8.d0();
                    return b0Var;
                } finally {
                    cVarK8.close();
                }
        }
    }
}
