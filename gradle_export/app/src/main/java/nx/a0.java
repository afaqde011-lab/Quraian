package nx;

import com.mchutov.quranify.reciters.presentation.screen.detail.main.ReciterLauncher;
import kotlinx.serialization.UnknownFieldException;
import p40.q0;
import p40.x0;

public final class a0 implements p40.z {
    public static final a0 a;
    private static final n40.e descriptor;

    static {
        a0 a0Var = new a0();
        a = a0Var;
        q0 q0Var = new q0("com.mchutov.quranify.reciters.presentation.screen.detail.main.ReciterLauncher", a0Var, 2);
        q0Var.j("reciterType", false);
        q0Var.j("sharedSurahNumber", true);
        descriptor = q0Var;
    }

    @Override
    public final l40.a[] childSerializers() {
        p40.e0 e0Var = p40.e0.a;
        return new l40.a[]{e0Var, ta.c0.G(e0Var)};
    }

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        n40.e eVar = descriptor;
        o40.a aVarC = decoder.c(eVar);
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
                num = (Integer) aVarC.v(eVar, 1, p40.e0.a, num);
                i |= 2;
            }
        }
        aVarC.a(eVar);
        return new ReciterLauncher(i, iQ, num, (x0) null);
    }

    @Override
    public final n40.e getDescriptor() {
        return descriptor;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        ReciterLauncher value = (ReciterLauncher) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        n40.e eVar = descriptor;
        o40.b bVarC = encoder.c(eVar);
        ReciterLauncher.write$Self$app_release(value, bVarC, eVar);
        bVarC.a(eVar);
    }

    @Override
    public final l40.a[] typeParametersSerializers() {
        return p40.o0.b;
    }
}
