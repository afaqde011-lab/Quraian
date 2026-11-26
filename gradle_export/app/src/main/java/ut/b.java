package ut;

import java.util.ArrayList;

public final class b extends m00.c {
    public int A;
    public ArrayList B;
    public Object C;
    public final p D;
    public int E;

    public b(p pVar, m00.c cVar) {
        super(cVar);
        this.D = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.d(0, this);
    }
}
