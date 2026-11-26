package i7;

import androidx.media3.exoplayer.ExoPlaybackException;

public final class h implements n0 {
    public final m1 A;
    public final i0 B;
    public a C;
    public n0 D;
    public boolean E = true;
    public boolean F;

    public h(i0 i0Var, e7.b0 b0Var) {
        this.B = i0Var;
        this.A = new m1(b0Var);
    }

    @Override
    public final long a() {
        if (this.E) {
            return this.A.a();
        }
        n0 n0Var = this.D;
        n0Var.getClass();
        return n0Var.a();
    }

    @Override
    public final boolean b() {
        if (this.E) {
            this.A.getClass();
            return false;
        }
        n0 n0Var = this.D;
        n0Var.getClass();
        return n0Var.b();
    }

    public final void c(a aVar) {
        n0 n0Var;
        n0 n0VarH = aVar.h();
        if (n0VarH == null || n0VarH == (n0Var = this.D)) {
            return;
        }
        if (n0Var != null) {
            throw new ExoPlaybackException(2, 1000, new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.D = n0VarH;
        this.C = aVar;
        ((k7.e0) n0VarH).setPlaybackParameters((androidx.media3.common.z0) this.A.E);
    }

    @Override
    public final androidx.media3.common.z0 getPlaybackParameters() {
        n0 n0Var = this.D;
        return n0Var != null ? n0Var.getPlaybackParameters() : (androidx.media3.common.z0) this.A.E;
    }

    @Override
    public final void setPlaybackParameters(androidx.media3.common.z0 z0Var) {
        n0 n0Var = this.D;
        if (n0Var != null) {
            n0Var.setPlaybackParameters(z0Var);
            z0Var = this.D.getPlaybackParameters();
        }
        this.A.setPlaybackParameters(z0Var);
    }
}
