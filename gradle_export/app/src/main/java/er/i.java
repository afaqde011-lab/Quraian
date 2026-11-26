package er;

import kotlin.jvm.internal.z;

public final class i extends m00.c {
    public z A;
    public int B;
    public int C;
    public int D;
    public int E;
    public Object F;
    public final j G;
    public int H;

    public i(j jVar, m00.c cVar) {
        super(cVar);
        this.G = jVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.f(this);
    }
}
