package vn;

import java.util.List;

public final class p extends m00.c {
    public List A;
    public Object B;
    public final s C;
    public int D;

    public p(s sVar, m00.c cVar) {
        super(cVar);
        this.C = sVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return s.a(this.C, this);
    }
}
