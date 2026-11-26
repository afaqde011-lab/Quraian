package gx;

import com.mchutov.quranify.reciters.presentation.screen.search.SearchReciterLauncher;
import kotlinx.serialization.UnknownFieldException;
import p40.o0;
import p40.q0;
import p40.z;

public final class i implements z {
    public static final i a;
    private static final n40.e descriptor;

    static {
        i iVar = new i();
        a = iVar;
        q0 q0Var = new q0("com.mchutov.quranify.reciters.presentation.navigation.ReciterRoute.SearchReciters", iVar, 1);
        q0Var.j("launcher", false);
        descriptor = q0Var;
    }

    @Override
    public final l40.a[] childSerializers() {
        return new l40.a[]{qx.l.a};
    }

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        n40.e eVar = descriptor;
        o40.a aVarC = decoder.c(eVar);
        SearchReciterLauncher searchReciterLauncher = null;
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
                searchReciterLauncher = (SearchReciterLauncher) aVarC.s(eVar, 0, qx.l.a, searchReciterLauncher);
                i = 1;
            }
        }
        aVarC.a(eVar);
        return new k(i, searchReciterLauncher);
    }

    @Override
    public final n40.e getDescriptor() {
        return descriptor;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        k value = (k) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        n40.e eVar = descriptor;
        o40.b bVarC = encoder.c(eVar);
        j jVar = k.Companion;
        bVarC.C(eVar, 0, qx.l.a, value.a);
        bVarC.a(eVar);
    }

    @Override
    public final l40.a[] typeParametersSerializers() {
        return o0.b;
    }
}
