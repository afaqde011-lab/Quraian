package a1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La1/v0;", "Lb3/e1;", "La1/w0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class v0 extends b3.e1 {
    public final h B;
    public final q0.j1 C;
    public final e1.v0 D;

    public v0(h hVar, q0.j1 j1Var, e1.v0 v0Var) {
        this.B = hVar;
        this.C = j1Var;
        this.D = v0Var;
    }

    @Override
    public final b2.q d() {
        return new w0(this.B, this.C, this.D);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return kotlin.jvm.internal.m.a(this.B, v0Var.B) && kotlin.jvm.internal.m.a(this.C, v0Var.C) && kotlin.jvm.internal.m.a(this.D, v0Var.D);
    }

    @Override
    public final void h(c3.d2 d2Var) {
    }

    public final int hashCode() {
        return this.D.hashCode() + ((this.C.hashCode() + (this.B.hashCode() * 31)) * 31);
    }

    @Override
    public final void i(b2.q qVar) {
        w0 w0Var = (w0) qVar;
        if (w0Var.N) {
            w0Var.O.d();
            w0Var.O.k(w0Var);
        }
        h hVar = this.B;
        w0Var.O = hVar;
        if (w0Var.N) {
            if (hVar.f49a != null) {
                g0.a.c("Expected textInputModifierNode to be null");
            }
            hVar.f49a = w0Var;
        }
        w0Var.P = this.C;
        w0Var.Q = this.D;
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.B + ", legacyTextFieldState=" + this.C + ", textFieldSelectionManager=" + this.D + ')';
    }
}
