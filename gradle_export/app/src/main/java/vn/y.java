package vn;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l60.o0;

public final class y extends m00.c {
    public List A;
    public List B;
    public o0 C;
    public Map D;
    public Iterator E;
    public int F;
    public Object G;
    public final b0 H;
    public int I;

    public y(b0 b0Var, m00.c cVar) {
        super(cVar);
        this.H = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return b0.c(this.H, null, null, this);
    }
}
