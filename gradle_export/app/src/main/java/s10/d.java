package s10;

public final class d extends kotlin.jvm.internal.p {
    public static final d B = new d(n0.class, "flags", "getFlags$kotlin_metadata()I", 0);

    @Override
    public final Object get(Object obj) {
        return Integer.valueOf(((n0) obj).A);
    }

    @Override
    public final void p(Object obj, Object obj2) {
        ((n0) obj).A = ((Number) obj2).intValue();
    }
}
