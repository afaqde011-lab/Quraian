package f30;

import com.google.android.gms.internal.measurement.x5;
import e30.a0;
import e30.a1;
import e30.d0;
import e30.f0;
import e30.h0;
import e30.l0;
import e30.m0;
import e30.n0;
import e30.p0;
import e30.u0;
import e30.w;
import e30.x0;
import e30.z0;
import j10.r0;
import j10.v;
import j10.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class g {
    public static final eh.l a = new eh.l("KotlinTypeRefiner", 3);

    public static boolean A(h30.h a2, h30.h b) {
        kotlin.jvm.internal.m.e(a2, "a");
        kotlin.jvm.internal.m.e(b, "b");
        if (!(a2 instanceof a0)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(a2);
            sb.append(", ");
            throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, a2.getClass(), sb).toString());
        }
        if (b instanceof a0) {
            return ((a0) a2).e0() == ((a0) b).e0();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(b);
        sb2.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, b.getClass(), sb2).toString());
    }

    public static boolean B(h30.l lVar) {
        if (lVar instanceof m0) {
            return g10.i.I((m0) lVar, g10.o.a);
        }
        StringBuilder sbR = x5.r("ClassicTypeSystemContext couldn't handle: ", lVar, ", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, lVar.getClass(), sbR).toString());
    }

    public static boolean C(h30.l receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof m0) {
            return ((m0) receiver).g() instanceof j10.e;
        }
        StringBuilder sbR = x5.r("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sbR).toString());
    }

    public static boolean D(h30.l lVar) {
        if (!(lVar instanceof m0)) {
            throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, lVar.getClass(), x5.r("ClassicTypeSystemContext couldn't handle: ", lVar, ", ")).toString());
        }
        j10.h hVarG = ((m0) lVar).g();
        j10.e eVar = hVarG instanceof j10.e ? (j10.e) hVarG : null;
        return (eVar == null || eVar.g() != y.B || eVar.getKind() == j10.f.C || eVar.getKind() == j10.f.D || eVar.getKind() == j10.f.E) ? false : true;
    }

    public static boolean E(h30.l lVar) {
        if (lVar instanceof m0) {
            return ((m0) lVar).o();
        }
        StringBuilder sbR = x5.r("ClassicTypeSystemContext couldn't handle: ", lVar, ", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, lVar.getClass(), sbR).toString());
    }

    public static boolean F(h30.g receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof w) {
            return e30.c.k((w) receiver);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(receiver);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb).toString());
    }

    public static boolean G(h30.l receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (!(receiver instanceof m0)) {
            throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), x5.r("ClassicTypeSystemContext couldn't handle: ", receiver, ", ")).toString());
        }
        j10.h hVarG = ((m0) receiver).g();
        j10.e eVar = hVarG instanceof j10.e ? (j10.e) hVarG : null;
        return (eVar != null ? eVar.j0() : null) instanceof v;
    }

    public static boolean H(h30.l receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof m0) {
            return receiver instanceof s20.o;
        }
        StringBuilder sbR = x5.r("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sbR).toString());
    }

    public static boolean I(h30.l receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof m0) {
            return receiver instanceof e30.v;
        }
        StringBuilder sbR = x5.r("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sbR).toString());
    }

    public static boolean J(h30.g receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        return (receiver instanceof a0) && ((a0) receiver).t0();
    }

    public static boolean K(h30.l receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof m0) {
            return g10.i.I((m0) receiver, g10.o.b);
        }
        StringBuilder sbR = x5.r("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sbR).toString());
    }

    public static boolean L(h30.g receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof w) {
            return x0.e((w) receiver);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(receiver);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb).toString());
    }

    public static boolean M(h30.i iVar) {
        if (iVar instanceof w) {
            return g10.i.G((w) iVar);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(iVar);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, iVar.getClass(), sb).toString());
    }

    public static boolean N(h30.d dVar) {
        if (dVar instanceof h) {
            return ((h) dVar).G;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, dVar.getClass(), sb).toString());
    }

    public static boolean O(h30.k receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof p0) {
            return ((p0) receiver).c();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(receiver);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb).toString());
    }

    public static void P(h30.h receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof a0) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(receiver);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb).toString());
    }

    public static void Q(h30.h hVar) {
        if (hVar instanceof a0) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, hVar.getClass(), sb).toString());
    }

    public static a0 R(h30.f fVar) {
        if (fVar instanceof e30.q) {
            return ((e30.q) fVar).B;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, fVar.getClass(), sb).toString());
    }

    public static z0 S(h30.d dVar) {
        if (dVar instanceof h) {
            return ((h) dVar).D;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, dVar.getClass(), sb).toString());
    }

    public static z0 T(h30.g gVar) {
        if (gVar instanceof z0) {
            return e30.c.n((z0) gVar, false);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(gVar);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, gVar.getClass(), sb).toString());
    }

    public static int U(h30.l receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof m0) {
            return ((m0) receiver).getParameters().size();
        }
        StringBuilder sbR = x5.r("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sbR).toString());
    }

    public static Collection V(b bVar, h30.h hVar) {
        h30.l lVarX = bVar.X(hVar);
        if (lVarX instanceof s20.o) {
            return ((s20.o) lVarX).A;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, hVar.getClass(), sb).toString());
    }

    public static p0 W(h30.c receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof i) {
            return ((i) receiver).A;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(receiver);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb).toString());
    }

    public static w X(h30.n receiver, h30.g type) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        kotlin.jvm.internal.m.e(type, "type");
        if (!(type instanceof z0)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(type);
            sb.append(", ");
            throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, type.getClass(), sb).toString());
        }
        if (receiver instanceof u0) {
            return ((u0) receiver).g((w) type, a1.C);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(receiver);
        sb2.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb2).toString());
    }

    public static a Y(b bVar, h30.h hVar) {
        if (hVar instanceof a0) {
            w wVar = (w) hVar;
            return new a(bVar, new u0(n0.b.g(wVar.m0(), wVar.e0())));
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(hVar);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, hVar.getClass(), sb).toString());
    }

    public static Collection Z(h30.l receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof m0) {
            Collection collectionL = ((m0) receiver).l();
            kotlin.jvm.internal.m.d(collectionL, "getSupertypes(...)");
            return collectionL;
        }
        StringBuilder sbR = x5.r("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sbR).toString());
    }

    public static void a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static m0 a0(h30.h receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof a0) {
            return ((a0) receiver).m0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(receiver);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb).toString());
    }

    public static boolean b(h30.l c1, h30.l c2) {
        kotlin.jvm.internal.m.e(c1, "c1");
        kotlin.jvm.internal.m.e(c2, "c2");
        if (!(c1 instanceof m0)) {
            StringBuilder sbR = x5.r("ClassicTypeSystemContext couldn't handle: ", c1, ", ");
            throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, c1.getClass(), sbR).toString());
        }
        if (c2 instanceof m0) {
            return c1.equals(c2);
        }
        StringBuilder sbR2 = x5.r("ClassicTypeSystemContext couldn't handle: ", c2, ", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, c2.getClass(), sbR2).toString());
    }

    public static i b0(h30.d dVar) {
        if (dVar instanceof h) {
            return ((h) dVar).C;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, dVar.getClass(), sb).toString());
    }

    public static int c(h30.g receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof w) {
            return ((w) receiver).e0().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(receiver);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb).toString());
    }

    public static a0 c0(h30.f fVar) {
        if (fVar instanceof e30.q) {
            return ((e30.q) fVar).C;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, fVar.getClass(), sb).toString());
    }

    public static h30.j d(h30.h receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof a0) {
            return (h30.j) receiver;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(receiver);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb).toString());
    }

    public static a0 d0(h30.h receiver, boolean z) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof a0) {
            return ((a0) receiver).z0(z);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(receiver);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb).toString());
    }

    public static h30.d e(b bVar, h30.i receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof a0) {
            if (receiver instanceof d0) {
                return bVar.m0(((d0) receiver).B);
            }
            if (receiver instanceof h) {
                return (h) receiver;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(receiver);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb).toString());
    }

    public static h30.g e0(b bVar, h30.g gVar) {
        if (gVar instanceof h30.h) {
            return bVar.b((h30.h) gVar);
        }
        if (!(gVar instanceof h30.f)) {
            throw new IllegalStateException("sealed");
        }
        h30.f fVar = (h30.f) gVar;
        return bVar.n(bVar.b((h30.h) bVar.c(fVar)), bVar.b((h30.h) bVar.a(fVar)));
    }

    public static e30.l f(h30.h receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof a0) {
            if (receiver instanceof e30.l) {
                return (e30.l) receiver;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(receiver);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb).toString());
    }

    public static e30.q g(h30.g receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof w) {
            z0 z0VarY0 = ((w) receiver).y0();
            if (z0VarY0 instanceof e30.q) {
                return (e30.q) z0VarY0;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(receiver);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb).toString());
    }

    public static a0 h(h30.g receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof w) {
            z0 z0VarY0 = ((w) receiver).y0();
            if (z0VarY0 instanceof a0) {
                return (a0) z0VarY0;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(receiver);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb).toString());
    }

    public static f0 i(h30.g gVar) {
        if (gVar instanceof w) {
            return ab.a0.p((w) gVar);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(gVar);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, gVar.getClass(), sb).toString());
    }

    public static a0 j(h30.h hVar) {
        List listE0;
        ArrayList arrayList;
        e eVar;
        h30.b bVar = h30.b.A;
        if (!(hVar instanceof a0)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(hVar);
            sb.append(", ");
            throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, hVar.getClass(), sb).toString());
        }
        a0 a0Var = (a0) hVar;
        c30.e eVar2 = null;
        if (a0Var.e0().size() == a0Var.m0().getParameters().size() && ((listE0 = a0Var.e0()) == null || !listE0.isEmpty())) {
            Iterator it = listE0.iterator();
            while (it.hasNext()) {
                if (((p0) it.next()).a() != a1.C) {
                    List parameters = a0Var.m0().getParameters();
                    kotlin.jvm.internal.m.d(parameters, "getParameters(...)");
                    ArrayList<g00.k> arrayListT1 = h00.q.t1(listE0, parameters);
                    arrayList = new ArrayList(h00.r.q0(arrayListT1, 10));
                    for (g00.k kVar : arrayListT1) {
                        p0 p0VarP = (p0) kVar.A;
                        r0 r0Var = (r0) kVar.B;
                        if (p0VarP.a() != a1.C) {
                            z0 z0VarY0 = (p0VarP.c() || p0VarP.a() != a1.D) ? null : p0VarP.b().y0();
                            kotlin.jvm.internal.m.b(r0Var);
                            p0VarP = ab.a0.p(new h(bVar, new i(p0VarP, eVar2, r0Var, 6), z0VarY0, (h0) null, false, 56));
                        }
                        arrayList.add(p0VarP);
                    }
                    u0 u0Var = new u0(n0.b.g(a0Var.m0(), arrayList));
                    int size = listE0.size();
                    for (int i = 0; i < size; i++) {
                        p0 p0Var = (p0) listE0.get(i);
                        p0 p0Var2 = (p0) arrayList.get(i);
                        if (p0Var.a() != a1.C) {
                            List upperBounds = ((r0) a0Var.m0().getParameters().get(i)).getUpperBounds();
                            kotlin.jvm.internal.m.d(upperBounds, "getUpperBounds(...)");
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = upperBounds.iterator();
                            while (true) {
                                boolean zHasNext = it2.hasNext();
                                eVar = e.a;
                                if (!zHasNext) {
                                    break;
                                }
                                arrayList2.add(eVar.a(u0Var.g((w) it2.next(), a1.C).y0()));
                            }
                            if (!p0Var.c() && p0Var.a() == a1.E) {
                                arrayList2.add(eVar.a(p0Var.b().y0()));
                            }
                            w wVarB = p0Var2.b();
                            kotlin.jvm.internal.m.c(wVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                            i iVar = ((h) wVarB).C;
                            iVar.getClass();
                            iVar.B = new c30.e(2, arrayList2);
                        }
                    }
                }
            }
            arrayList = null;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            return e30.c.u(a0Var.k0(), a0Var.m0(), arrayList, a0Var.t0());
        }
        return null;
    }

    public static h30.b k(h30.d dVar) {
        if (dVar instanceof h) {
            return ((h) dVar).B;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, dVar.getClass(), sb).toString());
    }

    public static l0 l(boolean z, m mVar, e eVar, int i) {
        if ((i & 4) != 0) {
            mVar = m.A;
        }
        m mVar2 = mVar;
        if ((i & 8) != 0) {
            eVar = e.a;
        }
        return new l0(z, true, mVar2, eVar, f.a);
    }

    public static z0 m(b bVar, h30.h lowerBound, h30.h upperBound) {
        kotlin.jvm.internal.m.e(lowerBound, "lowerBound");
        kotlin.jvm.internal.m.e(upperBound, "upperBound");
        if (!(lowerBound instanceof a0)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(bVar);
            sb.append(", ");
            throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, bVar.getClass(), sb).toString());
        }
        if (upperBound instanceof a0) {
            return e30.c.f((a0) lowerBound, (a0) upperBound);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(bVar);
        sb2.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, bVar.getClass(), sb2).toString());
    }

    public static final String n(m0 m0Var) {
        StringBuilder sb = new StringBuilder();
        o("type: " + m0Var, sb);
        o("hashCode: " + m0Var.hashCode(), sb);
        o("javaClass: " + m0Var.getClass().getCanonicalName(), sb);
        for (j10.k kVarG = m0Var.g(); kVarG != null; kVarG = kVarG.l()) {
            o("fqName: " + p20.h.c.w(kVarG), sb);
            o("javaClass: " + kVarG.getClass().getCanonicalName(), sb);
        }
        return sb.toString();
    }

    public static final void o(String str, StringBuilder sb) {
        kotlin.jvm.internal.m.e(str, "<this>");
        sb.append(str);
        sb.append('\n');
    }

    public static h30.k p(h30.g receiver, int i) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof w) {
            return (h30.k) ((w) receiver).e0().get(i);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(receiver);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb).toString());
    }

    public static List q(h30.g receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof w) {
            return ((w) receiver).e0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(receiver);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb).toString());
    }

    public static h30.m r(h30.l receiver, int i) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof m0) {
            Object obj = ((m0) receiver).getParameters().get(i);
            kotlin.jvm.internal.m.d(obj, "get(...)");
            return (h30.m) obj;
        }
        StringBuilder sbR = x5.r("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sbR).toString());
    }

    public static List s(h30.l receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof m0) {
            List parameters = ((m0) receiver).getParameters();
            kotlin.jvm.internal.m.d(parameters, "getParameters(...)");
            return parameters;
        }
        StringBuilder sbR = x5.r("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sbR).toString());
    }

    public static w t(h30.m receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof r0) {
            return ab.a0.g0((r0) receiver);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(receiver);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb).toString());
    }

    public static z0 u(b bVar, h30.k receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (bVar.g0(receiver)) {
            return null;
        }
        if (receiver instanceof p0) {
            return ((p0) receiver).b().y0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(receiver);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb).toString());
    }

    public static r0 v(h30.l receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (!(receiver instanceof m0)) {
            StringBuilder sbR = x5.r("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
            throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sbR).toString());
        }
        j10.h hVarG = ((m0) receiver).g();
        if (hVarG instanceof r0) {
            return (r0) hVarG;
        }
        return null;
    }

    public static h30.p w(h30.k receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof p0) {
            a1 a1VarA = ((p0) receiver).a();
            kotlin.jvm.internal.m.d(a1VarA, "getProjectionKind(...)");
            return f50.c.q(a1VarA);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(receiver);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb).toString());
    }

    public static h30.p x(h30.m receiver) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        if (receiver instanceof r0) {
            a1 a1VarF = ((r0) receiver).F();
            kotlin.jvm.internal.m.d(a1VarF, "getVariance(...)");
            return f50.c.q(a1VarF);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(receiver);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb).toString());
    }

    public static boolean y(h30.g receiver, n20.c fqName) {
        kotlin.jvm.internal.m.e(receiver, "$receiver");
        kotlin.jvm.internal.m.e(fqName, "fqName");
        if (receiver instanceof w) {
            return ((w) receiver).getAnnotations().d(fqName);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(receiver);
        sb.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, receiver.getClass(), sb).toString());
    }

    public static boolean z(h30.m mVar, h30.l lVar) {
        if (!(mVar instanceof r0)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(mVar);
            sb.append(", ");
            throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, mVar.getClass(), sb).toString());
        }
        r0 r0Var = (r0) mVar;
        if (lVar == null ? true : lVar instanceof m0) {
            return ab.a0.h0(r0Var, (m0) lVar, (Set) null);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(r0Var);
        sb2.append(", ");
        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, r0Var.getClass(), sb2).toString());
    }
}
