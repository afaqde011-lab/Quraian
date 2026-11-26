package ps;

import com.mchutov.quranify.insights.data.worker.ListeningEventsWorker;
import m00.c;

public final class a extends c {
    public Object A;
    public final ListeningEventsWorker B;
    public int C;

    public a(ListeningEventsWorker listeningEventsWorker, c cVar) {
        super(cVar);
        this.B = listeningEventsWorker;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.e(this);
    }
}
