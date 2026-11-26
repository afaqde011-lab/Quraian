package zy;

import com.mchutov.quranify.settings.presentation.screen.deletecode.DeleteAccountCodeLauncher;
import kotlinx.serialization.UnknownFieldException;
import p40.b1;
import p40.e0;
import p40.o0;
import p40.q0;
import p40.x0;
import p40.z;

public final class i implements z {
    public static final i a;
    private static final n40.e descriptor;

    static {
        i iVar = new i();
        a = iVar;
        q0 q0Var = new q0("com.mchutov.quranify.settings.presentation.screen.deletecode.DeleteAccountCodeLauncher", iVar, 3);
        q0Var.j("reason", false);
        q0Var.j("reasonSpecification", false);
        q0Var.j("resendIn", true);
        descriptor = q0Var;
    }

    @Override
    public final l40.a[] childSerializers() {
        b1 b1Var = b1.a;
        return new l40.a[]{b1Var, b1Var, e0.a};
    }

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        n40.e eVar = descriptor;
        o40.a aVarC = decoder.c(eVar);
        int i = 0;
        int iQ = 0;
        String strT = null;
        String strT2 = null;
        boolean z = true;
        while (z) {
            int iL = aVarC.l(eVar);
            if (iL == -1) {
                z = false;
            } else if (iL == 0) {
                strT = aVarC.t(eVar, 0);
                i |= 1;
            } else if (iL == 1) {
                strT2 = aVarC.t(eVar, 1);
                i |= 2;
            } else {
                if (iL != 2) {
                    throw new UnknownFieldException(iL);
                }
                iQ = aVarC.q(eVar, 2);
                i |= 4;
            }
        }
        aVarC.a(eVar);
        return new DeleteAccountCodeLauncher(i, strT, strT2, iQ, (x0) null);
    }

    @Override
    public final n40.e getDescriptor() {
        return descriptor;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        DeleteAccountCodeLauncher value = (DeleteAccountCodeLauncher) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        n40.e eVar = descriptor;
        o40.b bVarC = encoder.c(eVar);
        DeleteAccountCodeLauncher.write$Self$app_release(value, bVarC, eVar);
        bVarC.a(eVar);
    }

    @Override
    public final l40.a[] typeParametersSerializers() {
        return o0.b;
    }
}
