package w;

import java.util.List;

public final class b extends a2 {

    public f1 f15739a;

    public final l1.i1 f15740b;

    public b(f1 f1Var, h2.c cVar) {
        this.f15739a = f1Var;
        this.f15740b = l1.q.z(cVar);
    }

    @Override
    public final a2 a(j1 j1Var, f1 f1Var, long j9, long j10, long j11) {
        long j12;
        Object obj;
        long jE = h2.b.e(j10, j11);
        p10.a aVar = new p10.a();
        aVar.A = l1.q.z(new h2.e(j9));
        aVar.B = l1.q.z(new h2.b(jE));
        aVar.C = l1.q.z(new h2.b(j11));
        aVar.D = l1.q.z(new h2.b(jE));
        h2.c cVarC = c();
        if (cVarC != null) {
            j12 = j10;
        } else {
            f1 f1Var2 = this.f15739a;
            if (f1Var2 == null) {
                List listB = j1Var.b();
                int size = listB.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        obj = null;
                        break;
                    }
                    obj = listB.get(i10);
                    if (j1Var.c().contains((k1) obj)) {
                        break;
                    }
                    i10++;
                }
                k1 k1Var = (k1) obj;
                f1Var2 = k1Var != null ? k1Var.L : null;
            }
            cVarC = c0.h(j1Var, f1Var2);
            if (cVarC == null) {
                j12 = j10;
                cVarC = bi.b.g(j12, j9);
            } else {
                j12 = j10;
            }
        }
        h2.c cVar = cVarC;
        c0.i(aVar, j9, j12, j11, true);
        return new a(aVar, f1Var, cVar);
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final h2.c c() {
        return (h2.c) this.f15740b.getValue();
    }

    @Override
    public final p10.a e() {
        return null;
    }

    @Override
    public final h2.c f(j1 j1Var) {
        Object obj;
        h2.c cVarC = c();
        if (cVarC != null) {
            return cVarC;
        }
        if (c() == null) {
            f1 f1Var = this.f15739a;
            if (f1Var == null) {
                List listB = j1Var.b();
                int size = listB.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        obj = null;
                        break;
                    }
                    obj = listB.get(i10);
                    if (j1Var.c().contains((k1) obj)) {
                        break;
                    }
                    i10++;
                }
                k1 k1Var = (k1) obj;
                f1Var = k1Var != null ? k1Var.L : null;
            }
            h2.c cVarH = c0.h(j1Var, f1Var);
            if (cVarH != null) {
                this.f15740b.setValue(cVarH);
            }
        }
        return c();
    }

    @Override
    public final a2 g(f1 f1Var) {
        if (this.f15739a == null) {
            this.f15739a = f1Var;
        }
        return this;
    }

    @Override
    public final a2 h() {
        return c1.f15743a;
    }

    @Override
    public final void i(h2.c cVar) {
        this.f15740b.setValue(cVar);
    }
}
