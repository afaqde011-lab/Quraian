package gx;

import com.mchutov.quranify.reciters.presentation.navigation.ReciterRoute$ReciterScreen;
import com.mchutov.quranify.reciters.presentation.screen.detail.main.ReciterLauncher;
import kotlinx.serialization.UnknownFieldException;
import nx.a0;
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
        q0 q0Var = new q0("com.mchutov.quranify.reciters.presentation.navigation.ReciterRoute.ReciterScreen", gVar, 1);
        q0Var.j("launcher", false);
        descriptor = q0Var;
    }

    @Override
    public final l40.a[] childSerializers() {
        return new l40.a[]{a0.a};
    }

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        n40.e eVar = descriptor;
        o40.a aVarC = decoder.c(eVar);
        x0 x0Var = null;
        boolean z = true;
        int i = 0;
        ReciterLauncher reciterLauncher = null;
        while (z) {
            int iL = aVarC.l(eVar);
            if (iL == -1) {
                z = false;
            } else {
                if (iL != 0) {
                    throw new UnknownFieldException(iL);
                }
                reciterLauncher = (ReciterLauncher) aVarC.s(eVar, 0, a0.a, reciterLauncher);
                i = 1;
            }
        }
        aVarC.a(eVar);
        return new ReciterRoute$ReciterScreen(i, reciterLauncher, x0Var);
    }

    @Override
    public final n40.e getDescriptor() {
        return descriptor;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        ReciterRoute$ReciterScreen value = (ReciterRoute$ReciterScreen) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        n40.e eVar = descriptor;
        o40.b bVarC = encoder.c(eVar);
        bVarC.C(eVar, 0, a0.a, value.launcher);
        bVarC.a(eVar);
    }

    @Override
    public final l40.a[] typeParametersSerializers() {
        return o0.b;
    }
}
