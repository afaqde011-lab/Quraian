package z1;

import androidx.compose.runtime.snapshots.SnapshotApplyConflictException;

public final class g extends q {

    public final b f17029d;

    public g(b bVar) {
        this.f17029d = bVar;
    }

    @Override
    public final void e() throws SnapshotApplyConflictException {
        this.f17029d.c();
        throw new SnapshotApplyConflictException();
    }
}
