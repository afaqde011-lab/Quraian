package b20;

import j10.n0;

public final class p extends m10.c0 {
    public static final a10.w[] N;
    public final p10.y H;
    public final oj.q I;
    public final d30.i J;
    public final d K;
    public final d30.c L;
    public final k10.h M;

    static {
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s(p.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0);
        kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
        N = new a10.w[]{b0Var.h(sVar), a1.b.h(p.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0, b0Var)};
    }

    public p(oj.q outerContext, p10.y yVar) {
        kotlin.jvm.internal.m.e(outerContext, "outerContext");
        a20.b bVar = (a20.b) outerContext.B;
        super(bVar.o, yVar.a);
        this.H = yVar;
        oj.q qVarR = c7.i.r(outerContext, this, (p10.o) null, 6);
        this.I = qVarR;
        bVar.d.c().c.getClass();
        k20.f fVar = k20.f.g;
        a20.b bVar2 = (a20.b) qVarR.B;
        d30.o oVar = bVar2.a;
        o oVar2 = new o(this, 0);
        d30.l lVar = (d30.l) oVar;
        lVar.getClass();
        this.J = new d30.i(lVar, oVar2);
        this.K = new d(qVarR, yVar, this);
        o oVar3 = new o(this, 1);
        d30.l lVar2 = (d30.l) oVar;
        lVar2.getClass();
        this.L = new d30.c(lVar2, oVar3);
        this.M = bVar2.v.B ? k10.g.a : ca.v.F(qVarR, yVar);
        ((d30.l) oVar).a(new o(this, 2));
    }

    @Override
    public final x20.n N() {
        return this.K;
    }

    @Override
    public final k10.h getAnnotations() {
        return this.M;
    }

    @Override
    public final n0 o() {
        return new qj.c(this, 27);
    }

    @Override
    public final String toString() {
        return "Lazy Java package fragment: " + this.F + " of module " + ((a20.b) this.I.B).o;
    }
}
