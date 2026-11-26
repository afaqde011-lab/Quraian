package r3;

import com.google.android.gms.internal.play_billing.q1;

public final class a implements g {

    public final m3.h f13045a;

    public final int f13046b;

    public a(String str, int i10) {
        this(new m3.h(str), i10);
    }

    public a(m3.h hVar, int i10) {
        this.f13045a = hVar;
        this.f13046b = i10;
    }

    @Override
    public final void a(com.google.android.material.datepicker.n nVar) {
        int i10 = nVar.D;
        m3.h hVar = this.f13045a;
        if (i10 != -1) {
            nVar.e(i10, hVar.B, nVar.E);
        } else {
            nVar.e(nVar.B, hVar.B, nVar.C);
        }
        int i11 = nVar.B;
        int i12 = nVar.C;
        int i13 = i11 == i12 ? i12 : -1;
        int i14 = this.f13046b;
        int iY = ab.a0.y(i14 > 0 ? (i13 + i14) - 1 : (i13 + i14) - hVar.B.length(), 0, ((q1) nVar.F).B());
        nVar.g(iY, iY);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m.a(this.f13045a.B, aVar.f13045a.B) && this.f13046b == aVar.f13046b;
    }

    public final int hashCode() {
        return (this.f13045a.B.hashCode() * 31) + this.f13046b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommitTextCommand(text='");
        sb2.append(this.f13045a.B);
        sb2.append("', newCursorPosition=");
        return oi.k.l(sb2, this.f13046b, ')');
    }
}
