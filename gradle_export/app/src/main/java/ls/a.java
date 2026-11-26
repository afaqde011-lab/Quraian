package ls;

import kotlin.jvm.internal.m;

public final class a extends fa.a {
    public final int c;

    public a(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    public final void b(na.a db) {
        switch (this.c) {
            case 0:
                m.e(db, "db");
                db.o("CREATE TABLE IF NOT EXISTS `listening_event_queue` (\n`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n`event_id` TEXT NOT NULL,\n`session_id` TEXT NOT NULL,\n`track_id` INTEGER NOT NULL,\n`event_type` TEXT NOT NULL,\n`position_ms` INTEGER NOT NULL,\n`listened_ms` INTEGER NOT NULL,\n`utc_offset_minutes` INTEGER NOT NULL,\n`occurred_at` TEXT NOT NULL,\n`background_sound_id` TEXT,\n`background_volume_times_1000` INTEGER,\n`reciter_id` INTEGER,\n`surah_number` INTEGER,\n`recorded_elapsed_ms` INTEGER,\n`boot_count` INTEGER)");
                db.o("CREATE TABLE IF NOT EXISTS `listening_summary` (\n`history_days` INTEGER NOT NULL,\n`summary` TEXT NOT NULL,\n`saved_at` INTEGER NOT NULL,\nPRIMARY KEY(`history_days`))");
                db.o("CREATE TABLE IF NOT EXISTS `listening_year` (\n`year` INTEGER NOT NULL,\n`days` TEXT NOT NULL,\n`saved_at` INTEGER NOT NULL,\nPRIMARY KEY(`year`))");
                break;
            case 1:
                m.e(db, "db");
                db.o("PRAGMA foreign_keys=OFF");
                db.o("DROP TABLE IF EXISTS favorites_data");
                db.o("DROP TABLE IF EXISTS reciters_id_data");
                db.o("CREATE TABLE IF NOT EXISTS favorites_data (\n    id INTEGER NOT NULL,\n    surah_owner_id INTEGER NOT NULL,\n    is_from_catalog INTEGER NOT NULL,\n    collection_id INTEGER,\n    PRIMARY KEY(id)\n)");
                db.o("PRAGMA foreign_keys=ON");
                break;
            case 2:
                m.e(db, "db");
                db.o("ALTER TABLE favorites_data ADD COLUMN added_at INTEGER NOT NULL DEFAULT 0");
                db.o("UPDATE favorites_data SET added_at = rowid");
                break;
            case 3:
                m.e(db, "db");
                db.o("CREATE TABLE IF NOT EXISTS audio_story_download (\n    episode_id INTEGER NOT NULL,\n    language TEXT NOT NULL,\n    story_id INTEGER NOT NULL,\n    label TEXT NOT NULL,\n    version INTEGER NOT NULL,\n    duration_ms INTEGER NOT NULL,\n    audio_path TEXT NOT NULL,\n    transcript_path TEXT,\n    size_bytes INTEGER NOT NULL,\n    downloaded_at INTEGER NOT NULL,\n    PRIMARY KEY(episode_id, language)\n)");
                break;
            default:
                m.e(db, "db");
                db.o("CREATE TABLE IF NOT EXISTS audio_story_event_queue (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    event_id TEXT NOT NULL,\n    session_id TEXT NOT NULL,\n    story_id INTEGER NOT NULL,\n    episode_id INTEGER NOT NULL,\n    language TEXT NOT NULL,\n    event_type TEXT NOT NULL,\n    position_ms INTEGER NOT NULL,\n    seek_from_ms INTEGER,\n    listened_ms INTEGER NOT NULL,\n    playback_rate_times_100 INTEGER NOT NULL,\n    is_offline INTEGER NOT NULL,\n    utc_offset_minutes INTEGER NOT NULL,\n    occurred_at TEXT NOT NULL,\n    source TEXT,\n    recorded_elapsed_ms INTEGER NOT NULL,\n    boot_count INTEGER NOT NULL\n)");
                break;
        }
    }
}
