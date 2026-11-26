package fw;

import com.mchutov.quranify.home.presentation.navigation.HomeRoute$AudioStoryScreen;
import com.mchutov.quranify.home.presentation.screen.playlist.PlaylistLauncher;
import com.mchutov.quranify.playlist.presentation.navigation.PlaylistsRoute$PlaylistScreen;
import com.mchutov.quranify.reciters.presentation.navigation.ReciterRoute$ReciterScreen;
import com.mchutov.quranify.reciters.presentation.screen.detail.main.ReciterLauncher;
import g00.b0;
import kotlin.jvm.internal.m;
import vl.i;
import vl.j;
import vl.k;

public final class a implements bm.a {
    public final int a;
    public final cq.a b;

    public a(cq.a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override
    public final Object a(k kVar, k00.c cVar) {
        HomeRoute$AudioStoryScreen homeRoute$AudioStoryScreen;
        switch (this.a) {
            case 0:
                vl.c cVar2 = kVar instanceof vl.c ? (vl.c) kVar : null;
                if (cVar2 != null) {
                    this.b.c(cq.e.b, new PlaylistsRoute$PlaylistScreen(new PlaylistLauncher(cVar2.a)));
                }
                break;
            case 1:
                vl.g gVar = kVar instanceof vl.g ? (vl.g) kVar : null;
                if (gVar != null) {
                    this.b.c(cq.f.b, new ReciterRoute$ReciterScreen(new ReciterLauncher(gVar.a, (Integer) null, 2, (kotlin.jvm.internal.f) null)));
                }
                break;
            case 2:
                i iVar = kVar instanceof i ? (i) kVar : null;
                if (iVar != null) {
                    this.b.c(cq.f.b, new ReciterRoute$ReciterScreen(new ReciterLauncher(iVar.a, new Integer(iVar.b))));
                }
                break;
            default:
                if (kVar instanceof j) {
                    homeRoute$AudioStoryScreen = new HomeRoute$AudioStoryScreen(((j) kVar).a, (Integer) null, 2, (kotlin.jvm.internal.f) null);
                } else if (kVar instanceof vl.d) {
                    vl.d dVar = (vl.d) kVar;
                    homeRoute$AudioStoryScreen = new HomeRoute$AudioStoryScreen(dVar.a, new Integer(dVar.b));
                }
                this.b.c(cq.c.b, homeRoute$AudioStoryScreen);
                break;
        }
        return b0.a;
    }

    @Override
    public final boolean b(k link) {
        switch (this.a) {
            case 0:
                m.e(link, "link");
                return link instanceof vl.c;
            case 1:
                m.e(link, "link");
                return link instanceof vl.g;
            case 2:
                m.e(link, "link");
                return link instanceof i;
            default:
                m.e(link, "link");
                return (link instanceof j) || (link instanceof vl.d);
        }
    }
}
