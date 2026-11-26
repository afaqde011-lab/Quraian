package s10;

import java.util.ArrayList;

public abstract class p {
    public static final a10.w[] a;
    public static final p10.a b;
    public static final p10.a c;
    public static final p10.a d;
    public static final w0 e;
    public static final w0 f;
    public static final w0 g;
    public static final w0 h;
    public static final w0 i;
    public static final w0 j;

    static {
        kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p(p.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmClass;)Z", 1);
        kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
        a = new a10.w[]{b0Var.f(pVar), oi.k.e(p.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmConstructor;)Z", 1, b0Var), oi.k.e(p.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmFunction;)Z", 1, b0Var), oi.k.e(p.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmProperty;)Z", 1, b0Var), oi.k.e(p.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1, b0Var), oi.k.e(p.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmValueParameter;)Z", 1, b0Var), oi.k.e(p.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmTypeAlias;)Z", 1, b0Var), oi.k.e(p.class, "modality", "getModality(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Modality;", 1, b0Var), oi.k.e(p.class, "visibility", "getVisibility(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Visibility;", 1, b0Var), oi.k.e(p.class, "kind", "getKind(Lkotlin/metadata/KmClass;)Lkotlin/metadata/ClassKind;", 1, b0Var), oi.k.e(p.class, "isInner", "isInner(Lkotlin/metadata/KmClass;)Z", 1, b0Var), oi.k.e(p.class, "isData", "isData(Lkotlin/metadata/KmClass;)Z", 1, b0Var), oi.k.e(p.class, "isExternal", "isExternal(Lkotlin/metadata/KmClass;)Z", 1, b0Var), oi.k.e(p.class, "isExpect", "isExpect(Lkotlin/metadata/KmClass;)Z", 1, b0Var), oi.k.e(p.class, "isValue", "isValue(Lkotlin/metadata/KmClass;)Z", 1, b0Var), oi.k.e(p.class, "isFunInterface", "isFunInterface(Lkotlin/metadata/KmClass;)Z", 1, b0Var), oi.k.e(p.class, "hasEnumEntries", "getHasEnumEntries(Lkotlin/metadata/KmClass;)Z", 1, b0Var), oi.k.e(p.class, "visibility", "getVisibility(Lkotlin/metadata/KmConstructor;)Lkotlin/metadata/Visibility;", 1, b0Var), oi.k.e(p.class, "isSecondary", "isSecondary(Lkotlin/metadata/KmConstructor;)Z", 1, b0Var), oi.k.e(p.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmConstructor;)Z", 1, b0Var), oi.k.e(p.class, "kind", "getKind(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/MemberKind;", 1, b0Var), oi.k.e(p.class, "visibility", "getVisibility(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Visibility;", 1, b0Var), oi.k.e(p.class, "modality", "getModality(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Modality;", 1, b0Var), oi.k.e(p.class, "isOperator", "isOperator(Lkotlin/metadata/KmFunction;)Z", 1, b0Var), oi.k.e(p.class, "isInfix", "isInfix(Lkotlin/metadata/KmFunction;)Z", 1, b0Var), oi.k.e(p.class, "isInline", "isInline(Lkotlin/metadata/KmFunction;)Z", 1, b0Var), oi.k.e(p.class, "isTailrec", "isTailrec(Lkotlin/metadata/KmFunction;)Z", 1, b0Var), oi.k.e(p.class, "isExternal", "isExternal(Lkotlin/metadata/KmFunction;)Z", 1, b0Var), oi.k.e(p.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmFunction;)Z", 1, b0Var), oi.k.e(p.class, "isExpect", "isExpect(Lkotlin/metadata/KmFunction;)Z", 1, b0Var), oi.k.e(p.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmFunction;)Z", 1, b0Var), oi.k.e(p.class, "visibility", "getVisibility(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Visibility;", 1, b0Var), oi.k.e(p.class, "modality", "getModality(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Modality;", 1, b0Var), oi.k.e(p.class, "kind", "getKind(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/MemberKind;", 1, b0Var), oi.k.e(p.class, "isVar", "isVar(Lkotlin/metadata/KmProperty;)Z", 1, b0Var), oi.k.e(p.class, "isConst", "isConst(Lkotlin/metadata/KmProperty;)Z", 1, b0Var), oi.k.e(p.class, "isLateinit", "isLateinit(Lkotlin/metadata/KmProperty;)Z", 1, b0Var), oi.k.e(p.class, "hasConstant", "getHasConstant(Lkotlin/metadata/KmProperty;)Z", 1, b0Var), oi.k.e(p.class, "isExternal", "isExternal(Lkotlin/metadata/KmProperty;)Z", 1, b0Var), oi.k.e(p.class, "isDelegated", "isDelegated(Lkotlin/metadata/KmProperty;)Z", 1, b0Var), oi.k.e(p.class, "isExpect", "isExpect(Lkotlin/metadata/KmProperty;)Z", 1, b0Var), oi.k.e(p.class, "visibility", "getVisibility(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Visibility;", 1, b0Var), oi.k.e(p.class, "modality", "getModality(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Modality;", 1, b0Var), oi.k.e(p.class, "isNotDefault", "isNotDefault(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1, b0Var), oi.k.e(p.class, "isExternal", "isExternal(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1, b0Var), oi.k.e(p.class, "isInline", "isInline(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1, b0Var), oi.k.e(p.class, "isNullable", "isNullable(Lkotlin/metadata/KmType;)Z", 1, b0Var), oi.k.e(p.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmType;)Z", 1, b0Var), oi.k.e(p.class, "isDefinitelyNonNull", "isDefinitelyNonNull(Lkotlin/metadata/KmType;)Z", 1, b0Var), oi.k.e(p.class, "isReified", "isReified(Lkotlin/metadata/KmTypeParameter;)Z", 1, b0Var), oi.k.e(p.class, "visibility", "getVisibility(Lkotlin/metadata/KmTypeAlias;)Lkotlin/metadata/Visibility;", 1, b0Var), oi.k.e(p.class, "declaresDefaultValue", "getDeclaresDefaultValue(Lkotlin/metadata/KmValueParameter;)Z", 1, b0Var), oi.k.e(p.class, "isCrossinline", "isCrossinline(Lkotlin/metadata/KmValueParameter;)Z", 1, b0Var), oi.k.e(p.class, "isNoinline", "isNoinline(Lkotlin/metadata/KmValueParameter;)Z", 1, b0Var), oi.k.e(p.class, "isNegated", "isNegated(Lkotlin/metadata/KmEffectExpression;)Z", 1, b0Var), oi.k.e(p.class, "isNullCheckPredicate", "isNullCheckPredicate(Lkotlin/metadata/KmEffectExpression;)Z", 1, b0Var)};
        k20.b HAS_ANNOTATIONS = k20.e.c;
        kotlin.jvm.internal.m.d(HAS_ANNOTATIONS, "HAS_ANNOTATIONS");
        t10.h hVar = new t10.h(HAS_ANNOTATIONS);
        t10.a aVar = t10.a.B;
        if (hVar.b != 1 || hVar.c != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar, " was passed").toString());
        }
        t10.h hVar2 = new t10.h(HAS_ANNOTATIONS);
        int i2 = t10.b.B;
        if (hVar2.b != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar2, " was passed").toString());
        }
        kh.n.G(new t10.h(HAS_ANNOTATIONS));
        t10.h hVar3 = new t10.h(HAS_ANNOTATIONS);
        t10.e eVar = t10.e.B;
        if (hVar3.b != 1 || hVar3.c != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar3, " was passed").toString());
        }
        kh.n.V(new t10.h(HAS_ANNOTATIONS));
        kh.n.o0(new t10.h(HAS_ANNOTATIONS));
        t10.h hVar4 = new t10.h(HAS_ANNOTATIONS);
        int i3 = a.D;
        if (hVar4.b != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar4, " was passed").toString());
        }
        b = kh.n.S(h.B);
        c = kh.n.p0(n.B);
        d dVar = d.B;
        k20.c CLASS_KIND = k20.e.f;
        kotlin.jvm.internal.m.d(CLASS_KIND, "CLASS_KIND");
        n00.b bVar = q.J;
        ArrayList arrayList = new ArrayList(h00.r.q0(bVar, 10));
        g00.s sVar = new g00.s(bVar, 4);
        while (sVar.hasNext()) {
            arrayList.add(((q) sVar.next()).A);
        }
        d = new p10.a((kotlin.jvm.internal.p) dVar, (k20.d) CLASS_KIND, (n00.a) bVar, arrayList);
        k20.b IS_INNER = k20.e.g;
        kotlin.jvm.internal.m.d(IS_INNER, "IS_INNER");
        t10.h hVar5 = new t10.h(IS_INNER);
        t10.a aVar2 = t10.a.B;
        e = new w0(aVar2, hVar5);
        k20.b IS_DATA = k20.e.h;
        kotlin.jvm.internal.m.d(IS_DATA, "IS_DATA");
        t10.h hVar6 = new t10.h(IS_DATA);
        if (hVar6.b != 1 || hVar6.c != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar6, " was passed").toString());
        }
        k20.b IS_EXTERNAL_CLASS = k20.e.i;
        kotlin.jvm.internal.m.d(IS_EXTERNAL_CLASS, "IS_EXTERNAL_CLASS");
        t10.h hVar7 = new t10.h(IS_EXTERNAL_CLASS);
        if (hVar7.b != 1 || hVar7.c != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar7, " was passed").toString());
        }
        k20.b IS_EXPECT_CLASS = k20.e.j;
        kotlin.jvm.internal.m.d(IS_EXPECT_CLASS, "IS_EXPECT_CLASS");
        t10.h hVar8 = new t10.h(IS_EXPECT_CLASS);
        if (hVar8.b != 1 || hVar8.c != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar8, " was passed").toString());
        }
        k20.b IS_VALUE_CLASS = k20.e.k;
        kotlin.jvm.internal.m.d(IS_VALUE_CLASS, "IS_VALUE_CLASS");
        f = new w0(aVar2, new t10.h(IS_VALUE_CLASS));
        k20.b IS_FUN_INTERFACE = k20.e.l;
        kotlin.jvm.internal.m.d(IS_FUN_INTERFACE, "IS_FUN_INTERFACE");
        t10.h hVar9 = new t10.h(IS_FUN_INTERFACE);
        if (hVar9.b != 1 || hVar9.c != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar9, " was passed").toString());
        }
        k20.b HAS_ENUM_ENTRIES = k20.e.m;
        kotlin.jvm.internal.m.d(HAS_ENUM_ENTRIES, "HAS_ENUM_ENTRIES");
        t10.h hVar10 = new t10.h(HAS_ENUM_ENTRIES);
        if (hVar10.b != 1 || hVar10.c != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar10, " was passed").toString());
        }
        kh.n.p0(o.B);
        k20.b IS_SECONDARY = k20.e.n;
        kotlin.jvm.internal.m.d(IS_SECONDARY, "IS_SECONDARY");
        t10.h hVar11 = new t10.h(IS_SECONDARY);
        int i4 = t10.b.B;
        if (hVar11.b != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar11, " was passed").toString());
        }
        k20.b IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES = k20.e.o;
        kotlin.jvm.internal.m.d(IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES, "IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES");
        t10.h hVar12 = new t10.h(IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES);
        if (hVar12.b != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar12, " was passed").toString());
        }
        kh.n.R(e.B);
        kh.n.p0(j.B);
        kh.n.S(i.B);
        k20.b IS_OPERATOR = k20.e.q;
        kotlin.jvm.internal.m.d(IS_OPERATOR, "IS_OPERATOR");
        kh.n.G(new t10.h(IS_OPERATOR));
        k20.b IS_INFIX = k20.e.r;
        kotlin.jvm.internal.m.d(IS_INFIX, "IS_INFIX");
        kh.n.G(new t10.h(IS_INFIX));
        k20.b IS_INLINE = k20.e.s;
        kotlin.jvm.internal.m.d(IS_INLINE, "IS_INLINE");
        kh.n.G(new t10.h(IS_INLINE));
        k20.b IS_TAILREC = k20.e.t;
        kotlin.jvm.internal.m.d(IS_TAILREC, "IS_TAILREC");
        kh.n.G(new t10.h(IS_TAILREC));
        k20.b IS_EXTERNAL_FUNCTION = k20.e.u;
        kotlin.jvm.internal.m.d(IS_EXTERNAL_FUNCTION, "IS_EXTERNAL_FUNCTION");
        kh.n.G(new t10.h(IS_EXTERNAL_FUNCTION));
        k20.b IS_SUSPEND = k20.e.v;
        kotlin.jvm.internal.m.d(IS_SUSPEND, "IS_SUSPEND");
        kh.n.G(new t10.h(IS_SUSPEND));
        k20.b IS_EXPECT_FUNCTION = k20.e.w;
        kotlin.jvm.internal.m.d(IS_EXPECT_FUNCTION, "IS_EXPECT_FUNCTION");
        kh.n.G(new t10.h(IS_EXPECT_FUNCTION));
        k20.b IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES = k20.e.x;
        kotlin.jvm.internal.m.d(IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES, "IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES");
        kh.n.G(new t10.h(IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES));
        kh.n.p0(k.B);
        kh.n.S(f.B);
        kh.n.R(c.B);
        k20.b IS_VAR = k20.e.y;
        kotlin.jvm.internal.m.d(IS_VAR, "IS_VAR");
        t10.h hVar13 = new t10.h(IS_VAR);
        t10.e eVar2 = t10.e.B;
        if (hVar13.b != 1 || hVar13.c != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar13, " was passed").toString());
        }
        k20.b IS_CONST = k20.e.B;
        kotlin.jvm.internal.m.d(IS_CONST, "IS_CONST");
        t10.h hVar14 = new t10.h(IS_CONST);
        if (hVar14.b != 1 || hVar14.c != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar14, " was passed").toString());
        }
        k20.b IS_LATEINIT = k20.e.C;
        kotlin.jvm.internal.m.d(IS_LATEINIT, "IS_LATEINIT");
        t10.h hVar15 = new t10.h(IS_LATEINIT);
        if (hVar15.b != 1 || hVar15.c != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar15, " was passed").toString());
        }
        k20.b HAS_CONSTANT = k20.e.D;
        kotlin.jvm.internal.m.d(HAS_CONSTANT, "HAS_CONSTANT");
        t10.h hVar16 = new t10.h(HAS_CONSTANT);
        if (hVar16.b != 1 || hVar16.c != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar16, " was passed").toString());
        }
        k20.b IS_EXTERNAL_PROPERTY = k20.e.E;
        kotlin.jvm.internal.m.d(IS_EXTERNAL_PROPERTY, "IS_EXTERNAL_PROPERTY");
        t10.h hVar17 = new t10.h(IS_EXTERNAL_PROPERTY);
        if (hVar17.b != 1 || hVar17.c != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar17, " was passed").toString());
        }
        k20.b IS_DELEGATED = k20.e.F;
        kotlin.jvm.internal.m.d(IS_DELEGATED, "IS_DELEGATED");
        t10.h hVar18 = new t10.h(IS_DELEGATED);
        if (hVar18.b != 1 || hVar18.c != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar18, " was passed").toString());
        }
        k20.b IS_EXPECT_PROPERTY = k20.e.G;
        kotlin.jvm.internal.m.d(IS_EXPECT_PROPERTY, "IS_EXPECT_PROPERTY");
        t10.h hVar19 = new t10.h(IS_EXPECT_PROPERTY);
        if (hVar19.b != 1 || hVar19.c != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar19, " was passed").toString());
        }
        kh.n.p0(l.B);
        kh.n.S(g.B);
        k20.b IS_NOT_DEFAULT = k20.e.K;
        kotlin.jvm.internal.m.d(IS_NOT_DEFAULT, "IS_NOT_DEFAULT");
        kh.n.V(new t10.h(IS_NOT_DEFAULT));
        k20.b IS_EXTERNAL_ACCESSOR = k20.e.L;
        kotlin.jvm.internal.m.d(IS_EXTERNAL_ACCESSOR, "IS_EXTERNAL_ACCESSOR");
        kh.n.V(new t10.h(IS_EXTERNAL_ACCESSOR));
        k20.b IS_INLINE_ACCESSOR = k20.e.M;
        kotlin.jvm.internal.m.d(IS_INLINE_ACCESSOR, "IS_INLINE_ACCESSOR");
        kh.n.V(new t10.h(IS_INLINE_ACCESSOR));
        t10.h hVar20 = new t10.h(0, 1, 1);
        t10.f fVar = t10.f.B;
        g = new w0(fVar, hVar20);
        k20.b bVar2 = k20.e.a;
        h = new w0(fVar, new t10.h(bVar2.b + 1, bVar2.c, 1));
        k20.b bVar3 = k20.e.b;
        i = new w0(fVar, new t10.h(bVar3.b + 1, bVar3.c, 1));
        j = new w0(b.B, new t10.h(0, 1, 1));
        kh.n.p0(m.B);
        k20.b DECLARES_DEFAULT_VALUE = k20.e.H;
        kotlin.jvm.internal.m.d(DECLARES_DEFAULT_VALUE, "DECLARES_DEFAULT_VALUE");
        kh.n.o0(new t10.h(DECLARES_DEFAULT_VALUE));
        k20.b IS_CROSSINLINE = k20.e.I;
        kotlin.jvm.internal.m.d(IS_CROSSINLINE, "IS_CROSSINLINE");
        kh.n.o0(new t10.h(IS_CROSSINLINE));
        k20.b IS_NOINLINE = k20.e.J;
        kotlin.jvm.internal.m.d(IS_NOINLINE, "IS_NOINLINE");
        kh.n.o0(new t10.h(IS_NOINLINE));
        int i5 = a.D;
        k20.b IS_NEGATED = k20.e.N;
        kotlin.jvm.internal.m.d(IS_NEGATED, "IS_NEGATED");
        t10.h hVar21 = new t10.h(IS_NEGATED);
        if (hVar21.b != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar21, " was passed").toString());
        }
        int i6 = a.D;
        k20.b IS_NULL_CHECK_PREDICATE = k20.e.O;
        kotlin.jvm.internal.m.d(IS_NULL_CHECK_PREDICATE, "IS_NULL_CHECK_PREDICATE");
        t10.h hVar22 = new t10.h(IS_NULL_CHECK_PREDICATE);
        if (hVar22.b != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar22, " was passed").toString());
        }
    }

    public static final q a(n0 n0Var) {
        return (q) d.n(n0Var, a[9]);
    }
}
