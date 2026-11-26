package androidx.media3.cast;

import android.content.Context;
import androidx.mediarouter.app.MediaRouteButton;

public final class c implements d4.i {
    public final int A;
    public final Context B;
    public final MediaRouteButton C;

    public c(int i10, Context context, MediaRouteButton mediaRouteButton) {
        this.A = i10;
        this.B = context;
        this.C = mediaRouteButton;
    }

    @Override
    public final Object h(d4.h hVar) {
        switch (this.A) {
            case 0:
                return MediaRouteButtonFactory.lambda$setUpMediaRouteButton$2(this.B, this.C, hVar);
            default:
                return MediaRouteButtonViewProvider.lambda$getView$2(this.B, this.C, hVar);
        }
    }
}
