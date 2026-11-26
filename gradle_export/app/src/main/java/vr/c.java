package vr;

import bt.y1;
import com.mchutov.core.deeplink.presentation.analytics.DeepLinkAnalytics;
import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryAnalytics;
import com.mchutov.quranify.audiostories.presentation.player.AudioStoryPlayerLauncher;
import d40.p1;
import d40.t0;
import d40.z0;
import dq.k;
import g00.b0;
import java.util.List;
import jo.d;
import jo.i;
import jo.o;
import ko.e;
import no.n;
import ri.t1;
import vn.u;
import vp.x;

public final class c {
    public final o a;
    public final AudioStoryPlayerLauncher b;
    public final u c;
    public final x d;
    public final io.a e;
    public final AudioStoryAnalytics f;
    public final oq.b g;
    public final DeepLinkAnalytics h;
    public final p1 i;
    public volatile List j;
    public volatile List k;
    public volatile List l;
    public final t0 m;

    public c(d dVar, o oVar, go.a aVar, AudioStoryPlayerLauncher audioStoryPlayerLauncher, u uVar, x xVar, io.a aVar2, i iVar, e eVar, AudioStoryAnalytics audioStoryAnalytics, oq.b bVar, DeepLinkAnalytics deepLinkAnalytics) {
        this.a = oVar;
        this.b = audioStoryPlayerLauncher;
        this.c = uVar;
        this.d = xVar;
        this.e = aVar2;
        this.f = audioStoryAnalytics;
        this.g = bVar;
        this.h = deepLinkAnalytics;
        p1 p1VarC = d40.o.c(Boolean.TRUE);
        this.i = p1VarC;
        h00.x xVar2 = h00.x.A;
        this.j = xVar2;
        this.k = xVar2;
        this.l = xVar2;
        vn.o oVar2 = (vn.o) aVar2;
        this.m = d40.o.j(d40.o.n(dVar.a(), new sw.a(12)), d40.o.o(new k(new z0(((n) aVar).r), 5)), p1VarC, iVar.a(), new y1(oVar2.d.A("audio_story_download"), oVar2, 23), new as.z0(this, null, 4));
    }

    public final Object a(boolean z, m00.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i = aVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.C = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object obj = aVar.A;
        l00.a aVar2 = l00.a.A;
        int i2 = aVar.C;
        p1 p1Var = this.i;
        try {
            if (i2 == 0) {
                t1.O(obj);
                o oVar = this.a;
                aVar.C = 1;
                if (oVar.a(z, aVar) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
                ((g00.n) obj).getClass();
            }
            Boolean bool = Boolean.FALSE;
            p1Var.getClass();
            p1Var.k(null, bool);
            return b0.a;
        } catch (Throwable th) {
            Boolean bool2 = Boolean.FALSE;
            p1Var.getClass();
            p1Var.k(null, bool2);
            throw th;
        }
    }
}
