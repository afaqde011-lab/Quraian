package b6;

import d6.o1;

public interface l extends m {
    @Override
    default Object a(Object obj, u00.n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override
    default boolean b(bw.b bVar) {
        Object obj = o1.f4679a;
        return Boolean.TRUE.booleanValue();
    }

    @Override
    default boolean c(u00.k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }
}
