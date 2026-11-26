package d10;

import com.google.android.gms.internal.measurement.g4;
import java.lang.reflect.Method;

public abstract class c2 {
    public static final n20.b a;

    static {
        n20.c cVar = new n20.c("java.lang.Void");
        a = new n20.b(cVar.b(), cVar.a.g());
    }

    public static v0 a(j10.u uVar) {
        String strM = g4.M(uVar);
        if (strM == null) {
            if (uVar instanceof m10.j0) {
                String strB = u20.d.k(uVar).getName().b();
                kotlin.jvm.internal.m.d(strB, "asString(...)");
                strM = x10.u.a(strB);
            } else if (uVar instanceof m10.k0) {
                String strB2 = u20.d.k(uVar).getName().b();
                kotlin.jvm.internal.m.d(strB2, "asString(...)");
                strM = x10.u.b(strB2);
            } else {
                strM = ((m10.m) uVar).getName().b();
                kotlin.jvm.internal.m.d(strM, "asString(...)");
            }
        }
        return new v0(new m20.e(strM, c7.i.u(uVar, 1)));
    }

    public static qd.s0 b(j10.l0 possiblyOverriddenProperty) {
        kotlin.jvm.internal.m.e(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        j10.l0 l0VarA = ((j10.l0) q20.d.r(possiblyOverriddenProperty)).a();
        kotlin.jvm.internal.m.d(l0VarA, "getOriginal(...)");
        if (l0VarA instanceof c30.s) {
            c30.s sVar = (c30.s) l0VarA;
            i20.j0 j0Var = sVar.b0;
            o20.n propertySignature = l20.j.d;
            kotlin.jvm.internal.m.d(propertySignature, "propertySignature");
            l20.d dVar = (l20.d) w00.a.u(j0Var, propertySignature);
            if (dVar != null) {
                return new y0(l0VarA, j0Var, dVar, sVar.c0, sVar.d0);
            }
        } else if (l0VarA instanceof z10.f) {
            z10.f fVar = (z10.f) l0VarA;
            j10.n0 n0VarO = fVar.o();
            o10.g gVar = n0VarO instanceof o10.g ? (o10.g) n0VarO : null;
            p10.s sVar2 = gVar != null ? gVar.A : null;
            if (sVar2 instanceof p10.u) {
                return new w0(((p10.u) sVar2).a);
            }
            if (!(sVar2 instanceof p10.x)) {
                throw new a40.b0("Incorrect resolution sequence for Java field " + l0VarA + " (source = " + sVar2 + ')');
            }
            Method method = ((p10.x) sVar2).a;
            m10.k0 k0Var = fVar.Y;
            j10.n0 n0VarO2 = k0Var != null ? k0Var.o() : null;
            o10.g gVar2 = n0VarO2 instanceof o10.g ? (o10.g) n0VarO2 : null;
            p10.s sVar3 = gVar2 != null ? gVar2.A : null;
            p10.x xVar = sVar3 instanceof p10.x ? (p10.x) sVar3 : null;
            return new x0(method, xVar != null ? xVar.a : null);
        }
        m10.j0 j0VarB = l0VarA.b();
        kotlin.jvm.internal.m.b(j0VarB);
        v0 v0VarA = a(j0VarB);
        m10.k0 k0VarC = l0VarA.c();
        return new z0(v0VarA, k0VarC != null ? a(k0VarC) : null);
    }

    public static p30.f c(j10.u possiblySubstitutedFunction) {
        Method method;
        kotlin.jvm.internal.m.e(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        j10.u uVarA = ((j10.u) q20.d.r(possiblySubstitutedFunction)).a();
        kotlin.jvm.internal.m.d(uVarA, "getOriginal(...)");
        if (!(uVarA instanceof c30.b)) {
            if (uVarA instanceof z10.e) {
                j10.n0 n0VarO = ((z10.e) uVarA).o();
                o10.g gVar = n0VarO instanceof o10.g ? (o10.g) n0VarO : null;
                p10.s sVar = gVar != null ? gVar.A : null;
                p10.x xVar = sVar instanceof p10.x ? (p10.x) sVar : null;
                if (xVar != null && (method = xVar.a) != null) {
                    return new t0(method);
                }
                throw new a40.b0("Incorrect resolution sequence for Java method " + uVarA);
            }
            if (!(uVarA instanceof z10.b)) {
                m10.m mVar = (m10.m) uVarA;
                if ((mVar.getName().equals(g10.p.c) && q20.k.n(uVarA)) || ((mVar.getName().equals(g10.p.a) && q20.k.n(uVarA)) || (kotlin.jvm.internal.m.a(mVar.getName(), i10.a.e) && uVarA.O().isEmpty()))) {
                    return a(uVarA);
                }
                throw new a40.b0("Unknown origin of " + uVarA + " (" + uVarA.getClass() + ')');
            }
            j10.n0 n0VarO2 = ((z10.b) uVarA).o();
            o10.g gVar2 = n0VarO2 instanceof o10.g ? (o10.g) n0VarO2 : null;
            Object obj = gVar2 != null ? gVar2.A : null;
            if (obj instanceof p10.r) {
                return new s0(((p10.r) obj).a);
            }
            if (obj instanceof p10.o) {
                Class cls = ((p10.o) obj).a;
                if (cls.isAnnotation()) {
                    return new r0(cls);
                }
            }
            throw new a40.b0("Incorrect resolution sequence for Java constructor " + uVarA + " (" + obj + ')');
        }
        c30.l lVar = (c30.l) uVarA;
        o20.b bVarZ = lVar.z();
        if (bVarZ instanceof i20.b0) {
            o20.h hVar = m20.g.a;
            m20.e eVarC = m20.g.c((i20.b0) bVarZ, lVar.Q(), lVar.L());
            if (eVarC != null) {
                return new v0(eVarC);
            }
        }
        if (bVarZ instanceof i20.n) {
            o20.h hVar2 = m20.g.a;
            m20.e eVarA = m20.g.a((i20.n) bVarZ, lVar.Q(), lVar.L());
            if (eVarA != null) {
                String name = eVarA.b;
                String str = eVarA.c;
                j10.k kVarL = possiblySubstitutedFunction.l();
                kotlin.jvm.internal.m.d(kVarL, "getContainingDeclaration(...)");
                if (q20.f.b(kVarL)) {
                    return new v0(eVarA);
                }
                j10.k kVarL2 = possiblySubstitutedFunction.l();
                kotlin.jvm.internal.m.d(kVarL2, "getContainingDeclaration(...)");
                if (!q20.f.c(kVarL2)) {
                    return new u0(eVarA);
                }
                j10.j jVar = (j10.j) possiblySubstitutedFunction;
                if (jVar.w()) {
                    if (!kotlin.jvm.internal.m.a(name, "constructor-impl") || !r30.r.p0(str, ")V", false)) {
                        throw new IllegalArgumentException(("Invalid signature: " + eVarA).toString());
                    }
                } else {
                    if (!kotlin.jvm.internal.m.a(name, "constructor-impl")) {
                        throw new IllegalArgumentException(("Invalid signature: " + eVarA).toString());
                    }
                    j10.e eVarX = jVar.x();
                    kotlin.jvm.internal.m.d(eVarX, "getConstructedClass(...)");
                    n20.b bVarF = u20.d.f(eVarX);
                    kotlin.jvm.internal.m.b(bVarF);
                    String strB = m20.b.b(bVarF.b());
                    if (r30.r.p0(str, ")V", false)) {
                        String desc = r30.k.S0(str, "V") + strB;
                        kotlin.jvm.internal.m.e(name, "name");
                        kotlin.jvm.internal.m.e(desc, "desc");
                        eVarA = new m20.e(name, desc);
                    } else if (!r30.r.p0(str, strB, false)) {
                        throw new IllegalArgumentException(("Invalid signature: " + eVarA).toString());
                    }
                }
                return new v0(eVarA);
            }
        }
        return a(uVarA);
    }
}
