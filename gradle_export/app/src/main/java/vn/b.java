package vn;

public final class b extends m00.c {
    public String A;
    public un.j B;
    public String C;
    public Object D;
    public final f E;
    public int F;

    public b(f fVar, m00.c cVar) {
        super(cVar);
        this.E = fVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return f.b(this.E, null, this);
    }
}
