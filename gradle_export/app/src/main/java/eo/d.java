package eo;

import com.mchutov.quranify.audiostories.data.worker.AudioStoryDownloadWorker;
import g00.b0;
import java.util.List;
import ri.t1;

public final class d extends m00.i implements u00.n {
    public int A;
    public float B;
    public final AudioStoryDownloadWorker C;
    public final int D;
    public final List E;

    public d(AudioStoryDownloadWorker audioStoryDownloadWorker, int i, List list, k00.c cVar) {
        super(2, cVar);
        this.C = audioStoryDownloadWorker;
        this.D = i;
        this.E = list;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        d dVar = new d(this.C, this.D, this.E, cVar);
        dVar.B = ((Number) obj).floatValue();
        return dVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create(Float.valueOf(((Number) obj).floatValue()), (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        float f = this.B;
        l00.a aVar = l00.a.A;
        int i = this.A;
        if (i == 0) {
            t1.O(obj);
            float size = (this.D + f) / this.E.size();
            this.B = f;
            this.A = 1;
            if (AudioStoryDownloadWorker.j(this.C, size, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        return b0.a;
    }
}
