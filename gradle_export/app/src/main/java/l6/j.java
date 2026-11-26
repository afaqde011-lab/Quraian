package l6;

public final class j extends m00.c {
    public String A;
    public Object B;
    public final m C;
    public int D;

    public j(m mVar, m00.c cVar) {
        super(cVar);
        this.C = mVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.a(null, null, this);
    }
}
