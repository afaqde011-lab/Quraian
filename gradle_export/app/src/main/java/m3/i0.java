package m3;

import com.google.android.gms.cast.Cast;

public final class i0 implements c {

    public final x3.o f10457a;

    public final long f10458b;

    public final q3.u f10459c;

    public final q3.o f10460d;

    public final q3.p f10461e;

    public final q3.i f10462f;

    public final String f10463g;

    public final long f10464h;

    public final x3.a f10465i;

    public final x3.p f10466j;

    public final t3.b f10467k;
    public final long l;
    public final x3.l m;

    public final i2.s0 f10468n;

    public final y f10469o;

    public final k2.e f10470p;

    public i0(long j9, long j10, q3.u uVar, q3.o oVar, q3.p pVar, q3.i iVar, String str, long j11, x3.a aVar, x3.p pVar2, t3.b bVar, long j12, x3.l lVar, i2.s0 s0Var, int i10) {
        this((i10 & 1) != 0 ? i2.t.f7167g : j9, (i10 & 2) != 0 ? y3.o.f16599c : j10, (i10 & 4) != 0 ? null : uVar, (i10 & 8) != 0 ? null : oVar, (i10 & 16) != 0 ? null : pVar, (i10 & 32) != 0 ? null : iVar, (i10 & 64) != 0 ? null : str, (i10 & Cast.MAX_NAMESPACE_LENGTH) != 0 ? y3.o.f16599c : j11, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : pVar2, (i10 & 1024) != 0 ? null : bVar, (i10 & 2048) != 0 ? i2.t.f7167g : j12, (i10 & 4096) != 0 ? null : lVar, (i10 & 8192) != 0 ? null : s0Var, (y) null);
    }

    public i0(long j9, long j10, q3.u uVar, q3.o oVar, q3.p pVar, q3.i iVar, String str, long j11, x3.a aVar, x3.p pVar2, t3.b bVar, long j12, x3.l lVar, i2.s0 s0Var, y yVar) {
        this(j9 != 16 ? new x3.c(j9) : x3.n.f16422a, j10, uVar, oVar, pVar, iVar, str, j11, aVar, pVar2, bVar, j12, lVar, s0Var, yVar, null);
    }

    public i0(x3.o oVar, long j9, q3.u uVar, q3.o oVar2, q3.p pVar, q3.i iVar, String str, long j10, x3.a aVar, x3.p pVar2, t3.b bVar, long j11, x3.l lVar, i2.s0 s0Var, y yVar, k2.e eVar) {
        this.f10457a = oVar;
        this.f10458b = j9;
        this.f10459c = uVar;
        this.f10460d = oVar2;
        this.f10461e = pVar;
        this.f10462f = iVar;
        this.f10463g = str;
        this.f10464h = j10;
        this.f10465i = aVar;
        this.f10466j = pVar2;
        this.f10467k = bVar;
        this.l = j11;
        this.m = lVar;
        this.f10468n = s0Var;
        this.f10469o = yVar;
        this.f10470p = eVar;
    }

    public final boolean a(i0 i0Var) {
        if (this == i0Var) {
            return true;
        }
        return y3.o.a(this.f10458b, i0Var.f10458b) && kotlin.jvm.internal.m.a(this.f10459c, i0Var.f10459c) && kotlin.jvm.internal.m.a(this.f10460d, i0Var.f10460d) && kotlin.jvm.internal.m.a(this.f10461e, i0Var.f10461e) && kotlin.jvm.internal.m.a(this.f10462f, i0Var.f10462f) && kotlin.jvm.internal.m.a(this.f10463g, i0Var.f10463g) && y3.o.a(this.f10464h, i0Var.f10464h) && kotlin.jvm.internal.m.a(this.f10465i, i0Var.f10465i) && kotlin.jvm.internal.m.a(this.f10466j, i0Var.f10466j) && kotlin.jvm.internal.m.a(this.f10467k, i0Var.f10467k) && i2.t.c(this.l, i0Var.l) && kotlin.jvm.internal.m.a(this.f10469o, i0Var.f10469o);
    }

    public final boolean b(i0 i0Var) {
        return kotlin.jvm.internal.m.a(this.f10457a, i0Var.f10457a) && kotlin.jvm.internal.m.a(this.m, i0Var.m) && kotlin.jvm.internal.m.a(this.f10468n, i0Var.f10468n) && kotlin.jvm.internal.m.a(this.f10470p, i0Var.f10470p);
    }

