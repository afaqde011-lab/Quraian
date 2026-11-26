package hw;

import com.mchutov.quranify.playlist.presentation.navigation.PlaylistsRoute$PlaylistScreen;
import com.mchutov.quranify.playlist.presentation.screen.tab.PlaylistsEffect$OpenPlaylistScreen;
import com.mchutov.quranify.reciters.presentation.navigation.ReciterRoute$ReciterScreen;
import com.mchutov.quranify.reciters.presentation.screen.collection.main.ReciterCollectionEffect$OpenReciterScreen;
import g00.b0;
import gx.k;
import hx.m;
import hx.o;
import kotlin.NoWhenBranchMatchedException;
import ri.t1;
import u00.n;

public final class e extends m00.i implements n {
    public final int A;
    public Object B;
    public final cq.a C;

    public e(cq.a aVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = aVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                e eVar = new e(this.C, cVar, 0);
                eVar.B = obj;
                return eVar;
            default:
                e eVar2 = new e(this.C, cVar, 1);
                eVar2.B = obj;
                return eVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                e eVar = (e) create((PlaylistsEffect$OpenPlaylistScreen) obj, (k00.c) obj2);
                b0 b0Var = b0.a;
                eVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                e eVar2 = (e) create((o) obj, (k00.c) obj2);
                b0 b0Var2 = b0.a;
                eVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        cq.a aVar = this.C;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                PlaylistsEffect$OpenPlaylistScreen playlistsEffect$OpenPlaylistScreen = (PlaylistsEffect$OpenPlaylistScreen) obj2;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                if (!(playlistsEffect$OpenPlaylistScreen instanceof PlaylistsEffect$OpenPlaylistScreen)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.d(new PlaylistsRoute$PlaylistScreen(playlistsEffect$OpenPlaylistScreen.getLauncher()));
                return b0Var;
            default:
                o oVar = (o) obj2;
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                if (oVar instanceof m) {
                    aVar.d(new k(((m) oVar).a));
                } else if (oVar instanceof hx.n) {
                    aVar.d(new gx.n(((hx.n) oVar).a));
                } else {
                    if (!(oVar instanceof ReciterCollectionEffect$OpenReciterScreen)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.d(new ReciterRoute$ReciterScreen(((ReciterCollectionEffect$OpenReciterScreen) oVar).getLauncher()));
                }
                return b0Var;
        }
    }
}
