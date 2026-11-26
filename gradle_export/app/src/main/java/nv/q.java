package nv;

import com.google.android.gms.internal.measurement.x5;
import com.mchutov.quranify.player.presentation.analytics.AndroidAutoAnalytics;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import kotlin.jvm.internal.a0;
import vp.x;

public final class q implements u00.a {
    public final int A;
    public final AudioPlayerService B;

    public q(AudioPlayerService audioPlayerService, int i) {
        this.A = i;
        this.B = audioPlayerService;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                return x5.i(a0.a, b00.c.class, w50.c.M(this.B), (b60.a) null, (a60.a) null);
            case 1:
                return x5.i(a0.a, uu.a.class, w50.c.M(this.B), (b60.a) null, (a60.a) null);
            case 2:
                return x5.i(a0.a, AndroidAutoAnalytics.class, w50.c.M(this.B), (b60.a) null, (a60.a) null);
            case 3:
                return x5.i(a0.a, nn.k.class, w50.c.M(this.B), (b60.a) null, (a60.a) null);
            case 4:
                return x5.i(a0.a, sn.c.class, w50.c.M(this.B), (b60.a) null, (a60.a) null);
            case 5:
                return x5.i(a0.a, zu.a.class, w50.c.M(this.B), (b60.a) null, (a60.a) null);
            case 6:
                return x5.i(a0.a, no.e.class, w50.c.M(this.B), (b60.a) null, (a60.a) null);
            case 7:
                return x5.i(a0.a, go.a.class, w50.c.M(this.B), (b60.a) null, (a60.a) null);
            case 8:
                return x5.i(a0.a, jo.d.class, w50.c.M(this.B), (b60.a) null, (a60.a) null);
            case 9:
                return x5.i(a0.a, xu.f.class, w50.c.M(this.B), (b60.a) null, (a60.a) null);
            case 10:
                return x5.i(a0.a, ns.j.class, w50.c.M(this.B), (b60.a) null, (a60.a) null);
            case 11:
                return x5.i(a0.a, br.i.class, w50.c.M(this.B), (b60.a) null, (a60.a) null);
            case 12:
                return x5.i(a0.a, x.class, w50.c.M(this.B), (b60.a) null, (a60.a) null);
            case 13:
                return x5.i(a0.a, gq.a.class, w50.c.M(this.B), (b60.a) null, (a60.a) null);
            case 14:
                return x5.i(a0.a, ov.g.class, w50.c.M(this.B), (b60.a) null, (a60.a) null);
            case 15:
                return x5.i(a0.a, tq.k.class, w50.c.M(this.B), (b60.a) null, (a60.a) null);
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                return x5.i(a0.a, xw.k.class, w50.c.M(this.B), (b60.a) null, (a60.a) null);
            case 17:
                return x5.i(a0.a, zt.a.class, w50.c.M(this.B), (b60.a) null, (a60.a) null);
            default:
                return x5.i(a0.a, xv.c.class, w50.c.M(this.B), (b60.a) null, (a60.a) null);
        }
    }
}
