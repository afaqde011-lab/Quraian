package b20;

import com.google.android.gms.internal.measurement.b5;
import e30.v0;
import e30.z0;
import j10.o0;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import m10.r0;

public abstract class a0 extends x20.o {
    public static final a10.w[] m;
    public final oj.q b;
    public final a0 c;
    public final d30.c d;
    public final d30.i e;
    public final d30.e f;
    public final d30.j g;
    public final d30.e h;
    public final d30.i i;
    public final d30.i j;
    public final d30.i k;
    public final d30.e l;

    static {
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s(a0.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0);
        kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
        m = new a10.w[]{b0Var.h(sVar), a1.b.h(a0.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0, b0Var), a1.b.h(a0.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0, b0Var)};
    }

    public a0(oj.q c, n nVar) {
        kotlin.jvm.internal.m.e(c, "c");
        this.b = c;
        this.c = nVar;
        d30.o oVar = ((a20.b) c.B).a;
        v vVar = new v(this, 0);
        d30.l lVar = (d30.l) oVar;
        lVar.getClass();
        this.d = new d30.c(lVar, vVar);
        v vVar2 = new v(this, 1);
        d30.l lVar2 = (d30.l) oVar;
        lVar2.getClass();
        this.e = new d30.i(lVar2, vVar2);
        this.f = ((d30.l) oVar).b(new x(this, 0));
        this.g = ((d30.l) oVar).c(new x(this, 1));
        this.h = ((d30.l) oVar).b(new x(this, 2));
        v vVar3 = new v(this, 2);
        d30.l lVar3 = (d30.l) oVar;
        lVar3.getClass();
        this.i = new d30.i(lVar3, vVar3);
        v vVar4 = new v(this, 3);
        d30.l lVar4 = (d30.l) oVar;
        lVar4.getClass();
        this.j = new d30.i(lVar4, vVar4);
        v vVar5 = new v(this, 4);
        d30.l lVar5 = (d30.l) oVar;
        lVar5.getClass();
        this.k = new d30.i(lVar5, vVar5);
        this.l = ((d30.l) oVar).b(new x(this, 3));
    }

    public static e30.w l(p10.x method, oj.q qVar) {
        kotlin.jvm.internal.m.e(method, "method");
        Class<?> declaringClass = ((Method) method.b()).getDeclaringClass();
        kotlin.jvm.internal.m.d(declaringClass, "getDeclaringClass(...)");
        return ((a1.i) qVar.E).G(method.f(), p30.f.t0(v0.B, declaringClass.isAnnotation(), null, 6));
    }

