package tf;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.k5;
import com.google.android.gms.internal.measurement.m8;
import com.google.protobuf.RuntimeVersion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public final class m extends t3 {
    public static final String[] G = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] H = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] I = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] J = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};
    public static final String[] K = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] L = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] M = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] N = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] O = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] P = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] Q = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    public final l E;
    public final a8.i0 F;

    public m(y3 y3Var) {
        super(y3Var);
        this.F = new a8.i0(((h1) this.B).K);
        ((h1) this.B).getClass();
        this.E = new l(this, ((h1) this.B).A);
    }

    public static final void E1(ContentValues contentValues, Object obj) {
        com.google.android.gms.common.internal.d0.e("value");
        com.google.android.gms.common.internal.d0.h(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    public static final String y1(List list) {
        return list.isEmpty() ? RuntimeVersion.SUFFIX : a1.b.p(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public final t1 A1(String str) {
        com.google.android.gms.common.internal.d0.h(str);
        V0();
        W0();
        return t1.c(100, r1("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final q B1(String str, com.google.android.gms.internal.measurement.a3 a3Var, String str2) {
        q qVarT1 = t1("events", str, a3Var.s());
        if (qVarT1 != null) {
            long j9 = qVarT1.f14687e + 1;
            long j10 = qVarT1.f14686d + 1;
            return new q(qVarT1.f14683a, qVarT1.f14684b, qVarT1.f14685c + 1, j10, j9, qVarT1.f14688f, qVarT1.f14689g, qVarT1.f14690h, qVarT1.f14691i, qVarT1.f14692j, qVarT1.f14693k);
        }
        h1 h1Var = (h1) this.B;
        q0 q0Var = h1Var.F;
        h1.g(q0Var);
        q0Var.J.d("Event aggregate wasn't created during raw event logging. appId, event", q0.d1(str), h1Var.J.a(str2));
        return new q(str, a3Var.s(), 1L, 1L, 1L, a3Var.u(), 0L, null, null, null, null);
    }

    public final boolean C1() {
        return ((h1) this.B).A.getDatabasePath("google_app_measurement.db").exists();
    }

    public final void D1(String str, long j9, long j10, bb.d dVar) throws Throwable {
        ?? r10;
        ?? r4;
        Cursor cursorRawQuery;
        String[] strArr;
        String string;
        ?? r7;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String str2;
        long j11;
        com.google.android.gms.internal.measurement.z2 z2Var;
        long jG1;
        long j12;
        String string2;
        h1 h1Var = (h1) this.B;
        V0();
        W0();
        Cursor cursorQuery = null;
        cursorQuery = null;
        ?? r11 = 0;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseK1 = K1();
                ?? IsEmpty = TextUtils.isEmpty(str);
                String str3 = RuntimeVersion.SUFFIX;
                try {
                    if (IsEmpty != 0) {
                        String[] strArr5 = j10 != -1 ? new String[]{String.valueOf(j10), String.valueOf(j9)} : new String[]{String.valueOf(j9)};
                        if (j10 != -1) {
                            str3 = "rowid <= ? and ";
                        }
                        StringBuilder sb2 = new StringBuilder(str3.length() + 148);
                        sb2.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb2.append(str3);
                        sb2.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseK1.rawQuery(sb2.toString(), strArr5);
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                string2 = cursorRawQuery.getString(0);
                                try {
                                    string = cursorRawQuery.getString(1);
                                    cursorRawQuery.close();
                                    r7 = string2;
                                    cursorRawQuery = sQLiteDatabaseK1.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r7, string}, null, null, "rowid", "2");
                                    if (cursorRawQuery.moveToFirst()) {
                                        try {
                                            com.google.android.gms.internal.measurement.i3 i3Var = (com.google.android.gms.internal.measurement.i3) ((com.google.android.gms.internal.measurement.h3) t0.I1(com.google.android.gms.internal.measurement.i3.U(), cursorRawQuery.getBlob(0))).e();
                                            if (cursorRawQuery.moveToNext()) {
                                                q0 q0Var = h1Var.F;
                                                h1.g(q0Var);
                                                q0Var.J.c(q0.d1(r7), "Get multiple raw event metadata records, expected one. appId");
                                            }
                                            cursorRawQuery.close();
                                            dVar.B = i3Var;
                                            if (h1Var.D.f1(null, b0.f14577k1)) {
                                                jG1 = G1("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r7, string}, -1L);
                                                if (j10 == -1) {
                                                    j12 = j10;
                                                } else if (jG1 != -1) {
                                                    j12 = -1;
                                                } else {
                                                    strArr2 = new String[]{r7, string};
                                                    strArr4 = strArr2;
                                                    str2 = "app_id = ? and metadata_fingerprint = ?";
                                                }
                                                if (j12 == -1 && jG1 != -1) {
                                                    jG1 = Math.min(j12, jG1);
                                                } else if (j12 != -1) {
                                                    jG1 = j12;
                                                }
                                                strArr3 = new String[]{r7, string, String.valueOf(jG1)};
                                                strArr4 = strArr3;
                                                str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                            } else if (j10 != -1) {
                                                strArr3 = new String[]{r7, string, String.valueOf(j10)};
                                                strArr4 = strArr3;
                                                str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                            } else {
                                                strArr2 = new String[]{r7, string};
                                                strArr4 = strArr2;
                                                str2 = "app_id = ? and metadata_fingerprint = ?";
                                            }
                                            cursorQuery = sQLiteDatabaseK1.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str2, strArr4, null, null, "rowid", null);
                                            try {
                                                if (cursorQuery.moveToFirst()) {
                                                    do {
                                                        j11 = cursorQuery.getLong(0);
                                                        try {
                                                            z2Var = (com.google.android.gms.internal.measurement.z2) t0.I1(com.google.android.gms.internal.measurement.a3.z(), cursorQuery.getBlob(3));
                                                            String string3 = cursorQuery.getString(1);
                                                            z2Var.b();
                                                            ((com.google.android.gms.internal.measurement.a3) z2Var.B).F(string3);
                                                            long j13 = cursorQuery.getLong(2);
                                                            z2Var.b();
                                                            ((com.google.android.gms.internal.measurement.a3) z2Var.B).G(j13);
                                                            if (!dVar.z(j11, (com.google.android.gms.internal.measurement.a3) z2Var.e())) {
                                                                break;
                                                            }
                                                        } catch (IOException e3) {
                                                            q0 q0Var2 = h1Var.F;
                                                            h1.g(q0Var2);
                                                            q0Var2.G.d("Data loss. Failed to merge raw event. appId", q0.d1(r7), e3);
                                                        }
                                                    } while (cursorQuery.moveToNext());
                                                } else {
                                                    q0 q0Var3 = h1Var.F;
                                                    h1.g(q0Var3);
                                                    q0Var3.J.c(q0.d1(r7), "Raw event data disappeared while in transaction. appId");
                                                }
                                            } catch (SQLiteException e10) {
                                                e = e10;
                                                r4 = r7;
                                                q0 q0Var4 = h1Var.F;
                                                h1.g(q0Var4);
                                                q0Var4.G.d("Data loss. Error selecting raw event. appId", q0.d1(r4), e);
                                            }
                                            cursorRawQuery = cursorQuery;
                                        } catch (IOException e11) {
                                            q0 q0Var5 = h1Var.F;
                                            h1.g(q0Var5);
                                            q0Var5.G.d("Data loss. Failed to merge raw event metadata. appId", q0.d1(r7), e11);
                                        }
                                    } else {
                                        q0 q0Var6 = h1Var.F;
                                        h1.g(q0Var6);
                                        q0Var6.G.c(q0.d1(r7), "Raw event metadata record is missing. appId");
                                    }
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    cursorQuery = cursorRawQuery;
                                    r4 = string2;
                                    q0 q0Var7 = h1Var.F;
                                    h1.g(q0Var7);
                                    q0Var7.G.d("Data loss. Error selecting raw event. appId", q0.d1(r4), e);
                                    cursorRawQuery = cursorQuery;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                }
                            }
                        } catch (SQLiteException e13) {
                            e = e13;
                            string2 = str;
                        }
                    } else {
                        try {
                            if (j10 != -1) {
                                String str4 = str;
                                strArr = new String[]{str4, String.valueOf(j10)};
                                IsEmpty = str4;
                            } else {
                                String str5 = str;
                                strArr = new String[]{str5};
                                IsEmpty = str5;
                            }
                            if (j10 != -1) {
                                str3 = " and rowid <= ?";
                            }
                            StringBuilder sb3 = new StringBuilder(str3.length() + 84);
                            sb3.append("select metadata_fingerprint from raw_events where app_id = ?");
                            sb3.append(str3);
                            sb3.append(" order by rowid limit 1;");
                            cursorRawQuery = sQLiteDatabaseK1.rawQuery(sb3.toString(), strArr);
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    string = cursorRawQuery.getString(0);
                                    cursorRawQuery.close();
                                    r7 = IsEmpty;
                                    cursorRawQuery = sQLiteDatabaseK1.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r7, string}, null, null, "rowid", "2");
                                    if (cursorRawQuery.moveToFirst()) {
                                        q0 q0Var8 = h1Var.F;
                                        h1.g(q0Var8);
                                        q0Var8.G.c(q0.d1(r7), "Raw event metadata record is missing. appId");
                                    } else {
                                        com.google.android.gms.internal.measurement.i3 i3Var2 = (com.google.android.gms.internal.measurement.i3) ((com.google.android.gms.internal.measurement.h3) t0.I1(com.google.android.gms.internal.measurement.i3.U(), cursorRawQuery.getBlob(0))).e();
                                        if (cursorRawQuery.moveToNext()) {
                                            q0 q0Var9 = h1Var.F;
                                            h1.g(q0Var9);
                                            q0Var9.J.c(q0.d1(r7), "Get multiple raw event metadata records, expected one. appId");
                                        }
                                        cursorRawQuery.close();
                                        dVar.B = i3Var2;
                                        if (h1Var.D.f1(null, b0.f14577k1)) {
                                            jG1 = G1("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r7, string}, -1L);
                                            if (j10 == -1) {
                                                j12 = j10;
                                            } else if (jG1 != -1) {
                                                j12 = -1;
                                            } else {
                                                strArr2 = new String[]{r7, string};
                                                strArr4 = strArr2;
                                                str2 = "app_id = ? and metadata_fingerprint = ?";
                                            }
                                            if (j12 == -1) {
                                                if (j12 != -1) {
                                                    jG1 = j12;
                                                }
                                            } else if (j12 != -1) {
                                                jG1 = j12;
                                            }
                                            strArr3 = new String[]{r7, string, String.valueOf(jG1)};
                                            strArr4 = strArr3;
                                            str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        } else if (j10 != -1) {
                                            strArr3 = new String[]{r7, string, String.valueOf(j10)};
                                            strArr4 = strArr3;
                                            str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        } else {
                                            strArr2 = new String[]{r7, string};
                                            strArr4 = strArr2;
                                            str2 = "app_id = ? and metadata_fingerprint = ?";
                                        }
                                        cursorQuery = sQLiteDatabaseK1.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str2, strArr4, null, null, "rowid", null);
                                        if (cursorQuery.moveToFirst()) {
                                            do {
                                                j11 = cursorQuery.getLong(0);
                                                z2Var = (com.google.android.gms.internal.measurement.z2) t0.I1(com.google.android.gms.internal.measurement.a3.z(), cursorQuery.getBlob(3));
                                                String string4 = cursorQuery.getString(1);
                                                z2Var.b();
                                                ((com.google.android.gms.internal.measurement.a3) z2Var.B).F(string4);
                                                long j14 = cursorQuery.getLong(2);
                                                z2Var.b();
                                                ((com.google.android.gms.internal.measurement.a3) z2Var.B).G(j14);
                                                if (!dVar.z(j11, (com.google.android.gms.internal.measurement.a3) z2Var.e())) {
                                                    break;
                                                    break;
                                                }
                                            } while (cursorQuery.moveToNext());
                                        } else {
                                            q0 q0Var10 = h1Var.F;
                                            h1.g(q0Var10);
                                            q0Var10.J.c(q0.d1(r7), "Raw event data disappeared while in transaction. appId");
                                        }
                                        cursorRawQuery = cursorQuery;
                                    }
                                }
                            } catch (SQLiteException e14) {
                                e = e14;
                                cursorQuery = cursorRawQuery;
                                r10 = IsEmpty;
                                r4 = r10;
                                q0 q0Var11 = h1Var.F;
                                h1.g(q0Var11);
                                q0Var11.G.d("Data loss. Error selecting raw event. appId", q0.d1(r4), e);
                                cursorRawQuery = cursorQuery;
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                            }
                        } catch (SQLiteException e15) {
                            e = e15;
                            r10 = IsEmpty;
                        }
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r11 = " order by rowid limit 1;";
                    if (r11 != 0) {
                        r11.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (SQLiteException e16) {
            e = e16;
            r10 = str;
        }
    }

    public final long F1(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = K1().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j9 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j9;
            } catch (SQLiteException e3) {
                q0 q0Var = ((h1) this.B).F;
                h1.g(q0Var);
                q0Var.G.d("Database error", str, e3);
                throw e3;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final long G1(String str, String[] strArr, long j9) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = K1().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j9 = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j9;
            } catch (SQLiteException e3) {
                q0 q0Var = ((h1) this.B).F;
                h1.g(q0Var);
                q0Var.G.d("Database error", str, e3);
                throw e3;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    public final void H1() {
        W0();
        K1().beginTransaction();
    }

    public final void I1() {
        W0();
        K1().setTransactionSuccessful();
    }

    public final void J1() {
        W0();
        K1().endTransaction();
    }

    public final SQLiteDatabase K1() {
        V0();
        try {
            return this.E.getWritableDatabase();
        } catch (SQLiteException e3) {
            q0 q0Var = ((h1) this.B).F;
            h1.g(q0Var);
            q0Var.J.c(e3, "Error opening database");
            throw e3;
        }
    }

    public final void L1(String str) {
        q qVarT1;
        v1("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = K1().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (qVarT1 = t1("events", str, string)) != null) {
                            u1("events_snapshot", qVarT1);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e3) {
                q0 q0Var = ((h1) this.B).F;
                h1.g(q0Var);
                q0Var.G.d("Error creating snapshot. appId", q0.d1(str), e3);
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public final void M1(String str) throws Throwable {
        boolean z10;
        q qVarT1;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        q qVarT2 = t1("events", str, "_f");
        q qVarT3 = t1("events", str, "_v");
        v1("events", str);
        Cursor cursorQuery = null;
        boolean z11 = false;
        try {
            cursorQuery = K1().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z12 = false;
                z10 = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z12 = true;
                            } else if ("_v".equals(string)) {
                                z10 = true;
                            }
                        }
                        if (string != null && (qVarT1 = t1("events_snapshot", str, string)) != null) {
                            u1("events", qVarT1);
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        z11 = z12;
                        try {
                            q0 q0Var = ((h1) this.B).F;
                            h1.g(q0Var);
                            q0Var.G.d("Error querying snapshot. appId", q0.d1(str), e);
                            z12 = z11;
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z11 && qVarT2 != null) {
                                u1("events", qVarT2);
                            } else if (!z10 && qVarT3 != null) {
                                u1("events", qVarT3);
                            }
                            v1("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z11 = z12;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z11) {
                            if (!z10) {
                                u1("events", qVarT3);
                            }
                        } else if (!z10) {
                            u1("events", qVarT3);
                        }
                        v1("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z12 && qVarT2 != null) {
                    u1("events", qVarT2);
                } else if (!z10 && qVarT3 != null) {
                    u1("events", qVarT3);
                }
            } else {
                cursorQuery.close();
                if (qVarT2 != null) {
                    u1("events", qVarT2);
                } else if (qVarT3 != null) {
                    u1("events", qVarT3);
                }
            }
        } catch (SQLiteException e10) {
            e = e10;
            z10 = false;
        } catch (Throwable th4) {
            th = th4;
            z10 = false;
        }
        v1("events_snapshot", str);
    }

    public final void N1(String str, String str2) {
        com.google.android.gms.common.internal.d0.e(str);
        com.google.android.gms.common.internal.d0.e(str2);
        V0();
        W0();
        try {
            K1().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e3) {
            h1 h1Var = (h1) this.B;
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.G.e("Error deleting user property. appId", q0.d1(str), h1Var.J.c(str2), e3);
        }
    }

    public final boolean O1(c4 c4Var) {
        h1 h1Var = (h1) this.B;
        String str = c4Var.f14609b;
        V0();
        W0();
        String str2 = c4Var.f14608a;
        String str3 = c4Var.f14610c;
        if (P1(str2, str3) == null) {
            if (e4.T1(str3)) {
                if (F1("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(h1Var.D.d1(str2, b0.V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jF1 = F1("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                h1Var.getClass();
                if (jF1 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(c4Var.f14611d));
        E1(contentValues, c4Var.f14612e);
        try {
            if (K1().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.G.c(q0.d1(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e3) {
            q0 q0Var2 = h1Var.F;
            h1.g(q0Var2);
            q0Var2.G.d("Error storing user property. appId", q0.d1(str2), e3);
            return true;
        }
    }

    public final c4 P1(String str, String str2) throws Throwable {
        Throwable th2;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        h1 h1Var = (h1) this.B;
        com.google.android.gms.common.internal.d0.e(str);
        com.google.android.gms.common.internal.d0.e(str2);
        V0();
        W0();
        Cursor cursor = null;
        try {
            cursorQuery = K1().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j9 = cursorQuery.getLong(0);
                        Object objI1 = i1(cursorQuery, 1);
                        if (objI1 != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                c4 c4Var = new c4(str3, cursorQuery.getString(2), str4, j9, objI1);
                                if (cursorQuery.moveToNext()) {
                                    q0 q0Var = h1Var.F;
                                    h1.g(q0Var);
                                    q0Var.G.c(q0.d1(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursorQuery.close();
                                return c4Var;
                            } catch (SQLiteException e3) {
                                e = e3;
                            }
                        }
                        sQLiteException = e;
                        q0 q0Var2 = h1Var.F;
                        h1.g(q0Var2);
                        q0Var2.G.e("Error querying user property. appId", q0.d1(str3), h1Var.J.c(str4), sQLiteException);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        throw th2;
                    }
                    cursor.close();
                    throw th2;
                }
            } catch (SQLiteException e10) {
                e = e10;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e11) {
            str3 = str;
            str4 = str2;
            sQLiteException = e11;
            cursorQuery = null;
        } catch (Throwable th4) {
            th2 = th4;
            if (cursor != null) {
                throw th2;
            }
            cursor.close();
            throw th2;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final List Q1(String str) {
        String str2;
        SQLiteException sQLiteException;
        h1 h1Var = (h1) this.B;
        com.google.android.gms.common.internal.d0.e(str);
        V0();
        W0();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                h1Var.getClass();
                cursorQuery = K1().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    while (true) {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        if (string2 == null) {
                            string2 = RuntimeVersion.SUFFIX;
                        }
                        String str3 = string2;
                        long j9 = cursorQuery.getLong(2);
                        Object objI1 = i1(cursorQuery, 3);
                        if (objI1 == null) {
                            try {
                                q0 q0Var = h1Var.F;
                                h1.g(q0Var);
                                q0Var.G.c(q0.d1(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } catch (SQLiteException e3) {
                                sQLiteException = e3;
                                str2 = str;
                                q0 q0Var2 = h1Var.F;
                                h1.g(q0Var2);
                                q0Var2.G.d("Error querying user properties. appId", q0.d1(str2), sQLiteException);
                                arrayList = Collections.EMPTY_LIST;
                            }
                        } else {
                            str2 = str;
                            arrayList.add(new c4(str2, str3, string, j9, objI1));
                        }
                        try {
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            str = str2;
                        } catch (SQLiteException e10) {
                            e = e10;
                            sQLiteException = e;
                            q0 q0Var3 = h1Var.F;
                            h1.g(q0Var3);
                            q0Var3.G.d("Error querying user properties. appId", q0.d1(str2), sQLiteException);
                            arrayList = Collections.EMPTY_LIST;
                        }
                    }
                }
            } finally {
                if (0 != 0) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e11) {
            e = e11;
            str2 = str;
        }
        return arrayList;
    }

    public final List R1(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String str4;
        Cursor cursorQuery;
        String str5;
        h1 h1Var = (h1) this.B;
        com.google.android.gms.common.internal.d0.e(str);
        V0();
        W0();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb2 = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb2.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb3.append(str3);
                sb3.append("*");
                arrayList2.add(sb3.toString());
                sb2.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String string = sb2.toString();
            h1Var.getClass();
            q0 q0Var = h1Var.F;
            cursorQuery = K1().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                if (arrayList.size() >= 1000) {
                                    h1.g(q0Var);
                                    q0Var.G.c(1000, "Read more than the max allowed user properties, ignoring excess");
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j9 = cursorQuery.getLong(1);
                                Object objI1 = i1(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objI1 == null) {
                                    try {
                                        h1.g(q0Var);
                                        q0Var.G.e("(2)Read invalid user property value, ignoring it", q0.d1(str6), string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                        str5 = string3;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        try {
                                            q0 q0Var2 = h1Var.F;
                                            h1.g(q0Var2);
                                            q0Var2.G.e("(2)Error querying user properties", q0.d1(str), str4, e);
                                            arrayList = Collections.EMPTY_LIST;
                                            cursorQuery = cursor;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            return arrayList;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    str5 = string3;
                                    arrayList.add(new c4(str, str5, string2, j9, objI1));
                                }
                                try {
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str6 = str;
                                    str4 = str5;
                                } catch (SQLiteException e10) {
                                    e = e10;
                                    cursor = cursorQuery;
                                    str4 = str5;
                                    q0 q0Var3 = h1Var.F;
                                    h1.g(q0Var3);
                                    q0Var3.G.e("(2)Error querying user properties", q0.d1(str), str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                    cursorQuery = cursor;
                                }
                            } catch (SQLiteException e11) {
                                e = e11;
                                cursor = cursorQuery;
                                q0 q0Var4 = h1Var.F;
                                h1.g(q0Var4);
                                q0Var4.G.e("(2)Error querying user properties", q0.d1(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                cursorQuery = cursor;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e12) {
                e = e12;
                str4 = str2;
            }
        } catch (SQLiteException e13) {
            e = e13;
            str4 = str2;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    public final boolean S1(e eVar) {
        h1 h1Var = (h1) this.B;
        V0();
        W0();
        String str = eVar.A;
        com.google.android.gms.common.internal.d0.h(str);
        if (P1(str, eVar.C.B) == null) {
            long jF1 = F1("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            h1Var.getClass();
            if (jF1 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", eVar.B);
        contentValues.put("name", eVar.C.B);
        Object objA = eVar.C.a();
        com.google.android.gms.common.internal.d0.h(objA);
        E1(contentValues, objA);
        contentValues.put("active", Boolean.valueOf(eVar.E));
        contentValues.put("trigger_event_name", eVar.F);
        contentValues.put("trigger_timeout", Long.valueOf(eVar.H));
        s sVar = eVar.G;
        e4 e4Var = h1Var.I;
        q0 q0Var = h1Var.F;
        h1.e(e4Var);
        contentValues.put("timed_out_event", e4.z1(sVar));
        contentValues.put("creation_timestamp", Long.valueOf(eVar.D));
        h1.e(e4Var);
        contentValues.put("triggered_event", e4.z1(eVar.I));
        contentValues.put("triggered_timestamp", Long.valueOf(eVar.C.C));
        contentValues.put("time_to_live", Long.valueOf(eVar.J));
        contentValues.put("expired_event", e4.z1(eVar.K));
        try {
            if (K1().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            h1.g(q0Var);
            q0Var.G.c(q0.d1(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e3) {
            h1.g(q0Var);
            q0Var.G.d("Error storing conditional user property", q0.d1(str), e3);
            return true;
        }
    }

    public final e T1(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Cursor cursor;
        h1 h1Var = (h1) this.B;
        com.google.android.gms.common.internal.d0.e(str);
        com.google.android.gms.common.internal.d0.e(str2);
        V0();
        W0();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = K1().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = RuntimeVersion.SUFFIX;
                    }
                    String str4 = string;
                    Object objI1 = i1(cursorQuery, 1);
                    boolean z10 = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j9 = cursorQuery.getLong(4);
                    t0 t0Var = this.C.G;
                    y3.R(t0Var);
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<s> creator = s.CREATOR;
                    s sVar = (s) t0Var.A1(blob, creator);
                    long j10 = cursorQuery.getLong(6);
                    y3.R(t0Var);
                    s sVar2 = (s) t0Var.A1(cursorQuery.getBlob(7), creator);
                    long j11 = cursorQuery.getLong(8);
                    long j12 = cursorQuery.getLong(9);
                    y3.R(t0Var);
                    str3 = str2;
                    try {
                        e eVar = new e(str, str4, new b4(j11, objI1, str3, str4), j10, z10, string2, sVar, j9, sVar2, j12, (s) t0Var.A1(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            q0 q0Var = h1Var.F;
                            h1.g(q0Var);
                            q0Var.G.d("Got multiple records for conditional property, expected one", q0.d1(str), h1Var.J.c(str3));
                        }
                        cursorQuery.close();
                        return eVar;
                    } catch (SQLiteException e3) {
                        e = e3;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    str3 = str2;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            str3 = str2;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        q0 q0Var2 = h1Var.F;
        h1.g(q0Var2);
        q0Var2.G.e("Error querying conditional property", q0.d1(str), h1Var.J.c(str3), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void U1(String str, String str2) {
        com.google.android.gms.common.internal.d0.e(str);
        com.google.android.gms.common.internal.d0.e(str2);
        V0();
        W0();
        try {
            K1().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e3) {
            h1 h1Var = (h1) this.B;
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.G.e("Error deleting conditional property", q0.d1(str), h1Var.J.c(str2), e3);
        }
    }

    public final List V1(String str, String str2, String str3) {
        com.google.android.gms.common.internal.d0.e(str);
        V0();
        W0();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return W1(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final List W1(String str, String[] strArr) {
        h1 h1Var = (h1) this.B;
        V0();
        W0();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                h1Var.getClass();
                cursorQuery = K1().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        if (arrayList.size() >= 1000) {
                            q0 q0Var = h1Var.F;
                            h1.g(q0Var);
                            q0Var.G.c(1000, "Read more than the max allowed conditional properties, ignoring extra");
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objI1 = i1(cursorQuery, 3);
                        boolean z10 = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j9 = cursorQuery.getLong(6);
                        t0 t0Var = this.C.G;
                        y3.R(t0Var);
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<s> creator = s.CREATOR;
                        s sVar = (s) t0Var.A1(blob, creator);
                        long j10 = cursorQuery.getLong(8);
                        y3.R(t0Var);
                        s sVar2 = (s) t0Var.A1(cursorQuery.getBlob(9), creator);
                        long j11 = cursorQuery.getLong(10);
                        long j12 = cursorQuery.getLong(11);
                        y3.R(t0Var);
                        arrayList.add(new e(string, string2, new b4(j11, objI1, string3, string2), j10, z10, string4, sVar, j9, sVar2, j12, (s) t0Var.A1(cursorQuery.getBlob(12), creator)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e3) {
                q0 q0Var2 = h1Var.F;
                h1.g(q0Var2);
                q0Var2.G.c(e3, "Error querying conditional user property value");
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public final u0 X1(String str) throws Throwable {
        Cursor cursorQuery;
        Boolean boolValueOf;
        String string;
        h1 h1Var = (h1) this.B;
        com.google.android.gms.common.internal.d0.e(str);
        V0();
        W0();
        Cursor cursor = null;
        try {
            cursorQuery = K1().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        y3 y3Var = this.C;
                        u0 u0Var = new u0(y3Var.L, str);
                        h1 h1Var2 = u0Var.f14703a;
                        t1 t1VarA = y3Var.a(str);
                        s1 s1Var = s1.ANALYTICS_STORAGE;
                        if (t1VarA.i(s1Var)) {
                            u0Var.F(cursorQuery.getString(0));
                        }
                        boolean z10 = true;
                        u0Var.H(cursorQuery.getString(1));
                        if (y3Var.a(str).i(s1.AD_STORAGE)) {
                            u0Var.I(cursorQuery.getString(2));
                        }
                        u0Var.e(cursorQuery.getLong(3));
                        u0Var.L(cursorQuery.getLong(4));
                        u0Var.M(cursorQuery.getLong(5));
                        u0Var.O(cursorQuery.getString(6));
                        u0Var.R(cursorQuery.getString(7));
                        u0Var.S(cursorQuery.getLong(8));
                        u0Var.a(cursorQuery.getLong(9));
                        u0Var.d(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        u0Var.i(cursorQuery.getLong(11));
                        u0Var.j(cursorQuery.getLong(12));
                        u0Var.k(cursorQuery.getLong(13));
                        u0Var.l(cursorQuery.getLong(14));
                        u0Var.f(cursorQuery.getLong(15));
                        u0Var.g(cursorQuery.getLong(16));
                        u0Var.Q(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        u0Var.K(cursorQuery.getString(18));
                        u0Var.n(cursorQuery.getLong(19));
                        u0Var.m(cursorQuery.getLong(20));
                        u0Var.v(cursorQuery.getString(21));
                        boolean z11 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                        e1 e1Var = h1Var2.G;
                        h1.g(e1Var);
                        e1Var.V0();
                        u0Var.Q |= u0Var.f14716p != z11;
                        u0Var.f14716p = z11;
                        u0Var.c(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            u0Var.x(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (y3Var.a(str).i(s1Var)) {
                            String string2 = cursorQuery.getString(28);
                            e1 e1Var2 = h1Var2.G;
                            h1.g(e1Var2);
                            e1Var2.V0();
                            u0Var.Q |= !Objects.equals(u0Var.f14720t, string2);
                            u0Var.f14720t = string2;
                        }
                        boolean z12 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                        e1 e1Var3 = h1Var2.G;
                        h1.g(e1Var3);
                        e1Var3.V0();
                        u0Var.Q |= u0Var.f14721u != z12;
                        u0Var.f14721u = z12;
                        u0Var.r(cursorQuery.getLong(39));
                        String string3 = cursorQuery.getString(36);
                        e1 e1Var4 = h1Var2.G;
                        h1.g(e1Var4);
                        e1Var4.V0();
                        u0Var.Q |= u0Var.C != string3;
                        u0Var.C = string3;
                        u0Var.z(cursorQuery.getLong(30));
                        u0Var.A(cursorQuery.getLong(31));
                        m8.a();
                        if (h1Var.D.f1(str, b0.P0)) {
                            int i10 = cursorQuery.getInt(32);
                            e1 e1Var5 = h1Var2.G;
                            h1.g(e1Var5);
                            e1Var5.V0();
                            u0Var.Q |= u0Var.f14724x != i10;
                            u0Var.f14724x = i10;
                            u0Var.B(cursorQuery.getLong(35));
                        }
                        boolean z13 = (cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true;
                        e1 e1Var6 = h1Var2.G;
                        h1.g(e1Var6);
                        e1Var6.V0();
                        u0Var.Q |= u0Var.f14725y != z13;
                        u0Var.f14725y = z13;
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        e1 e1Var7 = h1Var2.G;
                        h1.g(e1Var7);
                        e1Var7.V0();
                        u0Var.Q |= !Objects.equals(u0Var.f14717q, boolValueOf);
                        u0Var.f14717q = boolValueOf;
                        u0Var.p(cursorQuery.getInt(37));
                        u0Var.q(cursorQuery.getInt(38));
                        if (cursorQuery.isNull(40)) {
                            string = RuntimeVersion.SUFFIX;
                        } else {
                            string = cursorQuery.getString(40);
                            com.google.android.gms.common.internal.d0.h(string);
                        }
                        e1 e1Var8 = h1Var2.G;
                        h1.g(e1Var8);
                        e1Var8.V0();
                        u0Var.Q |= u0Var.G != string;
                        u0Var.G = string;
                        if (!cursorQuery.isNull(41)) {
                            Long lValueOf = Long.valueOf(cursorQuery.getLong(41));
                            e1 e1Var9 = h1Var2.G;
                            h1.g(e1Var9);
                            e1Var9.V0();
                            u0Var.Q |= !Objects.equals(u0Var.f14726z, lValueOf);
                            u0Var.f14726z = lValueOf;
                        }
                        if (!cursorQuery.isNull(42)) {
                            Long lValueOf2 = Long.valueOf(cursorQuery.getLong(42));
                            e1 e1Var10 = h1Var2.G;
                            h1.g(e1Var10);
                            e1Var10.V0();
                            u0Var.Q |= !Objects.equals(u0Var.A, lValueOf2);
                            u0Var.A = lValueOf2;
                        }
                        byte[] blob = cursorQuery.getBlob(43);
                        e1 e1Var11 = h1Var2.G;
                        h1.g(e1Var11);
                        e1Var11.V0();
                        u0Var.Q |= u0Var.H != blob;
                        u0Var.H = blob;
                        if (!cursorQuery.isNull(44)) {
                            int i11 = cursorQuery.getInt(44);
                            e1 e1Var12 = h1Var2.G;
                            h1.g(e1Var12);
                            e1Var12.V0();
                            boolean z14 = u0Var.Q;
                            if (u0Var.I == i11) {
                                z10 = false;
                            }
                            u0Var.Q = z10 | z14;
                            u0Var.I = i11;
                        }
                        e1 e1Var13 = h1Var2.G;
                        h1.g(e1Var13);
                        e1Var13.V0();
                        u0Var.Q = false;
                        if (cursorQuery.moveToNext()) {
                            q0 q0Var = h1Var.F;
                            h1.g(q0Var);
                            q0Var.G.c(q0.d1(str), "Got multiple records for app, expected one. appId");
                        }
                        cursorQuery.close();
                        return u0Var;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    q0 q0Var2 = h1Var.F;
                    h1.g(q0Var2);
                    q0Var2.G.d("Error querying app. appId", q0.d1(str), e);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e10) {
            e = e10;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    @Override
    public final void Y0() {
    }

    public final void Y1(u0 u0Var, boolean z10) {
        h1 h1Var = (h1) this.B;
        h1 h1Var2 = u0Var.f14703a;
        V0();
        W0();
        String strD = u0Var.D();
        com.google.android.gms.common.internal.d0.h(strD);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strD);
        s1 s1Var = s1.ANALYTICS_STORAGE;
        y3 y3Var = this.C;
        if (z10) {
            contentValues.put("app_instance_id", (String) null);
        } else if (y3Var.a(strD).i(s1Var)) {
            contentValues.put("app_instance_id", u0Var.E());
        }
        contentValues.put("gmp_app_id", u0Var.G());
        if (y3Var.a(strD).i(s1.AD_STORAGE)) {
            e1 e1Var = h1Var2.G;
            h1.g(e1Var);
            e1Var.V0();
            contentValues.put("resettable_device_id_hash", u0Var.f14707e);
        }
        e1 e1Var2 = h1Var2.G;
        h1.g(e1Var2);
        e1Var2.V0();
        contentValues.put("last_bundle_index", Long.valueOf(u0Var.f14709g));
        e1 e1Var3 = h1Var2.G;
        h1.g(e1Var3);
        e1Var3.V0();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(u0Var.f14710h));
        e1 e1Var4 = h1Var2.G;
        h1.g(e1Var4);
        e1Var4.V0();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(u0Var.f14711i));
        contentValues.put("app_version", u0Var.N());
        e1 e1Var5 = h1Var2.G;
        h1.g(e1Var5);
        e1Var5.V0();
        contentValues.put("app_store", u0Var.l);
        e1 e1Var6 = h1Var2.G;
        h1.g(e1Var6);
        e1Var6.V0();
        contentValues.put("gmp_version", Long.valueOf(u0Var.m));
        e1 e1Var7 = h1Var2.G;
        h1.g(e1Var7);
        e1Var7.V0();
        contentValues.put("dev_cert_hash", Long.valueOf(u0Var.f14714n));
        e1 e1Var8 = h1Var2.G;
        h1.g(e1Var8);
        e1Var8.V0();
        contentValues.put("measurement_enabled", Boolean.valueOf(u0Var.f14715o));
        e1 e1Var9 = h1Var2.G;
        e1 e1Var10 = h1Var2.G;
        h1.g(e1Var9);
        e1Var9.V0();
        contentValues.put("day", Long.valueOf(u0Var.J));
        h1.g(e1Var10);
        e1Var10.V0();
        contentValues.put("daily_public_events_count", Long.valueOf(u0Var.K));
        h1.g(e1Var10);
        e1Var10.V0();
        contentValues.put("daily_events_count", Long.valueOf(u0Var.L));
        h1.g(e1Var10);
        e1Var10.V0();
        contentValues.put("daily_conversions_count", Long.valueOf(u0Var.M));
        e1 e1Var11 = h1Var2.G;
        h1.g(e1Var11);
        e1Var11.V0();
        contentValues.put("config_fetched_time", Long.valueOf(u0Var.R));
        e1 e1Var12 = h1Var2.G;
        h1.g(e1Var12);
        e1Var12.V0();
        contentValues.put("failed_config_fetch_time", Long.valueOf(u0Var.S));
        contentValues.put("app_version_int", Long.valueOf(u0Var.P()));
        contentValues.put("firebase_instance_id", u0Var.J());
        h1.g(e1Var10);
        e1Var10.V0();
        contentValues.put("daily_error_events_count", Long.valueOf(u0Var.N));
        h1.g(e1Var10);
        e1Var10.V0();
        contentValues.put("daily_realtime_events_count", Long.valueOf(u0Var.O));
        h1.g(e1Var10);
        e1Var10.V0();
        contentValues.put("health_monitor_sample", u0Var.P);
        contentValues.put("android_id", (Long) 0L);
        e1 e1Var13 = h1Var2.G;
        h1.g(e1Var13);
        e1Var13.V0();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(u0Var.f14716p));
        contentValues.put("dynamite_version", Long.valueOf(u0Var.b()));
        if (y3Var.a(strD).i(s1Var)) {
            e1 e1Var14 = h1Var2.G;
            h1.g(e1Var14);
            e1Var14.V0();
            contentValues.put("session_stitching_token", u0Var.f14720t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(u0Var.y()));
        e1 e1Var15 = h1Var2.G;
        h1.g(e1Var15);
        e1Var15.V0();
        contentValues.put("target_os_version", Long.valueOf(u0Var.f14722v));
        e1 e1Var16 = h1Var2.G;
        h1.g(e1Var16);
        e1Var16.V0();
        contentValues.put("session_stitching_token_hash", Long.valueOf(u0Var.f14723w));
        m8.a();
        g gVar = h1Var.D;
        q0 q0Var = h1Var.F;
        if (gVar.f1(strD, b0.P0)) {
            e1 e1Var17 = h1Var2.G;
            h1.g(e1Var17);
            e1Var17.V0();
            contentValues.put("ad_services_version", Integer.valueOf(u0Var.f14724x));
            e1 e1Var18 = h1Var2.G;
            h1.g(e1Var18);
            e1Var18.V0();
            contentValues.put("attribution_eligibility_status", Long.valueOf(u0Var.B));
        }
        e1 e1Var19 = h1Var2.G;
        h1.g(e1Var19);
        e1Var19.V0();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(u0Var.f14725y));
        contentValues.put("npa_metadata_value", u0Var.w());
        e1 e1Var20 = h1Var2.G;
        h1.g(e1Var20);
        e1Var20.V0();
        contentValues.put("bundle_delivery_index", Long.valueOf(u0Var.F));
        contentValues.put("sgtm_preview_key", u0Var.C());
        h1.g(e1Var10);
        e1Var10.V0();
        contentValues.put("dma_consent_state", Integer.valueOf(u0Var.D));
        h1.g(e1Var10);
        e1Var10.V0();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(u0Var.E));
        contentValues.put("serialized_npa_metadata", u0Var.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(u0Var.t()));
        e1 e1Var21 = h1Var2.G;
        h1.g(e1Var21);
        e1Var21.V0();
        ArrayList arrayList = u0Var.f14719s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                h1.g(q0Var);
                q0Var.J.c(strD, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (h1Var.D.f1(null, b0.K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        e1 e1Var22 = h1Var2.G;
        h1.g(e1Var22);
        e1Var22.V0();
        contentValues.put("unmatched_pfo", u0Var.f14726z);
        e1 e1Var23 = h1Var2.G;
        h1.g(e1Var23);
        e1Var23.V0();
        contentValues.put("unmatched_uwa", u0Var.A);
        e1 e1Var24 = h1Var2.G;
        h1.g(e1Var24);
        e1Var24.V0();
        contentValues.put("ad_campaign_info", u0Var.H);
        try {
            SQLiteDatabase sQLiteDatabaseK1 = K1();
            if (sQLiteDatabaseK1.update("apps", contentValues, "app_id = ?", new String[]{strD}) == 0 && sQLiteDatabaseK1.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                h1.g(q0Var);
                q0Var.G.c(q0.d1(strD), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e3) {
            h1.g(q0Var);
            q0Var.G.d("Error storing app. appId", q0.d1(strD), e3);
        }
    }

    public final long Z0(String str, com.google.android.gms.internal.measurement.g3 g3Var, String str2, Map map, p2 p2Var, Long l) {
        int iDelete;
        h1 h1Var = (h1) this.B;
        V0();
        W0();
        com.google.android.gms.common.internal.d0.h(g3Var);
        com.google.android.gms.common.internal.d0.e(str);
        V0();
        W0();
        if (C1()) {
            y3 y3Var = this.C;
            long jE = y3Var.I.G.e();
            ve.b bVar = h1Var.K;
            q0 q0Var = h1Var.F;
            bVar.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jE) > ((Long) b0.M.a(null)).longValue()) {
                y3Var.I.G.f(jElapsedRealtime);
                V0();
                W0();
                if (C1() && (iDelete = K1().delete("upload_queue", x1(), new String[0])) > 0) {
                    h1.g(q0Var);
                    q0Var.O.c(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                com.google.android.gms.common.internal.d0.e(str);
                V0();
                W0();
                try {
                    int iD1 = h1Var.D.d1(str, b0.A);
                    if (iD1 > 0) {
                        K1().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iD1)});
                    }
                } catch (SQLiteException e3) {
                    h1.g(q0Var);
                    q0Var.G.d("Error deleting over the limit queued batches. appId", q0.d1(str), e3);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append("=");
            sb2.append(str4);
            arrayList.add(sb2.toString());
        }
        byte[] bArrA = g3Var.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrA);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", String.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(p2Var.A));
        ve.b bVar2 = h1Var.K;
        q0 q0Var2 = h1Var.F;
        bVar2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long jInsert = K1().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            h1.g(q0Var2);
            q0Var2.G.c(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e10) {
            h1.g(q0Var2);
            q0Var2.G.d("Error storing MeasurementBatch to upload_queue. appId", str, e10);
            return -1L;
        }
    }

    public final j Z1(long j9, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        return a2(j9, str, 1L, false, false, z10, false, z11, z12, z13);
    }

    public final List a1(String str, r3 r3Var, int i10) {
        ?? arrayList;
        com.google.android.gms.common.internal.d0.e(str);
        V0();
        W0();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabaseK1 = K1();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String strY1 = y1(r3Var.A);
            String strX1 = x1();
            StringBuilder sb2 = new StringBuilder(strY1.length() + 17 + strX1.length());
            sb2.append("app_id=?");
            sb2.append(strY1);
            sb2.append(" AND NOT ");
            sb2.append(strX1);
            cursorQuery = sQLiteDatabaseK1.query("upload_queue", strArr, sb2.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i10 > 0 ? String.valueOf(i10) : null);
            arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                a4 a4VarW1 = w1(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                if (a4VarW1 != null) {
                    arrayList.add(a4VarW1);
                }
            }
        } catch (SQLiteException e3) {
            q0 q0Var = ((h1) this.B).F;
            h1.g(q0Var);
            q0Var.G.d("Error to querying MeasurementBatch from upload_queue. appId", str, e3);
            arrayList = Collections.EMPTY_LIST;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    public final j a2(long j9, String str, long j10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        h1 h1Var = (h1) this.B;
        com.google.android.gms.common.internal.d0.e(str);
        V0();
        W0();
        String[] strArr = {str};
        j jVar = new j();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseK1 = K1();
                cursorQuery = sQLiteDatabaseK1.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j9) {
                        jVar.f14641b = cursorQuery.getLong(1);
                        jVar.f14640a = cursorQuery.getLong(2);
                        jVar.f14642c = cursorQuery.getLong(3);
                        jVar.f14643d = cursorQuery.getLong(4);
                        jVar.f14644e = cursorQuery.getLong(5);
                        jVar.f14645f = cursorQuery.getLong(6);
                        jVar.f14646g = cursorQuery.getLong(7);
                    }
                    if (z10) {
                        jVar.f14641b += j10;
                    }
                    if (z11) {
                        jVar.f14640a += j10;
                    }
                    if (z12) {
                        jVar.f14642c += j10;
                    }
                    if (z13) {
                        jVar.f14643d += j10;
                    }
                    if (z14) {
                        jVar.f14644e += j10;
                    }
                    if (z15) {
                        jVar.f14645f += j10;
                    }
                    if (z16) {
                        jVar.f14646g += j10;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j9));
                    contentValues.put("daily_public_events_count", Long.valueOf(jVar.f14640a));
                    contentValues.put("daily_events_count", Long.valueOf(jVar.f14641b));
                    contentValues.put("daily_conversions_count", Long.valueOf(jVar.f14642c));
                    contentValues.put("daily_error_events_count", Long.valueOf(jVar.f14643d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(jVar.f14644e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(jVar.f14645f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(jVar.f14646g));
                    sQLiteDatabaseK1.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    q0 q0Var = h1Var.F;
                    h1.g(q0Var);
                    q0Var.J.c(q0.d1(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e3) {
                q0 q0Var2 = h1Var.F;
                h1.g(q0Var2);
                q0Var2.G.d("Error updating daily counts. appId", q0.d1(str), e3);
            }
            return jVar;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public final boolean b1(String str) {
        p2[] p2VarArr = {p2.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(p2VarArr[0].A));
        String strY1 = y1(arrayList);
        String strX1 = x1();
        return F1(oi.k.m(new StringBuilder((strY1.length() + 61) + strX1.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", strY1, " AND NOT ", strX1), new String[]{str}) != 0;
    }

    public final sd.p1 b2(String str) {
        Throwable th2;
        Cursor cursorQuery;
        h1 h1Var = (h1) this.B;
        com.google.android.gms.common.internal.d0.e(str);
        V0();
        W0();
        ?? r4 = 0;
        try {
            try {
                cursorQuery = K1().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            q0 q0Var = h1Var.F;
                            h1.g(q0Var);
                            q0Var.G.c(q0.d1(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            sd.p1 p1Var = new sd.p1(blob, string, string2, 3);
                            cursorQuery.close();
                            return p1Var;
                        }
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    q0 q0Var2 = h1Var.F;
                    h1.g(q0Var2);
                    q0Var2.G.d("Error querying remote config. appId", q0.d1(str), e);
                }
            } catch (Throwable th3) {
                th2 = th3;
                r4 = this;
                if (r4 != 0) {
                    throw th2;
                }
                r4.close();
                throw th2;
            }
        } catch (SQLiteException e10) {
            e = e10;
            cursorQuery = null;
        } catch (Throwable th4) {
            th2 = th4;
            if (r4 != 0) {
                throw th2;
            }
            r4.close();
            throw th2;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void c1(Long l) {
        h1 h1Var = (h1) this.B;
        V0();
        W0();
        try {
            if (K1().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                q0 q0Var = h1Var.F;
                h1.g(q0Var);
                q0Var.J.b("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e3) {
            q0 q0Var2 = h1Var.F;
            h1.g(q0Var2);
            q0Var2.G.c(e3, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e3;
        }
    }

    public final void c2(com.google.android.gms.internal.measurement.i3 i3Var, boolean z10) {
        V0();
        W0();
        com.google.android.gms.common.internal.d0.e(i3Var.p());
        if (!i3Var.b2()) {
            throw new IllegalStateException();
        }
        f1();
        h1 h1Var = (h1) this.B;
        ve.b bVar = h1Var.K;
        q0 q0Var = h1Var.F;
        bVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jC2 = i3Var.c2();
        a0 a0Var = b0.R;
        if (jC2 < jCurrentTimeMillis - ((Long) a0Var.a(null)).longValue() || i3Var.c2() > ((Long) a0Var.a(null)).longValue() + jCurrentTimeMillis) {
            h1.g(q0Var);
            q0Var.J.e("Storing bundle outside of the max uploading time span. appId, now, timestamp", q0.d1(i3Var.p()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(i3Var.c2()));
        }
        byte[] bArrA = i3Var.a();
        try {
            t0 t0Var = this.C.G;
            y3.R(t0Var);
            byte[] bArrH1 = t0Var.H1(bArrA);
            h1.g(q0Var);
            q0Var.O.c(Integer.valueOf(bArrH1.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", i3Var.p());
            contentValues.put("bundle_end_timestamp", Long.valueOf(i3Var.c2()));
            contentValues.put("data", bArrH1);
            contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
            if (i3Var.p0()) {
                contentValues.put("retry_count", Integer.valueOf(i3Var.q0()));
            }
            try {
                if (K1().insert("queue", null, contentValues) == -1) {
                    h1.g(q0Var);
                    q0Var.G.c(q0.d1(i3Var.p()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e3) {
                h1.g(q0Var);
                q0Var.G.d("Error storing bundle. appId", q0.d1(i3Var.p()), e3);
            }
        } catch (IOException e10) {
            h1.g(q0Var);
            q0Var.G.d("Data loss. Failed to serialize bundle. appId", q0.d1(i3Var.p()), e10);
        }
    }

    public final String d1() throws Throwable {
        SQLiteException e3;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseK1 = K1();
        ?? r4 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseK1.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e10) {
                    e3 = e10;
                    q0 q0Var = ((h1) this.B).F;
                    h1.g(q0Var);
                    q0Var.G.c(e3, "Database error getting next bundle app id");
                }
            } catch (Throwable th2) {
                th = th2;
                r4 = sQLiteDatabaseK1;
                if (r4 != 0) {
                    r4.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e3 = e11;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (r4 != 0) {
                r4.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    public final void e1(long j9) {
        V0();
        W0();
        try {
            if (K1().delete("queue", "rowid=?", new String[]{String.valueOf(j9)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e3) {
            q0 q0Var = ((h1) this.B).F;
            h1.g(q0Var);
            q0Var.G.c(e3, "Failed to delete a bundle in a queue table");
            throw e3;
        }
    }

    public final void f1() {
        V0();
        W0();
        if (C1()) {
            y3 y3Var = this.C;
            long jE = y3Var.I.F.e();
            h1 h1Var = (h1) this.B;
            h1Var.K.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jE) > ((Long) b0.M.a(null)).longValue()) {
                y3Var.I.F.f(jElapsedRealtime);
                V0();
                W0();
                if (C1()) {
                    SQLiteDatabase sQLiteDatabaseK1 = K1();
                    h1Var.K.getClass();
                    int iDelete = sQLiteDatabaseK1.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) b0.R.a(null)).longValue())});
                    if (iDelete > 0) {
                        q0 q0Var = h1Var.F;
                        h1.g(q0Var);
                        q0Var.O.c(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void g1(ArrayList arrayList) {
        h1 h1Var = (h1) this.B;
        V0();
        W0();
        com.google.android.gms.common.internal.d0.h(arrayList);
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (C1()) {
            String strJoin = TextUtils.join(",", arrayList);
            String strL = w.c.l(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            if (F1(w.c.l(new StringBuilder(strL.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strL, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                q0 q0Var = h1Var.F;
                h1.g(q0Var);
                q0Var.J.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseK1 = K1();
                StringBuilder sb2 = new StringBuilder(strL.length() + 127);
                sb2.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb2.append(strL);
                sb2.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseK1.execSQL(sb2.toString());
            } catch (SQLiteException e3) {
                q0 q0Var2 = h1Var.F;
                h1.g(q0Var2);
                q0Var2.G.c(e3, "Error incrementing retry count. error");
            }
        }
    }

    public final void h1(Long l) {
        h1 h1Var = (h1) this.B;
        V0();
        W0();
        if (C1()) {
            StringBuilder sb2 = new StringBuilder(l.toString().length() + 86);
            sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb2.append(l);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (F1(sb2.toString(), null) > 0) {
                q0 q0Var = h1Var.F;
                h1.g(q0Var);
                q0Var.J.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseK1 = K1();
                h1Var.K.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb3 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb3.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb3.append(jCurrentTimeMillis);
                String string = sb3.toString();
                StringBuilder sb4 = new StringBuilder(string.length() + 34 + l.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(string);
                sb4.append(" WHERE rowid = ");
                sb4.append(l);
                sb4.append(" AND retry_count < 2147483647");
                sQLiteDatabaseK1.execSQL(sb4.toString());
            } catch (SQLiteException e3) {
                q0 q0Var2 = h1Var.F;
                h1.g(q0Var2);
                q0Var2.G.c(e3, "Error incrementing retry count. error");
            }
        }
    }

    public final Object i1(Cursor cursor, int i10) {
        h1 h1Var = (h1) this.B;
        int type = cursor.getType(i10);
        if (type == 0) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.G.b("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            q0 q0Var2 = h1Var.F;
            h1.g(q0Var2);
            q0Var2.G.c(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        q0 q0Var3 = h1Var.F;
        h1.g(q0Var3);
        q0Var3.G.b("Loaded invalid blob type value, ignoring it");
        return null;
    }

    public final long j1(String str) {
        long j9;
        ContentValues contentValues;
        h1 h1Var = (h1) this.B;
        com.google.android.gms.common.internal.d0.e(str);
        com.google.android.gms.common.internal.d0.e("first_open_count");
        V0();
        W0();
        SQLiteDatabase sQLiteDatabaseK1 = K1();
        sQLiteDatabaseK1.beginTransaction();
        long j10 = 0;
        try {
            try {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("select first_open_count from app2 where app_id=?");
                j9 = -1;
                long jG1 = G1(sb2.toString(), new String[]{str}, -1L);
                if (jG1 == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseK1.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        q0 q0Var = h1Var.F;
                        h1.g(q0Var);
                        q0Var.G.d("Failed to insert column (got -1). appId", q0.d1(str), "first_open_count");
                    } else {
                        jG1 = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jG1));
                            if (sQLiteDatabaseK1.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                q0 q0Var2 = h1Var.F;
                                h1.g(q0Var2);
                                q0Var2.G.d("Failed to update column (got 0). appId", q0.d1(str), "first_open_count");
                            } else {
                                sQLiteDatabaseK1.setTransactionSuccessful();
                                j9 = jG1;
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            j10 = jG1;
                            q0 q0Var3 = h1Var.F;
                            h1.g(q0Var3);
                            q0Var3.G.e("Error inserting column. appId", q0.d1(str), "first_open_count", e);
                            j9 = j10;
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jG1));
                    if (sQLiteDatabaseK1.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        q0 q0Var4 = h1Var.F;
                        h1.g(q0Var4);
                        q0Var4.G.d("Failed to update column (got 0). appId", q0.d1(str), "first_open_count");
                    } else {
                        sQLiteDatabaseK1.setTransactionSuccessful();
                        j9 = jG1;
                    }
                }
            } catch (SQLiteException e10) {
                e = e10;
            }
            return j9;
        } finally {
            sQLiteDatabaseK1.endTransaction();
        }
    }

    public final boolean k1(String str, String str2) {
        return F1("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final long l1(String str) {
        com.google.android.gms.common.internal.d0.e(str);
        return G1("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void m1(String str, Long l, long j9, com.google.android.gms.internal.measurement.a3 a3Var) {
        V0();
        W0();
        com.google.android.gms.common.internal.d0.h(a3Var);
        com.google.android.gms.common.internal.d0.e(str);
        h1 h1Var = (h1) this.B;
        byte[] bArrA = a3Var.a();
        q0 q0Var = h1Var.F;
        q0 q0Var2 = h1Var.F;
        h1.g(q0Var);
        q0Var.O.d("Saving complex main event, appId, data size", h1Var.J.a(str), Integer.valueOf(bArrA.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j9));
        contentValues.put("main_event", bArrA);
        try {
            if (K1().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                h1.g(q0Var2);
                q0Var2.G.c(q0.d1(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e3) {
            h1.g(q0Var2);
            q0Var2.G.d("Error storing complex main event. appId", q0.d1(str), e3);
        }
    }

    public final void n1(String str, Long l, String str2, Bundle bundle) {
        q0 q0Var;
        Bundle bundle2;
        String str3;
        long j9;
        ContentValues contentValues;
        q0 q0Var2;
        com.google.android.gms.internal.measurement.i3 i3Var;
        Iterator it;
        m mVar = this;
        String str4 = str;
        h1 h1Var = (h1) mVar.B;
        com.google.android.gms.common.internal.d0.h(bundle);
        mVar.V0();
        mVar.W0();
        e5.g gVar = l != null ? new e5.g(mVar, str4, l.longValue()) : new e5.g(mVar, str4);
        List<k> listB = gVar.b();
        while (!listB.isEmpty()) {
            for (k kVar : listB) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        Cursor cursor = null;
                        com.google.android.gms.internal.measurement.i3 i3Var2 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = mVar.K1().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(kVar.f14648b)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                i3Var = (com.google.android.gms.internal.measurement.i3) ((com.google.android.gms.internal.measurement.h3) t0.I1(com.google.android.gms.internal.measurement.i3.U(), cursorQuery.getBlob(0))).e();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        q0 q0Var3 = h1Var.F;
                                                        h1.g(q0Var3);
                                                        q0Var3.J.c(q0.d1(str4), "Get multiple raw event metadata records, expected one. appId");
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                } catch (SQLiteException e3) {
                                                    e = e3;
                                                    cursor = cursorQuery;
                                                    q0 q0Var4 = h1Var.F;
                                                    h1.g(q0Var4);
                                                    q0Var4.G.d("Data loss. Error selecting raw event. appId", q0.d1(str4), e);
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                }
                                                i3Var2 = i3Var;
                                            } catch (IOException e10) {
                                                q0 q0Var5 = h1Var.F;
                                                h1.g(q0Var5);
                                                q0Var5.G.d("Data loss. Failed to merge raw event metadata. appId", q0.d1(str4), e10);
                                                cursorQuery.close();
                                            }
                                            if (i3Var2 != null) {
                                                it = i3Var2.U1().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((com.google.android.gms.internal.measurement.r3) it.next()).r().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            q0 q0Var6 = h1Var.F;
                                            h1.g(q0Var6);
                                            q0Var6.G.c(q0.d1(str4), "Raw event metadata record is missing. appId");
                                        }
                                        cursorQuery.close();
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        i3Var = null;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = cursorQuery;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (SQLiteException e12) {
                            e = e12;
                            i3Var = null;
                        }
                        if (i3Var2 != null) {
                            it = i3Var2.U1().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((com.google.android.gms.internal.measurement.r3) it.next()).r().equals(str2)) {
                                    }
                                }
                            }
                        }
                    }
                    long jUpdate = K1().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j9)});
                    if (jUpdate != 1) {
                        h1.g(q0Var);
                        q0Var2 = q0Var;
                        try {
                            q0Var2.G.d("Failed to update raw event. appId, updatedRows", q0.d1(str3), Long.valueOf(jUpdate));
                        } catch (SQLiteException e13) {
                            e = e13;
                            h1.g(q0Var2);
                            q0Var2.G.d("Error updating raw event. appId", q0.d1(str3), e);
                        }
                    }
                } catch (SQLiteException e14) {
                    e = e14;
                    q0Var2 = q0Var;
                }
                y3 y3Var = mVar.C;
                t0 t0Var = y3Var.G;
                y3.R(t0Var);
                com.google.android.gms.internal.measurement.a3 a3Var = kVar.f14650d;
                Bundle bundle3 = new Bundle();
                for (com.google.android.gms.internal.measurement.d3 d3Var : a3Var.p()) {
                    if (d3Var.x()) {
                        bundle3.putDouble(d3Var.q(), d3Var.y());
                    } else if (d3Var.v()) {
                        bundle3.putFloat(d3Var.q(), d3Var.w());
                    } else if (d3Var.t()) {
                        bundle3.putLong(d3Var.q(), d3Var.u());
                    } else if (d3Var.r()) {
                        bundle3.putString(d3Var.q(), d3Var.s());
                    } else if (d3Var.z().isEmpty()) {
                        q0 q0Var7 = ((h1) t0Var.B).F;
                        h1.g(q0Var7);
                        q0Var7.G.c(d3Var, "Unexpected parameter type for parameter");
                    } else {
                        bundle3.putParcelableArray(d3Var.q(), t0.K1((k5) d3Var.z()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strS = a3Var.s();
                if (string == null) {
                    string = RuntimeVersion.SUFFIX;
                }
                e4 e4Var = h1Var.I;
                q0Var = h1Var.F;
                h1.e(e4Var);
                if (strS.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        com.google.android.gms.internal.measurement.a3 a3Var2 = a3Var;
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                        a3Var = a3Var2;
                    }
                } else {
                    bundle2 = bundle;
                }
                com.google.android.gms.internal.measurement.a3 a3Var3 = a3Var;
                e4Var.g1(bundle3, bundle2);
                l7.k kVar2 = new l7.k((h1) mVar.B, string, str4, a3Var3.s(), a3Var3.u(), a3Var3.w(), bundle3);
                str3 = (String) kVar2.f10090d;
                j9 = kVar.f14647a;
                long j10 = kVar.f14648b;
                boolean z10 = kVar.f14649c;
                mVar.V0();
                mVar.W0();
                com.google.android.gms.common.internal.d0.e(str3);
                t0 t0Var2 = y3Var.G;
                y3.R(t0Var2);
                byte[] bArrA = t0Var2.x1(kVar2).a();
                contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("name", (String) kVar2.f10091e);
                contentValues.put("timestamp", Long.valueOf(kVar2.f10088b));
                contentValues.put("metadata_fingerprint", Long.valueOf(j10));
                contentValues.put("data", bArrA);
                contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
                mVar = this;
                str4 = str;
            }
            listB = gVar.b();
            mVar = this;
            str4 = str;
        }
    }

    public final t1 o1(String str) throws Throwable {
        Throwable th2;
        SQLiteException e3;
        h1 h1Var = (h1) this.B;
        com.google.android.gms.common.internal.d0.h(str);
        V0();
        W0();
        ?? r4 = 0;
        t1VarC = null;
        t1VarC = null;
        t1 t1VarC = null;
        try {
            try {
                this = K1().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str});
                try {
                    if (this.moveToFirst()) {
                        t1VarC = t1.c(this.getInt(1), this.getString(0));
                    } else {
                        q0 q0Var = h1Var.F;
                        h1.g(q0Var);
                        q0Var.O.b("No data found");
                    }
                } catch (SQLiteException e10) {
                    e3 = e10;
                    q0 q0Var2 = h1Var.F;
                    h1.g(q0Var2);
                    q0Var2.G.c(e3, "Error querying database.");
                    if (this != 0) {
                    }
                    if (t1VarC == null) {
                        return t1.f14700c;
                    }
                    return t1VarC;
                }
            } catch (Throwable th3) {
                th2 = th3;
                r4 = this;
                if (r4 != 0) {
                    r4.close();
                }
                throw th2;
            }
        } catch (SQLiteException e11) {
            e3 = e11;
            this = 0;
        } catch (Throwable th4) {
            th2 = th4;
            if (r4 != 0) {
                r4.close();
            }
            throw th2;
        }
        this.close();
        if (t1VarC == null) {
            return t1.f14700c;
        }
        return t1VarC;
    }

    public final void p1(String str, n3 n3Var) {
        V0();
        W0();
        com.google.android.gms.common.internal.d0.e(str);
        h1 h1Var = (h1) this.B;
        ve.b bVar = h1Var.K;
        q0 q0Var = h1Var.F;
        bVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        a0 a0Var = b0.f14597v0;
        long jLongValue = jCurrentTimeMillis - ((Long) a0Var.a(null)).longValue();
        long j9 = n3Var.B;
        if (j9 < jLongValue || j9 > ((Long) a0Var.a(null)).longValue() + jCurrentTimeMillis) {
            h1.g(q0Var);
            q0Var.J.e("Storing trigger URI outside of the max retention time span. appId, now, timestamp", q0.d1(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j9));
        }
        h1.g(q0Var);
        q0Var.O.b("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", n3Var.A);
        contentValues.put("source", Integer.valueOf(n3Var.C));
        contentValues.put("timestamp_millis", Long.valueOf(j9));
        try {
            if (K1().insert("trigger_uris", null, contentValues) == -1) {
                h1.g(q0Var);
                q0Var.G.c(q0.d1(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e3) {
            h1.g(q0Var);
            q0Var.G.d("Error storing trigger URI. appId", q0.d1(str), e3);
        }
    }

    public final void q1(String str, t1 t1Var) {
        com.google.android.gms.common.internal.d0.h(str);
        com.google.android.gms.common.internal.d0.h(t1Var);
        V0();
        W0();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", t1Var.g());
        contentValues.put("consent_source", Integer.valueOf(t1Var.f14702b));
        s1(contentValues);
    }

    public final String r1(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = K1().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return RuntimeVersion.SUFFIX;
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e3) {
                q0 q0Var = ((h1) this.B).F;
                h1.g(q0Var);
                q0Var.G.d("Database error", str, e3);
                throw e3;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th2;
    }

    public final void s1(ContentValues contentValues) {
        h1 h1Var = (h1) this.B;
        try {
            SQLiteDatabase sQLiteDatabaseK1 = K1();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                q0 q0Var = h1Var.F;
                h1.g(q0Var);
                q0Var.I.c(q0.d1("app_id"), "Value of the primary key is not set.");
                return;
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append("app_id = ?");
            if (sQLiteDatabaseK1.update("consent_settings", contentValues, sb2.toString(), new String[]{asString}) == 0 && sQLiteDatabaseK1.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                q0 q0Var2 = h1Var.F;
                h1.g(q0Var2);
                q0Var2.G.d("Failed to insert/update table (got -1). key", q0.d1("consent_settings"), q0.d1("app_id"));
            }
        } catch (SQLiteException e3) {
            q0 q0Var3 = h1Var.F;
            h1.g(q0Var3);
            q0Var3.G.e("Error storing into table. key", q0.d1("consent_settings"), q0.d1("app_id"), e3);
        }
    }

    public final q t1(String str, String str2, String str3) throws Throwable {
        Cursor cursorQuery;
        Boolean boolValueOf;
        h1 h1Var = (h1) this.B;
        com.google.android.gms.common.internal.d0.e(str2);
        com.google.android.gms.common.internal.d0.e(str3);
        V0();
        W0();
        ArrayList arrayList = new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"));
        ?? r4 = 0;
        try {
            try {
                cursorQuery = K1().query(str, (String[]) arrayList.toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j9 = cursorQuery.getLong(0);
                        long j10 = cursorQuery.getLong(1);
                        long j11 = cursorQuery.getLong(2);
                        long j12 = 0;
                        long j13 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        if (!cursorQuery.isNull(8)) {
                            j12 = cursorQuery.getLong(8);
                        }
                        q qVar = new q(str2, str3, j9, j10, j12, j11, j13, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            q0 q0Var = h1Var.F;
                            h1.g(q0Var);
                            q0Var.G.c(q0.d1(str2), "Got multiple records for event aggregates, expected one. appId");
                        }
                        cursorQuery.close();
                        return qVar;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    q0 q0Var2 = h1Var.F;
                    h1.g(q0Var2);
                    q0Var2.G.e("Error querying events. appId", q0.d1(str2), h1Var.J.a(str3), e);
                }
            } catch (Throwable th2) {
                th = th2;
                r4 = arrayList;
                if (r4 != 0) {
                    r4.close();
                }
                throw th;
            }
        } catch (SQLiteException e10) {
            e = e10;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (r4 != 0) {
                r4.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void u1(String str, q qVar) {
        h1 h1Var = (h1) this.B;
        com.google.android.gms.common.internal.d0.h(qVar);
        V0();
        W0();
        ContentValues contentValues = new ContentValues();
        String str2 = qVar.f14683a;
        contentValues.put("app_id", str2);
        contentValues.put("name", qVar.f14684b);
        contentValues.put("lifetime_count", Long.valueOf(qVar.f14685c));
        contentValues.put("current_bundle_count", Long.valueOf(qVar.f14686d));
        contentValues.put("last_fire_timestamp", Long.valueOf(qVar.f14688f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(qVar.f14689g));
        contentValues.put("last_bundled_day", qVar.f14690h);
        contentValues.put("last_sampled_complex_event_id", qVar.f14691i);
        contentValues.put("last_sampling_rate", qVar.f14692j);
        contentValues.put("current_session_count", Long.valueOf(qVar.f14687e));
        Boolean bool = qVar.f14693k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (K1().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                q0 q0Var = h1Var.F;
                h1.g(q0Var);
                q0Var.G.c(q0.d1(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e3) {
            q0 q0Var2 = h1Var.F;
            h1.g(q0Var2);
            q0Var2.G.d("Error storing event aggregates. appId", q0.d1(str2), e3);
        }
    }

    public final void v1(String str, String str2) {
        com.google.android.gms.common.internal.d0.e(str2);
        V0();
        W0();
        try {
            K1().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e3) {
            q0 q0Var = ((h1) this.B).F;
            h1.g(q0Var);
            q0Var.G.d("Error deleting snapshot. appId", q0.d1(str2), e3);
        }
    }

    public final a4 w1(String str, long j9, byte[] bArr, String str2, String str3, int i10, int i11, long j10, long j11, long j12) {
        p2 p2Var;
        h1 h1Var = (h1) this.B;
        if (TextUtils.isEmpty(str2)) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.N.b("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.f3 f3Var = (com.google.android.gms.internal.measurement.f3) t0.I1(com.google.android.gms.internal.measurement.g3.w(), bArr);
            p2[] p2VarArrValues = p2.values();
            int length = p2VarArrValues.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    p2Var = p2.UNKNOWN;
                    break;
                }
                p2Var = p2VarArrValues[i12];
                if (p2Var.A == i10) {
                    break;
                }
                i12++;
            }
            if (p2Var != p2.GOOGLE_SIGNAL && p2Var != p2.GOOGLE_SIGNAL_PENDING && i11 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.g3) f3Var.B).p()).iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.h3 h3Var = (com.google.android.gms.internal.measurement.h3) ((com.google.android.gms.internal.measurement.i3) it.next()).i();
                    h3Var.b();
                    ((com.google.android.gms.internal.measurement.i3) h3Var.B).T0(i11);
                    arrayList.add((com.google.android.gms.internal.measurement.i3) h3Var.e());
                }
                f3Var.b();
                ((com.google.android.gms.internal.measurement.g3) f3Var.B).B();
                f3Var.b();
                ((com.google.android.gms.internal.measurement.g3) f3Var.B).A(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        q0 q0Var2 = h1Var.F;
                        h1.g(q0Var2);
                        q0Var2.G.c(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            return new a4(j9, (com.google.android.gms.internal.measurement.g3) f3Var.e(), str2, map, p2Var, j10, j11, j12, i11);
        } catch (IOException e3) {
            q0 q0Var3 = h1Var.F;
            h1.g(q0Var3);
            q0Var3.G.d("Failed to queued MeasurementBatch from upload_queue. appId", str, e3);
            return null;
        }
    }

    public final String x1() {
        ((h1) this.B).K.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l = (Long) b0.S.a(null);
        l.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l + ")";
        String strK = a1.b.k(((Long) b0.R.a(null)).longValue(), ")", w.c.n("(upload_type != 1 AND ABS(creation_timestamp - ", jCurrentTimeMillis, ") > "));
        StringBuilder sb2 = new StringBuilder(str.length() + 5 + strK.length() + 1);
        a1.b.z(sb2, "(", str, " OR ", strK);
        sb2.append(")");
        return sb2.toString();
    }

    public final void z1(String str, t1 t1Var) {
        com.google.android.gms.common.internal.d0.h(str);
        V0();
        W0();
        q1(str, o1(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", t1Var.g());
        s1(contentValues);
    }
}
