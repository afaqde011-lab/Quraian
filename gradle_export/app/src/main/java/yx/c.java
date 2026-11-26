package yx;

import com.mchutov.quranify.reciters.presentation.navigation.ReciterRoute$ReciterScreen;
import com.mchutov.quranify.search.presentation.navigation.SearchRoute$PlaylistScreen;
import g00.b0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import u00.k;

public final class c implements k {
    public final int A;
    public final LinkedHashMap B;
    public final e60.a C;

    public c(LinkedHashMap linkedHashMap, e60.a aVar, int i) {
        this.A = i;
        this.B = linkedHashMap;
        this.C = aVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                p9.d _scopedInstanceFactory = (p9.d) obj;
                m.e(_scopedInstanceFactory, "$this$_scopedInstanceFactory");
                v1.c cVar = new v1.c(new ny.f(this.C, 8), -557655062, true);
                _scopedInstanceFactory.a(a0.a.b(ReciterRoute$ReciterScreen.class), b.C, this.B, cVar);
                break;
            default:
                p9.d _scopedInstanceFactory2 = (p9.d) obj;
                m.e(_scopedInstanceFactory2, "$this$_scopedInstanceFactory");
                v1.c cVar2 = new v1.c(new ny.f(this.C, 9), -557655062, true);
                _scopedInstanceFactory2.a(a0.a.b(SearchRoute$PlaylistScreen.class), b.D, this.B, cVar2);
                break;
        }
        return b0.a;
    }
}
