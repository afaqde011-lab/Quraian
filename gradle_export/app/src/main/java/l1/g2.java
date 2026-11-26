package l1;

public final class g2 extends z1.b0 {

    public float f9866c;

    public g2(float f3, long j9) {
        super(j9);
        this.f9866c = f3;
    }

    @Override
    public final void a(z1.b0 b0Var) {
        kotlin.jvm.internal.m.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f9866c = ((g2) b0Var).f9866c;
    }

    @Override
    public final z1.b0 b() {
        return c(z1.l.j().g());
    }

    @Override
    public final z1.b0 c(long j9) {
        return new g2(this.f9866c, j9);
    }
}
