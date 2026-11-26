package e30;

public final class u implements u00.k {
    public static final u B = new u(0);
    public final int A;

    public u(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                w it = (w) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return it.toString();
            default:
                n20.c cVar = (n20.c) obj;
                if (cVar != null) {
                    return Boolean.valueOf(!cVar.equals(g10.o.y));
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
        }
    }
}
