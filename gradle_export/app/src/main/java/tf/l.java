package tf;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.m8;
import com.google.protobuf.RuntimeVersion;

public final class l extends SQLiteOpenHelper {
    public final int A;
    public final f5.c B;

    public l(Context context, String str) {
        super(context, true == str.equals(RuntimeVersion.SUFFIX) ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public l(l0 l0Var, Context context) {
        this(context, "google_app_measurement_local.db");
        this.A = 1;
        this.B = l0Var;
    }

    public l(m mVar, Context context) {
        this(context, "google_app_measurement.db");
        this.A = 0;
        this.B = mVar;
    }

    private final void a(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    private final void i(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    private final void l(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    private final void r(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    @Override
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.A) {
            case 0:
                m mVar = (m) this.B;
                h1 h1Var = (h1) mVar.B;
                h1 h1Var2 = (h1) mVar.B;
                h1Var.getClass();
                a8.i0 i0Var = mVar.F;
                if (i0Var.B != 0) {
                    ((ve.b) ((ve.a) i0Var.C)).getClass();
                    if (SystemClock.elapsedRealtime() - i0Var.B < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((ve.b) ((ve.a) i0Var.C)).getClass();
                    i0Var.B = SystemClock.elapsedRealtime();
                    q0 q0Var = h1Var2.F;
                    h1.g(q0Var);
                    q0Var.G.b("Opening the database failed, dropping and recreating it");
                    if (!h1Var2.A.getDatabasePath("google_app_measurement.db").delete()) {
                        q0 q0Var2 = h1Var2.F;
                        h1.g(q0Var2);
                        q0Var2.G.c("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        i0Var.B = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e3) {
                        q0 q0Var3 = h1Var2.F;
                        h1.g(q0Var3);
                        q0Var3.G.c(e3, "Failed to open freshly created database");
                        throw e3;
                    }
                }
            default:
                l0 l0Var = (l0) this.B;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e10) {
                    throw e10;
                } catch (SQLiteException unused2) {
                    h1 h1Var3 = (h1) l0Var.B;
                    q0 q0Var4 = h1Var3.F;
                    h1.g(q0Var4);
                    q0Var4.G.b("Opening the local database failed, dropping and recreating it");
                    if (!h1Var3.A.getDatabasePath("google_app_measurement_local.db").delete()) {
                        q0 q0Var5 = h1Var3.F;
                        h1.g(q0Var5);
                        q0Var5.G.c("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e11) {
                        q0 q0Var6 = ((h1) l0Var.B).F;
                        h1.g(q0Var6);
                        q0Var6.G.c(e11, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.A) {
            case 0:
                q0 q0Var = ((h1) ((m) this.B).B).F;
                h1.g(q0Var);
                u1.f(q0Var, sQLiteDatabase);
                break;
            default:
                q0 q0Var2 = ((h1) ((l0) this.B).B).F;
                h1.g(q0Var2);
                u1.f(q0Var2, sQLiteDatabase);
                break;
        }
    }

    @Override
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        int i12 = this.A;
    }

    @Override
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        switch (this.A) {
            case 0:
                h1 h1Var = (h1) ((m) this.B).B;
                q0 q0Var = h1Var.F;
                h1.g(q0Var);
                u1.d(q0Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", m.G);
                q0 q0Var2 = h1Var.F;
                h1.g(q0Var2);
                u1.d(q0Var2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                h1.g(q0Var2);
                u1.d(q0Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                h1.g(q0Var2);
                u1.d(q0Var2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", m.I);
                h1.g(q0Var2);
                u1.d(q0Var2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", m.J);
                h1.g(q0Var2);
                u1.d(q0Var2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", m.L);
                h1.g(q0Var2);
                u1.d(q0Var2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                h1.g(q0Var2);
                u1.d(q0Var2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", m.K);
                h1.g(q0Var2);
                u1.d(q0Var2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", m.M);
                h1.g(q0Var2);
                u1.d(q0Var2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", m.N);
                h1.g(q0Var2);
                u1.d(q0Var2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                h1.g(q0Var2);
                u1.d(q0Var2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", m.O);
                h1.g(q0Var2);
                u1.d(q0Var2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                h1.g(q0Var2);
                u1.d(q0Var2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                h1.g(q0Var2);
                u1.d(q0Var2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", m.P);
                m8.a();
                h1.g(q0Var2);
                u1.d(q0Var2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", m.Q);
                h1.g(q0Var2);
                u1.d(q0Var2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", m.H);
                h1.g(q0Var2);
                u1.d(q0Var2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                q0 q0Var3 = ((h1) ((l0) this.B).B).F;
                h1.g(q0Var3);
                u1.d(q0Var3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", l0.F);
                break;
        }
    }

    @Override
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        int i12 = this.A;
    }
}
