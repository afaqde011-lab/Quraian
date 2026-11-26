package androidx.media3.cast;

import android.content.Context;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.OptionsProvider;
import com.google.android.gms.cast.framework.SessionProvider;
import java.util.Collections;
import java.util.List;

public final class DefaultCastOptionsProvider implements OptionsProvider {
    public static final String APP_ID_DEFAULT_RECEIVER_WITH_DRM = "A12D4273";

    @Override
    public List<SessionProvider> getAdditionalSessionProviders(Context context) {
        return Collections.EMPTY_LIST;
    }

    @Override
    public CastOptions getCastOptions(Context context) {
        return new CastOptions.Builder().setResumeSavedSession(false).setEnableReconnectionService(false).setReceiverApplicationId(APP_ID_DEFAULT_RECEIVER_WITH_DRM).setStopReceiverApplicationWhenEndingSession(true).setRemoteToLocalEnabled(true).build();
    }
}
