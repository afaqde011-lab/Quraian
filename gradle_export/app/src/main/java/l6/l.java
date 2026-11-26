package l6;

import android.content.Context;

public final class l extends m00.c {
    public Context A;
    public Object B;
    public final m C;
    public int D;

    public l(m mVar, m00.c cVar) {
        super(cVar);
        this.C = mVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.c(null, null, this);
    }
}
