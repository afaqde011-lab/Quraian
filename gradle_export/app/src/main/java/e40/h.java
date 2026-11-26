package e40;

import ca.e0;

public final class h extends m00.c {
    public e0 A;
    public Object B;
    public Object C;
    public final e0 D;
    public int E;

    public h(e0 e0Var, k00.c cVar) {
        super(cVar);
        this.D = e0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.emit((Object) null, this);
    }
}
