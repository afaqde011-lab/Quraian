package h1;

import g1.z3;
import java.util.List;

public final class e0 implements c4.b0 {
    public final long A;
    public final y3.c B;
    public final int C;
    public final g1.i D;
    public final a E;
    public final a F;
    public final g1 G;
    public final g1 H;
    public final b I;
    public final b J;
    public final b K;
    public final h1 L;
    public final h1 M;

    public e0(long j9, y3.c cVar, g1.i iVar) {
        int iR0 = cVar.R0(z3.f6036a);
        this.A = j9;
        this.B = cVar;
        this.C = iR0;
        this.D = iVar;
        int iR1 = cVar.R0(y3.g.a(j9));
        b2.g gVar = b2.b.M;
        this.E = new a(gVar, gVar, iR1);
        b2.g gVar2 = b2.b.O;
        this.F = new a(gVar2, gVar2, iR1);
        this.G = new g1(b2.a.f1976c);
        this.H = new g1(b2.a.f1977d);
        int iR2 = cVar.R0(y3.g.b(j9));
        b2.h hVar = b2.b.J;
        b2.h hVar2 = b2.b.L;
        this.I = new b(hVar, hVar2, iR2);
        this.J = new b(hVar2, hVar, iR2);
        this.K = new b(b2.b.K, hVar, iR2);
        this.L = new h1(hVar, iR0);
        this.M = new h1(hVar2, iR0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (this.A == e0Var.A && kotlin.jvm.internal.m.a(this.B, e0Var.B) && this.C == e0Var.C && kotlin.jvm.internal.m.a(this.D, e0Var.D)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final long f(y3.k kVar, long j9, y3.m mVar, long j10) {
        y3.k kVar2;
        long j11;
        char c10;
        int iA;
        int i10;
        char c11 = ' ';
        int i11 = (int) (j9 >> 32);
        int i12 = 0;
        List listS = va.a.S(this.E, this.F, ((int) (kVar.a() >> 32)) < i11 / 2 ? this.G : this.H);
        int size = listS.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                kVar2 = kVar;
                j11 = j9;
                c10 = c11;
                iA = 0;
                break;
            }
            o0 o0Var = (o0) listS.get(i13);
            int i14 = (int) (j10 >> c11);
            int i15 = size;
            c10 = c11;
            j11 = j9;
            int i16 = i13;
            kVar2 = kVar;
            iA = o0Var.a(kVar2, j11, i14, mVar);
            if (i16 == va.a.M(listS) || (iA >= 0 && i14 + iA <= i11)) {
                break;
            }
            i13 = i16 + 1;
            size = i15;
            c11 = c10;
        }
        int i17 = (int) (j11 & 4294967295L);
        List listS2 = va.a.S(this.I, this.J, this.K, ((int) (kVar2.a() & 4294967295L)) < i17 / 2 ? this.L : this.M);
        int size2 = listS2.size();
        for (int i18 = 0; i18 < size2; i18++) {
            int i19 = (int) (j10 & 4294967295L);
            int iA2 = ((p0) listS2.get(i18)).a(kVar2, j11, i19);
            if (i18 == va.a.M(listS2) || (iA2 >= (i10 = this.C) && i19 + iA2 <= i17 - i10)) {
                i12 = iA2;
                break;
            }
        }
        long j12 = (((long) iA) << c10) | (((long) i12) & 4294967295L);
        this.D.invoke(kVar2, k00.f.c(j12, j10));
        return j12;
    }

    public final int hashCode() {
        return this.D.hashCode() + w.c.d(this.C, (this.B.hashCode() + (Long.hashCode(this.A) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) y3.g.c(this.A)) + ", density=" + this.B + ", verticalMargin=" + this.C + ", onPositionCalculated=" + this.D + ')';
    }
}
