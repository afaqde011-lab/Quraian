package d40;

public final class q0 extends m00.c {
    public Object A;
    public int B;
    public final z C;
    public z D;
    public j E;
    public kotlin.jvm.internal.z F;

    public q0(z zVar, k00.c cVar) {
        super(cVar);
        this.C = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.B |= Integer.MIN_VALUE;
        return this.C.collect(null, this);
    }
}
