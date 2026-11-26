package ov;

import java.util.ArrayList;

public final class e extends m00.c {
    public String A;
    public Integer B;
    public String C;
    public ArrayList D;
    public Object E;
    public final g F;
    public int G;

    public e(g gVar, m00.c cVar) {
        super(cVar);
        this.F = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.h(null, null, this);
    }
}
