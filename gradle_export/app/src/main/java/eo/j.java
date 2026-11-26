package eo;

import com.mchutov.quranify.audiostories.data.worker.AudioStoryDownloadWorker;

public final class j extends m00.c {
    public float A;
    public int B;
    public long C;
    public Object D;
    public final AudioStoryDownloadWorker E;
    public int F;

    public j(AudioStoryDownloadWorker audioStoryDownloadWorker, m00.c cVar) {
        super(cVar);
        this.E = audioStoryDownloadWorker;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return AudioStoryDownloadWorker.j(this.E, 0.0f, this);
    }
}
