package p30;

import a10.x;
import a40.b0;
import java.util.List;

public final class c extends a implements h30.d {
    public final x B;
    public final d C;
    public final boolean D;

    public c(x xVar, d typeConstructor, boolean z) {
        super(b.A);
        kotlin.jvm.internal.m.e(typeConstructor, "typeConstructor");
        this.B = xVar;
        this.C = typeConstructor;
        this.D = z;
    }

    @Override
    public final a A() {
        return null;
    }

    @Override
    public final x d() {
        return null;
    }

    @Override
    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.m.a(this.B, cVar.B) && kotlin.jvm.internal.m.a(this.C, cVar.C) && this.D == cVar.D;
    }

    @Override
    public final boolean f() {
        return this.D;
    }

    @Override
    public final a10.d g() {
        return null;
    }

    @Override
    public final List getAnnotations() {
        return h00.x.A;
    }

    @Override
    public final int hashCode() {
        x xVar = this.B;
        int iHashCode = xVar != null ? xVar.hashCode() : 0;
        return Boolean.hashCode(this.D) + ((this.C.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final List r() {
        return h00.x.A;
    }

    @Override
    public final a10.e s() {
        return null;
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final String toString() {
        return this.C.toString();
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final a x() {
        return null;
    }

    @Override
    public final a y(boolean z) {
        if (!z) {
            return this;
        }
        throw new b0("Definitely not null captured type is not supported yet: " + this);
    }

    @Override
    public final a z(boolean z) {
        return z == this.D ? this : new c(this.B, this.C, z);
    }
}
