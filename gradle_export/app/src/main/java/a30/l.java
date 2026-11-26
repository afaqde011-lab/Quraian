package a30;

import a1.u0;
import a10.h0;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import d10.j1;
import d10.k1;
import d10.l1;
import d10.n0;
import d10.o0;
import d10.o1;
import d10.s1;
import d10.t1;
import d10.x1;
import e30.f0;
import i20.j0;
import j10.r0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import k9.x0;
import m10.l0;

public final class l implements u00.a {
    public final int A;
    public final Object B;

    public l(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override
    public final Object invoke() {
        ?? R;
        Class cls;
        j1 j1VarI0;
        int iHashCode;
        switch (this.A) {
            case 0:
                Set setKeySet = ((LinkedHashMap) ((b30.c) this.B).J.E).keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : setKeySet) {
                    n20.b bVar = (n20.b) obj;
                    if (!bVar.g() && !g.c.contains(bVar)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((n20.b) it.next()).f());
                }
                return arrayList2;
            case 1:
                return (av.p) this.B;
            case 2:
                return (av.q) this.B;
            case 3:
                return (av.t) this.B;
            case 4:
                b20.d dVar = (b20.d) this.B;
                b20.p pVar = dVar.c;
                Collection collectionValues = ((Map) ze.d.A(pVar.J, b20.p.N[0])).values();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    c30.r rVarA = ((a20.b) dVar.b.B).d.a(pVar, (o10.c) it2.next());
                    if (rVarA != null) {
                        arrayList3.add(rVarA);
                    }
                }
                return (x20.n[]) w50.c.V(arrayList3).toArray(new x20.n[0]);
            case 5:
                oj.q qVar = (oj.q) this.B;
                HashSet hashSet = new HashSet();
                c30.i iVar = (c30.i) qVar.E;
                b20.h hVar = iVar.N;
                k kVar = iVar.L;
                i20.k kVar2 = iVar.E;
                Iterator it3 = hVar.l().iterator();
                while (it3.hasNext()) {
                    for (j10.k kVar3 : k00.f.C(((e30.w) it3.next()).N(), null, 3)) {
                        if ((kVar3 instanceof l0) || (kVar3 instanceof j10.l0)) {
                            hashSet.add(((j10.c) kVar3).getName());
                        }
                    }
                }
                List list = kVar2.Q;
                kotlin.jvm.internal.m.d(list, "getFunctionList(...)");
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    hashSet.add(z3.A((k20.g) kVar.b, ((i20.b0) it4.next()).F));
                }
                List list2 = kVar2.R;
                kotlin.jvm.internal.m.d(list2, "getPropertyList(...)");
                Iterator it5 = list2.iterator();
                while (it5.hasNext()) {
                    hashSet.add(z3.A((k20.g) kVar.b, ((j0) it5.next()).F));
                }
                return h00.j0.q0(hashSet, hashSet);
            case 6:
                c30.q qVar2 = (c30.q) this.B;
                Set setN = qVar2.n();
                if (setN == null) {
                    return null;
                }
                return h00.j0.q0(h00.j0.q0(qVar2.m(), qVar2.c.c.keySet()), setN);
            case 7:
                c30.v vVar = (c30.v) this.B;
                k kVar4 = vVar.L;
                return h00.q.n1(((i) kVar4.a).e.l(vVar.M, (k20.g) kVar4.b));
            case 8:
                return x5.i(kotlin.jvm.internal.a0.a, rr.a.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
            case 9:
                return x5.i(kotlin.jvm.internal.a0.a, zs.a.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
            case 10:
                return x5.i(kotlin.jvm.internal.a0.a, fw.b.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
            case 11:
                return x5.i(kotlin.jvm.internal.a0.a, gx.d.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
            case 12:
                return x5.i(kotlin.jvm.internal.a0.a, ey.a.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
            case 13:
                return x5.i(kotlin.jvm.internal.a0.a, sy.b.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
            case 14:
                return (Class) this.B;
            case 15:
                Object obj2 = ((kotlin.jvm.internal.z) this.B).A;
                if (obj2 != null) {
                    return (p30.r) obj2;
                }
                kotlin.jvm.internal.m.k("result");
                throw null;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                x1 x1Var = ((p30.a) this.B).A;
                Type type = x1Var != null ? (Type) x1Var.invoke() : null;
                kotlin.jvm.internal.m.b(type);
                return p10.d.c(type);
            case 17:
                return new d10.m((d10.n) this.B);
            case 18:
                return new d10.o((d10.p) this.B);
            case 19:
                return new d10.q((d10.r) this.B);
            case 20:
                return new d10.s((d10.t) this.B);
            case 21:
                return new n0((o0) this.B);
            case 22:
                return t1.a(((l1) this.B).v());
            case 23:
                o1 o1Var = (o1) this.B;
                x1 x1Var2 = o1Var.c;
                a10.w wVar = o1.f[0];
                o10.c cVar = (o10.c) x1Var2.invoke();
                if (cVar == null) {
                    return x20.m.b;
                }
                x1 x1Var3 = o1Var.a;
                a10.w wVar2 = k1.b[0];
                Object objInvoke = x1Var3.invoke();
                kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
                x0 x0Var = ((o10.f) objInvoke).b;
                g20.e eVar = (g20.e) x0Var.B;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) x0Var.D;
                Class cls2 = cVar.a;
                n20.b bVarA = p10.d.a(cls2);
                Object obj3 = concurrentHashMap.get(bVarA);
                if (obj3 == null) {
                    n20.c cVar2 = p10.d.a(cls2).a;
                    d50.g gVar = cVar.b;
                    h20.a aVar = (h20.a) gVar.c;
                    h20.a aVar2 = h20.a.MULTIFILE_CLASS;
                    if (aVar == aVar2) {
                        String[] strArr = (String[]) gVar.e;
                        if (aVar != aVar2) {
                            strArr = null;
                        }
                        List listK0 = strArr != null ? h00.n.k0(strArr) : null;
                        if (listK0 == null) {
                            listK0 = h00.x.A;
                        }
                        R = new ArrayList();
                        Iterator it6 = listK0.iterator();
                        while (it6.hasNext()) {
                            n20.c cVar3 = new n20.c(v20.b.c((String) it6.next()).a.replace('/', '.'));
                            n20.b bVar2 = new n20.b(cVar3.b(), cVar3.a.g());
                            hf.c cVar4 = (hf.c) x0Var.C;
                            eVar.c().c.getClass();
                            o10.c cVarW = h0.w(cVar4, bVar2, k20.f.g);
                            if (cVarW != null) {
                                R.add(cVarW);
                            }
                        }
                    } else {
                        R = va.a.R(cVar);
                    }
                    i10.m mVar = new i10.m(eVar.c().b, cVar2, 1);
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it7 = R.iterator();
                    while (it7.hasNext()) {
                        c30.r rVarA2 = eVar.a(mVar, (o10.c) it7.next());
                        if (rVarA2 != null) {
                            arrayList4.add(rVarA2);
                        }
                    }
                    x20.n nVarR = f50.c.r("package " + cVar2 + " (" + cVar + ')', h00.q.n1(arrayList4));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(bVarA, nVarR);
                    obj3 = objPutIfAbsent == null ? nVarR : objPutIfAbsent;
                }
                kotlin.jvm.internal.m.d(obj3, "getOrPut(...)");
                return (x20.n) obj3;
            case 24:
                j10.k kVarL = ((r0) this.B).l();
                kotlin.jvm.internal.m.d(kVarL, "getContainingDeclaration(...)");
                if (kVarL instanceof j10.e) {
                    return rd.a.i0((j10.e) kVarL);
                }
                if (!(kVarL instanceof j10.c)) {
                    throw new a40.b0("Unknown type parameter container: " + kVarL);
                }
                j10.k kVarL2 = ((j10.c) kVarL).l();
                kotlin.jvm.internal.m.d(kVarL2, "getContainingDeclaration(...)");
                if (kVarL2 instanceof j10.e) {
                    j1VarI0 = rd.a.i0((j10.e) kVarL2);
                } else {
                    c30.l lVar = kVarL instanceof c30.l ? (c30.l) kVarL : null;
                    if (lVar == null) {
                        throw new a40.b0("Non-class callable descriptor must be deserialized: " + kVarL);
                    }
                    c30.k kVarR = lVar.R();
                    g20.g gVar2 = kVarR instanceof g20.g ? (g20.g) kVarR : null;
                    o10.c cVar5 = gVar2 != null ? gVar2.C : null;
                    o10.c cVar6 = cVar5 instanceof o10.c ? cVar5 : null;
                    if (cVar6 == null || (cls = cVar6.a) == null) {
                        throw new a40.b0("Container of deserialized member is not resolved: " + lVar);
                    }
                    j1VarI0 = (j1) k00.f.I(cls);
                }
                Object objG = kVarL.G(new qj.c(j1VarI0), g00.b0.a);
                kotlin.jvm.internal.m.b(objG);
                return (s1) objG;
            case 25:
                return new db.c[((d40.i[]) this.B).length];
            case 26:
                int iHashCode2 = 0;
                for (Map.Entry entry : ((Map) this.B).entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof boolean[]) {
                        iHashCode = Arrays.hashCode((boolean[]) value);
                    } else if (value instanceof char[]) {
                        iHashCode = Arrays.hashCode((char[]) value);
                    } else if (value instanceof byte[]) {
                        iHashCode = Arrays.hashCode((byte[]) value);
                    } else if (value instanceof short[]) {
                        iHashCode = Arrays.hashCode((short[]) value);
                    } else if (value instanceof int[]) {
                        iHashCode = Arrays.hashCode((int[]) value);
                    } else if (value instanceof float[]) {
                        iHashCode = Arrays.hashCode((float[]) value);
                    } else if (value instanceof long[]) {
                        iHashCode = Arrays.hashCode((long[]) value);
                    } else if (value instanceof double[]) {
                        iHashCode = Arrays.hashCode((double[]) value);
                    } else {
                        iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                    }
                    iHashCode2 += iHashCode ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode2);
            case 27:
                return new e30.e(((e30.f) this.B).a());
            case 28:
                return e30.c.x((r0) ((f0) this.B).b);
            default:
                return g30.l.c(g30.k.Y, ((u0) this.B).toString());
        }
    }
}
