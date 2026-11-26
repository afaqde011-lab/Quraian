package p30;

import a10.x;
import java.util.List;

public final class r extends a {
    public final a10.e B;
    public final List C;
    public final boolean D;
    public final List E;
    public final x F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final a10.d J;

    public r(a10.e classifier, List arguments, boolean z, List annotations, x xVar, boolean z2, boolean z3, boolean z4, a10.d dVar, u00.a aVar) {
        super(aVar);
        kotlin.jvm.internal.m.e(classifier, "classifier");
        kotlin.jvm.internal.m.e(arguments, "arguments");
        kotlin.jvm.internal.m.e(annotations, "annotations");
        this.B = classifier;
        this.C = arguments;
        this.D = z;
        this.E = annotations;
        this.F = xVar;
        this.G = z2;
        this.H = z3;
        this.I = z4;
        this.J = dVar;
    }

    @Override
    public final a A() {
        return null;
    }

    @Override
    public final x d() {
        return this.F;
    }

    @Override
    public final boolean f() {
        return this.D;
    }

    @Override
    public final a10.d g() {
        return this.J;
    }

    @Override
    public final List getAnnotations() {
        return this.E;
    }

    @Override
    public final boolean o() {
        return this.G;
    }

    @Override
    public final List r() {
        return this.C;
    }

    @Override
    public final a10.e s() {
        return this.B;
    }

    @Override
    public final boolean t() {
        return this.H;
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final boolean w() {
        return this.I;
    }

    @Override
    public final a x() {
        return null;
    }

    @Override
    public final a y(boolean z) {
        return new r(this.B, this.C, this.D && !z, this.E, this.F, z, this.H, this.I, this.J, null);
    }

    @Override
    public final a z(boolean z) {
        return new r(this.B, this.C, z, this.E, this.F, false, this.H, this.I, this.J, null);
    }
}
