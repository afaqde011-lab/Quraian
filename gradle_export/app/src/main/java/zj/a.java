package zj;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.g4;
import g00.b0;

public final class a implements n {

    public final Bundle f17503a;

    public a(Context context) {
        kotlin.jvm.internal.m.e(context, "appContext");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), Cast.MAX_NAMESPACE_LENGTH).metaData;
        this.f17503a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override
    public final Boolean a() {
        Bundle bundle = this.f17503a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override
    public final s30.b b() {
        Bundle bundle = this.f17503a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new s30.b(g4.b0(bundle.getInt("firebase_sessions_sessions_restart_timeout"), s30.d.E));
        }
        return null;
    }

    @Override
    public final Double c() {
        Bundle bundle = this.f17503a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override
    public final Object d(k00.c cVar) {
        return b0.a;
    }
}
