package s10;

public final class i extends kotlin.jvm.internal.p {
    public static final i B = new i(y0.class, "flags", "getFlags$kotlin_metadata()I", 0);

    @Override
    public final Object get(Object obj) {
        return Integer.valueOf(((y0) obj).a);
    }

    @Override
    public final void p(Object obj, Object obj2) {
        ((y0) obj).a = ((Number) obj2).intValue();
    }
}
