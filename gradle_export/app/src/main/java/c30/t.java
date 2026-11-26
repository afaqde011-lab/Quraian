package c30;

import i20.b0;
import j10.n0;
import m10.l0;

public final class t extends l0 implements b {
    public final b0 e0;
    public final k20.g f0;
    public final h9.f g0;
    public final k20.j h0;
    public final k i0;

    public t(j10.k containingDeclaration, l0 l0Var, k10.h annotations, n20.e eVar, int i, b0 proto, k20.g nameResolver, h9.f typeTable, k20.j versionRequirementTable, k kVar, n0 n0Var) {
        super(containingDeclaration, l0Var, annotations, eVar, i, n0Var == null ? n0.n : n0Var);
        kotlin.jvm.internal.m.e(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.m.e(annotations, "annotations");
        g4.c.q(i, "kind");
        kotlin.jvm.internal.m.e(proto, "proto");
        kotlin.jvm.internal.m.e(nameResolver, "nameResolver");
        kotlin.jvm.internal.m.e(typeTable, "typeTable");
        kotlin.jvm.internal.m.e(versionRequirementTable, "versionRequirementTable");
        this.e0 = proto;
        this.f0 = nameResolver;
        this.g0 = typeTable;
        this.h0 = versionRequirementTable;
        this.i0 = kVar;
    }

    @Override
    public final h9.f L() {
        return this.g0;
    }

    @Override
    public final k20.g Q() {
        return this.f0;
    }

    @Override
    public final k R() {
        return this.i0;
    }

    @Override
    public final m10.t a1(int i, j10.k newOwner, j10.u uVar, n0 n0Var, k10.h annotations, n20.e eVar) {
        n20.e eVar2;
        kotlin.jvm.internal.m.e(newOwner, "newOwner");
        g4.c.q(i, "kind");
        kotlin.jvm.internal.m.e(annotations, "annotations");
        l0 l0Var = (l0) uVar;
        if (eVar == null) {
            n20.e name = getName();
            kotlin.jvm.internal.m.d(name, "getName(...)");
            eVar2 = name;
        } else {
            eVar2 = eVar;
        }
        t tVar = new t(newOwner, l0Var, annotations, eVar2, i, this.e0, this.f0, this.g0, this.h0, this.i0, n0Var);
        tVar.W = this.W;
        return tVar;
    }

    @Override
    public final o20.b z() {
        return this.e0;
    }
}
