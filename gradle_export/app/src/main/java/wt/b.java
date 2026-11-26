package wt;

import a40.z;
import com.mchutov.quranify.main.data.source.remote.DownloadWorker;
import g00.b0;
import m00.i;
import ri.t1;
import u00.n;

public final class b extends i implements n {
    public int A;
    public final DownloadWorker B;
    public final int C;
    public final long D;
    public final int E;
    public final Integer F;
    public final String G;

    public b(DownloadWorker downloadWorker, int i, long j, int i2, Integer num, String str, k00.c cVar) {
        super(2, cVar);
        this.B = downloadWorker;
        this.C = i;
        this.D = j;
        this.E = i2;
        this.F = num;
        this.G = str;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new b(this.B, this.C, this.D, this.E, this.F, this.G, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        int i = this.A;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            return obj;
        }
        t1.O(obj);
        this.A = 1;
        Object objI = DownloadWorker.i(this.B, this.C, this.D, this.E, this.F, this.G, this);
        return objI == aVar ? aVar : objI;
    }
}
