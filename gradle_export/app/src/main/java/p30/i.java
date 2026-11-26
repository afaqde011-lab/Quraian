package p30;

import a10.w;
import a10.x;
import d10.e2;
import d10.i2;
import d10.j1;
import d10.q1;
import d10.r1;
import d10.x1;
import e30.p0;
import e30.x0;
import e30.z0;
import j10.d0;
import j10.r0;
import java.util.List;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.s;

public final class i extends a {
    public static final w[] F;
    public final e30.w B;
    public final boolean C;
    public final x1 D;
    public final x1 E;

    static {
        s sVar = new s(i.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0);
        b0 b0Var = a0.a;
        F = new w[]{b0Var.h(sVar), a1.b.h(i.class, "arguments", "getArguments()Ljava/util/List;", 0, b0Var)};
    }

    public i(e30.w type, u00.a aVar) {
        this(type, aVar, false);
        kotlin.jvm.internal.m.e(type, "type");
    }

    public i(e30.w type, u00.a aVar, boolean z) {
        super(aVar);
        kotlin.jvm.internal.m.e(type, "type");
        this.B = type;
        this.C = z;
        this.D = va.a.Q((j10.c) null, new g(this, 0));
        this.E = va.a.Q((j10.c) null, new h(this, aVar, 0));
    }

    @Override
    public final a A() {
        z0 z0VarY0 = this.B.y0();
        if (z0VarY0 instanceof e30.q) {
            return new i(((e30.q) z0VarY0).C, null);
        }
        return null;
    }

    public final a10.e B(e30.w wVar) {
        e30.w wVarB;
        if (this.C) {
            j10.h hVarG = wVar.m0().g();
            d0 d0Var = hVarG instanceof d0 ? (d0) hVarG : null;
            if (d0Var != null) {
                return new q1(u20.d.g(d0Var));
            }
        }
        j10.h hVarG2 = wVar.m0().g();
        if (hVarG2 instanceof j10.e) {
            Class clsI = i2.i((j10.e) hVarG2);
            if (clsI != null) {
                if (!g10.i.z(wVar)) {
                    if (x0.e(wVar)) {
                        return new j1(clsI);
                    }
                    Class cls = (Class) p10.d.b.get(clsI);
                    if (cls != null) {
                        clsI = cls;
                    }
                    return new j1(clsI);
                }
                p0 p0Var = (p0) h00.q.f1(wVar.e0());
                if (p0Var == null || (wVarB = p0Var.b()) == null) {
                    return new j1(clsI);
                }
                a10.e eVarB = B(ab.a0.n0(wVarB));
                if (eVarB != null) {
                    return new j1(i2.c(k00.f.D(f50.k.p(eVarB))));
                }
                throw new a40.b0("Cannot determine classifier for array element type: " + this);
            }
        } else if (hVarG2 instanceof r0) {
            return new r1(null, (r0) hVarG2);
        }
        return null;
    }

    @Override
    public final x d() {
        e30.w wVar = this.B;
        kotlin.jvm.internal.m.e(wVar, "<this>");
        z0 z0VarY0 = wVar.y0();
        e30.a aVar = z0VarY0 instanceof e30.a ? (e30.a) z0VarY0 : null;
        e30.a0 a0Var = aVar != null ? aVar.C : null;
        if (a0Var != null) {
            return new i(a0Var, this.A, true);
        }
        return null;
    }

    @Override
    public final boolean equals(Object obj) {
        if (!e2.a) {
            return super.equals(obj);
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.m.a(this.B, iVar.B) && kotlin.jvm.internal.m.a(s(), iVar.s()) && r().equals(iVar.r());
    }

    @Override
    public final boolean f() {
        return this.B.t0();
    }

    @Override
    public final a10.d g() {
        j10.h hVarG = this.B.m0().g();
        j10.e eVar = hVarG instanceof j10.e ? (j10.e) hVarG : null;
        if (eVar != null) {
            String str = i10.d.a;
            if (i10.d.j.containsKey(q20.d.f(eVar))) {
                if (e2.a) {
                    a10.e eVarS = s();
                    kotlin.jvm.internal.m.c(eVarS, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
                    return new m((a10.d) eVarS, u20.d.g(eVar).a.a, new c20.f(eVar, 1), new c20.f(eVar, 2));
                }
                n20.c cVarG = u20.d.g(eVar);
                a10.e eVarS2 = s();
                kotlin.jvm.internal.m.c(eVarS2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
                return w50.c.N((a10.d) eVarS2, cVarG);
            }
        }
        return null;
    }

    @Override
    public final List getAnnotations() {
        return i2.b(this.B);
    }

    @Override
    public final int hashCode() {
        if (!e2.a) {
            return super.hashCode();
        }
        int iHashCode = this.B.hashCode() * 31;
        a10.e eVarS = s();
        return r().hashCode() + ((iHashCode + (eVarS != null ? eVarS.hashCode() : 0)) * 31);
    }

    @Override
    public final boolean o() {
        e30.w wVar = this.B;
        kotlin.jvm.internal.m.e(wVar, "<this>");
        return wVar.y0() instanceof e30.l;
    }

    @Override
    public final List r() {
        w wVar = F[1];
        Object objInvoke = this.E.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    @Override
    public final a10.e s() {
        w wVar = F[0];
        return (a10.e) this.D.invoke();
    }

    @Override
    public final boolean t() {
        e30.w wVar = this.B;
        if (wVar != null) {
            n20.e eVar = g10.i.e;
            return g10.i.B(wVar, g10.o.b);
        }
        g10.i.a(138);
        throw null;
    }

    @Override
    public final boolean v() {
        return this.B instanceof c20.i;
    }

    @Override
    public final boolean w() {
        return w50.c.U(this.B);
    }

    @Override
    public final a x() {
        z0 z0VarY0 = this.B.y0();
        if (z0VarY0 instanceof e30.q) {
            return new i(((e30.q) z0VarY0).B, null);
        }
        return null;
    }

    @Override
    public final a y(boolean z) {
        e30.w wVarP;
        e30.w wVar = this.B;
        if (z) {
            wVarP = e30.d.p(wVar.y0(), true);
            if (wVarP != null) {
                wVar = wVarP;
            }
        } else {
            e30.l lVar = wVar instanceof e30.l ? (e30.l) wVar : null;
            if (lVar != null && (wVarP = lVar.B) != null) {
                wVar = wVarP;
            }
        }
        return new i(wVar, this.A);
    }

    @Override
    public final a z(boolean z) {
        e30.w wVar = this.B;
        if (!e30.c.l(wVar) && wVar.t0() == z) {
            return this;
        }
        z0 z0VarG = x0.g(wVar, z);
        kotlin.jvm.internal.m.d(z0VarG, "makeNullableAsSpecified(...)");
        return new i(z0VarG, this.A);
    }
}
