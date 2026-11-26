package rn;

public final class b extends m00.c {
    public in.c A;
    public Object B;
    public final in.c C;
    public int D;

    public b(in.c cVar, m00.c cVar2) {
        super(cVar2);
        this.C = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        in.c.h(this.C, this);
        return l00.a.A;
    }
}
