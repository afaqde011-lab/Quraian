package p30;

import a10.x;
import java.util.List;

public final class j extends a {
    public final a B;
    public final a C;
    public final boolean D;

    public j(a aVar, a aVar2, boolean z, u00.a aVar3) {
        super(aVar3);
        this.B = aVar;
        this.C = aVar2;
        this.D = z;
    }

    @Override
    public final a A() {
        return this.C;
    }

    @Override
    public final x d() {
        return null;
    }

    @Override
    public final boolean f() {
        return this.B.f();
    }

    @Override
    public final a10.d g() {
        return this.B.g();
    }

    @Override
    public final List getAnnotations() {
        return this.B.getAnnotations();
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final List r() {
        return this.B.r();
    }

    @Override
    public final a10.e s() {
        return this.B.s();
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final boolean v() {
        return this.D;
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final a x() {
        return this.B;
    }

    @Override
    public final a y(boolean z) {
        a aVarY = this.B.y(z);
        a aVarY2 = this.C.y(z);
        return aVarY.equals(aVarY2) ? aVarY : new j(aVarY, aVarY2, this.D, null);
    }

    @Override
    public final a z(boolean z) {
        a aVarZ = this.B.z(z);
        a aVarZ2 = this.C.z(z);
        return aVarZ.equals(aVarZ2) ? aVarZ : new j(aVarZ, aVarZ2, this.D, null);
    }
}
