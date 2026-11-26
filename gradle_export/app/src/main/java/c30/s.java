package c30;

import i20.j0;
import j10.l0;
import j10.n0;
import j10.y;
import m10.i0;

public final class s extends i0 implements b {
    public final j0 b0;
    public final k20.g c0;
    public final h9.f d0;
    public final k20.j e0;
    public final k f0;

    public s(j10.k containingDeclaration, l0 l0Var, k10.h annotations, y modality, j10.o visibility, boolean z, n20.e name, int i, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, j0 proto, k20.g nameResolver, h9.f typeTable, k20.j versionRequirementTable, k kVar) {
        super(containingDeclaration, l0Var, annotations, modality, visibility, z, name, i, n0.n, z2, z3, z6, z4, z5);
        kotlin.jvm.internal.m.e(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.m.e(annotations, "annotations");
        kotlin.jvm.internal.m.e(modality, "modality");
        kotlin.jvm.internal.m.e(visibility, "visibility");
        kotlin.jvm.internal.m.e(name, "name");
        g4.c.q(i, "kind");
        kotlin.jvm.internal.m.e(proto, "proto");
        kotlin.jvm.internal.m.e(nameResolver, "nameResolver");
        kotlin.jvm.internal.m.e(typeTable, "typeTable");
        kotlin.jvm.internal.m.e(versionRequirementTable, "versionRequirementTable");
        this.b0 = proto;
        this.c0 = nameResolver;
        this.d0 = typeTable;
        this.e0 = versionRequirementTable;
        this.f0 = kVar;
    }

    @Override
    public final h9.f L() {
        return this.d0;
    }

    @Override
    public final k20.g Q() {
        return this.c0;
    }

    @Override
    public final k R() {
        return this.f0;
    }

    @Override
    public final i0 a1(j10.k newOwner, y newModality, j10.o newVisibility, l0 l0Var, int i, n20.e newName) {
        kotlin.jvm.internal.m.e(newOwner, "newOwner");
        kotlin.jvm.internal.m.e(newModality, "newModality");
        kotlin.jvm.internal.m.e(newVisibility, "newVisibility");
        g4.c.q(i, "kind");
        kotlin.jvm.internal.m.e(newName, "newName");
        return new s(newOwner, l0Var, getAnnotations(), newModality, newVisibility, this.G, newName, i, this.O, this.P, isExternal(), this.S, this.Q, this.b0, this.c0, this.d0, this.e0, this.f0);
    }

    @Override
    public final boolean isExternal() {
        return k20.e.E.e(this.b0.D).booleanValue();
    }

    @Override
    public final o20.b z() {
        return this.b0;
    }
}
