package x;

public final class s implements e {

    public final w1 f16365a;

    public final r1 f16366b;

    public final Object f16367c;

    public final o f16368d;

    public final o f16369e;

    public final o f16370f;

    public final Object f16371g;

    public final long f16372h;

    public s(t tVar, r1 r1Var, Object obj, o oVar) {
        w1 w1Var = new w1(tVar.f16373a);
        this.f16365a = w1Var;
        this.f16366b = r1Var;
        this.f16367c = obj;
        o oVar2 = (o) r1Var.f16363a.invoke(obj);
        this.f16368d = oVar2;
        this.f16369e = c.k(oVar);
        u00.k kVar = r1Var.f16364b;
        if (w1Var.f16382d == null) {
            w1Var.f16382d = oVar2.c();
        }
        o oVar3 = w1Var.f16382d;
        if (oVar3 == null) {
            kotlin.jvm.internal.m.k("targetVector");
            throw null;
        }
        int iB = oVar3.b();
        for (int i10 = 0; i10 < iB; i10++) {
            o oVar4 = w1Var.f16382d;
            if (oVar4 == null) {
                kotlin.jvm.internal.m.k("targetVector");
                throw null;
            }
            oVar4.e(w1Var.f16379a.j(oVar2.a(i10), oVar.a(i10)), i10);
        }
        o oVar5 = w1Var.f16382d;
        if (oVar5 == null) {
            kotlin.jvm.internal.m.k("targetVector");
            throw null;
        }
        this.f16371g = kVar.invoke(oVar5);
        if (w1Var.f16381c == null) {
            w1Var.f16381c = oVar2.c();
        }
        o oVar6 = w1Var.f16381c;
        if (oVar6 == null) {
            kotlin.jvm.internal.m.k("velocityVector");
            throw null;
        }
        int iB2 = oVar6.b();
        long jMax = 0;
        for (int i11 = 0; i11 < iB2; i11++) {
            oVar2.getClass();
            jMax = Math.max(jMax, w1Var.f16379a.h(oVar.a(i11)));
        }
        this.f16372h = jMax;
        o oVarK = c.k(this.f16365a.a(jMax, this.f16368d, oVar));
        this.f16370f = oVarK;
        int iB3 = oVarK.b();
        for (int i12 = 0; i12 < iB3; i12++) {
            o oVar7 = this.f16370f;
            float fA = oVar7.a(i12);
            float f3 = this.f16365a.f16383e;
            oVar7.e(ab.a0.x(fA, -f3, f3), i12);
        }
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final long b() {
        return this.f16372h;
    }

    @Override
    public final r1 c() {
        return this.f16366b;
    }

    @Override
    public final o d(long j9) {
        if (e(j9)) {
            return this.f16370f;
        }
        return this.f16365a.a(j9, this.f16368d, this.f16369e);
    }

    @Override
    public final Object f(long j9) {
        if (e(j9)) {
            return this.f16371g;
        }
        u00.k kVar = this.f16366b.f16364b;
        w1 w1Var = this.f16365a;
        o oVar = w1Var.f16380b;
        o oVar2 = this.f16368d;
        if (oVar == null) {
            w1Var.f16380b = oVar2.c();
        }
        o oVar3 = w1Var.f16380b;
        if (oVar3 == null) {
            kotlin.jvm.internal.m.k("valueVector");
            throw null;
        }
        int iB = oVar3.b();
        for (int i10 = 0; i10 < iB; i10++) {
            o oVar4 = w1Var.f16380b;
            if (oVar4 == null) {
                kotlin.jvm.internal.m.k("valueVector");
                throw null;
            }
            oVar4.e(w1Var.f16379a.e(oVar2.a(i10), this.f16369e.a(i10), j9), i10);
        }
        o oVar5 = w1Var.f16380b;
        if (oVar5 != null) {
            return kVar.invoke(oVar5);
        }
        kotlin.jvm.internal.m.k("valueVector");
        throw null;
    }

    @Override
    public final Object g() {
        return this.f16371g;
    }
}
