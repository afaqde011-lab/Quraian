package d00;

public interface c1 {
    default void a(r0 context, b1 level) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(level, "level");
    }

    void b(b3.o0 o0Var, r0 r0Var);

    default void c(r0 context) {
        kotlin.jvm.internal.m.e(context, "context");
    }

    default boolean d(r0 context) {
        kotlin.jvm.internal.m.e(context, "context");
        return false;
    }

    default h2.c e(h2.c cVar, y3.c density) {
        kotlin.jvm.internal.m.e(density, "density");
        return cVar;
    }

    default boolean f() {
        return false;
    }

    default boolean g() {
        return false;
    }

    default void h(r0 context) {
        kotlin.jvm.internal.m.e(context, "context");
    }

    default void i(r0 context) {
        kotlin.jvm.internal.m.e(context, "context");
    }
}
