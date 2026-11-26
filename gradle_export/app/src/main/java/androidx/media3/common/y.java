package androidx.media3.common;

public final class y implements d1 {
    public final z A;

    public y(z zVar) {
        this.A = zVar;
    }

    @Override
    public final void H(v0 v0Var) {
        this.A.lastTimedMetadata = v0Var;
    }

    @Override
    public final void I() {
        this.A.pendingFirstFrameRendered = true;
    }

    @Override
    public final void U(e1 e1Var, e1 e1Var2, int i10) {
        z zVar = this.A;
        zVar.pendingDiscontinuityReason = i10;
        zVar.pendingPositionDiscontinuityNewPositionMs = e1Var2.f1187f;
        x xVar = zVar.livePositionSuppliers;
        long j9 = e1Var.f1187f;
        long j10 = e1Var.f1188g;
        xVar.f1676a.B = j9;
        xVar.f1677b.B = j9;
        xVar.f1678c.B = j10;
        xVar.f1679d.B = j10;
        xVar.f1680e.B = 0L;
        zVar.livePositionSuppliers = new x(zVar.player);
    }

    @Override
    public final void l(f1 f1Var, c1 c1Var) {
        this.A.invalidateState();
    }

    @Override
    public final void m(int i10, boolean z10) {
        this.A.playWhenReadyChangeReason = i10;
    }
}
