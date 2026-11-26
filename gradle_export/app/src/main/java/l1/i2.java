package l1;

public final class i2 extends z1.b0 {

    public long f9875c;

    public i2(long j9, long j10) {
        super(j9);
        this.f9875c = j10;
    }

    @Override
    public final void a(z1.b0 b0Var) {
        kotlin.jvm.internal.m.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f9875c = ((i2) b0Var).f9875c;
    }

    @Override
    public final z1.b0 b() {
        return c(z1.l.j().g());
    }

    @Override
    public final z1.b0 c(long j9) {
        return new i2(j9, this.f9875c);
    }
}
