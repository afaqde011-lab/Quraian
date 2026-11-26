package androidx.media3.cast;

import a10.h0;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.gms.cast.framework.CastButtonFactory;
import com.google.android.gms.tasks.Task;
import java.util.Objects;
import kh.v;

public final class MediaRouteButtonFactory {
    private MediaRouteButtonFactory() {
    }

    public static Object lambda$setUpMediaRouteButton$0(Context context, Menu menu, int i10, d4.h hVar) throws Exception {
        Task<MenuItem> upMediaRouteButton = CastButtonFactory.setUpMediaRouteButton(context, e7.a.f(), menu, i10);
        Objects.requireNonNull(hVar);
        xf.n nVarG = upMediaRouteButton.g(new b(hVar, 0));
        nVarG.d(xf.h.f16566a, new b(hVar, 1));
        return nVarG;
    }

    public static Object lambda$setUpMediaRouteButton$2(Context context, MediaRouteButton mediaRouteButton, d4.h hVar) throws Exception {
        xf.n nVarG = CastButtonFactory.setUpMediaRouteButton(context, e7.a.f(), mediaRouteButton).g(new b(hVar, 2));
        Objects.requireNonNull(hVar);
        nVarG.d(xf.h.f16566a, new b(hVar, 1));
        return nVarG;
    }

    public static v setUpMediaRouteButton(Context context, Menu menu, int i10) {
        return h0.A(new a(context, menu, i10));
    }

    public static v setUpMediaRouteButton(Context context, MediaRouteButton mediaRouteButton) {
        return h0.A(new c(0, context, mediaRouteButton));
    }
}
