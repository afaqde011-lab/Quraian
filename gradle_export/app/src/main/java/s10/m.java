package s10;

public final class m extends kotlin.jvm.internal.p {
    public static final m B = new m(c1.class, "flags", "getFlags$kotlin_metadata()I", 0);

    @Override
    public final Object get(Object obj) {
        return Integer.valueOf(((c1) obj).a);
    }

    @Override
    public final void p(Object obj, Object obj2) {
        ((c1) obj).a = ((Number) obj2).intValue();
    }
}
