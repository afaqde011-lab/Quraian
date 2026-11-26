package r3;

import com.google.android.gms.internal.play_billing.q1;

public final class f implements g {

    public final int f13069a;

    public final int f13070b;

    public f(int i10, int i11) {
        this.f13069a = i10;
        this.f13070b = i11;
        if (i10 >= 0 && i11 >= 0) {
            return;
        }
        s3.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i10 + " and " + i11 + " respectively.");
    }

    @Override
    public final void a(com.google.android.material.datepicker.n nVar) {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f13069a; i11++) {
            int i12 = i10 + 1;
            int i13 = nVar.B;
            if (i13 <= i12) {
                i10 = i13;
                break;
            }
            i10 = (Character.isHighSurrogate(nVar.b((i13 - i12) + (-1))) && Character.isLowSurrogate(nVar.b(nVar.B - i12))) ? i10 + 2 : i12;
        }
        int iB = 0;
        for (int i14 = 0; i14 < this.f13070b; i14++) {
            int i15 = iB + 1;
            int i16 = nVar.C;
            q1 q1Var = (q1) nVar.F;
            if (i16 + i15 >= q1Var.B()) {
                iB = q1Var.B() - nVar.C;
                break;
            }
            iB = (Character.isHighSurrogate(nVar.b((nVar.C + i15) + (-1))) && Character.isLowSurrogate(nVar.b(nVar.C + i15))) ? iB + 2 : i15;
        }
        int i17 = nVar.C;
        nVar.a(i17, iB + i17);
        int i18 = nVar.B;
        nVar.a(i18 - i10, i18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f13069a == fVar.f13069a && this.f13070b == fVar.f13070b;
    }

    public final int hashCode() {
        return (this.f13069a * 31) + this.f13070b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb2.append(this.f13069a);
        sb2.append(", lengthAfterCursor=");
        return oi.k.l(sb2, this.f13070b, ')');
    }
}
