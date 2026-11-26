package s10;

public final class f extends kotlin.jvm.internal.p {
    public static final f B = new f(z0.class, "flags", "getFlags$kotlin_metadata()I", 0);

    @Override
    public final Object get(Object obj) {
        return Integer.valueOf(((z0) obj).a);
    }

    @Override
    public final void p(Object obj, Object obj2) {
        ((z0) obj).a = ((Number) obj2).intValue();
    }
}
