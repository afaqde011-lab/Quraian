package g30;

import java.util.Collection;
import java.util.Set;

public final class m extends g {
    @Override
    public final Collection a(x20.f kindFilter, u00.k kVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        throw new IllegalStateException(this.b);
    }

    @Override
    public final Set b() {
        throw new IllegalStateException();
    }

    @Override
    public final Set c() {
        throw new IllegalStateException();
    }

    @Override
    public final Collection d(n20.e eVar, r10.a aVar) {
        d(eVar, (r10.c) aVar);
        throw null;
    }

    @Override
    public final Collection e(n20.e eVar, r10.c cVar) {
        e(eVar, cVar);
        throw null;
    }

    @Override
    public final Set f() {
        throw new IllegalStateException();
    }

    @Override
    public final j10.h g(n20.e name, r10.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        throw new IllegalStateException(this.b + ", required name: " + name);
    }

    @Override
    public final Set d(n20.e name, r10.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        throw new IllegalStateException(this.b + ", required name: " + name);
    }

    @Override
    public final Set e(n20.e name, r10.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        throw new IllegalStateException(this.b + ", required name: " + name);
    }

    @Override
    public final String toString() {
        return g4.c.k(new StringBuilder("ThrowingScope{"), this.b, '}');
    }
}
