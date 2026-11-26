package eo;

import com.mchutov.quranify.audiostories.data.worker.AudioStoryDownloadWorker;

public final class g extends m00.c {
    public Object A;
    public final AudioStoryDownloadWorker B;
    public int C;

    public g(AudioStoryDownloadWorker audioStoryDownloadWorker, m00.c cVar) {
        super(cVar);
        this.B = audioStoryDownloadWorker;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.n(this);
    }
}
