package vn;

import java.util.List;

public final class n extends m00.c {
    public List A;
    public Object B;
    public final o C;
    public int D;

    public n(o oVar, m00.c cVar) {
        super(cVar);
        this.C = oVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.h(null, this);
    }
}
