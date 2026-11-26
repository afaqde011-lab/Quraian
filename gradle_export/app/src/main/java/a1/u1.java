package a1;

import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La1/u1;", "Lb3/e1;", "La1/j2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u1 extends b3.e1 {
    public final w2 B;
    public final s2 C;
    public final b1.e0 D;
    public final h1.l E;
    public final boolean F;
    public final q0.i1 G;
    public final qp.b H;
    public final boolean I;
    public final f0.i J;
    public final boolean K;
    public final d40.w0 L;

    public u1(w2 w2Var, s2 s2Var, b1.e0 e0Var, h1.l lVar, boolean z10, q0.i1 i1Var, qp.b bVar, boolean z11, f0.i iVar, boolean z12, d40.w0 w0Var) {
        this.B = w2Var;
        this.C = s2Var;
        this.D = e0Var;
        this.E = lVar;
        this.F = z10;
        this.G = i1Var;
        this.H = bVar;
        this.I = z11;
        this.J = iVar;
        this.K = z12;
        this.L = w0Var;
    }

    @Override
    public final b2.q d() {
        return new j2(this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return kotlin.jvm.internal.m.a(this.B, u1Var.B) && kotlin.jvm.internal.m.a(this.C, u1Var.C) && kotlin.jvm.internal.m.a(this.D, u1Var.D) && kotlin.jvm.internal.m.a(this.E, u1Var.E) && this.F == u1Var.F && this.G.equals(u1Var.G) && kotlin.jvm.internal.m.a(this.H, u1Var.H) && this.I == u1Var.I && kotlin.jvm.internal.m.a(this.J, u1Var.J) && this.K == u1Var.K && kotlin.jvm.internal.m.a(this.L, u1Var.L);
    }

    @Override
    public final void h(c3.d2 d2Var) {
    }

    public final int hashCode() {
        int iHashCode = (this.D.hashCode() + ((this.C.hashCode() + (this.B.hashCode() * 31)) * 31)) * 31;
        h1.l lVar = this.E;
        int iHashCode2 = (this.G.hashCode() + w.c.e(w.c.e((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.F), 31, false)) * 31;
        qp.b bVar = this.H;
        int iE = w.c.e((this.J.hashCode() + w.c.e((iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.I)) * 31, 31, this.K);
        d40.w0 w0Var = this.L;
        return iE + (w0Var != null ? w0Var.hashCode() : 0);
    }

    @Override
    public final void i(b2.q qVar) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        a40.u1 u1Var;
        j2 j2Var = (j2) qVar;
        v2.j0 j0Var = j2Var.f61c0;
        z.g0 g0Var = j2Var.f60b0;
        boolean z10 = j2Var.U;
        w2 w2Var = j2Var.Q;
        q0.i1 i1Var = j2Var.V;
        b1.e0 e0Var = j2Var.S;
        f0.i iVar = j2Var.Y;
        boolean z11 = j2Var.Z;
        d40.w0 w0Var = j2Var.f59a0;
        w2 w2Var2 = this.B;
        j2Var.Q = w2Var2;
        j2Var.R = this.C;
        b1.e0 e0Var2 = this.D;
        j2Var.S = e0Var2;
        j2Var.T = this.E;
        boolean z12 = this.F;
        j2Var.U = z12;
        q0.i1 i1Var2 = this.G;
        j2Var.V = i1Var2;
        j2Var.W = this.H;
        j2Var.X = this.I;
        f0.i iVar2 = this.J;
        j2Var.Y = iVar2;
        boolean z13 = this.K;
        j2Var.Z = z13;
        d40.w0 w0Var2 = this.L;
        j2Var.f59a0 = w0Var2;
        if (z12 != z10 || !kotlin.jvm.internal.m.a(w2Var2, w2Var) || !i1Var2.equals(i1Var) || !kotlin.jvm.internal.m.a(w0Var2, w0Var)) {
            if (z12 && (j2Var.H1() || j2Var.f69k0 != null)) {
                j2Var.K1(false);
            } else if (!z12) {
                j2Var.F1();
            }
        }
        if (z12 != z10 || z12 != z10 || i1Var2.a() != i1Var.a() || z13 != z11) {
            b3.m.o(j2Var);
        }
        if (!kotlin.jvm.internal.m.a(e0Var2, e0Var)) {
            j0Var.D1();
            if (j2Var.N) {
                e0Var2.f1951n = j2Var.f70l0;
                if (j2Var.H1() && (u1Var = j2Var.f65g0) != null) {
                    u1Var.i((CancellationException) null);
                    j2Var.f65g0 = a40.c0.y(j2Var.p1(), (k00.i) null, (a40.a0) null, new i2(e0Var2, null, 0), 3);
                }
            }
            e0Var2.m = new w1(j2Var, 5);
        }
        if (!kotlin.jvm.internal.m.a(iVar2, iVar)) {
            j0Var.D1();
            if (g0Var.N) {
                g0Var.F1(iVar2);
            }
        }
        if (z12 != z10) {
            if (!z12) {
                j2Var.C1(g0Var);
            } else {
                j2Var.B1(g0Var);
                g0Var.F1(iVar2);
            }
        }
    }

    public final String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.B + ", textLayoutState=" + this.C + ", textFieldSelectionState=" + this.D + ", filter=" + this.E + ", enabled=" + this.F + ", readOnly=false, keyboardOptions=" + this.G + ", keyboardActionHandler=" + this.H + ", singleLine=" + this.I + ", interactionSource=" + this.J + ", isPassword=" + this.K + ", stylusHandwritingTrigger=" + this.L + ')';
    }
}
