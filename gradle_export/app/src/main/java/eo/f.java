package eo;

import com.mchutov.quranify.audiostories.data.worker.AudioStoryDownloadWorker;
import kotlin.jvm.internal.z;

public final class f extends m00.c {
    public s A;
    public u00.n B;
    public z C;
    public z D;
    public int E;
    public int F;
    public int G;
    public int H;
    public Object I;
    public final AudioStoryDownloadWorker J;
    public int K;

    public f(AudioStoryDownloadWorker audioStoryDownloadWorker, m00.c cVar) {
        super(cVar);
        this.J = audioStoryDownloadWorker;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.l(null, null, this);
    }
}
