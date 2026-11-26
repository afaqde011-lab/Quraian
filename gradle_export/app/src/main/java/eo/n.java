package eo;

import com.mchutov.quranify.audiostories.data.worker.AudioStoryDownloadWorker;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.InputStream;

public final class n extends m00.c {
    public InputStream A;
    public u00.n B;
    public Closeable C;
    public FileOutputStream D;
    public byte[] E;
    public long F;
    public long G;
    public int H;
    public Object I;
    public final AudioStoryDownloadWorker J;
    public int K;

    public n(AudioStoryDownloadWorker audioStoryDownloadWorker, m00.c cVar) {
        super(cVar);
        this.J = audioStoryDownloadWorker;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.w(null, null, 0L, null, this);
    }
}
