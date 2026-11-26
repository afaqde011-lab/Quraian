package yv;

public final class a extends m00.c {
    public vv.b A;
    public Object B;
    public final c C;
    public int D;

    public a(c cVar, m00.c cVar2) {
        super(cVar2);
        this.C = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(this);
    }
}
