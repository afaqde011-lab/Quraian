package ab;

import androidx.work.impl.WorkDatabase_Impl;
import com.mchutov.quranify.audiostories.data.source.local.db.AudioStoriesDatabase_Impl;
import com.mchutov.quranify.favoriters.data.source.local.db.FavoritesDatabase_Impl;
import com.mchutov.quranify.insights.data.source.local.db.InsightsDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public final class w extends ba.y {

    public final int f415d = 0;

    public final ca.t f416e;

    public w(WorkDatabase_Impl workDatabase_Impl) {
        super("08b926448d86528e697981ddd30459f7", 24, "149fd8ad55885d3fe3549a37a0163243");
        this.f416e = workDatabase_Impl;
    }

    public w(AudioStoriesDatabase_Impl audioStoriesDatabase_Impl) {
        super("b2e074aec81e065d60f03a4f86445147", 3, "a3d3d856b3b0d3d47fb298c987097abf");
        this.f416e = audioStoriesDatabase_Impl;
    }

    public w(FavoritesDatabase_Impl favoritesDatabase_Impl) {
        super("6391369a7721fe5adc0beebc632836e6", 3, "f25022ccedf4096f05876cbbaaa38eef");
        this.f416e = favoritesDatabase_Impl;
    }

    public w(InsightsDatabase_Impl insightsDatabase_Impl) {
        super("55efcef86b225ad8e46408b0ec89e0e8", 3, "ded96dc5471cfba0c3ab13cbcfd9e32d");
        this.f416e = insightsDatabase_Impl;
    }

    private final androidx.media3.common.q w(ma.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "connection");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("key", new ha.f(1, 1, "key", "TEXT", null, true));
        linkedHashMap.put("dayStart", new ha.f(0, 1, "dayStart", "INTEGER", null, true));
        linkedHashMap.put("listenedSeconds", new ha.f(0, 1, "listenedSeconds", "INTEGER", null, true));
        linkedHashMap.put("dailyGoalMinutes", new ha.f(0, 1, "dailyGoalMinutes", "INTEGER", null, true));
        linkedHashMap.put("updateDate", new ha.f(0, 1, "updateDate", "INTEGER", null, true));
        ha.i iVar = new ha.i("streak_info_data", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        ha.i iVarX = a.a.X(aVar, "streak_info_data");
        if (!iVar.equals(iVarX)) {
            return new androidx.media3.common.q("streak_info_data(com.mchutov.quranify.insights.data.model.StreakInfoData).\n Expected:\n" + iVar + "\n Found:\n" + iVarX, false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("key", new ha.f(1, 1, "key", "TEXT", null, true));
        linkedHashMap2.put("dayStart", new ha.f(0, 1, "dayStart", "INTEGER", null, true));
        linkedHashMap2.put("hour", new ha.f(0, 1, "hour", "INTEGER", null, true));
        linkedHashMap2.put("quranSeconds", new ha.f(0, 1, "quranSeconds", "INTEGER", null, true));
        linkedHashMap2.put("updatedAt", new ha.f(0, 1, "updatedAt", "INTEGER", null, true));
        ha.i iVar2 = new ha.i("listening_hour_stat_data", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
        ha.i iVarX2 = a.a.X(aVar, "listening_hour_stat_data");
        if (!iVar2.equals(iVarX2)) {
            return new androidx.media3.common.q("listening_hour_stat_data(com.mchutov.quranify.insights.data.model.HourStatData).\n Expected:\n" + iVar2 + "\n Found:\n" + iVarX2, false);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("key", new ha.f(1, 1, "key", "TEXT", null, true));
        linkedHashMap3.put("dayStart", new ha.f(0, 1, "dayStart", "INTEGER", null, true));
        linkedHashMap3.put("surahNumber", new ha.f(0, 1, "surahNumber", "INTEGER", null, true));
        linkedHashMap3.put("reciterId", new ha.f(0, 1, "reciterId", "INTEGER", null, true));
        linkedHashMap3.put("seconds", new ha.f(0, 1, "seconds", "INTEGER", null, true));
        linkedHashMap3.put("updatedAt", new ha.f(0, 1, "updatedAt", "INTEGER", null, true));
        ha.i iVar3 = new ha.i("listening_day_surah_stat_data", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
        ha.i iVarX3 = a.a.X(aVar, "listening_day_surah_stat_data");
        if (!iVar3.equals(iVarX3)) {
            return new androidx.media3.common.q("listening_day_surah_stat_data(com.mchutov.quranify.insights.data.model.DaySurahStatData).\n Expected:\n" + iVar3 + "\n Found:\n" + iVarX3, false);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("key", new ha.f(1, 1, "key", "TEXT", null, true));
        linkedHashMap4.put("dayStart", new ha.f(0, 1, "dayStart", "INTEGER", null, true));
        linkedHashMap4.put("reciterId", new ha.f(0, 1, "reciterId", "INTEGER", null, true));
        linkedHashMap4.put("seconds", new ha.f(0, 1, "seconds", "INTEGER", null, true));
        linkedHashMap4.put("updatedAt", new ha.f(0, 1, "updatedAt", "INTEGER", null, true));
        ha.i iVar4 = new ha.i("listening_day_reciter_stat_data", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
        ha.i iVarX4 = a.a.X(aVar, "listening_day_reciter_stat_data");
        if (!iVar4.equals(iVarX4)) {
            return new androidx.media3.common.q("listening_day_reciter_stat_data(com.mchutov.quranify.insights.data.model.DayReciterStatData).\n Expected:\n" + iVar4 + "\n Found:\n" + iVarX4, false);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("key", new ha.f(1, 1, "key", "TEXT", null, true));
        linkedHashMap5.put("dayStart", new ha.f(0, 1, "dayStart", "INTEGER", null, true));
        linkedHashMap5.put("hour", new ha.f(0, 1, "hour", "INTEGER", null, true));
        linkedHashMap5.put("soundId", new ha.f(0, 1, "soundId", "TEXT", null, true));
        linkedHashMap5.put("seconds", new ha.f(0, 1, "seconds", "INTEGER", null, true));
        linkedHashMap5.put("avgVolumeTimes1000", new ha.f(0, 1, "avgVolumeTimes1000", "INTEGER", null, false));
        linkedHashMap5.put("updatedAt", new ha.f(0, 1, "updatedAt", "INTEGER", null, true));
        ha.i iVar5 = new ha.i("listening_hour_background_sound_stat_data", linkedHashMap5, new LinkedHashSet(), new LinkedHashSet());
        ha.i iVarX5 = a.a.X(aVar, "listening_hour_background_sound_stat_data");
        if (!iVar5.equals(iVarX5)) {
            return new androidx.media3.common.q("listening_hour_background_sound_stat_data(com.mchutov.quranify.insights.data.model.HourWithBackgroundSoundStatData).\n Expected:\n" + iVar5 + "\n Found:\n" + iVarX5, false);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("id", new ha.f(1, 1, "id", "INTEGER", null, true));
        linkedHashMap6.put("event_id", new ha.f(0, 1, "event_id", "TEXT", null, true));
        linkedHashMap6.put("session_id", new ha.f(0, 1, "session_id", "TEXT", null, true));
        linkedHashMap6.put("track_id", new ha.f(0, 1, "track_id", "INTEGER", null, true));
        linkedHashMap6.put("event_type", new ha.f(0, 1, "event_type", "TEXT", null, true));
        linkedHashMap6.put("position_ms", new ha.f(0, 1, "position_ms", "INTEGER", null, true));
        linkedHashMap6.put("listened_ms", new ha.f(0, 1, "listened_ms", "INTEGER", null, true));
        linkedHashMap6.put("utc_offset_minutes", new ha.f(0, 1, "utc_offset_minutes", "INTEGER", null, true));
        linkedHashMap6.put("occurred_at", new ha.f(0, 1, "occurred_at", "TEXT", null, true));
        linkedHashMap6.put("background_sound_id", new ha.f(0, 1, "background_sound_id", "TEXT", null, false));
        linkedHashMap6.put("background_volume_times_1000", new ha.f(0, 1, "background_volume_times_1000", "INTEGER", null, false));
        linkedHashMap6.put("reciter_id", new ha.f(0, 1, "reciter_id", "INTEGER", null, false));
        linkedHashMap6.put("surah_number", new ha.f(0, 1, "surah_number", "INTEGER", null, false));
        linkedHashMap6.put("recorded_elapsed_ms", new ha.f(0, 1, "recorded_elapsed_ms", "INTEGER", null, false));
        linkedHashMap6.put("boot_count", new ha.f(0, 1, "boot_count", "INTEGER", null, false));
        ha.i iVar6 = new ha.i("listening_event_queue", linkedHashMap6, new LinkedHashSet(), new LinkedHashSet());
        ha.i iVarX6 = a.a.X(aVar, "listening_event_queue");
        if (!iVar6.equals(iVarX6)) {
            return new androidx.media3.common.q("listening_event_queue(com.mchutov.quranify.insights.data.model.ListeningEventQueueData).\n Expected:\n" + iVar6 + "\n Found:\n" + iVarX6, false);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("history_days", new ha.f(1, 1, "history_days", "INTEGER", null, true));
        linkedHashMap7.put("summary", new ha.f(0, 1, "summary", "TEXT", null, true));
        linkedHashMap7.put("saved_at", new ha.f(0, 1, "saved_at", "INTEGER", null, true));
        ha.i iVar7 = new ha.i("listening_summary", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
        ha.i iVarX7 = a.a.X(aVar, "listening_summary");
        if (!iVar7.equals(iVarX7)) {
            return new androidx.media3.common.q("listening_summary(com.mchutov.quranify.insights.data.model.ListeningSummaryData).\n Expected:\n" + iVar7 + "\n Found:\n" + iVarX7, false);
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
        linkedHashMap8.put("year", new ha.f(1, 1, "year", "INTEGER", null, true));
        linkedHashMap8.put("days", new ha.f(0, 1, "days", "TEXT", null, true));
        linkedHashMap8.put("saved_at", new ha.f(0, 1, "saved_at", "INTEGER", null, true));
        ha.i iVar8 = new ha.i("listening_year", linkedHashMap8, new LinkedHashSet(), new LinkedHashSet());
        ha.i iVarX8 = a.a.X(aVar, "listening_year");
        if (iVar8.equals(iVarX8)) {
            return new androidx.media3.common.q((String) null, true);
        }
        return new androidx.media3.common.q("listening_year(com.mchutov.quranify.insights.data.model.ListeningYearData).\n Expected:\n" + iVar8 + "\n Found:\n" + iVarX8, false);
    }

    @Override
    public final void a(ma.a aVar) {
        switch (this.f415d) {
            case 0:
                kotlin.jvm.internal.m.e(aVar, "connection");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                a10.h0.v(aVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                a10.h0.v(aVar, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                a10.h0.v(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                a10.h0.v(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                a10.h0.v(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                a10.h0.v(aVar, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                a10.h0.v(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
                break;
            case 1:
                kotlin.jvm.internal.m.e(aVar, "connection");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS `streak_info_data` (`key` TEXT NOT NULL, `dayStart` INTEGER NOT NULL, `listenedSeconds` INTEGER NOT NULL, `dailyGoalMinutes` INTEGER NOT NULL, `updateDate` INTEGER NOT NULL, PRIMARY KEY(`key`))");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS `listening_hour_stat_data` (`key` TEXT NOT NULL, `dayStart` INTEGER NOT NULL, `hour` INTEGER NOT NULL, `quranSeconds` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, PRIMARY KEY(`key`))");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS `listening_day_surah_stat_data` (`key` TEXT NOT NULL, `dayStart` INTEGER NOT NULL, `surahNumber` INTEGER NOT NULL, `reciterId` INTEGER NOT NULL, `seconds` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, PRIMARY KEY(`key`))");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS `listening_day_reciter_stat_data` (`key` TEXT NOT NULL, `dayStart` INTEGER NOT NULL, `reciterId` INTEGER NOT NULL, `seconds` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, PRIMARY KEY(`key`))");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS `listening_hour_background_sound_stat_data` (`key` TEXT NOT NULL, `dayStart` INTEGER NOT NULL, `hour` INTEGER NOT NULL, `soundId` TEXT NOT NULL, `seconds` INTEGER NOT NULL, `avgVolumeTimes1000` INTEGER, `updatedAt` INTEGER NOT NULL, PRIMARY KEY(`key`))");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS `listening_event_queue` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `event_id` TEXT NOT NULL, `session_id` TEXT NOT NULL, `track_id` INTEGER NOT NULL, `event_type` TEXT NOT NULL, `position_ms` INTEGER NOT NULL, `listened_ms` INTEGER NOT NULL, `utc_offset_minutes` INTEGER NOT NULL, `occurred_at` TEXT NOT NULL, `background_sound_id` TEXT, `background_volume_times_1000` INTEGER, `reciter_id` INTEGER, `surah_number` INTEGER, `recorded_elapsed_ms` INTEGER, `boot_count` INTEGER)");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS `listening_summary` (`history_days` INTEGER NOT NULL, `summary` TEXT NOT NULL, `saved_at` INTEGER NOT NULL, PRIMARY KEY(`history_days`))");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS `listening_year` (`year` INTEGER NOT NULL, `days` TEXT NOT NULL, `saved_at` INTEGER NOT NULL, PRIMARY KEY(`year`))");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                a10.h0.v(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '55efcef86b225ad8e46408b0ec89e0e8')");
                break;
            case 2:
                kotlin.jvm.internal.m.e(aVar, "connection");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS `favorites_data` (`id` INTEGER NOT NULL, `surah_owner_id` INTEGER NOT NULL, `is_from_catalog` INTEGER NOT NULL, `collection_id` INTEGER, `added_at` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                a10.h0.v(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6391369a7721fe5adc0beebc632836e6')");
                break;
            default:
                kotlin.jvm.internal.m.e(aVar, "connection");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS `audio_story_progress` (`episode_id` INTEGER NOT NULL, `language` TEXT NOT NULL, `position_ms` INTEGER NOT NULL, `is_completed` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `needs_upload` INTEGER NOT NULL, PRIMARY KEY(`episode_id`, `language`))");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS `audio_story_download` (`episode_id` INTEGER NOT NULL, `language` TEXT NOT NULL, `story_id` INTEGER NOT NULL, `label` TEXT NOT NULL, `version` INTEGER NOT NULL, `duration_ms` INTEGER NOT NULL, `audio_path` TEXT NOT NULL, `transcript_path` TEXT, `size_bytes` INTEGER NOT NULL, `downloaded_at` INTEGER NOT NULL, PRIMARY KEY(`episode_id`, `language`))");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS `audio_story_event_queue` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `event_id` TEXT NOT NULL, `session_id` TEXT NOT NULL, `story_id` INTEGER NOT NULL, `episode_id` INTEGER NOT NULL, `language` TEXT NOT NULL, `event_type` TEXT NOT NULL, `position_ms` INTEGER NOT NULL, `seek_from_ms` INTEGER, `listened_ms` INTEGER NOT NULL, `playback_rate_times_100` INTEGER NOT NULL, `is_offline` INTEGER NOT NULL, `utc_offset_minutes` INTEGER NOT NULL, `occurred_at` TEXT NOT NULL, `source` TEXT, `recorded_elapsed_ms` INTEGER NOT NULL, `boot_count` INTEGER NOT NULL)");
                a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                a10.h0.v(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b2e074aec81e065d60f03a4f86445147')");
                break;
        }
    }

    @Override
    public final void c(ma.a aVar) {
        switch (this.f415d) {
            case 0:
                kotlin.jvm.internal.m.e(aVar, "connection");
                a10.h0.v(aVar, "DROP TABLE IF EXISTS `Dependency`");
                a10.h0.v(aVar, "DROP TABLE IF EXISTS `WorkSpec`");
                a10.h0.v(aVar, "DROP TABLE IF EXISTS `WorkTag`");
                a10.h0.v(aVar, "DROP TABLE IF EXISTS `SystemIdInfo`");
                a10.h0.v(aVar, "DROP TABLE IF EXISTS `WorkName`");
                a10.h0.v(aVar, "DROP TABLE IF EXISTS `WorkProgress`");
                a10.h0.v(aVar, "DROP TABLE IF EXISTS `Preference`");
                break;
            case 1:
                kotlin.jvm.internal.m.e(aVar, "connection");
                a10.h0.v(aVar, "DROP TABLE IF EXISTS `streak_info_data`");
                a10.h0.v(aVar, "DROP TABLE IF EXISTS `listening_hour_stat_data`");
                a10.h0.v(aVar, "DROP TABLE IF EXISTS `listening_day_surah_stat_data`");
                a10.h0.v(aVar, "DROP TABLE IF EXISTS `listening_day_reciter_stat_data`");
                a10.h0.v(aVar, "DROP TABLE IF EXISTS `listening_hour_background_sound_stat_data`");
                a10.h0.v(aVar, "DROP TABLE IF EXISTS `listening_event_queue`");
                a10.h0.v(aVar, "DROP TABLE IF EXISTS `listening_summary`");
                a10.h0.v(aVar, "DROP TABLE IF EXISTS `listening_year`");
                break;
            case 2:
                kotlin.jvm.internal.m.e(aVar, "connection");
                a10.h0.v(aVar, "DROP TABLE IF EXISTS `favorites_data`");
                break;
            default:
                kotlin.jvm.internal.m.e(aVar, "connection");
                a10.h0.v(aVar, "DROP TABLE IF EXISTS `audio_story_progress`");
                a10.h0.v(aVar, "DROP TABLE IF EXISTS `audio_story_download`");
                a10.h0.v(aVar, "DROP TABLE IF EXISTS `audio_story_event_queue`");
                break;
        }
    }

    @Override
    public final void r(ma.a aVar) {
        switch (this.f415d) {
        }
        kotlin.jvm.internal.m.e(aVar, "connection");
    }

    @Override
    public final void s(ma.a aVar) {
        switch (this.f415d) {
            case 0:
                kotlin.jvm.internal.m.e(aVar, "connection");
                a10.h0.v(aVar, "PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) this.f416e).m(aVar);
                break;
            case 1:
                kotlin.jvm.internal.m.e(aVar, "connection");
                this.f416e.m(aVar);
                break;
            case 2:
                kotlin.jvm.internal.m.e(aVar, "connection");
                this.f416e.m(aVar);
                break;
            default:
                kotlin.jvm.internal.m.e(aVar, "connection");
                this.f416e.m(aVar);
                break;
        }
    }

    @Override
    public final void t(ma.a aVar) {
        switch (this.f415d) {
        }
        kotlin.jvm.internal.m.e(aVar, "connection");
    }

    @Override
    public final void u(ma.a aVar) {
        switch (this.f415d) {
            case 0:
                kotlin.jvm.internal.m.e(aVar, "connection");
                rd.a.y(aVar);
                break;
            case 1:
                kotlin.jvm.internal.m.e(aVar, "connection");
                rd.a.y(aVar);
                break;
            case 2:
                kotlin.jvm.internal.m.e(aVar, "connection");
                rd.a.y(aVar);
                break;
            default:
                kotlin.jvm.internal.m.e(aVar, "connection");
                rd.a.y(aVar);
                break;
        }
    }

    @Override
    public final androidx.media3.common.q v(ma.a aVar) {
        switch (this.f415d) {
            case 0:
                kotlin.jvm.internal.m.e(aVar, "connection");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("work_spec_id", new ha.f(1, 1, "work_spec_id", "TEXT", null, true));
                linkedHashMap.put("prerequisite_id", new ha.f(2, 1, "prerequisite_id", "TEXT", null, true));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                linkedHashSet.add(new ha.g("WorkSpec", "CASCADE", "CASCADE", va.a.R("work_spec_id"), va.a.R("id")));
                linkedHashSet.add(new ha.g("WorkSpec", "CASCADE", "CASCADE", va.a.R("prerequisite_id"), va.a.R("id")));
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new ha.h("index_Dependency_work_spec_id", false, va.a.R("work_spec_id"), va.a.R("ASC")));
                linkedHashSet2.add(new ha.h("index_Dependency_prerequisite_id", false, va.a.R("prerequisite_id"), va.a.R("ASC")));
                ha.i iVar = new ha.i("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
                ha.i iVarX = a.a.X(aVar, "Dependency");
                if (!iVar.equals(iVarX)) {
                    return new androidx.media3.common.q("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + iVar + "\n Found:\n" + iVarX, false);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("id", new ha.f(1, 1, "id", "TEXT", null, true));
                linkedHashMap2.put("state", new ha.f(0, 1, "state", "INTEGER", null, true));
                linkedHashMap2.put("worker_class_name", new ha.f(0, 1, "worker_class_name", "TEXT", null, true));
                linkedHashMap2.put("input_merger_class_name", new ha.f(0, 1, "input_merger_class_name", "TEXT", null, true));
                linkedHashMap2.put("input", new ha.f(0, 1, "input", "BLOB", null, true));
                linkedHashMap2.put("output", new ha.f(0, 1, "output", "BLOB", null, true));
                linkedHashMap2.put("initial_delay", new ha.f(0, 1, "initial_delay", "INTEGER", null, true));
                linkedHashMap2.put("interval_duration", new ha.f(0, 1, "interval_duration", "INTEGER", null, true));
                linkedHashMap2.put("flex_duration", new ha.f(0, 1, "flex_duration", "INTEGER", null, true));
                linkedHashMap2.put("run_attempt_count", new ha.f(0, 1, "run_attempt_count", "INTEGER", null, true));
                linkedHashMap2.put("backoff_policy", new ha.f(0, 1, "backoff_policy", "INTEGER", null, true));
                linkedHashMap2.put("backoff_delay_duration", new ha.f(0, 1, "backoff_delay_duration", "INTEGER", null, true));
                linkedHashMap2.put("last_enqueue_time", new ha.f(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
                linkedHashMap2.put("minimum_retention_duration", new ha.f(0, 1, "minimum_retention_duration", "INTEGER", null, true));
                linkedHashMap2.put("schedule_requested_at", new ha.f(0, 1, "schedule_requested_at", "INTEGER", null, true));
                linkedHashMap2.put("run_in_foreground", new ha.f(0, 1, "run_in_foreground", "INTEGER", null, true));
                linkedHashMap2.put("out_of_quota_policy", new ha.f(0, 1, "out_of_quota_policy", "INTEGER", null, true));
                linkedHashMap2.put("period_count", new ha.f(0, 1, "period_count", "INTEGER", "0", true));
                linkedHashMap2.put("generation", new ha.f(0, 1, "generation", "INTEGER", "0", true));
                linkedHashMap2.put("next_schedule_time_override", new ha.f(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
                linkedHashMap2.put("next_schedule_time_override_generation", new ha.f(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
                linkedHashMap2.put("stop_reason", new ha.f(0, 1, "stop_reason", "INTEGER", "-256", true));
                linkedHashMap2.put("trace_tag", new ha.f(0, 1, "trace_tag", "TEXT", null, false));
                linkedHashMap2.put("backoff_on_system_interruptions", new ha.f(0, 1, "backoff_on_system_interruptions", "INTEGER", null, false));
                linkedHashMap2.put("required_network_type", new ha.f(0, 1, "required_network_type", "INTEGER", null, true));
                linkedHashMap2.put("required_network_request", new ha.f(0, 1, "required_network_request", "BLOB", "x''", true));
                linkedHashMap2.put("requires_charging", new ha.f(0, 1, "requires_charging", "INTEGER", null, true));
                linkedHashMap2.put("requires_device_idle", new ha.f(0, 1, "requires_device_idle", "INTEGER", null, true));
                linkedHashMap2.put("requires_battery_not_low", new ha.f(0, 1, "requires_battery_not_low", "INTEGER", null, true));
                linkedHashMap2.put("requires_storage_not_low", new ha.f(0, 1, "requires_storage_not_low", "INTEGER", null, true));
                linkedHashMap2.put("trigger_content_update_delay", new ha.f(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
                linkedHashMap2.put("trigger_max_content_delay", new ha.f(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
                linkedHashMap2.put("content_uri_triggers", new ha.f(0, 1, "content_uri_triggers", "BLOB", null, true));
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                linkedHashSet4.add(new ha.h("index_WorkSpec_schedule_requested_at", false, va.a.R("schedule_requested_at"), va.a.R("ASC")));
                linkedHashSet4.add(new ha.h("index_WorkSpec_last_enqueue_time", false, va.a.R("last_enqueue_time"), va.a.R("ASC")));
                ha.i iVar2 = new ha.i("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
                ha.i iVarX2 = a.a.X(aVar, "WorkSpec");
                if (!iVar2.equals(iVarX2)) {
                    return new androidx.media3.common.q("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + iVar2 + "\n Found:\n" + iVarX2, false);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("tag", new ha.f(1, 1, "tag", "TEXT", null, true));
                linkedHashMap3.put("work_spec_id", new ha.f(2, 1, "work_spec_id", "TEXT", null, true));
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                linkedHashSet5.add(new ha.g("WorkSpec", "CASCADE", "CASCADE", va.a.R("work_spec_id"), va.a.R("id")));
                LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                linkedHashSet6.add(new ha.h("index_WorkTag_work_spec_id", false, va.a.R("work_spec_id"), va.a.R("ASC")));
                ha.i iVar3 = new ha.i("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
                ha.i iVarX3 = a.a.X(aVar, "WorkTag");
                if (!iVar3.equals(iVarX3)) {
                    return new androidx.media3.common.q("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + iVar3 + "\n Found:\n" + iVarX3, false);
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("work_spec_id", new ha.f(1, 1, "work_spec_id", "TEXT", null, true));
                linkedHashMap4.put("generation", new ha.f(2, 1, "generation", "INTEGER", "0", true));
                linkedHashMap4.put("system_id", new ha.f(0, 1, "system_id", "INTEGER", null, true));
                LinkedHashSet linkedHashSet7 = new LinkedHashSet();
                linkedHashSet7.add(new ha.g("WorkSpec", "CASCADE", "CASCADE", va.a.R("work_spec_id"), va.a.R("id")));
                ha.i iVar4 = new ha.i("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
                ha.i iVarX4 = a.a.X(aVar, "SystemIdInfo");
                if (!iVar4.equals(iVarX4)) {
                    return new androidx.media3.common.q("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + iVar4 + "\n Found:\n" + iVarX4, false);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                linkedHashMap5.put("name", new ha.f(1, 1, "name", "TEXT", null, true));
                linkedHashMap5.put("work_spec_id", new ha.f(2, 1, "work_spec_id", "TEXT", null, true));
                LinkedHashSet linkedHashSet8 = new LinkedHashSet();
                linkedHashSet8.add(new ha.g("WorkSpec", "CASCADE", "CASCADE", va.a.R("work_spec_id"), va.a.R("id")));
                LinkedHashSet linkedHashSet9 = new LinkedHashSet();
                linkedHashSet9.add(new ha.h("index_WorkName_work_spec_id", false, va.a.R("work_spec_id"), va.a.R("ASC")));
                ha.i iVar5 = new ha.i("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
                ha.i iVarX5 = a.a.X(aVar, "WorkName");
                if (!iVar5.equals(iVarX5)) {
                    return new androidx.media3.common.q("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + iVar5 + "\n Found:\n" + iVarX5, false);
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                linkedHashMap6.put("work_spec_id", new ha.f(1, 1, "work_spec_id", "TEXT", null, true));
                linkedHashMap6.put("progress", new ha.f(0, 1, "progress", "BLOB", null, true));
                LinkedHashSet linkedHashSet10 = new LinkedHashSet();
                linkedHashSet10.add(new ha.g("WorkSpec", "CASCADE", "CASCADE", va.a.R("work_spec_id"), va.a.R("id")));
                ha.i iVar6 = new ha.i("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
                ha.i iVarX6 = a.a.X(aVar, "WorkProgress");
                if (!iVar6.equals(iVarX6)) {
                    return new androidx.media3.common.q("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + iVar6 + "\n Found:\n" + iVarX6, false);
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                linkedHashMap7.put("key", new ha.f(1, 1, "key", "TEXT", null, true));
                linkedHashMap7.put("long_value", new ha.f(0, 1, "long_value", "INTEGER", null, false));
                ha.i iVar7 = new ha.i("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
                ha.i iVarX7 = a.a.X(aVar, "Preference");
                if (iVar7.equals(iVarX7)) {
                    return new androidx.media3.common.q((String) null, true);
                }
                return new androidx.media3.common.q("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + iVar7 + "\n Found:\n" + iVarX7, false);
            case 1:
                return w(aVar);
            case 2:
                kotlin.jvm.internal.m.e(aVar, "connection");
                LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                linkedHashMap8.put("id", new ha.f(1, 1, "id", "INTEGER", null, true));
                linkedHashMap8.put("surah_owner_id", new ha.f(0, 1, "surah_owner_id", "INTEGER", null, true));
                linkedHashMap8.put("is_from_catalog", new ha.f(0, 1, "is_from_catalog", "INTEGER", null, true));
                linkedHashMap8.put("collection_id", new ha.f(0, 1, "collection_id", "INTEGER", null, false));
                linkedHashMap8.put("added_at", new ha.f(0, 1, "added_at", "INTEGER", null, true));
                ha.i iVar8 = new ha.i("favorites_data", linkedHashMap8, new LinkedHashSet(), new LinkedHashSet());
                ha.i iVarX8 = a.a.X(aVar, "favorites_data");
                if (iVar8.equals(iVarX8)) {
                    return new androidx.media3.common.q((String) null, true);
                }
                return new androidx.media3.common.q("favorites_data(com.mchutov.quranify.favoriters.data.model.FavoritesData).\n Expected:\n" + iVar8 + "\n Found:\n" + iVarX8, false);
            default:
                kotlin.jvm.internal.m.e(aVar, "connection");
                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                linkedHashMap9.put("episode_id", new ha.f(1, 1, "episode_id", "INTEGER", null, true));
                linkedHashMap9.put("language", new ha.f(2, 1, "language", "TEXT", null, true));
                linkedHashMap9.put("position_ms", new ha.f(0, 1, "position_ms", "INTEGER", null, true));
                linkedHashMap9.put("is_completed", new ha.f(0, 1, "is_completed", "INTEGER", null, true));
                linkedHashMap9.put("updated_at", new ha.f(0, 1, "updated_at", "INTEGER", null, true));
                linkedHashMap9.put("needs_upload", new ha.f(0, 1, "needs_upload", "INTEGER", null, true));
                ha.i iVar9 = new ha.i("audio_story_progress", linkedHashMap9, new LinkedHashSet(), new LinkedHashSet());
                ha.i iVarX9 = a.a.X(aVar, "audio_story_progress");
                if (!iVar9.equals(iVarX9)) {
                    return new androidx.media3.common.q("audio_story_progress(com.mchutov.quranify.audiostories.data.source.local.model.AudioStoryProgressData).\n Expected:\n" + iVar9 + "\n Found:\n" + iVarX9, false);
                }
                LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                linkedHashMap10.put("episode_id", new ha.f(1, 1, "episode_id", "INTEGER", null, true));
                linkedHashMap10.put("language", new ha.f(2, 1, "language", "TEXT", null, true));
                linkedHashMap10.put("story_id", new ha.f(0, 1, "story_id", "INTEGER", null, true));
                linkedHashMap10.put("label", new ha.f(0, 1, "label", "TEXT", null, true));
                linkedHashMap10.put("version", new ha.f(0, 1, "version", "INTEGER", null, true));
                linkedHashMap10.put("duration_ms", new ha.f(0, 1, "duration_ms", "INTEGER", null, true));
                linkedHashMap10.put("audio_path", new ha.f(0, 1, "audio_path", "TEXT", null, true));
                linkedHashMap10.put("transcript_path", new ha.f(0, 1, "transcript_path", "TEXT", null, false));
                linkedHashMap10.put("size_bytes", new ha.f(0, 1, "size_bytes", "INTEGER", null, true));
                linkedHashMap10.put("downloaded_at", new ha.f(0, 1, "downloaded_at", "INTEGER", null, true));
                ha.i iVar10 = new ha.i("audio_story_download", linkedHashMap10, new LinkedHashSet(), new LinkedHashSet());
                ha.i iVarX10 = a.a.X(aVar, "audio_story_download");
                if (!iVar10.equals(iVarX10)) {
                    return new androidx.media3.common.q("audio_story_download(com.mchutov.quranify.audiostories.data.source.local.model.AudioStoryDownloadData).\n Expected:\n" + iVar10 + "\n Found:\n" + iVarX10, false);
                }
                LinkedHashMap linkedHashMap11 = new LinkedHashMap();
                linkedHashMap11.put("id", new ha.f(1, 1, "id", "INTEGER", null, true));
                linkedHashMap11.put("event_id", new ha.f(0, 1, "event_id", "TEXT", null, true));
                linkedHashMap11.put("session_id", new ha.f(0, 1, "session_id", "TEXT", null, true));
                linkedHashMap11.put("story_id", new ha.f(0, 1, "story_id", "INTEGER", null, true));
                linkedHashMap11.put("episode_id", new ha.f(0, 1, "episode_id", "INTEGER", null, true));
                linkedHashMap11.put("language", new ha.f(0, 1, "language", "TEXT", null, true));
                linkedHashMap11.put("event_type", new ha.f(0, 1, "event_type", "TEXT", null, true));
                linkedHashMap11.put("position_ms", new ha.f(0, 1, "position_ms", "INTEGER", null, true));
                linkedHashMap11.put("seek_from_ms", new ha.f(0, 1, "seek_from_ms", "INTEGER", null, false));
                linkedHashMap11.put("listened_ms", new ha.f(0, 1, "listened_ms", "INTEGER", null, true));
                linkedHashMap11.put("playback_rate_times_100", new ha.f(0, 1, "playback_rate_times_100", "INTEGER", null, true));
                linkedHashMap11.put("is_offline", new ha.f(0, 1, "is_offline", "INTEGER", null, true));
                linkedHashMap11.put("utc_offset_minutes", new ha.f(0, 1, "utc_offset_minutes", "INTEGER", null, true));
                linkedHashMap11.put("occurred_at", new ha.f(0, 1, "occurred_at", "TEXT", null, true));
                linkedHashMap11.put("source", new ha.f(0, 1, "source", "TEXT", null, false));
                linkedHashMap11.put("recorded_elapsed_ms", new ha.f(0, 1, "recorded_elapsed_ms", "INTEGER", null, true));
                linkedHashMap11.put("boot_count", new ha.f(0, 1, "boot_count", "INTEGER", null, true));
                ha.i iVar11 = new ha.i("audio_story_event_queue", linkedHashMap11, new LinkedHashSet(), new LinkedHashSet());
                ha.i iVarX11 = a.a.X(aVar, "audio_story_event_queue");
                if (iVar11.equals(iVarX11)) {
                    return new androidx.media3.common.q((String) null, true);
                }
                return new androidx.media3.common.q("audio_story_event_queue(com.mchutov.quranify.audiostories.data.source.local.model.AudioStoryEventData).\n Expected:\n" + iVar11 + "\n Found:\n" + iVarX11, false);
        }
    }
}
