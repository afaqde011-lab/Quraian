package l1;

public final class h2 extends z1.b0 {

    public int f9867c;

    public h2(long j9, int i10) {
        super(j9);
        this.f9867c = i10;
    }

    @Override
    public final void a(z1.b0 b0Var) {
        kotlin.jvm.internal.m.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f9867c = ((h2) b0Var).f9867c;
    }

    @Override
    public final z1.b0 b() {
        return c(z1.l.j().g());
    }

    @Override
    public final z1.b0 c(long j9) {
        return new h2(j9, this.f9867c);
    }
}
