package w;

import java.util.ArrayList;
import java.util.List;

public final class j1 {

    public final String f15780a;

    public final u1 f15781b;

    public final ba.v0 f15782c = new ba.v0(this);

    public final l1.i1 f15783d;

    public final l1.i1 f15784e;

    public final x.b f15785f;

    public boolean f15786g;

    public final i1 f15787h;

    public final i1 f15788i;

    public j1(String str, u1 u1Var) {
        this.f15780a = str;
        this.f15781b = u1Var;
        h00.x xVar = h00.x.A;
        this.f15783d = l1.q.z(xVar);
        this.f15784e = l1.q.z(xVar);
        this.f15785f = new x.b(new h2.b(0L), x.c.f16261p, null, 12);
        this.f15787h = new i1(this, 0);
        this.f15788i = new i1(this, 1);
    }

    public final boolean a() {
        ba.v0 v0Var = this.f15782c;
        return v0Var.d().b() || v0Var.d().d() || ((f2) v0Var.f2437a) == f2.B;
    }

    public final List b() {
        return (List) this.f15783d.getValue();
    }

    public final List c() {
        return (List) this.f15784e.getValue();
    }

    public final boolean d() {
        List listC = c();
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            x.n1 n1Var = ((k1) listC.get(i10)).a().f15759b;
            while (true) {
                x.n1 n1Var2 = n1Var.f16324b;
                if (n1Var2 == null) {
                    break;
                }
                n1Var = n1Var2;
            }
            if (!kotlin.jvm.internal.m.a(n1Var.f16323a.J0(), n1Var.f16326d.getValue())) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        this.f15781b.getClass();
        List listB = b();
        ArrayList arrayList = new ArrayList();
        int size = listB.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            k1 k1Var = (k1) listB.get(i10);
            if (k1Var.h()) {
                arrayList.add(k1Var);
                if (k1Var.a().b()) {
                    z10 = true;
                }
            }
        }
        this.f15784e.setValue(arrayList);
        ba.v0 v0Var = this.f15782c;
        j1 j1Var = (j1) v0Var.f2440d;
        l1.f1 f1Var = (l1.f1) v0Var.f2442f;
        if (j1Var.c().size() > 1 && z10) {
            v0Var.f2437a = f2.B;
            f1Var.i(v0Var.f2438b + 1);
        } else if (!j1Var.f15781b.b()) {
            v0Var.f2437a = f2.A;
            v0Var.f2438b = f1Var.h();
            ((l1.i1) v0Var.f2441e).setValue(c1.f15743a);
        } else if (!z10) {
            v0Var.f2437a = f2.C;
            f1Var.i(v0Var.f2438b + 1);
        }
        v0Var.f();
    }
}
