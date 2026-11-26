package z1;

public final class r extends b0 {

    public q1.d f17051c;

    public int f17052d;

    public r(long j9, q1.d dVar) {
        super(j9);
        this.f17051c = dVar;
    }

    @Override
    public final void a(b0 b0Var) {
        kotlin.jvm.internal.m.c(b0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        r rVar = (r) b0Var;
        synchronized (q.f17049b) {
            this.f17051c = rVar.f17051c;
            this.f17052d = rVar.f17052d;
        }
    }

    @Override
    public final b0 b() {
        return new r(l.j().g(), this.f17051c);
    }

    @Override
    public final b0 c(long j9) {
        return new r(j9, this.f17051c);
    }
}
