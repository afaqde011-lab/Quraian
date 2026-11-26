package m3;

public final class v implements c {

    public final int f10537a;

    public final int f10538b;

    public final long f10539c;

    public final x3.q f10540d;

    public final x f10541e;

    public final x3.i f10542f;

    public final int f10543g;

    public final int f10544h;

    public final x3.s f10545i;

    public v(int i10, int i11, long j9, x3.q qVar, x xVar, x3.i iVar, int i12, int i13, x3.s sVar) {
        this.f10537a = i10;
        this.f10538b = i11;
        this.f10539c = j9;
        this.f10540d = qVar;
        this.f10541e = xVar;
        this.f10542f = iVar;
        this.f10543g = i12;
        this.f10544h = i13;
        this.f10545i = sVar;
        if (y3.o.a(j9, y3.o.f16599c) || y3.o.c(j9) >= 0.0f) {
            return;
        }
        s3.a.b("lineHeight can't be negative (" + y3.o.c(j9) + ')');
    }

    public final v a(v vVar) {
        return vVar == null ? this : w.a(this, vVar.f10537a, vVar.f10538b, vVar.f10539c, vVar.f10540d, vVar.f10541e, vVar.f10542f, vVar.f10543g, vVar.f10544h, vVar.f10545i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f10537a == vVar.f10537a && this.f10538b == vVar.f10538b && y3.o.a(this.f10539c, vVar.f10539c) && kotlin.jvm.internal.m.a(this.f10540d, vVar.f10540d) && kotlin.jvm.internal.m.a(this.f10541e, vVar.f10541e) && kotlin.jvm.internal.m.a(this.f10542f, vVar.f10542f) && this.f10543g == vVar.f10543g && this.f10544h == vVar.f10544h && kotlin.jvm.internal.m.a(this.f10545i, vVar.f10545i);
    }

    public final int hashCode() {
        int iD = w.c.d(this.f10538b, Integer.hashCode(this.f10537a) * 31, 31);
        y3.p[] pVarArr = y3.o.f16598b;
        int iF = w.c.f(iD, this.f10539c, 31);
        x3.q qVar = this.f10540d;
        int iHashCode = (iF + (qVar != null ? qVar.hashCode() : 0)) * 31;
        x xVar = this.f10541e;
        int iHashCode2 = (iHashCode + (xVar != null ? xVar.hashCode() : 0)) * 31;
        x3.i iVar = this.f10542f;
        int iD2 = w.c.d(this.f10544h, w.c.d(this.f10543g, (iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31, 31), 31);
        x3.s sVar = this.f10545i;
        return iD2 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) x3.k.a(this.f10537a)) + ", textDirection=" + ((Object) x3.m.a(this.f10538b)) + ", lineHeight=" + ((Object) y3.o.d(this.f10539c)) + ", textIndent=" + this.f10540d + ", platformStyle=" + this.f10541e + ", lineHeightStyle=" + this.f10542f + ", lineBreak=" + ((Object) x3.e.a(this.f10543g)) + ", hyphens=" + ((Object) x3.d.a(this.f10544h)) + ", textMotion=" + this.f10545i + ')';
    }
}
