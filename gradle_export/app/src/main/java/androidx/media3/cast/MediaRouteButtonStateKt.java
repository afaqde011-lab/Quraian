package androidx.media3.cast;

import android.content.Context;
import kotlin.Metadata;
import l1.g0;
import o9.u;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", "context", "Lo9/u;", "selector", "Landroidx/media3/cast/MediaRouteButtonState;", "rememberMediaRouteButtonState", "(Landroid/content/Context;Lo9/u;Ll1/j;I)Landroidx/media3/cast/MediaRouteButtonState;", "lib-cast_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MediaRouteButtonStateKt {
    public static final MediaRouteButtonState rememberMediaRouteButtonState(Context context, u uVar, l1.j jVar, int i10) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(uVar, "selector");
        g0 g0Var = (g0) jVar;
        g0Var.c0(775785389);
        g0Var.c0(-1119120192);
        boolean zG = g0Var.g(context) | g0Var.g(uVar);
        Object objN = g0Var.N();
        l1.c cVar = l1.i.f9868a;
        if (zG || objN == cVar) {
            objN = new MediaRouteButtonState(context, uVar);
            g0Var.n0(objN);
        }
        MediaRouteButtonState mediaRouteButtonState = (MediaRouteButtonState) objN;
        g0Var.r(false);
        g0Var.c0(-1119116613);
        boolean zI = g0Var.i(mediaRouteButtonState);
        Object objN2 = g0Var.N();
        if (zI || objN2 == cVar) {
            objN2 = new MediaRouteButtonStateKt$rememberMediaRouteButtonState$1$1(mediaRouteButtonState, null);
            g0Var.n0(objN2);
        }
        g0Var.r(false);
        l1.q.i(mediaRouteButtonState, g0Var, (u00.n) objN2);
        g0Var.r(false);
        return mediaRouteButtonState;
    }
}
