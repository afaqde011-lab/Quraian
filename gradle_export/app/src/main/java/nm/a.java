package nm;

import jo.f;
import m00.c;

public final class a extends c {
    public Object A;
    public int B;
    public final f C;

    public a(f fVar, k00.c cVar) {
        super(cVar);
        this.C = fVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.B |= Integer.MIN_VALUE;
        return this.C.emit(null, this);
    }
}
