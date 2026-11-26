package c30;

import j10.n0;

public final class c extends m10.i implements b {
    public final i20.n f0;
    public final k20.g g0;
    public final h9.f h0;
    public final k20.j i0;
    public final k j0;

    public c(j10.e containingDeclaration, j10.j jVar, k10.h annotations, boolean z, int i, i20.n proto, k20.g nameResolver, h9.f typeTable, k20.j versionRequirementTable, k kVar, n0 n0Var) {
        super(containingDeclaration, jVar, annotations, z, i, n0Var == null ? n0.n : n0Var);
        kotlin.jvm.internal.m.e(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.m.e(annotations, "annotations");
        g4.c.q(i, "kind");
        kotlin.jvm.internal.m.e(proto, "proto");
        kotlin.jvm.internal.m.e(nameResolver, "nameResolver");
        kotlin.jvm.internal.m.e(typeTable, "typeTable");
        kotlin.jvm.internal.m.e(versionRequirementTable, "versionRequirementTable");
        this.f0 = proto;
        this.g0 = nameResolver;
        this.h0 = typeTable;
        this.i0 = versionRequirementTable;
        this.j0 = kVar;
    }

    @Override
    public final boolean I() {
        return false;
    }

    @Override
    public final h9.f L() {
        return this.h0;
    }

    @Override
    public final k20.g Q() {
        return this.g0;
    }

    @Override
    public final k R() {
        return this.j0;
    }

    @Override
    public final m10.t a1(int i, j10.k kVar, j10.u uVar, n0 n0Var, k10.h hVar, n20.e eVar) {
        return p1(kVar, uVar, i, hVar, n0Var);
    }

    @Override
    public final boolean isExternal() {
        return false;
    }

    @Override
    public final boolean isInline() {
        return false;
    }

    @Override
    public final boolean isSuspend() {
        return false;
    }

    @Override
    public final m10.i a1(int i, j10.k kVar, j10.u uVar, n0 n0Var, k10.h hVar, n20.e eVar) {
        return p1(kVar, uVar, i, hVar, n0Var);
    }

    public final c p1(j10.k newOwner, j10.u uVar, int i, k10.h annotations, n0 n0Var) {
        kotlin.jvm.internal.m.e(newOwner, "newOwner");
        g4.c.q(i, "kind");
        kotlin.jvm.internal.m.e(annotations, "annotations");
        c cVar = new c((j10.e) newOwner, (j10.j) uVar, annotations, this.e0, i, this.f0, this.g0, this.h0, this.i0, this.j0, n0Var);
        cVar.W = this.W;
        return cVar;
    }

    @Override
    public final o20.b z() {
        return this.f0;
    }
}
