package m3;

import com.google.android.gms.cast.Cast;

public final class r0 {

    public static final r0 f10521d = new r0(0, 0, null, null, 0, 0, 0, 0, 0, null, 16777215);

    public final i0 f10522a;

    public final v f10523b;

    public final z f10524c;

    public r0(long j9, long j10, q3.u uVar, q3.i iVar, long j11, long j12, int i10, int i11, long j13, z zVar, int i12) {
        long j14 = (i12 & 1) != 0 ? i2.t.f7167g : j9;
        long j15 = (i12 & 2) != 0 ? y3.o.f16599c : j10;
        q3.u uVar2 = (i12 & 4) != 0 ? null : uVar;
        q3.i iVar2 = (i12 & 32) != 0 ? null : iVar;
        long j16 = (i12 & Cast.MAX_NAMESPACE_LENGTH) != 0 ? y3.o.f16599c : j11;
        long j17 = (i12 & 2048) != 0 ? i2.t.f7167g : j12;
        int i13 = (32768 & i12) != 0 ? 0 : i10;
        int i14 = (65536 & i12) != 0 ? 0 : i11;
        long j18 = (131072 & i12) != 0 ? y3.o.f16599c : j13;
        z zVar2 = (i12 & 524288) != 0 ? null : zVar;
        this(new i0(j14, j15, uVar2, (q3.o) null, (q3.p) null, iVar2, (String) null, j16, (x3.a) null, (x3.p) null, (t3.b) null, j17, (x3.l) null, (i2.s0) null, zVar2 != null ? zVar2.f10552a : null), new v(i13, i14, j18, null, zVar2 != null ? zVar2.f10553b : null, null, 0, 0, null), zVar2);
    }

    public r0(i0 i0Var, v vVar) {
        y yVar = i0Var.f10469o;
        x xVar = vVar.f10541e;
        this(i0Var, vVar, (yVar == null && xVar == null) ? null : new z(yVar, xVar));
    }

    public r0(i0 i0Var, v vVar, z zVar) {
        this.f10522a = i0Var;
        this.f10523b = vVar;
        this.f10524c = zVar;
    }

    public static r0 a(r0 r0Var, long j9, long j10, q3.u uVar, q3.i iVar, long j11, i2.s0 s0Var, int i10, long j12, z zVar, x3.i iVar2, int i11) {
        x3.o cVar;
        long jA = (i11 & 1) != 0 ? r0Var.f10522a.f10457a.a() : j9;
        long j13 = (i11 & 2) != 0 ? r0Var.f10522a.f10458b : j10;
        q3.u uVar2 = (i11 & 4) != 0 ? r0Var.f10522a.f10459c : uVar;
        i0 i0Var = r0Var.f10522a;
        q3.o oVar = i0Var.f10460d;
        q3.p pVar = i0Var.f10461e;
        q3.i iVar3 = (i11 & 32) != 0 ? i0Var.f10462f : iVar;
        String str = i0Var.f10463g;
        long j14 = (i11 & Cast.MAX_NAMESPACE_LENGTH) != 0 ? i0Var.f10464h : j11;
        x3.a aVar = i0Var.f10465i;
        x3.p pVar2 = i0Var.f10466j;
        t3.b bVar = i0Var.f10467k;
        long j15 = i0Var.l;
        x3.l lVar = i0Var.m;
        i2.s0 s0Var2 = (i11 & 8192) != 0 ? i0Var.f10468n : s0Var;
        k2.e eVar = i0Var.f10470p;
        int i12 = (i11 & 32768) != 0 ? r0Var.f10523b.f10537a : 3;
        int i13 = (i11 & Cast.MAX_MESSAGE_LENGTH) != 0 ? r0Var.f10523b.f10538b : i10;
        long j16 = (i11 & 131072) != 0 ? r0Var.f10523b.f10539c : j12;
        v vVar = r0Var.f10523b;
        x3.q qVar = vVar.f10540d;
        z zVar2 = (i11 & 524288) != 0 ? r0Var.f10524c : zVar;
        x3.i iVar4 = (i11 & 1048576) != 0 ? vVar.f10542f : iVar2;
        int i14 = vVar.f10543g;
        int i15 = vVar.f10544h;
        x3.s sVar = vVar.f10545i;
        if (i2.t.c(jA, i0Var.f10457a.a())) {
            cVar = i0Var.f10457a;
        } else {
            cVar = jA != 16 ? new x3.c(jA) : x3.n.f16422a;
        }
        return new r0(new i0(cVar, j13, uVar2, oVar, pVar, iVar3, str, j14, aVar, pVar2, bVar, j15, lVar, s0Var2, zVar2 != null ? zVar2.f10552a : null, eVar), new v(i12, i13, j16, qVar, zVar2 != null ? zVar2.f10553b : null, iVar4, i14, i15, sVar), zVar2);
    }

