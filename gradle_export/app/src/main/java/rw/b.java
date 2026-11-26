package rw;

import com.mchutov.quranify.push.data.worker.PushTokenSyncWorker;
import m00.c;

public final class b extends c {
    public Object A;
    public final PushTokenSyncWorker B;
    public int C;

    public b(PushTokenSyncWorker pushTokenSyncWorker, c cVar) {
        super(cVar);
        this.B = pushTokenSyncWorker;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.e(this);
    }
}
