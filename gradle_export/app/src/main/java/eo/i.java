package eo;

import com.mchutov.quranify.audiostories.data.worker.AudioStoryDownloadWorker;

public final class i extends m00.c {
    public s A;
    public Object B;
    public final AudioStoryDownloadWorker C;
    public int D;

    public i(AudioStoryDownloadWorker audioStoryDownloadWorker, m00.c cVar) {
        super(cVar);
        this.C = audioStoryDownloadWorker;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.s(null, this);
    }
}
