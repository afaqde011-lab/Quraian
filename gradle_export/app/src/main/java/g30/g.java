package g30;

import h00.x;
import h00.z;
import j10.n0;
import j10.o;
import j10.p;
import j10.y;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import x20.n;

public class g implements n {
    public final String b;

    public g(h hVar, String... formatParams) {
        kotlin.jvm.internal.m.e(formatParams, "formatParams");
        String str = hVar.A;
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.b = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override
    public Collection a(x20.f kindFilter, u00.k kVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        return x.A;
    }

    @Override
    public Set b() {
        return z.A;
    }

    @Override
    public Set c() {
        return z.A;
    }

    @Override
    public Set f() {
        return z.A;
    }

    @Override
    public j10.h g(n20.e name, r10.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        b[] bVarArr = b.A;
        return new a(n20.e.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{name}, 1))));
    }

    @Override
    public Set d(n20.e name, r10.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        a containingDeclaration = l.c;
        kotlin.jvm.internal.m.e(containingDeclaration, "containingDeclaration");
        b[] bVarArr = b.A;
        c cVar2 = new c(containingDeclaration, null, k10.g.a, n20.e.g("<Error function>"), 1, n0.n);
        i iVarC = l.c(k.E, new String[0]);
        y yVar = y.D;
        o oVar = p.e;
        x xVar = x.A;
        cVar2.d1(null, null, xVar, xVar, xVar, iVarC, yVar, oVar);
        return w50.c.g0(cVar2);
    }

    @Override
    public Set e(n20.e name, r10.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return l.f;
    }

    public String toString() {
        return g4.c.k(new StringBuilder("ErrorScope{"), this.b, '}');
    }
}
