package qx;

import com.mchutov.quranify.reciters.presentation.screen.search.SearchReciterLauncher;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p40.b1;
import p40.o0;
import p40.q0;
import p40.x0;
import p40.z;
import ta.c0;

public final class l implements z {
    public static final l a;
    private static final n40.e descriptor;

    static {
        l lVar = new l();
        a = lVar;
        q0 q0Var = new q0("com.mchutov.quranify.reciters.presentation.screen.search.SearchReciterLauncher", lVar, 3);
        q0Var.j("title", false);
        q0Var.j("reciterIds", false);
        q0Var.j("slug", true);
        descriptor = q0Var;
    }

    @Override
    public final l40.a[] childSerializers() {
        g00.h[] hVarArr = SearchReciterLauncher.$childSerializers;
        b1 b1Var = b1.a;
        return new l40.a[]{b1Var, hVarArr[1].getValue(), c0.G(b1Var)};
    }

    @Override
    public final Object deserialize(o40.c decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        n40.e eVar = descriptor;
        o40.a aVarC = decoder.c(eVar);
        g00.h[] hVarArr = SearchReciterLauncher.$childSerializers;
        int i = 0;
        String strT = null;
        List list = null;
        String str = null;
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
                str = (String) aVarC.v(eVar, 2, b1.a, str);
                i |= 4;
            }
        }
        aVarC.a(eVar);
        return new SearchReciterLauncher(i, strT, list, str, (x0) null);
    }

    @Override
    public final n40.e getDescriptor() {
        return descriptor;
    }

    @Override
    public final void serialize(o40.d encoder, Object obj) {
        SearchReciterLauncher value = (SearchReciterLauncher) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        n40.e eVar = descriptor;
        o40.b bVarC = encoder.c(eVar);
        SearchReciterLauncher.write$Self$app_release(value, bVarC, eVar);
        bVarC.a(eVar);
    }

    @Override
    public final l40.a[] typeParametersSerializers() {
        return o0.b;
    }
}
