package wt;

import com.google.android.gms.internal.measurement.x5;
import com.mchutov.quranify.main.data.source.remote.DownloadWorker;
import com.mchutov.quranify.main.presentation.analytics.DownloadAnalytics;
import kotlin.jvm.internal.a0;

public final class d implements u00.a {
    public final int A;
    public final DownloadWorker B;

    public d(DownloadWorker downloadWorker, int i) {
        this.A = i;
        this.B = downloadWorker;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                return x5.i(a0.a, zt.a.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
            default:
                return x5.i(a0.a, DownloadAnalytics.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
        }
    }
}
