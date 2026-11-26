package tf;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public abstract class b0 {
    public static final a0 A;
    public static final a0 A0;
    public static final a0 B;
    public static final a0 B0;
    public static final a0 C;
    public static final a0 C0;
    public static final a0 D;
    public static final a0 D0;
    public static final a0 E;
    public static final a0 E0;
    public static final a0 F;
    public static final a0 F0;
    public static final a0 G;
    public static final a0 G0;
    public static final a0 H;
    public static final a0 H0;
    public static final a0 I;
    public static final a0 I0;
    public static final a0 J;
    public static final a0 J0;
    public static final a0 K;
    public static final a0 K0;
    public static final a0 L;
    public static final a0 L0;
    public static final a0 M;
    public static final a0 M0;
    public static final a0 N;
    public static final a0 N0;
    public static final a0 O;
    public static final a0 O0;
    public static final a0 P;
    public static final a0 P0;
    public static final a0 Q;
    public static final a0 Q0;
    public static final a0 R;
    public static final a0 R0;
    public static final a0 S;
    public static final a0 S0;
    public static final a0 T;
    public static final a0 T0;
    public static final a0 U;
    public static final a0 U0;
    public static final a0 V;
    public static final a0 V0;
    public static final a0 W;
    public static final a0 W0;
    public static final a0 X;
    public static final a0 X0;
    public static final a0 Y;
    public static final a0 Y0;
    public static final a0 Z;
    public static final a0 Z0;

    public static final List f14545a = Collections.synchronizedList(new ArrayList());

    public static final a0 f14546a0;

    public static final a0 f14547a1;

    public static final a0 f14548b;

    public static final a0 f14549b0;

    public static final a0 f14550b1;

    public static final a0 f14551c;

    public static final a0 f14552c0;

    public static final a0 f14553c1;

    public static final a0 f14554d;

    public static final a0 f14555d0;

    public static final a0 f14556d1;

    public static final a0 f14557e;

    public static final a0 f14558e0;

    public static final a0 f14559e1;

    public static final a0 f14560f;

    public static final a0 f14561f0;

    public static final a0 f14562f1;

    public static final a0 f14563g;

    public static final a0 f14564g0;

    public static final a0 f14565g1;

    public static final a0 f14566h;

    public static final a0 f14567h0;

    public static final a0 f14568h1;

    public static final a0 f14569i;

    public static final a0 f14570i0;

    public static final a0 f14571i1;

    public static final a0 f14572j;

    public static final a0 f14573j0;

    public static final a0 f14574j1;

    public static final a0 f14575k;

    public static final a0 f14576k0;

    public static final a0 f14577k1;
    public static final a0 l;

    public static final a0 f14578l0;
    public static final a0 m;

    public static final a0 f14579m0;

    public static final a0 f14580n;

    public static final a0 f14581n0;

    public static final a0 f14582o;

    public static final a0 f14583o0;

    public static final a0 f14584p;

    public static final a0 f14585p0;

    public static final a0 f14586q;

    public static final a0 f14587q0;

    public static final a0 f14588r;

    public static final a0 f14589r0;

    public static final a0 f14590s;

    public static final a0 f14591s0;

    public static final a0 f14592t;

    public static final a0 f14593t0;

    public static final a0 f14594u;

    public static final a0 f14595u0;

    public static final a0 f14596v;

    public static final a0 f14597v0;

    public static final a0 f14598w;

    public static final a0 f14599w0;

    public static final a0 f14600x;

    public static final a0 f14601x0;

    public static final a0 f14602y;

    public static final a0 f14603y0;

    public static final a0 f14604z;

    public static final a0 f14605z0;

    static {
        Collections.synchronizedSet(new HashSet());
        Long lValueOf = Long.valueOf(NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS);
        f14548b = a("measurement.ad_id_cache_time", lValueOf, x.L, false);
        f14551c = a("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, rc.d.D, false);
        f14554d = a("measurement.monitoring.sample_period_millis", 86400000L, ru.c.I, false);
        f14557e = a("measurement.config.cache_time", 86400000L, rp.m.M, false);
        f14560f = a("measurement.config.url_scheme", "https", rc.d.Q, false);
        f14563g = a("measurement.config.url_authority", "app-measurement.com", ru.c.T, false);
        f14566h = a("measurement.upload.max_bundles", 100, rp.m.X, false);
        Integer numValueOf = Integer.valueOf(Cast.MAX_MESSAGE_LENGTH);
        f14569i = a("measurement.upload.max_batch_size", numValueOf, rc.d.f13166b0, false);
        f14572j = a("measurement.upload.max_bundle_size", numValueOf, y.D, false);
        f14575k = a("measurement.upload.max_events_per_bundle", 1000, x.H, false);
        l = a("measurement.upload.max_events_per_day", 100000, w.L, false);
        m = a("measurement.upload.max_error_events_per_day", 1000, rp.m.F, false);
        f14580n = a("measurement.upload.max_public_events_per_day", 50000, ru.c.F, false);
        f14582o = a("measurement.upload.max_conversions_per_day", 10000, rc.d.G, false);
        f14584p = a("measurement.upload.max_realtime_events_per_day", 10, rp.m.G, false);
        f14586q = a("measurement.store.max_stored_events_per_app", 100000, ru.c.G, false);
        f14588r = a("measurement.upload.url", "https://app-measurement.com/a", rc.d.H, false);
        f14590s = a("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d", rp.m.H, false);
        f14592t = a("measurement.sgtm.service_upload_apps_list", RuntimeVersion.SUFFIX, ru.c.H, false);
        f14594u = a("measurement.sgtm.upload.backoff_http_codes", "404,429,503,504", rc.d.I, false);
        f14596v = a("measurement.sgtm.upload.retry_interval", 600000L, rp.m.I, false);
        f14598w = a("measurement.sgtm.upload.retry_max_wait", 21600000L, rc.d.J, false);
        f14600x = a("measurement.sgtm.batch.retry_interval", 1800000L, rp.m.J, false);
        f14602y = a("measurement.sgtm.batch.retry_max_wait", 21600000L, ru.c.J, false);
        f14604z = a("measurement.sgtm.batch.retry_max_count", 10, rc.d.K, false);
        A = a("measurement.sgtm.upload.max_queued_batches", 5000, rp.m.K, false);
        B = a("measurement.sgtm.upload.batches_retrieval_limit", 5, ru.c.K, false);
        C = a("measurement.sgtm.upload.min_delay_after_startup", 5000L, rc.d.L, false);
        D = a("measurement.sgtm.upload.min_delay_after_broadcast", 1000L, rp.m.L, false);
        E = a("measurement.sgtm.upload.min_delay_after_background", 600000L, ru.c.L, false);
        F = a("measurement.sgtm.batch.long_queuing_threshold", 14400000L, rc.d.M, false);
        G = a("measurement.upload.backoff_period", 43200000L, ru.c.M, false);
        a("measurement.upload.window_interval", 3600000L, rc.d.N, false);
        H = a("measurement.upload.interval", 3600000L, rp.m.N, false);
        I = a("measurement.upload.realtime_upload_interval", lValueOf, ru.c.N, false);
        J = a("measurement.upload.debug_upload_interval", 1000L, rc.d.O, false);
        K = a("measurement.upload.minimum_delay", 500L, rp.m.O, false);
        L = a("measurement.alarm_manager.minimum_interval", 60000L, ru.c.O, false);
        M = a("measurement.upload.stale_data_deletion_interval", 86400000L, rc.d.P, false);
        N = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, rp.m.P, false);
        O = a("measurement.upload.initial_upload_delay_time", 15000L, ru.c.P, false);
        P = a("measurement.upload.retry_time", 1800000L, rp.m.Q, false);
        Q = a("measurement.upload.retry_count", 6, ru.c.Q, false);
        R = a("measurement.upload.max_queue_time", 518400000L, rc.d.R, false);
        S = a("measurement.upload.google_signal_max_queue_time", 300000L, rp.m.R, false);
        T = a("measurement.lifetimevalue.max_currency_tracked", 4, ru.c.R, false);
        U = a("measurement.audience.filter_result_max_count", Integer.valueOf(MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN), rc.d.S, false);
        V = a("measurement.upload.max_public_user_properties", 100, null, false);
        W = a("measurement.upload.max_event_name_cardinality", Integer.valueOf(CastStatusCodes.AUTHENTICATION_FAILED), null, false);
        X = a("measurement.upload.max_public_event_params", 100, null, false);
        Y = a("measurement.service_client.idle_disconnect_millis", 5000L, rp.m.S, false);
        Z = a("measurement.service_client.reconnect_millis", 1000L, ru.c.S, false);
        Boolean bool = Boolean.FALSE;
        f14546a0 = a("measurement.test.boolean_flag", bool, rc.d.T, false);
        f14549b0 = a("measurement.test.string_flag", "---", rp.m.T, false);
        f14552c0 = a("measurement.test.long_flag", -1L, rc.d.U, false);
        a("measurement.test.cached_long_flag", -1L, rp.m.U, true);
        f14555d0 = a("measurement.test.int_flag", -2, ru.c.U, false);
        f14558e0 = a("measurement.test.double_flag", Double.valueOf(-3.0d), rc.d.V, false);
        f14561f0 = a("measurement.experiment.max_ids", 50, rp.m.V, false);
        f14564g0 = a("measurement.upload.max_item_scoped_custom_parameters", 27, ru.c.V, false);
        f14567h0 = a("measurement.upload.max_event_parameter_value_length", Integer.valueOf(MediaError.DetailedErrorCode.SEGMENT_UNKNOWN), rc.d.W, true);
        f14570i0 = a("measurement.max_bundles_per_iteration", 100, rp.m.W, false);
        f14573j0 = a("measurement.sdk.attribution.cache.ttl", 604800000L, ru.c.W, false);
        f14576k0 = a("measurement.redaction.app_instance_id.ttl", 7200000L, rc.d.X, false);
        f14578l0 = a("measurement.rb.attribution.client.min_ad_services_version", 7, ru.c.X, false);
        f14579m0 = a("measurement.dma_consent.max_daily_dcu_realtime_events", 1, rc.d.Y, false);
        f14581n0 = a("measurement.rb.attribution.uri_scheme", "https", rp.m.Y, false);
        f14583o0 = a("measurement.rb.attribution.uri_authority", "google-analytics.com", ru.c.Y, false);
        f14585p0 = a("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", rc.d.Z, false);
        f14587q0 = a("measurement.session.engagement_interval", 3600000L, rp.m.Z, false);
        f14589r0 = a("measurement.rb.attribution.app_allowlist", RuntimeVersion.SUFFIX, ru.c.Z, false);
        f14591s0 = a("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot", rc.d.f13165a0, false);
        f14593t0 = a("measurement.rb.attribution.event_params", "value|currency", rp.m.a0, false);
        f14595u0 = a("measurement.rb.attribution.query_parameters_to_remove", RuntimeVersion.SUFFIX, ru.c.a0, false);
        f14597v0 = a("measurement.rb.attribution.max_queue_time", 864000000L, rp.m.b0, false);
        f14599w0 = a("measurement.rb.attribution.max_retry_delay_seconds", 16, ru.c.b0, false);
        f14601x0 = a("measurement.rb.attribution.client.min_time_after_boot_seconds", 90, w.B, false);
        a("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0, x.B, false);
        f14603y0 = a("measurement.rb.max_trigger_registrations_per_day", 1000, y.B, false);
        Boolean bool2 = Boolean.TRUE;
        f14605z0 = a("measurement.config.bundle_for_all_apps_on_backgrounded", bool2, w.C, false);
        A0 = a("measurement.config.notify_trigger_uris_on_backgrounded", bool2, x.C, false);
        B0 = a("measurement.rb.attribution.notify_app_delay_millis", 3000, y.C, false);
        C0 = a("measurement.quality.checksum", bool, null, false);
        D0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, w.D, false);
        E0 = a("measurement.audience.refresh_event_count_filters_timestamp", bool, x.D, false);
        F0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, w.E, true);
        G0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, x.E, false);
        H0 = a("measurement.integration.disable_firebase_instance_id", bool, y.E, false);
        I0 = a("measurement.collection.service.update_with_analytics_fix", bool, w.F, false);
        J0 = a("measurement.service.storage_consent_support_version", 203600, x.F, false);
        K0 = a("measurement.service.store_null_safelist", bool2, y.F, false);
        L0 = a("measurement.service.store_safelist", bool2, w.G, false);
        M0 = a("measurement.session_stitching_token_enabled", bool, x.G, false);
        N0 = a("measurement.sgtm.client.upload_on_backgrounded.dev", bool, y.G, true);
        O0 = a("measurement.gmscore_client_telemetry", bool, w.M, false);
        P0 = a("measurement.rb.attribution.service", bool2, w.H, true);
        Q0 = a("measurement.rb.attribution.client2", bool2, y.H, true);
        R0 = a("measurement.rb.attribution.uuid_generation", bool2, w.I, false);
        S0 = a("measurement.rb.attribution.enable_trigger_redaction", bool2, x.I, false);
        a("measurement.rb.attribution.followup1.service", bool, y.I, false);
        T0 = a("measurement.rb.attribution.retry_disposition", bool, w.J, false);
        U0 = a("measurement.client.sessions.enable_fix_background_engagement", bool, y.M, false);
        V0 = a("measurement.set_default_event_parameters_propagate_clear.service.dev", bool2, x.J, false);
        W0 = a("measurement.set_default_event_parameters_propagate_clear.client.dev", bool2, y.J, false);
        X0 = a("measurement.service.ad_impression.convert_value_to_double", bool2, w.K, false);
        a("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", bool2, x.K, false);
        a("measurement.remove_conflicting_first_party_apis.dev", bool, y.K, false);
        Y0 = a("measurement.rb.attribution.service.trigger_uris_high_priority", bool2, rp.m.D, false);
        Z0 = a("measurement.tcf.consent_fix", bool2, ru.c.D, false);
        f14547a1 = a("measurement.experiment.enable_phenotype_experiment_reporting", bool2, rc.d.E, false);
        f14550b1 = a("measurement.set_default_event_parameters.fix_service_request_ordering", bool, ru.c.B, false);
        f14553c1 = a("measurement.set_default_event_parameters.fix_app_update_logging", bool2, rp.m.B, false);
        f14556d1 = a("measurement.service.fix_stop_bundling_bug", bool2, ru.c.C, false);
        f14559e1 = a("measurement.fix_params_logcat_spam", bool2, rp.m.C, false);
        f14562f1 = a("measurement.gbraid_campaign.stop_lgclid", bool, y.L, false);
        f14565g1 = a("measurement.gbraid_compaign.compaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid", rp.m.E, false);
        f14568h1 = a("measurement.edpb.service", bool, rc.d.C, false);
        f14571i1 = a("measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp", ru.c.E, false);
        f14574j1 = a("measurement.add_first_launch_logging_timestamp.service", bool, x.M, false);
        f14577k1 = a("measurement.overlapping_bundles_fix", bool, rc.d.F, false);
    }

    public static a0 a(String str, Object obj, t tVar, boolean z10) {
        a0 a0Var = new a0(str, obj, tVar);
        if (z10) {
            f14545a.add(a0Var);
        }
        return a0Var;
    }
}
