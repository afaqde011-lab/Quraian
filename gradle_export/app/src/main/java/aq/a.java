package aq;

import com.mchutov.quranify.player.presentation.screen.bottomsheet.FullScreenLauncher;
import g00.b0;
import m00.c;

public interface a {
    static void a(a aVar, boolean z, int i) {
        boolean z2 = (i & 2) == 0;
        boolean z3 = (i & 4) == 0;
        bq.a aVar2 = (bq.a) aVar;
        aVar2.h.set(z && z2);
        aVar2.i.set(z && z3);
        aVar2.g.f(Boolean.valueOf(z));
    }

    static Object b(a aVar, boolean z, c cVar) throws Throwable {
        Object objEmit = ((bq.a) aVar).b.emit(z ? new FullScreenLauncher(false) : null, cVar);
        return objEmit == l00.a.A ? objEmit : b0.a;
    }
}
