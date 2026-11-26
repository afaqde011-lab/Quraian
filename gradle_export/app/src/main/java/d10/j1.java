package d10;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class j1 extends l1 implements a10.d, s1, h30.l {
    public static final HashSet D;
    public final Class B;
    public final Object C;

    static {
        LinkedHashSet linkedHashSet = f10.a.a;
        HashSet hashSet = new HashSet();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            hashSet.add(((n20.b) it.next()).a().a.toString());
        }
        D = hashSet;
    }

    public j1(Class jClass) {
        kotlin.jvm.internal.m.e(jClass, "jClass");
        this.B = jClass;
        this.C = rd.a.I(g00.i.B, new a1(this, 0));
    }

    public static final List I(j1 j1Var, x20.n nVar, f1 f1Var) {
        j jVar;
        j1Var.getClass();
        qj.c i1Var = new i1(j1Var, 0);
        Collection<j10.k> collectionC = k00.f.C(nVar, null, 3);
        ArrayList arrayList = new ArrayList();
        for (j10.k kVar : collectionC) {
            if (kVar instanceof j10.c) {
                j10.c cVar = (j10.c) kVar;
                if (kotlin.jvm.internal.m.a(cVar.getVisibility(), j10.p.h)) {
                    jVar = null;
                } else if ((cVar.getKind() != 2) == (f1Var == f1.A)) {
                    jVar = (j) kVar.G(i1Var, g00.b0.a);
                } else {
                    jVar = null;
                }
            } else {
                jVar = null;
            }
            if (jVar != null) {
                arrayList.add(jVar);
            }
        }
        return h00.q.n1(arrayList);
    }

    public static m10.k J(n20.b bVar, o10.f fVar) {
        a30.i iVar = fVar.a;
        i10.m mVar = new i10.m(iVar.b, bVar.a, 1);
        n20.e eVarF = bVar.f();
        j10.y yVar = j10.y.B;
        j10.f fVar2 = j10.f.A;
        List listR = va.a.R(iVar.b.d().k("Any").n());
        d30.l lVar = iVar.a;
        m10.k kVar = new m10.k(mVar, eVarF, yVar, fVar2, listR, lVar);
        kVar.e0(new h1(lVar, kVar), h00.z.A, null);
        return kVar;
    }

    @Override
    public final Collection A(n20.e eVar) {
        x20.n nVarN = M().n().N();
        r10.c cVar = r10.c.B;
        Collection collectionD = nVarN.d(eVar, cVar);
        x20.n nVarK = M().K();
        kotlin.jvm.internal.m.d(nVarK, "getStaticScope(...)");
        return h00.q.Y0(nVarK.d(eVar, cVar), collectionD);
    }

    @Override
    public final j10.l0 B(int i) {
        Class<?> declaringClass;
        Class cls = this.B;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((j1) k00.f.I(declaringClass)).B(i);
        }
        j10.e eVarM = M();
        c30.i iVar = eVarM instanceof c30.i ? (c30.i) eVarM : null;
        if (iVar != null) {
            i20.k kVar = iVar.E;
            o20.n classLocalVariable = l20.j.h;
            kotlin.jvm.internal.m.d(classLocalVariable, "classLocalVariable");
            i20.j0 j0Var = (i20.j0) w00.a.v(kVar, classLocalVariable, i);
            if (j0Var != null) {
                a30.k kVar2 = iVar.L;
                return (j10.l0) i2.e(this.B, j0Var, (k20.g) kVar2.b, (h9.f) kVar2.d, iVar.F, b1.B);
            }
        }
        return null;
    }

    @Override
    public final Collection D(n20.e eVar) {
        x20.n nVarN = M().n().N();
        r10.c cVar = r10.c.B;
        Collection collectionE = nVarN.e(eVar, cVar);
        x20.n nVarK = M().K();
        kotlin.jvm.internal.m.d(nVarK, "getStaticScope(...)");
        return h00.q.Y0(nVarK.e(eVar, cVar), collectionE);
    }

    public final n20.b K() {
        g10.k kVarD;
        n20.b bVar = c2.a;
        Class klass = this.B;
        kotlin.jvm.internal.m.e(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            kotlin.jvm.internal.m.d(componentType, "getComponentType(...)");
            kVarD = componentType.isPrimitive() ? v20.c.b(componentType.getSimpleName()).d() : null;
            if (kVarD != null) {
                return new n20.b(g10.p.l, kVarD.B);
            }
            n20.c cVarI = g10.o.g.i();
            return new n20.b(cVarI.b(), cVarI.a.g());
        }
        if (klass.equals(Void.TYPE)) {
            return c2.a;
        }
        kVarD = klass.isPrimitive() ? v20.c.b(klass.getSimpleName()).d() : null;
        if (kVarD != null) {
            return new n20.b(g10.p.l, kVarD.A);
        }
        n20.b bVarA = p10.d.a(klass);
        if (!bVarA.c) {
            String str = i10.d.a;
            n20.c fqName = bVarA.a();
            kotlin.jvm.internal.m.e(fqName, "fqName");
            n20.b bVar2 = (n20.b) i10.d.h.get(fqName.a);
            if (bVar2 != null) {
                return bVar2;
            }
        }
        return bVarA;
    }

    public final s10.q L() {
        s10.q qVarA;
        s10.n0 n0VarN = N();
        if (n0VarN != null && (qVarA = s10.p.a(n0VarN)) != null) {
            return qVarA;
        }
        Class cls = this.B;
        if (cls.isAnnotation()) {
            return s10.q.ANNOTATION_CLASS;
        }
        if (cls.isInterface()) {
            return s10.q.INTERFACE;
        }
        if (cls.isEnum()) {
            return s10.q.ENUM_CLASS;
        }
        return cls.getSuperclass().isEnum() ? s10.q.ENUM_ENTRY : s10.q.CLASS;
    }

    public final j10.e M() {
        return ((e1) this.C.getValue()).b();
    }

    public final s10.n0 N() {
        return ((e1) this.C.getValue()).c();
    }

    @Override
    public final boolean equals(Object obj) {
        return (obj instanceof j1) && k00.f.G(this).equals(k00.f.G((a10.d) obj));
    }

    @Override
    public final List getTypeParameters() {
        x1 x1Var = ((e1) this.C.getValue()).h;
        a10.w wVar = e1.r[6];
        Object objInvoke = x1Var.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    @Override
    public final int hashCode() {
        return k00.f.G(this).hashCode();
    }

    @Override
    public final Collection i() {
        x1 x1Var = ((e1) this.C.getValue()).g;
        a10.w wVar = e1.r[4];
        Object objInvoke = x1Var.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
        return (Collection) objInvoke;
    }

    @Override
    public final boolean j() {
        s10.n0 n0VarN = N();
        if (n0VarN != null) {
            a10.w[] wVarArr = s10.p.a;
            if (s10.p.f.j(s10.p.a[14], n0VarN)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean k() {
        s10.n0 n0VarN = N();
        if (n0VarN != null) {
            return s10.p.e.j(s10.p.a[10], n0VarN);
        }
        Class cls = this.B;
        return (cls.getDeclaringClass() == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
    }

    @Override
    public final List l() {
        x1 x1Var = ((e1) this.C.getValue()).j;
        a10.w wVar = e1.r[8];
        Object objInvoke = x1Var.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    @Override
    public final String m() {
        x1 x1Var = ((e1) this.C.getValue()).f;
        a10.w wVar = e1.r[3];
        return (String) x1Var.invoke();
    }

    @Override
    public final String n() {
        x1 x1Var = ((e1) this.C.getValue()).e;
        a10.w wVar = e1.r[2];
        return (String) x1Var.invoke();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("class ");
        n20.b bVarK = K();
        n20.c cVar = bVarK.a;
        String strK = cVar.a.c() ? "" : g4.c.k(new StringBuilder(), cVar.a.a, '.');
        sb.append(strK + r30.r.u0(bVarK.b.a.a, '.', '$'));
        return sb.toString();
    }

    @Override
    public final boolean u(Object obj) {
        List list = p10.d.a;
        Class cls = this.B;
        kotlin.jvm.internal.m.e(cls, "<this>");
        Integer num = (Integer) p10.d.d.get(cls);
        if (num != null) {
            return kotlin.jvm.internal.d0.f(num.intValue(), obj);
        }
        Class cls2 = (Class) p10.d.c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    @Override
    public final Class v() {
        return this.B;
    }

    @Override
    public final Collection z() {
        j10.e eVarM = M();
        if (eVarM.getKind() == j10.f.B || eVarM.getKind() == j10.f.F) {
            return h00.x.A;
        }
        Collection collectionI = eVarM.i();
        kotlin.jvm.internal.m.d(collectionI, "getConstructors(...)");
        return collectionI;
    }
}
