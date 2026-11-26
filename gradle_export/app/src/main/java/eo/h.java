package eo;

import com.mchutov.quranify.audiostories.data.worker.AudioStoryDownloadWorker;

public final class h extends m00.c {
    public int A;
    public Object B;
    public final AudioStoryDownloadWorker C;
    public int D;

    public h(AudioStoryDownloadWorker audioStoryDownloadWorker, m00.c cVar) {
        super(cVar);
        this.C = audioStoryDownloadWorker;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.r(0, this);
    }
}
