package b20;

import java.util.Collection;

public final class b0 implements n30.a {
    public static final b0 A = new b0();

    @Override
    public final Iterable b(Object obj) {
        int i = d0.p;
        Collection collectionL = ((j10.e) obj).f().l();
        kotlin.jvm.internal.m.d(collectionL, "getSupertypes(...)");
        return new h00.p(q30.l.s0(h00.q.D0(collectionL), l.F), 3);
    }
}