    public final i0 c(i0 i0Var) {
        if (i0Var == null) {
            return this;
        }
        x3.o oVar = i0Var.f10457a;
        return j0.a(this, oVar.a(), oVar.b(), oVar.c(), i0Var.f10458b, i0Var.f10459c, i0Var.f10460d, i0Var.f10461e, i0Var.f10462f, i0Var.f10463g, i0Var.f10464h, i0Var.f10465i, i0Var.f10466j, i0Var.f10467k, i0Var.l, i0Var.m, i0Var.f10468n, i0Var.f10469o, i0Var.f10470p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return a(i0Var) && b(i0Var);
    }

    public final int hashCode() {
        x3.o oVar = this.f10457a;
        long jA = oVar.a();
        int i10 = i2.t.f7168h;
        int iHashCode = Long.hashCode(jA) * 31;
        i2.q qVarB = oVar.b();
        int iHashCode2 = (Float.hashCode(oVar.c()) + ((iHashCode + (qVarB != null ? qVarB.hashCode() : 0)) * 31)) * 31;
        y3.p[] pVarArr = y3.o.f16598b;
        int iF = w.c.f(iHashCode2, this.f10458b, 31);
        q3.u uVar = this.f10459c;
        int i11 = (iF + (uVar != null ? uVar.A : 0)) * 31;
        q3.o oVar2 = this.f10460d;
        int iHashCode3 = (i11 + (oVar2 != null ? Integer.hashCode(oVar2.f12746a) : 0)) * 31;
        q3.p pVar = this.f10461e;
        int iHashCode4 = (iHashCode3 + (pVar != null ? Integer.hashCode(pVar.f12747a) : 0)) * 31;
        q3.i iVar = this.f10462f;
        int iHashCode5 = (iHashCode4 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        String str = this.f10463g;
        int iF2 = w.c.f((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, this.f10464h, 31);
        x3.a aVar = this.f10465i;
        int iHashCode6 = (iF2 + (aVar != null ? Float.hashCode(aVar.f16399a) : 0)) * 31;
        x3.p pVar2 = this.f10466j;
        int iHashCode7 = (iHashCode6 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        t3.b bVar = this.f10467k;
        int iF3 = w.c.f((iHashCode7 + (bVar != null ? bVar.A.hashCode() : 0)) * 31, this.l, 31);
        x3.l lVar = this.m;
        int i12 = (iF3 + (lVar != null ? lVar.f16420a : 0)) * 31;
        i2.s0 s0Var = this.f10468n;
        int iHashCode8 = (i12 + (s0Var != null ? s0Var.hashCode() : 0)) * 31;
        y yVar = this.f10469o;
        int iHashCode9 = (iHashCode8 + (yVar != null ? yVar.hashCode() : 0)) * 31;
        k2.e eVar = this.f10470p;
        return iHashCode9 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanStyle(color=");
        x3.o oVar = this.f10457a;
        sb2.append((Object) i2.t.i(oVar.a()));
        sb2.append(", brush=");
        sb2.append(oVar.b());
        sb2.append(", alpha=");
        sb2.append(oVar.c());
        sb2.append(", fontSize=");
        sb2.append((Object) y3.o.d(this.f10458b));
        sb2.append(", fontWeight=");
        sb2.append(this.f10459c);
        sb2.append(", fontStyle=");
        sb2.append(this.f10460d);
        sb2.append(", fontSynthesis=");
        sb2.append(this.f10461e);
        sb2.append(", fontFamily=");
        sb2.append(this.f10462f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(this.f10463g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) y3.o.d(this.f10464h));
        sb2.append(", baselineShift=");
        sb2.append(this.f10465i);
        sb2.append(", textGeometricTransform=");
        sb2.append(this.f10466j);
        sb2.append(", localeList=");
        sb2.append(this.f10467k);
        sb2.append(", background=");
        w.c.s(this.l, ", textDecoration=", sb2);
        sb2.append(this.m);
        sb2.append(", shadow=");
        sb2.append(this.f10468n);
        sb2.append(", platformStyle=");
        sb2.append(this.f10469o);
        sb2.append(", drawStyle=");
        sb2.append(this.f10470p);
        sb2.append(')');
        return sb2.toString();
    }
}
