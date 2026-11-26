package m6;

import android.content.Context;

public final class b extends m00.c {
    public Context A;
    public h B;
    public String C;
    public j40.c D;
    public Object E;
    public final f F;
    public int G;

    public b(f fVar, m00.c cVar) {
        super(cVar);
        this.F = fVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(null, null, null, this);
    }
}
