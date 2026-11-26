package rr;

import as.x;
import com.mchutov.quranify.home.presentation.navigation.HomeRoute$PlaylistScreen;
import com.mchutov.quranify.home.presentation.screen.playlist.PlaylistLauncher;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import p40.o0;
import p40.q0;
import p40.x0;
import p40.z;

public final class g implements z {
    public static final g a;
    private static final n40.e descriptor;

    static {
        g gVar = new g();
        a = gVar;
        q0 q0Var = new q0("com.mchutov.quranify.home.presentation.navigation.HomeRoute.PlaylistScreen", gVar, 1);
        q0Var.j("launcher", false);
        descriptor = q0Var;
    }

    @Override
    public final l40.a[] childSerializers() {
        return new l40.a[]{x.a};
    }

    @Override
    public final Object deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        n40.e eVar = descriptor;
        o40.a aVarC = decoder.c(eVar);
        x0 x0Var = null;
        boolean z = true;
        int i = 0;
        PlaylistLauncher playlistLauncher = null;
        while (z) {
            int iL = aVarC.l(eVar);
            if (iL == -1) {
                z = false;
            } else {
                if (iL != 0) {
                    throw new UnknownFieldException(iL);
                }
                playlistLauncher = (PlaylistLauncher) aVarC.s(eVar, 0, x.a, playlistLauncher);
                i = 1;
            }
        }
        aVarC.a(eVar);
        return new HomeRoute$PlaylistScreen(i, playlistLauncher, x0Var);
    }

    @Override
    public final n40.e getDescriptor() {
        return descriptor;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        HomeRoute$PlaylistScreen value = (HomeRoute$PlaylistScreen) obj;
        m.e(encoder, "encoder");
        m.e(value, "value");
        n40.e eVar = descriptor;
        o40.b bVarC = encoder.c(eVar);
        bVarC.C(eVar, 0, x.a, value.launcher);
        bVarC.a(eVar);
    }

    @Override
    public final l40.a[] typeParametersSerializers() {
        return o0.b;
    }
}
