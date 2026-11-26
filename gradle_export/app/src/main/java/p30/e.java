package p30;

public final class e implements u00.k {
    public static final e B = new e(0);
    public static final e C = new e(1);
    public final int A;

    public e(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj) {
        Class<?> declaringClass;
        a10.d it = (a10.d) obj;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(it, "it");
                if (!it.k() || (declaringClass = k00.f.D(it).getDeclaringClass()) == null) {
                    return null;
                }
                return k00.f.I(declaringClass);
            default:
                kotlin.jvm.internal.m.e(it, "it");
                return it.getTypeParameters();
        }
    }
}
