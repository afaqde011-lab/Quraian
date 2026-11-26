package b20;

import com.google.android.gms.internal.measurement.y3;
import e30.a1;
import e30.p0;
import e30.v0;
import j10.n0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import m10.r0;

public final class f implements z10.g {
    public static final a10.w[] h;
    public final oj.q a;
    public final p10.e b;
    public final d30.h c;
    public final d30.i d;
    public final o10.g e;
    public final d30.i f;
    public final boolean g;

    static {
        kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s(f.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0);
        kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
        h = new a10.w[]{b0Var.h(sVar), a1.b.h(f.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, b0Var), a1.b.h(f.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0, b0Var)};
    }

    public f(oj.q c, p10.e javaAnnotation, boolean z) {
        kotlin.jvm.internal.m.e(c, "c");
        kotlin.jvm.internal.m.e(javaAnnotation, "javaAnnotation");
        this.a = c;
        this.b = javaAnnotation;
        a20.b bVar = (a20.b) c.B;
        d30.o oVar = bVar.a;
        e eVar = new e(this, 0);
        d30.l lVar = (d30.l) oVar;
        lVar.getClass();
        this.c = new d30.h(lVar, eVar);
        e eVar2 = new e(this, 1);
        d30.l lVar2 = (d30.l) oVar;
        lVar2.getClass();
        this.d = new d30.i(lVar2, eVar2);
        this.e = bVar.j.b(javaAnnotation);
        e eVar3 = new e(this, 2);
        d30.l lVar3 = (d30.l) oVar;
        lVar3.getClass();
        this.f = new d30.i(lVar3, eVar3);
        this.g = z;
    }

    @Override
    public final n20.c a() {
        a10.w p = h[0];
        d30.h hVar = this.c;
        kotlin.jvm.internal.m.e(hVar, "<this>");
        kotlin.jvm.internal.m.e(p, "p");
        return (n20.c) hVar.invoke();
    }

    @Override
    public final Map b() {
        return (Map) ze.d.A(this.f, h[2]);
    }

    public final s20.g c(e20.a aVar) {
        e20.d iVar;
        e30.w wVarH;
        if (aVar instanceof p10.v) {
            return s20.h.b(((p10.v) aVar).b, null);
        }
        if (aVar instanceof p10.t) {
            Enum r6 = ((p10.t) aVar).b;
            Class<?> enclosingClass = r6.getClass();
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            kotlin.jvm.internal.m.b(enclosingClass);
            return new s20.i(p10.d.a(enclosingClass), n20.e.e(r6.name()));
        }
        boolean z = aVar instanceof p10.h;
        oj.q qVar = this.a;
        if (z) {
            p10.h hVar = (p10.h) aVar;
            n20.e eVar = hVar.a;
            if (eVar == null) {
                eVar = x10.v.b;
            }
            kotlin.jvm.internal.m.b(eVar);
            ArrayList arrayListA = hVar.a();
            if (!e30.c.k((e30.a0) ze.d.A(this.d, h[1]))) {
                j10.e eVarD = u20.d.d(this);
                kotlin.jvm.internal.m.b(eVarD);
                r0 r0VarG = y3.G(eVar, eVarD);
                if (r0VarG == null || (wVarH = r0VarG.getType()) == null) {
                    g10.i iVarD = ((a20.b) qVar.B).o.d();
                    a1 a1Var = a1.C;
                    wVarH = iVarD.h(g30.l.c(g30.k.d0, new String[0]));
                }
                ArrayList arrayList = new ArrayList(h00.r.q0(arrayListA, 10));
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    s20.g gVarC = c((e20.a) it.next());
                    if (gVarC == null) {
                        gVarC = new s20.v(null);
                    }
                    arrayList.add(gVarC);
                }
                return new s20.y(arrayList, wVarH);
            }
        } else {
            if (aVar instanceof p10.g) {
                return new s20.a((Object) new f(qVar, new p10.e(((p10.g) aVar).b), false));
            }
            if (aVar instanceof p10.p) {
                Class cls = ((p10.p) aVar).b;
                if (cls.isPrimitive()) {
                    iVar = new p10.z(cls);
                } else if ((cls instanceof GenericArrayType) || cls.isArray()) {
                    iVar = new p10.i(cls);
                } else {
                    iVar = cls instanceof WildcardType ? new p10.e0((WildcardType) cls) : new p10.q(cls);
                }
                e30.w wVarG = ((a1.i) qVar.E).G(iVar, p30.f.t0(v0.B, false, null, 7));
                if (!e30.c.k(wVarG)) {
                    e30.w wVarB = wVarG;
                    int i = 0;
                    while (g10.i.z(wVarB)) {
                        wVarB = ((p0) h00.q.d1(wVarB.e0())).b();
                        kotlin.jvm.internal.m.d(wVarB, "getType(...)");
                        i++;
                    }
                    j10.h hVarG = wVarB.m0().g();
                    if (hVarG instanceof j10.e) {
                        n20.b bVarF = u20.d.f(hVarG);
                        return bVarF == null ? new s20.t(new s20.q(wVarG)) : new s20.t(bVarF, i);
                    }
                    if (hVarG instanceof j10.r0) {
                        n20.c cVarI = g10.o.a.i();
                        return new s20.t(new n20.b(cVarI.b(), cVarI.a.g()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override
    public final e30.w getType() {
        return (e30.a0) ze.d.A(this.d, h[1]);
    }

    @Override
    public final n0 o() {
        return this.e;
    }

    public final String toString() {
        return p20.h.c.x(this, null);
    }
}
