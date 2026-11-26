package jx;

import com.mchutov.quranify.reciters.presentation.screen.collection.topreciters.TopRecitersLauncher;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p40.b1;
import p40.e0;
import p40.o0;
import p40.q0;
import p40.z;

public final class l implements z {
    public static final l a;
    private static final n40.e descriptor;

    static {
        l lVar = new l();
        a = lVar;
        q0 q0Var = new q0("com.mchutov.quranify.reciters.presentation.screen.collection.topreciters.TopRecitersLauncher", lVar, 3);
        q0Var.j("title", false);
        q0Var.j("items", false);
        q0Var.j("collectionId", false);
        descriptor = q0Var;
    }

    @Override
    public final l40.a[] childSerializers() {
        return new l40.a[]{b1.a, TopRecitersLauncher.$childSerializers[1].getValue(), e0.a};
    }

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        n40.e eVar = descriptor;
        o40.a aVarC = decoder.c(eVar);
        g00.h[] hVarArr = TopRecitersLauncher.$childSerializers;
        int i = 0;
        int iQ = 0;
        String strT = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iL = aVarC.l(eVar);
            if (iL == -1) {
                z = false;
            } else if (iL == 0) {
                strT = aVarC.t(eVar, 0);
                i |= 1;
            } else if (iL == 1) {
                list = (List) aVarC.s(eVar, 1, (l40.a) hVarArr[1].getValue(), list);
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
        return new TopRecitersLauncher(i, strT, list, iQ, null);
    }

    @Override
    public final n40.e getDescriptor() {
        return descriptor;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        TopRecitersLauncher value = (TopRecitersLauncher) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        n40.e eVar = descriptor;
        o40.b bVarC = encoder.c(eVar);
        TopRecitersLauncher.write$Self$app_release(value, bVarC, eVar);
        bVarC.a(eVar);
    }

    @Override
    public final l40.a[] typeParametersSerializers() {
        return o0.b;
    }
}
