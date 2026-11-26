package m3;

import java.util.List;

public final class m0 {

    public final h f10483a;

    public final r0 f10484b;

    public final List f10485c;

    public final int f10486d;

    public final boolean f10487e;

    public final int f10488f;

    public final y3.c f10489g;

    public final y3.m f10490h;

    public final q3.h f10491i;

    public final long f10492j;

    public m0(h hVar, r0 r0Var, List list, int i10, boolean z10, int i11, y3.c cVar, y3.m mVar, q3.h hVar2, long j9) {
        this.f10483a = hVar;
        this.f10484b = r0Var;
        this.f10485c = list;
        this.f10486d = i10;
        this.f10487e = z10;
        this.f10488f = i11;
        this.f10489g = cVar;
        this.f10490h = mVar;
        this.f10491i = hVar2;
        this.f10492j = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return kotlin.jvm.internal.m.a(this.f10483a, m0Var.f10483a) && kotlin.jvm.internal.m.a(this.f10484b, m0Var.f10484b) && kotlin.jvm.internal.m.a(this.f10485c, m0Var.f10485c) && this.f10486d == m0Var.f10486d && this.f10487e == m0Var.f10487e && this.f10488f == m0Var.f10488f && kotlin.jvm.internal.m.a(this.f10489g, m0Var.f10489g) && this.f10490h == m0Var.f10490h && kotlin.jvm.internal.m.a(this.f10491i, m0Var.f10491i) && y3.a.b(this.f10492j, m0Var.f10492j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f10492j) + ((this.f10491i.hashCode() + ((this.f10490h.hashCode() + ((this.f10489g.hashCode() + w.c.d(this.f10488f, w.c.e((g4.c.a(a1.b.g(this.f10484b, this.f10483a.hashCode() * 31, 31), 31, this.f10485c) + this.f10486d) * 31, 31, this.f10487e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TextLayoutInput(text=");
        sb2.append((Object) this.f10483a);
        sb2.append(", style=");
        sb2.append(this.f10484b);
        sb2.append(", placeholders=");
        sb2.append(this.f10485c);
        sb2.append(", maxLines=");
        sb2.append(this.f10486d);
        sb2.append(", softWrap=");
        sb2.append(this.f10487e);
        sb2.append(", overflow=");
        int i10 = this.f10488f;
        if (i10 == 1) {
            str = "Clip";
        } else if (i10 == 2) {
            str = "Ellipsis";
        } else if (i10 == 5) {
            str = "MiddleEllipsis";
        } else if (i10 == 3) {
            str = "Visible";
        } else {
            str = i10 == 4 ? "StartEllipsis" : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(", density=");
        sb2.append(this.f10489g);
        sb2.append(", layoutDirection=");
        sb2.append(this.f10490h);
        sb2.append(", fontFamilyResolver=");
        sb2.append(this.f10491i);
        sb2.append(", constraints=");
        sb2.append((Object) y3.a.k(this.f10492j));
        sb2.append(')');
        return sb2.toString();
    }
}
