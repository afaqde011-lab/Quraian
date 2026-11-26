package d10;

import java.lang.ref.SoftReference;

public final class x1 implements u00.a {
    public static final b2 C = new b2();
    public final u00.a A;
    public volatile SoftReference B;

    public x1(Object obj, u00.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        }
        this.B = null;
        this.A = aVar;
        if (obj != null) {
            this.B = new SoftReference(obj);
        }
    }

    @Override
    public final Object invoke() {
        Object obj;
        Object obj2 = C;
        SoftReference softReference = this.B;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objInvoke = this.A.invoke();
        if (objInvoke != null) {
            obj2 = objInvoke;
        }
        this.B = new SoftReference(obj2);
        return objInvoke;
    }
}
