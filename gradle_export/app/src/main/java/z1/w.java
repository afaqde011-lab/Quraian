package z1;

public final class w extends b0 {

    public r1.c f17074c;

    public int f17075d;

    public int f17076e;

    public w(long j9, r1.c cVar) {
        super(j9);
        this.f17074c = cVar;
    }

    @Override
    public final void a(b0 b0Var) {
        synchronized (q.f17048a) {
            kotlin.jvm.internal.m.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.f17074c = ((w) b0Var).f17074c;
            this.f17075d = ((w) b0Var).f17075d;
            this.f17076e = ((w) b0Var).f17076e;
        }
    }

    @Override
    public final b0 b() {
        return c(l.j().g());
    }

    @Override
    public final b0 c(long j9) {
        return new w(j9, this.f17074c);
    }
}
