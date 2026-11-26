package x;

import l1.p2;

public final class j implements p2 {
    public final r1 A;
    public final l1.i1 B;
    public o C;
    public long D;
    public long E;
    public boolean F;

    public j(r1 r1Var, Object obj, o oVar, int i10) {
        this(r1Var, obj, (i10 & 4) != 0 ? null : oVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public j(r1 r1Var, Object obj, o oVar, long j9, long j10, boolean z10) {
        o oVarK;
        this.A = r1Var;
        this.B = l1.q.z(obj);
        if (oVar != null) {
            oVarK = c.k(oVar);
        } else {
            oVarK = (o) r1Var.f16363a.invoke(obj);
            oVarK.d();
        }
        this.C = oVarK;
        this.D = j9;
        this.E = j10;
        this.F = z10;
    }

    public final Object a() {
        return this.A.f16364b.invoke(this.C);
    }

    @Override
    public final Object getValue() {
        return this.B.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.B.getValue() + ", velocity=" + a() + ", isRunning=" + this.F + ", lastFrameTimeNanos=" + this.D + ", finishedTimeNanos=" + this.E + ')';
    }
}
