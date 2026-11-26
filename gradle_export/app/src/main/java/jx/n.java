package jx;

import kotlinx.serialization.UnknownFieldException;
import p40.e0;
import p40.o0;
import p40.q0;
import p40.z;
import ta.c0;

public final class n implements z {
    public static final n a;
    private static final n40.e descriptor;

    static {
        n nVar = new n();
        a = nVar;
        q0 q0Var = new q0("com.mchutov.quranify.reciters.presentation.screen.collection.topreciters.TopRecitersLauncherItem", nVar, 2);
        q0Var.j("reciterId", false);
        q0Var.j("listensCount", true);
        descriptor = q0Var;
    }

    @Override
    public final l40.a[] childSerializers() {
        e0 e0Var = e0.a;
        return new l40.a[]{e0Var, c0.G(e0Var)};
    }

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        n40.e eVar = descriptor;
        o40.a aVarC = decoder.c(eVar);
        Integer num = null;
        boolean z = true;
        int i = 0;
        int iQ = 0;
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
        return new p(i, num, iQ);
    }

    @Override
    public final n40.e getDescriptor() {
        return descriptor;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        p value = (p) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        n40.e eVar = descriptor;
        o40.b bVarC = encoder.c(eVar);
        int i = value.a;
        Integer num = value.b;
        bVarC.w(0, i, eVar);
        if (bVarC.k(eVar) || num != null) {
            bVarC.x(eVar, 1, e0.a, num);
        }
        bVarC.a(eVar);
    }

    @Override
    public final l40.a[] typeParametersSerializers() {
        return o0.b;
    }
}
