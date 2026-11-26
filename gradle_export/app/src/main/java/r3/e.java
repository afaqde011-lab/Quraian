package r3;

import com.google.android.gms.internal.play_billing.q1;

public final class e implements g {

    public final int f13067a;

    public final int f13068b;

    public e(int i10, int i11) {
        this.f13067a = i10;
        this.f13068b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        s3.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    @Override
    public final void a(com.google.android.material.datepicker.n nVar) {
        int i10 = nVar.C;
        q1 q1Var = (q1) nVar.F;
        int i11 = this.f13068b;
        int iB = i10 + i11;
        if (((i10 ^ iB) & (i11 ^ iB)) < 0) {
            iB = q1Var.B();
        }
        nVar.a(nVar.C, Math.min(iB, q1Var.B()));
        int i12 = nVar.B;
        int i13 = this.f13067a;
        int i14 = i12 - i13;
        if (((i13 ^ i12) & (i12 ^ i14)) < 0) {
            i14 = 0;
        }
        nVar.a(Math.max(0, i14), nVar.B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f13067a == eVar.f13067a && this.f13068b == eVar.f13068b;
    }

    public final int hashCode() {
        return (this.f13067a * 31) + this.f13068b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.f13067a);
        sb2.append(", lengthAfterCursor=");
        return oi.k.l(sb2, this.f13068b, ')');
    }
}
