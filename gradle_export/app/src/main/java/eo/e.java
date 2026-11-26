package eo;

import com.mchutov.quranify.audiostories.data.worker.AudioStoryDownloadWorker;
import java.io.File;

public final class e extends m00.c {
    public s A;
    public un.c B;
    public String C;
    public File D;
    public File E;
    public Object F;
    public final AudioStoryDownloadWorker G;
    public int H;

    public e(AudioStoryDownloadWorker audioStoryDownloadWorker, m00.c cVar) {
        super(cVar);
        this.G = audioStoryDownloadWorker;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.k(null, null, this);
    }
}
