package x;

import l1.p2;

public final class m1 implements p2 {
    public final r1 A;
    public final l1.i1 B;
    public final l1.i1 C;
    public final l1.i1 D;
    public r0 E;
    public h1 F;
    public final l1.i1 G;
    public final l1.e1 H;
    public boolean I;
    public final l1.i1 J;
    public o K;
    public final l1.g1 L;
    public boolean M;
    public final b1 N;
    public final n1 O;

    public m1(n1 n1Var, Object obj, o oVar, r1 r1Var) {
        this.O = n1Var;
        this.A = r1Var;
        l1.i1 i1VarZ = l1.q.z(obj);
        this.B = i1VarZ;
        Object objInvoke = null;
        l1.i1 i1VarZ2 = l1.q.z(c.v(0.0f, 0.0f, null, 7));
        this.C = i1VarZ2;
        this.D = l1.q.z(new h1((y) i1VarZ2.getValue(), r1Var, obj, i1VarZ.getValue(), oVar));
        this.G = l1.q.z(Boolean.TRUE);
        this.H = new l1.e1(-1.0f);
        this.J = l1.q.z(obj);
        this.K = oVar;
        this.L = new l1.g1(a().b());
        Float f3 = (Float) z1.f16391b.get(r1Var);
        if (f3 != null) {
            float fFloatValue = f3.floatValue();
            o oVar2 = (o) r1Var.f16363a.invoke(obj);
            int iB = oVar2.b();
            for (int i10 = 0; i10 < iB; i10++) {
                oVar2.e(fFloatValue, i10);
            }
            objInvoke = this.A.f16364b.invoke(oVar2);
        }
        this.N = c.v(0.0f, 0.0f, objInvoke, 3);
    }

    public final h1 a() {
        return (h1) this.D.getValue();
    }

    public final void c(long j9) {
        if (this.H.h() == -1.0f) {
            this.M = true;
            if (kotlin.jvm.internal.m.a(a().f16295c, a().f16296d)) {
                e(a().f16295c);
            } else {
                e(a().f(j9));
                this.K = a().d(j9);
            }
        }
    }

    public final void e(Object obj) {
        this.J.setValue(obj);
    }

    public final void f(Object obj, boolean z10) {
        h1 h1Var = this.F;
        Object obj2 = h1Var != null ? h1Var.f16295c : null;
        l1.i1 i1Var = this.B;
        boolean zA = kotlin.jvm.internal.m.a(obj2, i1Var.getValue());
        l1.g1 g1Var = this.L;
        l1.i1 i1Var2 = this.D;
        y yVar = this.N;
        if (zA) {
            i1Var2.setValue(new h1(yVar, this.A, obj, obj, this.K.c()));
            this.I = true;
            g1Var.i(a().b());
            return;
        }
        l1.i1 i1Var3 = this.C;
        if (!z10 || this.M || (((y) i1Var3.getValue()) instanceof b1)) {
            yVar = (y) i1Var3.getValue();
        }
        n1 n1Var = this.O;
        long jE = n1Var.e();
        l1.i1 i1Var4 = n1Var.f16330h;
        i1Var2.setValue(new h1(jE <= 0 ? yVar : new c1(yVar, n1Var.e()), this.A, obj, i1Var.getValue(), this.K));
        g1Var.i(a().b());
        this.I = false;
        i1Var4.setValue(Boolean.TRUE);
        if (n1Var.g()) {
            z1.p pVar = n1Var.f16331i;
            int size = pVar.size();
            long jMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                m1 m1Var = (m1) pVar.get(i10);
                jMax = Math.max(jMax, m1Var.L.h());
                m1Var.c(0L);
            }
            i1Var4.setValue(Boolean.FALSE);
        }
    }

    public final void g(Object obj, Object obj2, y yVar) {
        this.B.setValue(obj2);
        this.C.setValue(yVar);
        if (kotlin.jvm.internal.m.a(a().f16296d, obj) && kotlin.jvm.internal.m.a(a().f16295c, obj2)) {
            return;
        }
        f(obj, false);
    }

    @Override
    public final Object getValue() {
        return this.J.getValue();
    }

    public final void h(Object obj, y yVar) {
        if (this.I) {
            h1 h1Var = this.F;
            if (kotlin.jvm.internal.m.a(obj, h1Var != null ? h1Var.f16295c : null)) {
                return;
            }
        }
        l1.i1 i1Var = this.B;
        boolean zA = kotlin.jvm.internal.m.a(i1Var.getValue(), obj);
        l1.e1 e1Var = this.H;
        if (zA && e1Var.h() == -1.0f) {
            return;
        }
        i1Var.setValue(obj);
        this.C.setValue(yVar);
        Object value = e1Var.h() == -3.0f ? obj : this.J.getValue();
        l1.i1 i1Var2 = this.G;
        f(value, !((Boolean) i1Var2.getValue()).booleanValue());
        i1Var2.setValue(Boolean.valueOf(e1Var.h() == -3.0f));
        if (e1Var.h() >= 0.0f) {
            e(a().f((long) (e1Var.h() * a().b())));
        } else if (e1Var.h() == -3.0f) {
            e(obj);
        }
        this.I = false;
        e1Var.i(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.J.getValue() + ", target: " + this.B.getValue() + ", spec: " + ((y) this.C.getValue());
    }
}