    public static r0 f(r0 r0Var, long j9, long j10, q3.u uVar, q3.i iVar, long j11, x3.l lVar, int i10, long j12, int i11) {
        long j13 = (i11 & 2) != 0 ? y3.o.f16599c : j10;
        q3.u uVar2 = (i11 & 4) != 0 ? null : uVar;
        q3.i iVar2 = (i11 & 32) != 0 ? null : iVar;
        long j14 = (i11 & Cast.MAX_NAMESPACE_LENGTH) != 0 ? y3.o.f16599c : j11;
        long j15 = i2.t.f7167g;
        x3.l lVar2 = (i11 & 4096) != 0 ? null : lVar;
        int i12 = (32768 & i11) != 0 ? 0 : i10;
        long j16 = (i11 & 131072) != 0 ? y3.o.f16599c : j12;
        i0 i0VarA = j0.a(r0Var.f10522a, j9, null, Float.NaN, j13, uVar2, null, null, iVar2, null, j14, null, null, null, j15, lVar2, null, null, null);
        v vVarA = w.a(r0Var.f10523b, i12, 0, j16, null, null, null, 0, 0, null);
        return (r0Var.f10522a == i0VarA && r0Var.f10523b == vVarA) ? r0Var : new r0(i0VarA, vVarA);
    }

    public final i2.q b() {
        return this.f10522a.f10457a.b();
    }

    public final long c() {
        return this.f10522a.f10457a.a();
    }

    public final boolean d(r0 r0Var) {
        if (this != r0Var) {
            return kotlin.jvm.internal.m.a(this.f10523b, r0Var.f10523b) && this.f10522a.a(r0Var.f10522a);
        }
        return true;
    }

    public final r0 e(r0 r0Var) {
        return (r0Var == null || r0Var.equals(f10521d)) ? this : new r0(this.f10522a.c(r0Var.f10522a), this.f10523b.a(r0Var.f10523b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return kotlin.jvm.internal.m.a(this.f10522a, r0Var.f10522a) && kotlin.jvm.internal.m.a(this.f10523b, r0Var.f10523b) && kotlin.jvm.internal.m.a(this.f10524c, r0Var.f10524c);
    }

    public final int hashCode() {
        int iHashCode = (this.f10523b.hashCode() + (this.f10522a.hashCode() * 31)) * 31;
        z zVar = this.f10524c;
        return iHashCode + (zVar != null ? zVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextStyle(color=");
        sb2.append((Object) i2.t.i(c()));
        sb2.append(", brush=");
        sb2.append(b());
        sb2.append(", alpha=");
        i0 i0Var = this.f10522a;
        sb2.append(i0Var.f10457a.c());
        sb2.append(", fontSize=");
        sb2.append((Object) y3.o.d(i0Var.f10458b));
        sb2.append(", fontWeight=");
        sb2.append(i0Var.f10459c);
        sb2.append(", fontStyle=");
        sb2.append(i0Var.f10460d);
        sb2.append(", fontSynthesis=");
        sb2.append(i0Var.f10461e);
        sb2.append(", fontFamily=");
        sb2.append(i0Var.f10462f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(i0Var.f10463g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) y3.o.d(i0Var.f10464h));
        sb2.append(", baselineShift=");
        sb2.append(i0Var.f10465i);
        sb2.append(", textGeometricTransform=");
        sb2.append(i0Var.f10466j);
        sb2.append(", localeList=");
        sb2.append(i0Var.f10467k);
        sb2.append(", background=");
        w.c.s(i0Var.l, ", textDecoration=", sb2);
        sb2.append(i0Var.m);
        sb2.append(", shadow=");
        sb2.append(i0Var.f10468n);
        sb2.append(", drawStyle=");
        sb2.append(i0Var.f10470p);
        sb2.append(", textAlign=");
        v vVar = this.f10523b;
        sb2.append((Object) x3.k.a(vVar.f10537a));
        sb2.append(", textDirection=");
        sb2.append((Object) x3.m.a(vVar.f10538b));
        sb2.append(", lineHeight=");
        sb2.append((Object) y3.o.d(vVar.f10539c));
        sb2.append(", textIndent=");
        sb2.append(vVar.f10540d);
        sb2.append(", platformStyle=");
        sb2.append(this.f10524c);
        sb2.append(", lineHeightStyle=");
        sb2.append(vVar.f10542f);
        sb2.append(", lineBreak=");
        sb2.append((Object) x3.e.a(vVar.f10543g));
        sb2.append(", hyphens=");
        sb2.append((Object) x3.d.a(vVar.f10544h));
        sb2.append(", textMotion=");
        sb2.append(vVar.f10545i);
        sb2.append(')');
        return sb2.toString();
    }
}
