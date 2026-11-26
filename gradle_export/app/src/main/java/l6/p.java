package l6;

import androidx.glance.session.SessionWorker;

public final class p extends m00.c {
    public int A;
    public Object B;
    public Object C;
    public final SessionWorker D;
    public int E;

    public p(SessionWorker sessionWorker, m00.c cVar) {
        super(cVar);
        this.D = sessionWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.e(this);
    }
}
