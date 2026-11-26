package m3;

import android.graphics.RectF;
import android.text.Layout;
import com.google.android.gms.internal.play_billing.q1;
import java.util.ArrayList;

public final class n0 {

    public final m0 f10496a;

    public final q f10497b;

    public final long f10498c;

    public final float f10499d;

    public final float f10500e;

    public final ArrayList f10501f;

    public n0(m0 m0Var, q qVar, long j9) {
        this.f10496a = m0Var;
        this.f10497b = qVar;
        this.f10498c = j9;
        ArrayList arrayList = qVar.f10517h;
        float fD = 0.0f;
        this.f10499d = arrayList.isEmpty() ? 0.0f : ((s) arrayList.get(0)).f10525a.f10416d.d(0);
        if (!arrayList.isEmpty()) {
            s sVar = (s) h00.q.T0(arrayList);
            n3.i iVar = sVar.f10525a.f10416d;
            fD = iVar.d(iVar.f11044g - 1) + sVar.f10530f;
        }
        this.f10500e = fD;
        this.f10501f = qVar.f10516g;
    }

    public final x3.j a(int i10) {
        q qVar = this.f10497b;
        ArrayList arrayList = qVar.f10517h;
        qVar.l(i10);
        s sVar = (s) arrayList.get(i10 == ((h) qVar.f10510a.B).B.length() ? va.a.M(arrayList) : h0.d(i10, arrayList));
        return sVar.f10525a.f10416d.f11043f.isRtlCharAt(sVar.d(i10)) ? x3.j.B : x3.j.A;
    }

