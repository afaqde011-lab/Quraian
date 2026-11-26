package f30;

import ab.a0;
import e30.p0;
import e30.w;
import h00.x;
import j10.r0;
import java.util.Collection;
import java.util.List;

public final class i implements r20.b {
    public final p0 A;
    public u00.a B;
    public final i C;
    public final r0 D;
    public final Object E;

    public i(p0 p0Var, c30.e eVar, r0 r0Var, int i) {
        this(p0Var, (i & 2) != 0 ? null : eVar, (i) null, (i & 8) != 0 ? null : r0Var);
    }

    public i(p0 projection, u00.a aVar, i iVar, r0 r0Var) {
        kotlin.jvm.internal.m.e(projection, "projection");
        this.A = projection;
        this.B = aVar;
        this.C = iVar;
        this.D = r0Var;
        this.E = rd.a.I(g00.i.B, new eo.p(this, 2));
    }

    @Override
    public final g10.i d() {
        w wVarB = this.A.b();
        kotlin.jvm.internal.m.d(wVarB, "getType(...)");
        return a0.c0(wVarB);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        i iVar = (i) obj;
        i iVar2 = this.C;
        if (iVar2 != null) {
            this = iVar2;
        }
        i iVar3 = iVar.C;
        if (iVar3 != null) {
            obj = iVar3;
        }
        return this == obj;
    }

    @Override
    public final j10.h g() {
        return null;
    }

    @Override
    public final List getParameters() {
        return x.A;
    }

    public final int hashCode() {
        i iVar = this.C;
        return iVar != null ? iVar.hashCode() : super.hashCode();
    }

    @Override
    public final Collection l() {
        List list = (List) this.E.getValue();
        return list == null ? x.A : list;
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final p0 t() {
        return this.A;
    }

    public final String toString() {
        return "CapturedType(" + this.A + ')';
    }
}
