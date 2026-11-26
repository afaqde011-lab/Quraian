package b20;

import e30.a1;
import e30.h0;
import e30.m0;
import e30.u0;
import e30.v0;
import e7.l0;
import j10.o0;
import j10.r0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

public final class h extends e30.b {
    public final int C = 0;
    public final d30.i D;
    public final m10.b E;

    public h(i iVar) {
        this.E = iVar;
        oj.q qVar = iVar.J;
        super(((a20.b) qVar.B).a);
        d30.o oVar = ((a20.b) qVar.B).a;
        g gVar = new g(iVar, 2);
        d30.l lVar = (d30.l) oVar;
        lVar.getClass();
        this.D = new d30.i(lVar, gVar);
    }

    public h(c30.i iVar) {
        this.E = iVar;
        a30.k kVar = iVar.L;
        super(((a30.i) kVar.a).a);
        d30.l lVar = ((a30.i) kVar.a).a;
        c30.d dVar = new c30.d(iVar, 6);
        lVar.getClass();
        this.D = new d30.i(lVar, dVar);
    }

    @Override
    public final Collection a() {
        ?? arrayList;
        String str;
        n20.i iVar;
        n20.c cVar;
        n20.c cVar2;
        ArrayList arrayList2;
        e30.a0 a0VarT;
        j10.e eVar;
        e30.w wVarI;
        ArrayList arrayList3;
        e30.w wVarG;
        e30.w wVarA;
        m0 m0VarM0;
        m0 m0VarM1;
        String strB;
        n20.c cVarA;
        int i = this.C;
        m10.b bVar = this.E;
        switch (i) {
            case 0:
                i iVar2 = (i) bVar;
                oj.q qVar = iVar2.J;
                Class cls = iVar2.H.a;
                boolean zA = kotlin.jvm.internal.m.a(cls, Object.class);
                h00.x xVar = h00.x.A;
                if (zA) {
                    arrayList = xVar;
                } else {
                    db.g gVar = new db.g(2);
                    ArrayList arrayList4 = gVar.B;
                    Type genericSuperclass = cls.getGenericSuperclass();
                    gVar.a(genericSuperclass != null ? genericSuperclass : Object.class);
                    gVar.f(cls.getGenericInterfaces());
                    List listS = va.a.S(arrayList4.toArray(new Type[arrayList4.size()]));
                    arrayList = new ArrayList(h00.r.q0(listS, 10));
                    Iterator it = listS.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new p10.q((Type) it.next()));
                    }
                }
                ArrayList arrayList5 = new ArrayList(arrayList.size());
                ArrayList<e20.d> arrayList6 = new ArrayList(0);
                a20.e eVar2 = iVar2.U;
                n20.c PURELY_IMPLEMENTS_ANNOTATION = x10.v.n;
                kotlin.jvm.internal.m.d(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
                k10.b bVarF = eVar2.f(PURELY_IMPLEMENTS_ANNOTATION);
                if (bVarF != null) {
                    Object objE1 = h00.q.e1(bVarF.b().values());
                    s20.x xVar2 = objE1 instanceof s20.x ? (s20.x) objE1 : null;
                    if (xVar2 != null && (str = (String) xVar2.a) != null) {
                        n20.i iVar3 = n20.i.A;
                        int length = str.length();
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                char cCharAt = str.charAt(i2);
                                int iOrdinal = iVar3.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        if (cCharAt == '.') {
                                            iVar = n20.i.C;
                                            iVar3 = iVar;
                                        } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                                        }
                                        i2++;
                                    } else if (iOrdinal != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                if (Character.isJavaIdentifierStart(cCharAt)) {
                                    iVar = n20.i.B;
                                    iVar3 = iVar;
                                    i2++;
                                }
                            } else {
                                cVar = iVar3 != n20.i.C ? new n20.c(str) : null;
                            }
                        }
                    }
                }
                if (cVar != null) {
                    n20.d dVar = cVar.a;
                    if (dVar.c()) {
                        cVar = null;
                    } else {
                        n20.e segment = g10.p.k;
                        kotlin.jvm.internal.m.e(segment, "segment");
                        if (!dVar.h(segment)) {
                            cVar = null;
                        }
                    }
                } else {
                    cVar = null;
                }
                if (cVar == null) {
                    LinkedHashMap linkedHashMap = x10.j.a;
                    cVar2 = (n20.c) x10.j.b.get(u20.d.g(iVar2));
                    if (cVar2 == null) {
                        a0VarT = null;
                    }
                    for (p10.q qVar2 : arrayList) {
                        wVarG = ((a1.i) qVar.E).G(qVar2, p30.f.t0(v0.A, false, null, 7));
                        f20.d dVar2 = ((a20.b) qVar.B).r;
                        dVar2.getClass();
                        wVarA = dVar2.a(new l0((k10.a) null, false, qVar, x10.a.TYPE_USE, true), wVarG, xVar, null, false);
                        if (wVarA == null) {
                            wVarA = wVarG;
                        }
                        if (wVarA.m0().g() instanceof j10.d0) {
                            arrayList6.add(qVar2);
                        }
                        m0VarM0 = wVarA.m0();
                        if (a0VarT != null) {
                            m0VarM1 = a0VarT.m0();
                        } else {
                            m0VarM1 = null;
                        }
                        if (!kotlin.jvm.internal.m.a(m0VarM0, m0VarM1) && !g10.i.y(wVarA)) {
                            arrayList5.add(wVarA);
                        }
                    }
                    eVar = iVar2.I;
                    if (eVar != null) {
                        wVarI = new u0(a.a.s(eVar, iVar2)).i(eVar.n(), a1.C);
                    } else {
                        wVarI = null;
                    }
                    n30.l.a(arrayList5, wVarI);
                    n30.l.a(arrayList5, a0VarT);
                    if (!arrayList6.isEmpty()) {
                        a30.n nVar = ((a20.b) qVar.B).f;
                        arrayList3 = new ArrayList(h00.r.q0(arrayList6, 10));
                        for (e20.d dVar3 : arrayList6) {
                            kotlin.jvm.internal.m.c(dVar3, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                            arrayList3.add(((p10.q) dVar3).a.toString());
                        }
                        nVar.c(iVar2, arrayList3);
                    }
                    return !arrayList5.isEmpty() ? h00.q.n1(arrayList5) : va.a.R(((a20.b) qVar.B).o.d().e());
                }
                cVar2 = cVar;
                j10.z zVar = ((a20.b) qVar.B).o;
                r10.c cVar3 = r10.c.H;
                int i3 = u20.d.a;
                kotlin.jvm.internal.m.e(zVar, "<this>");
                n20.d dVar4 = cVar2.a;
                dVar4.c();
                j10.h hVarG = ((m10.w) zVar.f0(cVar2.b())).H.g(dVar4.g(), cVar3);
                j10.e eVar3 = hVarG instanceof j10.e ? (j10.e) hVarG : null;
                if (eVar3 == null) {
                    a0VarT = null;
                } else {
                    int size = eVar3.f().getParameters().size();
                    List parameters = iVar2.P.getParameters();
                    kotlin.jvm.internal.m.d(parameters, "getParameters(...)");
                    int size2 = parameters.size();
                    if (size2 == size) {
                        arrayList2 = new ArrayList(h00.r.q0(parameters, 10));
                        Iterator it2 = parameters.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new e30.f0(((r0) it2.next()).n(), a1.C));
                        }
                    } else if (size2 == 1 && size > 1 && cVar == null) {
                        e30.f0 f0Var = new e30.f0(((r0) h00.q.d1(parameters)).n(), a1.C);
                        z00.e eVar4 = new z00.e(1, size, 1);
                        ArrayList arrayList7 = new ArrayList(h00.r.q0(eVar4, 10));
                        Iterator it3 = eVar4.iterator();
                        while (true) {
                            z00.d dVar5 = (z00.d) it3;
                            if (dVar5.C) {
                                dVar5.nextInt();
                                arrayList7.add(f0Var);
                            } else {
                                arrayList2 = arrayList7;
                            }
                        }
                    } else {
                        a0VarT = null;
                    }
                    h0.B.getClass();
                    a0VarT = e30.c.t(h0.C, eVar3, arrayList2);
                }
                while (r17.hasNext()) {
                    wVarG = ((a1.i) qVar.E).G(qVar2, p30.f.t0(v0.A, false, null, 7));
                    f20.d dVar6 = ((a20.b) qVar.B).r;
                    dVar6.getClass();
                    wVarA = dVar6.a(new l0((k10.a) null, false, qVar, x10.a.TYPE_USE, true), wVarG, xVar, null, false);
                    if (wVarA == null) {
                        wVarA = wVarG;
                    }
                    if (wVarA.m0().g() instanceof j10.d0) {
                        arrayList6.add(qVar2);
                    }
                    m0VarM0 = wVarA.m0();
                    if (a0VarT != null) {
                        m0VarM1 = a0VarT.m0();
                    } else {
                        m0VarM1 = null;
                    }
                    if (!kotlin.jvm.internal.m.a(m0VarM0, m0VarM1)) {
                        arrayList5.add(wVarA);
                    }
                }
                eVar = iVar2.I;
                if (eVar != null) {
                    wVarI = new u0(a.a.s(eVar, iVar2)).i(eVar.n(), a1.C);
                } else {
                    wVarI = null;
                }
                n30.l.a(arrayList5, wVarI);
                n30.l.a(arrayList5, a0VarT);
                if (!arrayList6.isEmpty()) {
                    a30.n nVar2 = ((a20.b) qVar.B).f;
                    arrayList3 = new ArrayList(h00.r.q0(arrayList6, 10));
                    while (r3.hasNext()) {
                        kotlin.jvm.internal.m.c(dVar3, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                        arrayList3.add(((p10.q) dVar3).a.toString());
                    }
                    nVar2.c(iVar2, arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                }
            default:
                c30.i iVar4 = (c30.i) bVar;
                i20.k kVar = iVar4.E;
                a30.k kVar2 = iVar4.L;
                List listH0 = w50.c.h0(kVar, (h9.f) kVar2.d);
                ArrayList arrayList8 = new ArrayList(h00.r.q0(listH0, 10));
                Iterator it4 = listH0.iterator();
                while (it4.hasNext()) {
                    arrayList8.add(((ui.b) kVar2.h).F((i20.u0) it4.next()));
                }
                ArrayList arrayListY0 = h00.q.Y0(((a30.i) kVar2.a).n.a(iVar4), arrayList8);
                ArrayList<j10.d0> arrayList9 = new ArrayList();
                Iterator it5 = arrayListY0.iterator();
                while (it5.hasNext()) {
                    j10.h hVarG2 = ((e30.w) it5.next()).m0().g();
                    j10.d0 d0Var = hVarG2 instanceof j10.d0 ? (j10.d0) hVarG2 : null;
                    if (d0Var != null) {
                        arrayList9.add(d0Var);
                    }
                }
                if (!arrayList9.isEmpty()) {
                    a30.n nVar3 = ((a30.i) kVar2.a).h;
                    ArrayList arrayList10 = new ArrayList(h00.r.q0(arrayList9, 10));
                    for (j10.d0 d0Var2 : arrayList9) {
                        n20.b bVarF2 = u20.d.f(d0Var2);
                        if (bVarF2 == null || (cVarA = bVarF2.a()) == null || (strB = cVarA.a.a) == null) {
                            strB = d0Var2.getName().b();
                            kotlin.jvm.internal.m.d(strB, "asString(...)");
                        }
                        arrayList10.add(strB);
                    }
                    nVar3.c(iVar4, arrayList10);
                }
                return h00.q.n1(arrayListY0);
        }
    }

    @Override
    public final o0 c() {
        switch (this.C) {
            case 0:
                return ((a20.b) ((i) this.E).J.B).m;
            default:
                return o0.C;
        }
    }

    @Override
    public final j10.h g() {
        switch (this.C) {
            case 0:
                return (i) this.E;
            default:
                return (c30.i) this.E;
        }
    }

    @Override
    public final List getParameters() {
        switch (this.C) {
            case 0:
                break;
        }
        return (List) this.D.invoke();
    }

    @Override
    public final j10.e g() {
        switch (this.C) {
            case 0:
                return (i) this.E;
            default:
                return (c30.i) this.E;
        }
    }

    @Override
    public final boolean o() {
        switch (this.C) {
        }
        return true;
    }

    public final String toString() {
        switch (this.C) {
            case 0:
                String strB = ((i) this.E).getName().b();
                kotlin.jvm.internal.m.d(strB, "asString(...)");
                return strB;
            default:
                String str = ((c30.i) this.E).getName().A;
                kotlin.jvm.internal.m.d(str, "toString(...)");
                return str;
        }
    }
}
