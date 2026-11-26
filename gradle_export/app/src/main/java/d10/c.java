package d10;

public abstract class c {
    public static final a1.u0 a;
    public static final a1.u0 b;
    public static final a1.u0 c;
    public static final a1.u0 d;
    public static final a1.u0 e;

    static {
        b bVar = b.B;
        int i = a.a;
        a = new a1.u0(bVar);
        b = new a1.u0(b.C);
        c = new a1.u0(b.D);
        d = new a1.u0(b.E);
        e = new a1.u0(b.F);
    }

    public static final j1 a(Class jClass) {
        kotlin.jvm.internal.m.e(jClass, "jClass");
        Object objE = a.E(jClass);
        kotlin.jvm.internal.m.c(objE, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (j1) objE;
    }
}
