package l1;

public final class j2 extends z1.b0 {

    public Object f9878c;

    public j2(Object obj, long j9) {
        super(j9);
        this.f9878c = obj;
    }

    @Override
    public final void a(z1.b0 b0Var) {
        kotlin.jvm.internal.m.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f9878c = ((j2) b0Var).f9878c;
    }

    @Override
    public final z1.b0 b() {
        return new j2(this.f9878c, z1.l.j().g());
    }

    @Override
    public final z1.b0 c(long j9) {
        return new j2(this.f9878c, z1.l.j().g());
    }
}
