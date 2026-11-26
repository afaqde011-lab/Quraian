package a1;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La1/l1;", "Lb3/e1;", "La1/t1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l1 extends b3.e1 {
    public final boolean B;
    public final boolean C;
    public final s2 D;
    public final w2 E;
    public final b1.e0 F;
    public final i2.q G;
    public final boolean H;
    public final z.p1 I;
    public final d0.q1 J;
    public final w0.l K;
    public final e1.q L;

    public l1(boolean z10, boolean z11, s2 s2Var, w2 w2Var, b1.e0 e0Var, i2.q qVar, boolean z12, z.p1 p1Var, d0.q1 q1Var, w0.l lVar, e1.q qVar2) {
        this.B = z10;
        this.C = z11;
        this.D = s2Var;
        this.E = w2Var;
        this.F = e0Var;
        this.G = qVar;
        this.H = z12;
        this.I = p1Var;
        this.J = q1Var;
        this.K = lVar;
        this.L = qVar2;
    }

    @Override
    public final b2.q d() {
        return new t1(this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.B == l1Var.B && this.C == l1Var.C && kotlin.jvm.internal.m.a(this.D, l1Var.D) && kotlin.jvm.internal.m.a(this.E, l1Var.E) && kotlin.jvm.internal.m.a(this.F, l1Var.F) && kotlin.jvm.internal.m.a(this.G, l1Var.G) && this.H == l1Var.H && kotlin.jvm.internal.m.a(this.I, l1Var.I) && this.J == l1Var.J && kotlin.jvm.internal.m.a(this.K, l1Var.K) && kotlin.jvm.internal.m.a(this.L, l1Var.L);
    }

    @Override
    public final void h(c3.d2 d2Var) {
    }

    public final int hashCode() {
        int iHashCode = (this.K.hashCode() + ((this.J.hashCode() + ((this.I.hashCode() + w.c.e((this.G.hashCode() + ((this.F.hashCode() + ((this.E.hashCode() + ((this.D.hashCode() + w.c.e(Boolean.hashCode(this.B) * 31, 31, this.C)) * 31)) * 31)) * 31)) * 31, 31, this.H)) * 31)) * 31)) * 31;
        e1.q qVar = this.L;
        return iHashCode + (qVar == null ? 0 : qVar.hashCode());
    }

    @Override
    public final void i(b2.q qVar) {
        a40.e1 e1Var;
        t1 t1Var = (t1) qVar;
        boolean zE1 = t1Var.E1();
        boolean z10 = t1Var.Q;
        w2 w2Var = t1Var.T;
        s2 s2Var = t1Var.S;
        b1.e0 e0Var = t1Var.U;
        z.p1 p1Var = t1Var.X;
        boolean z11 = this.B;
        t1Var.Q = z11;
        boolean z12 = this.C;
        t1Var.R = z12;
        s2 s2Var2 = this.D;
        t1Var.S = s2Var2;
        w2 w2Var2 = this.E;
        t1Var.T = w2Var2;
        b1.e0 e0Var2 = this.F;
        t1Var.U = e0Var2;
        t1Var.V = this.G;
        t1Var.W = this.H;
        z.p1 p1Var2 = this.I;
        t1Var.X = p1Var2;
        t1Var.Y = this.J;
        w0.l lVar = this.K;
        t1Var.Z = lVar;
        t1Var.f123a0 = this.L;
        b1.h hVar = t1Var.f130h0;
        boolean z13 = z11 || z12;
        w2 w2Var3 = hVar.Q;
        b1.e0 e0Var3 = hVar.R;
        s2 s2Var3 = hVar.S;
        boolean z14 = hVar.T;
        hVar.Q = w2Var2;
        hVar.R = e0Var2;
        hVar.S = s2Var2;
        hVar.T = z13;
        if (!kotlin.jvm.internal.m.a(w2Var2, w2Var3) || !kotlin.jvm.internal.m.a(e0Var2, e0Var3) || !kotlin.jvm.internal.m.a(s2Var2, s2Var3) || z13 != z14) {
            hVar.E1();
        }
        w0.j jVar = t1Var.f131i0;
        jVar.Q.f15828a = null;
        jVar.Q = lVar;
        lVar.f15828a = jVar;
        lVar.f15829b = jVar.N ? w0.k.C : w0.k.B;
        if (!t1Var.E1()) {
            a40.u1 u1Var = t1Var.f125c0;
            if (u1Var != null) {
                u1Var.i((CancellationException) null);
            }
            t1Var.f125c0 = null;
            d0 d0Var = t1Var.f124b0;
            if (d0Var != null && (e1Var = (a40.e1) d0Var.f31b.getAndSet(null)) != null) {
                e1Var.i((CancellationException) null);
            }
        } else if (!z10 || !kotlin.jvm.internal.m.a(w2Var, w2Var2) || !zE1) {
            t1Var.F1();
        }
        if (kotlin.jvm.internal.m.a(w2Var, w2Var2) && kotlin.jvm.internal.m.a(s2Var, s2Var2) && kotlin.jvm.internal.m.a(e0Var, e0Var2) && kotlin.jvm.internal.m.a(p1Var, p1Var2)) {
            return;
        }
        b3.m.n(t1Var);
    }

    public final String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.B + ", isDragHovered=" + this.C + ", textLayoutState=" + this.D + ", textFieldState=" + this.E + ", textFieldSelectionState=" + this.F + ", cursorBrush=" + this.G + ", writeable=" + this.H + ", scrollState=" + this.I + ", orientation=" + this.J + ", toolbarRequester=" + this.K + ", platformSelectionBehaviors=" + this.L + ')';
    }
}
