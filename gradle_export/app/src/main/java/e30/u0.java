package e30;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import java.util.ArrayList;
import java.util.List;

public final class u0 implements h30.n {
    public static final u0 b = new u0(s0.a);
    public final s0 a;

    public u0(s0 s0Var) {
        this.a = s0Var;
    }

    public static void a(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i == 8) {
            objArr[1] = "getSubstitution";
        } else if (i == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static a1 b(a1 a1Var, a1 a1Var2) {
        if (a1Var == null) {
            a(38);
            throw null;
        }
        if (a1Var2 == null) {
            a(39);
            throw null;
        }
        a1 a1Var3 = a1.C;
        if (a1Var == a1Var3) {
            if (a1Var2 != null) {
                return a1Var2;
            }
            a(40);
            throw null;
        }
        if (a1Var2 == a1Var3) {
            if (a1Var != null) {
                return a1Var;
            }
            a(41);
            throw null;
        }
        if (a1Var == a1Var2) {
            if (a1Var2 != null) {
                return a1Var2;
            }
            a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + a1Var + "' and projection kind '" + a1Var2 + "' cannot be combined");
    }

    public static int c(a1 a1Var, a1 a1Var2) {
        a1 a1Var3 = a1.D;
        if (a1Var == a1Var3 && a1Var2 == a1.E) {
            return 3;
        }
        return (a1Var == a1.E && a1Var2 == a1Var3) ? 2 : 1;
    }

    public static u0 d(w wVar) {
        if (wVar == null) {
            a(6);
            throw null;
        }
        return new u0(n0.b.g(wVar.m0(), wVar.e0()));
    }

    public static u0 e(s0 s0Var, s0 s0Var2) {
        if (s0Var == null) {
            a(3);
            throw null;
        }
        if (s0Var2 == null) {
            a(4);
            throw null;
        }
        if (s0Var.e()) {
            s0Var = s0Var2;
        } else if (!s0Var2.e()) {
            s0Var = new o(s0Var, s0Var2);
        }
        return new u0(s0Var);
    }

    public static String h(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (n30.l.i(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    public final s0 f() {
        s0 s0Var = this.a;
        if (s0Var != null) {
            return s0Var;
        }
        a(8);
        throw null;
    }

    public final w g(w wVar, a1 a1Var) {
        if (wVar == null) {
            a(9);
            throw null;
        }
        if (this.a.e()) {
            return wVar;
        }
        try {
            w wVarB = j(new f0(wVar, a1Var), null, 0).b();
            if (wVarB != null) {
                return wVarB;
            }
            a(12);
            throw null;
        } catch (t0 e) {
            return g30.l.c(g30.k.K, e.getMessage());
        }
    }

    public final w i(w wVar, a1 a1Var) {
        if (wVar == null) {
            a(14);
            throw null;
        }
        if (a1Var == null) {
            a(15);
            throw null;
        }
        p0 f0Var = new f0(f().f(wVar, a1Var), a1Var);
        s0 s0Var = this.a;
        if (!s0Var.e()) {
            try {
                f0Var = j(f0Var, null, 0);
            } catch (t0 unused) {
                f0Var = null;
            }
        }
        if (s0Var.a() || s0Var.b()) {
            boolean zB = s0Var.b();
            if (f0Var == null) {
                f0Var = null;
            } else if (!f0Var.c()) {
                w wVarB = f0Var.b();
                kotlin.jvm.internal.m.d(wVarB, "getType(...)");
                if (x0.c(wVarB, j30.b.A, null)) {
                    a1 a1VarA = f0Var.a();
                    kotlin.jvm.internal.m.d(a1VarA, "getProjectionKind(...)");
                    if (a1VarA == a1.E) {
                        f0Var = new f0((w) rd.a.f(wVarB).b, a1VarA);
                    } else if (zB) {
                        f0Var = new f0((w) rd.a.f(wVarB).a, a1VarA);
                    } else {
                        j30.c cVar = new j30.c();
                        u0 u0Var = new u0(cVar);
                        if (!cVar.e()) {
                            try {
                                f0Var = u0Var.j(f0Var, null, 0);
                            } catch (t0 unused2) {
                                f0Var = null;
                            }
                        }
                    }
                }
            }
        }
        if (f0Var == null) {
            return null;
        }
        return f0Var.b();
    }

    public final p0 j(p0 p0Var, j10.r0 r0Var, int i) throws t0 {
        w wVarB;
        a1 a1VarA;
        z0 z0VarY0;
        a aVar;
        a0 a0Var;
        List parameters;
        List newArguments;
        ArrayList arrayList;
        boolean z;
        w wVarQ;
        j10.r0 r0Var2;
        p0 p0Var2;
        p0 p0VarJ;
        int iB;
        char c;
        a1 a1VarF;
        a1 a1Var;
        u0 u0Var;
        t tVar;
        int iC;
        k10.a aVarY0;
        j jVar;
        w wVarH;
        k10.h hVarC;
        int iB2;
        w wVarI = null;
        if (p0Var == null) {
            a(18);
            throw null;
        }
        s0 s0Var = this.a;
        if (i > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + h(p0Var) + "; substitution: " + h(s0Var));
        }
        if (!p0Var.c()) {
            w wVarB2 = p0Var.b();
            int i2 = 1;
            if (wVarB2 instanceof y0) {
                y0 y0Var = (y0) wVarB2;
                z0 z0VarV = y0Var.V();
                w wVarT = y0Var.t();
                p0 p0VarJ2 = j(new f0(z0VarV, p0Var.a()), r0Var, i + 1);
                return p0VarJ2.c() ? p0VarJ2 : new f0(c.I(p0VarJ2.b().y0(), i(wVarT, p0Var.a())), p0VarJ2.a());
            }
            kotlin.jvm.internal.m.e(wVarB2, "<this>");
            wVarB2.y0();
            if (!(wVarB2.y0() instanceof c20.i)) {
                p0 p0VarD = s0Var.d(wVarB2);
                if (p0VarD == null) {
                    p0VarD = null;
                } else if (wVarB2.getAnnotations().d(g10.o.y)) {
                    m0 m0VarM0 = p0VarD.b().m0();
                    if (m0VarM0 instanceof f30.i) {
                        p0 p0Var3 = ((f30.i) m0VarM0).A;
                        a1 a1VarA2 = p0Var3.a();
                        if (c(p0Var.a(), a1VarA2) == 3) {
                            p0VarD = new f0(p0Var3.b());
                        } else if (r0Var != null && c(r0Var.F(), a1VarA2) == 3) {
                            p0VarD = new f0(p0Var3.b());
                        }
                    }
                }
                a1 a1VarA3 = p0Var.a();
                if (p0VarD == null && c.l(wVarB2)) {
                    k10.a aVarY1 = wVarB2.y0();
                    j jVar2 = aVarY1 instanceof j ? (j) aVarY1 : null;
                    if (!(jVar2 != null ? jVar2.P() : false)) {
                        q qVar = (q) wVarB2.y0();
                        a0 a0Var2 = qVar.C;
                        a0 a0Var3 = qVar.B;
                        int i3 = i + 1;
                        p0 p0VarJ3 = j(new f0(a0Var3, a1VarA3), r0Var, i3);
                        p0 p0VarJ4 = j(new f0(a0Var2, a1VarA3), r0Var, i3);
                        a1 a1VarA4 = p0VarJ3.a();
                        if (p0VarJ3.b() != a0Var3 || p0VarJ4.b() != a0Var2) {
                            return new f0(c.f(c.b(p0VarJ3.b()), c.b(p0VarJ4.b())), a1VarA4);
                        }
                    } else if (!g10.i.F(wVarB2)) {
                        if (p0VarD != null) {
                            iC = c(a1VarA3, p0VarD.a());
                            if (!(wVarB2.m0() instanceof r20.b)) {
                                iB2 = e4.f.b(iC);
                                if (iB2 != 1) {
                                    return new f0(wVarB2.m0().d().p(), a1.E);
                                }
                                if (iB2 == 2) {
                                    throw new t0("Out-projection in in-position");
                                }
                            }
                            aVarY0 = wVarB2.y0();
                            if (aVarY0 instanceof j) {
                                jVar = (j) aVarY0;
                            } else {
                                jVar = null;
                            }
                            if (jVar != null) {
                                jVar = null;
                            } else {
                                jVar = null;
                            }
                            if (p0VarD.c()) {
                                return p0VarD;
                            }
                            if (jVar != null) {
                                wVarH = jVar.C(p0VarD.b());
                            } else {
                                wVarH = x0.h(p0VarD.b(), wVarB2.t0());
                            }
                            if (!wVarB2.getAnnotations().isEmpty()) {
                                hVarC = s0Var.c(wVarB2.getAnnotations());
                                if (hVarC != null) {
                                    a(33);
                                    throw null;
                                }
                                if (hVarC.d(g10.o.y)) {
                                    hVarC = new k10.l(hVarC, new u(i2));
                                }
                                wVarH = ab.a0.y0(wVarH, new k10.i(new k10.h[]{wVarH.getAnnotations(), hVarC}));
                            }
                            if (iC == 1) {
                                a1VarA3 = b(a1VarA3, p0VarD.a());
                            }
                            return new f0(wVarH, a1VarA3);
                        }
                        wVarB = p0Var.b();
                        a1VarA = p0Var.a();
                        if (!(wVarB.m0().g() instanceof j10.r0)) {
                            z0VarY0 = wVarB.y0();
                            if (z0VarY0 instanceof a) {
                                aVar = (a) z0VarY0;
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                a0Var = aVar.C;
                            } else {
                                a0Var = null;
                            }
                            if (a0Var != null) {
                                if (s0Var instanceof t) {
                                    tVar = (t) s0Var;
                                    if (tVar.d) {
                                        u0Var = new u0(new t(tVar.b, tVar.c, false));
                                    } else {
                                        u0Var = this;
                                    }
                                } else {
                                    u0Var = this;
                                }
                                wVarI = u0Var.i(a0Var, a1.C);
                            }
                            parameters = wVarB.m0().getParameters();
                            newArguments = wVarB.e0();
                            arrayList = new ArrayList(parameters.size());
                            z = false;
                            for (int i4 = 0; i4 < parameters.size(); i4++) {
                                r0Var2 = (j10.r0) parameters.get(i4);
                                p0Var2 = (p0) newArguments.get(i4);
                                p0VarJ = j(p0Var2, r0Var2, i + 1);
                                iB = e4.f.b(c(r0Var2.F(), p0VarJ.a()));
                                if (iB != 0) {
                                    if (iB != 1) {
                                        c = 2;
                                        if (iB == 2) {
                                        }
                                    } else {
                                        c = 2;
                                    }
                                    p0VarJ = x0.j(r0Var2);
                                } else {
                                    c = 2;
                                    a1VarF = r0Var2.F();
                                    a1Var = a1.C;
                                    if (a1VarF != a1Var) {
                                        p0VarJ = new f0(p0VarJ.b(), a1Var);
                                    }
                                }
                                if (p0VarJ != p0Var2) {
                                    z = true;
                                }
                                arrayList.add(p0VarJ);
                            }
                            if (z) {
                                newArguments = arrayList;
                            }
                            k10.h newAnnotations = s0Var.c(wVarB.getAnnotations());
                            kotlin.jvm.internal.m.e(newArguments, "newArguments");
                            kotlin.jvm.internal.m.e(newAnnotations, "newAnnotations");
                            wVarQ = c.q(wVarB, newArguments, newAnnotations, 4);
                            if (wVarQ instanceof a0) {
                                wVarQ = c.H((a0) wVarQ, (a0) wVarI);
                            }
                            return new f0(wVarQ, a1VarA);
                        }
                    }
                } else if (!g10.i.F(wVarB2) && !c.k(wVarB2)) {
                    if (p0VarD != null) {
                        iC = c(a1VarA3, p0VarD.a());
                        if (!(wVarB2.m0() instanceof r20.b)) {
                            iB2 = e4.f.b(iC);
                            if (iB2 != 1) {
                                return new f0(wVarB2.m0().d().p(), a1.E);
                            }
                            if (iB2 == 2) {
                                throw new t0("Out-projection in in-position");
                            }
                        }
                        aVarY0 = wVarB2.y0();
                        if (aVarY0 instanceof j) {
                            jVar = (j) aVarY0;
                        } else {
                            jVar = null;
                        }
                        if (jVar != null || !jVar.P()) {
                            jVar = null;
                        }
                        if (p0VarD.c()) {
                            return p0VarD;
                        }
                        if (jVar != null) {
                            wVarH = jVar.C(p0VarD.b());
                        } else {
                            wVarH = x0.h(p0VarD.b(), wVarB2.t0());
                        }
                        if (!wVarB2.getAnnotations().isEmpty()) {
                            hVarC = s0Var.c(wVarB2.getAnnotations());
                            if (hVarC != null) {
                                a(33);
                                throw null;
                            }
                            if (hVarC.d(g10.o.y)) {
                                hVarC = new k10.l(hVarC, new u(i2));
                            }
                            wVarH = ab.a0.y0(wVarH, new k10.i(new k10.h[]{wVarH.getAnnotations(), hVarC}));
                        }
                        if (iC == 1) {
                            a1VarA3 = b(a1VarA3, p0VarD.a());
                        }
                        return new f0(wVarH, a1VarA3);
                    }
                    wVarB = p0Var.b();
                    a1VarA = p0Var.a();
                    if (!(wVarB.m0().g() instanceof j10.r0)) {
                        z0VarY0 = wVarB.y0();
                        if (z0VarY0 instanceof a) {
                            aVar = (a) z0VarY0;
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                            a0Var = aVar.C;
                        } else {
                            a0Var = null;
                        }
                        if (a0Var != null) {
                            if (s0Var instanceof t) {
                                tVar = (t) s0Var;
                                if (tVar.d) {
                                    u0Var = this;
                                } else {
                                    u0Var = new u0(new t(tVar.b, tVar.c, false));
                                }
                            } else {
                                u0Var = this;
                            }
                            wVarI = u0Var.i(a0Var, a1.C);
                        }
                        parameters = wVarB.m0().getParameters();
                        newArguments = wVarB.e0();
                        arrayList = new ArrayList(parameters.size());
                        z = false;
                        while (i4 < parameters.size()) {
                            r0Var2 = (j10.r0) parameters.get(i4);
                            p0Var2 = (p0) newArguments.get(i4);
                            p0VarJ = j(p0Var2, r0Var2, i + 1);
                            iB = e4.f.b(c(r0Var2.F(), p0VarJ.a()));
                            if (iB != 0) {
                                if (iB != 1) {
                                    c = 2;
                                    if (iB == 2) {
                                    }
                                } else {
                                    c = 2;
                                }
                                p0VarJ = x0.j(r0Var2);
                            } else {
                                c = 2;
                                a1VarF = r0Var2.F();
                                a1Var = a1.C;
                                if (a1VarF != a1Var && !p0VarJ.c()) {
                                    p0VarJ = new f0(p0VarJ.b(), a1Var);
                                }
                            }
                            if (p0VarJ != p0Var2) {
                                z = true;
                            }
                            arrayList.add(p0VarJ);
                        }
                        if (z) {
                            newArguments = arrayList;
                        }
                        k10.h newAnnotations2 = s0Var.c(wVarB.getAnnotations());
                        kotlin.jvm.internal.m.e(newArguments, "newArguments");
                        kotlin.jvm.internal.m.e(newAnnotations2, "newAnnotations");
                        wVarQ = c.q(wVarB, newArguments, newAnnotations2, 4);
                        if ((wVarQ instanceof a0) && (wVarI instanceof a0)) {
                            wVarQ = c.H((a0) wVarQ, (a0) wVarI);
                        }
                        return new f0(wVarQ, a1VarA);
                    }
                }
            }
        }
        return p0Var;
    }
}
