package wt;

import com.mchutov.quranify.main.data.source.remote.DownloadWorker;
import za.g;

public final class a extends m00.c {
    public long A;
    public int B;
    public int C;
    public Integer D;
    public String E;
    public g F;
    public Object G;
    public final DownloadWorker H;
    public int I;

    public a(DownloadWorker downloadWorker, m00.c cVar) {
        super(cVar);
        this.H = downloadWorker;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.e(this);
    }
}
