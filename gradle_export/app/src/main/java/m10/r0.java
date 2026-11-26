package m10;

import j10.u0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class r0 extends s0 implements j10.j0, u0 {
    public final int G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final e30.w K;
    public final r0 L;

    public r0(j10.b containingDeclaration, r0 r0Var, int i, k10.h annotations, n20.e name, e30.w outType, boolean z, boolean z2, boolean z3, e30.w wVar, j10.n0 source) {
        super(containingDeclaration, annotations, name, outType, source);
        kotlin.jvm.internal.m.e(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.m.e(annotations, "annotations");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(outType, "outType");
        kotlin.jvm.internal.m.e(source, "source");
        this.G = i;
        this.H = z;
        this.I = z2;
        this.J = z3;
        this.K = wVar;
        this.L = r0Var == null ? this : r0Var;
    }

    @Override
    public final Object G(j10.m mVar, Object obj) {
        return mVar.C(this, obj);
    }

    @Override
    public final s20.g M() {
        return null;
    }

    @Override
    public final boolean W() {
        return false;
    }

    public r0 Y0(h10.f fVar, n20.e eVar, int i) {
        k10.h annotations = getAnnotations();
        kotlin.jvm.internal.m.d(annotations, "<get-annotations>(...)");
        e30.w type = getType();
        kotlin.jvm.internal.m.d(type, "getType(...)");
        return new r0(fVar, null, i, annotations, eVar, type, Z0(), this.I, this.J, this.K, j10.n0.n);
    }

    public final boolean Z0() {
        return this.H && ((j10.c) l()).getKind() != 2;
    }

    @Override
    public final j10.b l() {
        j10.k kVarL = super.l();
        kotlin.jvm.internal.m.c(kVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (j10.b) kVarL;
    }

    @Override
    public final r0 a() {
        r0 r0Var = this.L;
        return r0Var == this ? this : r0Var.a();
    }

    @Override
    public final j10.l e(e30.u0 substitutor) {
        kotlin.jvm.internal.m.e(substitutor, "substitutor");
        if (substitutor.a.e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public final j10.o getVisibility() {
        j10.o LOCAL = j10.p.f;
        kotlin.jvm.internal.m.d(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override
    public final Collection m() {
        Collection collectionM = l().m();
        kotlin.jvm.internal.m.d(collectionM, "getOverriddenDescriptors(...)");
        Collection collection = collectionM;
        ArrayList arrayList = new ArrayList(h00.r.q0(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((r0) ((j10.b) it.next()).O().get(this.G));
        }
        return arrayList;
    }
}
