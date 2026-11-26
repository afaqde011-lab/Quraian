package eo;

import com.google.android.gms.internal.measurement.x5;
import com.mchutov.quranify.audiostories.data.worker.AudioStoryDownloadWorker;
import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryAnalytics;
import kotlin.jvm.internal.a0;

public final class l implements u00.a {
    public final int A;
    public final AudioStoryDownloadWorker B;

    public l(AudioStoryDownloadWorker audioStoryDownloadWorker, int i) {
        this.A = i;
        this.B = audioStoryDownloadWorker;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                return x5.i(a0.a, co.a.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
            case 1:
                return x5.i(a0.a, xn.b.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
            case 2:
                return x5.i(a0.a, ao.a.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
            case 3:
                return x5.i(a0.a, jo.o.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
            case 4:
                return x5.i(a0.a, AudioStoryAnalytics.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
            default:
                return x5.i(a0.a, jo.d.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
        }
    }
}
