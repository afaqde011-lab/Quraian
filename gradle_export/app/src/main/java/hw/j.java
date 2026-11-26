package hw;

import a1.r1;
import ab.a0;
import androidx.lifecycle.u0;
import com.mchutov.quranify.home.presentation.screen.playlist.PlaylistLauncher;
import com.mchutov.quranify.playlist.presentation.screen.tab.PlaylistsEffect$OpenPlaylistScreen;
import kotlin.NoWhenBranchMatchedException;
import ta.c0;
import tq.k;
import u00.n;

public final class j extends vm.a {
    public final xv.c d;
    public final k e;
    public final au.a f;
    public final pm.c g;

    public j(xv.c cVar, k kVar, au.a aVar, pm.c cVar2) {
        super(new f(v30.g.B, true, false, true, false));
        this.d = cVar;
        this.e = kVar;
        this.f = aVar;
        this.g = cVar2;
        k00.c cVar3 = null;
        c0.M(u0.i(this), (k00.i) null, (n) null, (u00.k) null, new g(this, cVar3, 3), 31);
        c0.M(u0.i(this), (k00.i) null, (n) null, (u00.k) null, new g(this, cVar3, 1), 31);
        c0.M(u0.i(this), (k00.i) null, (n) null, (u00.k) null, new g(this, cVar3, 2), 31);
        c0.M(u0.i(this), (k00.i) null, (n) null, (u00.k) null, new g(this, cVar3, 0), 31);
    }

    public final void j(c cVar) {
        if (cVar.equals(b.a)) {
            c0.M(u0.i(this), (k00.i) null, (n) null, new r1(this, (k00.c) null, 6), new g(this, null, 4), 23);
        } else {
            if (!(cVar instanceof a)) {
                throw new NoWhenBranchMatchedException();
            }
            a0.A0(this, new PlaylistsEffect$OpenPlaylistScreen(new PlaylistLauncher(((a) cVar).a)));
        }
    }
}
