package c30;

import e30.a0;
import e30.a1;
import e30.h0;
import e30.m0;
import e30.u0;
import e30.x0;
import i20.w0;
import java.util.List;

public final class u extends m10.f implements l {
    public final w0 J;
    public final k20.g K;
    public final h9.f L;
    public final k20.j M;
    public final k N;
    public a0 O;
    public a0 P;
    public List Q;
    public a0 R;

    public u(d30.o storageManager, j10.k containingDeclaration, k10.h hVar, n20.e eVar, j10.o visibility, w0 proto, k20.g nameResolver, h9.f typeTable, k20.j versionRequirementTable, k kVar) {
        super(storageManager, containingDeclaration, hVar, eVar, visibility);
        kotlin.jvm.internal.m.e(storageManager, "storageManager");
        kotlin.jvm.internal.m.e(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.m.e(visibility, "visibility");
        kotlin.jvm.internal.m.e(proto, "proto");
        kotlin.jvm.internal.m.e(nameResolver, "nameResolver");
        kotlin.jvm.internal.m.e(typeTable, "typeTable");
        kotlin.jvm.internal.m.e(versionRequirementTable, "versionRequirementTable");
        this.J = proto;
        this.K = nameResolver;
        this.L = typeTable;
        this.M = versionRequirementTable;
        this.N = kVar;
    }

    @Override
    public final h9.f L() {
        return this.L;
    }

    @Override
    public final k20.g Q() {
        return this.K;
    }

    @Override
    public final k R() {
        return this.N;
    }

    public final j10.e Y0() {
        if (e30.c.k(Z0())) {
            return null;
        }
        j10.h hVarG = Z0().m0().g();
        if (hVarG instanceof j10.e) {
            return (j10.e) hVarG;
        }
        return null;
    }

    public final a0 Z0() {
        a0 a0Var = this.P;
        if (a0Var != null) {
            return a0Var;
        }
        kotlin.jvm.internal.m.k("expandedType");
        throw null;
    }

    public final a0 a1() {
        a0 a0Var = this.O;
        if (a0Var != null) {
            return a0Var;
        }
        kotlin.jvm.internal.m.k("underlyingType");
        throw null;
    }

    public final void b1(List list, a0 underlyingType, a0 expandedType) {
        x20.n nVarO0;
        a0 a0VarW;
        kotlin.jvm.internal.m.e(underlyingType, "underlyingType");
        kotlin.jvm.internal.m.e(expandedType, "expandedType");
        this.H = list;
        this.O = underlyingType;
        this.P = expandedType;
        this.Q = j10.w.c(this);
        j10.e eVarY0 = Y0();
        if (eVarY0 == null || (nVarO0 = eVarY0.o0()) == null) {
            nVarO0 = x20.m.b;
        }
        x20.n nVar = nVarO0;
        m10.d dVar = new m10.d();
        g30.i iVar = x0.a;
        if (g30.l.f(this)) {
            a0VarW = g30.l.c(g30.k.K, toString());
        } else {
            m0 m0VarF = f();
            if (m0VarF == null) {
                x0.a(12);
                throw null;
            }
            List listD = x0.d(((m10.e) m0VarF).getParameters());
            h0.B.getClass();
            a0VarW = e30.c.w(h0.C, m0VarF, listD, false, nVar, dVar);
        }
        this.R = a0VarW;
    }

    @Override
    public final j10.l e(u0 substitutor) {
        kotlin.jvm.internal.m.e(substitutor, "substitutor");
        if (substitutor.a.e()) {
            return this;
        }
        j10.k kVarL = l();
        kotlin.jvm.internal.m.d(kVarL, "getContainingDeclaration(...)");
        k10.h annotations = getAnnotations();
        kotlin.jvm.internal.m.d(annotations, "<get-annotations>(...)");
        n20.e name = getName();
        kotlin.jvm.internal.m.d(name, "getName(...)");
        u uVar = new u(this.F, kVarL, annotations, name, this.G, this.J, this.K, this.L, this.M, this.N);
        List listP = p();
        a0 a0VarA1 = a1();
        a1 a1Var = a1.C;
        uVar.b1(listP, e30.c.b(substitutor.g(a0VarA1, a1Var)), e30.c.b(substitutor.g(Z0(), a1Var)));
        return uVar;
    }

    @Override
    public final a0 n() {
        a0 a0Var = this.R;
        if (a0Var != null) {
            return a0Var;
        }
        kotlin.jvm.internal.m.k("defaultTypeImpl");
        throw null;
    }

    @Override
    public final o20.b z() {
        return this.J;
    }
}
