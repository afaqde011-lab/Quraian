package a20;

import a1.z;
import a30.i;
import a30.k;
import androidx.lifecycle.e1;
import androidx.lifecycle.f1;
import av.l;
import av.n;
import b20.p;
import b20.u;
import bv.e3;
import c00.x;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import d10.c2;
import d10.i2;
import d10.j1;
import d10.l1;
import e30.h0;
import e30.m0;
import e30.z0;
import ev.c0;
import g00.b0;
import i10.o;
import i20.u0;
import i20.w;
import j10.j;
import j10.n0;
import j10.q0;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import l1.p2;
import m10.o0;
import m10.t;
import oj.q;
import oo.g1;
import p10.y;
import qr.r;
import x10.s;

public final class a implements u00.a {
    public final int A;
    public final Object B;
    public final Object C;

    public a(int i, Object obj, Object obj2, boolean z) {
        this.A = i;
        this.C = obj;
        this.B = obj2;
    }

    public a(Object obj, Object obj2, int i) {
        this.A = i;
        this.B = obj;
        this.C = obj2;
    }

    @Override
    public final Object invoke() throws IOException {
        Collection collectionA;
        ArrayList arrayList;
        String strX;
        switch (this.A) {
            case 0:
                q qVar = (q) this.B;
                k10.h additionalAnnotations = ((j10.g) this.C).getAnnotations();
                m.e(qVar, "<this>");
                m.e(additionalAnnotations, "additionalAnnotations");
                return x10.b.b(((b) qVar.B).q, (s) qVar.D.getValue(), additionalAnnotations);
            case 1:
                q qVar2 = (q) this.B;
                k10.h additionalAnnotations2 = (k10.h) this.C;
                m.e(qVar2, "<this>");
                m.e(additionalAnnotations2, "additionalAnnotations");
                return x10.b.b(((b) qVar2.B).q, (s) qVar2.D.getValue(), additionalAnnotations2);
            case 2:
                return new p(((f) this.B).a, (y) this.C);
            case 3:
                ui.b bVar = (ui.b) this.B;
                u0 u0Var = (u0) this.C;
                k kVar = (k) bVar.C;
                return ((i) kVar.a).e.k(u0Var, (k20.g) kVar.b);
            case 4:
                eg.g gVar = (av.i) this.B;
                e1 viewModelStore = ((av.g) this.C).B.getViewModelStore();
                t6.b defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                m.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                return c7.i.S(a0.a.b(e3.class), viewModelStore, (String) null, defaultViewModelCreationExtras, w50.c.M(gVar), (u00.a) null);
            case 5:
                eg.g gVar2 = (l) this.B;
                e1 viewModelStore2 = ((f1) ((z) this.C).invoke()).getViewModelStore();
                t6.b defaultViewModelCreationExtras2 = gVar2.getDefaultViewModelCreationExtras();
                m.d(defaultViewModelCreationExtras2, "<get-defaultViewModelCreationExtras>(...)");
                return c7.i.S(a0.a.b(e3.class), viewModelStore2, (String) null, defaultViewModelCreationExtras2, w50.c.M(gVar2), (u00.a) null);
            case 6:
                eg.g gVar3 = (n) this.B;
                e1 viewModelStore3 = ((f1) ((av.m) this.C).invoke()).getViewModelStore();
                t6.b defaultViewModelCreationExtras3 = gVar3.getDefaultViewModelCreationExtras();
                m.d(defaultViewModelCreationExtras3, "<get-defaultViewModelCreationExtras>(...)");
                return c7.i.S(a0.a.b(e3.class), viewModelStore3, (String) null, defaultViewModelCreationExtras3, w50.c.M(gVar3), (u00.a) null);
            case 7:
                eg.g gVar4 = (av.p) this.B;
                e1 viewModelStore4 = ((av.p) ((a30.l) this.C).B).getViewModelStore();
                t6.b defaultViewModelCreationExtras4 = gVar4.getDefaultViewModelCreationExtras();
                m.d(defaultViewModelCreationExtras4, "<get-defaultViewModelCreationExtras>(...)");
                return c7.i.S(a0.a.b(c0.class), viewModelStore4, (String) null, defaultViewModelCreationExtras4, w50.c.M(gVar4), (u00.a) null);
            case 8:
                eg.g gVar5 = (av.q) this.B;
                e1 viewModelStore5 = ((av.q) ((a30.l) this.C).B).getViewModelStore();
                t6.b defaultViewModelCreationExtras5 = gVar5.getDefaultViewModelCreationExtras();
                m.d(defaultViewModelCreationExtras5, "<get-defaultViewModelCreationExtras>(...)");
                return c7.i.S(a0.a.b(x.class), viewModelStore5, (String) null, defaultViewModelCreationExtras5, w50.c.M(gVar5), (u00.a) null);
            case 9:
                q qVar3 = (q) this.B;
                u uVar = (u) this.C;
                o10.b bVar2 = ((b) qVar3.B).b;
                n20.c packageFqName = uVar.o.F;
                bVar2.getClass();
                m.e(packageFqName, "packageFqName");
                return null;
            case 10:
                ((u00.k) this.B).invoke((r) this.C);
                return b0.a;
            case 11:
                ((u00.k) this.B).invoke(new c00.c((zz.a) this.C));
                return b0.a;
            case 12:
                c30.i iVar = (c30.i) this.B;
                return h00.q.n1(((i) iVar.L.a).e.d(iVar.U, (w) this.C));
            case 13:
                d10.l lVar = (d10.l) this.B;
                String str = (String) this.C;
                l1 l1Var = lVar.H;
                String signature = lVar.I;
                l1Var.getClass();
                m.e(signature, "signature");
                if (str.equals("<init>")) {
                    collectionA = h00.q.n1(l1Var.z());
                    arrayList = new ArrayList();
                    for (Object obj : collectionA) {
                        j jVar = (j) obj;
                        if (jVar.w()) {
                            j10.i iVarL = jVar.l();
                            m.d(iVarL, "getContainingDeclaration(...)");
                            if (q20.f.c(iVarL)) {
                                String strX2 = c2.c(jVar).X();
                                if (!r30.r.x0(strX2, "constructor-impl", false) || !r30.r.p0(strX2, ")V", false)) {
                                    throw new IllegalArgumentException(("Invalid signature of " + jVar + ": " + strX2).toString());
                                }
                                StringBuilder sb = new StringBuilder();
                                sb.append(r30.k.S0(strX2, "V"));
                                j10.i iVarL2 = jVar.l();
                                m.d(iVarL2, "getContainingDeclaration(...)");
                                n20.b bVarF = u20.d.f(iVarL2);
                                m.b(bVarF);
                                sb.append(m20.b.b(bVarF.b()));
                                strX = sb.toString();
                            } else {
                                strX = c2.c(jVar).X();
                            }
                        } else {
                            strX = c2.c(jVar).X();
                        }
                        if (m.a(strX, signature)) {
                            arrayList.add(obj);
                        }
                    }
                } else {
                    collectionA = l1Var.A(n20.e.e(str));
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : collectionA) {
                        if (m.a(c2.c((j10.u) obj2).X(), signature)) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList = arrayList2;
                }
                if (arrayList.size() == 1) {
                    return (j10.u) h00.q.d1(arrayList);
                }
                String strR0 = h00.q.R0(collectionA, "\n", null, null, d10.b.Q, 30);
                StringBuilder sbS = a1.b.s("Function '", str, "' (JVM signature: ", signature, ") not resolved in ");
                sbS.append(l1Var);
                sbS.append(':');
                sbS.append(strR0.length() == 0 ? " no members found" : "\n".concat(strR0));
                throw new a40.b0(sbS.toString());
            case 14:
                e30.w wVar = (e30.w) this.B;
                j1 j1Var = (j1) this.C;
                j10.h hVarG = wVar.m0().g();
                if (!(hVarG instanceof j10.e)) {
                    throw new a40.b0("Supertype not a class: " + hVarG);
                }
                Class clsI = i2.i((j10.e) hVarG);
                if (clsI == null) {
                    throw new a40.b0("Unsupported superclass of " + j1Var + ": " + hVarG);
                }
                Class cls = j1Var.B;
                if (m.a(cls.getSuperclass(), clsI)) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    m.b(genericSuperclass);
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                m.d(interfaces, "getInterfaces(...)");
                int iJ0 = h00.n.J0(clsI, interfaces);
                if (iJ0 >= 0) {
                    Type type = cls.getGenericInterfaces()[iJ0];
                    m.b(type);
                    return type;
                }
                throw new a40.b0("No superclass of " + j1Var + " in Java reflection for " + hVarG);
            case 15:
                Class cls2 = (Class) this.B;
                Map map = (Map) this.C;
                StringBuilder sb2 = new StringBuilder();
                sb2.append('@');
                sb2.append(cls2.getCanonicalName());
                h00.q.Q0(map.entrySet(), sb2, ", ", "(", ")", e10.e.A, 48);
                return sb2.toString();
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                f30.f fVar = (f30.f) this.B;
                h30.g type2 = (h30.g) ((e30.y) this.C).C.invoke();
                fVar.getClass();
                m.e(type2, "type");
                return (e30.w) type2;
            case 17:
                e50.m mVar = (e50.m) this.C;
                e50.q qVar4 = (e50.q) this.B;
                try {
                    if (!qVar4.a(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    while (qVar4.a(false, this)) {
                    }
                    mVar.a(1, 9, null);
                    y40.b.d(qVar4);
                    return b0.a;
                } catch (IOException e) {
                    mVar.a(2, 2, e);
                } catch (Throwable th) {
                    mVar.a(3, 3, null);
                    y40.b.d(qVar4);
                    throw th;
                }
                break;
            case 18:
                b60.b bVar3 = (b60.b) this.C;
                e60.a aVar = t50.a.c().c.d;
                a10.d dVarB = a0.a.b(x40.w.class);
                aVar.getClass();
                return aVar.f(dVarB, null, bVar3);
            case 19:
                f30.i iVar2 = (f30.i) this.B;
                f30.f fVar2 = (f30.f) this.C;
                Iterable iterable = (List) iVar2.E.getValue();
                if (iterable == null) {
                    iterable = h00.x.A;
                }
                ArrayList arrayList3 = new ArrayList(h00.r.q0(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((z0) it.next()).A0(fVar2));
                }
                return arrayList3;
            case 20:
                i10.g gVar6 = (i10.g) this.B;
                d30.l lVar2 = (d30.l) this.C;
                u00.k kVar2 = gVar6.b;
                m10.a0 a0Var = gVar6.a;
                m10.k kVar3 = new m10.k((j10.k) kVar2.invoke(a0Var), i10.g.g, j10.y.E, j10.f.B, va.a.R(a0Var.E.e()), lVar2);
                kVar3.e0(new i10.a(lVar2, kVar3), h00.z.A, null);
                return kVar3;
            case 21:
                i10.j jVar2 = (i10.j) this.B;
                d30.l lVar3 = (d30.l) this.C;
                m10.a0 a0VarL = jVar2.l();
                m.d(a0VarL, "getBuiltInsModule(...)");
                return new o(a0VarL, lVar3, new eo.p(jVar2, 4));
            case 22:
                o oVar = (o) this.B;
                d30.l lVar4 = (d30.l) this.C;
                m10.a0 a0Var2 = oVar.g().a;
                i10.g.d.getClass();
                return j10.w.f(a0Var2, i10.g.h, new q(lVar4, oVar.g().a)).n();
            case 23:
                b20.i iVar3 = (b20.i) this.B;
                j10.e eVar = (j10.e) this.C;
                q qVar5 = iVar3.J;
                b bVar4 = (b) qVar5.B;
                q qVar6 = new q(new b(bVar4.a, bVar4.b, bVar4.c, bVar4.d, bVar4.e, bVar4.f, bVar4.h, bVar4.i, bVar4.j, bVar4.k, bVar4.l, bVar4.m, bVar4.n, bVar4.o, bVar4.p, bVar4.q, bVar4.r, bVar4.s, bVar4.t, bVar4.u, bVar4.v, bVar4.w), (h) qVar5.C, (g00.h) qVar5.D);
                j10.k kVarL = iVar3.l();
                m.d(kVarL, "getContainingDeclaration(...)");
                return new b20.i(qVar6, kVarL, iVar3.H, eVar);
            case 24:
                yt.a aVar2 = (yt.a) ((p2) this.B).getValue();
                if (aVar2 != null) {
                    ((u00.k) this.C).invoke(new bv.f(aVar2));
                }
                return b0.a;
            case 25:
                ((u00.k) this.B).invoke(new jx.c(((fx.b) this.C).a));
                return b0.a;
            case 26:
                h0.B.getClass();
                h0 h0Var = h0.C;
                m0 m0VarF = ((m10.h) this.C).f();
                List list = Collections.EMPTY_LIST;
                eo.p pVar = new eo.p(this, 10);
                d30.b NO_LOCKS = d30.l.e;
                m.d(NO_LOCKS, "NO_LOCKS");
                return e30.c.v(h0Var, m0VarF, list, new x20.j(NO_LOCKS, pVar), false);
            case 27:
                n30.f fVar3 = new n30.f();
                Iterator it2 = ((t) this.C).m().iterator();
                while (it2.hasNext()) {
                    fVar3.add(((j10.u) it2.next()).e((e30.u0) this.B));
                }
                return fVar3;
            case 28:
                o0 o0Var = (o0) this.B;
                m10.i iVar4 = (m10.i) this.C;
                d30.o oVar2 = o0Var.e0;
                q0 q0Var = o0Var.f0;
                k10.h annotations = iVar4.getAnnotations();
                m10.i iVar5 = iVar4;
                int kind = iVar5.getKind();
                g4.c.r(kind, "getKind(...)");
                k10.a aVar3 = o0Var.f0;
                n0 n0VarO = ((m10.n) aVar3).o();
                m.d(n0VarO, "getSource(...)");
                o0 o0Var2 = new o0(oVar2, q0Var, iVar4, o0Var, annotations, kind, n0VarO);
                o0.h0.getClass();
                c30.u uVar2 = (c30.u) aVar3;
                e30.u0 u0VarD = uVar2.Y0() == null ? null : e30.u0.d(uVar2.Z0());
                if (u0VarD == null) {
                    return null;
                }
                m10.u uVar3 = iVar5.K;
                m10.u uVarE = uVar3 != null ? uVar3.e(u0VarD) : null;
                List listB0 = iVar5.b0();
                m.d(listB0, "getContextReceiverParameters(...)");
                ArrayList arrayList4 = new ArrayList(h00.r.q0(listB0, 10));
                Iterator it3 = listB0.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((m10.u) it3.next()).e(u0VarD));
                }
                m10.f fVar4 = (m10.f) aVar3;
                List listP = fVar4.p();
                List listO = o0Var.O();
                e30.w wVar2 = o0Var.H;
                m.b(wVar2);
                o0Var2.d1(null, uVarE, arrayList4, listP, listO, wVar2, j10.y.B, fVar4.G);
                return o0Var2;
            default:
                eg.g gVar7 = (oo.c0) this.B;
                e1 viewModelStore6 = ((oo.b0) this.C).B.getViewModelStore();
                t6.b defaultViewModelCreationExtras6 = gVar7.getDefaultViewModelCreationExtras();
                m.d(defaultViewModelCreationExtras6, "<get-defaultViewModelCreationExtras>(...)");
                return c7.i.S(a0.a.b(g1.class), viewModelStore6, (String) null, defaultViewModelCreationExtras6, w50.c.M(gVar7), (u00.a) null);
        }
    }
}
