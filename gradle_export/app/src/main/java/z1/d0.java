package z1;

public final class d0 extends b0 {

    public q1.e f17015c;

    public int f17016d;

    public d0(long j9, q1.e eVar) {
        super(j9);
        this.f17015c = eVar;
    }

    @Override
    public final void a(b0 b0Var) {
        synchronized (q.f17050c) {
            kotlin.jvm.internal.m.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.StateSetStateRecord>");
            this.f17015c = ((d0) b0Var).f17015c;
            this.f17016d = ((d0) b0Var).f17016d;
        }
    }

    @Override
    public final b0 b() {
        return new d0(l.j().g(), this.f17015c);
    }

    @Override
    public final b0 c(long j9) {
        return new d0(j9, this.f17015c);
    }
}
