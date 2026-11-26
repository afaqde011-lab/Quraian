package b30;

import a30.i;
import c30.r;
import d30.l;
import i20.f0;
import i20.h0;
import i20.n0;
import i20.p0;
import j10.e0;
import j10.z;
import k20.h;
import kotlin.jvm.internal.m;
import m10.c0;
import oj.q;
import x20.n;

public final class c extends c0 implements e0 {
    public final j20.a H;
    public final h I;
    public final q J;
    public h0 K;
    public r L;

    public c(n20.c fqName, l lVar, z module, h0 h0Var, j20.a aVar) {
        super(module, fqName);
        m.e(fqName, "fqName");
        m.e(module, "module");
        this.H = aVar;
        p0 p0Var = h0Var.D;
        m.d(p0Var, "getStrings(...)");
        n0 n0Var = h0Var.E;
        m.d(n0Var, "getQualifiedNames(...)");
        h hVar = new h(p0Var, n0Var);
        this.I = hVar;
        this.J = new q(h0Var, hVar, aVar, new a30.c0(this));
        this.K = h0Var;
    }

    @Override
    public final n N() {
        r rVar = this.L;
        if (rVar != null) {
            return rVar;
        }
        m.k("_memberScope");
        throw null;
    }

    public final void Z0(i components) {
        m.e(components, "components");
        h0 h0Var = this.K;
        if (h0Var == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.K = null;
        f0 f0Var = h0Var.F;
        m.d(f0Var, "getPackage(...)");
        this.L = new r(this, f0Var, this.I, this.H, null, components, "scope of " + this, new a30.l(this, 0));
    }

    @Override
    public final String toString() {
        return "builtins package fragment for " + this.F + " from " + u20.d.j(this);
    }
}
