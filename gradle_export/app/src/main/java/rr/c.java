package rr;

import com.mchutov.quranify.home.presentation.navigation.HomeRoute$AudioStoryScreen;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import p40.e0;
import p40.o0;
import p40.q0;
import p40.x0;
import p40.z;
import ta.c0;

public final class c implements z {
    public static final c a;
    private static final n40.e descriptor;

    static {
        c cVar = new c();
        a = cVar;
        q0 q0Var = new q0("com.mchutov.quranify.home.presentation.navigation.HomeRoute.AudioStoryScreen", cVar, 2);
        q0Var.j("storyId", false);
        q0Var.j("sharedEpisodeId", true);
        descriptor = q0Var;
    }

    @Override
    public final l40.a[] childSerializers() {
        e0 e0Var = e0.a;
        return new l40.a[]{e0Var, c0.G(e0Var)};
    }

    @Override
    public final Object deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        n40.e eVar = descriptor;
        o40.a aVarC = decoder.c(eVar);
        x0 x0Var = null;
        boolean z = true;
        int i = 0;
        int iQ = 0;
        Integer num = null;
        while (z) {
            int iL = aVarC.l(eVar);
            if (iL == -1) {
                z = false;
            } else if (iL == 0) {
                iQ = aVarC.q(eVar, 0);
                i |= 1;
            } else {
                if (iL != 1) {
                    throw new UnknownFieldException(iL);
                }
                num = (Integer) aVarC.v(eVar, 1, e0.a, num);
                i |= 2;
            }
        }
        aVarC.a(eVar);
        return new HomeRoute$AudioStoryScreen(i, iQ, num, x0Var);
    }

    @Override
    public final n40.e getDescriptor() {
        return descriptor;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        HomeRoute$AudioStoryScreen value = (HomeRoute$AudioStoryScreen) obj;
        m.e(encoder, "encoder");
        m.e(value, "value");
        n40.e eVar = descriptor;
        o40.b bVarC = encoder.c(eVar);
        HomeRoute$AudioStoryScreen.write$Self$app_release(value, bVarC, eVar);
        bVarC.a(eVar);
    }

    @Override
    public final l40.a[] typeParametersSerializers() {
        return o0.b;
    }
}
