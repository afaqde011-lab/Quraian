package r20;

import e30.a1;
import e30.p0;
import e30.w;
import f30.i;
import h00.x;
import j10.h;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.m;

public final class c implements b {
    public final p0 A;
    public i B;

    public c(p0 projection) {
        m.e(projection, "projection");
        this.A = projection;
        projection.a();
        a1 a1Var = a1.C;
    }

    @Override
    public final g10.i d() {
        g10.i iVarD = this.A.b().m0().d();
        m.d(iVarD, "getBuiltIns(...)");
        return iVarD;
    }

    @Override
    public final h g() {
        return null;
    }

    @Override
    public final List getParameters() {
        return x.A;
    }

    @Override
    public final Collection l() {
        p0 p0Var = this.A;
        w wVarB = p0Var.a() == a1.E ? p0Var.b() : d().p();
        m.b(wVarB);
        return va.a.R(wVarB);
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
        return "CapturedTypeConstructor(" + this.A + ')';
    }
}
