package b2;

public interface p extends r {
    @Override
    default Object a(Object obj, u00.n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override
    default boolean g(u00.k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }
}
