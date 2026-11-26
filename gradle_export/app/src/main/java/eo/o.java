package eo;

import com.mchutov.quranify.audiostories.data.worker.AudioStoryEventsWorker;

public final class o extends m00.c {
    public Object A;
    public final AudioStoryEventsWorker B;
    public int C;

    public o(AudioStoryEventsWorker audioStoryEventsWorker, m00.c cVar) {
        super(cVar);
        this.B = audioStoryEventsWorker;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.e(this);
    }
}
