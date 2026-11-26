package s10;

public final class b extends kotlin.jvm.internal.p {
    public static final b B = new b(d1.class, "flags", "getFlags$kotlin_metadata()I", 0);

    @Override
    public final Object get(Object obj) {
        return Integer.valueOf(((d1) obj).a);
    }

    @Override
    public final void p(Object obj, Object obj2) {
        ((d1) obj).a = ((Number) obj2).intValue();
    }
}
