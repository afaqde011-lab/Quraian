package gx;

import com.mchutov.quranify.reciters.presentation.screen.collection.topreciters.TopRecitersLauncher;
import kotlinx.serialization.UnknownFieldException;
import p40.o0;
import p40.q0;
import p40.z;

public final class l implements z {
    public static final l a;
    private static final n40.e descriptor;

    static {
        l lVar = new l();
        a = lVar;
        q0 q0Var = new q0("com.mchutov.quranify.reciters.presentation.navigation.ReciterRoute.TopReciters", lVar, 1);
        q0Var.j("launcher", false);
        descriptor = q0Var;
    }

    @Override
    public final l40.a[] childSerializers() {
        return new l40.a[]{jx.l.a};
    }

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        n40.e eVar = descriptor;
        o40.a aVarC = decoder.c(eVar);
        TopRecitersLauncher topRecitersLauncher = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iL = aVarC.l(eVar);
            if (iL == -1) {
                z = false;
            } else {
                if (iL != 0) {
                    throw new UnknownFieldException(iL);
                }
                topRecitersLauncher = (TopRecitersLauncher) aVarC.s(eVar, 0, jx.l.a, topRecitersLauncher);
                i = 1;
            }
        }
        aVarC.a(eVar);
        return new n(i, topRecitersLauncher);
    }

    @Override
    public final n40.e getDescriptor() {
        return descriptor;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        n value = (n) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        n40.e eVar = descriptor;
        o40.b bVarC = encoder.c(eVar);
        m mVar = n.Companion;
        bVarC.C(eVar, 0, jx.l.a, value.a);
        bVarC.a(eVar);
    }

    @Override
    public final l40.a[] typeParametersSerializers() {
        return o0.b;
    }
}
