package hb;

import ab.a0;
import kotlin.NoWhenBranchMatchedException;
import za.c0;

public final class b extends a0 {

    public final int f6964a;

    public b(int i10) {
        this.f6964a = i10;
    }

    @Override
    public final String J() {
        switch (this.f6964a) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 6:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `listening_day_reciter_stat_data` (`key`,`dayStart`,`reciterId`,`seconds`,`updatedAt`) VALUES (?,?,?,?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `listening_day_surah_stat_data` (`key`,`dayStart`,`surahNumber`,`reciterId`,`seconds`,`updatedAt`) VALUES (?,?,?,?,?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `listening_hour_stat_data` (`key`,`dayStart`,`hour`,`quranSeconds`,`updatedAt`) VALUES (?,?,?,?,?)";
            case 10:
                return "INSERT OR REPLACE INTO `listening_hour_background_sound_stat_data` (`key`,`dayStart`,`hour`,`soundId`,`seconds`,`avgVolumeTimes1000`,`updatedAt`) VALUES (?,?,?,?,?,?,?)";
            case 11:
                return "INSERT OR ABORT INTO `listening_event_queue` (`id`,`event_id`,`session_id`,`track_id`,`event_type`,`position_ms`,`listened_ms`,`utc_offset_minutes`,`occurred_at`,`background_sound_id`,`background_volume_times_1000`,`reciter_id`,`surah_number`,`recorded_elapsed_ms`,`boot_count`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 12:
                return "INSERT OR REPLACE INTO `listening_summary` (`history_days`,`summary`,`saved_at`) VALUES (?,?,?)";
            case 13:
                return "INSERT OR REPLACE INTO `listening_year` (`year`,`days`,`saved_at`) VALUES (?,?,?)";
            case 14:
                return "INSERT OR REPLACE INTO `streak_info_data` (`key`,`dayStart`,`listenedSeconds`,`dailyGoalMinutes`,`updateDate`) VALUES (?,?,?,?,?)";
            case 15:
                return "INSERT OR REPLACE INTO `favorites_data` (`id`,`surah_owner_id`,`is_from_catalog`,`collection_id`,`added_at`) VALUES (?,?,?,?,?)";
            case 16:
                return "INSERT INTO `audio_story_download` (`episode_id`,`language`,`story_id`,`label`,`version`,`duration_ms`,`audio_path`,`transcript_path`,`size_bytes`,`downloaded_at`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 17:
                return "INSERT OR ABORT INTO `audio_story_event_queue` (`id`,`event_id`,`session_id`,`story_id`,`episode_id`,`language`,`event_type`,`position_ms`,`seek_from_ms`,`listened_ms`,`playback_rate_times_100`,`is_offline`,`utc_offset_minutes`,`occurred_at`,`source`,`recorded_elapsed_ms`,`boot_count`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT INTO `audio_story_progress` (`episode_id`,`language`,`position_ms`,`is_completed`,`updated_at`,`needs_upload`) VALUES (?,?,?,?,?,?)";
        }
    }

    @Override
    public final void r(ma.c cVar, Object obj) throws NoWhenBranchMatchedException {
        int i10;
        int i11 = 1;
        switch (this.f6964a) {
            case 0:
                a aVar = (a) obj;
                kotlin.jvm.internal.m.e(cVar, "statement");
                kotlin.jvm.internal.m.e(aVar, "entity");
                cVar.y(1, aVar.f6962a);
                cVar.y(2, aVar.f6963b);
                return;
            case 1:
                d dVar = (d) obj;
                kotlin.jvm.internal.m.e(cVar, "statement");
                kotlin.jvm.internal.m.e(dVar, "entity");
                cVar.y(1, dVar.f6967a);
                cVar.d(2, dVar.f6968b.longValue());
                return;
            case 2:
                g gVar = (g) obj;
                kotlin.jvm.internal.m.e(cVar, "statement");
                kotlin.jvm.internal.m.e(gVar, "entity");
                cVar.y(1, gVar.f6971a);
                cVar.d(2, gVar.f6972b);
                cVar.d(3, gVar.f6973c);
                return;
            case 3:
                j jVar = (j) obj;
                kotlin.jvm.internal.m.e(cVar, "statement");
                kotlin.jvm.internal.m.e(jVar, "entity");
                cVar.y(1, jVar.f6978a);
                cVar.y(2, jVar.f6979b);
                return;
            case 4:
                l lVar = (l) obj;
                kotlin.jvm.internal.m.e(cVar, "statement");
                kotlin.jvm.internal.m.e(lVar, "entity");
                cVar.y(1, lVar.f6982a);
                za.g gVar2 = za.g.f17367b;
                cVar.e(2, kh.n.f0(lVar.f6983b));
                return;
            case 5:
                p pVar = (p) obj;
                kotlin.jvm.internal.m.e(cVar, "statement");
                kotlin.jvm.internal.m.e(pVar, "entity");
                cVar.y(1, pVar.f7004a);
                cVar.d(2, c7.i.W(pVar.f7005b));
                cVar.y(3, pVar.f7006c);
                cVar.y(4, pVar.f7007d);
                za.g gVar3 = za.g.f17367b;
                cVar.e(5, kh.n.f0(pVar.f7008e));
                cVar.e(6, kh.n.f0(pVar.f7009f));
                cVar.d(7, pVar.f7010g);
                cVar.d(8, pVar.f7011h);
                cVar.d(9, pVar.f7012i);
                cVar.d(10, pVar.f7014k);
                za.a aVar2 = pVar.l;
                kotlin.jvm.internal.m.e(aVar2, "backoffPolicy");
                int iOrdinal = aVar2.ordinal();
                if (iOrdinal == 0) {
                    i10 = 0;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i10 = 1;
                }
                cVar.d(11, i10);
                cVar.d(12, pVar.m);
                cVar.d(13, pVar.f7015n);
                cVar.d(14, pVar.f7016o);
                cVar.d(15, pVar.f7017p);
                cVar.d(16, pVar.f7018q ? 1L : 0L);
                c0 c0Var = pVar.f7019r;
                kotlin.jvm.internal.m.e(c0Var, "policy");
                int iOrdinal2 = c0Var.ordinal();
                if (iOrdinal2 == 0) {
                    i11 = 0;
                } else if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar.d(17, i11);
                cVar.d(18, pVar.f7020s);
                cVar.d(19, pVar.f7021t);
                cVar.d(20, pVar.f7022u);
                cVar.d(21, pVar.f7023v);
                cVar.d(22, pVar.f7024w);
                String str = pVar.f7025x;
                if (str == null) {
                    cVar.f(23);
                } else {
                    cVar.y(23, str);
                }
                Boolean bool = pVar.f7026y;
                Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    cVar.f(24);
                } else {
                    cVar.d(24, numValueOf.intValue());
                }
                za.e eVar = pVar.f7013j;
                cVar.d(25, c7.i.O(eVar.f17356a));
                cVar.e(26, c7.i.B(eVar.f17357b));
                cVar.d(27, eVar.f17358c ? 1L : 0L);
                cVar.d(28, eVar.f17359d ? 1L : 0L);
                cVar.d(29, eVar.f17360e ? 1L : 0L);
                cVar.d(30, eVar.f17361f ? 1L : 0L);
                cVar.d(31, eVar.f17362g);
                cVar.d(32, eVar.f17363h);
                cVar.e(33, c7.i.U(eVar.f17364i));
                return;
            case 6:
                y yVar = (y) obj;
                kotlin.jvm.internal.m.e(cVar, "statement");
                kotlin.jvm.internal.m.e(yVar, "entity");
                cVar.y(1, yVar.f7031a);
                cVar.y(2, yVar.f7032b);
                return;
            case 7:
                gs.a aVar3 = (gs.a) obj;
                kotlin.jvm.internal.m.e(cVar, "statement");
                kotlin.jvm.internal.m.e(aVar3, "entity");
                cVar.y(1, aVar3.a);
                cVar.d(2, aVar3.b);
                cVar.d(3, aVar3.c);
                cVar.d(4, aVar3.d);
                cVar.d(5, aVar3.e);
                return;
            case 8:
                gs.b bVar = (gs.b) obj;
                kotlin.jvm.internal.m.e(cVar, "statement");
                kotlin.jvm.internal.m.e(bVar, "entity");
                cVar.y(1, bVar.a);
                cVar.d(2, bVar.b);
                cVar.d(3, bVar.c);
                cVar.d(4, bVar.d);
                cVar.d(5, bVar.e);
                cVar.d(6, bVar.f);
                return;
            case 9:
                gs.c cVar2 = (gs.c) obj;
                kotlin.jvm.internal.m.e(cVar, "statement");
                kotlin.jvm.internal.m.e(cVar2, "entity");
                cVar.y(1, cVar2.a);
                cVar.d(2, cVar2.b);
                cVar.d(3, cVar2.c);
                cVar.d(4, cVar2.d);
                cVar.d(5, cVar2.e);
                return;
            case 10:
                gs.d dVar2 = (gs.d) obj;
                kotlin.jvm.internal.m.e(cVar, "statement");
                kotlin.jvm.internal.m.e(dVar2, "entity");
                cVar.y(1, dVar2.a);
                cVar.d(2, dVar2.b);
                cVar.d(3, dVar2.c);
                cVar.y(4, dVar2.d);
                cVar.d(5, dVar2.e);
                Integer num = dVar2.f;
                if (num == null) {
                    cVar.f(6);
                } else {
                    cVar.d(6, num.intValue());
                }
                cVar.d(7, dVar2.g);
                return;
            case 11:
                gs.e eVar2 = (gs.e) obj;
                kotlin.jvm.internal.m.e(cVar, "statement");
                kotlin.jvm.internal.m.e(eVar2, "entity");
                cVar.d(1, eVar2.a);
                cVar.y(2, eVar2.b);
                cVar.y(3, eVar2.c);
                cVar.d(4, eVar2.d);
                cVar.y(5, eVar2.e);
                cVar.d(6, eVar2.f);
                cVar.d(7, eVar2.g);
                cVar.d(8, eVar2.h);
                cVar.y(9, eVar2.i);
                String str2 = eVar2.j;
                if (str2 == null) {
                    cVar.f(10);
                } else {
                    cVar.y(10, str2);
                }
                Integer num2 = eVar2.k;
                if (num2 == null) {
                    cVar.f(11);
                } else {
                    cVar.d(11, num2.intValue());
                }
                Integer num3 = eVar2.l;
                if (num3 == null) {
                    cVar.f(12);
                } else {
                    cVar.d(12, num3.intValue());
                }
                Integer num4 = eVar2.m;
                if (num4 == null) {
                    cVar.f(13);
                } else {
                    cVar.d(13, num4.intValue());
                }
                Long l = eVar2.n;
                if (l == null) {
                    cVar.f(14);
                } else {
                    cVar.d(14, l.longValue());
                }
                Integer num5 = eVar2.o;
                if (num5 == null) {
                    cVar.f(15);
                    return;
                } else {
                    cVar.d(15, num5.intValue());
                    return;
                }
            case 12:
                gs.g gVar4 = (gs.g) obj;
                kotlin.jvm.internal.m.e(cVar, "statement");
                kotlin.jvm.internal.m.e(gVar4, "entity");
                cVar.d(1, gVar4.a);
                cVar.y(2, gVar4.b);
                cVar.d(3, gVar4.c);
                return;
            case 13:
                gs.h hVar = (gs.h) obj;
                kotlin.jvm.internal.m.e(cVar, "statement");
                kotlin.jvm.internal.m.e(hVar, "entity");
                cVar.d(1, hVar.a);
                cVar.y(2, hVar.b);
                cVar.d(3, hVar.c);
                return;
            case 14:
                gs.i iVar = (gs.i) obj;
                kotlin.jvm.internal.m.e(cVar, "statement");
                kotlin.jvm.internal.m.e(iVar, "entity");
                cVar.y(1, iVar.a);
                cVar.d(2, iVar.b);
                cVar.d(3, iVar.c);
                cVar.d(4, iVar.d);
                cVar.d(5, iVar.e);
                return;
            case 15:
                sq.a aVar4 = (sq.a) obj;
                kotlin.jvm.internal.m.e(cVar, "statement");
                kotlin.jvm.internal.m.e(aVar4, "entity");
                cVar.d(1, aVar4.a);
                cVar.d(2, aVar4.b);
                cVar.d(3, aVar4.c ? 1L : 0L);
                Integer num6 = aVar4.d;
                if (num6 == null) {
                    cVar.f(4);
                } else {
                    cVar.d(4, num6.intValue());
                }
                cVar.d(5, aVar4.e);
                return;
            case 16:
                bo.a aVar5 = (bo.a) obj;
                kotlin.jvm.internal.m.e(cVar, "statement");
                kotlin.jvm.internal.m.e(aVar5, "entity");
                cVar.d(1, aVar5.a);
                cVar.y(2, aVar5.b);
                cVar.d(3, aVar5.c);
                cVar.y(4, aVar5.d);
                cVar.d(5, aVar5.e);
                cVar.d(6, aVar5.f);
                cVar.y(7, aVar5.g);
                String str3 = aVar5.h;
                if (str3 == null) {
                    cVar.f(8);
                } else {
                    cVar.y(8, str3);
                }
                cVar.d(9, aVar5.i);
                cVar.d(10, aVar5.j);
                return;
            case 17:
                bo.b bVar2 = (bo.b) obj;
                kotlin.jvm.internal.m.e(cVar, "statement");
                kotlin.jvm.internal.m.e(bVar2, "entity");
                cVar.d(1, bVar2.a);
                cVar.y(2, bVar2.b);
                cVar.y(3, bVar2.c);
                cVar.d(4, bVar2.d);
                cVar.d(5, bVar2.e);
                cVar.y(6, bVar2.f);
                cVar.y(7, bVar2.g);
                cVar.d(8, bVar2.h);
                Long l10 = bVar2.i;
                if (l10 == null) {
                    cVar.f(9);
                } else {
                    cVar.d(9, l10.longValue());
                }
                cVar.d(10, bVar2.j);
                cVar.d(11, bVar2.k);
                cVar.d(12, bVar2.l ? 1L : 0L);
                cVar.d(13, bVar2.m);
                cVar.y(14, bVar2.n);
                String str4 = bVar2.o;
                if (str4 == null) {
                    cVar.f(15);
                } else {
                    cVar.y(15, str4);
                }
                cVar.d(16, bVar2.p);
                cVar.d(17, bVar2.q);
                return;
            default:
                bo.c cVar3 = (bo.c) obj;
                kotlin.jvm.internal.m.e(cVar, "statement");
                kotlin.jvm.internal.m.e(cVar3, "entity");
                cVar.d(1, cVar3.a);
                cVar.y(2, cVar3.b);
                cVar.d(3, cVar3.c);
                cVar.d(4, cVar3.d ? 1L : 0L);
                cVar.d(5, cVar3.e);
                cVar.d(6, cVar3.f ? 1L : 0L);
                return;
        }
    }
}
