package d10;

import java.util.Collection;

public final class p1 extends l1 {
    public static final int D = 0;
    public final Class B;
    public final Object C;

    public p1(Class jClass) {
        kotlin.jvm.internal.m.e(jClass, "jClass");
        this.B = jClass;
        this.C = rd.a.I(g00.i.B, new m1(this, 0));
    }

    @Override
    public final Collection A(n20.e eVar) {
        x1 x1Var = ((o1) this.C.getValue()).d;
        a10.w wVar = o1.f[1];
        Object objInvoke = x1Var.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
        return ((x20.n) objInvoke).d(eVar, r10.c.B);
    }

    @Override
    public final j10.l0 B(int i) {
        x1 x1Var = ((o1) this.C.getValue()).d;
        a10.w wVar = o1.f[1];
        Object objInvoke = x1Var.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
        x20.n nVar = (x20.n) objInvoke;
        c30.r rVar = nVar instanceof c30.r ? (c30.r) nVar : null;
        if (rVar != null) {
            a30.k kVar = rVar.b;
            i20.f0 f0Var = rVar.h;
            o20.n packageLocalVariable = l20.j.l;
            kotlin.jvm.internal.m.d(packageLocalVariable, "packageLocalVariable");
            i20.j0 j0Var = (i20.j0) w00.a.v(f0Var, packageLocalVariable, i);
            if (j0Var != null) {
                k20.g gVar = (k20.g) kVar.b;
                i20.a1 a1Var = f0Var.G;
                kotlin.jvm.internal.m.d(a1Var, "getTypeTable(...)");
                return (j10.l0) i2.e(this.B, j0Var, gVar, new h9.f(a1Var), (k20.a) kVar.f, b1.C);
            }
        }
        return null;
    }

    @Override
    public final Class C() {
        Class cls = (Class) ((o1) this.C.getValue()).e.getValue();
        return cls == null ? this.B : cls;
    }

    @Override
    public final Collection D(n20.e eVar) {
        x1 x1Var = ((o1) this.C.getValue()).d;
        a10.w wVar = o1.f[1];
        Object objInvoke = x1Var.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
        return ((x20.n) objInvoke).e(eVar, r10.c.B);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p1) {
            return kotlin.jvm.internal.m.a(this.B, ((p1) obj).B);
        }
        return false;
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    public final String toString() {
        return "file class " + p10.d.a(this.B).a();
    }

    @Override
    public final Class v() {
        return this.B;
    }

    @Override
    public final Collection z() {
        return h00.x.A;
    }
}