    public final h2.c b(int i10) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        q qVar = this.f10497b;
        qVar.k(i10);
        ArrayList arrayList = qVar.f10517h;
        s sVar = (s) arrayList.get(h0.d(i10, arrayList));
        b bVar = sVar.f10525a;
        int iD = sVar.d(i10);
        CharSequence charSequence = bVar.f10417e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbQ = oi.k.q("offset(", iD, ") is out of bounds [0,");
            sbQ.append(charSequence.length());
            sbQ.append(')');
            s3.a.a(sbQ.toString());
        }
        n3.i iVar = bVar.f10416d;
        Layout layout = iVar.f11043f;
        int lineForOffset = layout.getLineForOffset(iD);
        float fG = iVar.g(lineForOffset);
        float fE = iVar.e(lineForOffset);
        boolean z10 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z10 || zIsRtlCharAt) {
            if (z10 && zIsRtlCharAt) {
                fH = iVar.i(iD, false);
                fH2 = iVar.i(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fH = iVar.h(iD, false);
                fH2 = iVar.h(iD + 1, true);
            } else {
                fI = iVar.i(iD, false);
                fI2 = iVar.i(iD + 1, true);
            }
            float f3 = fH;
            fI = fH2;
            fI2 = f3;
        } else {
            fI = iVar.h(iD, false);
            fI2 = iVar.h(iD + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        return sVar.a(new h2.c(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final h2.c c(int i10) {
        q qVar = this.f10497b;
        ArrayList arrayList = qVar.f10517h;
        qVar.l(i10);
        s sVar = (s) arrayList.get(i10 == ((h) qVar.f10510a.B).B.length() ? va.a.M(arrayList) : h0.d(i10, arrayList));
        b bVar = sVar.f10525a;
        int iD = sVar.d(i10);
        CharSequence charSequence = bVar.f10417e;
        n3.i iVar = bVar.f10416d;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbQ = oi.k.q("offset(", iD, ") is out of bounds [0,");
            sbQ.append(charSequence.length());
            sbQ.append(']');
            s3.a.a(sbQ.toString());
        }
        float fH = iVar.h(iD, false);
        int lineForOffset = iVar.f11043f.getLineForOffset(iD);
        return sVar.a(new h2.c(fH, iVar.g(lineForOffset), fH, iVar.e(lineForOffset)));
    }

    public final boolean d() {
        long j9 = this.f10498c;
        float f3 = (int) (j9 >> 32);
        q qVar = this.f10497b;
        return f3 < qVar.f10513d || qVar.f10512c || ((float) ((int) (j9 & 4294967295L))) < qVar.f10514e;
    }

    public final float e(int i10, boolean z10) {
        q qVar = this.f10497b;
        ArrayList arrayList = qVar.f10517h;
        qVar.l(i10);
        s sVar = (s) arrayList.get(i10 == ((h) qVar.f10510a.B).B.length() ? va.a.M(arrayList) : h0.d(i10, arrayList));
        b bVar = sVar.f10525a;
        int iD = sVar.d(i10);
        n3.i iVar = bVar.f10416d;
        return z10 ? iVar.h(iD, false) : iVar.i(iD, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f10496a.equals(n0Var.f10496a) && this.f10497b.equals(n0Var.f10497b) && y3.l.b(this.f10498c, n0Var.f10498c) && this.f10499d == n0Var.f10499d && this.f10500e == n0Var.f10500e && kotlin.jvm.internal.m.a(this.f10501f, n0Var.f10501f);
    }

    public final float f(int i10) {
        q qVar = this.f10497b;
        qVar.m(i10);
        ArrayList arrayList = qVar.f10517h;
        s sVar = (s) arrayList.get(h0.e(i10, arrayList));
        b bVar = sVar.f10525a;
        int i11 = i10 - sVar.f10528d;
        n3.i iVar = bVar.f10416d;
        return iVar.f11043f.getLineLeft(i11) + (i11 == iVar.f11044g + (-1) ? iVar.f11047j : 0.0f);
    }

    public final float g(int i10) {
        q qVar = this.f10497b;
        qVar.m(i10);
        ArrayList arrayList = qVar.f10517h;
        s sVar = (s) arrayList.get(h0.e(i10, arrayList));
        b bVar = sVar.f10525a;
        int i11 = i10 - sVar.f10528d;
        n3.i iVar = bVar.f10416d;
        return iVar.f11043f.getLineRight(i11) + (i11 == iVar.f11044g + (-1) ? iVar.f11048k : 0.0f);
    }

    public final int h(int i10) {
        q qVar = this.f10497b;
        qVar.m(i10);
        ArrayList arrayList = qVar.f10517h;
        s sVar = (s) arrayList.get(h0.e(i10, arrayList));
        b bVar = sVar.f10525a;
        return bVar.f10416d.f11043f.getLineStart(i10 - sVar.f10528d) + sVar.f10526b;
    }

    public final int hashCode() {
        return this.f10501f.hashCode() + w.c.c(this.f10500e, w.c.c(this.f10499d, w.c.f((this.f10497b.hashCode() + (this.f10496a.hashCode() * 31)) * 31, this.f10498c, 31), 31), 31);
    }

    public final x3.j i(int i10) {
        q qVar = this.f10497b;
        ArrayList arrayList = qVar.f10517h;
        qVar.l(i10);
        s sVar = (s) arrayList.get(i10 == ((h) qVar.f10510a.B).B.length() ? va.a.M(arrayList) : h0.d(i10, arrayList));
        b bVar = sVar.f10525a;
        int iD = sVar.d(i10);
        n3.i iVar = bVar.f10416d;
        return iVar.f11043f.getParagraphDirection(iVar.f11043f.getLineForOffset(iD)) == 1 ? x3.j.A : x3.j.B;
    }

    public final i2.g j(int i10, int i11) {
        q qVar = this.f10497b;
        ce.c cVar = qVar.f10510a;
        if (i10 < 0 || i10 > i11 || i11 > ((h) cVar.B).B.length()) {
            StringBuilder sbP = oi.k.p(i10, i11, "Start(", ") or End(", ") is out of range [0..");
            sbP.append(((h) cVar.B).B.length());
            sbP.append("), or start > end!");
            s3.a.a(sbP.toString());
        }
        if (i10 == i11) {
            return i2.j.a();
        }
        i2.g gVarA = i2.j.a();
        h0.g(qVar.f10517h, h0.b(i10, i11), new a1.p0(gVarA, i10, i11, 3));
        return gVarA;
    }

    public final long k(int i10) {
        int iX;
        int iK;
        int iK2;
        q qVar = this.f10497b;
        ArrayList arrayList = qVar.f10517h;
        qVar.l(i10);
        s sVar = (s) arrayList.get(i10 == ((h) qVar.f10510a.B).B.length() ? va.a.M(arrayList) : h0.d(i10, arrayList));
        b bVar = sVar.f10525a;
        int iD = sVar.d(i10);
        q1 q1VarJ = bVar.f10416d.j();
        if (q1VarJ.H(q1VarJ.X(iD))) {
            q1VarJ.i(iD);
            iX = iD;
            while (iX != -1 && (!q1VarJ.H(iX) || q1VarJ.D(iX))) {
                iX = q1VarJ.X(iX);
            }
        } else {
            q1VarJ.i(iD);
            if (q1VarJ.G(iD)) {
                iX = (!q1VarJ.E(iD) || q1VarJ.C(iD)) ? q1VarJ.X(iD) : iD;
            } else {
                iX = q1VarJ.C(iD) ? q1VarJ.X(iD) : -1;
            }
        }
        if (iX == -1) {
            iX = iD;
        }
        if (q1VarJ.D(q1VarJ.K(iD))) {
            q1VarJ.i(iD);
            iK = iD;
            while (iK != -1 && (q1VarJ.H(iK) || !q1VarJ.D(iK))) {
                iK = q1VarJ.K(iK);
            }
        } else {
            q1VarJ.i(iD);
            if (q1VarJ.C(iD)) {
                if (!q1VarJ.E(iD) || q1VarJ.G(iD)) {
                    iK2 = q1VarJ.K(iD);
                    iK = iK2;
                } else {
                    iK = iD;
                }
            } else if (q1VarJ.G(iD)) {
                iK2 = q1VarJ.K(iD);
                iK = iK2;
            } else {
                iK = -1;
            }
        }
        if (iK != -1) {
            iD = iK;
        }
        return sVar.b(false, h0.b(iX, iD));
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f10496a + ", multiParagraph=" + this.f10497b + ", size=" + ((Object) y3.l.c(this.f10498c)) + ", firstBaseline=" + this.f10499d + ", lastBaseline=" + this.f10500e + ", placeholderRects=" + this.f10501f + ')';
    }
}
