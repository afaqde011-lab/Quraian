package com.mchutov.quranify.cast;

import android.content.Context;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.OptionsProvider;
import com.google.android.gms.cast.framework.SessionProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lcom/mchutov/quranify/cast/QuranifyCastOptionsProvider;", "Lcom/google/android/gms/cast/framework/OptionsProvider;", "<init>", "()V", "getCastOptions", "Lcom/google/android/gms/cast/framework/CastOptions;", "context", "Landroid/content/Context;", "getAdditionalSessionProviders", "", "Lcom/google/android/gms/cast/framework/SessionProvider;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class QuranifyCastOptionsProvider implements OptionsProvider {
    public static final int $stable = 0;

    public List<SessionProvider> getAdditionalSessionProviders(Context context) {
        m.e(context, "context");
        return null;
    }

    public CastOptions getCastOptions(Context context) {
        m.e(context, "context");
        CastOptions castOptionsBuild = new CastOptions.Builder().setReceiverApplicationId("CC1AD845").setRemoteToLocalEnabled(true).build();
        m.d(castOptionsBuild, "build(...)");
        return castOptionsBuild;
    }
}
