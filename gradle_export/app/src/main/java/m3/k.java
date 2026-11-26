package m3;

public final class k {

    public final m0 f10475a;

    public k(m0 m0Var) {
        this.f10475a = m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        m0 m0Var = this.f10475a;
        h hVar = m0Var.f10483a;
        m0 m0Var2 = ((k) obj).f10475a;
        return kotlin.jvm.internal.m.a(hVar, m0Var2.f10483a) && m0Var.f10484b.d(m0Var2.f10484b) && kotlin.jvm.internal.m.a(m0Var.f10485c, m0Var2.f10485c) && m0Var.f10486d == m0Var2.f10486d && m0Var.f10487e == m0Var2.f10487e && m0Var.f10488f == m0Var2.f10488f && kotlin.jvm.internal.m.a(m0Var.f10489g, m0Var2.f10489g) && m0Var.f10490h == m0Var2.f10490h && m0Var.f10491i == m0Var2.f10491i && y3.a.b(m0Var.f10492j, m0Var2.f10492j);
    }

    public final int hashCode() {
        m0 m0Var = this.f10475a;
        int iHashCode = m0Var.f10483a.hashCode() * 31;
        r0 r0Var = m0Var.f10484b;
        i0 i0Var = r0Var.f10522a;
        long j9 = i0Var.f10458b;
        y3.p[] pVarArr = y3.o.f16598b;
        int iHashCode2 = Long.hashCode(j9) * 31;
        q3.u uVar = i0Var.f10459c;
        int i10 = (iHashCode2 + (uVar != null ? uVar.A : 0)) * 31;
        q3.o oVar = i0Var.f10460d;
        int iHashCode3 = (i10 + (oVar != null ? Integer.hashCode(oVar.f12746a) : 0)) * 31;
        q3.p pVar = i0Var.f10461e;
        int iHashCode4 = (iHashCode3 + (pVar != null ? Integer.hashCode(pVar.f12747a) : 0)) * 31;
        q3.i iVar = i0Var.f10462f;
        int iHashCode5 = (iHashCode4 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        String str = i0Var.f10463g;
        int iF = w.c.f((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, i0Var.f10464h, 31);
        x3.a aVar = i0Var.f10465i;
        int iHashCode6 = (iF + (aVar != null ? Float.hashCode(aVar.f16399a) : 0)) * 31;
        x3.p pVar2 = i0Var.f10466j;
        int iHashCode7 = (iHashCode6 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        t3.b bVar = i0Var.f10467k;
        int iHashCode8 = (iHashCode7 + (bVar != null ? bVar.A.hashCode() : 0)) * 31;
        long j10 = i0Var.l;
        int i11 = i2.t.f7168h;
        int iF2 = w.c.f(iHashCode8, j10, 31);
        y yVar = i0Var.f10469o;
        int iHashCode9 = (r0Var.f10523b.hashCode() + ((iF2 + (yVar != null ? yVar.hashCode() : 0)) * 31)) * 31;
        z zVar = r0Var.f10524c;
        return Long.hashCode(m0Var.f10492j) + ((m0Var.f10491i.hashCode() + ((m0Var.f10490h.hashCode() + ((m0Var.f10489g.hashCode() + w.c.d(m0Var.f10488f, w.c.e((g4.c.a((iHashCode9 + (zVar != null ? zVar.hashCode() : 0) + iHashCode) * 31, 31, m0Var.f10485c) + m0Var.f10486d) * 31, 31, m0Var.f10487e), 31)) * 31)) * 31)) * 31);
    }
}
