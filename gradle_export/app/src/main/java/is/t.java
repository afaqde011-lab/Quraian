package is;

import java.util.Iterator;

public final class t extends m00.c {
    public Iterator A;
    public int B;
    public Object C;
    public final y D;
    public int E;

    public t(y yVar, m00.c cVar) {
        super(cVar);
        this.D = yVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return y.b(this.D, this);
    }
}
