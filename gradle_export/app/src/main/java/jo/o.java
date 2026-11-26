package jo;

import g00.b0;
import h00.q;
import h00.r;
import h00.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ri.t1;
import vn.u;

public final class o {
    public final vn.f a;
    public final u b;
    public final io.a c;
    public final av.k d;

    public o(vn.f fVar, u uVar, io.a aVar, av.k kVar) {
        this.a = fVar;
        this.b = uVar;
        this.c = aVar;
        this.d = kVar;
    }

    public final Object a(boolean z, m00.c cVar) {
        n nVar;
        Object objG;
        String str;
        b0 b0Var;
        List list;
        ArrayList arrayList;
        Iterator it;
        Set setR1;
        String str2;
        Object obj;
        List list2;
        ArrayList arrayList2;
        Iterator it2;
        Object objH;
        String str3;
        String str4;
        Object obj2;
        String str5;
        Object obj3;
        ?? r6;
        Object obj4;
        Object obj5;
        Object objH2;
        o oVar = this;
        boolean z2 = z;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i = nVar.H;
            if ((i & Integer.MIN_VALUE) != 0) {
                nVar.H = i - Integer.MIN_VALUE;
            } else {
                nVar = new n(oVar, cVar);
            }
        } else {
            nVar = new n(oVar, cVar);
        }
        Object objS = nVar.F;
        l00.a aVar = l00.a.A;
        int i2 = nVar.H;
        b0 b0Var2 = b0.a;
        io.a aVar2 = oVar.c;
        u uVar = oVar.b;
        vn.f fVar = oVar.a;
        switch (i2) {
            case 0:
                t1.O(objS);
                String strA = uVar.a();
                nVar.B = strA;
                nVar.A = z2;
                nVar.H = 1;
                objG = fVar.g(strA, nVar, z2);
                if (objG != aVar) {
                    str = strA;
                    if (!(objG instanceof g00.m)) {
                        b0Var = b0Var2;
                        str4 = (String) uVar.c.getValue();
                        if (str4 != null) {
                        }
                        return objG;
                    }
                    d40.i iVarE = fVar.e(str, null);
                    nVar.B = str;
                    nVar.C = objG;
                    nVar.A = z2;
                    nVar.H = 2;
                    objS = d40.o.s(iVarE, nVar);
                    if (objS != aVar) {
                        list = (List) objS;
                        arrayList = new ArrayList();
                        it = list.iterator();
                        while (it.hasNext()) {
                            List list3 = ((ho.a) it.next()).g;
                            arrayList2 = new ArrayList(r.q0(list3, 10));
                            it2 = list3.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(new Integer(((ho.g) it2.next()).a));
                                b0Var2 = b0Var2;
                            }
                            v.u0(arrayList2, arrayList);
                        }
                        b0Var = b0Var2;
                        setR1 = q.r1(arrayList);
                        nVar.B = str;
                        nVar.C = objG;
                        nVar.D = list;
                        nVar.A = z2;
                        nVar.H = 3;
                        if (((vn.o) aVar2).g(setR1, nVar) != aVar) {
                            str2 = str;
                            obj = objG;
                            list2 = list;
                            nVar.B = str2;
                            nVar.C = obj;
                            nVar.D = null;
                            nVar.A = z2;
                            nVar.H = 4;
                            if (((Boolean) oVar.d.invoke()).booleanValue() || (objH = ((vn.o) aVar2).h(list2, nVar)) != l00.a.A) {
                                objH = b0Var;
                            }
                            if (objH != aVar) {
                                objG = obj;
                                str3 = str2;
                                str = str3;
                                str4 = (String) uVar.c.getValue();
                                if (str4 != null || str4.equals(str)) {
                                    return objG;
                                }
                                nVar.B = null;
                                nVar.C = objG;
                                nVar.D = str4;
                                nVar.A = z2;
                                nVar.H = 5;
                                Object objG2 = fVar.g(str4, nVar, z2);
                                if (objG2 != aVar) {
                                    obj2 = objG;
                                    str5 = str4;
                                    obj3 = objG2;
                                    if (!(obj3 instanceof g00.m)) {
                                        return obj2;
                                    }
                                    d40.i iVarE2 = fVar.e(str5, null);
                                    r6 = 0;
                                    nVar.B = null;
                                    nVar.C = obj2;
                                    nVar.D = null;
                                    nVar.E = oVar;
                                    nVar.A = z2;
                                    nVar.H = 6;
                                    objS = d40.o.s(iVarE2, nVar);
                                    if (objS != aVar) {
                                        obj4 = obj2;
                                        List list4 = (List) objS;
                                        nVar.B = r6;
                                        nVar.C = obj4;
                                        nVar.D = r6;
                                        nVar.E = r6;
                                        nVar.A = z2;
                                        nVar.H = 7;
                                        if (((Boolean) oVar.d.invoke()).booleanValue() || (objH2 = ((vn.o) oVar.c).h(list4, nVar)) != l00.a.A) {
                                            obj5 = b0Var;
                                        } else {
                                            obj5 = objH2;
                                        }
                                        if (obj5 == aVar) {
                                            return obj4;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 1:
                z2 = nVar.A;
                String str6 = nVar.B;
                t1.O(objS);
                str = str6;
                objG = ((g00.n) objS).A;
                if (!(objG instanceof g00.m)) {
                    b0Var = b0Var2;
                    str4 = (String) uVar.c.getValue();
                    if (str4 != null) {
                        break;
                    }
                    return objG;
                }
                d40.i iVarE3 = fVar.e(str, null);
                nVar.B = str;
                nVar.C = objG;
                nVar.A = z2;
                nVar.H = 2;
                objS = d40.o.s(iVarE3, nVar);
                if (objS != aVar) {
                    list = (List) objS;
                    arrayList = new ArrayList();
                    it = list.iterator();
                    while (it.hasNext()) {
                        List list5 = ((ho.a) it.next()).g;
                        arrayList2 = new ArrayList(r.q0(list5, 10));
                        it2 = list5.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new Integer(((ho.g) it2.next()).a));
                            b0Var2 = b0Var2;
                        }
                        v.u0(arrayList2, arrayList);
                    }
                    b0Var = b0Var2;
                    setR1 = q.r1(arrayList);
                    nVar.B = str;
                    nVar.C = objG;
                    nVar.D = list;
                    nVar.A = z2;
                    nVar.H = 3;
                    if (((vn.o) aVar2).g(setR1, nVar) != aVar) {
                        str2 = str;
                        obj = objG;
                        list2 = list;
                        nVar.B = str2;
                        nVar.C = obj;
                        nVar.D = null;
                        nVar.A = z2;
                        nVar.H = 4;
                        if (((Boolean) oVar.d.invoke()).booleanValue()) {
                            objH = b0Var;
                        } else {
                            objH = b0Var;
                        }
                        if (objH != aVar) {
                            objG = obj;
                            str3 = str2;
                            str = str3;
                            str4 = (String) uVar.c.getValue();
                            if (str4 != null) {
                                break;
                            }
                            return objG;
                        }
                    }
                }
                return aVar;
            case 2:
                z2 = nVar.A;
                objG = nVar.C;
                str = nVar.B;
                t1.O(objS);
                list = (List) objS;
                arrayList = new ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                    List list6 = ((ho.a) it.next()).g;
                    arrayList2 = new ArrayList(r.q0(list6, 10));
                    it2 = list6.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new Integer(((ho.g) it2.next()).a));
                        b0Var2 = b0Var2;
                    }
                    v.u0(arrayList2, arrayList);
                }
                b0Var = b0Var2;
                setR1 = q.r1(arrayList);
                nVar.B = str;
                nVar.C = objG;
                nVar.D = list;
                nVar.A = z2;
                nVar.H = 3;
                if (((vn.o) aVar2).g(setR1, nVar) != aVar) {
                    str2 = str;
                    obj = objG;
                    list2 = list;
                    nVar.B = str2;
                    nVar.C = obj;
                    nVar.D = null;
                    nVar.A = z2;
                    nVar.H = 4;
                    if (((Boolean) oVar.d.invoke()).booleanValue()) {
                        objH = b0Var;
                    } else {
                        objH = b0Var;
                    }
                    if (objH != aVar) {
                        objG = obj;
                        str3 = str2;
                        str = str3;
                        str4 = (String) uVar.c.getValue();
                        if (str4 != null) {
                            break;
                        }
                        return objG;
                    }
                }
                return aVar;
            case 3:
                z2 = nVar.A;
                list2 = (List) nVar.D;
                obj = nVar.C;
                str2 = nVar.B;
                t1.O(objS);
                b0Var = b0Var2;
                nVar.B = str2;
                nVar.C = obj;
                nVar.D = null;
                nVar.A = z2;
                nVar.H = 4;
                if (((Boolean) oVar.d.invoke()).booleanValue()) {
                    objH = b0Var;
                } else {
                    objH = b0Var;
                }
                if (objH != aVar) {
                    objG = obj;
                    str3 = str2;
                    str = str3;
                    str4 = (String) uVar.c.getValue();
                    if (str4 != null) {
                        break;
                    }
                    return objG;
                }
                return aVar;
            case 4:
                z2 = nVar.A;
                objG = nVar.C;
                str3 = nVar.B;
                t1.O(objS);
                b0Var = b0Var2;
                str = str3;
                str4 = (String) uVar.c.getValue();
                if (str4 != null) {
                    break;
                }
                return objG;
            case 5:
                z2 = nVar.A;
                str5 = (String) nVar.D;
                obj2 = nVar.C;
                t1.O(objS);
                obj3 = ((g00.n) objS).A;
                b0Var = b0Var2;
                if (!(obj3 instanceof g00.m)) {
                    return obj2;
                }
                d40.i iVarE4 = fVar.e(str5, null);
                r6 = 0;
                nVar.B = null;
                nVar.C = obj2;
                nVar.D = null;
                nVar.E = oVar;
                nVar.A = z2;
                nVar.H = 6;
                objS = d40.o.s(iVarE4, nVar);
                if (objS != aVar) {
                    obj4 = obj2;
                    List list7 = (List) objS;
                    nVar.B = r6;
                    nVar.C = obj4;
                    nVar.D = r6;
                    nVar.E = r6;
                    nVar.A = z2;
                    nVar.H = 7;
                    if (((Boolean) oVar.d.invoke()).booleanValue()) {
                        obj5 = b0Var;
                    } else {
                        obj5 = b0Var;
                    }
                    if (obj5 == aVar) {
                        return obj4;
                    }
                }
                return aVar;
            case 6:
                boolean z3 = nVar.A;
                o oVar2 = nVar.E;
                obj4 = nVar.C;
                t1.O(objS);
                z2 = z3;
                oVar = oVar2;
                b0Var = b0Var2;
                r6 = 0;
                List list8 = (List) objS;
                nVar.B = r6;
                nVar.C = obj4;
                nVar.D = r6;
                nVar.E = r6;
                nVar.A = z2;
                nVar.H = 7;
                if (((Boolean) oVar.d.invoke()).booleanValue()) {
                    obj5 = b0Var;
                } else {
                    obj5 = b0Var;
                }
                if (obj5 == aVar) {
                    return aVar;
                }
                return obj4;
            case 7:
                Object obj6 = nVar.C;
                t1.O(objS);
                return obj6;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
