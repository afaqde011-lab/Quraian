package j10;

import java.util.List;

public final class d implements r0 {
    public final r0 A;
    public final i B;
    public final int C;

    public d(r0 r0Var, i iVar, int i) {
        this.A = r0Var;
        this.B = iVar;
        this.C = i;
    }

    @Override
    public final boolean A() {
        return this.A.A();
    }

    @Override
    public final e30.a1 F() {
        e30.a1 a1VarF = this.A.F();
        kotlin.jvm.internal.m.d(a1VarF, "getVariance(...)");
        return a1VarF;
    }

    @Override
    public final Object G(m mVar, Object obj) {
        return this.A.G(mVar, obj);
    }

    @Override
    public final d30.o U() {
        d30.o oVarU = this.A.U();
        kotlin.jvm.internal.m.d(oVarU, "getStorageManager(...)");
        return oVarU;
    }

    @Override
    public final boolean Z() {
        return true;
    }

    @Override
    public final h a() {
        return this.A.a();
    }

    @Override
    public final k a() {
        return this.A.a();
    }

    @Override
    public final r0 a() {
        return this.A.a();
    }

    @Override
    public final e30.m0 f() {
        e30.m0 m0VarF = this.A.f();
        kotlin.jvm.internal.m.d(m0VarF, "getTypeConstructor(...)");
        return m0VarF;
    }

    @Override
    public final k10.h getAnnotations() {
        return this.A.getAnnotations();
    }

    @Override
    public final int getIndex() {
        return this.A.getIndex() + this.C;
    }

    @Override
    public final n20.e getName() {
        n20.e name = this.A.getName();
        kotlin.jvm.internal.m.d(name, "getName(...)");
        return name;
    }

    @Override
    public final List getUpperBounds() {
        List upperBounds = this.A.getUpperBounds();
        kotlin.jvm.internal.m.d(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    @Override
    public final k l() {
        return this.B;
    }

    @Override
    public final e30.a0 n() {
        e30.a0 a0VarN = this.A.n();
        kotlin.jvm.internal.m.d(a0VarN, "getDefaultType(...)");
        return a0VarN;
    }

    @Override
    public final n0 o() {
        n0 n0VarO = this.A.o();
        kotlin.jvm.internal.m.d(n0VarO, "getSource(...)");
        return n0VarO;
    }

    public final String toString() {
        return this.A + "[inner-copy]";
    }
}
