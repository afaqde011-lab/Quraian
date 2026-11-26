package g20;

public final class a implements u00.n {
    public static final a B = new a(0);
    public static final a C = new a(1);
    public final int A;

    public a(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        c loadConstantFromProperty = (c) obj;
        p it = (p) obj2;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(loadConstantFromProperty, "$this$loadConstantFromProperty");
                kotlin.jvm.internal.m.e(it, "it");
                return loadConstantFromProperty.c.get(it);
            default:
                kotlin.jvm.internal.m.e(loadConstantFromProperty, "$this$loadConstantFromProperty");
                kotlin.jvm.internal.m.e(it, "it");
                return loadConstantFromProperty.b.get(it);
        }
    }
}
