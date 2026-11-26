package d10;

import java.util.Collection;

public final class e1 extends k1 {
    public static final a10.w[] r;
    public final Object c;
    public final x1 d;
    public final x1 e;
    public final x1 f;
    public final x1 g;
    public final x1 h;
    public final x1 i;
    public final x1 j;
    public final x1 k;
    public final x1 l;
    public final x1 m;
    public final x1 n;
    public final x1 o;
    public final x1 p;
    public final j1 q;

    static {
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s(e1.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0);
        kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
        r = new a10.w[]{b0Var.h(sVar), a1.b.h(e1.class, "annotations", "getAnnotations()Ljava/util/List;", 0, b0Var), a1.b.h(e1.class, "simpleName", "getSimpleName()Ljava/lang/String;", 0, b0Var), a1.b.h(e1.class, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0, b0Var), a1.b.h(e1.class, "constructors", "getConstructors()Ljava/util/Collection;", 0, b0Var), a1.b.h(e1.class, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0, b0Var), a1.b.h(e1.class, "typeParameters", "getTypeParameters()Ljava/util/List;", 0, b0Var), a1.b.h(e1.class, "typeParameterTable", "getTypeParameterTable()Lkotlin/reflect/jvm/internal/TypeParameterTable;", 0, b0Var), a1.b.h(e1.class, "supertypes", "getSupertypes()Ljava/util/List;", 0, b0Var), a1.b.h(e1.class, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0, b0Var), a1.b.h(e1.class, "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;", 0, b0Var), a1.b.h(e1.class, "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;", 0, b0Var), a1.b.h(e1.class, "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;", 0, b0Var), a1.b.h(e1.class, "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;", 0, b0Var), a1.b.h(e1.class, "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;", 0, b0Var), a1.b.h(e1.class, "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;", 0, b0Var), a1.b.h(e1.class, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0, b0Var), a1.b.h(e1.class, "allMembers", "getAllMembers()Ljava/util/Collection;", 0, b0Var)};
    }

    public e1(j1 j1Var) {
        super(j1Var);
        this.q = j1Var;
        g00.i iVar = g00.i.B;
        this.c = rd.a.I(iVar, new c1(j1Var, this, 0));
        this.d = va.a.Q((j10.c) null, new a1(j1Var, 5));
        va.a.Q((j10.c) null, new a1(j1Var, 6));
        this.e = va.a.Q((j10.c) null, new a1(j1Var, this));
        this.f = va.a.Q((j10.c) null, new a1(j1Var, 8));
        this.g = va.a.Q((j10.c) null, new a1(j1Var, 9));
        va.a.Q((j10.c) null, new c1(this, j1Var, 3));
        rd.a.I(iVar, new c1(this, j1Var, 4));
        this.h = va.a.Q((j10.c) null, new c1(this, j1Var, 5));
        this.i = va.a.Q((j10.c) null, new c1(this, j1Var, 6));
        this.j = va.a.Q((j10.c) null, new c1(j1Var, this, 1));
        va.a.Q((j10.c) null, new c1(j1Var, this, 2));
        this.k = va.a.Q((j10.c) null, new a1(j1Var, 1));
        this.l = va.a.Q((j10.c) null, new a1(j1Var, 2));
        this.m = va.a.Q((j10.c) null, new a1(j1Var, 3));
        this.n = va.a.Q((j10.c) null, new a1(j1Var, 4));
        this.o = va.a.Q((j10.c) null, new d1(this, 0));
        this.p = va.a.Q((j10.c) null, new d1(this, 1));
        va.a.Q((j10.c) null, new d1(this, 2));
        va.a.Q((j10.c) null, new d1(this, 3));
    }

    public final Collection a() {
        a10.w wVar = r[10];
        Object objInvoke = this.k.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
        return (Collection) objInvoke;
    }

    public final j10.e b() {
        a10.w wVar = r[0];
        Object objInvoke = this.d.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
        return (j10.e) objInvoke;
    }

    public final s10.n0 c() {
        return (s10.n0) this.c.getValue();
    }

    public final g2 d() {
        a10.w wVar = r[7];
        Object objInvoke = this.i.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
        return (g2) objInvoke;
    }
}
