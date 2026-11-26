package tf;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.protobuf.RuntimeVersion;

public final class w0 extends o1 {

    public static final Pair f14748a0 = new Pair(RuntimeVersion.SUFFIX, 0L);
    public SharedPreferences D;
    public SharedPreferences E;
    public bb.d F;
    public final i7.m1 G;
    public final c7.c H;
    public String I;
    public boolean J;
    public long K;
    public final i7.m1 L;
    public final v0 M;
    public final c7.c N;
    public final p10.a O;
    public final v0 P;
    public final i7.m1 Q;
    public final i7.m1 R;
    public boolean S;
    public final v0 T;
    public final v0 U;
    public final i7.m1 V;
    public final c7.c W;
    public final c7.c X;
    public final i7.m1 Y;
    public final p10.a Z;

    public w0(h1 h1Var) {
        super(h1Var);
        this.L = new i7.m1(this, "session_timeout", 1800000L);
        this.M = new v0(this, "start_new_session", true);
        this.Q = new i7.m1(this, "last_pause_time", 0L);
        this.R = new i7.m1(this, "session_id", 0L);
        this.N = new c7.c(this, "non_personalized_ads");
        this.O = new p10.a(this, "last_received_uri_timestamps_by_source");
        this.P = new v0(this, "allow_remote_dynamite", false);
        this.G = new i7.m1(this, "first_open_time", 0L);
        com.google.android.gms.common.internal.d0.e("app_install_time");
        this.H = new c7.c(this, "app_instance_id");
        this.T = new v0(this, "app_backgrounded", false);
        this.U = new v0(this, "deep_link_retrieval_complete", false);
        this.V = new i7.m1(this, "deep_link_retrieval_attempts", 0L);
        this.W = new c7.c(this, "firebase_feature_rollouts");
        this.X = new c7.c(this, "deferred_attribution_cache");
        this.Y = new i7.m1(this, "deferred_attribution_cache_timestamp", 0L);
        this.Z = new p10.a(this, "default_event_parameters");
    }

    @Override
    public final boolean W0() {
        return true;
    }

    public final SharedPreferences Z0() {
        V0();
        X0();
        com.google.android.gms.common.internal.d0.h(this.D);
        return this.D;
    }

    public final SharedPreferences a1() {
        V0();
        X0();
        if (this.E == null) {
            h1 h1Var = (h1) this.B;
            String strValueOf = String.valueOf(h1Var.A.getPackageName());
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            b50.b bVar = q0Var.O;
            String strConcat = strValueOf.concat("_preferences");
            bVar.c(strConcat, "Default prefs file");
            this.E = h1Var.A.getSharedPreferences(strConcat, 0);
        }
        return this.E;
    }

    public final SparseArray b1() {
        Bundle bundleF = this.O.F();
        int[] intArray = bundleF.getIntArray("uriSources");
        long[] longArray = bundleF.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            q0 q0Var = ((h1) this.B).F;
            h1.g(q0Var);
            q0Var.G.b("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    public final t1 c1() {
        V0();
        return t1.c(Z0().getInt("consent_source", 100), Z0().getString("consent_settings", "G1"));
    }

    public final boolean d1(k3 k3Var) {
        V0();
        String string = Z0().getString("stored_tcf_param", RuntimeVersion.SUFFIX);
        String strA = k3Var.a();
        if (strA.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = Z0().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        return true;
    }

    public final void e1(boolean z10) {
        V0();
        q0 q0Var = ((h1) this.B).F;
        h1.g(q0Var);
        q0Var.O.c(Boolean.valueOf(z10), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = Z0().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z10);
        editorEdit.apply();
    }

    public final boolean f1(long j9) {
        return j9 - this.L.e() > this.Q.e();
    }
}
