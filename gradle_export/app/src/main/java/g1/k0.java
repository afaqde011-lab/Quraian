package g1;

import com.google.protobuf.RuntimeVersion;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lg1/k0;", "Lb3/e1;", "Lg1/o0;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k0 extends b3.e1 {
    public final h B;
    public final boolean C;
    public final int D;
    public final x.b1 E;

    public k0(h hVar, boolean z10, int i10, x.b1 b1Var) {
        this.B = hVar;
        this.C = z10;
        this.D = i10;
        this.E = b1Var;
    }

    @Override
    public final b2.q d() {
        return new o0(this.B, this.C, this.D, this.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return kotlin.jvm.internal.m.a(this.B, k0Var.B) && this.C == k0Var.C && this.D == k0Var.D && this.E.equals(k0Var.E);
    }

    @Override
    public final void h(c3.d2 d2Var) {
    }

    public final int hashCode() {
        return this.E.hashCode() + w.c.d(this.D, w.c.e(this.B.hashCode() * 31, 31, this.C), 31);
    }

    @Override
    public final void i(b2.q qVar) {
        o0 o0Var = (o0) qVar;
        h hVar = this.B;
        o0Var.Q = hVar;
        o0Var.R = this.C;
        x.b1 b1Var = this.E;
        o0Var.T = b1Var;
        int i10 = o0Var.S;
        int i11 = this.D;
        if (i10 == i11) {
            return;
        }
        o0Var.S = i11;
        a40.c0.y(o0Var.p1(), (k00.i) null, (a40.a0) null, new d0.i2(hVar, b1Var, (k00.c) null, 28), 3);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ClockDialModifier(state=");
        sb2.append(this.B);
        sb2.append(", autoSwitchToMinute=");
        sb2.append(this.C);
        sb2.append(", selection=");
        int i10 = this.D;
        if (i10 == 0) {
            str = "Hour";
        } else {
            str = i10 == 1 ? "Minute" : RuntimeVersion.SUFFIX;
        }
        sb2.append((Object) str);
        sb2.append(", animationSpec=");
        sb2.append(this.E);
        sb2.append(')');
        return sb2.toString();
    }
}
