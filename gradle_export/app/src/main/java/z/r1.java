package z;

import b3.v1;
import d0.m2;
import d0.n2;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import q0.f2;

public final class r1 extends b3.l implements b3.j, v1 {
    public n2 Q;
    public d0.q1 R;
    public boolean S;
    public d0.t0 T;
    public f0.i U;
    public d0.c V;
    public boolean W;
    public h1 X;
    public m2 Y;
    public b3.k Z;

    public k f16961a0;

    public j f16962b0;

    public boolean f16963c0;

    public final void E1() {
        b3.k kVar = this.Z;
        if (kVar != null) {
            if (((b2.q) kVar).A.N) {
                return;
            }
            B1(kVar);
            return;
        }
        if (this.W) {
            b3.m.t(this, new f2(this, 23));
        }
        h1 h1Var = this.W ? this.f16962b0 : this.X;
        if (h1Var != null) {
            b3.k kVarC = h1Var.c();
            if (((b2.q) kVarC).A.N) {
                return;
            }
            B1(kVarC);
            this.Z = kVarC;
        }
    }

    public final boolean F1() {
        y3.m mVar = y3.m.A;
        if (this.N) {
            mVar = b3.m.y(this).f2053a0;
        }
        return mVar != y3.m.B || this.R == d0.q1.A;
    }

    public final void G1(d0.c cVar, d0.t0 t0Var, d0.q1 q1Var, n2 n2Var, f0.i iVar, h1 h1Var, boolean z10, boolean z11) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        boolean z12;
        this.Q = n2Var;
        this.R = q1Var;
        boolean z13 = true;
        if (this.W != z10) {
            this.W = z10;
            z12 = true;
        } else {
            z12 = false;
        }
        if (kotlin.jvm.internal.m.a(this.X, h1Var)) {
            z13 = false;
        } else {
            this.X = h1Var;
        }
        if (z12 || (z13 && !z10)) {
            b3.k kVar = this.Z;
            if (kVar != null) {
                C1(kVar);
            }
            this.Z = null;
            E1();
        }
        this.S = z11;
        this.T = t0Var;
        this.U = iVar;
        this.V = cVar;
        boolean zF1 = F1();
        this.f16963c0 = zF1;
        m2 m2Var = this.Y;
        if (m2Var != null) {
            m2Var.W1(cVar, t0Var, q1Var, n2Var, iVar, this.W ? this.f16962b0 : this.X, z11, zF1);
        }
    }

    @Override
    public final void J0() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        k kVar = (k) b3.m.h(this, i1.f16927a);
        if (kotlin.jvm.internal.m.a(kVar, this.f16961a0)) {
            return;
        }
        this.f16961a0 = kVar;
        this.f16962b0 = null;
        b3.k kVar2 = this.Z;
        if (kVar2 != null) {
            C1(kVar2);
        }
        this.Z = null;
        E1();
        m2 m2Var = this.Y;
        if (m2Var != null) {
            n2 n2Var = this.Q;
            d0.q1 q1Var = this.R;
            h1 h1Var = this.W ? this.f16962b0 : this.X;
            m2Var.W1(this.V, this.T, q1Var, n2Var, this.U, h1Var, this.S, this.f16963c0);
        }
    }

    @Override
    public final void j0() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        boolean zF1 = F1();
        if (this.f16963c0 != zF1) {
            this.f16963c0 = zF1;
            n2 n2Var = this.Q;
            d0.q1 q1Var = this.R;
            boolean z10 = this.W;
            h1 h1Var = z10 ? this.f16962b0 : this.X;
            G1(this.V, this.T, q1Var, n2Var, this.U, h1Var, z10, this.S);
        }
    }

    @Override
    public final boolean q1() {
        return false;
    }

    @Override
    public final void t1() {
        this.f16963c0 = F1();
        E1();
        if (this.Y == null) {
            n2 n2Var = this.Q;
            h1 h1Var = this.W ? this.f16962b0 : this.X;
            m2 m2Var = new m2(this.V, this.T, this.R, n2Var, this.U, h1Var, this.S, this.f16963c0);
            B1(m2Var);
            this.Y = m2Var;
        }
    }

    @Override
    public final void u1() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        b3.k kVar = this.Z;
        if (kVar != null) {
            C1(kVar);
        }
    }
}
