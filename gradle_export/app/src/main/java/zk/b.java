package zk;

public final class b extends m00.c {
    public Object A;
    public int B;

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.B |= Integer.MIN_VALUE;
        return f.a(null, null, this);
    }
}
