package androidx.media3.cast;

import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import g1.o3;
import kotlin.Metadata;
import l1.g0;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ComposableSingletons$MediaRouteButtonKt {
    public static final ComposableSingletons$MediaRouteButtonKt INSTANCE = new ComposableSingletons$MediaRouteButtonKt();

    public static u00.o f0lambda1 = new v1.c(new u00.o() {
        public Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((MediaRouteButtonState) obj, (l1.j) obj2, ((Number) obj3).intValue());
            return b0.a;
        }

        public final void invoke(MediaRouteButtonState mediaRouteButtonState, l1.j jVar, int i10) {
            m2.b bVarR;
            String strU;
            kotlin.jvm.internal.m.e(mediaRouteButtonState, "<this>");
            if (mediaRouteButtonState.getConnectionState() == 2) {
                g0 g0Var = (g0) jVar;
                g0Var.c0(305892694);
                bVarR = y3.R(R.drawable.media_route_button_connected, jVar, 0);
                g0Var.r(false);
            } else {
                g0 g0Var2 = (g0) jVar;
                g0Var2.c0(305895033);
                bVarR = y3.R(R.drawable.media_route_button_disconnected, jVar, 0);
                g0Var2.r(false);
            }
            m2.b bVar = bVarR;
            int connectionState = mediaRouteButtonState.getConnectionState();
            if (connectionState == 1) {
                g0 g0Var3 = (g0) jVar;
                g0Var3.c0(305904596);
                strU = z3.U(jVar, R.string.media_route_button_connecting);
                g0Var3.r(false);
            } else if (connectionState != 2) {
                g0 g0Var4 = (g0) jVar;
                g0Var4.c0(305906870);
                strU = z3.U(jVar, R.string.media_route_button_disconnected);
                g0Var4.r(false);
            } else {
                g0 g0Var5 = (g0) jVar;
                g0Var5.c0(305900979);
                strU = z3.U(jVar, R.string.media_route_button_connected);
                g0Var5.r(false);
            }
            o3.a(bVar, strU, null, 0L, jVar, 0, 12);
        }
    }, 1358229378, false);

    public final u00.o m9getLambda1$lib_cast_release() {
        return f0lambda1;
    }
}
