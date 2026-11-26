package p30;

import d10.s1;
import java.util.Collection;
import java.util.List;

public final class m implements a10.d, s1, h30.l {
    public final a10.d A;
    public final String B;
    public final List C;
    public final List D;

    public m(a10.d klass, String qualifiedName, u00.k kVar, u00.k kVar2) {
        kotlin.jvm.internal.m.e(klass, "klass");
        kotlin.jvm.internal.m.e(qualifiedName, "qualifiedName");
        this.A = klass;
        this.B = qualifiedName;
        this.C = (List) kVar.invoke(this);
        this.D = (List) kVar2.invoke(this);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return kotlin.jvm.internal.m.a(this.A, ((m) obj).A);
        }
        return false;
    }

    @Override
    public final List getTypeParameters() {
        return this.C;
    }

    @Override
    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override
    public final Collection i() {
        return this.A.i();
    }

    @Override
    public final boolean j() {
        return this.A.j();
    }

    @Override
    public final boolean k() {
        return this.A.k();
    }

    @Override
    public final List l() {
        return this.D;
    }

    @Override
    public final String m() {
        return this.B;
    }

    @Override
    public final String n() {
        return r30.k.c1(this.B);
    }

    public final String toString() {
        return "MutableCollectionKClass(" + this.A + ')';
    }

    @Override
    public final boolean u(Object obj) {
        return this.A.u(obj);
    }
}
