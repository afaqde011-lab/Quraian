package as;

import com.mchutov.quranify.home.presentation.screen.playlist.PlaylistLauncher;
import kotlinx.serialization.UnknownFieldException;

public final class x implements p40.z {
    public static final x a;
    private static final n40.e descriptor;

    static {
        x xVar = new x();
        a = xVar;
        p40.q0 q0Var = new p40.q0("com.mchutov.quranify.home.presentation.screen.playlist.PlaylistLauncher", xVar, 1);
        q0Var.j("playlistId", false);
        descriptor = q0Var;
    }

    @Override
    public final l40.a[] childSerializers() {
        return new l40.a[]{p40.e0.a};
    }

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        n40.e eVar = descriptor;
        o40.a aVarC = decoder.c(eVar);
        boolean z = true;
        int i = 0;
        int iQ = 0;
        while (z) {
            int iL = aVarC.l(eVar);
            if (iL == -1) {
                z = false;
            } else {
                if (iL != 0) {
                    throw new UnknownFieldException(iL);
                }
                iQ = aVarC.q(eVar, 0);
                i = 1;
            }
        }
        aVarC.a(eVar);
        return new PlaylistLauncher(i, iQ, null);
    }

    @Override
    public final n40.e getDescriptor() {
        return descriptor;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        PlaylistLauncher value = (PlaylistLauncher) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        n40.e eVar = descriptor;
        o40.b bVarC = encoder.c(eVar);
        bVarC.w(0, value.playlistId, eVar);
        bVarC.a(eVar);
    }

    @Override
    public final l40.a[] typeParametersSerializers() {
        return p40.o0.b;
    }
}
