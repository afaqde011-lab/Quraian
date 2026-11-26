package p30;

import a10.a0;
import a10.x;
import a10.z;
import a40.b0;
import com.google.android.gms.internal.measurement.x5;
import d10.j1;
import d10.r1;
import e30.z0;
import h00.d0;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import qd.s0;
import s10.l1;
import s10.n0;

public final class q implements h30.o {
    public static final q A = new q();

    public static void l(Object obj) {
        throw new b0(x5.l(obj, "This method should not be called on ", " with a new kotlin-reflect implementation. Please file an issue at https://kotl.in/issue"));
    }

    @Override
    public int A(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        return ((x) gVar).r().size();
    }

    @Override
    public boolean A0(z0 z0Var) {
        kotlin.jvm.internal.m.e(z0Var, "<this>");
        return e(y0(z0Var)) != e(v0(z0Var));
    }

    @Override
    public h30.j B0(h30.h hVar) {
        kotlin.jvm.internal.m.e(hVar, "<this>");
        return (h30.j) hVar;
    }

    @Override
    public boolean C(h30.l lVar) {
        kotlin.jvm.internal.m.e(lVar, "<this>");
        return false;
    }

    @Override
    public h30.p C0(h30.k kVar) {
        kotlin.jvm.internal.m.e(kVar, "<this>");
        a0 a0Var = ((k) kVar).a.a;
        if (a0Var == null) {
            return h30.p.OUT;
        }
        int iOrdinal = a0Var.ordinal();
        if (iOrdinal == 0) {
            return h30.p.INV;
        }
        if (iOrdinal == 1) {
            return h30.p.IN;
        }
        if (iOrdinal == 2) {
            return h30.p.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override
    public h30.p D(h30.m mVar) {
        kotlin.jvm.internal.m.e(mVar, "<this>");
        int iOrdinal = ((r1) mVar).D.ordinal();
        if (iOrdinal == 0) {
            return h30.p.INV;
        }
        if (iOrdinal == 1) {
            return h30.p.IN;
        }
        if (iOrdinal == 2) {
            return h30.p.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override
    public h30.k D0(h30.g gVar) {
        l(gVar);
        throw null;
    }

    @Override
    public int E(h30.j jVar) {
        kotlin.jvm.internal.m.e(jVar, "<this>");
        if (jVar instanceof h30.h) {
            return A((h30.g) jVar);
        }
        if (jVar instanceof h30.a) {
            return ((h30.a) jVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + jVar + ", " + kotlin.jvm.internal.a0.a.b(jVar.getClass())).toString());
    }

    @Override
    public h30.g E0(h30.k kVar) {
        kotlin.jvm.internal.m.e(kVar, "<this>");
        return (h30.g) ((k) kVar).a.b;
    }

    @Override
    public void F(h30.h hVar) {
        kotlin.jvm.internal.m.e(hVar, "<this>");
    }

    @Override
    public h30.h F0(h30.h hVar) {
        List listR;
        int i;
        h30.b bVar = h30.b.A;
        x xVar = (x) hVar;
        a10.e eVarS = xVar.s();
        a10.d dVar = eVarS instanceof a10.d ? (a10.d) eVarS : null;
        if (dVar != null && ((listR = xVar.r()) == null || !listR.isEmpty())) {
            Iterator it = listR.iterator();
            while (it.hasNext()) {
                if (((z) it.next()).a != a0.A) {
                    List listW = f.W(dVar);
                    if (listW.size() != listR.size()) {
                        break;
                    }
                    ArrayList arrayList = new ArrayList(h00.r.q0(listR, 10));
                    Iterator it2 = listR.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        z zVarI = (z) it2.next();
                        a0 a0Var = zVarI.a;
                        if (a0Var != a0.A) {
                            x xVar2 = zVarI.b;
                            if (a0Var != a0.B) {
                                xVar2 = null;
                            }
                            z zVar = z.c;
                            zVarI = a.a.I(new c(xVar2, new d(zVarI), false));
                        }
                        arrayList.add(zVarI);
                    }
                    l lVar = new l(d0.Y(h00.q.t1(f.W(dVar), arrayList)));
                    int size = listR.size();
                    for (i = 0; i < size; i++) {
                        z zVar2 = (z) listR.get(i);
                        if (zVar2.a != a0.A) {
                            List list = ((r1) listW.get(i)).F;
                            if (list == null) {
                                kotlin.jvm.internal.m.k("upperBounds");
                                throw null;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                x xVar3 = lVar.a((x) it3.next()).b;
                                kotlin.jvm.internal.m.b(xVar3);
                                arrayList2.add(xVar3);
                            }
                            if (zVar2.a == a0.C) {
                                x xVar4 = zVar2.b;
                                kotlin.jvm.internal.m.b(xVar4);
                                arrayList2.add(xVar4);
                            }
                            x xVar5 = ((z) arrayList.get(i)).b;
                            kotlin.jvm.internal.m.c(xVar5, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.types.CapturedKType");
                            d dVar2 = ((c) xVar5).C;
                            dVar2.getClass();
                            dVar2.B = arrayList2;
                        }
                    }
                    boolean zF = xVar.f();
                    List annotations = xVar.getAnnotations();
                    boolean z = xVar instanceof a;
                    a aVar = z ? (a) xVar : null;
                    x xVarD = aVar != null ? aVar.d() : null;
                    a aVar2 = z ? (a) xVar : null;
                    return new r(dVar, arrayList, zF, annotations, xVarD, false, false, false, aVar2 != null ? aVar2.g() : null, null);
                }
            }
        }
        return null;
    }

    @Override
    public Collection G(h30.h hVar) {
        l(hVar);
        throw null;
    }

    @Override
    public boolean H(h30.h hVar) {
        kotlin.jvm.internal.m.e(hVar, "<this>");
        return g(hVar) != null;
    }

    @Override
    public h30.f I(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        if (!(gVar instanceof a) || ((a) gVar).x() == null) {
            return null;
        }
        return (h30.f) gVar;
    }

    @Override
    public boolean J(h30.l lVar) {
        return lVar.equals(kotlin.jvm.internal.a0.a.b(Object.class));
    }

    @Override
    public h30.l K(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        h30.h hVarS = S(gVar);
        if (hVarS == null) {
            hVarS = y0(gVar);
        }
        return X(hVarS);
    }

    @Override
    public h30.k Q(h30.g gVar, int i) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        return new k((z) ((x) gVar).r().get(i));
    }

    @Override
    public h30.m R(h30.l lVar, int i) {
        kotlin.jvm.internal.m.e(lVar, "<this>");
        Object obj = f.W((a10.d) lVar).get(i);
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeParameterImpl");
        return (r1) obj;
    }

    @Override
    public h30.h S(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        if (I(gVar) != null) {
            return null;
        }
        return (h30.h) gVar;
    }

    @Override
    public boolean T(h30.h hVar) {
        C(X(hVar));
        return false;
    }

    @Override
    public h30.k V(h30.j jVar, int i) {
        kotlin.jvm.internal.m.e(jVar, "<this>");
        if (jVar instanceof h30.i) {
            return Q((h30.g) jVar, i);
        }
        if (jVar instanceof h30.a) {
            E e = ((h30.a) jVar).get(i);
            kotlin.jvm.internal.m.d(e, "get(...)");
            return (h30.k) e;
        }
        throw new IllegalStateException(("unknown type argument list type: " + jVar + ", " + kotlin.jvm.internal.a0.a.b(jVar.getClass())).toString());
    }

    @Override
    public boolean W(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        return !kotlin.jvm.internal.m.a(X(y0(gVar)), X(v0(gVar)));
    }

    @Override
    public h30.l X(h30.h hVar) {
        Class<?> componentType;
        kotlin.jvm.internal.m.e(hVar, "<this>");
        if (hVar instanceof c) {
            return ((c) hVar).C;
        }
        a aVar = (a) hVar;
        if (aVar.t()) {
            return o.B;
        }
        a10.e eVarS = aVar.s();
        j1 j1Var = eVarS instanceof j1 ? (j1) eVarS : null;
        if (j1Var != null && (componentType = k00.f.D(j1Var).getComponentType()) != null && !componentType.isPrimitive()) {
            return (h30.l) kotlin.jvm.internal.a0.a.b(Object[].class);
        }
        a10.e eVarG = aVar.g();
        if (eVarG == null) {
            eVarG = aVar.s();
        }
        kotlin.jvm.internal.m.c(eVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.types.model.TypeConstructorMarker");
        return (h30.l) eVarG;
    }

    @Override
    public boolean Y(h30.h a, h30.h b) {
        kotlin.jvm.internal.m.e(a, "a");
        kotlin.jvm.internal.m.e(b, "b");
        return false;
    }

    @Override
    public h30.g Z(ArrayList arrayList) {
        l(this);
        throw null;
    }

    @Override
    public h30.h a(h30.f fVar) {
        a aVarA = ((a) fVar).A();
        kotlin.jvm.internal.m.c(aVarA, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.types.AbstractKType");
        return aVarA;
    }

    @Override
    public h30.h b(h30.h hVar) {
        kotlin.jvm.internal.m.e(hVar, "<this>");
        return ((a) hVar).z(false);
    }

    @Override
    public boolean b0(h30.l c1, h30.l c2) {
        kotlin.jvm.internal.m.e(c1, "c1");
        kotlin.jvm.internal.m.e(c2, "c2");
        return c1.equals(c2);
    }

    @Override
    public h30.h c(h30.f fVar) {
        a aVarX = ((a) fVar).x();
        kotlin.jvm.internal.m.c(aVarX, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.types.AbstractKType");
        return aVarX;
    }

    @Override
    public boolean d0(h30.h hVar) {
        kotlin.jvm.internal.m.e(hVar, "<this>");
        if (!j0(K(hVar))) {
            return false;
        }
        l(hVar);
        throw null;
    }

    @Override
    public boolean e(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        return ((x) gVar).f();
    }

    @Override
    public int e0(h30.l lVar) {
        kotlin.jvm.internal.m.e(lVar, "<this>");
        if (lVar instanceof a10.d) {
            return f.W((a10.d) lVar).size();
        }
        return 0;
    }

    @Override
    public boolean f(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        return false;
    }

    public h30.e g(h30.h hVar) {
        kotlin.jvm.internal.m.e(hVar, "<this>");
        if ((hVar instanceof a) && ((a) hVar).o()) {
            return (h30.e) hVar;
        }
        return null;
    }

    @Override
    public boolean g0(h30.k kVar) {
        kotlin.jvm.internal.m.e(kVar, "<this>");
        z zVar = ((k) kVar).a;
        z zVar2 = z.c;
        return kotlin.jvm.internal.m.a(zVar, z.c);
    }

    @Override
    public h30.g h(h30.d dVar) {
        return (h30.g) ((c) dVar).B;
    }

    @Override
    public void i(h30.h hVar) {
    }

    @Override
    public boolean i0(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        h30.h hVarS = S(gVar);
        return (hVarS != null ? g(hVarS) : null) != null;
    }

    @Override
    public h30.b j(h30.d dVar) {
        return h30.b.A;
    }

    @Override
    public boolean j0(h30.l lVar) {
        kotlin.jvm.internal.m.e(lVar, "<this>");
        return lVar.equals(kotlin.jvm.internal.a0.a.b(Void.class));
    }

    @Override
    public h30.k k(h30.c cVar) {
        kotlin.jvm.internal.m.e(cVar, "<this>");
        return new k(((d) cVar).A);
    }

    @Override
    public boolean k0(h30.d dVar) {
        return false;
    }

    @Override
    public h30.k l0(h30.h hVar, int i) {
        if (i < 0 || i >= A(hVar)) {
            return null;
        }
        return Q(hVar, i);
    }

    @Override
    public e30.c m(h30.h hVar) {
        l lVar = l.b;
        x xVar = (x) hVar;
        q qVar = A;
        h30.l lVarX = qVar.X((a) xVar);
        int iE0 = qVar.e0(lVarX);
        ArrayList arrayList = new ArrayList(iE0);
        for (int i = 0; i < iE0; i++) {
            arrayList.add((r1) qVar.R(lVarX, i));
        }
        return new p(!arrayList.isEmpty() ? new l(d0.Y(h00.q.t1(arrayList, xVar.r()))) : l.b);
    }

    @Override
    public h30.d m0(h30.i iVar) {
        if (iVar instanceof h30.d) {
            return (h30.d) iVar;
        }
        return null;
    }

    @Override
    public boolean o(h30.l lVar) {
        kotlin.jvm.internal.m.e(lVar, "<this>");
        return lVar instanceof a10.d;
    }

    @Override
    public boolean p0(h30.l lVar) {
        return !(lVar instanceof d);
    }

    @Override
    public boolean q(h30.l lVar) {
        l1 l1Var;
        if (!(lVar instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) lVar;
        Class cls = j1Var.B;
        n0 n0VarN = j1Var.N();
        if (n0VarN == null || (l1Var = (l1) s10.p.b.n(n0VarN, s10.p.a[7])) == null) {
            if (cls.isAnnotation() || cls.isEnum()) {
                l1Var = l1.FINAL;
            } else if (kotlin.jvm.internal.m.a(s0.l0(cls), Boolean.TRUE)) {
                l1Var = l1.SEALED;
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                l1Var = l1.ABSTRACT;
            } else {
                l1Var = !Modifier.isFinal(cls.getModifiers()) ? l1.OPEN : l1.FINAL;
            }
        }
        return (l1Var != l1.FINAL || j1Var.L() == s10.q.ENUM_CLASS || j1Var.L() == s10.q.ENUM_ENTRY || j1Var.L() == s10.q.ANNOTATION_CLASS) ? false : true;
    }

    @Override
    public void q0(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
    }

    @Override
    public boolean r(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        h30.h hVarS = S(gVar);
        return (hVarS != null ? u(hVarS) : null) != null;
    }

    @Override
    public boolean r0(h30.d dVar) {
        return false;
    }

    @Override
    public h30.g s(h30.g gVar) {
        l(gVar);
        throw null;
    }

    @Override
    public void s0(h30.h hVar, h30.l lVar) {
    }

    @Override
    public boolean t(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        return false;
    }

    @Override
    public Collection t0(h30.l lVar) {
        kotlin.jvm.internal.m.e(lVar, "<this>");
        if (lVar instanceof a10.d) {
            List<x> listL = ((a10.d) lVar).l();
            ArrayList arrayList = new ArrayList(h00.r.q0(listL, 10));
            for (x xVar : listL) {
                kotlin.jvm.internal.m.c(xVar, "null cannot be cast to non-null type org.jetbrains.kotlin.types.model.KotlinTypeMarker");
                arrayList.add((h30.g) xVar);
            }
            return arrayList;
        }
        if (lVar instanceof r1) {
            List<x> list = ((r1) lVar).F;
            if (list == null) {
                kotlin.jvm.internal.m.k("upperBounds");
                throw null;
            }
            ArrayList arrayList2 = new ArrayList(h00.r.q0(list, 10));
            for (x xVar2 : list) {
                kotlin.jvm.internal.m.c(xVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.model.KotlinTypeMarker");
                arrayList2.add((h30.g) xVar2);
            }
            return arrayList2;
        }
        if (!(lVar instanceof d)) {
            StringBuilder sbR = x5.r("Unsupported type constructor: ", lVar, " (");
            sbR.append(lVar.getClass().getName());
            sbR.append(')');
            throw new IllegalStateException(sbR.toString().toString());
        }
        ArrayList<x> arrayList3 = ((d) lVar).B;
        if (arrayList3 == null) {
            kotlin.jvm.internal.m.k("supertypes");
            throw null;
        }
        ArrayList arrayList4 = new ArrayList(h00.r.q0(arrayList3, 10));
        for (x xVar3 : arrayList3) {
            kotlin.jvm.internal.m.c(xVar3, "null cannot be cast to non-null type org.jetbrains.kotlin.types.model.KotlinTypeMarker");
            arrayList4.add((h30.g) xVar3);
        }
        return arrayList4;
    }

    @Override
    public h30.d u(h30.h hVar) {
        h30.e eVarG = g(hVar);
        if (eVarG != null) {
            l(eVarG);
            throw null;
        }
        h30.i iVar = (h30.i) hVar;
        if (iVar instanceof h30.d) {
            return (h30.d) iVar;
        }
        return null;
    }

    @Override
    public boolean v(h30.l lVar) {
        kotlin.jvm.internal.m.e(lVar, "<this>");
        return false;
    }

    @Override
    public h30.h v0(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        h30.f fVarI = I(gVar);
        if (fVarI != null) {
            return a(fVarI);
        }
        h30.h hVarS = S(gVar);
        kotlin.jvm.internal.m.b(hVarS);
        return hVarS;
    }

    @Override
    public h30.c w(h30.d dVar) {
        return ((c) dVar).C;
    }

    @Override
    public h30.g x(h30.g gVar) {
        l(gVar);
        throw null;
    }

    @Override
    public boolean y(h30.h hVar) {
        kotlin.jvm.internal.m.e(hVar, "<this>");
        return o(X(hVar));
    }

    @Override
    public h30.h y0(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        h30.f fVarI = I(gVar);
        if (fVarI != null) {
            return c(fVarI);
        }
        h30.h hVarS = S(gVar);
        kotlin.jvm.internal.m.b(hVarS);
        return hVarS;
    }

    @Override
    public boolean z(h30.m mVar, h30.l lVar) {
        l(mVar);
        throw null;
    }
}
