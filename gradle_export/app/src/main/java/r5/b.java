package r5;

public final class b extends m00.c {
    public c A;
    public Object B;
    public final c C;
    public int D;

    public b(c cVar, k00.c cVar2) {
        super(cVar2);
        this.C = cVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.shouldMigrate(null, this);
    }
}
