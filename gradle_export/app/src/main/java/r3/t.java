package r3;

import com.google.android.gms.internal.play_billing.q1;

public final class t implements g {

    public final int f13092a;

    public final int f13093b;

    public t(int i10, int i11) {
        this.f13092a = i10;
        this.f13093b = i11;
    }

    @Override
    public final void a(com.google.android.material.datepicker.n nVar) {
        boolean z10 = nVar.D != -1;
        q1 q1Var = (q1) nVar.F;
        if (z10) {
            nVar.D = -1;
            nVar.E = -1;
        }
        int iY = ab.a0.y(this.f13092a, 0, q1Var.B());
        int iY2 = ab.a0.y(this.f13093b, 0, q1Var.B());
        if (iY != iY2) {
            if (iY < iY2) {
                nVar.f(iY, iY2);
            } else {
                nVar.f(iY2, iY);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f13092a == tVar.f13092a && this.f13093b == tVar.f13093b;
    }

    public final int hashCode() {
        return (this.f13092a * 31) + this.f13093b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.f13092a);
        sb2.append(", end=");
        return oi.k.l(sb2, this.f13093b, ')');
    }
}
