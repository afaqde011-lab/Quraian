package k30;

import e30.a0;
import e30.z0;
import j10.q0;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m10.r0;

public final class h implements u00.k {
    public static final h B = new h(0);
    public static final h C = new h(1);
    public static final h D = new h(2);
    public static final h E = new h(3);
    public static final h F = new h(4);
    public static final h G = new h(5);
    public static final h H = new h(6);
    public static final h I = new h(7);
    public static final h J = new h(8);
    public final int A;

    public h(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj) throws IOException {
        a0 a0VarN;
        z0 z0VarZ0;
        e30.w returnType;
        n20.b bVarF;
        e30.w returnType2;
        boolean zB;
        boolean z = true;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e((j10.u) obj, "<this>");
                return null;
            case 1:
                kotlin.jvm.internal.m.e((j10.u) obj, "<this>");
                return null;
            case 2:
                kotlin.jvm.internal.m.e((j10.u) obj, "<this>");
                return null;
            case 3:
                j10.u Checks = (j10.u) obj;
                List list = q.c;
                kotlin.jvm.internal.m.e(Checks, "$this$Checks");
                List listO = Checks.O();
                kotlin.jvm.internal.m.d(listO, "getValueParameters(...)");
                r0 r0Var = (r0) h00.q.U0(listO);
                if (r0Var == null || u20.d.a(r0Var) || r0Var.K != null) {
                    return "last parameter should not have a default value or be a vararg";
                }
                return null;
            case 4:
                j10.u Checks2 = (j10.u) obj;
                List list2 = q.c;
                kotlin.jvm.internal.m.e(Checks2, "$this$Checks");
                j10.k kVarL = Checks2.l();
                kotlin.jvm.internal.m.d(kVarL, "getContainingDeclaration(...)");
                if (kVarL instanceof j10.e) {
                    n20.e eVar = g10.i.e;
                    if (g10.i.b((j10.e) kVarL, g10.o.a)) {
                        return null;
                    }
                }
                Collection collectionM = Checks2.m();
                kotlin.jvm.internal.m.d(collectionM, "getOverriddenDescriptors(...)");
                Collection collection = collectionM;
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        j10.k kVarL2 = ((j10.u) it.next()).l();
                        kotlin.jvm.internal.m.d(kVarL2, "getContainingDeclaration(...)");
                        if (kVarL2 instanceof j10.e) {
                            n20.e eVar2 = g10.i.e;
                            if (g10.i.b((j10.e) kVarL2, g10.o.a)) {
                                return null;
                            }
                        }
                    }
                }
                j10.k kVarL3 = Checks2.l();
                j10.e eVar3 = kVarL3 instanceof j10.e ? (j10.e) kVarL3 : null;
                if (eVar3 != null) {
                    if (!q20.f.e(eVar3)) {
                        eVar3 = null;
                    }
                    if (eVar3 != null && (a0VarN = eVar3.n()) != null && (z0VarZ0 = ab.a0.z0(a0VarN)) != null && (returnType = Checks2.getReturnType()) != null && kotlin.jvm.internal.m.a(((m10.m) Checks2).getName(), r.d)) {
                        n20.e eVar4 = g10.i.e;
                        if ((g10.i.C(returnType, g10.o.h) || g10.i.F(returnType)) && Checks2.O().size() == 1) {
                            e30.w type = ((r0) Checks2.O().get(0)).getType();
                            kotlin.jvm.internal.m.d(type, "getType(...)");
                            if (kotlin.jvm.internal.m.a(ab.a0.z0(type), z0VarZ0) && Checks2.b0().isEmpty() && Checks2.X() == null) {
                                return null;
                            }
                        }
                    }
                }
                StringBuilder sb = new StringBuilder("must override ''equals()'' in Any");
                j10.k kVarL4 = Checks2.l();
                kotlin.jvm.internal.m.d(kVarL4, "getContainingDeclaration(...)");
                if (q20.f.e(kVarL4)) {
                    p20.h hVar = p20.h.d;
                    j10.k kVarL5 = Checks2.l();
                    kotlin.jvm.internal.m.c(kVarL5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    a0 a0VarN2 = ((j10.e) kVarL5).n();
                    kotlin.jvm.internal.m.d(a0VarN2, "getDefaultType(...)");
                    sb.append(" or define ''equals(other: " + hVar.X(ab.a0.z0(a0VarN2)) + "): Boolean''");
                }
                return sb.toString();
            case 5:
                j10.u Checks3 = (j10.u) obj;
                List list3 = q.c;
                kotlin.jvm.internal.m.e(Checks3, "$this$Checks");
                m10.u uVarT = Checks3.T();
                if (uVarT == null) {
                    uVarT = Checks3.X();
                }
                if (uVarT == null) {
                    z = false;
                } else {
                    e30.w returnType3 = Checks3.getReturnType();
                    if (!(returnType3 != null ? f30.d.a.b(returnType3, uVarT.getType()) : false)) {
                        y20.d dVarY0 = uVarT.Y0();
                        kotlin.jvm.internal.m.d(dVarY0, "getValue(...)");
                        if (dVarY0 instanceof y20.c) {
                            j10.e eVar5 = ((y20.c) dVarY0).A;
                            if (eVar5.E() && (bVarF = u20.d.f(eVar5)) != null) {
                                j10.h hVarE = j10.w.e(u20.d.j(eVar5), bVarF);
                                q0 q0Var = hVarE instanceof q0 ? (q0) hVarE : null;
                                if (q0Var == null || (returnType2 = Checks3.getReturnType()) == null) {
                                    zB = false;
                                } else {
                                    zB = f30.d.a.b(returnType2, ((c30.u) q0Var).Z0());
                                }
                            } else {
                                zB = false;
                            }
                        } else {
                            zB = false;
                        }
                        if (!zB) {
                            z = false;
                        }
                    }
                }
                if (z) {
                    return null;
                }
                return "receiver must be a supertype of the return type";
            case 6:
                g10.i iVar = (g10.i) obj;
                s sVar = s.c;
                kotlin.jvm.internal.m.e(iVar, "<this>");
                return iVar.t(g10.k.BOOLEAN);
            case 7:
                g10.i iVar2 = (g10.i) obj;
                t tVar = t.c;
                kotlin.jvm.internal.m.e(iVar2, "<this>");
                return iVar2.t(g10.k.INT);
            default:
                g10.i iVar3 = (g10.i) obj;
                u uVar = u.c;
                kotlin.jvm.internal.m.e(iVar3, "<this>");
                return iVar3.x();
        }
    }
}
