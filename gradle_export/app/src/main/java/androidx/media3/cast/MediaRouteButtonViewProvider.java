package androidx.media3.cast;

import a10.h0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.media3.common.x2;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.gms.cast.framework.CastButtonFactory;
import kh.v;

public final class MediaRouteButtonViewProvider implements x2 {
    public static Object lambda$getView$2(Context context, MediaRouteButton mediaRouteButton, d4.h hVar) throws Exception {
        xf.n nVarG = CastButtonFactory.setUpMediaRouteButton(context, e7.a.f(), mediaRouteButton).g(new ak.a(hVar, mediaRouteButton, 1));
        nVarG.d(xf.h.f16566a, new b(hVar, 3));
        return nVarG;
    }

    @Override
    public v getView(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        return h0.A(new c(1, context, (MediaRouteButton) LayoutInflater.from(context).inflate(R.layout.media_route_button_view, viewGroup, false)));
    }
}
