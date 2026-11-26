package eo;

import com.mchutov.quranify.audiostories.data.worker.AudioStoryDownloadWorker;
import java.io.File;
import java.io.InputStream;
import x40.b0;

public final class m extends m00.c {
    public String A;
    public File B;
    public Long C;
    public String D;
    public u00.n E;
    public File F;
    public b0 G;
    public InputStream H;
    public boolean I;
    public long J;
    public Object K;
    public final AudioStoryDownloadWorker L;
    public int M;

    public m(AudioStoryDownloadWorker audioStoryDownloadWorker, m00.c cVar) {
        super(cVar);
        this.L = audioStoryDownloadWorker;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.K = obj;
        this.M |= Integer.MIN_VALUE;
        return this.L.v(null, null, null, null, false, null, this);
    }
}
