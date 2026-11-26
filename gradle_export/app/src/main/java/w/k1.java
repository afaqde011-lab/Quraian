package w;

import java.util.ListIterator;

public final class k1 implements l1.y1 {
    public final l1.i1 A = l1.q.z(Boolean.FALSE);
    public final l1.e1 B = new l1.e1(0.0f);
    public final l1.i1 C;
    public final l1.i1 D;
    public final l1.i1 E;
    public final l1.i1 F;
    public final l1.i1 G;
    public final l1.i1 H;
    public final l1.i1 I;
    public i2.g J;
    public k1 K;
    public f1 L;
    public final l1.i1 M;

    public k1(j1 j1Var, g0 g0Var, n1 n1Var, r1 r1Var) {
        Boolean bool = Boolean.TRUE;
        this.C = l1.q.z(bool);
        this.D = l1.q.z(j1Var);
        this.E = l1.q.z(g0Var);
        this.F = l1.q.z(o1.f15799b);
        this.G = l1.q.z(bool);
        this.H = l1.q.z(n1Var);
        this.I = l1.q.z(r1Var);
        this.M = l1.q.z(null);
    }

    public final g0 a() {
        return (g0) this.E.getValue();
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c() {
        u1 u1Var = e().f15781b;
        u1Var.getClass();
        j1 j1VarE = e();
        j1VarE.f15783d.setValue(h00.q.V0(j1VarE.b(), this));
        j1VarE.f15784e.setValue(h00.q.V0(j1VarE.c(), this));
        j1VarE.e();
        u1Var.f();
        u1Var.G.remove(this);
        if (j1VarE.b().isEmpty()) {
            a40.c0.y(j1VarE.f15781b.B, (k00.i) null, (a40.a0) null, new lu.w(j1VarE, this, (k00.c) null, 19), 3);
        }
        e().f15782c.f();
    }

    @Override
    public final void d() {
        u1 u1Var = e().f15781b;
        u1Var.getClass();
        j1 j1VarE = e();
        j1VarE.f15783d.setValue(h00.q.Z0(this, j1VarE.b()));
        j1VarE.e();
        u1Var.f();
        z1.p pVar = u1Var.G;
        ListIterator listIterator = pVar.listIterator();
        int i10 = 0;
        while (true) {
            b3.q qVar = (b3.q) listIterator;
            if (!qVar.hasNext()) {
                i10 = -1;
                break;
            }
            k1 k1Var = (k1) qVar.next();
            if (!(k1Var instanceof k1)) {
                k1Var = null;
            }
            if (kotlin.jvm.internal.m.a(k1Var != null ? k1Var.e() : null, e())) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == pVar.size() - 1 || i10 == -1) {
            pVar.add(this);
        } else {
            pVar.add(i10 + 1, this);
        }
        e().f15782c.f();
    }

    public final j1 e() {
        return (j1) this.D.getValue();
    }

    public final boolean f() {
        if (a().b()) {
            return true;
        }
        return (e().f15782c.d().d() && !e().f15782c.d().b()) || !((Boolean) this.G.getValue()).booleanValue();
    }

    public final boolean g() {
        return f() && e().f15782c.d().d() && h() && ((Boolean) this.C.getValue()).booleanValue() && e().f15781b.b();
    }

    public final boolean h() {
        r1 r1Var = (r1) this.I.getValue();
        if (!((Boolean) this.A.getValue()).booleanValue()) {
            return false;
        }
        ((m1) r1Var.f15804b.getValue()).getClass();
        return true;
    }
}
