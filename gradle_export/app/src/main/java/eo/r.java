package eo;

import com.mchutov.quranify.audiostories.data.worker.AudioStoryProgressWorker;

public final class r extends m00.c {
    public Object A;
    public final AudioStoryProgressWorker B;
    public int C;

    public r(AudioStoryProgressWorker audioStoryProgressWorker, m00.c cVar) {
        super(cVar);
        this.B = audioStoryProgressWorker;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.e(this);
    }
}
