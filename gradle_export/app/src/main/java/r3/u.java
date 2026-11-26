package r3;

import com.google.android.gms.internal.play_billing.q1;

public final class u implements g {

    public final m3.h f13094a;

    public final int f13095b;

    public u(String str, int i10) {
        this.f13094a = new m3.h(str);
        this.f13095b = i10;
    }

    @Override
    public final void a(com.google.android.material.datepicker.n nVar) {
        int i10 = nVar.D;
        m3.h hVar = this.f13094a;
        if (i10 != -1) {
            int i11 = nVar.E;
            String str = hVar.B;
            String str2 = hVar.B;
            nVar.e(i10, str, i11);
            if (str2.length() > 0) {
                nVar.f(i10, str2.length() + i10);
            }
        } else {
            int i12 = nVar.B;
            int i13 = nVar.C;
            String str3 = hVar.B;
            String str4 = hVar.B;
            nVar.e(i12, str3, i13);
            if (str4.length() > 0) {
                nVar.f(i12, str4.length() + i12);
            }
        }
        int i14 = nVar.B;
        int i15 = nVar.C;
        int i16 = i14 == i15 ? i15 : -1;
        int i17 = this.f13095b;
        int iY = ab.a0.y(i17 > 0 ? (i16 + i17) - 1 : (i16 + i17) - hVar.B.length(), 0, ((q1) nVar.F).B());
        nVar.g(iY, iY);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.m.a(this.f13094a.B, uVar.f13094a.B) && this.f13095b == uVar.f13095b;
    }

    public final int hashCode() {
        return (this.f13094a.B.hashCode() * 31) + this.f13095b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text='");
        sb2.append(this.f13094a.B);
        sb2.append("', newCursorPosition=");
        return oi.k.l(sb2, this.f13095b, ')');
    }
}
