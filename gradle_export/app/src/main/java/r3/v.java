package r3;

import com.google.android.gms.internal.play_billing.q1;

public final class v implements g {

    public final int f13096a;

    public final int f13097b;

    public v(int i10, int i11) {
        this.f13096a = i10;
        this.f13097b = i11;
    }

    @Override
    public final void a(com.google.android.material.datepicker.n nVar) {
        int iY = ab.a0.y(this.f13096a, 0, ((q1) nVar.F).B());
        int iY2 = ab.a0.y(this.f13097b, 0, ((q1) nVar.F).B());
        if (iY < iY2) {
            nVar.g(iY, iY2);
        } else {
            nVar.g(iY2, iY);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f13096a == vVar.f13096a && this.f13097b == vVar.f13097b;
    }

    public final int hashCode() {
        return (this.f13096a * 31) + this.f13097b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetSelectionCommand(start=");
        sb2.append(this.f13096a);
        sb2.append(", end=");
        return oi.k.l(sb2, this.f13097b, ')');
    }
}
