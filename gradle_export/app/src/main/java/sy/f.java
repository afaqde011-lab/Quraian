package sy;

import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$DeleteAccountCodeScreen;
import com.mchutov.quranify.settings.presentation.screen.deletecode.DeleteAccountCodeLauncher;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import p40.o0;
import p40.q0;
import p40.x0;
import p40.z;

public final class f implements z {
    public static final f a;
    private static final n40.e descriptor;

    static {
        f fVar = new f();
        a = fVar;
        q0 q0Var = new q0("com.mchutov.quranify.settings.presentation.navigation.SettingsRoute.DeleteAccountCodeScreen", fVar, 1);
        q0Var.j("launcher", false);
        descriptor = q0Var;
    }

    @Override
    public final l40.a[] childSerializers() {
        return new l40.a[]{zy.i.a};
    }

    @Override
    public final Object deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        n40.e eVar = descriptor;
        o40.a aVarC = decoder.c(eVar);
        x0 x0Var = null;
        boolean z = true;
        int i = 0;
        DeleteAccountCodeLauncher deleteAccountCodeLauncher = null;
        while (z) {
            int iL = aVarC.l(eVar);
            if (iL == -1) {
                z = false;
            } else {
                if (iL != 0) {
                    throw new UnknownFieldException(iL);
                }
                deleteAccountCodeLauncher = (DeleteAccountCodeLauncher) aVarC.s(eVar, 0, zy.i.a, deleteAccountCodeLauncher);
                i = 1;
            }
        }
        aVarC.a(eVar);
        return new SettingsRoute$DeleteAccountCodeScreen(i, deleteAccountCodeLauncher, x0Var);
    }

    @Override
    public final n40.e getDescriptor() {
        return descriptor;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        SettingsRoute$DeleteAccountCodeScreen value = (SettingsRoute$DeleteAccountCodeScreen) obj;
        m.e(encoder, "encoder");
        m.e(value, "value");
        n40.e eVar = descriptor;
        o40.b bVarC = encoder.c(eVar);
        bVarC.C(eVar, 0, zy.i.a, value.launcher);
        bVarC.a(eVar);
    }

    @Override
    public final l40.a[] typeParametersSerializers() {
        return o0.b;
    }
}
