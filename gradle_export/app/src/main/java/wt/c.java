package wt;

import com.mchutov.quranify.main.data.source.remote.DownloadWorker;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.jvm.internal.x;

public final class c extends m00.c {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public long F;
    public long G;
    public long H;
    public Integer I;
    public String J;
    public File K;
    public File L;
    public Closeable M;
    public Closeable N;
    public InputStream O;
    public Closeable P;
    public FileOutputStream Q;
    public byte[] R;
    public x S;
    public float T;
    public float U;
    public Object V;
    public final DownloadWorker W;
    public int X;

    public c(DownloadWorker downloadWorker, m00.c cVar) {
        super(cVar);
        this.W = downloadWorker;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.V = obj;
        this.X |= Integer.MIN_VALUE;
        return DownloadWorker.i(this.W, 0, 0L, 0, null, null, this);
    }
}
