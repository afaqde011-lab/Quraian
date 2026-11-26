package eo;

import com.mchutov.quranify.audiostories.data.worker.AudioStoryDownloadWorker;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class c extends m00.c {
    public List A;
    public Map B;
    public Collection C;
    public Iterator D;
    public Object E;
    public s F;
    public int G;
    public int H;
    public long I;
    public Object J;
    public final AudioStoryDownloadWorker K;
    public int L;

    public c(AudioStoryDownloadWorker audioStoryDownloadWorker, m00.c cVar) {
        super(cVar);
        this.K = audioStoryDownloadWorker;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return AudioStoryDownloadWorker.i(this.K, this);
    }
}