    public static z u(oj.q qVar, m10.t tVar, List list) {
        g00.k kVar;
        n20.e eVar;
        n20.e eVarE;
        a1.i iVar = (a1.i) qVar.E;
        a20.b bVar = (a20.b) qVar.B;
        j10.z zVar = bVar.o;
        h00.p pVarS1 = h00.q.s1(list);
        ArrayList arrayList = new ArrayList(h00.r.q0(pVarS1, 10));
        Iterator it = pVarS1.iterator();
        boolean z = false;
        while (true) {
            h00.b0 b0Var = (h00.b0) it;
            if (!b0Var.B.hasNext()) {
                return new z(h00.q.n1(arrayList), z);
            }
            h00.a0 a0Var = (h00.a0) b0Var.next();
            int i = a0Var.a;
            p10.d0 d0Var = (p10.d0) a0Var.b;
            a20.e eVarF = ca.v.F(qVar, d0Var);
            c20.a aVarT0 = p30.f.t0(v0.B, false, null, 7);
            boolean z2 = d0Var.d;
            p10.b0 b0Var2 = d0Var.a;
            if (z2) {
                p10.i iVar2 = b0Var2 instanceof p10.i ? (p10.i) b0Var2 : null;
                if (iVar2 == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + d0Var);
                }
                z0 z0VarF = iVar.F(iVar2, aVarT0, true);
                kVar = new g00.k(z0VarF, zVar.d().f(z0VarF));
            } else {
                kVar = new g00.k(iVar.G(b0Var2, aVarT0), null);
            }
            e30.w wVar = (e30.w) kVar.A;
            e30.w wVar2 = (e30.w) kVar.B;
            if (kotlin.jvm.internal.m.a(tVar.getName().b(), "equals") && list.size() == 1 && zVar.d().p().equals(wVar)) {
                eVarE = n20.e.e("other");
            } else {
                String str = d0Var.c;
                n20.e eVarD = str != null ? n20.e.d(str) : null;
                if (eVarD == null) {
                    z = true;
                }
                if (eVarD == null) {
                    eVarE = n20.e.e("p" + i);
                } else {
                    eVar = eVarD;
                }
                arrayList.add(new r0(tVar, null, i, eVarF, eVar, wVar, false, false, false, wVar2, bVar.j.b(d0Var)));
            }
            eVar = eVarE;
            arrayList.add(new r0(tVar, null, i, eVarF, eVar, wVar, false, false, false, wVar2, bVar.j.b(d0Var)));
        }
    }

    @Override
    public Collection a(x20.f kindFilter, u00.k kVar) {
        kotlin.jvm.internal.m.e(kindFilter, "kindFilter");
        return (Collection) this.d.invoke();
    }

    @Override
    public final Set b() {
        return (Set) ze.d.A(this.i, m[0]);
    }

    @Override
    public final Set c() {
        return (Set) ze.d.A(this.k, m[2]);
    }

    @Override
    public Collection d(n20.e name, r10.a location) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(location, "location");
        return !b().contains(name) ? h00.x.A : (Collection) this.h.invoke(name);
    }

    @Override
    public Collection e(n20.e name, r10.c cVar) {
        kotlin.jvm.internal.m.e(name, "name");
        return !f().contains(name) ? h00.x.A : (Collection) this.l.invoke(name);
    }

    @Override
    public final Set f() {
        return (Set) ze.d.A(this.j, m[1]);
    }

    public abstract Set h(x20.f fVar, u00.k kVar);

    public abstract Set i(x20.f fVar, x20.k kVar);

    public void j(ArrayList arrayList, n20.e name) {
        kotlin.jvm.internal.m.e(name, "name");
    }

    public abstract c k();

    public abstract void m(LinkedHashSet linkedHashSet, n20.e eVar);

    public abstract void n(ArrayList arrayList, n20.e eVar);

    public abstract Set o(x20.f fVar);

    public abstract m10.u p();

    public abstract j10.k q();

    public boolean r(z10.e eVar) {
        return true;
    }

    public abstract y s(p10.x xVar, ArrayList arrayList, e30.w wVar, List list);

    public final z10.e t(p10.x method) {
        j10.y yVar;
        kotlin.jvm.internal.m.e(method, "method");
        oj.q qVar = this.b;
        z10.e eVarN1 = z10.e.n1(q(), ca.v.F(qVar, method), method.c(), ((a20.b) qVar.B).j.b(method), ((c) this.e.invoke()).b(method.c()) != null && ((ArrayList) method.g()).isEmpty());
        kotlin.jvm.internal.m.e(qVar, "<this>");
        oj.q qVar2 = new oj.q((a20.b) qVar.B, new a20.g(qVar, eVarN1, method, 0), (g00.h) qVar.D);
        ArrayList typeParameters = method.getTypeParameters();
        ArrayList arrayList = new ArrayList(h00.r.q0(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            j10.r0 r0VarA = ((a20.h) qVar2.C).a((p10.c0) it.next());
            kotlin.jvm.internal.m.b(r0VarA);
            arrayList.add(r0VarA);
        }
        z zVarU = u(qVar2, eVarN1, method.g());
        y yVarS = s(method, arrayList, l(method, qVar2), zVarU.b);
        List list = yVarS.d;
        m10.u uVarP = p();
        ArrayList arrayList2 = yVarS.c;
        List list2 = yVarS.b;
        e30.w wVar = yVarS.a;
        o0 o0Var = j10.y.A;
        boolean zIsAbstract = Modifier.isAbstract(((Method) method.b()).getModifiers());
        boolean zIsFinal = Modifier.isFinal(((Method) method.b()).getModifiers());
        o0Var.getClass();
        if (zIsAbstract) {
            yVar = j10.y.E;
        } else {
            yVar = !zIsFinal ? j10.y.D : j10.y.B;
        }
        eVarN1.m1(null, uVarP, h00.x.A, arrayList2, list2, wVar, yVar, b5.O(method.e()), h00.y.A);
        eVarN1.o1(false, zVarU.c);
        if (list.isEmpty()) {
            return eVarN1;
        }
        ((a20.b) qVar2.B).e.getClass();
        throw new UnsupportedOperationException("Should not be called");
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}
