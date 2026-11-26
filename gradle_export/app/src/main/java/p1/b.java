package p1;

import a1.c1;
import java.util.ArrayList;

public final class b {

    public final l1.g0 f12246a;

    public a f12247b;

    public boolean f12248c;

    public int f12251f;

    public int f12252g;
    public int l;

    public final c1 f12249d = new c1(2, false);

    public boolean f12250e = true;

    public final ArrayList f12253h = new ArrayList();

    public int f12254i = -1;

    public int f12255j = -1;

    public int f12256k = -1;

    public b(l1.g0 g0Var, a aVar) {
        this.f12246a = g0Var;
        this.f12247b = aVar;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.f12253h;
        if (l1.q.x(arrayList)) {
            l1.q.A(arrayList);
        } else {
            this.f12252g++;
        }
    }

    public final void b() {
        int i10 = this.f12252g;
        if (i10 > 0) {
            l0 l0Var = this.f12247b.f12244a;
            l0Var.m0(i0.f12272d);
            l0Var.f12279c[l0Var.f12280d - l0Var.f12277a[l0Var.f12278b - 1].b] = i10;
            this.f12252g = 0;
        }
        ArrayList arrayList = this.f12253h;
        if (l1.q.x(arrayList)) {
            a aVar = this.f12247b;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i11 = 0; i11 < size; i11++) {
                objArr[i11] = arrayList.get(i11);
            }
            aVar.getClass();
            if (size != 0) {
                l0 l0Var2 = aVar.f12244a;
                l0Var2.m0(k.f12275d);
                kh.n.Z(l0Var2, 0, objArr);
            }
            arrayList.clear();
        }
    }

    public final void c() {
        int i10 = this.l;
        if (i10 > 0) {
            int i11 = this.f12254i;
            if (i11 >= 0) {
                b();
                l0 l0Var = this.f12247b.f12244a;
                l0Var.m0(a0.f12245d);
                int i12 = l0Var.f12280d - l0Var.f12277a[l0Var.f12278b - 1].b;
                int[] iArr = l0Var.f12279c;
                iArr[i12] = i11;
                iArr[i12 + 1] = i10;
                this.f12254i = -1;
            } else {
                int i13 = this.f12256k;
                int i14 = this.f12255j;
                b();
                l0 l0Var2 = this.f12247b.f12244a;
                l0Var2.m0(v.f12296d);
                int i15 = l0Var2.f12280d - l0Var2.f12277a[l0Var2.f12278b - 1].b;
                int[] iArr2 = l0Var2.f12279c;
                iArr2[i15 + 1] = i13;
                iArr2[i15] = i14;
                iArr2[i15 + 2] = i10;
                this.f12255j = -1;
                this.f12256k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z10) {
        l1.g0 g0Var = this.f12246a;
        int i10 = z10 ? g0Var.G.f11486i : g0Var.G.f11484g;
        int i11 = i10 - this.f12251f;
        if (i11 < 0) {
            l1.l.a("Tried to seek backward");
        }
        if (i11 > 0) {
            l0 l0Var = this.f12247b.f12244a;
            l0Var.m0(d.f12261d);
            l0Var.f12279c[l0Var.f12280d - l0Var.f12277a[l0Var.f12278b - 1].b] = i11;
            this.f12251f = i10;
        }
    }

    public final void e() {
        o1.g gVar = this.f12246a.G;
        if (gVar.f11480c > 0) {
            int i10 = gVar.f11486i;
            c1 c1Var = this.f12249d;
            if (c1Var.c(-2) != i10) {
                if (!this.f12248c && this.f12250e) {
                    d(false);
                    this.f12247b.f12244a.m0(q.f12287d);
                    this.f12248c = true;
                }
                if (i10 > 0) {
                    o1.b bVarA = gVar.a(i10);
                    c1Var.e(i10);
                    d(false);
                    l0 l0Var = this.f12247b.f12244a;
                    l0Var.m0(p.f12286d);
                    kh.n.Z(l0Var, 0, bVarA);
                    this.f12248c = true;
                }
            }
        }
    }

    public final void f(int i10, int i11) {
        if (i11 > 0) {
            if (!(i10 >= 0)) {
                l1.l.a("Invalid remove index " + i10);
            }
            if (this.f12254i == i10) {
                this.l += i11;
                return;
            }
            c();
            this.f12254i = i10;
            this.l = i11;
        }
    }
}
