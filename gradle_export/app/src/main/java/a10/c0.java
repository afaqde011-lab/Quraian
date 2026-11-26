package a10;

import d10.r1;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c0 implements TypeVariable, Type {
    public final r1 A;

    public c0(r1 r1Var) {
        this.A = r1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !kotlin.jvm.internal.m.a(getName(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override
    public final Type[] getBounds() {
        List list = this.A.F;
        if (list == null) {
            kotlin.jvm.internal.m.k("upperBounds");
            throw null;
        }
        ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h0.n((x) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override
    public final GenericDeclaration getGenericDeclaration() {
        throw new UnsupportedOperationException("getGenericDeclaration() is not supported for type variables created from KType: " + this.A + ".\nUpdate kotlin-reflect dependency to 2.3.20+.");
    }

    @Override
    public final String getName() {
        return this.A.C;
    }

    @Override
    public final String getTypeName() {
        return getName();
    }

    public final int hashCode() {
        getName().hashCode();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return getName();
    }
}
