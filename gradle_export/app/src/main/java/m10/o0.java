package m10;

import e30.u0;

public final class o0 extends t implements n0 {
    public static final d0 h0;
    public final d30.o e0;
    public final j10.q0 f0;
    public i g0;

    static {
        kotlin.jvm.internal.a0.a.h(new kotlin.jvm.internal.s(o0.class, "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;", 0));
        h0 = new d0();
    }

    public o0(d30.o oVar, j10.q0 q0Var, i iVar, n0 n0Var, k10.h hVar, int i, j10.n0 n0Var2) {
        super(i, q0Var, n0Var, n0Var2, hVar, n20.g.e);
        this.e0 = oVar;
        this.f0 = q0Var;
        a20.a aVar = new a20.a(this, iVar, 28);
        d30.l lVar = (d30.l) oVar;
        lVar.getClass();
        new d30.h(lVar, aVar);
        this.g0 = iVar;
    }

    @Override
    public final t a1(int i, j10.k newOwner, j10.u uVar, j10.n0 n0Var, k10.h annotations, n20.e eVar) {
        kotlin.jvm.internal.m.e(newOwner, "newOwner");
        g4.c.q(i, "kind");
        kotlin.jvm.internal.m.e(annotations, "annotations");
        if (i != 1) {
        }
        return new o0(this.e0, this.f0, this.g0, this, annotations, 1, n0Var);
    }

    @Override
    public final e30.w getReturnType() {
        e30.w wVar = this.H;
        kotlin.jvm.internal.m.b(wVar);
        return wVar;
    }

    @Override
    public final n0 a() {
        j10.u uVarA = super.a();
        kotlin.jvm.internal.m.c(uVarA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (n0) uVarA;
    }

    @Override
    public final o0 e(u0 substitutor) {
        kotlin.jvm.internal.m.e(substitutor, "substitutor");
        j10.u uVarE = super.e(substitutor);
        kotlin.jvm.internal.m.c(uVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        o0 o0Var = (o0) uVarE;
        e30.w wVar = o0Var.H;
        kotlin.jvm.internal.m.b(wVar);
        i iVarE = this.g0.X0().e(u0.d(wVar));
        if (iVarE == null) {
            return null;
        }
        o0Var.g0 = iVarE;
        return o0Var;
    }

    @Override
    public final j10.i l() {
        return this.f0;
    }

    @Override
    public final j10.k l() {
        return this.f0;
    }

    @Override
    public final j10.c r(j10.e newOwner, j10.y yVar, j10.o visibility) {
        kotlin.jvm.internal.m.e(newOwner, "newOwner");
        kotlin.jvm.internal.m.e(visibility, "visibility");
        g4.c.q(2, "kind");
        s sVarE1 = e1(u0.b);
        sVarE1.B = newOwner;
        sVarE1.C = yVar;
        sVarE1.D = visibility;
        sVarE1.F = 2;
        sVarE1.M = false;
        j10.n nVarB1 = sVarE1.X.b1(sVarE1);
        kotlin.jvm.internal.m.c(nVarB1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (n0) nVarB1;
    }

    @Override
    public final boolean w() {
        return this.g0.e0;
    }

    @Override
    public final j10.e x() {
        j10.e eVarX = this.g0.x();
        kotlin.jvm.internal.m.d(eVarX, "getConstructedClass(...)");
        return eVarX;
    }
}
