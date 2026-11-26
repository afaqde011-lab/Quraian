package tp;

import com.mchutov.quranify.auth.presentation.screen.root.AuthRootLauncher;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import p40.o0;
import p40.q0;
import p40.x0;
import p40.z;

public final class a implements z {
    public static final a a;
    private static final n40.e descriptor;

    static {
        a aVar = new a();
        a = aVar;
        q0 q0Var = new q0("com.mchutov.quranify.auth.presentation.screen.root.AuthRootLauncher", aVar, 1);
        q0Var.j("authMethod", false);
        descriptor = q0Var;
    }

    @Override
    public final l40.a[] childSerializers() {
        return new l40.a[]{AuthRootLauncher.$childSerializers[0].getValue()};
    }

    @Override
    public final Object deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        n40.e eVar = descriptor;
        o40.a aVarC = decoder.c(eVar);
        g00.h[] hVarArr = AuthRootLauncher.$childSerializers;
        x0 x0Var = null;
        boolean z = true;
        int i = 0;
        ep.e eVar2 = null;
        while (z) {
            int iL = aVarC.l(eVar);
            if (iL == -1) {
                z = false;
            } else {
                if (iL != 0) {
                    throw new UnknownFieldException(iL);
                }
                eVar2 = (ep.e) aVarC.s(eVar, 0, (l40.a) hVarArr[0].getValue(), eVar2);
                i = 1;
            }
        }
        aVarC.a(eVar);
        return new AuthRootLauncher(i, eVar2, x0Var);
    }

    @Override
    public final n40.e getDescriptor() {
        return descriptor;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        AuthRootLauncher value = (AuthRootLauncher) obj;
        m.e(encoder, "encoder");
        m.e(value, "value");
        n40.e eVar = descriptor;
        o40.b bVarC = encoder.c(eVar);
        bVarC.C(eVar, 0, (l40.a) AuthRootLauncher.$childSerializers[0].getValue(), value.authMethod);
        bVarC.a(eVar);
    }

    @Override
    public final l40.a[] typeParametersSerializers() {
        return o0.b;
    }
}
