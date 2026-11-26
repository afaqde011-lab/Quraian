package d10;

public final class o1 extends k1 {
    public static final a10.w[] f;
    public final x1 c;
    public final x1 d;
    public final Object e;

    static {
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s(o1.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0);
        kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
        f = new a10.w[]{b0Var.h(sVar), a1.b.h(o1.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0, b0Var), a1.b.h(o1.class, "members", "getMembers()Ljava/util/Collection;", 0, b0Var)};
    }

    public o1(p1 p1Var) {
        super(p1Var);
        this.c = va.a.Q((j10.c) null, new m1(p1Var, 1));
        this.d = va.a.Q((j10.c) null, new a30.l(this, 23));
        this.e = rd.a.I(g00.i.B, new n1(this, p1Var, 0));
        va.a.Q((j10.c) null, new n1(this, p1Var, 1));
    }
}
