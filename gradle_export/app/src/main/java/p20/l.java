package p20;

import a10.w;
import h00.z;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;

public final class l implements j {
    public static final w[] Y;
    public final k A;
    public final k B;
    public final k C;
    public final k D;
    public final k E;
    public final k F;
    public final k G;
    public final k H;
    public final k I;
    public final k J;
    public final k K;
    public final k L;
    public final k M;
    public final k N;
    public final k O;
    public final k P;
    public final k Q;
    public final k R;
    public final k S;
    public final k T;
    public final k U;
    public final k V;
    public final k W;
    public final k X;
    public boolean a;
    public final k b = new k(b.d, this);
    public final k c;
    public final k d;
    public final k e;
    public final k f;
    public final k g;
    public final k h;
    public final k i;
    public final k j;
    public final k k;
    public final k l;
    public final k m;
    public final k n;
    public final k o;
    public final k p;
    public final k q;
    public final k r;
    public final k s;
    public final k t;
    public final k u;
    public final k v;
    public final k w;
    public final k x;
    public final k y;
    public final k z;

    static {
        kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p(l.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0);
        b0 b0Var = a0.a;
        Y = new w[]{b0Var.f(pVar), oi.k.e(l.class, "withDefinedIn", "getWithDefinedIn()Z", 0, b0Var), oi.k.e(l.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0, b0Var), oi.k.e(l.class, "modifiers", "getModifiers()Ljava/util/Set;", 0, b0Var), oi.k.e(l.class, "startFromName", "getStartFromName()Z", 0, b0Var), oi.k.e(l.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0, b0Var), oi.k.e(l.class, "debugMode", "getDebugMode()Z", 0, b0Var), oi.k.e(l.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0, b0Var), oi.k.e(l.class, "verbose", "getVerbose()Z", 0, b0Var), oi.k.e(l.class, "unitReturnType", "getUnitReturnType()Z", 0, b0Var), oi.k.e(l.class, "withoutReturnType", "getWithoutReturnType()Z", 0, b0Var), oi.k.e(l.class, "enhancedTypes", "getEnhancedTypes()Z", 0, b0Var), oi.k.e(l.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0, b0Var), oi.k.e(l.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0, b0Var), oi.k.e(l.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0, b0Var), oi.k.e(l.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0, b0Var), oi.k.e(l.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0, b0Var), oi.k.e(l.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0, b0Var), oi.k.e(l.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0, b0Var), oi.k.e(l.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0, b0Var), oi.k.e(l.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0, b0Var), oi.k.e(l.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0, b0Var), oi.k.e(l.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0, b0Var), oi.k.e(l.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0, b0Var), oi.k.e(l.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0, b0Var), oi.k.e(l.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0, b0Var), oi.k.e(l.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0, b0Var), oi.k.e(l.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0, b0Var), oi.k.e(l.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0, b0Var), oi.k.e(l.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0, b0Var), oi.k.e(l.class, "receiverAfterName", "getReceiverAfterName()Z", 0, b0Var), oi.k.e(l.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0, b0Var), oi.k.e(l.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0, b0Var), oi.k.e(l.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0, b0Var), oi.k.e(l.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0, b0Var), oi.k.e(l.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0, b0Var), oi.k.e(l.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0, b0Var), oi.k.e(l.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0, b0Var), oi.k.e(l.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0, b0Var), oi.k.e(l.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0, b0Var), oi.k.e(l.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0, b0Var), oi.k.e(l.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0, b0Var), oi.k.e(l.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0, b0Var), oi.k.e(l.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0, b0Var), oi.k.e(l.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0, b0Var), oi.k.e(l.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0, b0Var), oi.k.e(l.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0, b0Var), oi.k.e(l.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0, b0Var), oi.k.e(l.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0, b0Var), oi.k.e(l.class, "informativeErrorType", "getInformativeErrorType()Z", 0, b0Var)};
    }

    public l() {
        Boolean bool = Boolean.TRUE;
        this.c = new k(bool, this);
        this.d = new k(bool, this);
        this.e = new k(i.B, this);
        Boolean bool2 = Boolean.FALSE;
        this.f = new k(bool2, this);
        this.g = new k(bool2, this);
        this.h = new k(bool2, this);
        this.i = new k(bool2, this);
        this.j = new k(bool2, this);
        this.k = new k(bool, this);
        this.l = new k(bool2, this);
        this.m = new k(bool2, this);
        this.n = new k(bool2, this);
        this.o = new k(bool, this);
        this.p = new k(bool, this);
        this.q = new k(bool2, this);
        this.r = new k(bool2, this);
        this.s = new k(bool2, this);
        this.t = new k(bool2, this);
        this.u = new k(bool2, this);
        this.v = new k(null, this);
        this.w = new k(bool2, this);
        this.x = new k(bool2, this);
        this.y = new k(d.O, this);
        this.z = new k(d.P, this);
        this.A = new k(bool, this);
        this.B = new k(o.B, this);
        this.C = new k(e.a, this);
        this.D = new k(t.A, this);
        this.E = new k(p.A, this);
        this.F = new k(bool2, this);
        this.G = new k(bool2, this);
        this.H = new k(q.A, this);
        this.I = new k(bool2, this);
        this.J = new k(bool2, this);
        this.K = new k(z.A, this);
        this.L = new k(m.a, this);
        this.M = new k(null, this);
        this.N = new k(a.NO_ARGUMENTS, this);
        this.O = new k(bool2, this);
        this.P = new k(bool, this);
        this.Q = new k(bool, this);
        this.R = new k(bool2, this);
        this.S = new k(bool2, this);
        this.T = new k(bool, this);
        this.U = new k(bool, this);
        this.V = new k(bool2, this);
        this.W = new k(bool2, this);
        this.X = new k(bool, this);
    }

    @Override
    public final void a() {
        this.F.b(Y[30], Boolean.TRUE);
    }

    @Override
    public final void b() {
        this.h.b(Y[6], Boolean.TRUE);
    }

    @Override
    public final void c() {
        this.G.b(Y[31], Boolean.TRUE);
    }

    @Override
    public final void d(c cVar) {
        this.b.b(Y[0], cVar);
    }

    @Override
    public final void e(Set set) {
        kotlin.jvm.internal.m.e(set, "<set-?>");
        this.e.b(Y[3], set);
    }

    @Override
    public final void f(p pVar) {
        this.E.b(Y[29], pVar);
    }

    @Override
    public final void g(LinkedHashSet linkedHashSet) {
        this.L.b(Y[36], linkedHashSet);
    }

    @Override
    public final void h() {
        this.w.b(Y[21], Boolean.TRUE);
    }

    @Override
    public final void i() {
        this.f.b(Y[4], Boolean.TRUE);
    }

    @Override
    public final void j() {
        this.c.b(Y[1], Boolean.FALSE);
    }

    @Override
    public final Set k() {
        return (Set) this.L.a(Y[36], this);
    }

    @Override
    public final void l() {
        r rVar = t.B;
        this.D.b(Y[28], rVar);
    }

    @Override
    public final void m() {
        this.x.b(Y[22], Boolean.TRUE);
    }

    public final boolean n() {
        return ((Boolean) this.h.a(Y[6], this)).booleanValue();
    }
}
