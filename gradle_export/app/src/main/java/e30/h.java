package e30;

public abstract class h {
    public static final a10.w[] a;
    public static final com.google.android.gms.internal.cast.o b;

    static {
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s(h.class, "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;", 1);
        kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
        a = new a10.w[]{b0Var.h(sVar)};
        l9.f0 f0Var = h0.B;
        a10.d dVarB = b0Var.b(g.class);
        f0Var.getClass();
        String strM = dVarB.m();
        kotlin.jvm.internal.m.b(strM);
        b = new com.google.android.gms.internal.cast.o(f0Var.j(strM));
    }

    public static final k10.h a(h0 h0Var) {
        k10.h hVar;
        kotlin.jvm.internal.m.e(h0Var, "<this>");
        g gVar = (g) b.g(a[0], h0Var);
        return (gVar == null || (hVar = gVar.a) == null) ? k10.g.a : hVar;
    }
}
