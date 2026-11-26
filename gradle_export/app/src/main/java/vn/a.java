package vn;

import java.util.Collection;
import java.util.Iterator;

public final class a extends m00.c {
    public String A;
    public Collection B;
    public Iterator C;
    public String D;
    public long E;
    public long F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public Object L;
    public final f M;
    public int N;

    public a(f fVar, m00.c cVar) {
        super(cVar);
        this.M = fVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        return f.a(this.M, null, null, 0L, this);
    }
}
